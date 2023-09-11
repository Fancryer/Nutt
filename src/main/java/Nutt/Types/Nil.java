package Nutt.Types;

import Nutt.Interpreter.References.NilReference;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Type.Native.NilType;
import Nutt.Types.Functional.Type.Type;

public class Nil implements IValuable
{
	@Override
	public String toString()
	{
		return "Nil";
	}

	@Override
	public Object getValue()
	{
		return "nil";
	}

	@Override public NuttReference getProperty(String name)
	{
		return NilReference.getInstance();
	}

	@Override
	public Type getType()
	{
		return NilType.getInstance();
	}

	@Override public Array toArray()
	{
		return new Array();
	}

	@Override public Nil replicate()
	{
		return new Nil();
	}
}
