package Nutt.Types.Functional.Listable.Map;

import Nutt.Pair;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.IListable;
import Nutt.Types.Functional.Numerable.Boolean;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Map implements IListable
{
	private final java.util.Map<IValuable,IValuable> elements;
	private final Pair<Type,Type> typePair;

	public Map(Map other)
	{
		this(other.elements,other.typePair);
	}

	public Map(java.util.Map<IValuable,IValuable> elements,Pair<Type,Type> typePair)
	{
		this.elements=elements;
		this.typePair=typePair;
	}

	public Map()
	{
		this
				(
						new HashMap<>(),
						new Pair<>
								(
										TypeInferencer.findType("Valuable"),
										TypeInferencer.findType("Valuable")
								)
				);
	}

	@Override
	public String toString()
	{
		return "Map: %s"+getValue();
	}

	@Override
	public Type getType()
	{
		return TypeInferencer.findType("Map");
	}

	@Override
	public Object getValue()
	{
		return "...";
	}

	@Override public Map setValue(Object value)
	{
		return null;
	}

	@Override
	public int getLength()
	{
		return elements.size();
	}

	@Override public Map replicate()
	{
		return new Map<>(this);
	}

	@Override
	public IValuable add(IValuable value)
	{
		return null;
	}

	@Override
	public IValuable setAt(IValuable value,IValuable index)
	{
		if(!TypeInferencer.verdict(getKeyType(),index.getType())) throw new RuntimeException();
		elements.put(index,value);
		return value;
	}

	public Type getKeyType()
	{
		return typePair.left();
	}

	@Override
	public List<IValuable> getElements()
	{
		return asList();
	}

	@Override
	public Map setElements(List<IValuable> elements)
	{
		return null;
	}

	@Override
	public Type getElementType()
	{
		return TypeInferencer.findType("Array");
	}

	@Override
	public Iterator<IValuable> iterator()
	{
		return elements
				.values()
				.iterator();
	}

	//	@Override
	//	public IValuable insertAt(IValuable value,int i)
	//	{
	//		return null;
	//	}

	private List<IValuable> asList()
	{
		return elements
				.entrySet()
				.stream()
				.map
						(
								entry->
								{
									var key=entry.getKey();
									var val=entry.getValue();
									var commonType=TypeInferencer.getCommonWrapperType(key.getType(),val.getType());
									return (IValuable)new Array(commonType,List.of(key,val));
								}
						)
				.toList();
	}

	@Override
	public Array asElementsArray()
	{
		return new Array(getElementType(),asList());
	}

	@Override
	public Boolean asBoolean()
	{
		return new Boolean(elements.isEmpty());
	}

	@Override public Map addAll(IValuable valuable)
	{
		return null;
	}

	@Override public boolean lessThan(IValuable value)
	{
		return false;
	}

	@Override public boolean greaterTo(IValuable value)
	{
		return false;
	}

	@Override public boolean lessEqualTo(IValuable value)
	{
		return false;
	}

	@Override public boolean greaterEqualTo(IValuable value)
	{
		return false;
	}

	@Override public boolean similarTo(IValuable value)
	{
		return false;
	}

	@Override public boolean notSimilarTo(IValuable value)
	{
		return false;
	}

	@Override public boolean equalTo(IValuable value)
	{
		return false;
	}

	@Override public boolean notEqualTo(IValuable value)
	{
		return false;
	}
}