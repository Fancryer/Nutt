package Nutt.Types.Functional.Type.Native;

import Nutt.Types.Functional.Actionable.Procedure.Operator;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Listable.String.String;
import lombok.Getter;

public class StringType extends NativeType
{
	@Getter
	private final static StringType instance=new StringType();

	public StringType()
	{
		super(ListableType.getInstance(),"String");
		addOperators
				(
						Operator.builder()
						        .name("+")
						        .signature(new Signature("a:String,b:String","String"))
						        .function
								        (
										        (left,right)->new String
												        (
														        left.getValueAs(String.class).getValue()
														        +right.getValue().toString()
												        ).toAnonymousReference()
								        )
						        .build()
						        .toAnonymousReference()

				);
	}
}
