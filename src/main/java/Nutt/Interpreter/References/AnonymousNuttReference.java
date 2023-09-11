package Nutt.Interpreter.References;

import Nutt.Interpreter.NuttInterpreter.EConstantQualifier;
import Nutt.Runtime.Mutable;
import Nutt.Types.IValuable;

import static Nutt.Interpreter.NuttInterpreter.EConstantQualifier.Mut;

public class AnonymousNuttReference extends NuttReference
{
	public AnonymousNuttReference(IValuable value,EConstantQualifier qualifier)
	{
		this(new Mutable<>(value),qualifier);
	}

	public AnonymousNuttReference(Mutable<IValuable> value,EConstantQualifier qualifier)
	{
		super(value,qualifier,value.get().getType());
	}

	public static <V extends IValuable> AnonymousNuttReference of(V value,EConstantQualifier qualifier)
	{
		return new AnonymousNuttReference(value,qualifier);
	}

	public static <V extends IValuable> AnonymousNuttReference of(V value)
	{
		return new AnonymousNuttReference(value,Mut);
	}

	public static AnonymousNuttReference of(NuttReference reference)
	{
		return new AnonymousNuttReference(reference.getValue(),reference.getQualifier());
	}
}
