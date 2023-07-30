//package Nutt.Visitors;
//
//import Nutt.Exceptions.NuttSuccessReturnException;
//import Nutt.NuttEnvironment;
//import Nutt.NuttInterpreter;
//import Nutt.Types.Functional.Actionable.Procedure.Procedure;
//import Nutt.Types.Functional.Listable.IListable;
//import Nutt.Types.Functional.Listable.String.String;
//import Nutt.Types.Functional.Numerable.Int.Int;
//import Nutt.Types.IValuable;
//import Nutt.Types.Nil;
//import gen.Nutt;
//import org.antlr.v4.runtime.tree.ParseTree;
//import org.antlr.v4.runtime.tree.TerminalNode;
//
//import java.util.*;
//import java.util.function.Supplier;
//
//public class NuttFunctionVisitor extends NuttGenericVisitor<IValuable>
//{
//	private final static java.lang.String[] nativeFunctionNames={"say","sayf","sayn","append","time","systime"};
//
//	public static Supplier<Nil> getNil()
//	{
//		return Nil::new;
//	}
//
//	public static boolean isNativeFunction(java.lang.String name)
//	{
//		return Arrays.asList(nativeFunctionNames).contains(name);
//	}
//
//	public static java.lang.String getFunctionName(List<TerminalNode> nameList)
//	{
//		return nameList!=null?java.lang.String.join(".",nameList
//				.stream()
//				.map(ParseTree::getText)
//				.toList()):"";
//	}
//
//	@Override
//	public IValuable visitFunc_call_exp(Nutt.Func_call_expContext ctx) throws NuttSuccessReturnException
//	{
//		var evaluator=VisitorsPool.evalVisitor;
//		List<IValuable> passedParameters=ctx.arguments==null
//		                                 ?new ArrayList<>()
//		                                 :ctx.arguments.exp().stream().map(evaluator::visit).toList();
//		//Procedure not found, may be native
//		if(Objects.requireNonNull(evaluator.visit(ctx.name)) instanceof Procedure procedure)
//			return procedure.replicate().proceed(passedParameters);
//		System.out.println("ctx = "+NuttEnvironment.toSourceCode(ctx.name));
//		throw new RuntimeException();
//	}
//
//	public IValuable runStaticFunction(Nutt.Functioncall_statContext ctx)
//	{
//		var name=ctx.name.getText();
//		var parameters=ctx.explist()==null
//		               ?new ArrayList<IValuable>()
//		               :getArguments(ctx.explist().exp());
//		return invokeProcedure(NuttInterpreter.currentScope.getValuable(name).asFunctional().asActionable().asProcedure(),parameters);
//	}
//
//	private List<IValuable> getArguments(List<Nutt.ExpContext> contexts)
//	{
//		return contexts.stream().map(VisitorsPool.evalVisitor::visit).toList();
//	}
//
//	public IValuable invokeProcedure(java.lang.String name,List<IValuable> parameters)
//	{
//		return invokeProcedure(getProcedureAtName(name),parameters);
//	}
//
//	public IValuable invokeProcedure(Procedure procedure,List<IValuable> parameters)
//	{
//		try
//		{
//			procedure.replicate().proceed(parameters);
//		}
//		catch(NuttSuccessReturnException e)
//		{
//			return e.getValue();
//		}
//		return new Nil();
//	}
//
//	private Procedure getProcedureAtName(java.lang.String name)
//	{
//		return NuttInterpreter.currentScope.getValuable(name).asFunctional().asActionable().asProcedure();
//	}
//
//	private Supplier<IListable> getAppend(List<IValuable> args)
//	{
//		return ()->args.get(0).asFunctional().asListable().asArray().addAll(args.get(1));
//		//		Function<IValuable,IListable> asArray=v->v
//		//				.asFunctional()
//		//				.asListable()
//		//				.asArray();
//		//		return ()->
//		//		{
//		//			if(args.isEmpty()) return new Array();
//		//			var firstElement=asArray.apply(args.get(0));
//		//			var arr=new Array(firstElement.getElementType(),firstElement.getElements());
//		//			for(int i=1;i<args.size();++i)
//		//			{
//		//				var arg=args.get(i);
//		//				var argType=arg.getType();
//		//				if(!TypeInferencer.verdict(TypeInferencer.findType("Listable"),argType))
//		//				{
//		//					throw new RuntimeException("Cannot append %s to Array!".formatted(argType));
//		//				}
//		//				arr.setElements(NuttCommon.concat(arr.getElements(),asArray
//		//						.apply(arg)
//		//						.getElements()));
//		//			}
//		//			return arr;
//		//		};
//	}
//
//	private Supplier<IValuable> getTime()
//	{
//		return ()->new String(new Date(System.currentTimeMillis()).toString());
//	}
//
//	private Supplier<IValuable> getSystime()
//	{
//		return ()->new Int(System.currentTimeMillis());
//	}
//}