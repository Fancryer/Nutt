package Nutt.Runtime;

import Nutt.Pair;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NativeModuleLoader
{
	public static Set<Pair<String,String>> listFilesUsingFileWalkAndVisitor(String dir) throws IOException
	{
		Set<Pair<String,String>> fileList=new HashSet<>();
		Files.walkFileTree(Paths.get(dir),new SimpleFileVisitor<>()
		{
			@Override
			public FileVisitResult visitFile(Path file,BasicFileAttributes attrs)
			{
				if(!Files.isDirectory(file))
				{
					var asStr=file.toString();
					var endIndex=asStr.lastIndexOf("\\");
					var left=asStr.substring(0,endIndex);
					var right=asStr.substring(endIndex+1,asStr.indexOf('.'));
					fileList.add(new Pair<>(left,right));
				}
				return FileVisitResult.CONTINUE;
			}
		});
		return fileList;
	}

	public Record loadModule(String dir)
	{
		try
		{
			System.out.println(listFilesUsingFileWalkAndVisitor(dir));
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
		return null;
	}

	public List<Record> loadModuleList(List<String> paths)
	{
		return paths.stream().map(this::loadModule).toList();
	}

	public Record loadModulesRecursively(String path)
	{
		return null;
	}
}