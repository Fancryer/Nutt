package Nutt;

import gen.NuttBaseVisitor;
import gen.NuttParser;

import java.util.List;

public class NuttParametersVisitor extends NuttBaseVisitor<List<NuttInterpreter.Variable>>
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
	public List<NuttInterpreter.Variable> visitFunc_parameters(NuttParser.Func_parametersContext ctx)
	{
		var declarator=new NuttDeclarationVisitor(parser,interpreter);
		return ctx.parlist().var_decl_list().var_decl().stream().map(v->interpreter.getVariable(declarator.visitVar_decl(v))).toList();
	}
}