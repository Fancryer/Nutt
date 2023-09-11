package Nutt.Types.Functional.Actionable.Procedure.Native.Strings.Base64;

import Nutt.Annotations.ANativeProcedure;
import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Interpreter.References.NuttReference;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
import Nutt.Types.Functional.Actionable.Procedure.Procedure;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.String.String;
import Nutt.Types.Functional.Numerable.Int.Int;

import java.util.Base64;
import java.util.List;

@ANativeProcedure("native.strings.base64")
public class EncodeBase64 extends NativeProcedure
{
	public EncodeBase64()
	{
		super("encode_base64",new Signature("str:Array","String"));
	}

	@Override
	public NuttReference proceed(List<NuttReference> argumentList) throws NuttSuccessReturnException
	{
		var byteArray=argumentList.get(0).getValueAs(Array.class);
		if(!TypeInferencer.verdict("Int",byteArray.getElementType())) throw new RuntimeException("Array is not of type Int");
		var arrayLength=byteArray.getType()
		                         .getOperator("#")
		                         .getValueAs(Procedure.class)
		                         .proceed(List.of(argumentList.get(0)))
		                         .getValueAs(Int.class)
		                         .getValue()
		                         .intValue();
		var bytes=new byte[arrayLength];
		for(int i=0;i<arrayLength;++i)
		{
			bytes[i]=byteArray.getAt(i)
			                  .getValueAs(Int.class)
			                  .getValue()
			                  .byteValue();
		}
		return new String(Base64.getEncoder().encode(bytes)).toAnonymousReference();
	}
}
