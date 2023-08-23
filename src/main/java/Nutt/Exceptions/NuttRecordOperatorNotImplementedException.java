package Nutt.Exceptions;

import Nutt.Types.Functional.Type.Type;

public class NuttRecordOperatorNotImplementedException extends RuntimeException
{
	public NuttRecordOperatorNotImplementedException(String typeName,String operator)
	{
		super("The '%s' is not defined on '%s'".formatted(operator,typeName));
	}

	public NuttRecordOperatorNotImplementedException(Type type,String operator)
	{
		this(type.getHeader().getDisplayName(),operator);
	}
}
