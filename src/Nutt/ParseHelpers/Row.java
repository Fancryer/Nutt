package Nutt.ParseHelpers;

import Nutt.Types.Functional.Listable.String.String;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;

public record Row(java.lang.String name,Partition partition)
{
	public Row(String name,Type ceilType)
	{
		this(name.getValue(),ceilType);
	}

	public Row(String name,Partition partition)
	{
		this(name.getValue(),partition);
	}

	public Row(java.lang.String name,Type ceilType)
	{
		this(name,new Partition(ceilType));
	}

	public Type ceilType()
	{
		return partition().ceilType();
	}

	public IValuable value()
	{
		return partition().value();
	}
}
