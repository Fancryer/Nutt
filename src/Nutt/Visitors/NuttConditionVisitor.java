package Nutt.Visitors;

import Nutt.NuttInterpreter;
import Nutt.Types.Functional.Listable.String.String;
import Nutt.Types.Functional.Numerable.Boolean;
import Nutt.Types.IValuable;
import Nutt.Types.Nil;
import gen.NuttParser;

public class NuttConditionVisitor extends NuttGenericVisitor
{
	@Override
	public Boolean visitDemand(NuttParser.DemandContext ctx)
	{
		return visit(ctx.exp()).asFunctional().asBoolean();
	}

	@Override
	public Boolean visitExplist(NuttParser.ExplistContext ctx)
	{
		final var conditionList=ctx.exp().stream().map(tree->visit(tree).asFunctional().asBoolean().isTrue());
		return new Boolean(conditionList.filter(b->b).toList().size()>=ctx.exp().size());
	}

	@Override
	public Boolean visitExplicit_variable(NuttParser.Explicit_variableContext ctx)
	{
		return NuttInterpreter.getVariable(ctx.NAME().getText()).valuable.asFunctional().asBoolean();
	}

	@Override
	public Boolean visitArray_access(NuttParser.Array_accessContext ctx)
	{
		return new NuttEvalVisitor().visitArray_access(ctx).asFunctional().asBoolean();
	}

	@Override
	public Boolean visitInfix_exp(NuttParser.Infix_expContext ctx)
	{
		if(ctx.operator_infix().operator_comparison()!=null)
			return new NuttCompareVisitor().visitInfix_exp(ctx);
		var left=visit(ctx.left).asFunctional().asBoolean().isTrue();
		var right=visit(ctx.right).asFunctional().asBoolean().isTrue();
		var op=ctx.operator_infix().operator_logical().getText();
		return new Boolean
				(
						switch(op)
						{
							case "&&","and" -> left&&right;
							case "||","or" -> left||right;
							case "xor" -> left^right;
							default -> throw new UnsupportedOperationException();
						}
				);
	}

	@Override
	public String visitExplicit_atom(NuttParser.Explicit_atomContext ctx)
	{
		var atom=ctx.atom();
		IValuable valuable=new Nil();
		if(atom.boolean_()!=null) return new String(atom.boolean_().kw_true()!=null);
		if(atom.number()!=null) valuable=new NuttEvalVisitor().visitNumber(atom.number());
		if(atom.string()!=null) valuable=new NuttEvalVisitor().visitString(atom.string());
		return new String(valuable.asFunctional().asBoolean());
	}

	@Override
	public IValuable visitParenthesis_exp(NuttParser.Parenthesis_expContext ctx)
	{
		return visit(ctx.exp());
	}
}