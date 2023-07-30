package Nutt.Types.Functional.Actionable.Procedure.Native.IO.Input;

import Nutt.Annotations.ANativeProcedure;
import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Runtime.RawConsoleInput;
import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Listable.String.String;

import java.util.ArrayList;
import java.util.List;

import static java.awt.event.KeyEvent.getKeyText;

@ANativeProcedure("native.io.input")
public class GetKey extends NativeProcedure
{
	public GetKey()
	{
		super("get_key",new Signature(new ArrayList<>()));
	}

	@Override public NuttReference proceed(List<NuttReference> argumentList) throws NuttSuccessReturnException
	{
		if(argumentList.size()>1) throw new RuntimeException();
		try
		{
			return new String(getKeyText(RawConsoleInput.read(true))).toAnonymousReference();
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}
}