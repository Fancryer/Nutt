package Nutt;

import java.util.Map;
import java.util.TreeMap;

public class ConsoleColorizer
{
	private static final String Red="\u001b[31m";
	private static final String Green="\u001b[32m";
	private static final String Blue="\u001b[34m";
	private static final String Cyan="\u001b[36m";
	private static final String Magenta="\u001b[35m";
	private static final String Yellow="\u001b[33m";
	private static final String Black="\u001b[30m";
	private static final String White="\u001b[37m";
	private static final String Reset="\u001b[0m";

	public static String colorize(String content,String color)
	{
		return getColorMap().get(color.toLowerCase())+content+Reset;
		//		return doesConsoleSupportAnsi()
		//		       ?getColorMap().get(color.toLowerCase())+content+Reset
		//		       :content;
	}

	private static boolean doesConsoleSupportAnsi()
	{
		return System.console()!=null&&System.getenv().get("TERM")!=null;
	}

	public static Map<String,String> getColorMap()
	{
		var colorMap=new TreeMap<String,String>();
		colorMap.put("black",Black);
		colorMap.put("white",White);
		colorMap.put("red",Red);
		colorMap.put("green",Green);
		colorMap.put("blue",Blue);
		colorMap.put("yellow",Yellow);
		colorMap.put("magenta",Magenta);
		colorMap.put("cyan",Cyan);
		return colorMap;
	}

}