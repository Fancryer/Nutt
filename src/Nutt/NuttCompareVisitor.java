package Nutt;

import Nutt.Types.IValuable;
import gen.NuttBaseVisitor;
import gen.NuttParser;

public class NuttCompareVisitor extends NuttBaseVisitor<Boolean>
{
	NuttParser parser;
	NuttInterpreter interpreter;
	boolean debug;

	public NuttCompareVisitor(NuttParser parser,NuttInterpreter interpreter)
	{
		this(parser,interpreter,false);
	}

	public NuttCompareVisitor(NuttParser parser,NuttInterpreter interpreter,boolean debug)
	{
		this.parser=parser;
		this.interpreter=interpreter;
		this.debug=debug;
	}

	@Override
	public Boolean visitComparison_expression(NuttParser.Comparison_expressionContext ctx)
	{
		var evaluator=new NuttEvalVisitor(parser,interpreter);
		IValuable left=evaluator.visit(ctx.left), right=evaluator.visit(ctx.right);
		var operator=ctx.operatorComparison().getText();
		var compareResult=left.compareTo(right);
		var typesAreSame=new TypeInferencer().verdict(left.getType(),right.getType());
		boolean verdict=switch(operator)
				{
					case "<" -> compareResult<0;
					case "<=" -> compareResult<=0;
					case "==" -> compareResult==0;
					case "===" -> typesAreSame&&compareResult==0;
					case "!=" -> compareResult!=0;
					case "!==" -> typesAreSame&&compareResult!=0;
					case ">" -> compareResult>0;
					case ">=" -> compareResult>=0;
					default -> false;
				};
		if(debug) System.out.printf("%s %s %s -> %s: %s%n",left.getValue(),operator,right.getValue(),compareResult,verdict);
		return verdict;
	}
}