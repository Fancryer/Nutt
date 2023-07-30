package Nutt.Types.Functional.Actionable.Procedure.Native.Strings;

import Nutt.Annotations.ANativeProcedure;
import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Listable.String.String;

import java.util.List;

@ANativeProcedure("native.strings")
public class Lower extends NativeProcedure
{
	public Lower()
	{
		super("lower",new Signature("str_0:String","String"));
	}

	@Override
	public NuttReference proceed(List<NuttReference> argumentList) throws NuttSuccessReturnException
	{
		var asLower=argumentList.get(0)
		                        .getValue()
		                        .asFunctional()
		                        .asListable()
		                        .asString()
		                        .getValue()
		                        .toLowerCase();
		return new String(asLower).toAnonymousReference();
	}
}
