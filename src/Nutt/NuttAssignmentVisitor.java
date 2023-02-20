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
		var variableContexts=ctx.varlist().var();
		var expContexts=ctx.explist().varExpOrPar();
		assert variableContexts.size()==expContexts.size()&&variableContexts.size()!=0:"Unbalanced assignment!";
		int i=0;
		for(var variableContext: variableContexts)
		{
			var variableName=variableContext.NAME().getText();
			if(interpreter.getVariable(variableName).isConstant)
			{
				++i;
				continue;
			}
			var valueToAssign=new NuttEvalVisitor(parser,interpreter).visitVarExpOrPar(expContexts.get(i));
			if(debug)
			{
				var fmt="Trying to assign value %s of type %s to %s of type %s%n";
				var args=new Object[]
						{
								valueToAssign,valueToAssign.getType(),variableName,
								interpreter.getValuable(variableName).getType()
						};
				System.out.printf(fmt,args);
			}
			interpreter.currentScope.setVariable(variableName,valueToAssign);
			++i;
		}
		return "";
	}
}