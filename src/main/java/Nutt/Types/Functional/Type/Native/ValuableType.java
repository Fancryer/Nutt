package Nutt.Types.Functional.Type.Native;

import lombok.Getter;

public class ValuableType extends NativeType
{
	@Getter
	private final static ValuableType instance=new ValuableType();

	public ValuableType()
	{
		super("Valuable");
	}
}
