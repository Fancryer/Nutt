package Nutt.Types.Functional.Type.Native;

import lombok.Getter;

public class TypeType extends NativeType
{
	@Getter
	private final static TypeType instance=new TypeType();

	public TypeType()
	{
		super("Type");
	}
}
