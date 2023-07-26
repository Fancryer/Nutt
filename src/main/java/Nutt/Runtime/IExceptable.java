package Nutt.Runtime;

import java.util.function.Function;

public interface IExceptable<T,R>
{
	default R except(Function<T,R> funct,T arg,R def)
	{
		try
		{
			return funct.apply(arg);
		}
		catch(Exception e)
		{
			return def;
		}
	}
}
