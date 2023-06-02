import Nutt.NuttCommon;
import Nutt.NuttEnvironment;
import Nutt.Types.Functional.Actionable.Procedure.Native.Say;

public class Main
{
	public static void main(java.lang.String[] args)
	{
		System.out.println(new Say());
		//		NuttInterpreter.sayNewLine(new String("0_1_1"));
		//		NuttInterpreter.sayFormatted(List.of(new String("1_0_1")));
		//		if(args.length==0)
		//		{
		//			new Repl().loop();
		//		}
		//		else runModule(args[0]);
	}

	public static void runModule(java.lang.String path)
	{
		runModule(path,"modules");
	}

	public static void runModule(java.lang.String path,java.lang.String moduleRootPath)
	{
		new NuttEnvironment(NuttCommon.readFile(path),moduleRootPath);
	}
}