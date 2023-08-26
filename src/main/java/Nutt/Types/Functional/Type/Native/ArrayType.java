package Nutt.Types.Functional.Type.Native;

import lombok.Getter;

public class ArrayType extends NativeType
{
	@Getter
	private final static ArrayType instance=new ArrayType();

	public ArrayType()
	{
		super(ListableType.getInstance(),"Array");
	}
}
