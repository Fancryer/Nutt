//package Nutt.Types.Functional.Actionable.Procedure.Native.Files;
//
//import Nutt.Annotations.ANativeProcedure;
//import Nutt.Exceptions.NuttSuccessReturnException;
//import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
//import Nutt.Types.Functional.Actionable.Procedure.Signature;
//import Nutt.Types.IValuable;
//import Nutt.Types.Nil;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.util.List;
//
//@ANativeProcedure("native.files")
//public class CreateFile extends NativeProcedure
//{
//	public CreateFile()
//	{
//		super("create_file",new Signature("path:String"));
//	}
//
//	@Override public IValuable proceed(List<IValuable> argumentList) throws NuttSuccessReturnException
//	{
//		String path=argumentList.get(0).toString();
//		try
//		{
//			Files.createFile(Path.of(path));
//		}
//		catch(IOException e)
//		{
//			throw new RuntimeException(e);
//		}
//		return new Nil();
//	}
//}
