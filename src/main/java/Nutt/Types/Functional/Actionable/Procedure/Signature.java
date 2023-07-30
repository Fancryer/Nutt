package Nutt.Types.Functional.Actionable.Procedure;

import Nutt.NuttEnvironment;
import Nutt.Pair;
import Nutt.ParseHelpers.CeiledValue;
import Nutt.ParseHelpers.Row;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Type.Type;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static gen.Nutt.Var_signature_listContext;
import static gen.Nutt.Vararg_or_signatureContext;

@Getter public class Signature
{
	private final List<Pair<String,Vararg_or_signatureContext>> inputParameterList;
	private final Row outputRow;

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
		this(paramContexts,TypeInferencer.findTypeReference(outputType).getType());
	}

	public Signature(List<Vararg_or_signatureContext> paramContexts,Type outputType)
	{
		inputParameterList=paramContexts
				.stream()
				.map(p->new Pair<>(p.var_signature().NAME().getText(),p))
				.toList();
		outputRow=new Row("yield",new CeiledValue(outputType.getType(),NuttEnvironment.constructReference(outputType).getValue()));
	}

	public Signature(List<Vararg_or_signatureContext> paramContexts)
	{
		this(paramContexts,TypeInferencer.findTypeReference("Valuable").getType());
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
		                                         .map(par->NuttEnvironment.toSourceCode(par.right()))
		                                         .collect(Collectors.joining(","));
		return "(%s):%s".formatted(parametersAsSource,outputRow.ceiledValue().ceilType().getDisplayName());
	}
}
