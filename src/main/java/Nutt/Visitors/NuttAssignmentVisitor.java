//package Nutt.Visitors;
//
//import Nutt.NuttEnvironment;
//import Nutt.NuttInterpreter;
//import Nutt.TypeInferencer;
//import Nutt.Types.Functional.Listable.Array.Array;
//import Nutt.Types.IValuable;
//import gen.Nutt;
//
//import java.util.ArrayList;
//
//public class NuttAssignmentVisitor extends NuttGenericVisitor<IValuable>
//{
//	@Override
//	public IValuable visitGroup_assignment(Nutt.Group_assignmentContext ctx)
//	{
//		var evaluator=VisitorsPool.evalVisitor;
//		var variableContexts=ctx.variables.exp();
//		var expContexts=ctx.expressions.exp().stream().map(evaluator::visit).toList();
//		assert variableContexts.size()==expContexts.size():"Unbalanced assignment!";
//		int i=0;
//		var valuables=new ArrayList<IValuable>();
//		for(var variableContext: variableContexts)
//		{
//			var variableName=NuttEnvironment.toSourceCode(variableContext);
//			var valueToAssign=expContexts.get(i);
//			System.out.printf("name: '%s', valueHash: '%s'%n",variableName,valueToAssign.getValue().hashCode());
//
//			if(variableContext instanceof Nutt.Explicit_variableContext)
//			{
//				valuables.add(NuttInterpreter.currentScope.setVariable(variableName,valueToAssign).valuable);
//			}
//			else
//				//Assign to Listable element
//				if(variableContext instanceof Nutt.Array_accessContext acc)
//				{
//					NuttEnvironment.toSourceCode(acc.arr);
//					var listable=evaluator.visit(acc.arr).asFunctional().asListable();
//					if(!TypeInferencer.verdict("Listable",listable.getType()))
//					{
//						TypeInferencer.prettyPrintTypeTree();
//						throw new RuntimeException();
//					}
//					var index=evaluator.visit(acc.index);
//					if(!TypeInferencer.verdict("Int",index.getType()))
//					{
//						throw new RuntimeException();
//					}
//					var asSourceCode=NuttEnvironment.toSourceCode(acc.arr).trim();
//					var replacedElement=listable.setAt(valueToAssign,index.asFunctional().asNumerable().asInt());
//					valuables.add(NuttInterpreter.currentScope.setVariable(asSourceCode,replacedElement).valuable);
//				}
//				else throw new RuntimeException();
//			++i;
//		}
//		return valuables.size()>1?new Array("Valuable",valuables):valuables.get(0);
//	}
//}