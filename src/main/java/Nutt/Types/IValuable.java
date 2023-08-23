package Nutt.Types;

import Nutt.Annotations.IReplicable;
import Nutt.Interfaces.IArrayable;
import Nutt.Interpreter.References.AnonymousNuttReference;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.IFunctional;
import Nutt.Types.Functional.Type.Type;

import java.util.Objects;

public interface IValuable extends IArrayable, IReplicable<IValuable>
{
	default IFunctional asFunctional()
	{
		if(!(this instanceof IFunctional))
			throw new ClassCastException("Value type is not a Functional");
		return (IFunctional)this;
	}

	default IValuable asValuable()
	{
		return this;
	}

	default Nil asNil()
	{
		if(!(this instanceof Nil))
			throw new ClassCastException("Value type is not a Nil");
		return (Nil)this;
	}

	default boolean isNil()
	{
		return Objects.equals(getType(),TypeInferencer.findTypeReference("Nil").getType());
	}

	Type getType();

	default String toSerializedString()
	{
		return toString();
	}

	Object getValue();

	default AnonymousNuttReference toAnonymousReference()
	{
		return AnonymousNuttReference.of(this);
	}
}