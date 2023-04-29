package Nutt.Types.Functional.Actionable.Procedure;

import Nutt.NuttEnvironment;
import Nutt.TypeInferencer;
import Nutt.Types.IValuable;
import Nutt.Types.Nil;

public class LambdaBuilder
{
	private Signature signature;
	private String lambdaExp;
	private IValuable output=TypeInferencer.findType("Nil");

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

	public LambdaBuilder setOutput(IValuable output)
	{
		this.output=output;
		return this;
	}

	public Procedure createProcedure(String name)
	{
		return new Procedure
				(
						name,
						signature,
						NuttEnvironment.getTempParser("yield "+lambdaExp).block(),
						new Nil()
				);
	}

	public Procedure createProcedure()
	{
		return createProcedure("lambda"+signature);
	}
}