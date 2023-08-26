package Nutt.Types.Functional.Type.Native;

import Nutt.Exceptions.NuttTypeCastException;
import Nutt.Types.Functional.Actionable.Procedure.Operator;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Numerable.Int.Int;
import Nutt.Types.IValuable;
import lombok.Getter;

public class IntType extends NativeType
{
	@Getter
	private final static IntType instance=new IntType();

	public IntType()
	{
		super(NumerableType.getInstance(),"Int");
		var intSignature=new Signature("a:Int,b:Int","Int");
		addOperators
				(
						Operator.builder()
						        .name("+")
						        .signature(intSignature)
						        .function
								        (
										        list->
										        {
											        IValuable self=list.get(1).getValue();
											        if(!Int.class.isInstance(self))
												        throw new NuttTypeCastException(self.getType().toString(),
												                                        Int.class.getSimpleName());
											        IValuable self1=list.get(0).getValue();
											        if(!Int.class.isInstance(self1))
												        throw new NuttTypeCastException(self1.getType().toString(),
												                                        Int.class.getSimpleName());
											        Int left=Int.class.cast(self1),
													        right=Int.class.cast(self);
											        var resString=left.asBigInteger().add(right.asBigInteger()).toString();
											        return Int.fromString(resString).toAnonymousReference();
										        }
								        )
						        .build()
						        .toAnonymousReference(),
						Operator.builder()
						        .name("-")
						        .signature(intSignature)
						        .function
								        (
										        list->
										        {
											        IValuable self=list.get(1).getValue();
											        if(!Int.class.isInstance(self))
												        throw new NuttTypeCastException(self.getType().toString(),
												                                        Int.class.getSimpleName());
											        IValuable self1=list.get(0).getValue();
											        if(!Int.class.isInstance(self1))
												        throw new NuttTypeCastException(self1.getType().toString(),
												                                        Int.class.getSimpleName());
											        Int left=Int.class.cast(self1),
													        right=Int.class.cast(self);
											        var resString=left.asBigInteger().subtract(right.asBigInteger()).toString();
											        return Int.fromString(resString).toAnonymousReference();
										        }
								        )
						        .build()
						        .toAnonymousReference(),
						Operator.builder()
						        .name("*")
						        .signature(intSignature)
						        .function
								        (
										        list->
										        {
											        IValuable self=list.get(1).getValue();
											        if(!Int.class.isInstance(self))
												        throw new NuttTypeCastException(self.getType().toString(),
												                                        Int.class.getSimpleName());
											        IValuable self1=list.get(0).getValue();
											        if(!Int.class.isInstance(self1))
												        throw new NuttTypeCastException(self1.getType().toString(),
												                                        Int.class.getSimpleName());
											        Int left=Int.class.cast(self1),
													        right=Int.class.cast(self);
											        var resString=left.asBigInteger().multiply(right.asBigInteger()).toString();
											        return Int.fromString(resString).toAnonymousReference();
										        }
								        )
						        .build()
						        .toAnonymousReference()
				);
	}
}
