package Nutt;

import gen.NuttBaseVisitor;
import gen.NuttParser;

import java.util.List;

public class NuttParametersVisitor extends NuttBaseVisitor<List<String>>
{
	NuttParser parser;
	NuttInterpreter interpreter;
	boolean debug;

	public NuttParametersVisitor(NuttParser parser,NuttInterpreter interpreter)
	{
		this(parser,interpreter,false);
	}

	public NuttParametersVisitor(NuttParser parser,NuttInterpreter interpreter,boolean debug)
	{
		this.parser=parser;
		this.interpreter=interpreter;
		this.debug=debug;
	}
	
	@Override
	public List<String> visitFunc_parameters(NuttParser.Func_parametersContext ctx)
	{
		var declarator=new NuttDeclarationVisitor(parser,interpreter);
		return ctx.parlist().namelist().var_decl().stream().map(declarator::visitVar_decl).toList();
	}
}