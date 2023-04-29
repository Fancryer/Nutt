package Nutt.Visitors;

import Nutt.NuttEnvironment;
import Nutt.NuttInterpreter;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.IValuable;
import gen.NuttParser;

import java.util.ArrayList;

public class NuttAssignmentVisitor extends NuttGenericVisitor
{
	@Override
	public IValuable visitGroup_assignment(NuttParser.Group_assignmentContext ctx)
	{
		var evaluator=new NuttEvalVisitor();
		var variableContexts=ctx.variables.exp();
		var expContexts=ctx.expressions.exp().stream().map(evaluator::visit).toList();
		assert variableContexts.size()==expContexts.size():"Unbalanced assignment!";
		int i=0;
		var valuables=new ArrayList<IValuable>();
		for(var variableContext: variableContexts)
		{
			var variableName=NuttEnvironment.toSourceCode(variableContext);
			var valueToAssign=expContexts.get(i);

			if(variableContext instanceof NuttParser.Explicit_variableContext)
			{
				valuables.add(NuttInterpreter.currentScope.setVariable(variableName,valueToAssign).valuable);
			}
			else
				//Assign to Listable element
				if(variableContext instanceof NuttParser.Array_accessContext acc)
				{
					var listable=evaluator.visit(acc.arr).asFunctional().asListable();
					if(TypeInferencer.findType("Listable").findChild(listable.getType())!=null)
					{
						throw new RuntimeException();
					}
					var index=evaluator.visit(acc.index);
					if(TypeInferencer.findType("Int").findChild(index.getType())!=null)
					{
						throw new RuntimeException();
					}
					var asSourceCode=NuttEnvironment.toSourceCode(acc.arr).trim();
					var replacedElement=listable.setAt(valueToAssign,index.asFunctional().asNumerable().asInt());
					valuables.add(NuttInterpreter.currentScope.setVariable(asSourceCode,replacedElement).valuable);
				}
				else throw new RuntimeException();
			++i;
		}
		return valuables.size()>1?new Array("Valuable",valuables):valuables.get(0);
	}
}