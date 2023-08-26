package Nutt.Types.Functional.Type.Native;

import lombok.Getter;

public class SetType extends NativeType
{
	@Getter
	private final static SetType instance=new SetType();

	public SetType()
	{
		super(ListableType.getInstance(),"Set");
	}
}
