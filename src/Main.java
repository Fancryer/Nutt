import Nutt.NuttCommon;
import Nutt.NuttEnvironment;

public class Main
{
	public static void main(String[] args)
	{
		var source=NuttCommon.readFile("modules\\main.nutt");
		var ne=new NuttEnvironment(source,false,true);
		//System.out.println(new TypeInferencer().verdict("List","List"));
	}
}