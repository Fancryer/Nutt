package Nutt.Exceptions;

import Nutt.Types.Functional.Type.Type;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NuttTypeCastException extends RuntimeException
{
	private final String typeToCast, actualType;

	public NuttTypeCastException(Type typeToCast, String actualType)
	{
		this(typeToCast.toString(),actualType);
	}

	public NuttTypeCastException(Type typeToCast, Type actualType)
	{
		this(typeToCast,actualType.toString());
	}

	@Override public String toString()
	{
		return "'%s' type cannot be treated as '%s'.".formatted(actualType,typeToCast);
	}
}
