package Nutt;

import Nutt.Types.Functional.Actionable.Procedure.Procedure;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.IValuable;
import Nutt.Types.Nil;
import gen.NuttBaseVisitor;
import gen.NuttParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;

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
		List<String> nativeNames=List.of("sys.io.say","say","sys.array.append","append");
		return nativeNames.contains(name);
	}

	@Override
	public IValuable visitFunctioncall(NuttParser.FunctioncallContext ctx)
	{
		var fullName=getFunctionName(ctx.NAME());
		return runFunction(fullName,ctx.explist()==null?new ArrayList<>():getArguments(ctx.explist().exp()));
	}

	private List<IValuable> getArguments(List<NuttParser.ExpContext> contexts)
	{
		return contexts.stream().map(ctx->new NuttEvalVisitor(parser,interpreter).visit(ctx)).toList();
	}

	private Supplier<IValuable> getSay(List<IValuable> args)
	{
		return ()->
		{
			interpreter.sayFormatted("%s".repeat(args.size())+"%n",args.stream().map(IValuable::getValue).toList()); ;
			return new Nil();
		};
	}

	private Supplier<Array> getAppend(List<IValuable> args)
	{
		Function<IValuable,Array> asArray=v->v.asFunctional().asListable().asArray();
		System.out.println(args.stream().map(IValuable::getValue).toList());
		var arrays=new ArrayList<IValuable>();
		return ()->
		{
			try
			{
				if(args.isEmpty()) return new Array();
				var firstElement=asArray.apply(args.get(0));
				var arr=new Array(firstElement.getElementType(),firstElement.getElements());
				for(int i=1;i<args.size();++i)
				{
					if(!Objects.equals(args.get(i).getType(),"Array"))
					{
						throw new RuntimeException("Cannot append %s to Array!".formatted(args.get(i).getType()));
					}
					var old=arr.getElements();
					old.addAll(asArray.apply(args.get(i)).getElements());
					arr.setElements(old);
				}
				System.out.println(arrays);
				return arr;
			}
			catch(Exception e)
			{
				throw new RuntimeException(e);
			}
			//return new Array();
		};
	}

	private IValuable invokeNative(String name,List<IValuable> parameters)
	{
		if(List.of("sys.io.say","say").contains(name))
		{
			return getSay(parameters).get();
		}
		if(List.of("sys.array.append","append").contains(name))
		{
			return getAppend(parameters).get();
		}
		return new Nil();
	}

	@Override public IValuable visitFunc_call_exp(NuttParser.Func_call_expContext ctx)
	{
		var functionName=getFunctionName(ctx.funcname().NAME());
		List<IValuable> passedParameters=
				ctx.arguments==null?new ArrayList<>():
				ctx.arguments.exp().stream().map(new NuttEvalVisitor(parser,interpreter)::visit).toList();
		if(isNativeFunction(functionName)) return invokeNative(functionName,passedParameters);
		return new Procedure(interpreter.getProcedure(functionName)).setEnvironment(parser,interpreter)
		                                                            .proceed(passedParameters)
		                                                            .yield();
	}

	private IValuable runFunction(String name,List<IValuable> parameters)
	{
		if(isNativeFunction(name)) return invokeNative(name,parameters);
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