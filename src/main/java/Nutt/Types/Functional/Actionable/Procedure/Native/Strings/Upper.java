package Nutt.Types.Functional.Actionable.Procedure.Native.Strings;

import Nutt.Annotations.ANativeProcedure;
import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Listable.String.String;

import java.util.List;

@ANativeProcedure("native.strings")
public class Upper extends NativeProcedure
{
	public Upper()
	{
		super("upper",new Signature("str_0:String","String"));
	}

	@Override
	public NuttReference proceed(List<NuttReference> argumentList) throws NuttSuccessReturnException
	{
		var asUpper=argumentList.get(0)
		                        .getValue()
		                        .asFunctional()
		                        .asListable()
		                        .asString()
		                        .getValue()
		                        .toUpperCase();
		return new String(asUpper).toAnonymousReference();
	}
}
