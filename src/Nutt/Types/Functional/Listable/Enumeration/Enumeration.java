package Nutt.Types.Functional.Listable.Enumeration;

import Nutt.Types.Functional.Listable.Set.Set;

public class Enumeration extends Set
{
	@Override public String getType()
	{
		return "Enumeration";
	}

	@Override public String getWrapType()
	{
		return "Set";
	}
}
