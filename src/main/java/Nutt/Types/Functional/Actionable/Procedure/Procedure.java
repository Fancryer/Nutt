package Nutt.Types.Functional.Actionable.Procedure;

import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Interpreter.NuttInterpreter;
import Nutt.Pair;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Actionable.IActionable;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;
import Nutt.Types.Nil;
import Nutt.Visitors.VisitorsPool;
import gen.Nutt;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

import static Nutt.NuttEnvironment.getTempParser;
import static Nutt.NuttEnvironment.toSourceCode;

public class Procedure implements IActionable
{
	public static int lambdaCount;
	protected final String name;
	protected final Signature signature;
	private final Nutt.BlockContext functionBody;
	private final Nutt.Interpreter.NuttReference output;

	public Procedure()
	{
		this(
				String.valueOf(Objects.hashCode(lambdaCount++)),
				new Signature(),
				getTempParser("yield nil").block(),
				new Nil());
	}

	public Procedure(String name,Signature signature,Nutt.BlockContext functionBody,IValuable output)
	{
		this.name=name;
		this.signature=signature;
		this.functionBody=functionBody;
		this.output=output;
	}

	public Procedure(Signature signature,Nutt.BlockContext functionBody)
	{
		this("lambda%s".formatted(signature),signature,functionBody,TypeInferencer.findTypeReference("Nil"));
	}

	public Procedure(Procedure procedure)
	{
		this(procedure.name,procedure.signature,procedure.functionBody,procedure.output);
	}

	@Override
	public String toString()
	{
		return "funct %s = %s return".formatted(signature,toSourceCode(functionBody));
	}

	public IValuable proceed() throws NuttSuccessReturnException
	{
		return proceed(new ArrayList<>());
	}

	public IValuable proceed(List<Nutt.Interpreter.NuttReference> argumentList) throws NuttSuccessReturnException
	{
		if(argumentList.size()>signature.getSize()) throw new RuntimeException("Parameter length is too large!");
		return NuttInterpreter.executeBlockAsScope(
				()->
				{
					declareYield();
					declareParameters();
					var parameterNames=signature.getInputParameterList().stream().map(Pair::left).toList();
					IntStream.range(0,argumentList.size())
					         .forEach(i->NuttInterpreter.currentScope.setVariable(parameterNames.get(i),
					                                                              argumentList.get(i)));
					var ret=VisitorsPool.statementVisitor.tryYield(functionBody,output.getType());
					forgetParameters();
					return ret;
				}
		                                          );
	}

	private void declareYield()
	{
		NuttInterpreter.currentScope.addVariable("yield",output,output.getType());
	}

	private void declareParameters()
	{
		var declarator=VisitorsPool.declarationVisitor;
		signature.getInputParameterList()
		         .stream()
		         .map(Procedure::functParamToVarDecl)
		         .forEach(declarator::visitVar_decl);
	}

	private static Nutt.Var_declContext functParamToVarDecl(Pair<String,Nutt.Vararg_or_signatureContext> decl)
	{
		return getTempParser("var %s".formatted(toSourceCode(decl.right()))).var_decl();
	}

	private void forgetParameters()
	{
		var toForget=signature.getInputParameterList()
		                      .stream()
		                      .map(decl->functParamToVarDecl(decl).var_signature_list()
		                                                          .vararg_or_signature(0)
		                                                          .var_signature()
		                                                          .NAME()
		                                                          .getText())
		                      .toList();
		NuttInterpreter.forgetList(toForget);
	}

	//	public NuttSuccessReturnException yield()
	//	{
	//		var yieldValue=NuttInterpreter.currentScope.forgetLocally("yield");
	//		assert TypeInferencer.verdict(output.getType(),yieldValue.valuable.getType());
	//		return new NuttSuccessReturnException(yieldValue.valuable);
	//	}

	@Override
	public Type getType()
	{
		return TypeInferencer.findTypeReference("Procedure");
	}

	@Override
	public IValuable getValue()
	{
		return this;
	}

	@Override public Procedure replicate()
	{
		return new Procedure(this);
	}

	@Override public boolean lessThan(IValuable value)
	{
		return TypeInferencer.verdict("Procedure",value.getType())&&compareLength(value)<0;
	}

	private int compareLength(IValuable valuable)
	{
		return valuable.getLength()-getLength();
	}

	@Override
	public int getLength()
	{
		return signature.getSize();
	}

	@Override public boolean greaterTo(IValuable value)
	{
		return TypeInferencer.verdict("Procedure",value.getType())&&compareLength(value)>0;
	}

	@Override public boolean lessEqualTo(IValuable value)
	{
		return TypeInferencer.verdict("Procedure",value.getType())&&compareLength(value)<=0;
	}

	@Override public boolean greaterEqualTo(IValuable value)
	{
		return TypeInferencer.verdict("Procedure",value.getType())&&compareLength(value)>=0;
	}

	@Override public boolean similarTo(IValuable value)
	{
		return TypeInferencer.verdict("Procedure",value.getType())&&compareLength(value)==0;
	}

	@Override public boolean notSimilarTo(IValuable value)
	{
		return TypeInferencer.verdict("Procedure",value.getType())&&compareLength(value)!=0;
	}

	@Override public boolean equalTo(IValuable value)
	{
		return TypeInferencer.verdict("Procedure",value.getType())
		       &&equals(value.asFunctional().asActionable().asProcedure());
	}

	@Override public boolean notEqualTo(IValuable value)
	{
		return TypeInferencer.verdict("Procedure",value.getType())
		       &&!equals(value.asFunctional().asActionable().asProcedure());
	}

	public String getName()
	{
		return name;
	}

	@Override public boolean isTrue()
	{
		return true;
	}

	//TODO
	@Override public Array spread()
	{
		return asElementsArray();
	}
}
