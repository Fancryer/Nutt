package Nutt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NuttCommon
{
	public static boolean isTypeValid(String type)
	{
		return TypeInferencer.findType(type)!=null;
	}

	public static <K,V> String prettyPrintedMap(Map<K,V> map)
	{
		StringBuilder sb=new StringBuilder("{\n");
		var iter=map.entrySet().iterator();
		while(iter.hasNext())
		{
			var entry=iter.next();
			sb.append("\t'%s'='%s'".formatted(entry.getKey(),entry.getValue()));
			if(iter.hasNext()) sb.append(',').append("\n");
		}
		sb.append("\n}");
		return sb.toString();
	}

	public static <T> T requireNonNullElseThrow(T obj,Throwable throwable) throws RuntimeException
	{
		if(obj!=null) return obj;
		throw new RuntimeException(throwable);
	}

	public static <T> List<T> concat(List<T> a,List<T> b)
	{
		a.addAll(b);
		return a;
	}

	public static <T> T add(List<T> a,T t)
	{
		a.add(t);
		return t;
	}

	public static <T> List<T> append(List<T> a,T t)
	{
		a.add(t);
		return a;
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

	public static <T> List<T> getOrEmpty(List<T> collection)
	{
		return Objects.requireNonNullElse(collection,new ArrayList<>());
	}

	public static String getSubstring(String str,int start,int length)
	{
		return str.substring(start,Math.min(start+length,str.length()));
	}

	public static String removeFirstAndLastChars(String str)
	{
		return removeLastChar(removeFirstChar(str));
	}

	public static String removeLastChar(String str)
	{
		return str.isEmpty()?str:str.substring(0,str.length()-1);
	}

	public static String removeFirstChar(String str)
	{
		return str.isEmpty()?str:str.substring(1);
	}

	public static boolean objectsAsPairsAreEqual(List<Object> pairs)
	{
		if(pairs.size()%2!=0) throw new RuntimeException();
		var list=IntStream.range(0,pairs.size()-1)
		                  .mapToObj(i->new Pair<>(pairs.get(0),pairs.get(1)))
		                  .collect(Collectors.toCollection(ArrayList::new));
		return objectPairsAreEqual(list);
	}

	public static boolean objectPairsAreEqual(List<Pair<Object,Object>> pairs)
	{
		return pairs.stream().anyMatch(p->!p.left().equals(p.right()));
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
}
