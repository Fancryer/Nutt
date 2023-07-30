package Nutt.Visitors;

import Nutt.Exceptions.NuttRecordOperatorNotImplementedException;
import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Interpreter.NuttInterpreter;
import Nutt.Interpreter.References.AnonymousNuttReference;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Interpreter.References.PrimitiveNuttReference;
import Nutt.NuttEnvironment;
import Nutt.Pair;
import Nutt.ParseHelpers.CeiledValue;
import Nutt.ParseHelpers.Row;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Actionable.Procedure.ProcedureBuilder;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.IListable;
import Nutt.Types.Functional.Listable.String.String;
import Nutt.Types.Functional.Numerable.INumerable;
import Nutt.Types.Functional.Numerable.Int.Int;
import Nutt.Types.Functional.Record.Record;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.Nil;
import com.sun.jdi.InvalidTypeException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

import static Nutt.Visitors.VisitorPool.typeInferenceVisitor;
import static gen.Nutt.*;

public class NuttEvalVisitor extends NuttGenericVisitor
{
	@Override
	public NuttReference visitIf_then_else_block(If_then_else_blockContext ctx)
	{
		///return new NuttStatementVisitor(interpreter);
		return PrimitiveNuttReference.ofNil();
	}

	@Override
	public NuttReference visitFunction_yield(Function_yieldContext ctx)
	{
		return visit(ctx.explist());
	}

	@Override public NuttReference visitExplist(ExplistContext ctx)
	{
		return AnonymousNuttReference.of(new Array(ctx.exp().stream().map(this::visit).toList()));
	}

	@Override
	public NuttReference visitExplicit_array(Explicit_arrayContext ctx)
	{
		return Nutt.Visitors.VisitorPool.arrayVisitor.visitExplicit_array(ctx);
	}

	@Override
	public NuttReference visitExplicit_variable(Explicit_variableContext ctx)
	{
		return NuttInterpreter.getReference(ctx.NAME().getSymbol().getText());
	}

	@Override
	public NuttReference visitArray_access(Array_accessContext ctx)
	{
		var evaluator=VisitorPool.evalVisitor;
		var array=evaluator.visit(ctx.arr).getValue();
		if(!TypeInferencer.findTypeReference("Listable").getType().hasChild(array.getType()))
		{
			throw new RuntimeException(new InvalidTypeException("Cannot access element of "+array.getType()+" by index!"));
		}
		var index=evaluator.visit(ctx.index);
		if(!TypeInferencer.findTypeReference("Int").getType().equals(index.getType()))
		{
			throw new RuntimeException(
					new InvalidTypeException("Cannot access element of %s with index of %s type!".formatted(array.getType(),
					                                                                                        index.getType())));
		}
		return array.asFunctional().asListable().getAt(index);
	}

	@Override
	public NuttReference visitPrefix_exp(Prefix_expContext ctx)
	{
		var op=ctx.operator_prefix();
		var reference=visit(ctx.exp());
		var valueIsNumerable=TypeInferencer.findTypeReference("Numerable").getType().hasChild(reference.getType());
		if(op.OP_Sub()!=null)
		{
			if(!valueIsNumerable) throw new ArithmeticException("Cannot negate a "+reference.getType());
			return PrimitiveNuttReference.ofNumber(INumerable.negate(reference.getValue().asFunctional().asNumerable()));
		}
		if(op.OP_Add()!=null)
		{
			if(!valueIsNumerable) throw new ArithmeticException("Cannot abs a "+reference.getType());
			return PrimitiveNuttReference.ofNumber(INumerable.abs(reference.getValue().asFunctional().asNumerable()));
		}
		if(op.OP_Length()!=null)
			return PrimitiveNuttReference.ofNumber(new Int(reference.getValue().getLength()));
		if(op.OP_Not()!=null)
			return PrimitiveNuttReference.ofBoolean(!VisitorPool.conditionVisitor.visit(ctx.exp()).getValue().isTrue());
		throw new UnsupportedOperationException();
	}

	@Override
	public NuttReference visitInstance_of_exp(Instance_of_expContext ctx)
	{
		NuttReference ceilType;
		if(ctx.type_exp!=null) ceilType=TypeInferencer.findTypeReference(visit(ctx.type_exp).getType());
		else
		{
			if(ctx.NAME()!=null)
				ceilType=TypeInferencer.findTypeReference(ctx.NAME().getText());
			else
				ceilType=TypeInferencer.findTypeReference(typeInferenceVisitor.visit(ctx.type_exp)
				                                                              .getType()
				                                                              .getDisplayName());
		}
		var isInstanceOf=TypeInferencer.verdict(ceilType,TypeInferencer.findTypeReference(visit(ctx.to_check).getType()));
		return PrimitiveNuttReference.ofBoolean(isInstanceOf);
	}

