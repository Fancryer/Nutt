package Nutt.Visitors;

import Nutt.Interpreter.References.AnonymousNuttReference;
import Nutt.Interpreter.References.NuttReference;
import Nutt.NuttEnvironment;
import gen.Nutt.Spread_expContext;
import gen.NuttBaseVisitor;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.Objects;
import java.util.stream.Collectors;

import static Nutt.Interpreter.NuttInterpreter.EConstantQualifier.Mut;
public class NuttGenericVisitor extends NuttBaseVisitor<NuttReference>
{
	public NuttGenericVisitor(){}

	@Override public NuttReference visitSpread_exp(Spread_expContext ctx)
	{
		var elements=Nutt.Visitors.VisitorPool.evalVisitor
				.visit(ctx.exp())
				.getMutable()
				.get()
				.spread();
		var expList=NuttEnvironment.getTempParser
				                           (
						                           elements
								                           .stream()
								                           .map(Objects::toString)
								                           .collect(Collectors.joining(","))
				                           ).explist();
		//NuttEnvironment.getTempParser(NuttCommon.removeFirstAndLastChars(exp.toString())).explist();
		var parent=((ParserRuleContext)ctx.parent);
		var childCount=parent.getChildCount();
		for(var i=0;i<childCount;++i)
		{
			var child=ctx.parent.getChild(i);
			if(child==ctx)
			{
				parent.children.clear();
				parent.children.add(expList);
				break;
			}
		}
		return new AnonymousNuttReference(elements,Mut);
	}
}