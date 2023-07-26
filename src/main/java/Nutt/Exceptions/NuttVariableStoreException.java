package Nutt.Exceptions;

public class NuttVariableStoreException extends RuntimeException
{
	private final String typeA;
	private final String typeB;
	
	public NuttVariableStoreException(String typeA,String typeB)
	{
		this.typeA=typeA;
		this.typeB=typeB;
	}
	
	public NuttVariableStoreException(Throwable cause,String typeA,String typeB)
	{
		super(cause);
		this.typeA=typeA;
		this.typeB=typeB;
	}
	
	@Override
	public String getMessage()
	{
		return "%s cannot store %s".formatted(typeA,typeB);
	}
}
