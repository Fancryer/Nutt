package Nutt.Exceptions;

public class NuttVariableNotDefinedException extends RuntimeException
{
	private final String variableName;
	
	public NuttVariableNotDefinedException(String variableName)
	{
		this.variableName=variableName;
	}
	
	public NuttVariableNotDefinedException(Throwable cause,String variableName)
	{
		super(cause);
		this.variableName=variableName;
	}
	
	@Override
	public String getMessage()
	{
		return "Interpreter doesn't know the \"%s\" variable".formatted(variableName);
	}
}
