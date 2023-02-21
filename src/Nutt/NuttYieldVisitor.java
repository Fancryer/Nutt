package Nutt;

import Nutt.Types.IValuable;
import gen.NuttBaseVisitor;
import gen.NuttParser;

public class NuttYieldVisitor extends NuttBaseVisitor<IValuable>
{
	NuttParser parser;
	NuttInterpreter interpreter;
	boolean debug;

	public NuttYieldVisitor(NuttParser parser,NuttInterpreter interpreter)
	{
		this(parser,interpreter,false);
	}

	public NuttYieldVisitor(NuttParser parser,NuttInterpreter interpreter,boolean debug)
	{
		this.parser=parser;
		this.interpreter=interpreter;
		this.debug=debug;
	}
}