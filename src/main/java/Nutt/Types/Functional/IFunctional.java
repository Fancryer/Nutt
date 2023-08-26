package Nutt.Types.Functional;

import Nutt.Types.Functional.Type.Native.FunctionalType;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;

public interface IFunctional extends IValuable
{
	@Override
	default Type getType()
	{
		return FunctionalType.getInstance();
	}

	@Override IFunctional replicate();
}