package Nutt.Types.Functional.Actionable.Procedure;

import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.NuttEnvironment;
import Nutt.NuttInterpreter;
import Nutt.Pair;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Actionable.IActionable;
import Nutt.Types.Functional.Numerable.Boolean;
import Nutt.Types.Functional.Type.IType;
import Nutt.Types.IValuable;
import Nutt.Types.Nil;
import Nutt.Visitors.NuttDeclarationVisitor;
import Nutt.Visitors.NuttStatementVisitor;
import gen.NuttParser;
import gen.NuttParser.BlockContext;

import java.util.List;
import java.util.stream.IntStream;

import static Nutt.NuttEnvironment.getTempParser;
import static Nutt.NuttEnvironment.toSourceCode;

public class Procedure implements IActionable
{
	public static int lambdaCount;
	private final String name;
	private final BlockContext functionBody;
	private final Signature signature;
	private final IValuable output;

	public Procedure()
	{
		this(
				"\\"+lambdaCount++,
				new Signature(),
				NuttEnvironment.getTempParser("yield nil").block(),
				new Nil());
	}

	public Procedure(Signature signature,BlockContext functionBody)
	{
		this("lambda%s".formatted(signature),signature,functionBody,TypeInferencer.findType("Nil"));
	}

	public Procedure(String name,Signature signature,BlockContext functionBody,IValuable output)
	{
		this.name=name;
		this.signature=signature;
		this.functionBody=functionBody;
		this.output=output;
	}

	public Procedure(Procedure procedure)
	{
		this(procedure.name,procedure.signature,procedure.functionBody,procedure.output);
	}

	private static NuttParser.Var_declContext functParamToVarDecl(Pair<String,NuttParser.Func_paramContext> decl)
	{
		return getTempParser("var %s".formatted(toSourceCode(decl.right()))).var_decl();
	}

	@Override
	public String toString()
	{
		return "funct %s = %s return".formatted(signature,toSourceCode(functionBody));
	}

	public IValuable proceed(List<IValuable> argumentList) throws NuttSuccessReturnException
	{
		if(argumentList.size()>signature.getSize()) throw new RuntimeException("Parameter length is too large!");
		declareYield();
		declareParameters();
		return NuttInterpreter.executeBlockAsScope(
				()->
				{
					var parameterNames=signature.getInputParameterList().stream().map(Pair::left).toList();
					IntStream.range(0,argumentList.size())
					         .forEach(i->NuttInterpreter.currentScope.setVariable(parameterNames.get(i),
					                                                              argumentList.get(i)));
					return new NuttStatementVisitor().tryYield(functionBody,output.getType());
				}
		                                          );
	}

	private void declareYield()
	{
		NuttInterpreter.currentScope.addVariable("yield",output,output.getType());
	}

	private void declareParameters()
	{
		var declarator=new NuttDeclarationVisitor();
		signature.getInputParameterList()
		         .stream()
		         .map(Procedure::functParamToVarDecl)
		         .forEach(declarator::visitVar_decl);
	}

	//	public NuttSuccessReturnException yield()
	//	{
	//		var yieldValue=NuttInterpreter.currentScope.forgetLocally("yield");
	//		assert TypeInferencer.verdict(output.getType(),yieldValue.valuable.getType());
	//		return new NuttSuccessReturnException(yieldValue.valuable);
	//	}

	@Override
	public boolean canConsumeParameters(List<IValuable> iValuables)
	{
		return true;
	}

	@Override
	public IValuable getValue()
	{
		return new Nil();
	}

	@Override
	public IType getType()
	{
		return TypeInferencer.findType("Procedure");
	}

	@Override
	public int getLength()
	{
		return signature.getSize();
	}

	@Override public Procedure replicate()
	{
		return new Procedure(this);
	}

	@Override
	public Boolean asBoolean()
	{
		return new Boolean();
	}

	@Override public boolean lessThan(IValuable value)
	{
		return TypeInferencer.verdict("Procedure",value.getType())&&compareLength(value)<0;
	}

	private int compareLength(IValuable valuable)
	{
		return valuable.getLength()-getLength();
	}

	@Override public boolean greaterTo(IValuable value)
	{
		return TypeInferencer.verdict("Procedure",value.getType())&&compareLength(value)>0;
	}

	@Override public boolean lessEqalTo(IValuable value)
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
}
