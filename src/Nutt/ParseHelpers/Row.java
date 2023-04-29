package Nutt.ParseHelpers;

import Nutt.Types.Functional.Listable.String.String;
import Nutt.Types.Functional.Type.IType;
import Nutt.Types.IValuable;

public record Row(java.lang.String name,Partition partition)
{
	public Row(String name,IType ceilType)
	{
		this(name.getValue(),ceilType);
	}

	public Row(String name,Partition partition)
	{
		this(name.getValue(),partition);
	}

	public Row(java.lang.String name,IType ceilType)
	{
		this(name,new Partition(ceilType));
	}

	public IType ceilType()
	{
		return partition().ceilType();
	}

	public IValuable value()
	{
		return partition().value();
	}
}
