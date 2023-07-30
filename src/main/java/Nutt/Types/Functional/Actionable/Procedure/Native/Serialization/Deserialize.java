package Nutt.Types.Functional.Actionable.Procedure.Native.Serialization;

import Nutt.Annotations.ANativeProcedure;
import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Listable.String.String;

import java.util.List;

//TODO
@ANativeProcedure("native.serialization")
public class Deserialize extends NativeProcedure
{
	public Deserialize()
	{
		super("deserialize",new Signature("r:Record","String"));
	}

	@Override public NuttReference proceed(List<NuttReference> argumentList) throws NuttSuccessReturnException
	{
		var str=argumentList.get(0).getValue().toString();
		return new String(str).toAnonymousReference();
	}
}