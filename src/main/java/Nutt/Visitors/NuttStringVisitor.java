package Nutt.Visitors;

import Nutt.Interpreter.References.AnonymousNuttReference;
import Nutt.Interpreter.References.NuttReference;
import Nutt.NuttCommon;
import Nutt.Types.Functional.Listable.String.String;
import gen.Nutt.StringContext;
import gen.Nutt.Type_paramContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.TerminalNode;

public class NuttStringVisitor extends NuttGenericVisitor
{
	public java.lang.String extractTypeName(Type_paramContext ctx)
	{
		return ctx!=null?visitType_param(ctx).getType().getDisplayName():null;
	}

	@Override
	public NuttReference visitString(StringContext ctx)
	{
		return AnonymousNuttReference.of
				                             (
						                             ctx.Normal_string()!=null
						                             ?new String(ctx.Normal_string().getText())
						                             :visitCharString(ctx.Char_String())
				                             );
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
}