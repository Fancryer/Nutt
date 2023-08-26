package Nutt.Types.Functional.Type.Native;

import lombok.Getter;

public class StringType extends NativeType
{
	@Getter
	private final static StringType instance=new StringType();

	public StringType()
	{
		super(ListableType.getInstance(),"String");
	}
}
