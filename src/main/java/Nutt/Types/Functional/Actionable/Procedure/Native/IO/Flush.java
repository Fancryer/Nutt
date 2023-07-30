package Nutt.Types.Functional.Actionable.Procedure.Native.IO;

import Nutt.Annotations.ANativeProcedure;
import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Interpreter.References.NilReference;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
import Nutt.Types.Functional.Actionable.Procedure.Signature;

import java.util.List;

@ANativeProcedure("native.io")
public class Flush extends NativeProcedure
{
	public Flush()
	{
		super("flush",new Signature());
	}

	@Override public NuttReference proceed(List<NuttReference> argumentList) throws NuttSuccessReturnException
	{
		if(!argumentList.isEmpty()) throw new RuntimeException();
		try
		{
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
		return NilReference.getInstance();
	}
}