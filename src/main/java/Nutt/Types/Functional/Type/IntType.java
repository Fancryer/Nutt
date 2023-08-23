package Nutt.Types.Functional.Type;

import Nutt.TypeInferencer;

public class IntType extends Type
{
	private final static IntType instance=new IntType();

	public IntType()
	{
		super(TypeInferencer.findTypeReference("Numerable").getType(),"Int");
	}

	public static IntType getInstance()
	{
		return instance;
	}
}
