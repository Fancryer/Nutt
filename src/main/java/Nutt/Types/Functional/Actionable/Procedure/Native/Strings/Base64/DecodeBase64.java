package Nutt.Types.Functional.Actionable.Procedure.Native.Strings.Base64;

import Nutt.Annotations.ANativeProcedure;
import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Numerable.Int.Int;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@ANativeProcedure("native.strings.base64")
public class DecodeBase64 extends NativeProcedure
{
	public DecodeBase64()
	{
		super("decode_base64",new Signature("str:String","Array"));
	}

	@Override
	public NuttReference proceed(List<NuttReference> argumentList) throws NuttSuccessReturnException
	{
		var byteArray=argumentList.get(0).getValue().asFunctional().asListable().asString();
		var bytes=Base64.getDecoder().decode(byteArray.getValue().getBytes());
		var decoded=new ArrayList<NuttReference>();
		for(var b: bytes) decoded.add(new Int(b).toAnonymousReference());
		return new Array(decoded).toAnonymousReference();
	}
}
