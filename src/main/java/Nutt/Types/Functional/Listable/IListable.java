package Nutt.Types.Functional.Listable;

import Nutt.Interpreter.NuttReference;
import Nutt.Types.Functional.IFunctional;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.Map.Map;
import Nutt.Types.Functional.Listable.Set.Set;
import Nutt.Types.Functional.Listable.String.String;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public interface IListable extends IFunctional, Iterable<NuttReference>
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
		try
		{
			return (Map)this;
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}

	IListable add(NuttReference value);

	IValuable getAt(NuttReference index);

	IListable setAt(NuttReference value,NuttReference index);

	default <T> Stream<T> map(java.util.function.Function<NuttReference,? extends T> mapper)
	{
		return stream().map(mapper);
	}

	default Stream<NuttReference> stream()
	{
		return getElements().stream();
	}

	List<NuttReference> getElements();

	IListable setElements(List<NuttReference> elements);

	Type getElementType();

	@Override default Iterator<NuttReference> iterator()
	{
		return getElements().iterator();
	}

	@Override default void forEach(Consumer<? super NuttReference> action)
	{
		getElements().forEach(action);
	}

	@Override default Spliterator<NuttReference> spliterator()
	{
		return getElements().spliterator();
	}

	IListable addAll(IValuable valuable);
}
