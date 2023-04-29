package Nutt.Types.Functional.Actionable.Procedure;

import Nutt.NuttEnvironment;
import Nutt.Pair;
import Nutt.ParseHelpers.Partition;
import Nutt.ParseHelpers.Row;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Type.IType;
import gen.NuttParser;
import gen.NuttParser.Func_paramContext;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Signature
{
	private final List<Pair<String,Func_paramContext>> inputParameterList;
	private final Row outputRow;

	public Signature(List<NuttParser.Func_paramContext> paramContexts)
	{
		this(paramContexts,TypeInferencer.findType("Valuable"));
	}

	public Signature(List<Func_paramContext> paramContexts,String outputType)
	{
		this(paramContexts,TypeInferencer.findType(outputType));
	}

	public Signature(List<Func_paramContext> paramContexts,IType outputType)
	{
		inputParameterList=paramContexts
				.stream()
				.map(p->new Pair<>(p.func_param_header().NAME().getText(),p))
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

	public List<Pair<String,Func_paramContext>> getInputParameterList()
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
