package Nutt.Types.Functional.Type.Native;

import Nutt.Types.Functional.Actionable.Procedure.Operator;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Numerable.Boolean;
import lombok.Getter;

public class BooleanType extends NativeType
{
	@Getter
	private final static BooleanType instance=new BooleanType();

	public BooleanType()
	{
		super(IntType.getInstance(),"Boolean");
		addOperators
				(
						Operator.builder()
						        .name("&&")
						        .signature(new Signature("a:Boolean,b:Boolean","Boolean"))
						        .function
								        (
										        (left,right)->new Boolean
												        (
														        left.getValueAs(Boolean.class).isTrue()
														        &&right.getValueAs(Boolean.class).isTrue()
												        ).toAnonymousReference()
								        )
						        .build()
						        .toAnonymousReference()
				);
	}
}
