package Nutt.Types.Functional.Actionable.Procedure.Native.IO.Output;

import Nutt.Annotations.ANativeProcedure;
import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Interpreter.NuttInterpreter;
import Nutt.Interpreter.References.AnonymousNuttReference;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Listable.Array.Array;

import java.util.List;

@ANativeProcedure("native.io.output")
public class Sayf extends NativeProcedure
{
	public Sayf()
	{
		super("sayf",new Signature("x:Valuable","Array"));
	}

	@Override public NuttReference proceed(List<NuttReference> argumentList) throws NuttSuccessReturnException
	{
		return AnonymousNuttReference.of(new Array(NuttInterpreter.sayFormatted(argumentList)));
	}
}