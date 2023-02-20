package Nutt.Types.Functional.Actionable;

import Nutt.TypeInferencer;
import Nutt.Types.Functional.Actionable.Procedure.Procedure;
import Nutt.Types.Functional.IFunctional;

public interface IActionable extends IFunctional
{
	@Override default String getWrapType()
	{
		return "Functional";
	}

	@Override default int compareToFunctional(IFunctional functional)
	{
		if(!new TypeInferencer().verdict("Actionable",functional.getType()))
		{
			throw new RuntimeException("You cannot compare Actionable with %s!".formatted(functional.getType()));
		}
		return this.compareToActionable(functional.asActionable());
	}

	default int compareToActionable(IActionable actionable)
	{
		return -1;
		//return this.equals(actionable.getValue());
	}
	
	default Procedure asProcedure()
	{
		if(!(this instanceof Procedure))
			throw new ClassCastException("Actionable type is not a Procedure");
		return (Procedure)this;
	}
}
