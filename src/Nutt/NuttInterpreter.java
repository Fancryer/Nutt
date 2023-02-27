package Nutt;

import Nutt.Types.Functional.Actionable.Procedure.Procedure;
import Nutt.Types.IValuable;
import gen.NuttParser;

import java.util.EmptyStackException;
import java.util.List;
import java.util.Objects;

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

	public void sayFormatted(String format,List<Object> args)
	{
		sayFormatted(format,args.toArray());
	}

	public void sayNewLine(Object o)
	{
		System.out.println(ConsoleColorizer.colorize(o.toString(),outputColor));
	}

	public void clear()
	{
		forgetAll();
		currentScope=new NuttScope();
	}

	public static class Variable
	{
		public String ceilType;
		public IValuable valuable;
		public boolean isConstant;
		public String name;

		public Variable(String ceilType,IValuable valuable,String name,boolean isConstant)
		{
			setCeilType(ceilType).setValuable(valuable).setName(name).setConstant(isConstant);
		}

		public Variable rebase(Variable variable)
		{
			return this.setCeilType(variable.ceilType)
			           .setValuable(variable.valuable)
			           .setName(variable.name)
			           .setConstant(variable.isConstant);
		}

		public Variable setName(String name)
		{
			this.name=name;
			return this;
		}

		public Variable setCeilType(String ceilType)
		{
			this.ceilType=ceilType;
			return this;
		}

		public Variable setValuable(IValuable valuable)
		{
			this.valuable=valuable;
			return this;
		}

		public Variable setConstant(boolean constant)
		{
			isConstant=constant;
			return this;
		}

		@Override
		public String toString()
		{
			return "Variable{name='%s' ceilType='%s', value='%s', isConstant='%s'}".formatted(name,ceilType,valuable,
			                                                                                  isConstant);
		}
	}

	public NuttScope createScope()
	{
		var scope=new NuttScope();
		scope.parent=currentScope;
		return scope;
	}

	public NuttScope setScope(NuttScope scope)
	{
		currentScope=scope;
		return currentScope;
	}

	public NuttScope removeScope()
	{
		//if(currentScope.parent==null) return currentScope;
		var old=currentScope;
		currentScope=currentScope.parent;
		return old;
	}

	public void importModule(String moduleContent,NuttStatementVisitor statementVisitor)
	{
		var importedChunk=NuttEnvironment.getTempParser(moduleContent).chunk();
		if(importedChunk.module()!=null)
		{
			if(importedChunk.module().block()!=null)
			{
				importedChunk.module()
				             .block()
				             .stat()
				             .stream()
				             .map(NuttParser.StatContext::functiondef_stat)
				             .filter(Objects::nonNull)
				             .toList()
				             .forEach(statementVisitor::visitFunctiondef_stat);
			}
		}
		statementVisitor.visit(importedChunk);
	}

	public void importModule(NuttParser.Module_nameContext ctx,NuttStatementVisitor statementVisitor)
	{
		if(ctx==null) return;
		importModule(NuttCommon.readFile("modules\\"+statementVisitor.visitModule_name(ctx)+".nutt"),statementVisitor);
	}
}