package Nutt.ParseHelpers;

import Nutt.NuttEnvironment;
import Nutt.Types.Functional.Type.IType;
import Nutt.Types.IValuable;

public record Partition(IType ceilType,IValuable value)
{
	public Partition(IType ceilType)
	{
		this(ceilType,NuttEnvironment.constructValuable(ceilType));
	}
}
