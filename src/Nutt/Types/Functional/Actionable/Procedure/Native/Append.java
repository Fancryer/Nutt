package Nutt.Types.Functional.Actionable.Procedure.Native;

import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.IValuable;

import java.util.List;

public class Append extends NativeProcedure
{
	public Append()
	{
		super("append",new Signature("x:Valuable"));
	}

	@Override public IValuable proceed(List<IValuable> argumentList) throws NuttSuccessReturnException
	{
		return argumentList.get(0).asFunctional().asListable().asArray().addAll(argumentList.get(1));
	}
}