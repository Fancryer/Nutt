package Nutt.Types.Functional.Listable.Map;

import Nutt.Interpreter.References.AnonymousNuttReference;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Pair;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.IListable;
import Nutt.Types.Functional.Type.Type;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Map implements IListable
{
	private final java.util.Map<NuttReference,NuttReference> elements;
	private final Pair<Type,Type> typePair;

	public Map(Map other)
	{
		this(other.elements,other.typePair);
	}

	public Map(java.util.Map<NuttReference,NuttReference> elements,Pair<Type,Type> typePair)
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
										TypeInferencer.findTypeReference("Valuable").getType(),
										TypeInferencer.findTypeReference("Valuable").getType()
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
		return TypeInferencer.findTypeReference("Map").getType();
	}

	@Override
	public java.util.Map<NuttReference,NuttReference> getValue()
	{
		return elements;
	}

	@Override public Map replicate()
	{
		return new Map(this);
	}

	@Override
	public Map add(NuttReference value)
	{
		return this;
	}

	@Override public NuttReference getAt(NuttReference index)
	{
		return null;
	}

	@Override
	public Map setAt(NuttReference value,NuttReference index)
	{
		if(!TypeInferencer.verdict(TypeInferencer.findTypeReference(getKeyType()),TypeInferencer.findTypeReference(index.getType())))
			throw new RuntimeException();
		elements.put(index,value);
		return this;
	}

	@Override
	public List<NuttReference> getElements()
	{
		return asList();
	}

	@Override
	public Map setElements(List<NuttReference> elements)
	{
		return this;
	}

	@Override
	public Type getElementType()
	{
		return TypeInferencer.findTypeReference("Array").getType();
	}

	@Override
	public Iterator<NuttReference> iterator()
	{
		return elements
				.values()
				.iterator();
	}

	@Override
	public Map addAll(IListable listable)
	{
		return this;
	}

	//	@Override
	//	public IValuable insertAt(IValuable value,int i)
	//	{
	//		return null;
	//	}

	private List<NuttReference> asList()
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
									var commonType=TypeInferencer.getCommonWrapperType
											                             (
													                             TypeInferencer.findTypeReference(key.getType()),
													                             TypeInferencer.findTypeReference(val.getType())
											                             );
									return AnonymousNuttReference.of(new Array(commonType.getType(),List.of(key,val)));
								}
						)
				.collect(Collectors.toList());
	}

	public Type getKeyType()
	{
		return typePair.left();
	}

	@Override
	public Array spread()
	{
		return new Array(getElementType(),asList());
	}
}