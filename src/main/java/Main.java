import Nutt.Interpreter.AnonymousNuttReference;
import Nutt.Interpreter.NuttInterpreter.EConstantQualifier;
import Nutt.Interpreter.NuttReference;
import Nutt.Runtime.Mutable;
import Nutt.Types.Functional.Numerable.Int.Int;

import java.util.List;
import java.util.Map;

public class Main
{
	//C:\Users\Vadimir.KOMPUTER\.jdks\openjdk-20\bin\java.exe --enable-preview "-javaagent:C:\Side Drive\IntelliJ IDEA Community Edition
	// 2022.1.1\lib\idea_rt.jar=13796:C:\Side Drive\IntelliJ IDEA Community Edition 2022.1.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout
	// .encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath G:\Nutt\out\production\NuttTest;G:\Nutt\javassist.jar;G:\Nutt\big-package$-2
	// .3.2.jar;G:\Nutt\guava-31.1-jre.jar;C:\Users\Vadimir.KOMPUTER\.ivy2\cache\org.scala-lang\scala3-library_3\jars\scala3-library_3-3.2
	// .2.jar;C:\Users\Vadimir.KOMPUTER\.ivy2\cache\org.scala-lang\scala-library\jars\scala-library-2.13.10.jar;G:\antlr-4.12.0-complete
	// .jar;C:\Users\Vadimir.KOMPUTER\.m2\repository\org\projectlombok\lombok\1.18.26\lombok-1.18.26.jar;G:\Nutt\jackson-annotations-2.15
	// .2.jar;G:\Nutt\jackson-core-2.15.2.jar;G:\Nutt\jackson-databind-2.15.2.jar Main G:\\Nutt\\modules\\main.nutt
	public static void main(java.lang.String[] args) throws Exception
	{
		Map<String,NuttReference> variables=new java.util.HashMap<>();
		NuttReference a=new NuttReference("a",new Mutable<>(new Int(3)),EConstantQualifier.Mut);
		variables.put("a",a);
		System.out.println("a is "+variables.get("a").getMutable());
		NuttReference b=new NuttReference("b",a.getMutable(),EConstantQualifier.Var);
		variables.put("b",b);
		b.setValue(b.getMutable()
		            .get()
		            .getType()
		            .getOperator("+")
		            .proceed(List.of(b,new AnonymousNuttReference(new Int(3),EConstantQualifier.Mut))));
		System.out.println("b is "+b.getMutable());
		System.out.println("a is "+variables.get("a").getMutable());
		System.out.println(b.isMutable());

		//
		//		if(args.length==0)
		//			new Repl().loop();
		//else runModule(args[0]);
	}

	//	public static void runModule(java.lang.String path)
	//	{
	//		runModule(path,"modules");
	//	}
	//
	//	public static void runModule(java.lang.String path,java.lang.String moduleRootPath)
	//	{
	//		new NuttEnvironment(NuttCommon.readFileString(path),moduleRootPath);
	//	}
}