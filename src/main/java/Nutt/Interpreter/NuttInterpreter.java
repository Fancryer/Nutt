package Nutt.Interpreter;

import Nutt.Context;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Runtime.Mutable;
import Nutt.Types.Functional.Actionable.Procedure.Procedure;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;
import java.util.function.Supplier;

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
	public final static Type typeTree;
	private final static java.lang.String outputColor="green";
	public static Scope currentScope=new Scope();
	public static List<String> moduleNames=new ArrayList<>();
	public static Context context;

	static
	{
		var valuable=new Type("Valuable");
		var nil=new Type(valuable,"Nil");
		var functional=new Type(valuable,"Functional");
		var listable=new Type(functional,"Listable");

		var string=new Type(listable,"String");
		var array=new Type(listable,"Array");
		var map=new Type(listable,"Map");
		var set=new Type(listable,"Set");
		var enumeration_=new Type(set,"Enumeration");

		var numerable=new Type(functional,"Numerable");
		var int_=new Type(numerable,"Int");
		var boolean_=new Type(int_,"Boolean");
		var float_=new Type(numerable,"Float");

		var actionable=new Type(functional,"Actionable");
		var record=new Type(functional,"Record");
		var type=new Type(functional,"Type");

		var procedure=new Type(actionable,"Procedure");

		var nativeTypeList=Arrays.asList(valuable,
		                                 nil,
		                                 functional,
		                                 listable,
		                                 string,
		                                 array,
		                                 map,
		                                 set,
		                                 enumeration_,
		                                 numerable,
		                                 int_,
		                                 boolean_,
		                                 float_,
		                                 actionable,
		                                 record,
		                                 type,
		                                 procedure);
		for(var nativeType: nativeTypeList)
		{
			currentScope.addReference
					            (
							            nativeType.getDisplayName(),
							            new NuttReference(nativeType.getDisplayName(),new Mutable<>(nativeType),EConstantQualifier.Val)
					            );
		}
		typeTree=valuable;
	}

	public static Scope getGlobalScope()
	{
		var scope=currentScope;
		while(scope.parent!=null) scope=scope.parent;
		return scope;
	}

	public static NuttReference declareVariable(String name,Type ceilType,IValuable value,EConstantQualifier qualifier)
	{
		return currentScope.addReference(name,new NuttReference(name,new Mutable<>(value),qualifier,ceilType));
	}

	public static NuttReference executeBlockAsScope(Supplier<NuttReference> referenceSupplier)
	{
		var oldScope=currentScope;
		setScope(createScope());
		var value=referenceSupplier.get();
		setScope(oldScope);
		return value;
	}

	public static Scope setScope(Scope scope)
	{
		currentScope=scope;
		return currentScope;
	}

	public static Scope createScope()
	{
		var scope=new Scope();
		scope.parent=currentScope;
		return scope;
	}

	public static java.lang.String getColorizedFormat(List<IValuable> valuables)
	{
		return getColorizedFormat("%s".repeat(valuables.size()));
	}

	public static java.lang.String getColorizedFormat(java.lang.String format)
	{
		return "%s".formatted(Nutt.ConsoleColorizer.colorize(format,outputColor));
	}

	public static List<NuttReference> sayFormatted(List<NuttReference> args)
	{
		System.out.printf(getColorizedFormat("%s".repeat(args.size())),args.toArray());
		return args;
	}

	public static NuttReference say(NuttReference valuable)
	{
		System.out.printf(getColorizedFormat("%s"),valuable);
		return valuable;
	}

	public static NuttReference sayNewLine(NuttReference reference)
	{
		System.out.printf(getColorizedFormat("%s")+"%n",reference.getValue());
		return reference;
	}

	public static void clear()
	{
		forgetAll();
		currentScope=new Scope();
	}

	public static void forgetAll()
	{
		currentScope.clear();
	}

	public static void forgetList(List<String> names)
	{
		for(var name: names) forget(name);
	}

	public static void forget(String name)
	{
		currentScope.forgetReference(name);
	}

	public static Procedure getProcedure(java.lang.String name)
	{
		return getReference(name)
				.getValue()
				.asFunctional()
				.asActionable()
				.asProcedure();
	}

	public static NuttReference getReference(java.lang.String referenceName)
	{
		try
		{
			return currentScope.getReference(referenceName);
		}
		catch(EmptyStackException e)
		{
			throw new RuntimeException("Interpreter doesn't know the \"%s\" variable".formatted(referenceName),e);
		}
	}

	public Scope removeScope()
	{
		var old=currentScope.clear();
		currentScope=currentScope.parent;
		return old;
	}

	public enum EConstantQualifier
	{
		/** Write: <span style="color:red">No</span>, Mutate: <span style="color:red">No</span> */
		Val,
		/** Write: <span style="color:green">Yes</span>, Mutate: <span style="color:red">No</span> */
		Var,
		/** Write: <span style="color:green">Yes</span>, Mutate: <span style="color:green">Yes</span> */
		Mut
	}
}