package Nutt.Types.Functional.Type.Native;

import lombok.Getter;

public class ActionableType extends NativeType
{
	@Getter
	private final static ActionableType instance=new ActionableType();

	public ActionableType()
	{
		super(FunctionalType.getInstance(),"Actionable");
	}
}
