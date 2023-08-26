package Nutt.Interpreter;

import Nutt.Context;
import Nutt.Interpreter.Logging.EActionStatus;
import Nutt.Interpreter.Logging.ESeverity;
import Nutt.Interpreter.References.NuttReference;
import Nutt.NuttCommon;
import Nutt.NuttEnvironment;
import Nutt.Repl.Repl;
import Nutt.Runtime.Mutable;
import Nutt.Types.Functional.Actionable.Procedure.Procedure;
import Nutt.Types.Functional.Type.Native.*;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;
import java.util.function.Supplier;

import static Nutt.NuttEnvironment.nuttLogger;

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
		var valuable=ValuableType.getInstance();
		var nil=NilType.getInstance();
		var functional=FunctionalType.getInstance();
		var listable=ListableType.getInstance();

		var string=StringType.getInstance();
		var array=ArrayType.getInstance();
		var map=MapType.getInstance();
		var set=SetType.getInstance();

		var numerable=NumerableType.getInstance();
		var int_=IntType.getInstance();

		var boolean_=BooleanType.getInstance();
		var float_=FloatType.getInstance();

		var actionable=ActionableType.getInstance();
		var record=RecordType.getInstance();
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
		                                 numerable,
		                                 int_,
		                                 boolean_,
		                                 float_,
		                                 actionable,
		                                 record,
		                                 type,
		                                 procedure);
		System.out.println("currentScope = "+currentScope);
		for(var nativeType: nativeTypeList)
		{
			currentScope.addReference
					            (
							            nativeType.getHeader().getDisplayName(),
							            new NuttReference
									            (
											            nativeType.getHeader().getDisplayName(),
											            new Mutable<>(nativeType),
											            EConstantQualifier.Val
									            )
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
		nuttLogger.appendLog("Variable declaration start",name,ESeverity.Info);
		var reference=currentScope.addReference(name,new NuttReference(name,new Mutable<>(value),qualifier,ceilType));
		nuttLogger.appendLog("Variable declaration end",name,EActionStatus.Success,ESeverity.Info);
		return reference;
	}

	public static NuttReference applyOperator(NuttReference left,NuttReference right,String operatorName)
	{
		return applyOperator(left,right,left.getType().getOperator(operatorName).getValue().simpleCast(Procedure.class));
	}

	public static NuttReference applyOperator(NuttReference left,NuttReference right,Procedure operator)
	{
		return operator.proceed(List.of(left,right));
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

	public static NuttReference say(NuttReference reference)
	{
		System.out.printf(getColorizedFormat("%s"),reference.getValue());
		return reference;
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
				.simpleCast(Procedure.class);
	}

	public static NuttReference getReference(java.lang.String referenceName)
	{
		try
		{
			var reference=currentScope.getReference(referenceName);
			nuttLogger.appendLog("Interpreter getting reference '%s'".formatted(referenceName),"");
			return reference;
		}
		catch(EmptyStackException e)
		{
			nuttLogger.appendLog("Interpreter getting reference '%s'".formatted(referenceName),"",
			                     EActionStatus.Failure,ESeverity.Fatal);
			throw new RuntimeException("Interpreter doesn't know the '%s' variable".formatted(referenceName),e);
		}
	}

	public static void main(java.lang.String[] args) throws Exception
	{
		if(args.length==0)
			new Repl().loop();
		else runModule(args[0]);
	}

	public static void runModule(java.lang.String path)
	{
		runModule(path,"modules");
	}

	//C:\Users\Vadimir.KOMPUTER\.jdks\openjdk-20\bin\java.exe --enable-preview "-javaagent:C:\Side Drive\IntelliJ IDEA Community Edition
	// 2022.1.1\lib\idea_rt.jar=13796:C:\Side Drive\IntelliJ IDEA Community Edition 2022.1.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout
	// .encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath G:\Nutt\out\production\NuttTest;G:\Nutt\javassist.jar;G:\Nutt\big-package$-2
	// .3.2.jar;G:\Nutt\guava-31.1-jre.jar;C:\Users\Vadimir.KOMPUTER\.ivy2\cache\org.scala-lang\scala3-library_3\jars\scala3-library_3-3.2
	// .2.jar;C:\Users\Vadimir.KOMPUTER\.ivy2\cache\org.scala-lang\scala-library\jars\scala-library-2.13.10.jar;G:\antlr-4.12.0-complete
	// .jar;C:\Users\Vadimir.KOMPUTER\.m2\repository\org\projectlombok\lombok\1.18.26\lombok-1.18.26.jar;G:\Nutt\jackson-annotations-2.15
	// .2.jar;G:\Nutt\jackson-core-2.15.2.jar;G:\Nutt\jackson-databind-2.15.2.jar Main G:\\Nutt\\modules\\main.nutt

	public static void runModule(java.lang.String path,java.lang.String moduleRootPath)
	{
		new NuttEnvironment(NuttCommon.readFileString(path),moduleRootPath);
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