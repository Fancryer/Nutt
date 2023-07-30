package Nutt.Types.Functional.Actionable.Procedure.Native.Serialization;

import Nutt.Annotations.ANativeProcedure;
import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Listable.String.String;

import java.util.List;

@ANativeProcedure("native.serialization")
public class Serialize extends NativeProcedure
{
	public Serialize()
	{
		super("serialize",new Signature("r:Record","String"));
	}

	@Override public NuttReference proceed(List<NuttReference> argumentList) throws NuttSuccessReturnException
	{
		return new String(argumentList.get(0).getValue().toSerializedString()).toAnonymousReference();
	}
}