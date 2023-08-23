package Nutt.Types.Functional.Numerable;

import Nutt.TypeInferencer;
import Nutt.Types.Functional.Numerable.Int.Int;
import Nutt.Types.Functional.Type.Type;

public class Boolean extends Int
{
	public Boolean()
	{
		this(false);
	}

	public Boolean(java.lang.Boolean value)
	{
		super(value?1:0);
	}

	public Boolean(String value)
	{
		this(fromString(value));
	}

	public Boolean(Boolean other)
	{
		this(other.asLong()==1);
	}

	public static Boolean fromString(String str)
	{
		return new Boolean
				(
						switch(str)
						{
							case "","false","0" -> false;
							case "true","1" -> true;
							default -> throw new RuntimeException();
						}
				);
	}

	@Override public boolean isBoolean()
	{
		return true;
	}

	@Override public Number getValue()
	{
		return asLong();
	}

	@Override public Boolean replicate()
	{
		return new Boolean(this);
	}

	@Override public Boolean asBoolean()
	{
		return this;
	}

	@Override public String toString()
	{
		return String.valueOf(isTrue());
	}

	@Override public Type getType()
	{
		return TypeInferencer.findTypeReference("Boolean").getType();
	}

	public boolean isTrue()
	{
		return asLong()==1;
	}
}
