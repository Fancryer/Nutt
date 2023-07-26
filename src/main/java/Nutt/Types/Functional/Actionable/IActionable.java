package Nutt.Types.Functional.Actionable;

import Nutt.Types.Functional.Actionable.Procedure.Procedure;
import Nutt.Types.Functional.IFunctional;

public interface IActionable extends IFunctional
{
	default Procedure asProcedure()
	{
		if(!(this instanceof Procedure))
			throw new ClassCastException("Actionable type is not a Procedure");
		return (Procedure)this;
	}
}