package Nutt.ParseHelpers;

import Nutt.NuttEnvironment;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;

public record CeiledValue(Type ceilType,IValuable value)
{
	public CeiledValue(String ceilType,IValuable value)
	{
		this(TypeInferencer.findTypeReference(ceilType),value);
	}

	public CeiledValue(Type ceilType)
	{
		this(ceilType,NuttEnvironment.constructValuable(ceilType));
	}
}