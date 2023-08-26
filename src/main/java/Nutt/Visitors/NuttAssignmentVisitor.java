package Nutt.Visitors;

import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Listable.Array.Array;
import gen.Nutt.Group_assignmentContext;

import java.util.ArrayList;
import java.util.List;

public class NuttAssignmentVisitor extends NuttGenericVisitor
{
	@Override
	public NuttReference visitGroup_assignment(Group_assignmentContext ctx)
	{
		var evaluator=VisitorPool.evalVisitor;
		List<NuttReference> variables=evaluator.unwrapExplist(ctx.variables), expressions=evaluator.unwrapExplist(ctx.expressions);
		assert variables.size()==expressions.size():"Unbalanced assignment!";
		var valuables=new ArrayList<NuttReference>();
		for(int i=0;i<variables.size();++i)
		{
			valuables.add(variables.get(i).setValue(expressions.get(i++).getValue()));
		}
		return valuables.size()>1
		       ?new Array(valuables).toAnonymousReference()
		       :valuables.get(0);
	}
}