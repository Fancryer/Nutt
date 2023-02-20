package Nutt.Types;

import javax.naming.OperationNotSupportedException;

public class Nil implements IValuable
{

	@Override public String toString()
	{
		return "Nil";
	}

	@Override public Object getValue()
	{
		return null;
	}

	@Override public String getType()
	{
		return "Nil";
	}

	@Override public int compareTo(IValuable o)
	{
		try
		{
			throw new OperationNotSupportedException("Nil cannot be compared!");
		}
		catch(OperationNotSupportedException e)
		{
			throw new RuntimeException(e);
		}
	}

	@Override public int getLength()
	{
		return 0;
	}

	//@Override
	public boolean canStore(IValuable valuable)
	{
		return false;
	}

}
