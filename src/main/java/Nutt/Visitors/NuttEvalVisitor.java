//package Nutt.Visitors;
//
//import Nutt.Exceptions.NuttRecordOperatorNotImplementedException;
//import Nutt.Exceptions.NuttSuccessReturnException;
//import Nutt.NuttEnvironment;
//import Nutt.NuttInterpreter;
//import Nutt.Pair;
//import Nutt.ParseHelpers.Partition;
//import Nutt.ParseHelpers.Row;
//import Nutt.TypeInferencer;
//import Nutt.Types.Functional.Actionable.Procedure.ProcedureBuilder;
//import Nutt.Types.Functional.Actionable.Procedure.Signature;
//import Nutt.Types.Functional.Listable.Array.Array;
//import Nutt.Types.Functional.Listable.IListable;
//import Nutt.Types.Functional.Listable.String.String;
//import Nutt.Types.Functional.Numerable.Boolean;
//import Nutt.Types.Functional.Numerable.INumerable;
//import Nutt.Types.Functional.Numerable.Int.Int;
//import Nutt.Types.Functional.Record.Record;
//import Nutt.Types.Functional.Type.Type;
//import Nutt.Types.IValuable;
//import Nutt.Types.Nil;
//import com.sun.jdi.InvalidTypeException;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Objects;
//import java.util.function.Function;
//import java.util.function.Predicate;
//
//import static gen.Nutt.*;
//
//public class NuttEvalVisitor extends Nutt.Visitors.NuttGenericVisitor<IValuable>
//{
//	@Override
//	public IValuable visitIf_then_else_block(If_then_else_blockContext ctx)
//	{
//		///return new NuttStatementVisitor(interpreter);
//		return new Nil();
//	}
//
//	@Override
//	public IValuable visitFunction_yield(Function_yieldContext ctx)
//	{
//		return visit(ctx.explist());
//	}
//
//	@Override
//	public IValuable visitExplicit_array(Explicit_arrayContext ctx)
//	{
//		return Nutt.Visitors.VisitorsPool.arrayVisitor.visitExplicit_array(ctx);
//	}
//
//	@Override
//	public IValuable visitExplicit_variable(Explicit_variableContext ctx)
//	{
//		var name=ctx.NAME().getSymbol().getText();
//		var asType=TypeInferencer.findType(name);
//		if(asType!=null) return asType;
//		var variableRef=NuttInterpreter.getVariable(name);
//		return variableRef.isConstant
//		       ?variableRef.getValuable().replicate()
//		       :variableRef.getValuable();
//	}
//
//	@Override public IValuable visitRange_array_initializer_exp(Range_array_initializer_expContext ctx)
//	{
//		Range_array_initializerContext arrayInitializer=ctx.range_array_initializer();
//		var start=visit(arrayInitializer.start);
//		var next=visit(arrayInitializer.next);
//		var range=INumerable.sub((INumerable)next,(INumerable)start);
//		var bound=visit(arrayInitializer.bound);
//		var iterator=(INumerable)start;
//		var valuables=new ArrayList<IValuable>();
//		var isReverse=arrayInitializer.OP_Reverse()!=null;
//		while(iterator.lessEqualTo(bound))
//		{
//			valuables.add(isReverse?0:valuables.size(),iterator);
//			iterator=INumerable.add(iterator,range);
//		}
//		return new Array(valuables);
//	}
//
//	@Override
//	public IValuable visitArray_access(Array_accessContext ctx)
//	{
//		var evaluator=VisitorsPool.evalVisitor;
//		var array=evaluator.visit(ctx.arr);
//		if(TypeInferencer.findType("Listable").findChild(array.getType())==null)
//		{
//			throw new RuntimeException(
//					new InvalidTypeException("Cannot access element of "+array.getType()+" by index!"));
//		}
//		var index=evaluator.visit(ctx.index);
//		if(!TypeInferencer.findType("Int").equals(index.getType()))
//		{
//			throw new RuntimeException(
//					new InvalidTypeException("Cannot access element of %s with index of %s type!".formatted(array.getType(),
//					                                                                                        index.getType())));
//		}
//		return array.asFunctional().asListable().getAt(index.asFunctional().asNumerable().asInt());
//	}
//
//	@Override
//	public IValuable visitFunc_call_exp(Func_call_expContext ctx)
//	{
//		try
//		{
//			return VisitorsPool.functionVisitor.visitFunc_call_exp(ctx);
//		}
//		catch(NuttSuccessReturnException e)
//		{
//			return e.getValue();
//		}
//	}
//
//	@Override
//	public IValuable visitQuarternary_exp(Quarternary_expContext ctx)
//	{
//		return visit(VisitorsPool.conditionVisitor.visit(ctx.cond).asFunctional().asBoolean().isTrue()
//		             ?ctx.if_true:ctx.if_false);
//	}
//
//	@Override
//	public IValuable visitInfix_exp(Infix_expContext ctx)
//	{
//		var defaultOperator=ctx.operator_infix().default_infix_operator();
//		var left=visit(ctx.left);
//		var right=visit(ctx.right);
//		if(defaultOperator!=null)
//		{
//			if(defaultOperator.operator_logical()!=null) return Nutt.Visitors.VisitorsPool.conditionVisitor.visit(ctx);
//			if(defaultOperator.operator_comparison()!=null) return Nutt.Visitors.VisitorsPool.compareVisitor.visitInfix_exp(ctx);
//			var op=NuttEnvironment.toSourceCode(defaultOperator);
//			//			return switch(left)
//			//			{
//			//				case INumerable leftAsNumerable ->
//			//				{
//			//					var rightAsNumerable=right.asFunctional().asNumerable();
//			//					yield switch(op)
//			//					{
//			//						case "+" -> INumerable.add(leftAsNumerable,rightAsNumerable);
//			//						case "-" -> INumerable.sub(leftAsNumerable,rightAsNumerable);
//			//						case "*" -> INumerable.mult(leftAsNumerable,rightAsNumerable);
//			//						case "/" -> INumerable.div(leftAsNumerable,rightAsNumerable);
//			//						case "//" -> INumerable.intDiv(leftAsNumerable,rightAsNumerable);
//			//						case "%" -> INumerable.mod(leftAsNumerable,rightAsNumerable);
//			//						case "^" -> INumerable.pow(leftAsNumerable,rightAsNumerable);
//			//						default -> new Nil();
//			//					};
//			//				}
//			//				case String str -> Objects.equals("+",op)?str.add(right):new Nil();
//			//				case IListable leftAsListable ->
//			//				{
//			//					var rightAsListable=right.asFunctional().asListable();
//			//					var resArr=new Array(leftAsListable.getElementType());
//			//					var i=0;
//			//					for(var leftEl: leftAsListable)
//			//					{
//			//						var rightEl=rightAsListable.getAt(new Int(i));
//			//						resArr.add(visit(NuttEnvironment.getTempParser(leftEl+op+rightEl).exp()));
//			//					}
//			//					yield resArr;
//			//				}
//			//				case Record leftAsRecord ->
//			//				{
//			//					var rightAsRecord=right.asFunctional().asFunctional().asRecord();
//			//					try
//			//					{
//			//						VisitorsPool.functionVisitor.invokeProcedure(leftAsRecord.getOperators().get(op),
//			//						                                             List.of(leftAsRecord,rightAsRecord));
//			//					}
//			//					catch(NuttSuccessReturnException e)
//			//					{
//			//						yield e.getValue();
//			//					}
//			//					throw new NuttRecordOperatorNotImplementedException(left.getType(),op);
//			//				}
//			//				case null -> throw new RuntimeException("Left operand is corrupted!");
//			//				default -> throw new NuttRecordOperatorNotImplementedException(left.getType(),op);
//			//			};
//			if(left==null) throw new RuntimeException("Left operand is corrupted!");
//			if(left instanceof INumerable leftAsNumerable)
//			{
//				var rightAsNumerable=right.asFunctional().asNumerable();
//				return switch(op)
//				{
//					case "+" -> INumerable.add(leftAsNumerable,rightAsNumerable);
//					case "-" -> INumerable.sub(leftAsNumerable,rightAsNumerable);
//					case "*" -> INumerable.mult(leftAsNumerable,rightAsNumerable);
//					case "/" -> INumerable.div(leftAsNumerable,rightAsNumerable);
//					case "//" -> INumerable.intDiv(leftAsNumerable,rightAsNumerable);
//					case "%" -> INumerable.mod(leftAsNumerable,rightAsNumerable);
//					case "^" -> INumerable.pow(leftAsNumerable,rightAsNumerable);
//					default -> new Nil();
//				};
//			}
//			if(left instanceof String str) return Objects.equals("+",op)?str.add(right):new Nil();
//			if(left instanceof IListable leftAsListable)
//			{
//				var rightAsListable=right.asFunctional().asListable();
//				var resArr=new Array(leftAsListable.getElementType());
//				var i=0;
//				for(var leftEl: leftAsListable)
//				{
//					var rightEl=rightAsListable.getAt(new Int(i));
//					resArr.add(visit(NuttEnvironment.getTempParser(leftEl+op+rightEl).exp()));
//				}
//				return resArr;
//			}
//			if(left instanceof Record leftAsRecord)
//			{
//				var rightAsRecord=right.asFunctional().asFunctional().asRecord();
//				try
//				{
//					VisitorsPool.functionVisitor.invokeProcedure(leftAsRecord.getOperators().get(op),
//					                                             List.of(leftAsRecord,rightAsRecord));
//				}
//				catch(NuttSuccessReturnException e)
//				{
//					return e.getValue();
//				}
//				throw new NuttRecordOperatorNotImplementedException(left.getType(),op);
//			}
//			throw new NuttRecordOperatorNotImplementedException(left.getType(),op);
//		}
//		else
//		{
//			var op=ctx.operator_infix().Op_Custom().getText();
//			//			return switch(left)
//			//			{
//			//				case Record leftAsRecord ->
//			//				{
//			//					var rightAsRecord=right.asFunctional().asFunctional().asRecord();
//			//					try
//			//					{
//			//						VisitorsPool.functionVisitor.invokeProcedure(leftAsRecord.getOperators().get(op),
//			//						                                             List.of(leftAsRecord,rightAsRecord));
//			//					}
//			//					catch(NuttSuccessReturnException e)
//			//					{
//			//						yield e.getValue();
//			//					}
//			//					throw new NuttRecordOperatorNotImplementedException(left.getType(),op);
//			//				}
//			//				case null -> throw new RuntimeException("Left operand is corrupted!");
//			//				default -> throw new NuttRecordOperatorNotImplementedException(left.getType(),op);
//			//			};
//			if(left==null) throw new RuntimeException("Left operand is corrupted!");
//			if(left instanceof Record leftAsRecord)
//			{
//				var rightAsRecord=right.asFunctional().asFunctional().asRecord();
//				try
//				{
//					VisitorsPool.functionVisitor.invokeProcedure(leftAsRecord.getOperators().get(op),
//					                                             List.of(leftAsRecord,rightAsRecord));
//				}
//				catch(NuttSuccessReturnException e)
//				{
//					return e.getValue();
//				}
//				throw new NuttRecordOperatorNotImplementedException(left.getType(),op);
//			}
//			throw new NuttRecordOperatorNotImplementedException(left.getType(),op);
//		}
//	}
//
//	@Override public IValuable visitRecord_initializer_exp(Record_initializer_expContext ctx)
//	{
//		var rowList=ctx.record_initializer().record_element_list();
//		List<Row> members=new ArrayList<>();
//		for(var row: rowList.record_element())
//		{
//			var val=visit(row.val);
//			java.lang.String key=(row.name_key!=null
//			                      ?new String("'%s'".formatted(row.name_key.getText()))
//			                      :new NuttStringVisitor().visitString(row.string_key)).toSerializedString();
//			members.add(new Row(key,new Partition(val.getType(),val)));
//		}
//		return new Record(members);
//	}
//
//	@Override public IValuable visitRecord_member_access(Record_member_accessContext ctx)
//	{
//		var left=visit(ctx.record);
//		if(!TypeInferencer.verdict("Record",left.getType().getDisplayName())) throw new RuntimeException();
//		return left.asFunctional()
//		           .asRecord()
//		           .getMember(VisitorsPool.stringVisitor.visit(ctx.index).toString());
//	}
//
//	@Override public IValuable visitAtom(AtomContext ctx)
//	{
//		return ctx.string()!=null?VisitorsPool.stringVisitor.visitString(ctx.string()):super.visitAtom(ctx);
//	}
//
//	@Override
//	public IValuable visitPrefix_exp(Prefix_expContext ctx)
//	{
//		var op=ctx.operator_prefix();
//		var value=visit(ctx.exp());
//		var valueIsNumerable=TypeInferencer.findType("Numerable").findChild(value.getType())!=null;
//		if(op.OP_Sub()!=null)
//		{
//			if(!valueIsNumerable) throw new ArithmeticException("Cannot negate a "+value.getType());
//			return INumerable.negate(value.asFunctional().asNumerable());
//		}
//		if(op.OP_Add()!=null)
//		{
//			if(!valueIsNumerable) throw new ArithmeticException("Cannot abs a "+value.getType());
//			return INumerable.abs(value.asFunctional().asNumerable());
//		}
//		if(op.OP_Length()!=null)
//			return new Int(value.getLength());
//		if(op.OP_Not()!=null)
//			return new Boolean(!VisitorsPool.conditionVisitor.visit(ctx.exp()).asFunctional().asBoolean().isTrue());
//		throw new UnsupportedOperationException();
//	}
//
//	@Override
//	public IValuable visitInstance_of_exp(Instance_of_expContext ctx)
//	{
//		Type ceilType;
//		if(ctx.type_exp!=null) ceilType=visit(ctx.type_exp).getType();
//		else
//		{
//			if(ctx.NAME()!=null)
//				ceilType=TypeInferencer.findType(ctx.NAME().getText());
//			else
//				ceilType=TypeInferencer.findType(VisitorsPool.typeInferenceVisitor.visit(ctx.type_exp)
//				                                                                  .getType()
//				                                                                  .getDisplayName());
//		}
//		return new Boolean(TypeInferencer.verdict(ceilType,visit(ctx.to_check).getType()));
//	}
//
//	@Override
//	public IValuable visitExplicit_atom(Explicit_atomContext ctx)
//	{
//		var atom=ctx.atom();
//		if(atom.number()!=null) return visitNumber(atom.number());
//		if(atom.string()!=null) return visitString(atom.string());
//		if(atom.boolean_()!=null) return new Boolean(atom.boolean_().KW_True()!=null);
//		if(atom.nil()!=null) return new Nil();
//		throw new RuntimeException();
//	}
//
//	@Override public IValuable visitExplist(ExplistContext ctx)
//	{
//		return new Array(ctx.exp().stream().map(this::visit).toList());
//	}
//
//	@Override
//	public IValuable visitParenthesis_exp(Parenthesis_expContext ctx)
//	{
//		return visit(ctx.exp());
//	}
//
//	@Override
//	public IValuable visitFunction_definition_exp(Function_definition_expContext ctx)
//	{
//		return visitLocal_funct(ctx.local_funct());
//	}
//
//	@Override public IValuable visitLocal_funct(Local_functContext ctx)
//	{
//		var lambda=ctx.lambda_decl();
//		return lambda!=null?evalLambda(lambda):evalAnonymousFunct(ctx.funcbody());
//	}
//
//	private IValuable evalAnonymousFunct(FuncbodyContext funcbody)
//	{
//		List<Vararg_or_signatureContext> parameters;
//		var functSignature=funcbody.funct_signature();
//		if(functSignature.var_signature_list()!=null)
//			parameters=functSignature.var_signature_list().vararg_or_signature();
//		else if(functSignature.vararg_or_signature()!=null)
//			parameters=List.of(functSignature.vararg_or_signature());
//		else parameters=new ArrayList<>();
//		var functionBody=funcbody.block();
//		Pair<Type,IValuable> outputPair;
//		IValuable declaredOutputValue;
//		Type declaredOutputType;
//		var isTypePresented=functSignature.func_output().by_type_var_decl()!=null;
//		var isValuePresented=functSignature.func_output().default_output!=null;
//		if(isTypePresented)
//		{
//			declaredOutputType=VisitorsPool.typeInferenceVisitor.visitType_param(
//					functSignature.func_output().by_type_var_decl().type_param());
//			outputPair=new Pair<>(declaredOutputType,NuttEnvironment.constructValuable(declaredOutputType));
//		}
//		else if(isValuePresented)
//		{
//			declaredOutputValue=visit(functSignature.func_output().default_output);
//			outputPair=new Pair<>(declaredOutputValue.getType(),declaredOutputValue);
//		}
//		else outputPair=new Pair<>(TypeInferencer.findType("Valuable"),new Nil());
//		return new ProcedureBuilder().setSignature(new Signature(parameters,outputPair.left()))
//		                             .setFunctionBody(functionBody)
//		                             .setOutput(outputPair.right())
//		                             .createProcedure();
//	}
//
//	private IValuable evalLambda(Lambda_declContext lambda)
//	{
//		var functSignature=lambda.funct_signature();
//		var varSignature=functSignature.vararg_or_signature();
//		var varSignatureList=functSignature.var_signature_list();
//		java.lang.String signature=varSignature!=null
//		                           ?NuttEnvironment.toSourceCode(varSignature)
//		                           :varSignatureList!=null
//		                            ?'('+NuttEnvironment.toSourceCode(varSignatureList)+')'
//		                            :"()";
//		java.lang.String output=functSignature.func_output()!=null
//		                        ?NuttEnvironment.toSourceCode(functSignature.func_output())
//		                        :":Nil";
//		var exp=NuttEnvironment.toSourceCode(lambda.exp());
//		var transformed="funct %s%s=yield %s return".formatted(signature,output,exp);
//		return visitLocal_funct(NuttEnvironment.getTempParser(transformed).local_funct());
//	}
//
//	/*
//	@Override public IValuable visitMap_exp(Nutt.Map_expContext ctx)
//	{
//		var left=visit(ctx.left);
//		var right=visit(ctx.right);
//		if(!TypeInferencer.verdict("Listable",left.getType()))
//			throw new RuntimeException(left.getType()+" cannot be mapped!");
//		if(!TypeInferencer.verdict("Procedure",right.getType()))
//			throw new RuntimeException(right.getType()+" cannot be mapper!");
//		//var array=left.asFunctional().asListable().asElementsArray().stream().toList();
//		//		var mapper=right.asFunctional().asActionable().asProcedure();
//		//		List<IValuable> valuables=new ArrayList<>();
//		//		for(var element: array)
//		//		{
//		//			var parameters=List.of(element);
//		//			//valuables.add()
//		//		}
//		return super.visitMap_exp(ctx);
//	}
//	*/
//
//	@Override public IValuable visitMatch_to_exp(Match_to_expContext ctx)
//	{
//		var matched=visit(ctx.matched);
//		IValuable lastMatch=null;
//		Predicate<Match_branchContext> branchSuits=
//				b->b.explist().exp().stream().anyMatch(m->matched.equalTo(visit(m)));
//		for(var branch: ctx.match_branch().stream().filter(branchSuits).toList())
//		{
//			if(branchSuits.test(branch))
//			{
//				lastMatch=visit(branch.exp());
//				if(branch.KW_Final()!=null) break;
//			}
//		}
//		if(lastMatch==null)
//		{
//			if(ctx.default_match_branch()!=null) lastMatch=visit(ctx.default_match_branch().exp());
//			else throw new RuntimeException("Non exhaustive match..to expression");
//		}
//		return lastMatch;
//	}
//
//	@Override
//	public IValuable visitType_of_exp(Type_of_expContext ctx)
//	{
//		return visit(ctx.exp()).getType();
//	}
//
//	//	@Override
//	//	public IValuable visitFunctionCallExp(Nutt.FunctionCallExpContext ctx)
//	//	{
//	//		return new Nutt.Visitors.NuttFunctionVisitor(interpreter).visitFunctionCallExp(ctx);
//	//	}
//
//	@Override public IValuable visitReverse_exp(Reverse_expContext ctx)
//	{
//		var exp=visit(ctx.exp());
//		return switch(exp)
//		{
//			case String string -> new String(new StringBuilder(string.getValue()).reverse().toString());
//			case Array array ->
//			{
//				var originalList=array.getElements();
//				Collections.reverse(originalList);
//				yield new Array(array.getElementType(),originalList);
//			}
//			default -> exp;
//		};
//	}
//
//	@Override
//	public IValuable visitNumber(NumberContext ctx)
//	{
//		Function<java.lang.String,java.lang.String> removeUnderscores=s->s.replaceAll("_","");
//		if(ctx.int_()!=null)
//		{
//			var asString=NuttEnvironment.toSourceCode(ctx.int_());
//			return Nutt.Types.Functional.Numerable.Int.Int.fromString(asString.contains("_")?removeUnderscores.apply(asString):asString);
//		}
//		var asString=NuttEnvironment.toSourceCode(ctx.float_());
//		return Nutt.Types.Functional.Numerable.Float.Float.fromString(asString.contains("_")?removeUnderscores.apply(asString):asString);
//	}
//
//	@Override
//	public IValuable visitString(StringContext ctx)
//	{
//		return new String(VisitorsPool.stringVisitor.visitString(ctx));
//	}
//
//	@Override public IValuable visitEval_exp(Eval_expContext ctx)
//	{
//		return visit(NuttEnvironment.parseAsSource(ctx.exp(),true).exp());
//	}
//
//	@Override
//	public IValuable visitFunc_output(Func_outputContext ctx)
//	{
//		return NuttEnvironment.constructValuable(VisitorsPool.typeInferenceVisitor.visitFunc_output(ctx));
//	}
//}