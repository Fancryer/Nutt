package Nutt.Exceptions;

public class NuttTypeIsDeclaredException extends RuntimeException
{
	public NuttTypeIsDeclaredException(String name)
	{
		super("Type '"+name+"' is already declared, or is trying to inherit from something other than CustomType or its descendants!");
	}
}
