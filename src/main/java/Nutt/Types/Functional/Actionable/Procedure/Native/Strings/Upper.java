//package Nutt.Types.Functional.Actionable.Procedure.Native.Strings;
//
//import Nutt.Annotations.ANativeProcedure;
//import Nutt.Exceptions.NuttSuccessReturnException;
//import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
//import Nutt.Types.Functional.Actionable.Procedure.Signature;
//import Nutt.Types.Functional.Listable.String.String;
//import Nutt.Types.IValuable;
//
//import java.util.List;
//
//@ANativeProcedure("native.strings")
//public class Upper extends NativeProcedure
//{
//	public Upper()
//	{
//		super("upper",new Signature("str_0:String","String"));
//	}
//
//	@Override
//	public IValuable proceed(List<IValuable> argumentList) throws NuttSuccessReturnException
//	{
//		return new String(argumentList.get(0).asFunctional().asListable().asString().getValue().toUpperCase());
//	}
//}
