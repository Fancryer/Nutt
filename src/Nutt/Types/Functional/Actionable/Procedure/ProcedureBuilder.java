package Nutt.Types.Functional.Actionable.Procedure;

import gen.Nutt;
import Nutt.TypeInferencer;
import Nutt.Types.IValuable;

public class ProcedureBuilder
{
	private Signature signature;
	private Nutt.BlockContext functionBody;
	private IValuable output=TypeInferencer.findType("Nil");

	public ProcedureBuilder setSignature(Signature signature)
	{
		this.signature=signature;
		return this;
	}

	public ProcedureBuilder setFunctionBody(Nutt.BlockContext functionBody)
	{
		this.functionBody=functionBody;
		return this;
	}

	public ProcedureBuilder setOutput(IValuable output)
	{
		this.output=output;
		return this;
	}

	public Procedure createProcedure(String name)
	{
		return new Procedure(name,signature,functionBody,output);
	}

	public Procedure createProcedure()
	{
		return new Procedure("lambda"+signature,signature,functionBody,output);
	}
}