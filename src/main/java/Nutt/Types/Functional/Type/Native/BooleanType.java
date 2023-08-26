package Nutt.Types.Functional.Type.Native;

import lombok.Getter;

public class BooleanType extends NativeType
{
	@Getter
	private final static BooleanType instance=new BooleanType();

	public BooleanType()
	{
		super(IntType.getInstance(),"Boolean");
	}
}
