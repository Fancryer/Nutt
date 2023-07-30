//package Nutt.Types.Functional.Actionable.Procedure.Native.IO.Output;
//
//import Nutt.Annotations.ANativeProcedure;
//import Nutt.Exceptions.NuttSuccessReturnException;
//import Nutt.NuttInterpreter;
//import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
//import Nutt.Types.Functional.Actionable.Procedure.Signature;
//import Nutt.Types.IValuable;
//
//import java.util.List;
//
//@ANativeProcedure("native.io.output")
//public class Sayn extends NativeProcedure
//{
//	public Sayn()
//	{
//		super("sayn",new Signature("x:Valuable"));
//	}
//
//	@Override public IValuable proceed(List<IValuable> argumentList) throws NuttSuccessReturnException
//	{
//		if(argumentList.size()>1) throw new RuntimeException();
//		return NuttInterpreter.say(argumentList.get(0));
//	}
//}