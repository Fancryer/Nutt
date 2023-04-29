package Nutt.Exceptions;

import Nutt.NuttCommon;
import Nutt.Types.Functional.Type.IType;

import java.util.List;

public class NuttParameterizationException extends RuntimeException
{
	public NuttParameterizationException(String typeName,List<IType> typeParameters)
	{
		super(
				typeName
				+"cannot be parameterized with {"
				+NuttCommon.removeFirstAndLastChars(typeParameters.toString())
				+"} type parameters!"
		     );
	}
}
