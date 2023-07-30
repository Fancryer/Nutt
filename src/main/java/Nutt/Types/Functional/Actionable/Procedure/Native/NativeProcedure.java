package Nutt.Types.Functional.Actionable.Procedure.Native;

import Nutt.Types.Functional.Actionable.Procedure.Procedure;
import Nutt.Types.Functional.Actionable.Procedure.Signature;

public abstract class NativeProcedure extends Procedure
{
	public NativeProcedure(String name,Signature signature)
	{
		super(name,signature,null,null);
	}

	@Override public String toString()
	{
		return "funct %s%s= /|NATIVE CODE|\\ return".formatted(name,signature);
	}

	@Override public Procedure replicate()
	{
		return this;
	}
}
