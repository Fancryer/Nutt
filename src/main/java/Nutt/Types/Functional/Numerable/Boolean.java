package Nutt.Types.Functional.Numerable;

import Nutt.TypeInferencer;
import Nutt.Types.Functional.Numerable.Int.Int;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;

import java.util.List;

public class Boolean extends Int
{
	private boolean condition;

	public Boolean()
	{
		condition=false;
	}

	public Boolean(String value)
	{
		super(List.of("0","","false")
		          .contains(value)?0:1);
	}

	public Boolean(Boolean other)
	{
		this(other.condition);
	}

	public Boolean(java.lang.Boolean value)
	{
		super(value?1:0);
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

	@Override public Number getValue()
	{
		return condition?1:0;
	}

	@Override public String toString()
	{
		return String.valueOf(condition);
	}

	@Override public Type getType()
	{
		return TypeInferencer.findTypeReference("Boolean");
	}

	@Override public Boolean replicate()
	{
		return new Boolean(this);
	}

	public boolean isTrue()
	{
		return condition;
	}

	@Override public boolean lessThan(IValuable value)
	{
		var otherIsTrue=value.isTrue();
		return !isTrue()&&otherIsTrue;
	}

	@Override public boolean greaterTo(IValuable value)
	{
		var otherIsTrue=value.isTrue();
		return isTrue()&&!otherIsTrue;
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
		var otherIsTrue=value.isTrue();
		return isTrue()&&otherIsTrue;
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
