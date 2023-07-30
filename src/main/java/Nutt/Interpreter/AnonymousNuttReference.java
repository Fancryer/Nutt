package Nutt.Interpreter;

import Nutt.Interpreter.NuttInterpreter.EConstantQualifier;
import Nutt.Runtime.Mutable;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;

import java.util.Map;

import static Nutt.Interpreter.NuttInterpreter.EConstantQualifier.Mut;

public class AnonymousNuttReference extends Nutt.Interpreter.NuttReference
{
	public static final Map<Type,Integer> typeCountMap=new java.util.HashMap<>();

	public AnonymousNuttReference(IValuable value,EConstantQualifier qualifier)
	{
		this(new Mutable<>(value),qualifier);
	}

	public AnonymousNuttReference(Mutable<IValuable> value,EConstantQualifier qualifier)
	{
		super(computeName(value),value,qualifier,value.get().getType());
	}

	public static String computeName(Mutable<IValuable> value)
	{
		return "$"+typeCountMap.compute(value.get().getType(),(k,v)->(v==null)?0:v+1);
	}

	public static AnonymousNuttReference of(IValuable value,EConstantQualifier qualifier)
	{
		return new AnonymousNuttReference(value,qualifier);
	}

	public static AnonymousNuttReference of(IValuable value)
	{
		return new AnonymousNuttReference(value,Mut);
	}
}
