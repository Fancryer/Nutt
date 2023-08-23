package Nutt.Types;

import Nutt.TypeInferencer;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Type.Type;

public class Nil implements IValuable
{
	@Override
	public String toString()
	{
		return "Nil";
	}

	@Override
	public Type getType()
	{
		return TypeInferencer.findTypeReference("Nil").getType();
	}

	@Override
	public Object getValue()
	{
		return "nil";
	}

	@Override public Array spread()
	{
		return new Array();
	}

	@Override public Nil replicate()
	{
		return new Nil();
	}
}
