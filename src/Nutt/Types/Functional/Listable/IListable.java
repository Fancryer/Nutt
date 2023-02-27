package Nutt.Types.Functional.Listable;

import Nutt.TypeInferencer;
import Nutt.Types.Functional.IFunctional;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.Set.Set;
import Nutt.Types.Functional.Numerable.Int.Int;
import Nutt.Types.IValuable;

public interface IListable extends IFunctional
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

	@Override default int compareTo(IValuable valuable)
	{
		if(!new TypeInferencer().verdict("Listable",valuable.getType()))
		{
			throw new RuntimeException("You cannot compare Listable with %s!".formatted(valuable.getType()));
		}
		return compareToFunctional(valuable.asFunctional());
	}

	@Override default int compareToFunctional(IFunctional functional)
	{
		if(!new TypeInferencer().verdict("Listable",functional.getType()))
		{
			throw new RuntimeException("You cannot compare Listable with %s!".formatted(functional.getType()));
		}
		return compareToListable(functional.asListable());
	}

	default int compareToListable(IListable listable)
	{
		return !new TypeInferencer().isContainer(listable.getType())?this.compareTo(listable):-1;
	}

	IValuable add(IValuable value);

	IValuable getAt(int i);

	default IValuable getAt(Int i)
	{
		return getAt(i.asLong().intValue());
	}

	IValuable setAt(IValuable value,int i);

	default IValuable setAt(IValuable value,Int i)
	{
		return setAt(value,i.asLong().intValue());
	}

	IValuable insertAt(IValuable value,int i);

	default IValuable insertAt(IValuable value,Int i)
	{
		return insertAt(value,i.asLong().intValue());
	}

	@Override default String getWrapType()
	{
		return "Functional";
	}
}
