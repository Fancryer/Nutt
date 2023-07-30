//package Nutt.Types.Functional.Actionable.Procedure.Native.Serialization;
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
//@ANativeProcedure("native.serialization")
//public class Deserialize extends NativeProcedure
//{
//	public Deserialize()
//	{
//		super("deserialize",new Signature("r:Record","String"));
//	}
//
//	@Override public String proceed(List<IValuable> argumentList) throws NuttSuccessReturnException
//	{
//		var str=argumentList.get(0).toString();
//		return new String(argumentList.get(0).toSerializedString());
//	}
//}