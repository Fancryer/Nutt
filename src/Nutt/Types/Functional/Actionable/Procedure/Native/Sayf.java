package Nutt.Types.Functional.Actionable.Procedure.Native;

import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.NuttInterpreter;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.IValuable;

import java.util.List;

public class Sayf extends NativeProcedure
{
	public Sayf()
	{
		super("sayf",new Signature("x:Valuable"));
	}

	@Override public IValuable proceed(List<IValuable> argumentList) throws NuttSuccessReturnException
	{
		return new Array(NuttInterpreter.sayFormatted(argumentList));
	}
}