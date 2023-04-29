package Nutt.Visitors;

import Nutt.TypeInferencer;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.IValuable;
import gen.NuttParser;

import java.util.ArrayList;

public class NuttArrayVisitor extends NuttGenericVisitor
{

	@Override public Array visitExplicit_array(NuttParser.Explicit_arrayContext ctx)
	{
		var expList=ctx
				.list_initializer()
				.explist();
		if(expList==null) return new Array();
		var evaluator=new NuttEvalVisitor();
		var firstElement=evaluator.visit(expList.exp(0));
		var boundType=firstElement.getType();

		ArrayList<IValuable> arrayElements=new ArrayList<>();
		arrayElements.add(firstElement);
		for(int i=1;i<expList
				.exp()
				.size();++i)
		{
			var exp=evaluator.visit(expList.exp(i));
			arrayElements.add(exp);
			boundType=TypeInferencer.getCommonWrapperType(boundType,exp.getType());
		}
		return new Array(boundType,arrayElements);
	}
}