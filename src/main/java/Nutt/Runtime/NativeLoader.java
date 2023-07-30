package Nutt.Runtime;

import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static Nutt.NuttEnvironment.nativeProcedures;

public class NativeLoader
{
	public static Map<String,NativeProcedure> loadedProcedures=new HashMap<>();

	public static NativeProcedure loadNativeProcedure(String modulePath)
	{
		//System.out.println("modulePath = "+modulePath);
		if(loadedProcedures.containsKey(modulePath)) return loadedProcedures.get(modulePath);
		for(var path: nativeProcedures.keySet())
		{
			if(Objects.equals(path,modulePath))
			{
				try
				{
					var loadedProcedure=nativeProcedures.get(path).getDeclaredConstructor().newInstance();
					loadedProcedures.put(path,loadedProcedure);
					return loadedProcedure;
				}
				catch(Exception e)
				{
					throw new RuntimeException(e);
				}
			}
		}
		throw new RuntimeException();
	}

	public record NativeProcedureInfo(String name,String module,NativeProcedure procedure)
	{
		@Override public String toString()
		{
			return "{'%s':'%s'}".formatted(name,module);
		}
	}
}