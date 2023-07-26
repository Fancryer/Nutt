package Nutt.Exceptions;

import Nutt.Interpreter.NuttReference;

public class NuttSuccessReturnException extends RuntimeException
{
	private final NuttReference reference;

	public NuttSuccessReturnException(NuttReference reference)
	{
		this.reference=reference;
	}

	public NuttSuccessReturnException(Throwable cause,NuttReference reference)
	{
		super(cause);
		this.reference=reference;
	}

	@Override
	public String getMessage()
	{
		return "%s returned successfully".formatted(reference.getMutable().get().getValue());
	}

	public NuttReference getReference()
	{
		return reference;
	}
}
