package Nutt.Types.Functional.Actionable.Procedure;

import Nutt.NuttEnvironment;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static gen.Nutt.Var_signature_listContext;
import static gen.Nutt.Vararg_or_signatureContext;

@Getter public class Signature
{
	/**
	 Contains array of name-value pairs
	 */
	private final List<String[]> inputParameterList;
	private final String[] outputRow;

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
		inputParameterList=paramContexts
				.stream()
				.map(p->new java.lang.String[]{p.var_signature().NAME().getText(),NuttEnvironment.toSourceCode(p)})
				.toList();
		outputRow=new java.lang.String[]{"yield",outputType};
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
		                                         .map(par->par[1])
		                                         .collect(Collectors.joining(","));
		return "(%s):%s".formatted(parametersAsSource,outputRow[1]);
	}
}
