//package Nutt.Types.Functional.Actionable.Procedure.Native.Arrays;
//
//import Nutt.Annotations.ANativeProcedure;
//import Nutt.Exceptions.NuttSuccessReturnException;
//import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
//import Nutt.Types.Functional.Actionable.Procedure.Signature;
//import Nutt.Types.IValuable;
//
//import java.util.List;
//
//@ANativeProcedure("native.arrays")
//public class Append extends NativeProcedure
//{
//	public Append()
//	{
//		super("append",new Signature("arr_0:Array,arr_1:Array","Array"));
//	}
//
//	@Override public IValuable proceed(List<IValuable> argumentList) throws NuttSuccessReturnException
//	{
//		return argumentList.get(0).asFunctional().asListable().add(argumentList.get(1));
//	}
//}