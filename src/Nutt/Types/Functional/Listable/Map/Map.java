package Nutt.Types.Functional.Listable.Map;

import Nutt.Types.Functional.Listable.IListable;
import Nutt.Types.IValuable;

import java.util.TreeMap;

public class Map implements IListable
{
	TreeMap<IValuable,IValuable> elements;

	@Override public String toString()
	{
		return "Map: %s"+getValue();
	}

	@Override public Object getValue()
	{
		return "...";
	}

	@Override public String getType()
	{
		return "Map";
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
		return elements.isEmpty();
	}
}