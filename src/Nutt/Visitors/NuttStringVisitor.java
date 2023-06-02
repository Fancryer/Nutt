package Nutt.Visitors;

import Nutt.Interpolator;
import Nutt.NuttCommon;
import Nutt.Types.Functional.Listable.String.String;
import gen.Nutt;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class NuttStringVisitor extends NuttGenericVisitor<String>
{
	@Override public String visit(ParseTree tree)
	{
		return super.visit(tree).asFunctional().asListable().asString();
	}

	public java.lang.String extractTypeName(Nutt.Type_paramContext ctx)
	{
		return ctx==null?null:visitType_param(ctx).getValue();
	}

	@Override
	public String visitType_param(Nutt.Type_paramContext ctx)
	{
		if(ctx.flat_type!=null) return new String(ctx.flat_type.getText());
		throw new RuntimeException();
	}

	@Override
	public String visitString(Nutt.StringContext ctx)
	{
		return ctx.Normal_string()!=null
		       ?new String(Interpolator.interpolate(ctx.Normal_string().getText()))
		       :visitCharString(ctx.Char_String());
	}

	private String visitCharString(TerminalNode charString)
	{
		return new String(NuttCommon.removeFirstAndLastChars(charString.getText()).replaceAll("\\\\'","'"));
	}

	private java.lang.String getFullText(ParserRuleContext context)
	{
		return context.start==null||context.stop==null||context.start.getStartIndex()<0||context.stop.getStopIndex()<0
		       ?context.getText()
		       :context.start.getInputStream().getText(Interval.of(context.start.getStartIndex(),context.stop.getStopIndex()));
	}

	@Override public String visitExplicit_variable(Nutt.Explicit_variableContext ctx)
	{
		return new String(ctx.NAME().getText());
	}
}