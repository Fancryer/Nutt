package Nutt.Types.Functional.Listable.Set;

import Nutt.Interpreter.References.NuttReference;
import Nutt.NuttCommon;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.IListable;
import Nutt.Types.Functional.Numerable.Int.Int;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set implements IListable
{
	private final java.util.Set<NuttReference> elements;
	Type elementType;

	public Set()
	{
		this(new HashSet<>());
	}

	public Set(java.util.Set<NuttReference> other)
	{
		elements=new HashSet<>(other);
		elementType=!elements.isEmpty()
		            ?getElements().get(0).getType()
		            :TypeInferencer.findTypeReference("Nil").getType();
	}

	public Set(Set other)
	{
		this(other.elements);
		elementType=other.elementType;
	}

	@Override
	public String toString()
	{
		return "{%s}".formatted(NuttCommon.removeFirstAndLastChars(elements.stream()
		                                                                   .map(NuttReference::getValue)
		                                                                   .map(IValuable::getValue)
		                                                                   .toList()
		                                                                   .toString()));
	}

	@Override public Set replicate()
	{
		return new Set(elements);
	}

	@Override public boolean lessThan(IValuable value)
	{
		return TypeInferencer.verdict("Listable",value.getType())&&compare(value)<0;
	}

	private int compare(IValuable valuable)
	{
		return getLength()-valuable.getLength();
	}

	@Override
	public int getLength()
	{
		return elements.size();
	}

	@Override public boolean greaterTo(IValuable value)
	{
		return TypeInferencer.verdict("Listable",value.getType())&&compare(value)>0;
	}	public Set add(NuttReference reference)
	{
		var ret=new HashSet<>(elements);
		ret.add(reference);
		return new Set(ret);
	}

	@Override public boolean lessEqualTo(IValuable value)
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

	@Override
	public Type getType()
	{
		return TypeInferencer.findTypeReference("Set").getType();
	}	@Override
	public NuttReference getAt(NuttReference index)
	{
		if(!(index.getValue() instanceof Int intIndex)) throw new RuntimeException();
		return asList().get(intIndex.asLong().intValue());
	}

	@Override
	public java.util.Set<NuttReference> getValue()
	{
		return elements;
	}

	@Override public boolean notEqualTo(IValuable value)
	{
		return TypeInferencer.typesEquals(getType(),value.getType())&&notSimilarTo(value);
	}

	@Override
	public Array spread()
	{
		return new Array(getElementType(),getElements());
	}

	@Override public boolean isTrue()
	{
		return !elements.isEmpty();
	}



	@Override
	public List<NuttReference> getElements()
	{
		return asList();
	}



	private List<NuttReference> asList()
	{
		return new ArrayList<>(elements);
	}

	@Override
	public Type getElementType()
	{
		return elementType;
	}

	@Override
	public Iterator<NuttReference> iterator()
	{
		return elements.iterator();
	}

	//	@Override
	//	public IValuable insertAt(IValuable value,int i)
	//	{
	//		var list=asList();
	//		list.add(i,value);
	//		return new Set(new HashSet<>(list));
	//	}

	@Override
	public Set setAt(NuttReference value,NuttReference index)
	{
		if(!(index.getValue() instanceof Int intIndex)) throw new RuntimeException();
		var list=asList();
		list.set(intIndex.asLong()
		                 .intValue(),value);
		return new Set(new HashSet<>(list));
	}

	@Override
	public IListable setElements(List<NuttReference> elements)
	{
		return this;
	}

	@Override public IListable addAll(IListable listable)
	{
		listable.forEach(this::add);
		return this;
	}
}
