package Nutt.Types.Functional.Type.Native;

import lombok.Getter;

public class RecordType extends NativeType
{
	@Getter
	private final static RecordType instance=new RecordType();

	public RecordType()
	{
		super(FunctionalType.getInstance(),"Record");
	}
}
