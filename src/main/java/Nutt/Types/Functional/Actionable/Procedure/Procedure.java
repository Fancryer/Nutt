package Nutt.Types.Functional.Actionable.Procedure;

import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Interpreter.NuttInterpreter;
import Nutt.Interpreter.References.NilReference;
import Nutt.Interpreter.References.NuttReference;
import Nutt.NuttEnvironment;
import Nutt.ParseHelpers.Row;
import Nutt.Runtime.Parameter;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Actionable.IActionable;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.String.String;
import Nutt.Types.Functional.Type.Native.ProcedureType;
import Nutt.Types.Functional.Type.Native.ValuableType;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;
import Nutt.Visitors.VisitorPool;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static Nutt.NuttEnvironment.getTempParser;
import static Nutt.NuttEnvironment.toSourceCode;
import static Nutt.Visitors.VisitorPool.evalVisitor;
import static gen.NuttParser.BlockContext;
import static gen.NuttParser.Var_declContext;

@Getter
public class Procedure implements IActionable
{
	protected final java.lang.String name;
	protected final Signature signature;
	private final BlockContext functionBody;

	public Procedure(Signature signature,BlockContext functionBody)
	{
		this("lambda%s".formatted(signature),signature,functionBody);//,TypeInferencer.findTypeReference("Nil"));
	}

	public Procedure(java.lang.String name,Signature signature,BlockContext functionBody)//,NuttReference output)
	{
		this.name=name;
		this.signature=signature;
		this.functionBody=functionBody;
		//this.output=output;
	}

	public Procedure(Procedure procedure)
	{
		this(procedure.name,procedure.signature,procedure.functionBody);//,procedure.output);
	}

	@Override
	public java.lang.String toString()
	{
		return "funct %s%s=%s end".formatted(name,signature,toSourceCode(functionBody));
	}

	public NuttReference proceed() throws NuttSuccessReturnException
	{
		return proceed(new ArrayList<>());
	}

	public NuttReference proceed(List<NuttReference> argumentList) throws NuttSuccessReturnException
	{
		if(argumentList.size()>signature.getSize()) throw new RuntimeException("Parameter length of "+name+" is too large!");
		return NuttInterpreter.executeBlockAsScope(
				()->
				{
					System.out.println("declaring parameters");
					declareParameters();
					var parameterNames=signature.getInputParameterList()
					                            .stream()
					                            .map(Parameter::name)
					                            .toList();
					//System.out.println("parameterNames = "+parameterNames);
					IntStream.range(0,argumentList.size())
					         .forEach(i->NuttInterpreter.currentScope.setReference(parameterNames.get(i),argumentList.get(i).getValue()));
					//System.out.println("ret = "+ret);
					//forgetParameters();
					return VisitorPool.statementVisitor.tryReturn(functionBody,
					                                              TypeInferencer.findTypeReference(signature.getOutputParameter().type())
					                                                            .getValueAs(Type.class));
				});
	}

	private void declareParameters()
	{
		//System.out.println("declareParameters of "+name);
		var declarator=VisitorPool.declarationVisitor;
		for(var parameter: signature.getInputParameterList())
		{
			var varDeclContext=functParamToVarDecl(parameter);
			//System.out.println("varDeclContext = "+NuttEnvironment.toSourceCode(varDeclContext));
			declarator.visitVar_decl(varDeclContext);
		}
	}

	private static Var_declContext functParamToVarDecl(Parameter parameter)
	{
		return getTempParser("var %s".formatted(parameter.toFunctParameter())).var_decl();
	}

	private void forgetParameters()
	{
		var toForget=signature.getInputParameterList()
		                      .stream()
		                      .map(Parameter::name)
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
		return ProcedureType.getInstance();
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
							         .map
									         (
											         p->new Row
													         (
															         p.name(),
															         p.type(),
															         evalVisitor.visit(NuttEnvironment.getTempParser(p.exp()).exp())
													         )
									         )
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
	@Override public Array toArray()
	{
		return toArray();
	}
}
