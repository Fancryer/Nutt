package Nutt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class NuttCommon
{
	private static final List<String> nuttTypes=List.of
			(
					"Either","Valuable","Nil","Functional","Actionable","Procedure","Macro","Numerable","Int","Float",
					"Listable","Array","Map","String","Set","Enumeration"
			);

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
			StringBuilder sb=new StringBuilder();
			Iterator<Map.Entry<K,V>> iter=map.entrySet().iterator();
			while(iter.hasNext())
			{
				Map.Entry<K,V> entry=iter.next();
				sb.append(entry.getKey());
				sb.append('=').append('"');
				sb.append(entry.getValue());
				sb.append('"');
				if(iter.hasNext()) sb.append(',').append(' ');
			}
			return sb.toString();

		}
	}
}
