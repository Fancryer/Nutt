package Nutt.Types.Functional.Listable.Enumeration;

import Nutt.TypeInferencer;
import Nutt.Types.Functional.Listable.Set.Set;
import Nutt.Types.Functional.Type.IType;

public class Enumeration extends Set// implements java.util.Enumeration
{
	@Override public IType getType()
	{
		return TypeInferencer.findType("Enumeration");
	}
}
