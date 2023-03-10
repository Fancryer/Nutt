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

	@Override public Boolean visitVarExpOrPar(NuttParser.VarExpOrParContext ctx)
	{
		if(debug) System.out.println(ctx.toStringTree(parser));
		return super.visitVarExpOrPar(ctx);
	}

	@Override public Boolean visitVarOrExp(NuttParser.VarOrExpContext ctx)
	{
		if(debug) System.out.println(ctx.toStringTree(parser));
		return super.visitVarOrExp(ctx);
	}

	@Override public Boolean visitParExp(NuttParser.ParExpContext ctx)
	{
		return new NuttEvalVisitor(parser,interpreter).visit(ctx.exp()).asFunctional().asBoolean();
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

	@Override public Boolean visitLogical_exp(NuttParser.Logical_expContext ctx)
	{
		var left=visit(ctx.left);
		var right=visit(ctx.right);
		var op=ctx.operator_logical();
		if(debug) System.out.printf("%s, %s%n",left,right);
		if(op.OP_And()!=null) return left&&right;
		if(op.OP_Or()!=null) return left||right;
		throw new UnsupportedOperationException();
	}
}