	@Override
	public NuttReference visitExplicit_atom(Explicit_atomContext ctx)
	{
		var atom=ctx.atom();
		if(atom.number()!=null) return visitNumber(atom.number());
		if(atom.string()!=null) return visitString(atom.string());
		if(atom.boolean_()!=null) return PrimitiveNuttReference.ofBoolean(atom.boolean_().KW_True()!=null);
		if(atom.nil()!=null) return PrimitiveNuttReference.ofNil();
		throw new RuntimeException();
	}

	@Override
	public NuttReference visitFunction_definition_exp(Function_definition_expContext ctx)
	{
		return visitLocal_funct(ctx.local_funct());
	}

	@Override
	public NuttReference visitType_of_exp(Type_of_expContext ctx)
	{
		return TypeInferencer.findTypeReference(visit(ctx.exp()).getType());
	}

	@Override public NuttReference visitRange_array_initializer_exp(Range_array_initializer_expContext ctx)
	{
		Range_array_initializerContext arrayInitializer=ctx.range_array_initializer();
		var start=visit(arrayInitializer.start);
		var next=visit(arrayInitializer.next);
		var range=INumerable.sub((INumerable)next.getValue(),(INumerable)start.getValue());
		var bound=visit(arrayInitializer.bound).getValue();
		var iterator=start;
		var valuables=new ArrayList<NuttReference>();
		var isReverse=arrayInitializer.OP_Reverse()!=null;
		while(iterator.getValue().lessEqualTo(bound))
		{
			valuables.add(isReverse?0:valuables.size(),iterator);
			iterator=INumerable.add((INumerable)iterator.getValue(),range).toAnonymousReference();
		}
		return new Array(valuables).toAnonymousReference();
	}

	@Override public NuttReference visitEval_exp(Eval_expContext ctx)
	{
		return visit(NuttEnvironment.parseAsSource(ctx.exp(),true).exp());
	}

	@Override public NuttReference visitRecord_initializer_exp(Record_initializer_expContext ctx)
	{
		var rowList=ctx.record_initializer().record_element_list();
		List<Row> members=new ArrayList<>();
		for(var row: rowList.record_element())
		{
			var val=visit(row.val);
			java.lang.String key=(row.name_key!=null
			                      ?PrimitiveNuttReference.ofString(new String("'%s'".formatted(row.name_key.getText())))
			                      :new NuttStringVisitor().visitString(row.string_key)).getValue().toSerializedString();
			members.add(new Row(key,new CeiledValue(val.getType(),val.getValue())));
		}
		return AnonymousNuttReference.of(new Record(members));
	}

	@Override
	public NuttReference visitFunc_call_exp(Func_call_expContext ctx)
	{
		try
		{
			return VisitorPool.functionVisitor.visitFunc_call_exp(ctx);
		}
		catch(NuttSuccessReturnException e)
		{
			return e.getReference();
		}
	}

	@Override
	public NuttReference visitQuarternary_exp(Quarternary_expContext ctx)
	{
		return visit(VisitorPool.conditionVisitor.visit(ctx.cond).getValue().isTrue()?ctx.if_true:ctx.if_false);
	}

