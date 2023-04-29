package Nutt.Exceptions;

import Nutt.Types.IValuable;

public class NuttSuccessReturnException extends RuntimeException
{
	private final IValuable valuable;

	public NuttSuccessReturnException(IValuable valuable)
	{
		this.valuable=valuable;
	}

	public NuttSuccessReturnException(Throwable cause,IValuable valuable)
	{
		super(cause);
		this.valuable=valuable;
	}

	@Override
	public String getMessage()
	{
		return "%s returned successfully".formatted(valuable);
	}

	public IValuable getValue()
	{
		return valuable;
	}
}
