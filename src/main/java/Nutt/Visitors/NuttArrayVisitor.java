//package Nutt.Visitors;
//
//import Nutt.TypeInferencer;
//import Nutt.Types.Functional.Listable.Array.Array;
//import Nutt.Types.IValuable;
//import gen.Nutt.Explicit_arrayContext;
//
//import java.util.ArrayList;
//import java.util.stream.Collectors;
//
//public class NuttArrayVisitor extends NuttGenericVisitor<Array>
//{
//
//	@Override public Array visitExplicit_array(Explicit_arrayContext ctx)
//	{
//		var expList=ctx
//				.list_initializer()
//				.explist();
//		if(expList==null) return new Array();
//		var arrayElements=expList.exp()
//		                         .stream()
//		                         .map(VisitorsPool.evalVisitor::visit)
//		                         .collect(Collectors.toCollection(ArrayList::new));
//		var boundType=TypeInferencer.getCommonWrapperType(arrayElements.stream().map(IValuable::getType).toList());
//		return new Array(boundType,arrayElements);
//	}
//}