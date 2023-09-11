package Nutt.Exceptions;

import lombok.Getter;

@Getter public class NuttConstantReferenceWriteException extends UnsupportedOperationException
{
	private final String variableName;
	private final Object attemptedValue;

	public NuttConstantReferenceWriteException(String variableName,Object attemptedValue)
	{
		super("Cannot write value of constant reference: "+variableName+" = "+attemptedValue);
		this.variableName=variableName;
		this.attemptedValue=attemptedValue;
	}
}
