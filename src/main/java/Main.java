import java.io.File;
import java.net.URL;
import java.util.Enumeration;
import java.util.Objects;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			var classLoader=Thread.currentThread().getContextClassLoader();
			Enumeration<URL> roots=classLoader.getResources("");
			while(roots.hasMoreElements())
			{
				var url=roots.nextElement();
				File root=new File(url.getPath());
				for(File file: Objects.requireNonNull(root.listFiles()))
				{
					if(file.isDirectory())
					{
						// Loop through its listFiles() recursively.
					}
					else
					{
						String name=file.getName();
						System.out.println("name = "+name);
						// Check if it's a .class file or a .jar file and handle accordingly.
					}
				}
			}
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
		//		var packages=Package.getPackages();
		//		for(var aPackage: packages)
		//		{
		//			try
		//			{
		//				var classLoader=Thread.currentThread().getContextClassLoader();
		//				var classPath=ClassPath.from(classLoader);
		//				var packageName=aPackage.getName();
		//				var classes=classPath.getTopLevelClassesRecursive(packageName);
		//				System.out.printf("packageName = %s\n%n",packageName);
		//				for(var classInfo: classes)
		//				{
		//					System.out.println("class name = "+classInfo.getName());
		//				}
		//			}
		//			catch(IOException e)
		//			{
		//				throw new RuntimeException(e);
		//			}
		//		}
	}
}
