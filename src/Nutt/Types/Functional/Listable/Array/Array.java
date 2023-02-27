package Nutt.Types.Functional.Listable.Array;

import Nutt.Types.Functional.Listable.IListable;
import Nutt.Types.IValuable;

import java.util.ArrayList;
import java.util.Objects;

public class Array implements IListable
{
	private ArrayList<IValuable> elements;
	private final String elementBoundType;

	public Array()
	{
		this("Either",new ArrayList<>());
	}

	public Array(String elementBoundType)
	{
		this(elementBoundType,new ArrayList<>());
	}

	public Array(String elementBoundType,ArrayList<IValuable> eithers)
	{
		this.elementBoundType=elementBoundType;
		setElements(eithers);
	}

	public void clear()
	{
		elements.clear();
	}

	@Override public IValuable add(IValuable value)
	{
		var ret=new ArrayList<>(elements);
		ret.add(value);
		return new Array(elementBoundType,ret);
	}

	public void remove(int index)
	{
		elements.remove(index);
	}

	public void setElements(ArrayList<IValuable> elements) throws ArrayStoreException
	{
		String type=elements==null||elements.isEmpty()?"Either":elements.get(0).getType();
		//System.out.println(type);
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
		return elements.stream().map(IValuable::getValue).toList();
	}

	@Override
	public String getType()
	{
		return "Array";
	}

	@Override public String getFullType()
	{
		return getType()+"|"+elementBoundType;
	}

	public String getElementType()
	{
		return elementBoundType;
	}

	@Override public IValuable getAt(int i)
	{
		return elements.get(i);
	}

	@Override public IValuable setAt(IValuable value,int i)
	{
		var ret=new ArrayList<>(elements);
		ret.set(i,value);
		return new Array(elementBoundType,ret);
	}

	@Override public IValuable insertAt(IValuable value,int i)
	{
		var ret=new ArrayList<>(elements);
		ret.add(i,value);
		return new Array(elementBoundType,ret);
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

	public ArrayList<IValuable> getElements()
	{
		return new ArrayList<>(elements);
	}
}