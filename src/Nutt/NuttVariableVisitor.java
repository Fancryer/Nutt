package Nutt;

import Nutt.NuttInterpreter;
import gen.NuttBaseVisitor;
import gen.NuttParser;

public class NuttVariableVisitor extends NuttBaseVisitor<String>
{
	NuttParser parser;
	NuttInterpreter interpreter;
	boolean debug;

	public NuttVariableVisitor(NuttParser parser,NuttInterpreter interpreter)
	{
		this(parser,interpreter,false);
	}

	public NuttVariableVisitor(NuttParser parser,NuttInterpreter interpreter,boolean debug)
	{
		this.parser=parser;
		this.interpreter=interpreter;
		this.debug=debug;
	}

	@Override
	public String visitVar(NuttParser.VarContext ctx)
	{
		java.lang.String variableName;
		if(ctx.NAME()!=null)
		{
			variableName=ctx.NAME().getSymbol().getText();
			if(debug) System.out.println("Variable visited: "+variableName);
			return variableName;
		}
		throw new RuntimeException();
	}

	@Override
	public String visitExplicit_variable(NuttParser.Explicit_variableContext ctx)
	{
		return ctx.var().NAME().getSymbol().getText();
	}
}