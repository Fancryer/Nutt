//package Nutt.Types.Functional.Actionable.Procedure.Native.Files;
//
//import Nutt.Annotations.ANativeProcedure;
//import Nutt.Exceptions.NuttSuccessReturnException;
//import Nutt.NuttCommon;
//import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
//import Nutt.Types.Functional.Actionable.Procedure.Signature;
//import Nutt.Types.Functional.Listable.Array.Array;
//import Nutt.Types.Functional.Listable.String.String;
//import Nutt.Types.Functional.Numerable.Boolean;
//import Nutt.Types.Functional.Numerable.Int.Int;
//import Nutt.Types.IValuable;
//
//import java.util.List;
//import java.util.stream.IntStream;
//
//@ANativeProcedure("native.files")
//public class ReadFile extends NativeProcedure
//{
//	public ReadFile()
//	{
//		super("read_file",new Signature("path:String,binary:Boolean=false","Valuable"));
//	}
//
//	@Override public IValuable proceed(List<IValuable> argumentList) throws NuttSuccessReturnException
//	{
//		var asBinary=argumentList.size()>1?argumentList.get(1).asFunctional().asBoolean():new Boolean();
//		java.lang.String elementBoundType;
//		List<IValuable> valuables;
//		if(asBinary.isTrue())
//		{
//			var byteArray=NuttCommon.readFileBytes(argumentList.get(0).toString());
//			elementBoundType="Int";
//			valuables=IntStream.range(0,byteArray.length)
//			                   .mapToObj(i->byteArray[i]).map(Byte::intValue)
//			                   .map(value->new Int(value).asValuable())
//			                   .toList();
//		}
//		else
//		{
//			elementBoundType="String";
//			valuables=NuttCommon.readFileLines(argumentList.get(0).toString())
//			                    .stream()
//			                    .map(line->new String(line).asValuable())
//			                    .toList();
//		}
//		return new Array(elementBoundType,valuables);
//	}
//}
