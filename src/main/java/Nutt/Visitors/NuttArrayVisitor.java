package Nutt.Visitors;

import Nutt.Interpreter.References.NuttReference;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Listable.Array.Array;
import gen.Nutt;
import gen.Nutt.Array_elementContext;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static Nutt.Visitors.VisitorPool.evalVisitor;

public class NuttArrayVisitor extends NuttGenericVisitor
{
	@Override public NuttReference visitArray_initializer_exp(Nutt.Array_initializer_expContext ctx)
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
		NuttReference exp=evalVisitor.visit(ctx.exp());
		return ctx.OP_Pass()!=null
		       ?exp.getValue()
		           .spread()
		           .getElements()
		       :List.of(exp);
	}
}