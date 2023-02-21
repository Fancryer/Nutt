package Nutt;

import Nutt.Types.Functional.Actionable.Procedure.Procedure;
import Nutt.Types.IValuable;
import Nutt.Types.Nil;
import gen.NuttBaseVisitor;
import gen.NuttParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class NuttFunctionVisitor extends NuttBaseVisitor<IValuable>
{
	NuttParser parser;
	NuttInterpreter interpreter;
	boolean debug;

	public NuttFunctionVisitor(NuttParser parser,NuttInterpreter interpreter)
	{
		this(parser,interpreter,false);
	}

	public NuttFunctionVisitor(NuttParser parser,NuttInterpreter interpreter,boolean debug)
	{
		this.parser=parser;
		this.interpreter=interpreter;
		this.debug=debug;
	}

	public String getFunctionName(List<TerminalNode> nameList)
	{
		return nameList!=null?String.join(".",nameList.stream().map(ParseTree::getText).toList()):"";
	}

	private boolean isNativeFunction(String name)
	{
		return "sys.io.say".equals(name)||"say".equals(name);
	}

	@Override
	public IValuable visitFunctioncall(NuttParser.FunctioncallContext ctx)
	{
		var fullName=getFunctionName(ctx.NAME());

		String defined=isNativeFunction(fullName)?"native ":
				interpreter.currentScope.defined(fullName)?"defined ":"not defined ";
		if(debug) System.out.printf("Trying to call %sfunction %s!%n",defined,fullName);

		if(!isNativeFunction(fullName))
		{
			var procedureInstance=interpreter.getProcedure(fullName).setEnvironment(parser,interpreter);
			System.out.println(procedureInstance);
		}

		return runFunction(fullName,ctx.explist()==null?new ArrayList<>():getArguments(ctx.explist().varExpOrPar()));
	}

	private List<IValuable> getArguments(List<NuttParser.VarExpOrParContext> contexts)
	{
		return contexts.stream().map(ctx->new NuttEvalVisitor(parser,interpreter).visitVarExpOrPar(ctx)).toList();
	}

	private IValuable runFunction(String name,List<IValuable> parameters)
	{
		if(List.of("sys.io.say","say").contains(name))
		{
			var sb="%s".repeat(parameters.size());
			var args=new Object[parameters.size()];
			for(int i=0;i<args.length;++i) args[i]=parameters.get(i).getValue();
			sb+="%n";
			interpreter.sayFormatted(sb,args);
			return new Nil();
		}
		try
		{
			return invokeProcedure(name,parameters).yield();
		}
		catch(EmptyStackException e)
		{
			throw new RuntimeException("Undefined function call!",e);
		}
	}

	private Procedure invokeProcedure(String name,List<IValuable> parameters)
	{
		return new Procedure(getProcedureAtName(name)).proceed(parameters);
	}

	private Procedure getProcedureAtName(String name)
	{
		return interpreter.currentScope.getValuable(name).asFunctional().asActionable().asProcedure();
	}

	//	@Override
	//	public IValuable visitFunctionCallExp(NuttParser.FunctionCallExpContext ctx)
	//	{
	//		if(debug) System.out.println(ctx.funcname());
	//		return new Procedure();
	//	}
}