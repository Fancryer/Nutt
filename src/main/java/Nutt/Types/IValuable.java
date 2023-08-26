package Nutt.Types;

import Nutt.Annotations.IReplicable;
import Nutt.Exceptions.NuttTypeCastException;
import Nutt.Interfaces.IArrayable;
import Nutt.Interpreter.References.AnonymousNuttReference;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Type.Native.ValuableType;
import Nutt.Types.Functional.Type.Type;

public interface IValuable extends IArrayable, IReplicable<IValuable>
{
	default IValuable asValuable()
	{
		return this;
	}

	default String toSerializedString()
	{
		return toString();
	}

	Object getValue();

	default AnonymousNuttReference toAnonymousReference()
	{
		return AnonymousNuttReference.of(this);
	}

	NuttReference getProperty(String name);

	default <T> T simpleCast(Class<T> type)
	{
		if(!type.isInstance(this))
			throw new NuttTypeCastException(getType(),type.getSimpleName());
		return type.cast(this);
	}

	default Type getType()
	{
		return ValuableType.getInstance();
	}
}