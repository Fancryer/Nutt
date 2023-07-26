package Nutt.Exceptions;

public class NuttConstantVariableWriteException extends UnsupportedOperationException
{
	private final String variableName;
	private final Object attemptedValue;

	public NuttConstantVariableWriteException(String variableName,Object attemptedValue)
	{
		super("Cannot write value to constant variable: "+variableName+" = "+attemptedValue);
		this.variableName=variableName;
		this.attemptedValue=attemptedValue;
	}

	public String getVariableName()
	{
		return variableName;
	}

	public Object getAttemptedValue()
	{
		return attemptedValue;
	}
}
