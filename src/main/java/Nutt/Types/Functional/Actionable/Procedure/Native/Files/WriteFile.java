//package Nutt.Types.Functional.Actionable.Procedure.Native.Files;
//
//import Nutt.Annotations.ANativeProcedure;
//import Nutt.Exceptions.NuttSuccessReturnException;
//import Nutt.NuttCommon;
//import Nutt.TypeInferencer;
//import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
//import Nutt.Types.Functional.Actionable.Procedure.Signature;
//import Nutt.Types.IValuable;
//import Nutt.Types.Nil;
//
//import java.util.List;
//import java.util.stream.IntStream;
//
//@ANativeProcedure("native.files")
//public class WriteFile extends NativeProcedure
//{
//	public WriteFile()
//	{
//		super("write_file",new Signature("path:String,data:Listable","Valuable"));
//	}
//
//	@Override public IValuable proceed(List<IValuable> argumentList) throws NuttSuccessReturnException
//	{
//		var path=argumentList.get(0).toString();
//		var data=argumentList.get(1);
//		if(TypeInferencer.verdict("String",data.getType()))
//		{
//			NuttCommon.writeFile(path,List.of(data.toString()));
//			return new Nil();
//		}
//		else if(TypeInferencer.verdict("Int",data.asElementsArray().getElementType()))
//		{
//			var elements=data.asElementsArray().getValue();
//			var bytes=new byte[elements.size()];
//			IntStream.range(0,data.asElementsArray().getLength())
//			         .forEach(
//					         i->bytes[i]=elements.get(i)
//					                             .asFunctional()
//					                             .asNumerable()
//					                             .asInt()
//					                             .getValue()
//					                             .byteValue()
//			                 );
//			NuttCommon.writeFile(path,bytes);
//			return new Nil();
//		}
//		throw new RuntimeException("Unsupported type");
//	}
//}
