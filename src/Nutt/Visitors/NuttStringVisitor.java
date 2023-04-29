package Nutt.Visitors;

import Nutt.NuttCommon;
import Nutt.Types.Functional.Listable.String.String;
import gen.NuttParser;
import org.antlr.v4.runtime.tree.TerminalNode;

public class NuttStringVisitor extends NuttGenericVisitor
{
	public java.lang.String extractTypeName(NuttParser.Type_paramContext ctx)
	{
		if(ctx==null) return null;
		else return visitType_param(ctx).getValue();
	}

	@Override
	public String visitType_param(NuttParser.Type_paramContext ctx)
	{
		if(ctx.flat_type!=null) return new String(ctx.flat_type.getText());
		throw new RuntimeException();
	}

	@Override
	public String visitString(NuttParser.StringContext ctx)
	{
		return ctx.normal_string()!=null
		       ?visitNormalString(ctx.normal_string())
		       :visitCharString(ctx.Char_String());
	}

	private String visitCharString(TerminalNode charString)
	{
		return new String(NuttCommon.removeFirstAndLastChars(charString.getText()).replaceAll("\\\\'","'"));
	}

	private String visitNormalString(NuttParser.Normal_stringContext ctx)
	{
		StringBuilder str=new StringBuilder();
		for(var stringPart: ctx.inner_string())
		{
			var asInterpolated=stringPart.interpolated_string();
			str.append(asInterpolated!=null&&asInterpolated.exp()!=null?
			           new NuttEvalVisitor()
					           .visit(asInterpolated.exp())
					           .toString():
			           stringPart.getText());
		}
		return new String(str.toString());
	}

	@Override public String visitExplicit_variable(NuttParser.Explicit_variableContext ctx)
	{
		return new String(ctx.NAME().getText());
	}
}