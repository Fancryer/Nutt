package Nutt.Types.Functional.Actionable.Procedure.Native.Arrays;

import Nutt.Annotations.ANativeProcedure;
import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.IListable;

import java.util.ArrayList;
import java.util.List;

@ANativeProcedure("native.arrays")
public class Distinct extends NativeProcedure
{
	public Distinct()
	{
		super("distinct",new Signature("arr_0:Listable","Array"));
	}

	@Override
	public NuttReference proceed(List<NuttReference> argumentList) throws NuttSuccessReturnException
	{
		var list=argumentList.get(0).getValue().simpleCast(IListable.class);
		var result=new ArrayList<NuttReference>();
		for(var el: list)
		{
			var distinct=result.stream()
			                   .map(NuttReference::getValue)
			                   .noneMatch(valuable->valuable.equals(el.getValue()));
			if(distinct) result.add(el);
		}
		return new Array(list.getElementType(),result).toAnonymousReference();
	}
}
