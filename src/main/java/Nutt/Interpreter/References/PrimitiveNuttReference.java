package Nutt.Interpreter.References;

import Nutt.Interpreter.NuttInterpreter.EConstantQualifier;
import Nutt.Types.Functional.Listable.String.String;
import Nutt.Types.Functional.Numerable.Boolean;
import Nutt.Types.Functional.Numerable.INumerable;
import Nutt.Types.IValuable;
import Nutt.Types.Nil;

import static Nutt.Interpreter.NuttInterpreter.EConstantQualifier.Mut;

public class PrimitiveNuttReference extends AnonymousNuttReference
{
	private PrimitiveNuttReference(IValuable value,EConstantQualifier qualifier)
	{
		super(value,qualifier);
	}

	public static PrimitiveNuttReference ofNumber(INumerable value)
	{
		return new PrimitiveNuttReference(value,Mut);
	}

	public static PrimitiveNuttReference ofString(String value)
	{
		return new PrimitiveNuttReference(value,Mut);
	}

	public static PrimitiveNuttReference ofBoolean(Boolean value)
	{
		return new PrimitiveNuttReference(value,Mut);
	}

	public static PrimitiveNuttReference ofBoolean(boolean value)
	{
		return new PrimitiveNuttReference(new Boolean(value),Mut);
	}

	public static PrimitiveNuttReference ofNil()
	{
		return new PrimitiveNuttReference(new Nil(),Mut);
	}
}
