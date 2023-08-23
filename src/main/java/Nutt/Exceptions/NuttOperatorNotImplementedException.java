package Nutt.Exceptions;

public class NuttOperatorNotImplementedException extends RuntimeException
{
	private final String typeDisplayName, operator;

	public NuttOperatorNotImplementedException(String typeDisplayName,String operator)
	{
		this.typeDisplayName=typeDisplayName;
		this.operator=operator;
	}

	@Override public String getMessage()
	{
		return "Operator '%s' is not defined on type '%s'!".formatted(operator,typeDisplayName);
	}
}
