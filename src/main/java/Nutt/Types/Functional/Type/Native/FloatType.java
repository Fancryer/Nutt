package Nutt.Types.Functional.Type.Native;

import lombok.Getter;

public class FloatType extends NativeType
{
	@Getter
	private final static FloatType instance=new FloatType();

	public FloatType()
	{
		super(NumerableType.getInstance(),"Float");
	}
}
