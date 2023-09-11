package Nutt.Types.Functional.Actionable.Procedure;

import Nutt.NuttEnvironment;
import Nutt.Runtime.Parameter;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static gen.NuttParser.Var_signature_listContext;
import static gen.NuttParser.Vararg_or_signatureContext;

@Getter public class Signature
{
	/**
	 Contains array of name-value pairs
	 */
	private final List<Parameter> inputParameterList;
	private final Parameter outputParameter;

	public Signature(String signaturesAsString)
	{
		this(signaturesAsString,"Nil");
	}

	public Signature(String signaturesAsString,String outputType)
	{
		this(NuttEnvironment.getTempParser(signaturesAsString).var_signature_list(),outputType);
	}

	public Signature(Var_signature_listContext paramContext,String outputType)
	{
		this(paramContext.vararg_or_signature(),outputType);
	}

	public Signature(List<Vararg_or_signatureContext> paramContexts,String outputType)
	{
		this
				(
						paramContexts.stream()
						             .map
								             (
										             vas->new Parameter
												             (
														             vas.var_signature().NAME().getText(),
														             vas.var_signature().type!=null
														             ?NuttEnvironment.toSourceCode(vas.var_signature().type.type_param())
														             :"",
														             vas.var_signature().value!=null
														             ?NuttEnvironment.toSourceCode(vas.var_signature().value)
														             :"",
														             vas.OP_Pass()!=null
												             )
								             )
						             .toList(),
						new Parameter("return",outputType,"",false)
				);
	}

	public Signature(List<Parameter> inputParameterList,Parameter outputParameter)
	{
		this.inputParameterList=inputParameterList;
		this.outputParameter=outputParameter;
	}

	public Signature()
	{
		this(new ArrayList<>(),"Nil");
	}

	public int getSize()
	{
		return inputParameterList.size();
	}

	@Override
	public String toString()
	{
		var parametersAsSource=inputParameterList.stream()
		                                         .map(Parameter::toString)
		                                         .collect(Collectors.joining(","));
		return "(%s):%s".formatted(parametersAsSource,outputParameter.type());
	}
}
