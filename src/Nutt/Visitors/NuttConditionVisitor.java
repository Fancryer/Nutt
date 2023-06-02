package Nutt.Visitors;

import gen.Nutt;
import Nutt.NuttInterpreter;
import Nutt.Types.Functional.Listable.String.String;
import Nutt.Types.Functional.Numerable.Boolean;
import Nutt.Types.IValuable;
import Nutt.Types.Nil;

public class NuttConditionVisitor extends NuttGenericVisitor<Boolean>
{
	@Override
	public Boolean visitDemand(Nutt.DemandContext ctx)
	{
		return visit(ctx.exp()).asFunctional().asBoolean();
	}

	@Override
	public Boolean visitExplist(Nutt.ExplistContext ctx)
	{
		final var conditionList=ctx.exp().stream().map(tree->visit(tree).asFunctional().asBoolean().isTrue());
		return new Boolean(conditionList.filter(b->b).toList().size()>=ctx.exp().size());
	}

	@Override
	public Boolean visitExplicit_variable(Nutt.Explicit_variableContext ctx)
	{
		return NuttInterpreter.getVariable(ctx.NAME().getText()).valuable.asFunctional().asBoolean();
	}

	@Override
	public Boolean visitArray_access(Nutt.Array_accessContext ctx)
	{
		return new NuttEvalVisitor().visitArray_access(ctx).asFunctional().asBoolean();
	}

	@Override
	public Boolean visitInfix_exp(Nutt.Infix_expContext ctx)
	{
		if(ctx.operator_infix().default_infix_operator().operator_comparison()!=null)
			return new NuttCompareVisitor().visitInfix_exp(ctx);
		var left=visit(ctx.left).asFunctional().asBoolean().isTrue();
		var right=visit(ctx.right).asFunctional().asBoolean().isTrue();
		var op=ctx.operator_infix().default_infix_operator().operator_logical().getText();
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
	public String visitExplicit_atom(Nutt.Explicit_atomContext ctx)
	{
		var atom=ctx.atom();
		IValuable valuable=new Nil();
		if(atom.boolean_()!=null) return new String(atom.boolean_().KW_True()!=null);
		if(atom.number()!=null) valuable=new NuttEvalVisitor().visitNumber(atom.number());
		if(atom.string()!=null) valuable=new NuttEvalVisitor().visitString(atom.string());
		return new String(valuable.asFunctional().asBoolean());
	}

	@Override
	public IValuable visitParenthesis_exp(Nutt.Parenthesis_expContext ctx)
	{
		return visit(ctx.exp());
	}
}