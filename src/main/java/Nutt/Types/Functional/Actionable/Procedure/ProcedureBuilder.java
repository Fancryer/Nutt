package Nutt.Types.Functional.Actionable.Procedure;

import Nutt.Interpreter.References.NuttReference;
import Nutt.TypeInferencer;
import gen.Nutt;

public class ProcedureBuilder
{
	private Signature signature;
	private Nutt.BlockContext functionBody;
	private NuttReference output=TypeInferencer.findTypeReference("Nil");

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

	public ProcedureBuilder setOutput(NuttReference output)
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