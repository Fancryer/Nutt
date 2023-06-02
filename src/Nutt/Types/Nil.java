package Nutt.Types;

import Nutt.TypeInferencer;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Type.Type;

import java.util.List;


public class Nil implements IValuable
{
	@Override
	public String toString()
	{
		return "Nil";
	}

	@Override
	public boolean canConsumeParameters(List<IValuable> iValuables)
	{
		return false;
	}

	@Override
	public Object getValue()
	{
		return "nil";
	}

	@Override
	public Type getType()
	{
		return TypeInferencer.findType("Nil");
	}

	@Override
	public int getLength()
	{
		return 0;
	}

	@Override public Nil replicate()
	{
		return new Nil();
	}

	@Override public Array asElementsArray()
	{
		return new Array();
	}

	@Override public boolean lessThan(IValuable value)
	{
		return TypeInferencer.verdict("Nil",value.getType());
	}

	@Override public boolean greaterTo(IValuable value)
	{
		return false;
	}

	@Override public boolean lessEqalTo(IValuable value)
	{
		return false;
	}

	@Override public boolean greaterEqualTo(IValuable value)
	{
		return false;
	}

	@Override public boolean similarTo(IValuable value)
	{
		return false;
	}

	@Override public boolean notSimilarTo(IValuable value)
	{
		return false;
	}

	@Override public boolean equalTo(IValuable value)
	{
		return false;
	}

	@Override public boolean notEqualTo(IValuable value)
	{
		return false;
	}
}
