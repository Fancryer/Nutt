package Nutt.Types.Functional.Actionable.Procedure;

import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
import lombok.Builder;

import java.util.List;
import java.util.function.Function;

public class Operator extends NativeProcedure
{
	private final Function<List<NuttReference>,NuttReference> function;

	@Builder
	public Operator(String name,Signature signature,Function<List<NuttReference>,NuttReference> function)
	{
		super(name,signature);
		this.function=function;
	}

	@Override
	public NuttReference proceed(List<NuttReference> argumentList) throws NuttSuccessReturnException
	{
		return function.apply(argumentList);
	}
}
