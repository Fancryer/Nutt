package Nutt.Visitors;

import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.IValuable;
import gen.Nutt;

public class NuttConditionVisitor extends NuttGenericVisitor
{
	@Override
	public NuttReference visitDemand(Nutt.DemandContext ctx)
	{
		return visit(ctx.exp())
				.getValue()
				.asFunctional()
				.asNumerable()
				.asBoolean()
				.toAnonymousReference();
	}

	private boolean isTrue(IValuable valuable)
	{
		return valuable.asFunctional().asNumerable().asBoolean().isTrue();
	}
}