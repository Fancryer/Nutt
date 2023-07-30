package Nutt.Visitors;

import Nutt.Interpreter.NuttInterpreter;
import Nutt.Interpreter.References.NuttReference;
import Nutt.NuttEnvironment;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Listable.Array.Array;
import gen.Nutt.Array_accessContext;
import gen.Nutt.Explicit_variableContext;
import gen.Nutt.Group_assignmentContext;

import java.util.ArrayList;

public class NuttAssignmentVisitor extends NuttGenericVisitor
{
	@Override
	public NuttReference visitGroup_assignment(Group_assignmentContext ctx)
	{
		var evaluator=VisitorPool.evalVisitor;
		var variableContexts=ctx.variables.exp();
		var expContexts=ctx.expressions.exp().stream().map(evaluator::visit).toList();
		assert variableContexts.size()==expContexts.size():"Unbalanced assignment!";
		int i=0;
		var valuables=new ArrayList<NuttReference>();
		for(var variableContext: variableContexts)
		{
			var variableName=NuttEnvironment.toSourceCode(variableContext);
			var valueToAssign=expContexts.get(i);
			System.out.printf("name: '%s', valueHash: '%s'%n",variableName,valueToAssign.getValue().hashCode());

			if(variableContext instanceof Explicit_variableContext)
			{
				valuables.add(NuttInterpreter.currentScope.setReference(variableName,valueToAssign.getValue()));
			}
			else
				//Assign to Listable element
				if(variableContext instanceof Array_accessContext acc)
				{
					var listable=evaluator.visit(acc.arr).getValue().asFunctional().asListable();
					if(!TypeInferencer.verdict("Listable",listable.getType()))
					{
						TypeInferencer.prettyPrintTypeTree();
						throw new RuntimeException();
					}
					var index=evaluator.visit(acc.index);
					if(!TypeInferencer.verdict("Int",index.getType()))
					{
						throw new RuntimeException();
					}
					var asSourceCode=NuttEnvironment.toSourceCode(acc.arr).trim();
					var replacedElement=listable.setAt(valueToAssign,index);
					valuables.add(NuttInterpreter.currentScope.setReference(asSourceCode,replacedElement));
				}
				else throw new RuntimeException();
			++i;
		}
		return valuables.size()>1
		       ?new Array("Valuable",valuables).toAnonymousReference()
		       :valuables.get(0);
	}
}