package Nutt.Exceptions;

import Nutt.NuttCommon;
import Nutt.Types.Functional.Type.Type;

import java.util.List;

public class NuttParameterizationException extends RuntimeException
{
	public NuttParameterizationException(String typeName,List<Type> typeParameters)
	{
		super(
				"%s cannot be parameterized with {%s} type parameters!".formatted
						                                                      (
								                                                      typeName,
								                                                      NuttCommon.removeFirstAndLastChars(typeParameters.toString())
						                                                      )
		     );
	}
}
