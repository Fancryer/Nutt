package Nutt.Visitors;

import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.NuttCommon;
import Nutt.NuttEnvironment;
import Nutt.NuttInterpreter;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Actionable.Procedure.Procedure;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.IListable;
import Nutt.Types.Functional.Listable.String.String;
import Nutt.Types.Functional.Numerable.Int.Int;
import Nutt.Types.IValuable;
import Nutt.Types.Nil;
import gen.NuttParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;

public class NuttFunctionVisitor extends NuttGenericVisitor
{
	public static Supplier<Nil> getNil()
	{
		return Nil::new;
	}

	public static boolean isNativeFunction(java.lang.String name)
	{
		List<java.lang.String> nativeNames=List.of("say","sayf","sayn","append","time","systime");
		return nativeNames.contains(name);
	}

	public static java.lang.String getFunctionName(List<TerminalNode> nameList)
	{
		return nameList!=null?java.lang.String.join(".",nameList
				.stream()
				.map(ParseTree::getText)
				.toList()):"";
	}

	@Override
	public IValuable visitFunc_call_exp(NuttParser.Func_call_expContext ctx) throws NuttSuccessReturnException
	{
		var evaluator=new NuttEvalVisitor();
		var evaluated=evaluator.visit(ctx.functioncall().NAME());
		List<IValuable> passedParameters=ctx.functioncall().arguments==null
		                                 ?new ArrayList<>()
		                                 :ctx.functioncall().arguments.exp().stream().map(evaluator::visit).toList();
		if(evaluated==null)
		{
			var nativeFunctionName=NuttEnvironment.toSourceCode(ctx.functioncall().NAME());
			try
			{
				throw invokeNative(nativeFunctionName,passedParameters);
			}
			catch(NuttSuccessReturnException e)
			{
				return e.getValue();
			}
		}
		if(Objects.requireNonNull(evaluated) instanceof Procedure procedure)
			procedure.replicate().proceed(passedParameters);
		throw new RuntimeException();
	}

	@Override
	public IValuable visitFunctioncall(NuttParser.FunctioncallContext ctx) throws NuttSuccessReturnException
	{
		var fullName=ctx
				.NAME()
				.getText();
		try
		{
			var arguments=ctx.explist()==null
			              ?new ArrayList<IValuable>()
			              :getArguments(ctx
					                            .explist()
					                            .exp());
			runFunction(fullName,arguments);
		}
		catch(NuttSuccessReturnException e)
		{
			return e.getValue();
		}
		throw new RuntimeException();
	}

	private void runFunction(java.lang.String name,List<IValuable> parameters)
			throws NuttSuccessReturnException
	{
		if(isNativeFunction(name)) throw invokeNative(name,parameters);
		invokeProcedure(name,parameters);
	}

	private List<IValuable> getArguments(List<NuttParser.ExpContext> contexts)
	{
		return contexts.stream().map(ctx->new NuttEvalVisitor().visit(ctx)).toList();
	}

	public void invokeProcedure(java.lang.String name,List<IValuable> parameters) throws NuttSuccessReturnException
	{
		invokeProcedure(getProcedureAtName(name),parameters);
	}

	public void invokeProcedure(Procedure procedure,List<IValuable> parameters) throws NuttSuccessReturnException
	{
		procedure.replicate().proceed(parameters);
	}

	private Procedure getProcedureAtName(java.lang.String name)
	{
		return NuttInterpreter.currentScope.getValuable(name).asFunctional().asActionable().asProcedure();
	}

	public NuttSuccessReturnException invokeNative(java.lang.String name,List<IValuable> parameters)
			throws NuttSuccessReturnException
	{
		return new NuttSuccessReturnException
				(
						(
								switch(name)
								{
									case "say" -> getSay(parameters);
									case "sayn" -> getSayn(parameters);
									case "sayf" -> getSayf(parameters);
									case "append" -> getAppend(parameters);
									case "time" -> getTime();
									case "systime" -> getSystime();
									default -> getNil();
								}
						).get()
				);
	}

	private Supplier<Nil> getSayn(List<IValuable> args)
	{
		if(args.size()>1) throw new RuntimeException();
		return ()->
		{
			NuttInterpreter.say(args.get(0));
			return new Nil();
		};
	}

	private Supplier<IValuable> getSayf(List<IValuable> args)
	{
		return ()->
		{
			NuttInterpreter.sayFormatted(args);
			return new Nil();
		};
	}

	private Supplier<IValuable> getSay(List<IValuable> args)
	{
		if(args.size()>1) throw new RuntimeException();
		return ()->
		{
			NuttInterpreter.sayNewLine(args.get(0));
			return new Nil();
		};
	}

	private Supplier<IListable> getAppend(List<IValuable> args)
	{
		Function<IValuable,IListable> asArray=v->v
				.asFunctional()
				.asListable()
				.asArray();
		return ()->
		{
			if(args.isEmpty()) return new Array();
			var firstElement=asArray.apply(args.get(0));
			var arr=new Array(firstElement.getElementType(),firstElement.getElements());
			for(int i=1;i<args.size();++i)
			{
				var arg=args.get(i);
				var argType=arg.getType();
				if(!TypeInferencer.verdict(TypeInferencer.findType("Listable"),argType))
				{
					throw new RuntimeException("Cannot append %s to Array!".formatted(argType));
				}
				arr.setElements(NuttCommon.concat(arr.getElements(),asArray
						.apply(arg)
						.getElements()));
			}
			return arr;
		};
	}

	private Supplier<IValuable> getTime()
	{
		return ()->new String(new Date(System.currentTimeMillis()).toString());
	}

	private Supplier<IValuable> getSystime()
	{
		return ()->new Int(java.lang.String.valueOf(System.currentTimeMillis()));
	}
}