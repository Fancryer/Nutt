package Nutt.Types.Functional.Type.Native;

import lombok.Getter;

public class NumerableType extends NativeType
{
	@Getter
	private final static NumerableType instance=new NumerableType();

	public NumerableType()
	{
		super(FunctionalType.getInstance(),"Numerable");
	}
}
