package Nutt.Types.Functional.Listable.Set;

import Nutt.NuttCommon;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.IListable;
import Nutt.Types.Functional.Numerable.Boolean;
import Nutt.Types.Functional.Numerable.Int.Int;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set implements IListable
{
	private final java.util.Set<IValuable> elements;
	Type elementType;

	public Set()
	{
		this(new HashSet<>());
	}

	public Set(java.util.Set<IValuable> other)
	{
		elements=new HashSet<>(other);
		elementType=elements.size()!=0?getElements().get(0)
		                                            .getType():TypeInferencer.findType("Nil");
	}

	public Set(Set other)
	{
		this(other.elements);
		elementType=other.elementType;
	}

	private List<IValuable> asList()
	{
		return new ArrayList<>(elements);
	}

	@Override
	public String toString()
	{
		return "{%s}".formatted(NuttCommon.removeFirstAndLastChars(elements.stream()
		                                                                   .map(IValuable::getValue)
		                                                                   .toList()
		                                                                   .toString()));
	}

	@Override
	public boolean canConsumeParameters(List<IValuable> iValuables)
	{
		return iValuables.size()<=1;
	}

	@Override
	public java.util.Set<IValuable> getValue()
	{
		return elements;
	}

	@Override
	public Type getType()
	{
		return TypeInferencer.findType("Set");
	}

	@Override
	public int getLength()
	{
		return elements.size();
	}

	@Override public Set replicate()
	{
		return new Set(elements);
	}

	@Override
	public IValuable add(IValuable value)
	{
		var ret=new HashSet<>(elements);
		ret.add(value);
		return new Set(ret);
	}

	@Override
	public IValuable getAt(IValuable index)
	{
		if(!(index instanceof Int intIndex)) throw new RuntimeException();
		return asList().get(intIndex.asLong()
		                            .intValue());
	}

	//	@Override
	//	public IValuable insertAt(IValuable value,int i)
	//	{
	//		var list=asList();
	//		list.add(i,value);
	//		return new Set(new HashSet<>(list));
	//	}

	@Override
	public IValuable setAt(IValuable value,IValuable index)
	{
		if(!(index instanceof Int intIndex)) throw new RuntimeException();
		var list=asList();
		list.set(intIndex.asLong()
		                 .intValue(),value);
		return new Set(new HashSet<>(list));
	}

	@Override
	public List<IValuable> getElements()
	{
		return asList();
	}

	@Override
	public IListable setElements(List<IValuable> elements)
	{
		return null;
	}

	@Override
	public Type getElementType()
	{
		return elementType;
	}

	@Override
	public Array asElementsArray()
	{
		return new Array(getElementType(),getElements());
	}

	@Override
	public Boolean asBoolean()
	{
		return new Boolean(!elements.isEmpty());
	}

	@Override
	public Iterator<IValuable> iterator()
	{
		return null;
	}

	@Override public IListable addAll(IValuable valuable)
	{
		return null;
	}

	@Override public boolean lessThan(IValuable value)
	{
		return TypeInferencer.verdict("Listable",value.getType())&&compare(value)<0;
	}

	private int compare(IValuable valuable)
	{
		return getLength()-valuable.getLength();
	}

	@Override public boolean greaterTo(IValuable value)
	{
		return TypeInferencer.verdict("Listable",value.getType())&&compare(value)>0;
	}

	@Override public boolean lessEqalTo(IValuable value)
	{
		return TypeInferencer.verdict("Listable",value.getType())&&compare(value)<=0;
	}

	@Override public boolean greaterEqualTo(IValuable value)
	{
		return TypeInferencer.verdict("Listable",value.getType())&&compare(value)>=0;
	}

	@Override public boolean similarTo(IValuable value)
	{
		return TypeInferencer.verdict("Listable",value.getType())&&compare(value)==0;
	}

	@Override public boolean notSimilarTo(IValuable value)
	{
		return TypeInferencer.verdict("Listable",value.getType())&&compare(value)!=0;
	}

	@Override public boolean equalTo(IValuable value)
	{
		return TypeInferencer.typesEquals(getType(),value.getType())&&similarTo(value);
	}

	@Override public boolean notEqualTo(IValuable value)
	{
		return TypeInferencer.typesEquals(getType(),value.getType())&&notSimilarTo(value);
	}
}
