package Nutt.Types.Functional.Actionable.Procedure.Native.Arrays;

import Nutt.Annotations.ANativeProcedure;
import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
import Nutt.Types.Functional.Actionable.Procedure.Procedure;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Listable.IListable;
import Nutt.Types.Functional.Numerable.Boolean;
import Nutt.Types.Functional.Numerable.Int.Int;

import java.util.List;

@ANativeProcedure("native.arrays")
public class Count extends NativeProcedure
{
	public Count()
	{
		super("count",new Signature("arr_0:Listable,val","Array"));
	}

	@Override public NuttReference proceed(List<NuttReference> argumentList) throws NuttSuccessReturnException
	{
		var list=argumentList.get(0).getValue().simpleCast(IListable.class);
		var seeking=argumentList.get(1);
		var count=list.stream()
		              .filter
				              (
						              el->el.getType()
						                    .getOperator("===")
						                    .getValue()
						                    .simpleCast(Procedure.class)
						                    .proceed(List.of(el,seeking))
						                    .getValue()
						                    .simpleCast(Boolean.class)
						                    .isTrue()
				              )
		              .count();
		return new Int(count).toAnonymousReference();
	}
}
