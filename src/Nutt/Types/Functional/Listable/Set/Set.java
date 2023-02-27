package Nutt.Types.Functional.Listable.Set;

import Nutt.Types.Functional.Listable.IListable;
import Nutt.Types.IValuable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Set implements IListable
{
	private java.util.Set<IValuable> elements=new HashSet<>();

	public Set()
	{

	}

	public Set(Set other)
	{
		this(other.elements);
	}

	public Set(java.util.Set<IValuable> other)
	{
		this.elements=new HashSet<>(other);
	}

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

	@Override public IValuable add(IValuable value)
	{
		var ret=new HashSet<>(elements);
		ret.add(value);
		return new Set(ret);
	}

	@Override public IValuable getAt(int i)
	{
		return asList().get(i);
	}

	private List<IValuable> asList()
	{
		return new ArrayList<>(elements);
	}

	@Override public IValuable setAt(IValuable value,int i)
	{
		var list=asList();
		list.set(i,value);
		return new Set(new HashSet<>(list));
	}

	@Override public IValuable insertAt(IValuable value,int i)
	{
		var list=asList();
		list.add(i,value);
		return new Set(new HashSet<>(list));
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
