package Nutt;

import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.IValuable;
import gen.NuttBaseVisitor;
import gen.NuttParser;

import java.util.ArrayList;

public class NuttArrayVisitor extends NuttBaseVisitor<Array>
{
	NuttParser parser;
	NuttInterpreter interpreter;
	boolean debug;

	public NuttArrayVisitor(NuttParser parser,NuttInterpreter interpreter)
	{
		this(parser,interpreter,false);
	}

	public NuttArrayVisitor(NuttParser parser,NuttInterpreter interpreter,boolean debug)
	{
		this.parser=parser;
		this.interpreter=interpreter;
		this.debug=debug;
	}

	@Override public Array visitExplicit_array(NuttParser.Explicit_arrayContext ctx)
	{
		var expList=ctx.list_initializer().explist();
		if(expList==null) return new Array();
		var evaluator=new NuttEvalVisitor(parser,interpreter);
		var firstElement=evaluator.visit(expList.exp(0));
		String initialType=firstElement.getType();
		String boundType=initialType;

		if(debug) System.out.printf("Found array initializer:%n%s%ninitialType = %s%n",
		                            NuttEnvironment.toSourceCode(ctx),
		                            initialType);
		ArrayList<IValuable> arrayElements=new ArrayList<>();
		arrayElements.add(firstElement);
		var interferencer=new TypeInferencer();
		for(int i=1;i<expList.exp().size();++i)
		{
			var exp=evaluator.visit(expList.exp(i));
			arrayElements.add(exp);
			boundType=interferencer.getCommonWrapperType(boundType,exp.getType());
		}
		if(debug) System.out.println("interferenced boundType = "+boundType+'\n');
		return new Array(boundType,arrayElements);
	}
}