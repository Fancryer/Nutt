package Nutt.Types.Functional.Listable.Array;

import Nutt.NuttCommon;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Listable.IListable;
import Nutt.Types.Functional.Numerable.Boolean;
import Nutt.Types.Functional.Numerable.Int.Int;
import Nutt.Types.Functional.Type.CustomType;
import Nutt.Types.Functional.Type.IType;
import Nutt.Types.IValuable;

import java.util.*;
import java.util.function.Consumer;

public class Array implements IListable
{
	private final IType elementBoundType;
	private final List<IValuable> elements;

	public Array()
	{
		this("Valuable",new ArrayList<>());
	}

	public Array(String elementBoundType,List<IValuable> valuables)
	{
		this.elementBoundType=new CustomType(elementBoundType);
		elements=valuables;
	}

	public Array(String elementBoundType)
	{
		this(elementBoundType,new ArrayList<>());
	}

	public Array(IType elementBoundType)
	{
		this(elementBoundType,new ArrayList<>());
	}

	public Array(IType elementBoundType,List<IValuable> valuables)
	{
		this.elementBoundType=elementBoundType;
		elements=valuables;
	}

	public Array(List<IValuable> valuables)
	{
		this(TypeInferencer.getCommonWrapperType(valuables
				                                         .stream()
				                                         .map(IValuable::getType)
				                                         .toList()),valuables);
	}

	public void clear()
	{
		elements.clear();
	}

	@Override
	public IValuable add(IValuable value)
	{
		var ret=new ArrayList<>(elements);
		ret.add(value);
		return new Array(elementBoundType,ret);
	}

	@Override
	public IValuable getAt(IValuable index)
	{
		if(!(index instanceof Int intIndex)) throw new RuntimeException();
		return elements.get(intIndex
				                    .asLong()
				                    .intValue());
	}

	@Override
	public IValuable setAt(IValuable value,IValuable index)
	{
		if(!(index instanceof Int intIndex)) throw new RuntimeException();
		var ret=new ArrayList<>(elements);
		ret.set(intIndex
				        .asLong()
				        .intValue(),value);
		return new Array(elementBoundType,ret);
	}

	@Override
	public List<IValuable> getElements()
	{
		return new ArrayList<>(elements);
	}

	@Override
	public IListable setElements(List<IValuable> elements)
	{
		String type=elements==null||elements.isEmpty()
		            ?"Valuable"
		            :elements
				            .get(0)
				            .getType()
				            .getDisplayName();
		//System.out.println(type);
		return new Array(type,Objects.requireNonNullElse(elements,new ArrayList<>()));
	}

	@Override
	public IType getElementType()
	{
		return elementBoundType;
	}

	@Override
	public Array asElementsArray()
	{
		var arr=new Array();
		arr.elements.addAll(elements);
		return arr;
	}

	//	@Override
	//	public IValuable insertAt(IValuable value,IValuable index)
	//	{
	//		if(!(index instanceof Int intIndex)) throw new RuntimeException();
	//		var ret=new ArrayList<>(elements);
	//		ret.add(intIndex.asLong().intValue(),value);
	//		return new Array(elementBoundType,ret);
	//	}

	public void remove(int index)
	{
		elements.remove(index);
	}

	@Override
	public String toString()
	{
		return "{%s}".formatted(
				NuttCommon.removeLastChar(
						NuttCommon.removeFirstChar(elements
								                           .stream()
								                           .map(IValuable::getValue)
								                           .toList()
								                           .toString())));
	}

	@Override
	public boolean canConsumeParameters(List<IValuable> iValuables)
	{
		return iValuables.size()<=1;
	}

	@Override
	public List<IValuable> getValue()
	{
		return elements;
	}

	@Override
	public IType getType()
	{
		return TypeInferencer.findType("Array");
	}

	@Override
	public int getLength()
	{
		return elements.size();
	}

	@Override public Array replicate()
	{
		return new Array(this.elementBoundType,this.elements);
	}

	@Override
	public Boolean asBoolean()
	{
		return new Boolean(elements.isEmpty());
	}

	@Override
	public Iterator<IValuable> iterator()
	{
		return asElementsArray().elements.iterator();
	}

	@Override
	public void forEach(Consumer<? super IValuable> action)
	{
		elements.forEach(action);
	}

	@Override
	public Spliterator<IValuable> spliterator()
	{
		return asElementsArray().elements.spliterator();
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