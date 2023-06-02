package Nutt.Exceptions;

import Nutt.NuttCommon;
import Nutt.Types.Functional.Type.Type;

import java.util.List;

public class NuttParameterizationException extends RuntimeException
{
	public NuttParameterizationException(String typeName,List<Type> typeParameters)
	{
		super(
				typeName
				+"cannot be parameterized with {"
				+NuttCommon.removeFirstAndLastChars(typeParameters.toString())
				+"} type parameters!"
		     );
	}
}
