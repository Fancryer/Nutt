package Nutt.Types.Functional.Type.Native;

import Nutt.Types.Functional.Type.Type;

public abstract class NativeType extends Type
{
	public NativeType(String displayName)
	{
		super(displayName);
	}

	public NativeType(Type parent,String displayName)
	{
		super(parent,displayName);
	}
}
