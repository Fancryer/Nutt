package Nutt.Interpreter;

import Nutt.Types.Functional.Type.Type;

import java.util.ArrayList;
import java.util.List;

//import Nutt.Types.Functional.Actionable.Procedure.Procedure;
//import Nutt.Types.Functional.Record.Record;
//import Nutt.Types.IValuable;
//
//import java.util.ArrayList;
//import java.util.EmptyStackException;
//import java.util.List;
//import java.util.function.Supplier;
//
public final class NuttInterpreter
{
	private final static java.lang.String outputColor="green";
	public static Scope currentScope=new Scope();
	public static List<String> moduleNames=new ArrayList<>();
	public enum EConstantQualifier
	{
		/** Write: <span style="color:red">No</span>, Mutable: <span style="color:red">No</span> */
		Val,
		/** Write: <span style="color:green">Yes</span>, Mutable: <span style="color:red">No</span> */
		Var,
		/** Write: <span style="color:green">Yes</span>, Mutable: <span style="color:green">Yes</span> */
		Mut
	}

	public final static Type typeTree;

	static
	{
		typeTree=new Type("Valuable")
				.addChildrenByNames(List.of("Nil","Functional"));
		var functional=typeTree.findChild("Functional");
		functional
				.addChildrenByNames(List.of("Listable","Numerable","Actionable","Record","Type"))
				.findChild("Numerable")
				.addChildrenByNames(List.of("Int","Float"))
				.findChild("Int")
				.addChild("Boolean");

		functional
				.findChild("Listable")
				.addChildrenByNames(List.of("String","Array","Map","Set"))
				.findChild("Set")
				.addChild("Enumeration");

		functional
				.findChild("Actionable")
				.addChild("Procedure");
	}

	//
	//	public static Context context;
	//
	//	public static IValuable executeBlockAsScope(Supplier<IValuable> valuableSupplier)
	//	{
	//		var oldScope=currentScope;
	//		setScope(createScope());
	//		var value=valuableSupplier.get();
	//		setScope(oldScope);
	//		return value;
	//	}
	//
	//	public static Scope setScope(Scope scope)
	//	{
	//		currentScope=scope;
	//		return currentScope;
	//	}
	//
	//	public static Scope createScope()
	//	{
	//		var scope=new Scope();
	//		scope.parent=currentScope;
	//		return scope;
	//	}
	//
	//	public static void forgetAll()
	//	{
	//		currentScope.clear();
	//	}
	//
	//	public static IValuable getValuable(java.lang.String valuableName)
	//	{
	//		try
	//		{
	//			return getVariable(valuableName);
	//		}
	//		catch(EmptyStackException e)
	//		{
	//			throw new RuntimeException("Interpreter doesn't know the \"%s\" variable".formatted(valuableName),e);
	//		}
	//	}
	//
	//	public static IValuable getVariable(java.lang.String variableName)
	//	{
	//		try
	//		{
	//			return currentScope.getVariable(variableName);
	//		}
	//		catch(EmptyStackException e)
	//		{
	//			throw new RuntimeException("Interpreter doesn't know the \"%s\" variable".formatted(variableName),e);
	//		}
	//	}
	//
	//	public static java.lang.String getColorizedFormat(List<IValuable> valuables)
	//	{
	//		return getColorizedFormat("%s".repeat(valuables.size()));
	//	}
	//
	//	public static java.lang.String getColorizedFormat(java.lang.String format)
	//	{
	//		return "%s".formatted(Nutt.ConsoleColorizer.colorize(format,outputColor));
	//	}
	//
	//	public static List<IValuable> sayFormatted(List<IValuable> args)
	//	{
	//		System.out.printf(getColorizedFormat("%s".repeat(args.size())),args.toArray());
	//		return args;
	//	}
	//
	//	public static IValuable say(IValuable valuable)
	//	{
	//		System.out.printf(getColorizedFormat("%s"),valuable);
	//		return valuable;
	//	}
	//
	//	public static IValuable sayNewLine(IValuable valuable)
	//	{
	//		System.out.printf(getColorizedFormat("%s")+"%n",valuable);
	//		return valuable;
	//	}
	//
	//	public static void clear()
	//	{
	//		forgetAll();
	//		currentScope=new Scope();
	//	}
	//
	//	public static void forget(String name)
	//	{
	//		currentScope.forgetVariable(name);
	//	}
	//
	//	public static void forgetList(List<String> names)
	//	{
	//		for(var name: names) forget(name);
	//	}
	//
	//	public static Procedure getProcedure(java.lang.String name)
	//	{
	//		return getVariable(name)
	//				.asFunctional()
	//				.asActionable()
	//				.asProcedure();
	//	}
	//
	//	public static Record getRecord(java.lang.String name)
	//	{
	//		return getVariable(name)
	//				.asFunctional()
	//				.asRecord();
	//	}
	//
	//	public Scope removeScope()
	//	{
	//		var old=currentScope.clear();
	//		currentScope=currentScope.parent;
	//		return old;
	//	}
	//
}