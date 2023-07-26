package Nutt.Annotations.Processors;

import Nutt.Annotations.ALogName;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class LogNameAnnotationProcessor
{
	private static final Map<Class<?>,Integer> typeCountMap=new HashMap<>();

	public static void process(Map<String,Object> map,Object obj)
	{
		Class<?> clazz=obj.getClass();
		String name=clazz.isAnnotationPresent(ALogName.class)
		            ?getALogNameFromAnnotation(clazz)
		            :getALogNameWithoutAnnotation(clazz);
		setObjectName(obj,name);
		map.put(obj.toString(),obj);
	}

	private static String getALogNameFromAnnotation(Class<?> clazz)
	{
		return clazz.getAnnotation(ALogName.class).value();
	}

	private static String getALogNameWithoutAnnotation(Class<?> clazz)
	{
		return clazz.getSimpleName()+typeCountMap.compute(clazz,(key,value)->(value==null)?0:value+1);
	}

	private static void setObjectName(Object obj,String name)
	{
		try
		{
			Field field=obj.getClass().getDeclaredField("name");
			field.setAccessible(true);
			field.set(obj,name);
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}
}
