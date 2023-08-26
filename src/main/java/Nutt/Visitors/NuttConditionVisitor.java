package Nutt.Visitors;

import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Numerable.Boolean;
import gen.Nutt;

public class NuttConditionVisitor extends NuttGenericVisitor
{
	@Override
	public NuttReference visitDemand(Nutt.DemandContext ctx)
	{
		return visit(ctx.exp())
				.getValue()
				.simpleCast(Boolean.class)
				.toAnonymousReference();
	}
}