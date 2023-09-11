package Nutt.Types.Functional.Actionable.Procedure;

import gen.NuttParser;

public class ProcedureBuilder
{
	private Signature signature;
	private NuttParser.BlockContext functionBody;

	public ProcedureBuilder setSignature(Signature signature)
	{
		this.signature=signature;
		return this;
	}

	public ProcedureBuilder setFunctionBody(NuttParser.BlockContext functionBody)
	{
		this.functionBody=functionBody;
		return this;
	}

	public Procedure createProcedure(String name)
	{
		return new Procedure(name,signature,functionBody);
	}

	public Procedure createProcedure()
	{
		return new Procedure("lambda"+signature,signature,functionBody);
	}
}