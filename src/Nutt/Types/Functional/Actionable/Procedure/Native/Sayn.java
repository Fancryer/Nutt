package Nutt.Types.Functional.Actionable.Procedure.Native;

import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.NuttInterpreter;
import Nutt.Types.IValuable;

import java.util.List;

public class Sayn extends Say
{
	@Override public IValuable proceed(List<IValuable> argumentList) throws NuttSuccessReturnException
	{
		if(argumentList.size()>1) throw new RuntimeException();
		return NuttInterpreter.say(argumentList.get(0));
	}

	@Override public String toString()
	{
		return "funct say(x:Valuable=nil):Valuable[nil]='NATIVE CODE' return";
	}
}