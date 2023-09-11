package Nutt.Types.Functional.Actionable;

import Nutt.TypeInferencer;
import Nutt.Types.Functional.IFunctional;
import Nutt.Types.Functional.Type.Type;

public interface IActionable extends IFunctional
{
	@Override default Type getType()
	{
		return TypeInferencer.findTypeReference("Actionable").getValueAs(Type.class);
	}
}