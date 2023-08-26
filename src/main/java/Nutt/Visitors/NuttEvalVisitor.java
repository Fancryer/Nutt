package Nutt.Visitors;

import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Interpreter.Logging.EActionStatus;
import Nutt.Interpreter.Logging.ESeverity;
import Nutt.Interpreter.Logging.LogStamp;
import Nutt.Interpreter.NuttInterpreter;
import Nutt.Interpreter.References.AnonymousNuttReference;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Interpreter.References.PrimitiveNuttReference;
import Nutt.NuttEnvironment;
import Nutt.Pair;
import Nutt.ParseHelpers.Row;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Actionable.Procedure.Procedure;
import Nutt.Types.Functional.Actionable.Procedure.ProcedureBuilder;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.Map.Map;
import Nutt.Types.Functional.Listable.String.String;
import Nutt.Types.Functional.Numerable.Boolean;
import Nutt.Types.Functional.Numerable.INumerable;
import Nutt.Types.Functional.Record.Record;
import Nutt.Types.Functional.Type.Type;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import static Nutt.NuttEnvironment.nuttLogger;
import static Nutt.Visitors.VisitorPool.typeInferenceVisitor;
import static gen.Nutt.*;

public class NuttEvalVisitor extends NuttGenericVisitor
{
	public List<NuttReference> unwrapExplist(ExplistContext ctx)
	{
		return unwrapExplist(ctx.exp());
	}

	public List<NuttReference> unwrapExplist(List<ExpContext> expContexts)
	{
		return expContexts.stream().map(this::visit).toList();
	}

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
	public NuttReference visitExplicit_variable(Explicit_variableContext ctx)
	{
		return NuttInterpreter.getReference(ctx.NAME().getSymbol().getText());
	}

