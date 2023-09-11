package Nutt.Visitors;

import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Numerable.Boolean;

import static gen.NuttParser.DemandContext;

public class NuttConditionVisitor extends NuttGenericVisitor
{
	@Override
	public NuttReference visitDemand(DemandContext ctx)
	{
		return visit(ctx.exp())
				.getValue()
				.simpleCast(Boolean.class)
				.toAnonymousReference();
	}
}