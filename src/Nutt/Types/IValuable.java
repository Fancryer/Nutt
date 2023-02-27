package Nutt.Types;

import Nutt.Types.Functional.IFunctional;

import java.util.Objects;

public interface IValuable extends Comparable<IValuable>
{
	Object getValue();

	String getType();

	default String getFullType()
	{
		return getType();
	}

	default String getWrapType()
	{
		return "Either";
	}

	default IFunctional asFunctional()
	{
		if(!(this instanceof IFunctional))
			throw new ClassCastException("Value type is not an Action");
		return (IFunctional)this;
	}

	default Nil asNil()
	{
		if(!(this instanceof Nil))
			throw new ClassCastException("Value type is not an Action");
		return (Nil)this;
	}

	@Override int compareTo(IValuable o);

	default boolean isNil()
	{
		return Objects.equals(getType(),"Nil");
	}

	int getLength();
}