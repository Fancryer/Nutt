package Nutt;

import Nutt.Types.Functional.Actionable.Procedure.Procedure;
import Nutt.Types.Functional.Record.Record;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.function.Supplier;

public final class NuttInterpreter
{
	private final static java.lang.String outputColor="green";
	public static Scope currentScope=new Scope();
	public static List<java.lang.String> moduleNames=new ArrayList<>();

	public static Context context;

	public static IValuable executeBlockAsScope(Supplier<IValuable> valuableSupplier)
	{
		var oldScope=currentScope;
		setScope(createScope());
		var value=valuableSupplier.get();
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

	public static void forgetAll()
	{
		currentScope.clear();
	}

	public static IValuable getValuable(java.lang.String valuableName)
	{
		try
		{
			var variable=getVariable(valuableName);
			return variable!=null?variable.valuable:null;
		}
		catch(EmptyStackException e)
		{
			throw new RuntimeException("Interpreter doesn't know the \"%s\" variable".formatted(valuableName),e);
		}
	}

	public static Variable getVariable(java.lang.String variableName)
	{
		try
		{
			return currentScope.getVariable(variableName);
		}
		catch(EmptyStackException e)
		{
			throw new RuntimeException("Interpreter doesn't know the \"%s\" variable".formatted(variableName),e);
		}
	}

	public static java.lang.String getColorizedFormat(List<IValuable> valuables)
	{
		return getColorizedFormat("%s".repeat(valuables.size()));
	}

	public static java.lang.String getColorizedFormat(java.lang.String format)
	{
		return "%s".formatted(ConsoleColorizer.colorize(format,outputColor));
	}

	public static List<IValuable> sayFormatted(List<IValuable> args)
	{
		System.out.printf(getColorizedFormat("%s".repeat(args.size())),args.toArray());
		return args;
	}

	public static IValuable say(IValuable valuable)
	{
		System.out.printf(getColorizedFormat("%s"),valuable);
		return valuable;
	}

	public static IValuable sayNewLine(IValuable valuable)
	{
		System.out.printf(getColorizedFormat("%s")+"%n",valuable);
		return valuable;
	}

	public static void clear()
	{
		forgetAll();
		currentScope=new Scope();
	}

	public static void forget(String name)
	{
		currentScope.forgetVariable(name);
	}

	public static void forgetList(List<String> names)
	{
		for(var name: names) forget(name);
	}

	public static Procedure getProcedure(java.lang.String name)
	{
		return getVariable(name).valuable
				.asFunctional()
				.asActionable()
				.asProcedure();
	}

	public static Record getRecord(java.lang.String name)
	{
		return getVariable(name).valuable
				.asFunctional()
				.asRecord();
	}

	public Scope removeScope()
	{
		//if(currentScope.parent==null) return currentScope;
		var old=currentScope.clear();
		currentScope=currentScope.parent;
		return old;
	}

	public static class Variable
	{
		public Type ceilType;
		public IValuable valuable;
		public boolean isConstant;
		public java.lang.String name;

		public Variable(Type ceilType,IValuable valuable,java.lang.String name,boolean isConstant)
		{
			setCeilType(ceilType)
					.setValuable(valuable)
					.setName(name)
					.setConstant(isConstant);
		}

		public Variable setConstant(boolean constant)
		{
			isConstant=constant;
			return this;
		}

		public Variable setName(java.lang.String name)
		{
			this.name=name;
			return this;
		}

		public Variable setCeilType(Type ceilType)
		{
			this.ceilType=ceilType;
			return this;
		}

		public Variable rebase(Variable variable)
		{
			return this
					.setCeilType(variable.ceilType)
					.setValuable(variable.valuable)
					.setName(variable.name)
					.setConstant(variable.isConstant);
		}

		@Override
		public java.lang.String toString()
		{
			return "Variable{name='%s' ceilType='%s', value='%s', isConstant='%s'}".formatted(name,ceilType,valuable,
			                                                                                  isConstant);
		}

		public IValuable getValuable()
		{
			return valuable;
		}

		public Variable setValuable(IValuable valuable)
		{
			this.valuable=valuable;
			return this;
		}
	}
}