	@Override
	public NuttReference visitInfix_exp(Infix_expContext ctx)
	{
		var defaultOperator=ctx.operator_infix().default_infix_operator();
		var left=visit(ctx.left);
		var right=visit(ctx.right);
		if(defaultOperator!=null)
		{
			if(defaultOperator.operator_logical()!=null) return Nutt.Visitors.VisitorPool.conditionVisitor.visit(ctx);
			if(defaultOperator.operator_comparison()!=null) return Nutt.Visitors.VisitorPool.compareVisitor.visitInfix_exp(ctx);
			var op=NuttEnvironment.toSourceCode(defaultOperator);
			if(left==null) throw new RuntimeException("Left operand is corrupted!");
			if(left.getValue() instanceof INumerable leftAsNumerable)
			{
				var rightAsNumerable=right.getValue().asFunctional().asNumerable();
				return (switch(op)
				        {
					        case "+" -> INumerable.add(leftAsNumerable,rightAsNumerable);
					        case "-" -> INumerable.sub(leftAsNumerable,rightAsNumerable);
					        case "*" -> INumerable.mult(leftAsNumerable,rightAsNumerable);
					        case "/" -> INumerable.div(leftAsNumerable,rightAsNumerable);
					        case "//" -> INumerable.intDiv(leftAsNumerable,rightAsNumerable);
					        case "%" -> INumerable.mod(leftAsNumerable,rightAsNumerable);
					        case "^" -> INumerable.pow(leftAsNumerable,rightAsNumerable);
					        default -> new Nil();
				        }).toAnonymousReference();
			}
			if(left.getValue() instanceof String str) return (Objects.equals("+",op)?str.add(right):new Nil()).toAnonymousReference();
			if(left.getValue() instanceof IListable leftAsListable)
			{
				var rightAsListable=right.getValue().asFunctional().asListable();
				var resArr=new Array(leftAsListable.getElementType());
				var i=0;
				for(var leftEl: leftAsListable)
				{
					var rightEl=rightAsListable.getAt(new Int(i).toAnonymousReference());
					resArr.add(visit(NuttEnvironment.getTempParser(leftEl+op+rightEl).exp()));
				}
				return resArr.toAnonymousReference();
			}
			if(left.getValue() instanceof Record leftAsRecord)
			{
				try
				{
					VisitorPool.functionVisitor.invokeProcedure(leftAsRecord.getOperators().get(op),List.of(left,right));
				}
				catch(NuttSuccessReturnException e)
				{
					return e.getReference();
				}
				throw new NuttRecordOperatorNotImplementedException(left.getType(),op);
			}
			throw new NuttRecordOperatorNotImplementedException(left.getType(),op);
		}
		else
		{
			var op=ctx.operator_infix().Op_Custom().getText();
			if(left==null) throw new RuntimeException("Left operand is corrupted!");
			if(left.getValue() instanceof Record leftAsRecord)
			{
				try
				{
					VisitorPool.functionVisitor.invokeProcedure(leftAsRecord.getOperators().get(op),List.of(left,right));
				}
				catch(NuttSuccessReturnException e)
				{
					return e.getReference();
				}
				throw new NuttRecordOperatorNotImplementedException(left.getType(),op);
			}
			throw new NuttRecordOperatorNotImplementedException(left.getType(),op);
		}
	}

	@Override public NuttReference visitReverse_exp(Reverse_expContext ctx)
	{
		var exp=visit(ctx.exp()).getValue();
		var reversed=switch(exp)
		{
			case String string -> new String(new StringBuilder(string.getValue()).reverse());
			case Array array ->
			{
				var originalList=array.getElements();
				Collections.reverse(originalList);
				yield new Array(array.getElementType(),originalList);
			}
			default -> exp;
		};
		return AnonymousNuttReference.of(reversed);
	}

	@Override
	public NuttReference visitParenthesis_exp(Parenthesis_expContext ctx)
	{
		return visit(ctx.exp());
	}

	@Override public NuttReference visitRecord_member_access(Record_member_accessContext ctx)
	{
		var left=visit(ctx.record);
		if(!TypeInferencer.verdict("Record",left.getType().getDisplayName())) throw new RuntimeException();
		return AnonymousNuttReference.of
				                             (
						                             left.getValue()
						                                 .asFunctional()
						                                 .asRecord()
						                                 .getMember(VisitorPool.stringVisitor.visit(ctx.index).toString())
				                             );
	}

