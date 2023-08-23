package Nutt.Exceptions;

public class NuttUndefinedVariableException extends RuntimeException
{
	private final String variableName;

	public NuttUndefinedVariableException(String variableName)
	{
		this.variableName=variableName;
	}

	@Override public String toString()
	{
		return "Undefined variable: %s".formatted(variableName);
	}
}
