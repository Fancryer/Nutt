package Nutt.Visitors;

import Nutt.Types.Functional.Numerable.Boolean;
import Nutt.Types.IValuable;
import gen.Nutt;

public class NuttCompareVisitor extends NuttGenericVisitor<Boolean>
{
	@Override
	public Boolean visitInfix_exp(Nutt.Infix_expContext ctx)
	{
		var evaluator=new NuttEvalVisitor();
		IValuable left=evaluator.visit(ctx.left), right=evaluator.visit(ctx.right);
		var operator=ctx.operator_infix().default_infix_operator().operator_comparison().getText();
		return new Boolean
				(
						switch(operator)
						{
							case "<" -> left.lessThan(right);
							case "<=" -> left.lessEqalTo(right);
							case "==" -> left.similarTo(right);
							case "===" -> left.equalTo(right);
							case "!=" -> left.notSimilarTo(right);
							case "!==" -> left.notEqualTo(right);
							case ">" -> left.greaterTo(right);
							case ">=" -> left.greaterEqualTo(right);
							default -> throw new RuntimeException();
						}
				);
	}
}