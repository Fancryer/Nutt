package Nutt.ParseHelpers;

import Nutt.NuttEnvironment;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;

public record Partition(Type ceilType,IValuable value)
{
	public Partition(Type ceilType)
	{
		this(ceilType,NuttEnvironment.constructValuable(ceilType));
	}
}
