package Nutt.Visitors;

import Nutt.Interpreter.References.NuttReference;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Listable.Array.Array;
import gen.Nutt.Array_elementContext;
import gen.Nutt.Explicit_arrayContext;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class NuttArrayVisitor extends NuttGenericVisitor
{
	@Override public NuttReference visitExplicit_array(Explicit_arrayContext ctx)
	{
		var elementContexts=ctx
				.array_initializer()
				.array_element();
		if(elementContexts.isEmpty()) return new Array().toAnonymousReference();
		var arrayElements=elementContexts.stream()
		                                 .map(this::extractReferences)
		                                 .flatMap(Collection::stream)
		                                 .collect(Collectors.toCollection(ArrayList::new));
		var boundType=TypeInferencer.getCommonWrapperType(arrayElements);
		return new Array(boundType.getType(),arrayElements).toAnonymousReference();
	}

	private List<NuttReference> extractReferences(Array_elementContext ctx)
	{
		return ctx.spread_pair()!=null
		       ?VisitorPool.evalVisitor.visit(ctx.spread_pair().exp())
		                               .getValue()
		                               .asFunctional()
		                               .spread()
		                               .getElements()
		       :List.of(VisitorPool.evalVisitor.visit(ctx.exp()));
	}
}