package Nutt.Types.Functional.Actionable.Procedure.Native.Files;

import Nutt.Annotations.ANativeProcedure;
import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Interpreter.References.NilReference;
import Nutt.Interpreter.References.NuttReference;
import Nutt.NuttCommon;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Numerable.Int.Int;

import java.util.List;
import java.util.stream.IntStream;

@ANativeProcedure("native.files")
public class WriteFile extends NativeProcedure
{
	public WriteFile()
	{
		super("write_file",new Signature("path:String,data:Listable","Valuable"));
	}

	@Override public NuttReference proceed(List<NuttReference> argumentList) throws NuttSuccessReturnException
	{
		var path=argumentList.get(0).getValue().toString();
		var data=argumentList.get(1);
		if(TypeInferencer.verdict("String",data.getType()))
		{
			NuttCommon.writeFile(path,List.of(data.toString()));
			return NilReference.getInstance();
		}
		else if(TypeInferencer.verdict("Int",data.getValue().toArray().getElementType()))
		{
			var elements=data.getValue().toArray().getValue();
			var bytes=new byte[elements.size()];
			IntStream.range(0,data.getValue().toArray().getElements().size())
			         .forEach
					         (
							         i->bytes[i]=elements.get(i)
							                             .simpleCast(Int.class)
							                             .getValue()
							                             .byteValue()
					         );
			NuttCommon.writeFile(path,bytes);
			return NilReference.getInstance();
		}
		throw new RuntimeException("Unsupported type");
	}
}
