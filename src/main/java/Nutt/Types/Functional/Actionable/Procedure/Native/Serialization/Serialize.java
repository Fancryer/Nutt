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
//public class Serialize extends NativeProcedure
//{
//	public Serialize()
//	{
//		super("serialize",new Signature("r:Record","String"));
//	}
//
//	@Override public String proceed(List<IValuable> argumentList) throws NuttSuccessReturnException
//	{
//		return new String(argumentList.get(0).toSerializedString());
//	}
//}