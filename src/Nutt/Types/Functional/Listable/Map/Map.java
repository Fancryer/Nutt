package Nutt.Types.Functional.Listable.Map;

import Nutt.Types.Functional.Listable.IListable;
import Nutt.Types.Functional.Numerable.Int.Int;
import Nutt.Types.IValuable;

import java.util.ArrayList;
import java.util.List;
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

	@Override public IValuable add(IValuable value)
	{
		return null;
	}

	@Override public IValuable getAt(int i)
	{
		return elements.get(new Int(i));
	}

	@Override public IValuable setAt(IValuable value,int i)
	{
		return null;
	}

	@Override public IValuable insertAt(IValuable value,int i)
	{
		return null;
	}
	
	@Override
	public List<IValuable> getElements()
	{
		return asList();
	}
	
	private List<IValuable> asList()
	{
		return new ArrayList<>(elements.values());
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