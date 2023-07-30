import Nutt.NuttCommon;
import Nutt.NuttEnvironment;
import Nutt.Repl.Repl;

/**  */
public class Main
{
	/**

	 */
	public Main(){}

	//C:\Users\Vadimir.KOMPUTER\.jdks\openjdk-20\bin\java.exe --enable-preview "-javaagent:C:\Side Drive\IntelliJ IDEA Community Edition
	// 2022.1.1\lib\idea_rt.jar=13796:C:\Side Drive\IntelliJ IDEA Community Edition 2022.1.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout
	// .encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath G:\Nutt\out\production\NuttTest;G:\Nutt\javassist.jar;G:\Nutt\big-package$-2
	// .3.2.jar;G:\Nutt\guava-31.1-jre.jar;C:\Users\Vadimir.KOMPUTER\.ivy2\cache\org.scala-lang\scala3-library_3\jars\scala3-library_3-3.2
	// .2.jar;C:\Users\Vadimir.KOMPUTER\.ivy2\cache\org.scala-lang\scala-library\jars\scala-library-2.13.10.jar;G:\antlr-4.12.0-complete
	// .jar;C:\Users\Vadimir.KOMPUTER\.m2\repository\org\projectlombok\lombok\1.18.26\lombok-1.18.26.jar;G:\Nutt\jackson-annotations-2.15
	// .2.jar;G:\Nutt\jackson-core-2.15.2.jar;G:\Nutt\jackson-databind-2.15.2.jar Main G:\\Nutt\\modules\\main.nutt

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

	public static void runModule(java.lang.String path,java.lang.String moduleRootPath)
	{
		new NuttEnvironment(NuttCommon.readFileString(path),moduleRootPath);
	}
}