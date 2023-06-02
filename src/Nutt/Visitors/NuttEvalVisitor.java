package Nutt.Visitors;

import Nutt.Exceptions.NuttRecordOperatorNotImplementedException;
import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.NuttEnvironment;
import Nutt.NuttInterpreter;
import Nutt.Pair;
import Nutt.ParseHelpers.Partition;
import Nutt.ParseHelpers.Row;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Actionable.Procedure.ProcedureBuilder;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.IListable;
import Nutt.Types.Functional.Listable.String.String;
import Nutt.Types.Functional.Numerable.Boolean;
import Nutt.Types.Functional.Numerable.Float.Float;
import Nutt.Types.Functional.Numerable.INumerable;
import Nutt.Types.Functional.Numerable.Int.Int;
import Nutt.Types.Functional.Record.Record;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;
import Nutt.Types.Nil;
import com.sun.jdi.InvalidTypeException;
import gen.Nutt;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class NuttEvalVisitor extends NuttGenericVisitor<IValuable>
{
	@Override
	public IValuable visitIf_then_else_block(Nutt.If_then_else_blockContext ctx)
	{
		///return new NuttStatementVisitor(interpreter);
		return new Nil();
	}

	@Override
	public IValuable visitFunction_yield(Nutt.Function_yieldContext ctx)
	{
		return visit(ctx.exp());
	}

	@Override
	public IValuable visitExplicit_array(Nutt.Explicit_arrayContext ctx)
	{
		return new NuttArrayVisitor().visitExplicit_array(ctx);
	}

	@Override
	public IValuable visitExplicit_variable(Nutt.Explicit_variableContext ctx)
	{
		var name=ctx.NAME().getSymbol().getText();
		var asType=TypeInferencer.findType(name);
		if(asType!=null) return asType;
		return NuttInterpreter.getValuable(name);
	}

	@Override public IValuable visitRange_array_initializer_exp(Nutt.Range_array_initializer_expContext ctx)
	{
		Nutt.Range_array_initializerContext arrayInitializer=ctx.range_array_initializer();
		var start=visit(arrayInitializer.start);
		var next=visit(arrayInitializer.next);
		var range=INumerable.sub((INumerable)next,(INumerable)start);
		var bound=visit(arrayInitializer.bound);
		var iterator=(INumerable)start;
		var valuables=new ArrayList<IValuable>();
		var isReverse=arrayInitializer.OP_Reverse()!=null;
		while(iterator.lessEqalTo(bound))
		{
			valuables.add(isReverse?0:valuables.size(),iterator);
			iterator=INumerable.add(iterator,range);
		}
		return new Array(valuables);
	}

	@Override
	public IValuable visitArray_access(Nutt.Array_accessContext ctx)
	{
		var evaluator=new NuttEvalVisitor();
		var array=evaluator.visit(ctx.arr);
		if(TypeInferencer.findType("Listable").findChild(array.getType())==null)
		{
			throw new RuntimeException(
					new InvalidTypeException("Cannot access element of "+array.getType()+" by index!"));
		}
		var index=evaluator.visit(ctx.index);
		if(!TypeInferencer.findType("Int").equals(index.getType()))
		{
			throw new RuntimeException(
					new InvalidTypeException("Cannot access element of %s with index of %s type!".formatted(array.getType(),
					                                                                                        index.getType())));
		}
		return array.asFunctional().asListable().getAt(index.asFunctional().asNumerable().asInt());
	}

	@Override
	public IValuable visitFunc_call_exp(Nutt.Func_call_expContext ctx)
	{
		try
		{
			return new NuttFunctionVisitor().visitFunc_call_exp(ctx);
		}
		catch(NuttSuccessReturnException e)
		{
			return e.getValue();
		}
	}

	@Override
	public IValuable visitQuarternary_exp(Nutt.Quarternary_expContext ctx)
	{
		return visit(new NuttConditionVisitor().visit(ctx.cond).asFunctional().asBoolean().isTrue()
		             ?ctx.if_true:ctx.if_false);
	}

	@Override
	public IValuable visitInfix_exp(Nutt.Infix_expContext ctx)
	{
		var defaultOperator=ctx.operator_infix().default_infix_operator();
		var left=visit(ctx.left);
		var right=visit(ctx.right);
		if(defaultOperator!=null)
		{
			if(defaultOperator.operator_logical()!=null) return new NuttConditionVisitor().visit(ctx);
			if(defaultOperator.operator_comparison()!=null) return new NuttCompareVisitor().visitInfix_exp(ctx);
			var op=NuttEnvironment.toSourceCode(defaultOperator);
			return switch(left)
			{
				case INumerable leftAsNumerable ->
				{
					var rightAsNumerable=right.asFunctional().asNumerable();
					yield switch(op)
					{
						case "+" -> INumerable.add(leftAsNumerable,rightAsNumerable);
						case "-" -> INumerable.sub(leftAsNumerable,rightAsNumerable);
						case "*" -> INumerable.mult(leftAsNumerable,rightAsNumerable);
						case "/" -> INumerable.div(leftAsNumerable,rightAsNumerable);
						case "//" -> INumerable.intDiv(leftAsNumerable,rightAsNumerable);
						case "%" -> INumerable.mod(leftAsNumerable,rightAsNumerable);
						case "^" -> INumerable.pow(leftAsNumerable,rightAsNumerable);
						default -> new Nil();
					};
				}
				case String str -> Objects.equals("+",op)?str.add(right):new Nil();
				case IListable leftAsListable ->
				{
					var rightAsListable=right.asFunctional().asListable();
					var resArr=new Array(leftAsListable.getElementType());
					var i=0;
					for(var leftEl: leftAsListable)
					{
						var rightEl=rightAsListable.getAt(new Int(i));
						resArr.add(visit(NuttEnvironment.getTempParser(leftEl+op+rightEl).exp()));
					}
					yield resArr;
				}
				case Record leftAsRecord ->
				{
					var rightAsRecord=right.asFunctional().asFunctional().asRecord();
					try
					{
						new NuttFunctionVisitor().invokeProcedure(leftAsRecord.getOperators().get(op),List.of(leftAsRecord,rightAsRecord));
					}
					catch(NuttSuccessReturnException e)
					{
						yield e.getValue();
					}
					throw new NuttRecordOperatorNotImplementedException(left.getType(),op);
				}
				case null -> throw new RuntimeException("Left operand is corrupted!");
				default -> throw new NuttRecordOperatorNotImplementedException(left.getType(),op);
			};
		}
		else
		{
			var op=ctx.operator_infix().Op_Custom().getText();
			return switch(left)
			{
				case Record leftAsRecord ->
				{
					var rightAsRecord=right.asFunctional().asFunctional().asRecord();
					try
					{
						new NuttFunctionVisitor().invokeProcedure(leftAsRecord.getOperators().get(op),List.of(leftAsRecord,rightAsRecord));
					}
					catch(NuttSuccessReturnException e)
					{
						yield e.getValue();
					}
					throw new NuttRecordOperatorNotImplementedException(left.getType(),op);
				}
				case null -> throw new RuntimeException("Left operand is corrupted!");
				default -> throw new NuttRecordOperatorNotImplementedException(left.getType(),op);
			};
		}
	}

	@Override public IValuable visitRecord_initializer_exp(Nutt.Record_initializer_expContext ctx)
	{
		var rowList=ctx.record_initializer().record_element_list();
		List<Row> members=new ArrayList<>();
		for(var row: rowList.record_element())
		{
			var val=visit(row.val);
			members.add(new Row(row.key.getText(),new Partition(val.getType(),val)));
		}
		return new Record(members);
	}

	@Override public IValuable visitRecord_member_access(Nutt.Record_member_accessContext ctx)
	{
		var left=visit(ctx.record);
		if(!TypeInferencer.verdict("Record",left.getType().getDisplayName())) throw new RuntimeException();
		return left.asFunctional()
		           .asRecord()
		           .getMember(new NuttStringVisitor().visit(ctx.index).toString());
	}

	@Override public IValuable visitAtom(Nutt.AtomContext ctx)
	{
		return ctx.string()!=null?new NuttStringVisitor().visitString(ctx.string()):super.visitAtom(ctx);
	}

	@Override
	public IValuable visitPrefix_exp(Nutt.Prefix_expContext ctx)
	{
		var op=ctx.operator_prefix();
		var value=visit(ctx.exp());
		var valueIsNumerable=TypeInferencer.findType("Numerable").findChild(value.getType())!=null;
		if(op.OP_Sub()!=null)
		{
			if(!valueIsNumerable) throw new ArithmeticException("Cannot negate a "+value.getType());
			return INumerable.negate(value.asFunctional().asNumerable());
		}
		if(op.OP_Add()!=null)
		{
			if(!valueIsNumerable) throw new ArithmeticException("Cannot abs a "+value.getType());
			return INumerable.abs(value.asFunctional().asNumerable());
		}
		if(op.OP_Length()!=null)
			return new Int(value.getLength());
		if(op.OP_Not()!=null)
			return new Boolean(!new NuttConditionVisitor().visit(ctx.exp()).asFunctional().asBoolean().isTrue());
		throw new UnsupportedOperationException();
	}

	@Override
	public IValuable visitInstance_of_exp(Nutt.Instance_of_expContext ctx)
	{
		Type ceilType;
		if(ctx.type_exp!=null) ceilType=visit(ctx.type_exp).getType();
		else
		{
			if(ctx.NAME()!=null)
				ceilType=TypeInferencer.findType(ctx.NAME().getText());
			else
				ceilType=TypeInferencer.findType(new NuttTypeInferenceVisitor().visit(ctx.type_exp)
				                                                               .getType()
				                                                               .getDisplayName());
		}
		return new Boolean(TypeInferencer.verdict(ceilType,visit(ctx.to_check).getType()));
	}

	@Override
	public IValuable visitExplicit_atom(Nutt.Explicit_atomContext ctx)
	{
		var atom=ctx.atom();
		if(atom.number()!=null) return visitNumber(atom.number());
		if(atom.string()!=null) return visitString(atom.string());
		if(atom.boolean_()!=null) return new Boolean(atom.boolean_().KW_True()!=null);
		if(atom.nil()!=null) return new Nil();
		throw new RuntimeException();
	}

	@Override
	public IValuable visitParenthesis_exp(Nutt.Parenthesis_expContext ctx)
	{
		return visit(ctx.exp());
	}

	@Override
	public IValuable visitFunction_definition_exp(Nutt.Function_definition_expContext ctx)
	{
		return visitLocal_funct(ctx.local_funct());
	}

	@Override public IValuable visitLocal_funct(Nutt.Local_functContext ctx)
	{
		var lambda=ctx.lambda_decl();
		return lambda!=null?evalLambda(lambda):evalAnonymousFunct(ctx.funcbody());
	}

	private IValuable evalAnonymousFunct(Nutt.FuncbodyContext funcbody)
	{
		var parameters=funcbody.var_signature_list().var_signature();
		var functionBody=funcbody.block();
		Pair<Type,IValuable> outputPair;
		IValuable declaredOutputValue;
		Type declaredOutputType;
		var isTypePresented=funcbody.func_output().by_type_var_decl()!=null;
		var isValuePresented=funcbody.func_output().default_output!=null;
		if(isTypePresented)
		{
			declaredOutputType=new NuttTypeInferenceVisitor().visitType_param(
					funcbody.func_output().by_type_var_decl().type_param());
			outputPair=new Pair<>(declaredOutputType,NuttEnvironment.constructValuable(declaredOutputType));
		}
		else if(isValuePresented)
		{
			declaredOutputValue=visit(funcbody.func_output().default_output);
			outputPair=new Pair<>(declaredOutputValue.getType(),declaredOutputValue);
		}
		else outputPair=new Pair<>(TypeInferencer.findType("Valuable"),new Nil());
		return new ProcedureBuilder().setSignature(new Signature(parameters,outputPair.left()))
		                             .setFunctionBody(functionBody)
		                             .setOutput(outputPair.right())
		                             .createProcedure();
	}

	private IValuable evalLambda(Nutt.Lambda_declContext lambda)
	{
		var sources=NuttEnvironment.toSourceList(List.of(lambda.var_signature_list(),lambda.func_output(),lambda.exp()));
		var transformed="funct %s%s=yield %s return".formatted(sources.get(0),sources.get(1),sources.get(2));
		return visitLocal_funct(NuttEnvironment.getTempParser(transformed).local_funct());
	}

	/*
	@Override public IValuable visitMap_exp(Nutt.Map_expContext ctx)
	{
		var left=visit(ctx.left);
		var right=visit(ctx.right);
		if(!TypeInferencer.verdict("Listable",left.getType()))
			throw new RuntimeException(left.getType()+" cannot be mapped!");
		if(!TypeInferencer.verdict("Procedure",right.getType()))
			throw new RuntimeException(right.getType()+" cannot be mapper!");
		//var array=left.asFunctional().asListable().asElementsArray().stream().toList();
		//		var mapper=right.asFunctional().asActionable().asProcedure();
		//		List<IValuable> valuables=new ArrayList<>();
		//		for(var element: array)
		//		{
		//			var parameters=List.of(element);
		//			//valuables.add()
		//		}
		return super.visitMap_exp(ctx);
	}
	*/

	@Override public IValuable visitMatch_to_exp(Nutt.Match_to_expContext ctx)
	{
		var matched=visit(ctx.matched);
		IValuable lastMatch=null;
		Predicate<Nutt.Match_branchContext> branchSuits=
				b->b.explist().exp().stream().anyMatch(m->matched.equalTo(visit(m)));
		for(var branch: ctx.match_branch().stream().filter(branchSuits).toList())
		{
			if(branchSuits.test(branch))
			{
				lastMatch=visit(branch.exp());
				if(branch.KW_Final()!=null) break;
			}
		}
		if(lastMatch==null)
		{
			if(ctx.default_match_branch()!=null) lastMatch=visit(ctx.default_match_branch().exp());
			else throw new RuntimeException("Non exhaustive match..to expression");
		}
		return lastMatch;
	}

	@Override
	public IValuable visitType_of_exp(Nutt.Type_of_expContext ctx)
	{
		return visit(ctx.exp()).getType();
	}

	//	@Override
	//	public IValuable visitFunctionCallExp(Nutt.FunctionCallExpContext ctx)
	//	{
	//		return new Nutt.Visitors.NuttFunctionVisitor(interpreter).visitFunctionCallExp(ctx);
	//	}

	@Override
	public IValuable visitNumber(Nutt.NumberContext ctx)
	{
		Function<ParseTree,java.lang.String> removeUnderscores=(p)->p.getText().replaceAll("_","");
		if(ctx.Int()!=null) return new Int(removeUnderscores.apply(ctx.Int()));
		else if(ctx.HexInt()!=null) return new Int(removeUnderscores.apply(ctx.HexInt()));
		else if(ctx.Float()!=null) return new Float(removeUnderscores.apply(ctx.Float()));
		else if(ctx.HexFloat()!=null) return new Float(removeUnderscores.apply(ctx.HexFloat()));
		else throw new RuntimeException("Wrong numerable literal: "+NuttEnvironment.toSourceCode(ctx));
	}

	@Override
	public IValuable visitString(Nutt.StringContext ctx)
	{
		return new String(new NuttStringVisitor().visitString(ctx));
	}

	@Override public IValuable visitEval_exp(Nutt.Eval_expContext ctx)
	{
		return visit(NuttEnvironment.parseAsSource(ctx.exp(),true).exp());
	}

	@Override
	public IValuable visitFunc_output(Nutt.Func_outputContext ctx)
	{
		return NuttEnvironment.constructValuable(new NuttTypeInferenceVisitor().visitFunc_output(ctx));
	}

	private INumerable asNumerable(IValuable valuable)
	{
		return valuable.asFunctional().asNumerable();
	}

	private boolean isNumber(IValuable valuable)
	{
		return TypeInferencer.findType("Listable").findChild(valuable.getType())!=null;
	}
}