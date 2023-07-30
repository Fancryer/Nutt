package Nutt.Visitors;

import Nutt.Interpreter.NuttInterpreter;
import Nutt.Interpreter.References.AnonymousNuttReference;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Interpreter.References.PrimitiveNuttReference;
import Nutt.Types.Functional.Numerable.Boolean;
import gen.Nutt;

public class NuttConditionVisitor extends NuttGenericVisitor
{
	@Override
	public NuttReference visitDemand(Nutt.DemandContext ctx)
	{
		return visit(ctx.exp())
				.getValue()
				.asFunctional()
				.asNumerable()
				.asBoolean()
				.toAnonymousReference();
	}

	@Override
	public NuttReference visitExplist(Nutt.ExplistContext ctx)
	{
		final var conditionList=ctx.exp()
		                           .stream()
		                           .map(tree->visit(tree).getValue().isTrue());
		return new Boolean(conditionList.filter(b->b).toList().size()>=ctx.exp().size()).toAnonymousReference();
	}

	@Override
	public NuttReference visitExplicit_variable(Nutt.Explicit_variableContext ctx)
	{
		return PrimitiveNuttReference.ofBoolean(NuttInterpreter.getReference(ctx.NAME().getText()).getValue().isTrue());
	}

	@Override
	public NuttReference visitArray_access(Nutt.Array_accessContext ctx)
	{
		return AnonymousNuttReference.of(VisitorPool.evalVisitor.visitArray_access(ctx)
		                                                        .getValue()
		                                                        .asFunctional()
		                                                        .asNumerable()
		                                                        .asBoolean());
	}

	@Override
	public NuttReference visitExplicit_atom(Nutt.Explicit_atomContext ctx)
	{
		var atom=ctx.atom();
		NuttReference reference;
		if(atom.boolean_()!=null) return PrimitiveNuttReference.ofBoolean(atom.boolean_().KW_True()!=null);
		else if(atom.number()!=null) reference=VisitorPool.evalVisitor.visitNumber(atom.number());
		else if(atom.string()!=null) reference=VisitorPool.evalVisitor.visitString(atom.string());
		else reference=PrimitiveNuttReference.ofNil();
		return PrimitiveNuttReference.ofBoolean(reference.getValue().isTrue());
	}

	@Override
	public NuttReference visitInfix_exp(Nutt.Infix_expContext ctx)
	{
		if(ctx.operator_infix().default_infix_operator().operator_comparison()!=null)
			return VisitorPool.compareVisitor.visitInfix_exp(ctx);
		var left=visit(ctx.left).getValue().isTrue();
		var right=visit(ctx.right).getValue().isTrue();
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
				).toAnonymousReference();
	}

	@Override
	public NuttReference visitParenthesis_exp(Nutt.Parenthesis_expContext ctx)
	{
		return visit(ctx.exp());
	}
}