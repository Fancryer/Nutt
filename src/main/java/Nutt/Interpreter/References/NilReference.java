package Nutt.Interpreter.References;

import Nutt.Runtime.Mutable;
import Nutt.Types.Nil;
import lombok.Getter;

import static Nutt.Interpreter.NuttInterpreter.EConstantQualifier.Val;

public class NilReference extends NuttReference
{
	@Getter
	private final static NilReference instance=new NilReference();

	private NilReference()
	{
		super("nil",new Mutable<>(new Nil()),Val);
	}
}
