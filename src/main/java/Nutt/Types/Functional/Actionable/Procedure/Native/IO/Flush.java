//package Nutt.Types.Functional.Actionable.Procedure.Native.IO;
//
//import Nutt.Annotations.ANativeProcedure;
//import Nutt.Exceptions.NuttSuccessReturnException;
//import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
//import Nutt.Types.Functional.Actionable.Procedure.Signature;
//import Nutt.Types.IValuable;
//import Nutt.Types.Nil;
//
//import java.util.List;
//
//@ANativeProcedure("native.io")
//public class Flush extends NativeProcedure
//{
//	public Flush()
//	{
//		super("flush",new Signature());
//	}
//
//	@Override public IValuable proceed(List<IValuable> argumentList) throws NuttSuccessReturnException
//	{
//		if(!argumentList.isEmpty()) throw new RuntimeException();
//		try
//		{
//			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
//		}
//		catch(Exception e)
//		{
//			throw new RuntimeException(e);
//		}
//		return new Nil();
//	}
//}