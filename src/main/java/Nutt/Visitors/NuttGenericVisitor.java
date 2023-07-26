//package Nutt.Visitors;
//
//import Nutt.NuttEnvironment;
//import Nutt.Types.IValuable;
//import gen.Nutt.Spread_expContext;
//import gen.NuttBaseVisitor;
//import org.antlr.v4.runtime.ParserRuleContext;
//
//import java.util.Objects;
//import java.util.stream.Collectors;
//
//public class NuttGenericVisitor<T extends IValuable> extends NuttBaseVisitor<IValuable>
//{
//	public NuttGenericVisitor(){}
//
//	@Override public IValuable visitSpread_exp(Spread_expContext ctx)
//	{
//		var elements=Nutt.Visitors.VisitorsPool.evalVisitor
//				.visit(ctx.exp())
//				.asElementsArray();
//		var expList=NuttEnvironment.getTempParser
//				                           (
//						                           elements
//								                           .stream()
//								                           .map(Objects::toString)
//								                           .collect(Collectors.joining(","))
//				                           ).explist();
//		//NuttEnvironment.getTempParser(NuttCommon.removeFirstAndLastChars(exp.toString())).explist();
//		var parent=((ParserRuleContext)ctx.parent);
//		var childCount=parent.getChildCount();
//		for(var i=0;i<childCount;++i)
//		{
//			var child=ctx.parent.getChild(i);
//			if(child==ctx)
//			{
//				parent.children.clear();
//				parent.children.add(expList);
//				break;
//			}
//		}
//		return elements;
//	}
//}