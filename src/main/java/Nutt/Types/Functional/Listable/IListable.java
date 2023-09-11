package Nutt.Types.Functional.Listable;

import Nutt.Interfaces.*;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.IFunctional;
import Nutt.Types.Functional.Type.Native.ListableType;
import Nutt.Types.Functional.Type.Type;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public interface IListable extends IFunctional,
                                   IIndexed<NuttReference,NuttReference,NuttReference>,
                                   IStreamable<NuttReference>,
                                   IMappable,
                                   Iterable<NuttReference>,
                                   IPairable<NuttReference,NuttReference>,
                                   IReversible<IListable,NuttReference>
{
	@Override
	default Type getType()
	{
		return ListableType.getInstance();
	}

	@Override
	IListable replicate();

	IListable add(NuttReference value);

	@Override
	default <T> Stream<T> map(java.util.function.Function<NuttReference,? extends T> mapper)
	{
		return stream().map(mapper);
	}

	default Stream<NuttReference> stream()
	{
		return getElements().stream();
	}

	List<NuttReference> getElements();

	NuttReference setElements(List<NuttReference> elements);

	Type getElementType();

	@Override
	default Iterator<NuttReference> iterator()
	{
		return getElements().iterator();
	}

	@Override
	default void forEach(Consumer<? super NuttReference> action)
	{
		getElements().forEach(action);
	}

	@Override
	default Spliterator<NuttReference> spliterator()
	{
		return getElements().spliterator();
	}

	IListable addAll(IListable listable);
}
