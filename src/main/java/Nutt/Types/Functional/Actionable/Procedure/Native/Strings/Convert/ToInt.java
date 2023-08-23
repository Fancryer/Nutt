package Nutt.Types.Functional.Actionable.Procedure.Native.Strings.Convert;

import Nutt.Annotations.ANativeProcedure;
import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Numerable.Int.Int;

import java.util.List;

@ANativeProcedure("native.strings.convert.to_int")
public class ToInt extends NativeProcedure
{
	public ToInt()
	{
		super("to_int",new Signature("str_0:String","Int"));
	}

	@Override
	public NuttReference proceed(List<NuttReference> argumentList) throws NuttSuccessReturnException
	{
		var asString=argumentList.get(0)
		                         .getValue()
		                         .asFunctional()
		                         .asListable()
		                         .asString();
		return Int.fromString(asString.toString()).toAnonymousReference();
	}
}