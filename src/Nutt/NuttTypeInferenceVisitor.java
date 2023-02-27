package Nutt;

import gen.NuttBaseVisitor;
import gen.NuttParser;

public class NuttTypeInferenceVisitor extends NuttBaseVisitor<String>
{
	NuttParser parser;
	NuttInterpreter interpreter;
	boolean debug;
	
	public NuttTypeInferenceVisitor(NuttParser parser,NuttInterpreter interpreter)
	{
		this(parser,interpreter,false);
	}
	
	public NuttTypeInferenceVisitor(NuttParser parser,NuttInterpreter interpreter,boolean debug)
	{
		this.parser=parser;
		this.interpreter=interpreter;
		this.debug=debug;
	}
	
	private static String getVariableNameFromContext(NuttParser.VarContext ctx)
	{
		return ctx.NAME().getSymbol().getText();
	}
	
	@Override
	public String visitFunc_output(NuttParser.Func_outputContext ctx)
	{
		if(ctx.default_output()!=null) return visitType_decl(ctx.default_output().type_decl());
		if(ctx.valuable_output()!=null) return "Valuable";
		throw new RuntimeException();
	}
	
	@Override
	public String visitType_decl(NuttParser.Type_declContext ctx)
	{
		if(ctx.valuable_type()!=null) return "Valuable";
		if(ctx.number_type()!=null)
		{
			return ctx.number_type().int_type()!=null?"Int":"Float";
		}
		if(ctx.nil_type()!=null) return "Nil";
		if(ctx.list_type()!=null)
		{
			if(ctx.list_type().set_type()!=null) return "Set";
			if(ctx.list_type().string_type()!=null) return "String";
			if(ctx.list_type().array_type()!=null) return "Array";
			return "Map";
		}
		if(ctx.action_type()!=null)
		{
			var kind=ctx.action_type().action_kind();
			if(kind.TW_Actionable()!=null) return "Actionable";
			if(kind.TW_Procedure()!=null) return "Procedure";
			if(kind.TW_Macro()!=null) return "Macro";
			
		}
		throw new IllegalStateException();
	}
	
	@Override
	public String visitNumber(NuttParser.NumberContext ctx)
	{
		if(ctx.INT()!=null||ctx.HEX()!=null) return "Int";
		if(ctx.FLOAT()!=null||ctx.HEX_FLOAT()!=null) return "Float";
		throw new RuntimeException("Wrong numerable literal: "+ctx.getText());
	}
	
	@Override
	public String visitString(NuttParser.StringContext ctx)
	{
		return "String";
	}
}