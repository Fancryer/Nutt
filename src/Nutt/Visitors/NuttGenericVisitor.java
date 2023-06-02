package Nutt.Visitors;

import Nutt.Types.IValuable;
import gen.Nutt;
import gen.NuttBaseVisitor;

public class NuttGenericVisitor<T extends IValuable> extends NuttBaseVisitor<IValuable>
{
	public NuttGenericVisitor(){}

	@Override public IValuable visitSpread_exp(Nutt.Spread_expContext ctx)
	{
		return super.visitSpread_exp(ctx);
	}
}