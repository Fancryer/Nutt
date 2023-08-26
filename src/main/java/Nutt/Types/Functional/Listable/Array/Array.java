package Nutt.Types.Functional.Listable.Array;

import Nutt.Interpreter.References.NilReference;
import Nutt.Interpreter.References.NuttReference;
import Nutt.NuttCommon;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Listable.IListable;
import Nutt.Types.Functional.Numerable.Int.Int;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;

import java.util.*;
import java.util.function.Consumer;

public class Array implements IListable
{
	private final Type elementBoundType;
	private final List<NuttReference> elements;

	public Array()
	{
		this("Valuable",new ArrayList<>());
	}

	public Array(String elementBoundType,List<NuttReference> valuables)
	{
		this.elementBoundType=new Type(elementBoundType);
		elements=valuables;
	}

	public Array(String elementBoundType)
	{
		this(elementBoundType,new ArrayList<>());
	}

	public Array(Type elementBoundType)
	{
		this(elementBoundType,new ArrayList<>());
	}

	public Array(Type elementBoundType,List<NuttReference> valuables)
	{
		this.elementBoundType=elementBoundType;
		elements=valuables;
	}

	public Array(List<NuttReference> references)
	{
		this(TypeInferencer.getCommonWrapperType(references).getType(),references);
	}

	public Array(Array array)
	{
		this(array.elementBoundType,array.elements);
	}

	public void clear()
	{
		elements.clear();
	}

	@Override public String toSerializedString()
	{
		var asEmpty="[]";
		var asElements="[%s]".formatted(
				NuttCommon.removeFirstAndLastChars(
						elements.stream()
						        .map(reference->reference.getValue().toSerializedString())
						        .toList()
						        .toString()));
		return elements.isEmpty()
		       ?asEmpty
		       :asElements;
	}

	@Override
	public List<IValuable> getValue()
	{
		return elements.stream().map(NuttReference::getValue).toList();
	}	@Override
	public Array add(NuttReference value)
	{
		if(!TypeInferencer.verdict(TypeInferencer.findTypeReference(elementBoundType),TypeInferencer.findTypeReference(value.getType())))
			throw new ArrayStoreException("Array of '%s' cannot store '%s'".formatted(elementBoundType,value.getType()));
		var ret=new ArrayList<>(elements);
		ret.add(value);
		return new Array(elementBoundType,ret);
	}

	@Override
	public NuttReference getProperty(String name)
	{
		return switch(name)
		{
			case "length" -> new Int(elements.size()).toAnonymousReference();
			default -> NilReference.getInstance();
		};
	}

	public void remove(int index)
	{
		elements.remove(index);
	}	@Override
	public NuttReference getAt(NuttReference index)
	{
		if(!(index.getValue() instanceof Int intIndex)) throw new RuntimeException();
		return getAt(intIndex.asLong().intValue());
	}

	@Override
	public String toString()
	{
		var asEmpty="{}";
		var asElements="{%s}".formatted(
				NuttCommon.removeFirstAndLastChars(
						elements.stream()
						        .map(NuttReference::getValue)
						        .map(IValuable::toString)
						        .toList()
						        .toString()));
		return elements.isEmpty()
		       ?asEmpty
		       :asElements;
	}

	@Override public Array replicate()
	{
		return new Array(this.elementBoundType,this.elements);
	}	public NuttReference getAt(int index)
	{
		return elements.get(index);
	}



	@Override
	public Array setAt(NuttReference value,NuttReference index)
	{
		if(!(index.getValue() instanceof Int intIndex)) throw new RuntimeException();
		if(!TypeInferencer.verdict(TypeInferencer.findTypeReference(getElementType()),TypeInferencer.findTypeReference(value.getType())))
			throw new ArrayStoreException("Array of '%s' cannot store '%s'".formatted(getElementType(),value.getType()));
		var ret=new ArrayList<>(elements);
		ret.set(intIndex.asLong()
		                .intValue(),value);
		return new Array(elementBoundType,ret);
	}



	@Override
	public List<NuttReference> getElements()
	{
		return new ArrayList<>(elements);
	}



	@Override
	public Array setElements(List<NuttReference> elements)
	{
		String type=elements==null||elements.isEmpty()
		            ?"Valuable"
		            :elements.get(0)
		                     .getType()
		                     .getHeader()
		                     .getDisplayName();
		return new Array(type,Objects.requireNonNullElse(elements,new ArrayList<>()));
	}

	@Override
	public Type getElementType()
	{
		return elementBoundType;
	}

	@Override
	public Iterator<NuttReference> iterator()
	{
		return spread().elements.iterator();
	}

	@Override
	public Array spread()
	{
		return new Array(this);
	}

	//	@Override
	//	public IValuable insertAt(IValuable value,IValuable index)
	//	{
	//		if(!(index instanceof Int intIndex)) throw new RuntimeException();
	//		var ret=new ArrayList<>(elements);
	//		ret.add(intIndex.asLong().intValue(),value);
	//		return new Array(elementBoundType,ret);
	//	}

	@Override
	public void forEach(Consumer<? super NuttReference> action)
	{
		elements.forEach(action);
	}

	@Override
	public Spliterator<NuttReference> spliterator()
	{
		return spread().elements.spliterator();
	}

	@Override public Array addAll(IListable listable)
	{
		if
		(
				!TypeInferencer.verdict
						               (
								               TypeInferencer.findTypeReference(elementBoundType),
								               TypeInferencer.findTypeReference(listable.getElementType())
						               )
		)
		{
			throw new ArrayStoreException(
					"'%s' cannot store '%s'".formatted(
							getType().toSerializedString(),
							listable.getType().toSerializedString()));
		}
		var ret=new ArrayList<>(elements);
		ret.addAll(listable.getElements());
		return new Array(elementBoundType,ret);
	}

	@Override
	public Type getType()
	{
		return TypeInferencer.findTypeReference("Array").getType();
	}

	//	@Override public boolean equalTo(IValuable value)
	//	{
	//		if(!TypeInferencer.typesEquals(getType(),value.getType())) return false;
	//		var list=value.asFunctional().asListable().asArray().getValue();
	//		if(list.size()!=getLength()) return false;
	//		return IntStream.range(0,list.size()).allMatch(i->list.get(i).equalTo(elements.get(i).getValue()));
	//	}
}