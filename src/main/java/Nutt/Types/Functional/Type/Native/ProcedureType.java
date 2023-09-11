package Nutt.Types.Functional.Type.Native;

import lombok.Getter;

public class ProcedureType extends NativeType
{
	@Getter
	private final static ProcedureType instance=new ProcedureType();

	public ProcedureType()
	{
		super(ActionableType.getInstance(),"Procedure");
	}
}
