import Nutt.NuttCommon;
import Nutt.NuttEnvironment;
import Nutt.Repl.Repl;

public class Main
{
	public static void main(String[] args)
	{
		if(args.length==0)
		{
			new Repl().loop();
		}
		else runModule(args[0]);
	}

	public static void runModule(String path)
	{
		runModule(path,"modules");
	}

	public static void runModule(String path,String moduleRootPath)
	{
		new NuttEnvironment(NuttCommon.readFile(path),moduleRootPath);
	}
}