package Nutt;

import Nutt.Types.IValuable;
import Nutt.Types.Nil;
import gen.NuttBaseVisitor;
import gen.NuttParser;

public class NuttConditionVisitor extends NuttBaseVisitor<Boolean>
{
	NuttParser parser;
	NuttInterpreter interpreter;
	boolean debug;

	@Override public Boolean visitDemand(NuttParser.DemandContext ctx)
	{
		return visit(ctx.exp());
	}

	@Override public Boolean visitParenthesis_exp(NuttParser.Parenthesis_expContext ctx)
	{
		return visit(ctx.exp());
	}

	public NuttConditionVisitor(NuttParser parser,NuttInterpreter interpreter)
	{
		this(parser,interpreter,false);
	}

	public NuttConditionVisitor(NuttParser parser,NuttInterpreter interpreter,boolean debug)
	{
		this.parser=parser;
		this.interpreter=interpreter;
		this.debug=debug;
	}

	@Override public Boolean visitExplicit_atom(NuttParser.Explicit_atomContext ctx)
	{
		var atom=ctx.atom();
		IValuable valuable=new Nil();
		if(atom.explicit_bool()!=null) return atom.explicit_bool().KW_True()!=null;
		if(atom.number()!=null) valuable=new NuttEvalVisitor(parser,interpreter).visitNumber(atom.number());
		if(atom.string()!=null) valuable=new NuttEvalVisitor(parser,interpreter).visitString(atom.string());
		return valuable.asFunctional().asBoolean();
	}

	@Override
	public Boolean visitExplist(NuttParser.ExplistContext ctx)
	{
		return super.visitExplist(ctx);
	}

	@Override public Boolean visitComparison_expression(NuttParser.Comparison_expressionContext ctx)
	{
		return new NuttCompareVisitor(parser,interpreter).visitComparison_expression(ctx);
	}

	@Override public Boolean visitVar(NuttParser.VarContext ctx)
	{
		return interpreter.getVariable(ctx.NAME().getText()).valuable.asFunctional().asBoolean();
	}

	@Override public Boolean visitArray_access(NuttParser.Array_accessContext ctx)
	{
		return new NuttEvalVisitor(parser,interpreter).visitArray_access(ctx).asFunctional().asBoolean();
	}

	@Override public Boolean visitLogical_exp(NuttParser.Logical_expContext ctx)
	{
		var left=visit(ctx.left);
		var right=visit(ctx.right);
		var op=ctx.operator_logical().getText();
		//System.out.println("ctx = "+NuttEnvironment.toSourceCode(ctx));
		return switch(op)
				{
					case "&&","and" -> left&&right;
					case "||","or" -> left||right;
					default -> throw new UnsupportedOperationException();
				};
	}
}