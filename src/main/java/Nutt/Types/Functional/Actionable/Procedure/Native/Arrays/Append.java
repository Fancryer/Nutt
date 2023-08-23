package Nutt.Types.Functional.Actionable.Procedure.Native.Arrays;

import Nutt.Annotations.ANativeProcedure;
import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
import Nutt.Types.Functional.Actionable.Procedure.Signature;

import java.util.List;

@ANativeProcedure("native.arrays.append")
public class Append extends NativeProcedure
{
	public Append()
	{
		super("append",new Signature("arr_0:Array,arr_1:Array","Array"));
	}

	@Override public NuttReference proceed(List<NuttReference> argumentList) throws NuttSuccessReturnException
	{
		return argumentList.get(0)
		                   .getValue()
		                   .asFunctional()
		                   .asListable()
		                   .add(argumentList.get(1))
		                   .toAnonymousReference();
	}
}