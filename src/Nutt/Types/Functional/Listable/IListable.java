package Nutt.Types.Functional.Listable;

import Nutt.TypeInferencer;
import Nutt.Types.Functional.IFunctional;
import Nutt.Types.IValuable;

public interface IListable extends IFunctional
{
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


	@Override default String getWrapType()
	{
		return "Functional";
	}
}
