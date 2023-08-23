package Nutt.Types.Functional.Actionable.Procedure.Native.Strings.Base64;

import Nutt.Annotations.ANativeProcedure;
import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Interpreter.References.NuttReference;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Listable.String.String;

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
		var byteArray=argumentList.get(0).getValue().asFunctional().asListable().asArray();
		if(!TypeInferencer.verdict("Int",byteArray.getElementType())) throw new RuntimeException("Array is not of type Int");
		var arrayLength=byteArray.getType()
		                         .getOperator("#")
		                         .proceed(List.of(argumentList.get(0)))
		                         .getValue()
		                         .asFunctional()
		                         .asNumerable()
		                         .asInt()
		                         .getValue()
		                         .intValue();
		var bytes=new byte[arrayLength];
		for(int i=0;i<arrayLength;++i)
		{
			bytes[i]=byteArray.getAt(i)
			                  .getValue()
			                  .asFunctional()
			                  .asNumerable()
			                  .asInt()
			                  .getValue()
			                  .byteValue();
		}
		return new String(Base64.getEncoder().encode(bytes)).toAnonymousReference();
	}
}