	@Override public NuttReference visitMatch_to_exp(Match_to_expContext ctx)
	{
		var matched=visit(ctx.matched);
		NuttReference lastMatch=null;
		Predicate<Match_branchContext> branchSuits=
				b->b.explist().exp().stream().anyMatch(m->matched.getValue().equalTo(visit(m).getValue()));
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

	/*
	@Override public NuttReference visitMap_exp(Nutt.Map_expContext ctx)
	{
		var left=visit(ctx.left);
		var right=visit(ctx.right);
		if(!TypeInferencer.verdict("Listable",left.getType()))
			throw new RuntimeException(left.getType()+" cannot be mapped!");
		if(!TypeInferencer.verdict("Procedure",right.getType()))
			throw new RuntimeException(right.getType()+" cannot be mapper!");
		//var array=left.asFunctional().asListable().spread().stream().toList();
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

	@Override public NuttReference visitAtom(AtomContext ctx)
	{
		return ctx.string()!=null?VisitorPool.stringVisitor.visitString(ctx.string()):super.visitAtom(ctx);
	}

	@Override
	public NuttReference visitNumber(NumberContext ctx)
	{
		Function<java.lang.String,java.lang.String> removeUnderscores=s->s.contains("_")?s.replaceAll("_",""):s;
		INumerable numerable;
		if(ctx.int_()!=null)
		{
			var asString=NuttEnvironment.toSourceCode(ctx.int_());
			numerable=Nutt.Types.Functional.Numerable.Int.Int.fromString(removeUnderscores.apply(asString));
		}
		else
		{
			var asString=NuttEnvironment.toSourceCode(ctx.float_());
			numerable=Nutt.Types.Functional.Numerable.Float.Float.fromString(removeUnderscores.apply(asString));
		}
		return PrimitiveNuttReference.ofNumber(numerable);
	}

	//	@Override
	//	public NuttReference visitFunctionCallExp(Nutt.FunctionCallExpContext ctx)
	//	{
	//		return new Nutt.Visitors.NuttFunctionVisitor(interpreter).visitFunctionCallExp(ctx);
	//	}

	@Override
	public NuttReference visitString(StringContext ctx)
	{
		return VisitorPool.stringVisitor.visitString(ctx);
	}

	@Override
	public NuttReference visitFunc_output(Func_outputContext ctx)
	{
		return NuttEnvironment.constructReference(typeInferenceVisitor.visitFunc_output(ctx).getType());
	}

	@Override
	public NuttReference visitLocal_funct(Local_functContext ctx)
	{
		var lambda=ctx.lambda_decl();
		return lambda!=null?evalLambda(lambda):evalAnonymousFunct(ctx.funcbody());
	}

	private NuttReference evalAnonymousFunct(FuncbodyContext funcbody)
	{
		List<Vararg_or_signatureContext> parameters;
		var functSignature=funcbody.funct_signature();
		if(functSignature.var_signature_list()!=null)
			parameters=functSignature.var_signature_list().vararg_or_signature();
		else if(functSignature.vararg_or_signature()!=null)
			parameters=List.of(functSignature.vararg_or_signature());
		else parameters=new ArrayList<>();
		var functionBody=funcbody.block();
		Pair<Type,NuttReference> outputPair;
		NuttReference declaredOutputValue;
		Type declaredOutputType;
		var isTypePresented=functSignature.func_output().by_type_var_decl()!=null;
		var isValuePresented=functSignature.func_output().default_output!=null;
		if(isTypePresented)
		{
			declaredOutputType=typeInferenceVisitor.visitType_param
					                                       (
							                                       functSignature.func_output()
							                                                     .by_type_var_decl()
							                                                     .type_param()
					                                       ).getType();
			outputPair=new Pair<>(declaredOutputType,NuttEnvironment.constructReference(declaredOutputType));
		}
		else if(isValuePresented)
		{
			declaredOutputValue=visit(functSignature.func_output().default_output);
			outputPair=new Pair<>(declaredOutputValue.getType(),declaredOutputValue);
		}
		else outputPair=new Pair<>(TypeInferencer.findTypeReference("Valuable").getType(),PrimitiveNuttReference.ofNil());
		return AnonymousNuttReference.of
				                             (
						                             new ProcedureBuilder().setSignature(new Signature(parameters,outputPair.left()))
						                                                   .setFunctionBody(functionBody)
						                                                   .setOutput(outputPair.right())
						                                                   .createProcedure()
				                             );
	}

	private NuttReference evalLambda(Lambda_declContext lambda)
	{
		var functSignature=lambda.funct_signature();
		var varSignature=functSignature.vararg_or_signature();
		var varSignatureList=functSignature.var_signature_list();
		java.lang.String signature=varSignature!=null
		                           ?NuttEnvironment.toSourceCode(varSignature)
		                           :varSignatureList!=null
		                            ?'('+NuttEnvironment.toSourceCode(varSignatureList)+')'
		                            :"()";
		java.lang.String output=functSignature.func_output()!=null
		                        ?NuttEnvironment.toSourceCode(functSignature.func_output())
		                        :":Nil";
		var exp=NuttEnvironment.toSourceCode(lambda.exp());
		var transformed="funct %s%s=yield %s return".formatted(signature,output,exp);
		return visitLocal_funct(NuttEnvironment.getTempParser(transformed).local_funct());
	}
}