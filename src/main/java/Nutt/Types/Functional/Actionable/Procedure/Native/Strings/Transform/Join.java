package Nutt.Types.Functional.Actionable.Procedure.Native.Strings.Transform;

import Nutt.Annotations.ANativeProcedure;
import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Listable.String.String;

import java.util.List;
import java.util.stream.Collectors;

@ANativeProcedure("native.strings.transform.join")
public class Join extends NativeProcedure
{
	public Join()
	{
		super("join",new Signature("strings:Array","String"));
	}

	@Override public NuttReference proceed(List<NuttReference> argumentList) throws NuttSuccessReturnException
	{
		var asString=argumentList.stream()
		                         .map(NuttReference::getValue)
		                         .map(Object::toString)
		                         .collect(Collectors.joining());
		return new String(asString).toAnonymousReference();
	}
}
