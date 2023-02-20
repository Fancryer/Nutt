package Nutt.Types.Functional.Listable.Set;

import Nutt.Types.Functional.Listable.IListable;
import Nutt.Types.IValuable;

import java.util.HashSet;

public class Set implements IListable
{
	private final java.util.Set<IValuable> elements=new HashSet<>();

	@Override public String toString()
	{
		return "Set: %s"+getValue();
	}

	@Override public Object getValue()
	{
		return "SetValue...";
	}
	@Override public String getType()
	{
		return "Set";
	}

	@Override public String getWrapType()
	{
		return "Listable";
	}

	@Override public int getLength()
	{
		return elements.size();
	}

	@Override public boolean asBoolean()
	{
		return !elements.isEmpty();
	}
}
