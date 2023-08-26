package Nutt.Types.Functional.Type.Native;

import lombok.Getter;

public class ListableType extends NativeType
{
	@Getter
	private final static ListableType instance=new ListableType();

	public ListableType()
	{
		super(FunctionalType.getInstance(),"Listable");
	}
}
