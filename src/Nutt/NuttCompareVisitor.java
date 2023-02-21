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
		String leftAsString=left.getValue().toString(), rightAsString=right.getValue().toString();
		var operator=ctx.operatorComparison();
		var compareResult=leftAsString.compareTo(rightAsString);
		boolean verdict=false;
		if(operator.OP_Less()!=null) verdict=compareResult<0;
		if(operator.OP_LessEqual()!=null) verdict=compareResult<=0;
		if(operator.OP_Similar()!=null) verdict=compareResult==0;
		if(operator.OP_Equal()!=null)
			verdict=new TypeInferencer().verdict(left.getType(),right.getType())&&compareResult==0;
		if(operator.OP_NotSimilar()!=null) verdict=compareResult!=0;
		if(operator.OP_NotEqual()!=null)
			verdict=new TypeInferencer().verdict(left.getType(),right.getType())&&compareResult!=0;
		if(operator.OP_Greater()!=null) verdict=compareResult>0;
		if(operator.OP_GreaterEqual()!=null) verdict=compareResult>=0;
		//System.out.printf("%s %s %s -> %s: %s",leftAsString,operator.getText(),rightAsString,compareResult,verdict);
		return verdict;
	}
}