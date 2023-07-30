//package Nutt.Types.Functional.Actionable.Procedure.Native.Arrays;
//
//import Nutt.Annotations.ANativeProcedure;
//import Nutt.Exceptions.NuttSuccessReturnException;
//import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
//import Nutt.Types.Functional.Actionable.Procedure.Signature;
//import Nutt.Types.Functional.Listable.Array.Array;
//import Nutt.Types.IValuable;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@ANativeProcedure("native.arrays")
//public class Distinct extends NativeProcedure
//{
//	public Distinct()
//	{
//		super("distinct",new Signature("arr_0:Listable","Array"));
//	}
//
//	@Override
//	public IValuable proceed(List<IValuable> argumentList) throws NuttSuccessReturnException
//	{
//		var list=argumentList.get(0).asFunctional().asListable();
//		var result=new ArrayList<IValuable>();
//		for(var el: list)
//		{
//			var distinct=result.stream().noneMatch(el::equalTo);
//			System.out.printf("el = %s is %sdistinct%n",el,distinct?"":"not");
//			if(distinct) result.add(el);
//		}
//		return new Array(list.getElementType(),result);
//	}
//}
