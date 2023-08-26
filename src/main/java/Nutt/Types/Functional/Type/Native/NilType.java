package Nutt.Types.Functional.Type.Native;

import lombok.Getter;

public class NilType extends NativeType
{
	@Getter
	private final static NilType instance=new NilType();

	public NilType()
	{
		super(ValuableType.getInstance(),"Nil");
	}
}
