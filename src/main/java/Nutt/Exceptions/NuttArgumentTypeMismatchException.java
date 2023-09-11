package Nutt.Exceptions;

public class NuttArgumentTypeMismatchException extends NuttTypeMismatchException
{
	public NuttArgumentTypeMismatchException(int position,String expectedType,String actualType)
	{
		super(expectedType,actualType,"argument at position %d".formatted(position));
	}
}

