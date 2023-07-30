package Nutt.Types.Functional.Numerable;

import Nutt.TypeInferencer;
import Nutt.Types.Functional.Numerable.Int.Int;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;

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

	@Override public boolean lessThan(IValuable value)
	{
		return !isTrue()&&value.isTrue();
	}

	@Override public boolean greaterTo(IValuable value)
	{
		return isTrue()&&!value.isTrue();
	}

	@Override public boolean lessEqualTo(IValuable value)
	{
		return !greaterTo(value);
	}

	@Override public boolean greaterEqualTo(IValuable value)
	{
		return !lessThan(value);
	}

	@Override public boolean similarTo(IValuable value)
	{
		return isTrue()&&value.isTrue();
	}

	@Override public boolean notSimilarTo(IValuable value)
	{
		return !similarTo(value);
	}

	@Override public boolean equalTo(IValuable value)
	{
		return TypeInferencer.typesEquals(getType(),value.getType())&&similarTo(value);
	}

	@Override public boolean notEqualTo(IValuable value)
	{
		return TypeInferencer.typesEquals(getType(),value.getType())&&notSimilarTo(value);
	}

	@Override public Boolean asBoolean()
	{
		return this;
	}
}
