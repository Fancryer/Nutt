package Nutt.Types.Functional.Actionable.Procedure;

import Nutt.NuttEnvironment;
import Nutt.Pair;
import Nutt.ParseHelpers.Partition;
import Nutt.ParseHelpers.Row;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Type.Type;
import gen.Nutt.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Signature
{
	private final List<Pair<String,Var_signatureContext>> inputParameterList;
	private final Row outputRow;

	public Signature(Var_signatureContext paramContext)
	{
		this(List.of(paramContext));
	}

	public Signature(String paramAsString)
	{
		this(NuttEnvironment.getTempParser(paramAsString).var_signature());
	}

	public Signature(List<Var_signatureContext> paramContexts)
	{
		this(paramContexts,TypeInferencer.findType("Valuable"));
	}

	public Signature(List<Var_signatureContext> paramContexts,String outputType)
	{
		this(paramContexts,TypeInferencer.findType(outputType));
	}

	public Signature(List<Var_signatureContext> paramContexts,Type outputType)
	{
		inputParameterList=paramContexts
				.stream()
				.map(p->new Pair<>(p.NAME().getText(),p))
				.toList();
		outputRow=new Row("yield",new Partition(outputType.getType(),NuttEnvironment.constructValuable(outputType)));
	}

	public Signature()
	{
		this(new ArrayList<>(),"Nil");
	}

	public int getSize()
	{
		return inputParameterList.size();
	}

	public List<Pair<String,Var_signatureContext>> getInputParameterList()
	{
		return inputParameterList;
	}

	@Override
	public String toString()
	{
		var parametersAsSource=inputParameterList.stream()
		                                         .map(par->NuttEnvironment.toSourceCode(par.right()))
		                                         .collect(Collectors.joining(","));
		return "(%s):%s".formatted(parametersAsSource,outputRow.partition().ceilType().getDisplayName());
	}
}
