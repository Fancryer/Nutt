//package Nutt.Types.Functional.Actionable.Procedure.Native.Strings.Base64;
//
//import Nutt.Annotations.ANativeProcedure;
//import Nutt.Exceptions.NuttSuccessReturnException;
//import Nutt.TypeInferencer;
//import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
//import Nutt.Types.Functional.Actionable.Procedure.Signature;
//import Nutt.Types.Functional.Listable.String.String;
//import Nutt.Types.IValuable;
//
//import java.util.Base64;
//import java.util.List;
//
//@ANativeProcedure("native.strings.base64")
//public class EncodeBase64 extends NativeProcedure
//{
//	public EncodeBase64()
//	{
//		super("encode_base64",new Signature("str:Array","String"));
//	}
//
//	@Override
//	public IValuable proceed(List<IValuable> argumentList) throws NuttSuccessReturnException
//	{
//		var byteArray=argumentList.get(0).asFunctional().asListable().asArray();
//		if(!TypeInferencer.verdict("Int",byteArray.getElementType())) throw new RuntimeException("Array is not of type Int");
//		var bytes=new byte[byteArray.getLength()];
//		for(int i=0;i<byteArray.getLength();++i)
//		{
//			bytes[i]=byteArray.getAt(i)
//			                  .asFunctional()
//			                  .asNumerable()
//			                  .asInt()
//			                  .getValue()
//			                  .byteValue();
//		}
//		return new String(Base64.getEncoder().encode(bytes));
//	}
//}
