package Nutt.Types.Functional.Listable;

import Nutt.Types.Functional.IFunctional;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.Map.Map;
import Nutt.Types.Functional.Listable.Set.Set;
import Nutt.Types.Functional.Listable.String.String;
import Nutt.Types.Functional.Type.IType;
import Nutt.Types.IValuable;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public interface IListable extends IFunctional, Iterable<IValuable>
{
	default Array asArray()
	{
		if(!(this instanceof Array))
			throw new ClassCastException("Listable type is not an Array");
		return (Array)this;
	}

	default Set asSet()
	{
		if(!(this instanceof Set))
			throw new ClassCastException("Listable type is not a Set");
		return (Set)this;
	}

	default String asString()
	{
		if(!(this instanceof String))
			throw new ClassCastException("Listable type is not a String");
		return (String)this;
	}

	default Map asMap()
	{
		if(!(this instanceof Map))
			throw new ClassCastException("Listable type is not a Map");
		return (Map)this;
	}

	IValuable add(IValuable value);

	IValuable getAt(IValuable index);

	IValuable setAt(IValuable value,IValuable index);

	//	default IValuable insertAt(IValuable value,Int i)
	//	{
	//		return insertAt(value,i.asLong().intValue());
	//	}

	//IValuable insertAt(IValuable value,int i);

	List<IValuable> getElements();

	IListable setElements(List<IValuable> elements);

	default Stream<IValuable> stream()
	{
		return getElements().stream();
	}

	default <T> Stream<T> map(java.util.function.Function<? super IValuable,? extends T> mapper)
	{
		return stream().map(mapper);
	}

	IType getElementType();

	Array asElementsArray();

	@Override default void forEach(Consumer<? super IValuable> action)
	{
		getElements().forEach(action);
	}

	@Override default Iterator<IValuable> iterator()
	{
		return getElements().iterator();
	}

	@Override default Spliterator<IValuable> spliterator()
	{
		return getElements().spliterator();
	}
}
