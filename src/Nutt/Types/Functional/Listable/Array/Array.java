package Nutt.Types.Functional.Listable.Array;

import Nutt.Types.Functional.Listable.IListable;
import Nutt.Types.IValuable;

import java.util.ArrayList;
import java.util.Objects;

public class Array implements IListable
{
	private ArrayList<IValuable> elements;

	public Array()
	{
		this(null);
	}

	public Array(ArrayList<IValuable> eithers)
	{
		setElements(eithers);
	}

	public void clear()
	{
		elements.clear();
	}

	public void add(IValuable either)
	{
		elements.add(either);
	}

	public void remove(int index)
	{
		elements.remove(index);
	}

	public void setElements(ArrayList<IValuable> elements) throws ArrayStoreException
	{
		String type=elements==null||elements.isEmpty()?"Either":elements.get(0).getType();
		System.out.println(type);
		this.elements=new ArrayList<>(Objects.requireNonNullElse(elements,new ArrayList<>()));
	}

	@Override
	public String toString()
	{
		return "Array|%s".formatted(getElementType());
	}

	@Override
	public Object getValue()
	{
		return elements;
	}

	@Override
	public String getType()
	{
		return "Array";
	}

	private String getElementType()
	{
		return elements==null||elements.isEmpty()?"Either":elements.get(0).toString();
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