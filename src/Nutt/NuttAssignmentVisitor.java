package Nutt;

import gen.NuttBaseVisitor;
import gen.NuttParser;

public class NuttAssignmentVisitor extends NuttBaseVisitor<String>
{
	NuttParser parser;
	NuttInterpreter interpreter;
	boolean debug;

	public NuttAssignmentVisitor(NuttParser parser,NuttInterpreter interpreter)
	{
		this(parser,interpreter,false);
	}

	public NuttAssignmentVisitor(NuttParser parser,NuttInterpreter interpreter,boolean debug)
	{
		this.parser=parser;
		this.interpreter=interpreter;
		this.debug=debug;
	}

	@Override
	public String visitGroup_assignment(NuttParser.Group_assignmentContext ctx)
	{
		var evaluator=new NuttEvalVisitor(parser,interpreter);
		var variableContexts=ctx.var_or_array_access();
		var expContexts=ctx.exp().stream().map(evaluator::visit).toList();
		assert variableContexts.size()==expContexts.size()&&variableContexts.size()!=0:"Unbalanced assignment!";
		int i=0;
		for(var variableContext: variableContexts)
		{
			var variableName=NuttEnvironment.toSourceCode(variableContext);
			var valueToAssign=expContexts.get(i);
			if(variableContext.var()!=null) interpreter.currentScope.setVariable(variableName,valueToAssign);
			else//Assign to Listable element
			{
				var listable=evaluator.visit(variableContext.arr);
				if(!new TypeInferencer().verdict("Listable",listable.getType()))
				{
					throw new RuntimeException();
				}
				var index=evaluator.visit(variableContext.index);
				if(!new TypeInferencer().verdict("Int",index.getType()))
				{
					throw new RuntimeException();
				}
				interpreter.currentScope.setVariable(NuttEnvironment.toSourceCode(variableContext.arr).trim(),
				                                     listable.asFunctional().asListable().setAt(valueToAssign,index.asFunctional().asNumerable().asInt()));
			}
			++i;
		}
		return "";
	}
}