package Nutt.Types.Functional.Actionable;

import Nutt.Types.Functional.IFunctional;
import Nutt.Types.Functional.Type.Native.ActionableType;
import Nutt.Types.Functional.Type.Type;

public interface IActionable extends IFunctional
{
	@Override default Type getType()
	{
		return ActionableType.getInstance();
	}
}