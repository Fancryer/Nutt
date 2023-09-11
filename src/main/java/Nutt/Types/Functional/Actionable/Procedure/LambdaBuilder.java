package Nutt.Types.Functional.Actionable.Procedure;

import Nutt.NuttEnvironment;

public class LambdaBuilder
{
	private Signature signature;
	private String lambdaExp;

	public LambdaBuilder setSignature(Signature signature)
	{
		this.signature=signature;
		return this;
	}

	public LambdaBuilder setFunctionBody(String expContext)
	{
		this.lambdaExp=expContext;
		return this;
	}

	public Procedure createProcedure()
	{
		return createProcedure("lambda"+signature);
	}

	public Procedure createProcedure(String name)
	{
		return new Procedure
				(
						name,
						signature,
						NuttEnvironment.getTempParser("return "+lambdaExp).block()
				);
	}
}