package Nutt.Exceptions;

import Nutt.Types.Functional.Type.IType;

public class NuttRecordOperatorNotImplementedException extends RuntimeException
{
	public NuttRecordOperatorNotImplementedException(String typeName,String operator)
	{
		super("The '"+operator+"' is not defined on '"+typeName+"'");
	}

	public NuttRecordOperatorNotImplementedException(IType type,String operator)
	{
		this(type.getDisplayName(),operator);
	}
}
