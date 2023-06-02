package Nutt.Types.Functional.Actionable.Procedure.Native;

import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.NuttInterpreter;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.IValuable;

import java.util.List;

public class Say extends NativeProcedure
{
	public Say()
	{
		super("say",new Signature("x:Valuable"));
	}

	@Override public IValuable proceed(List<IValuable> argumentList) throws NuttSuccessReturnException
	{
		if(argumentList.size()>1) throw new RuntimeException();
		return NuttInterpreter.say(argumentList.get(0));
	}
}