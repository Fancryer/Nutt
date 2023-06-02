package Nutt.Visitors;

import gen.Nutt;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Numerable.Boolean;
import Nutt.Types.IValuable;
import org.antlr.v4.runtime.tree.ParseTree;

public class NuttMapperExtractVisitor extends NuttGenericVisitor<IValuable>
{
	@Override public Boolean visitExplicit_variable(Nutt.Explicit_variableContext ctx)
	{
		return new Boolean(!NuttFunctionVisitor.isNativeFunction(ctx.NAME().getText()));
	}

	@Override public Boolean visitFunction_definition_exp(Nutt.Function_definition_expContext ctx)
	{
		return new Boolean(true);
	}

	@Override public IValuable visit(ParseTree tree)
	{
		var res=super.visit(tree);
		return res==null||!TypeInferencer.typesEquals(res.getType(),TypeInferencer.findType("Boolean"))?null:res;
	}
}

