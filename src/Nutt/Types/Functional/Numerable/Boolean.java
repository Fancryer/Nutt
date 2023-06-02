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
		super(List
				      .of("0","","false")
				      .contains(value)?0:1);
	}

	public Boolean(java.lang.Boolean value)
	{
		super(value?1:0);
	}

	public Boolean(Boolean other)
	{
		this(other.condition);
	}

	@Override public Number getValue()
	{
		return condition?1:0;
	}

	public boolean isTrue()
	{
		return condition;
	}

	@Override public String toString()
	{
		return String.valueOf(condition);
	}

	@Override public Boolean asBoolean()
	{
		return this;
	}

	@Override public Type getType()
	{
		return TypeInferencer.findType("Boolean");
	}

	@Override public void fromString(String str)
	{
		this.condition=switch(str)
		{
			case "","false","0" -> false;
			case "true","1" -> true;
			default -> throw new RuntimeException();
		};
	}

	@Override public boolean lessThan(IValuable value)
	{
		throw new RuntimeException();
	}

	@Override public boolean lessEqalTo(IValuable value)
	{
		return !condition||value
				.asFunctional()
				.asBoolean().condition;
	}

	@Override public boolean greaterTo(IValuable value)
	{
		throw new RuntimeException();
	}

	@Override public boolean greaterEqualTo(IValuable value)
	{
		throw new RuntimeException();
	}

	@Override public boolean similarTo(IValuable value)
	{
		var b=value
				.asFunctional()
				.asBoolean().condition;
		return !condition&&!b||condition&&b;
	}

	@Override public boolean notSimilarTo(IValuable value)
	{
		var b=value
				.asFunctional()
				.asBoolean().condition;
		return condition&&!b||b&&!condition;
	}

	@Override public boolean equalTo(IValuable value)
	{
		return TypeInferencer.typesEquals(getType(),value.getType())&&similarTo(value);
	}

	@Override public boolean notEqualTo(IValuable value)
	{
		return TypeInferencer.typesEquals(getType(),value.getType())&&notSimilarTo(value);
	}

	@Override public Boolean replicate()
	{
		return new Boolean(this);
	}
}
