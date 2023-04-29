package Nutt.Types;

import Nutt.TypeInferencer;
import Nutt.Types.Functional.IFunctional;
import Nutt.Types.Functional.Type.IType;

import java.util.List;
import java.util.Objects;

public interface IValuable extends IComparable<IValuable>
{
	boolean canConsumeParameters(List<IValuable> iValuables);

	Object getValue();

	default IFunctional asFunctional()
	{
		if(!(this instanceof IFunctional))
			throw new ClassCastException("Value type is not a Functional");
		return (IFunctional)this;
	}

	default Nil asNil()
	{
		if(!(this instanceof Nil))
			throw new ClassCastException("Value type is not a Nil");
		return (Nil)this;
	}

	default boolean isNil()
	{
		return Objects.equals(getType(),TypeInferencer.findType("Nil"));
	}

	IType getType();

	int getLength();

	IValuable replicate();
}