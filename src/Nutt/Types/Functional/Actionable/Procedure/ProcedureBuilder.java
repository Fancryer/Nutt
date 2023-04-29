package Nutt.Types.Functional.Actionable.Procedure;

import Nutt.TypeInferencer;
import Nutt.Types.IValuable;
import gen.NuttParser;

public class ProcedureBuilder
{
	private Signature signature;
	private NuttParser.BlockContext functionBody;
	private IValuable output=TypeInferencer.findType("Nil");

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