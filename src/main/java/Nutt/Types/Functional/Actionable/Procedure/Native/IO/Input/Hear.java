package Nutt.Types.Functional.Actionable.Procedure.Native.IO.Input;

import Nutt.Annotations.ANativeProcedure;
import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Listable.String.String;

import java.util.List;
import java.util.Scanner;

@ANativeProcedure("native.io.input")
public class Hear extends NativeProcedure
{
	public Hear()
	{
		super("hear",new Signature("x:Valuable"));
	}

	@Override public NuttReference proceed(List<NuttReference> argumentList) throws NuttSuccessReturnException
	{
		if(argumentList.size()>1) throw new RuntimeException();
		//return NuttInterpreter.sayNewLine(argumentList.get(0));
		var input=new Scanner(System.in).nextLine();
		return new String(input).toAnonymousReference();
	}
}