package Nutt.Types.Functional.Type.Native;

import lombok.Getter;

public class FunctionalType extends NativeType
{
	@Getter
	private final static FunctionalType instance=new FunctionalType();

	public FunctionalType()
	{
		super(ValuableType.getInstance(),"Functional");
	}
}
