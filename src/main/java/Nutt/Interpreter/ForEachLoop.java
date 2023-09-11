package Nutt.Interpreter;

import Nutt.Exceptions.NuttBreakException;
import Nutt.Interpreter.References.NilReference;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Listable.IListable;
import Nutt.Types.Functional.Numerable.Int.Int;

import java.util.List;
import java.util.Objects;

import static Nutt.Visitors.VisitorPool.evalVisitor;
import static Nutt.Visitors.VisitorPool.statementVisitor;
import static gen.NuttParser.ExpContext;
import static gen.NuttParser.StatContext;

public final class ForEachLoop extends Loop
{
	private final String indexName, elementName;
	private final boolean isForward;

	public ForEachLoop(ExpContext expContext,StatContext statContext,String indexName,String elementName,boolean isForward)
	{
		super(condition,expContext,statContext);
		this.indexName=indexName;
		this.elementName=elementName;
		this.isForward=isForward;
	}

	@Override
	public NuttReference run()
	{
		var listable=evalVisitor.visit(expContext).getValueAs(IListable.class);
		var pairs=isForward?listable.pairs():listable.pairsReversed();
		List<NuttReference> references=isForward?listable.toArray().getElements():listable.getElementsReversed();
		NuttReference lastReference=NilReference.getInstance();
		int i=0;
		boolean useIndex=!Objects.equals(indexName,"_"), useElement=!Objects.equals(elementName,"_");
		for(var element: listable)
		{
			if(useIndex)
			{
				NuttInterpreter.currentScope.setReference(indexName,new Int(i++));
				System.out.println(NuttInterpreter.getReference(indexName).getValue());
			}
			lastReference=NuttInterpreter.currentScope.setReference(variableName,element.getValue());
			try
			{
				statementVisitor.visit(statContext);
			}
			catch(NuttBreakException e)
			{
				break;
			}
		}
		return lastReference;
	}
}
