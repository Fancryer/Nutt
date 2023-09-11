package Nutt.Exceptions;

public class NuttTypeMismatchException extends RuntimeException
{
	public NuttTypeMismatchException(String expectedType,String actualType)
	{
		super("Failed to infer type: expected type '%s' but got '%s'".formatted(expectedType,actualType));
	}

	public NuttTypeMismatchException(String expectedType,String actualType,String tooltip)
	{
		super("Failed to infer type: %s expected type '%s' but got '%s'".formatted(tooltip,expectedType,actualType));
	}
}

