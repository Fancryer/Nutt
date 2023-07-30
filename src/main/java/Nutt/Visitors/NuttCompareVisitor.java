package Nutt.Visitors;

import Nutt.Interpreter.References.AnonymousNuttReference;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Numerable.Boolean;
import gen.Nutt.*;
public class NuttCompareVisitor extends NuttGenericVisitor
{
	@Override
	public NuttReference visitInfix_exp(Infix_expContext ctx)
	{
		var evaluator=VisitorPool.evalVisitor;
		NuttReference left=evaluator.visit(ctx.left), right=evaluator.visit(ctx.right);
		var operator=ctx.operator_infix().default_infix_operator().operator_comparison().getText();
		var result=new Boolean
				(
						switch(operator)
						{
							case "<" -> left.getValue().lessThan(right.getValue());
							case "<=" -> left.getValue().lessEqualTo(right.getValue());
							case "==" -> left.getValue().similarTo(right.getValue());
							case "===" -> left.getValue().equalTo(right.getValue());
							case "!=" -> left.getValue().notSimilarTo(right.getValue());
							case "!==" -> left.getValue().notEqualTo(right.getValue());
							case ">" -> left.getValue().greaterTo(right.getValue());
							case ">=" -> left.getValue().greaterEqualTo(right.getValue());
							default -> throw new RuntimeException();
						}
				);
		return AnonymousNuttReference.of(result);
	}
}