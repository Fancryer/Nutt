package Nutt.Types.Functional.Actionable.Procedure;

import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
import lombok.Builder;

import java.util.List;
import java.util.function.BiFunction;

public class Operator extends NativeProcedure
{
	private final BiFunction<NuttReference,NuttReference,NuttReference> function;

	@Builder
	public Operator(String name,Signature signature,BiFunction<NuttReference,NuttReference,NuttReference> function)
	{
		super(name,signature);
		this.function=function;
	}

	@Override
	public NuttReference proceed(List<NuttReference> argumentList) throws NuttSuccessReturnException
	{
		return proceed(argumentList.get(0),argumentList.get(1));
	}

	public NuttReference proceed(NuttReference left,NuttReference right) throws NuttSuccessReturnException
	{
		return function.apply(left,right);
	}
}
