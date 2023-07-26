//package Nutt.Types.Functional.Actionable.Procedure.Native.Arrays;
//
//import Nutt.Annotations.ANativeProcedure;
//import Nutt.Exceptions.NuttSuccessReturnException;
//import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
//import Nutt.Types.Functional.Actionable.Procedure.Signature;
//import Nutt.Types.Functional.Numerable.Int.Int;
//import Nutt.Types.IValuable;
//
//import java.util.List;
//
//@ANativeProcedure("native.arrays")
//public class Count extends NativeProcedure
//{
//	public Count()
//	{
//		super("count",new Signature("arr_0:Listable,val","Array"));
//	}
//
//	@Override public IValuable proceed(List<IValuable> argumentList) throws NuttSuccessReturnException
//	{
//		var list=argumentList.get(0).asFunctional().asListable();
//		return new Int(list.stream().filter(el->el.equalTo(argumentList.get(1))).count());
//	}
//}
