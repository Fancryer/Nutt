package Nutt.Types.Functional.Actionable.Procedure;

import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Interpreter.NuttInterpreter;
import Nutt.Interpreter.References.NilReference;
import Nutt.Interpreter.References.NuttReference;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Actionable.IActionable;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.String.String;
import Nutt.Types.Functional.Type.Native.ValuableType;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;
import Nutt.Visitors.VisitorPool;
import gen.Nutt;
import gen.Nutt.BlockContext;
import lombok.Getter;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static Nutt.NuttEnvironment.getTempParser;
import static Nutt.NuttEnvironment.toSourceCode;

@Getter
public class Procedure implements IActionable
{
	protected final java.lang.String name;
	protected final Signature signature;
	private final BlockContext functionBody;
	private final NuttReference output;

	public Procedure(Signature signature,BlockContext functionBody)
	{
		this("lambda%s".formatted(signature),signature,functionBody,TypeInferencer.findTypeReference("Nil"));
	}

	public Procedure(java.lang.String name,Signature signature,BlockContext functionBody,NuttReference output)
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

	@Override
	public java.lang.String toString()
	{
		return "funct %s=%s return".formatted(signature,toSourceCode(functionBody));
	}

	public NuttReference proceed() throws NuttSuccessReturnException
	{
		return proceed(new ArrayList<>());
	}

	public NuttReference proceed(List<NuttReference> argumentList) throws NuttSuccessReturnException
	{
		if(argumentList.size()>signature.getSize()) throw new RuntimeException("Parameter length is too large!");
		return NuttInterpreter.executeBlockAsScope(
				()->
				{
					declareYield();
					declareParameters();
					var parameterNames=signature.getInputParameterList()
					                            .stream()
					                            .map(p->p[0])
					                            .toList();
					IntStream.range(0,argumentList.size())
					         .forEach(i->NuttInterpreter.currentScope.setReference(parameterNames.get(i),
					                                                               argumentList.get(i).getValue()));
					var ret=VisitorPool.statementVisitor.tryYield(functionBody,output.getType());
					forgetParameters();
					return ret;
				}
		                                          );
	}

	private void declareYield()
	{
		NuttInterpreter.currentScope.addReference("yield",output);
	}

	private void declareParameters()
	{
		var declarator=VisitorPool.declarationVisitor;
		signature.getInputParameterList()
		         .stream()
		         .map(Procedure::functParamToVarDecl)
		         .forEach(declarator::visitVar_decl);
	}

	private static Nutt.Var_declContext functParamToVarDecl(java.lang.String[] decl)
	{
		return getTempParser("var %s".formatted(decl[1])).var_decl();
	}

	private void forgetParameters()
	{
		var toForget=signature.getInputParameterList()
		                      .stream()
		                      .map(Procedure::functParamToVarDecl)
		                      .map(Nutt.Var_declContext::var_signature_list)
		                      .map(Nutt.Var_signature_listContext::vararg_or_signature)
		                      .map(vos->vos.get(0))
		                      .map(Nutt.Vararg_or_signatureContext::var_signature)
		                      .map(Nutt.Var_signatureContext::NAME)
		                      .map(ParseTree::getText)
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
		return TypeInferencer.findTypeReference("Procedure").getType();
	}

	@Override
	public Procedure getValue()
	{
		return this;
	}

	@Override
	public NuttReference getProperty(java.lang.String name)
	{
		return switch(name)
		{
			case "args" -> new Array
					(
							ValuableType.getInstance(),
							signature.getInputParameterList()
							         .stream()
							         .map(p->p[0])
							         .map(String::new)
							         .map(IValuable::toAnonymousReference)
							         .collect(Collectors.toList())
					).toAnonymousReference();
			default -> NilReference.getInstance();
		};
	}

	@Override public Procedure replicate()
	{
		return new Procedure(this);
	}

	//TODO
	@Override public Array spread()
	{
		return spread();
	}
}
