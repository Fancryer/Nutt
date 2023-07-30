package Nutt.Visitors;

import Nutt.Interpreter.References.NuttReference;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Listable.Array.Array;
import gen.Nutt.Explicit_arrayContext;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class NuttArrayVisitor extends NuttGenericVisitor
{

	@Override public NuttReference visitExplicit_array(Explicit_arrayContext ctx)
	{
		var expList=ctx
				.list_initializer()
				.explist();
		if(expList==null) return new Array().toAnonymousReference();
		var arrayElements=expList.exp()
		                         .stream()
		                         .map(VisitorPool.evalVisitor::visit)
		                         .collect(Collectors.toCollection(ArrayList::new));
		var boundType=TypeInferencer.getCommonWrapperType(arrayElements);
		return new Array(boundType.getType(),arrayElements).toAnonymousReference();
	}
}