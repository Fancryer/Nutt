package Nutt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class NuttCommon
{
	private static final List<String> nuttTypes=List.of("Valuable","Nil","Functional","Actionable","Procedure","Macro","Numerable","Int","Float","Listable",
	                                                    "Array","Map","String","Set","Enumeration");

	public static boolean isTypeValid(String type)
	{
		return nuttTypes.contains(type);
	}

	public static List<String> getNuttTypes()
	{
		return new ArrayList<>(nuttTypes);
	}

	public static String readFile(String path)
	{
		String source;
		try
		{
			source=Files.readString(Path.of(path));//.replaceAll("[^\\x00-\\x7F]","");
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		}
		return source;
	}

	public static class PrettyPrintingMap<K,V>
	{
		private final Map<K,V> map;

		public PrettyPrintingMap(Map<K,V> map)
		{
			this.map=map;
		}

		public java.lang.String toString()
		{
			var sb=new StringBuilder();
			var iter=map.entrySet().iterator();
			while(iter.hasNext())
			{
				var entry=iter.next();
				sb.append(entry.getKey()).append('=').append('"').append(entry.getValue()).append('"');
				if(iter.hasNext()) sb.append(',').append(' ');
			}
			return sb.toString();
		}
	}

	public static <T> List<T> getOrEmpty(List<T> collection)
	{
		return Objects.requireNonNullElse(collection,new ArrayList<>());
	}

	public static String getSubstring(String str,int start,int length)
	{
		return str.substring(start,Math.min(start+length,str.length()));
	}

	public static String removeFirstChar(String str)
	{
		return str.substring(1);
	}

	public static String removeLastChar(String str)
	{
		return str.substring(0,str.length()-1);
	}
}