	@Override
	public NuttReference visitProperty_access(Property_accessContext ctx)
	{
		var left=visit(ctx.exp());
		if(!TypeInferencer.verdict("Record",left.getType().getHeader().getDisplayName())) throw new RuntimeException();
		if(ctx.operator!=null)
			return left.getType().getOperator(NuttEnvironment.toSourceCode(ctx.operator));
		java.lang.String index;
		index=ctx.NAME()!=null
		      ?ctx.NAME().getText()
		      :visit(ctx.string_property).getValue().simpleCast(String.class).getValue();
		return left.getValue().getProperty(index);
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
			return PrimitiveNuttReference.ofNumber(INumerable.negate(reference.getValue().simpleCast(INumerable.class)));
		}
		if(op.OP_Add()!=null)
		{
			if(!valueIsNumerable) throw new ArithmeticException("Cannot abs a "+reference.getType());
			return PrimitiveNuttReference.ofNumber(INumerable.abs(reference.getValue().simpleCast(INumerable.class)));
		}
		if(op.OP_Length()!=null)
			return PrimitiveNuttReference.ofNumber(reference.getType()
			                                                .getOperator("#")
			                                                .getValue()
			                                                .simpleCast(Procedure.class)
			                                                .proceed(List.of(reference))
			                                                .getValue()
			                                                .simpleCast(INumerable.class));
		if(op.OP_Not()!=null)
			return PrimitiveNuttReference.ofBoolean(!VisitorPool.conditionVisitor.visit(ctx.exp())
			                                                                     .getValue()
			                                                                     .simpleCast(Boolean.class)
			                                                                     .isTrue());
		throw new UnsupportedOperationException();
	}

	@Override
	public NuttReference visitInstance_of_exp(Instance_of_expContext ctx)
	{
		var ceilType=TypeInferencer.findTypeReference(visit(ctx.type_exp).getType());
		var isInstanceOf=TypeInferencer.verdict(ceilType,TypeInferencer.findTypeReference(visit(ctx.to_check).getType()));
		return PrimitiveNuttReference.ofBoolean(isInstanceOf);
	}

	@Override
	public NuttReference visitExplicit_atom(Explicit_atomContext ctx)
	{
		return visitAtom(ctx.atom());
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

	@Override public NuttReference visitArray_initializer_exp(Array_initializer_expContext ctx)
	{
		return VisitorPool.arrayVisitor.visitArray_initializer(ctx.array_initializer());
	}

	@Override public NuttReference visitExplicit_type(Explicit_typeContext ctx)
	{
		return typeInferenceVisitor.visitType_param(ctx.type_param());
	}

	@Override public NuttReference visitRange_array_initializer_exp(Range_array_initializer_expContext ctx)
	{
		Range_array_initializerContext arrayInitializer=ctx.range_array_initializer();
		var start=visit(arrayInitializer.start);
		var next=visit(arrayInitializer.next);
		var range=INumerable.sub((INumerable)next.getValue(),(INumerable)start.getValue());
		var boundRef=visit(arrayInitializer.bound);
		var iterator=start;
		var valuables=new ArrayList<NuttReference>();
		var isReverse=arrayInitializer.OP_Reverse()!=null;
		while(NuttInterpreter.applyOperator(iterator,boundRef,"<=").getValue().simpleCast(Boolean.class).isTrue())
		{
			valuables.add(isReverse?0:valuables.size(),iterator);
			iterator=NuttInterpreter.applyOperator(iterator,range.toAnonymousReference(),"+");
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
			members.add(new Row(key,val));
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
		var condition=VisitorPool.conditionVisitor.visit(ctx.cond)
		                                          .getValue()
		                                          .simpleCast(Boolean.class)
		                                          .isTrue();
		var exp=condition
		        ?ctx.if_true
		        :ctx.if_false;
		return visit(exp);
	}

	@Override
	public NuttReference visitInfix_exp(Infix_expContext ctx)
	{
		nuttLogger.appendLog(LogStamp.builder().action("Visit infix exp start").build());
		NuttReference left=visit(ctx.left), right=visit(ctx.right);
		var op=NuttEnvironment.toSourceCode(ctx.operator_infix());
		try
		{
			var ref=left.getCeilType()
			            .getOperator(op)
			            .getValue()
			            .simpleCast(Procedure.class)
			            .proceed(List.of(left,right));
			var log=LogStamp.builder().action("Visit infix exp end").message(left.getValue().toString()+op+right.getValue()).build();
			nuttLogger.appendLog(log);
			return ref;
		}
		catch(Exception e)
		{
			nuttLogger.appendLog(LogStamp.builder()
			                             .action("Visit infix exp with exception")
			                             .severity(ESeverity.Fatal)
			                             .status(EActionStatus.Failure)
			                             .message(e.toString())
			                             .build());
			throw new RuntimeException(e);
		}
		//			if(defaultOperator.operator_logical()!=null) return Nutt.Visitors.VisitorPool.conditionVisitor.visit(ctx);
		//			if(defaultOperator.operator_comparison()!=null) return Nutt.Visitors.VisitorPool.compareVisitor.visitInfix_exp(ctx);
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

	@Override
	public NuttReference visitMatch_to_exp(Match_to_expContext ctx)
	{
		return visitMatch_to(ctx.match_to());
	}

	@Override
	public NuttReference visitMatch_to(Match_toContext ctx)
	{
		var matched=visit(ctx.matched);
		NuttReference lastMatch=null;
		Predicate<Match_branchContext> branchSuits=b->b.explist()
		                                               .exp()
		                                               .stream()
		                                               .anyMatch
				                                               (
						                                               m->NuttInterpreter.applyOperator(matched,visit(m),"==")
						                                                                 .getValue()
						                                                                 .simpleCast(Boolean.class)
						                                                                 .isTrue()
				                                               );
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

	@Override public NuttReference visitArray_initializer(Array_initializerContext ctx)
	{
		return super.visitArray_initializer(ctx);
	}

	@Override
	public NuttReference visitMap_initializer(Map_initializerContext ctx)
	{
		java.util.Map<NuttReference,NuttReference> elements=new HashMap<>();
		Pair<Type,Type> keyVal=null;
		for(Map_elementContext e: ctx.map_element())
		{
			NuttReference key=visit(e.key), val=visit(e.val);
			if(keyVal==null) keyVal=new Pair<>(key.getType(),val.getType());
			if(elements.put(key,val)!=null)
			{
				throw new IllegalStateException("Duplicate key: "+NuttEnvironment.toSourceCode(e.key));
			}
		}
		return new Map(elements,keyVal).toAnonymousReference();
	}

	@Override public NuttReference visitAtom(AtomContext ctx)
	{
		nuttLogger.appendLog("Visiting atom start","");
		NuttReference reference;
		if(ctx.number()!=null) reference=visitNumber(ctx.number());
		else if(ctx.string()!=null) reference=visitString(ctx.string());
		else if(ctx.boolean_()!=null) reference=PrimitiveNuttReference.ofBoolean(ctx.boolean_().KW_True()!=null);
		else if(ctx.nil()!=null) reference=PrimitiveNuttReference.ofNil();
		else reference=null;
		if(reference==null)
		{
			nuttLogger.appendLog("Visiting atom finish","",EActionStatus.Failure,ESeverity.Fatal);
			throw new RuntimeException();
		}
		nuttLogger.appendLog("Visiting atom finish",reference.toString(),EActionStatus.Success,ESeverity.Info);
		return reference;
	}

	@Override
	public NuttReference visitNumber(NumberContext ctx)
	{
		nuttLogger.appendLog(LogStamp.builder().action("Visiting number start").status(EActionStatus.Pending).build());
		Function<java.lang.String,java.lang.String> removeUnderscores=s->s.contains("_")?s.replaceAll("_",""):s;
		var asString=removeUnderscores.apply(NuttEnvironment.toSourceCode(ctx.int_()!=null?ctx.int_():ctx.float_()));
		var numerable=ctx.int_()!=null
		              ?Nutt.Types.Functional.Numerable.Int.Int.fromString(asString)
		              :Nutt.Types.Functional.Numerable.Float.Float.fromString(asString);
		nuttLogger.appendLog(LogStamp.builder().action("Visiting number finish").status(EActionStatus.Success).build());
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
		return new ProcedureBuilder().setSignature(new Signature(parameters,outputPair.left().getHeader().getDisplayName()))
		                             .setFunctionBody(functionBody)
		                             .setOutput(outputPair.right())
		                             .createProcedure().toAnonymousReference();
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