package Nutt.Types.Functional.Actionable.Procedure.Native.IO.Output;

import Nutt.Annotations.ANativeProcedure;
import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Interpreter.NuttInterpreter;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
import Nutt.Types.Functional.Actionable.Procedure.Signature;

import java.util.List;

@ANativeProcedure("native.io.output.say")
public class Say extends NativeProcedure
{
	public Say()
	{
		super("say",new Signature("x:Valuable"));
	}

	@Override
	public NuttReference proceed(List<NuttReference> argumentList) throws NuttSuccessReturnException
	{
		if(argumentList.size()>1) throw new RuntimeException();
		return argumentList.isEmpty()?NuttInterpreter.sayNewLine():NuttInterpreter.sayNewLine(argumentList.get(0));
	}
}