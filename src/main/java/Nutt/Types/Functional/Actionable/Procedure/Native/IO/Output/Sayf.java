//package Nutt.Types.Functional.Actionable.Procedure.Native.IO.Output;
//
//import Nutt.Annotations.ANativeProcedure;
//import Nutt.Exceptions.NuttSuccessReturnException;
//import Nutt.NuttInterpreter;
//import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
//import Nutt.Types.Functional.Actionable.Procedure.Signature;
//import Nutt.Types.Functional.Listable.Array.Array;
//import Nutt.Types.IValuable;
//
//import java.util.List;
//
//@ANativeProcedure("native.io.output")
//public class Sayf extends NativeProcedure
//{
//	public Sayf()
//	{
//		super("sayf",new Signature("x:Valuable","Array"));
//	}
//
//	@Override public Array proceed(List<IValuable> argumentList) throws NuttSuccessReturnException
//	{
//		return new Array(NuttInterpreter.sayFormatted(argumentList));
//	}
//}