package Nutt;

import Nutt.Types.Functional.Actionable.Procedure.Procedure;
import Nutt.Types.IValuable;

import java.util.EmptyStackException;

public class NuttInterpreter
{
	private final String outputColor="green";
	public NuttScope currentScope;

	NuttStatementVisitor statementVisitor;

	public NuttInterpreter()
	{
		currentScope=new NuttScope();
	}

	public void forgetAll()
	{
		currentScope.variableMap.clear();
	}

	public IValuable getValuable(String valuableName)
	{
		try
		{
			return getVariable(valuableName).valuable;
		}
		catch(EmptyStackException e)
		{
			throw new RuntimeException("Interpreter doesn't know the \"%s\" variable".formatted(valuableName),e);
		}
	}

	public Variable getVariable(String variableName)
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

	public Procedure getProcedure(String procedureName)
	{
		return getVariable(procedureName).valuable.asFunctional().asActionable().asProcedure();
	}
	
	public void say(Object o)
	{
		System.out.print(ConsoleColorizer.colorize(o.toString(),outputColor));
	}

	public void sayFormatted(String format,Object... args)
	{
		System.out.printf("%s".formatted(ConsoleColorizer.colorize(format,outputColor)),args);
	}

	public void sayNewLine(Object o)
	{
		System.out.println(ConsoleColorizer.colorize(o.toString(),outputColor));
	}

	public static class Variable
	{
		public String ceilType;
		public IValuable valuable;
		public boolean isConstant;

		public Variable(IValuable valuable,String ceilType)
		{
			this(ceilType,valuable);
		}

		public Variable(IValuable valuable,String ceilType,boolean isConstant)
		{
			this(ceilType,valuable);
		}

		public Variable(String ceilType,IValuable valuable,boolean isConstant)
		{
			this.ceilType=ceilType;
			this.valuable=valuable;
			this.isConstant=isConstant;
		}

		public Variable(String ceilType,IValuable valuable)
		{
			this(ceilType,valuable,false);
		}

		public Variable(IValuable valuable)
		{
			this(valuable.getType(),valuable);
		}

		public Variable rebase(Variable variable)
		{
			ceilType=variable.ceilType;
			valuable=variable.valuable;
			isConstant=variable.isConstant;
			return this;
		}

		@Override
		public String toString()
		{
			return "Variable{ceilType='%s', value='%s', isConstant='%s'}".formatted(ceilType,valuable,isConstant);
		}
	}
	
}