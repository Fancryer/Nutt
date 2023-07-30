package Nutt.Types.Functional.Actionable.Procedure.Native.Files;

import Nutt.Annotations.ANativeProcedure;
import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Interpreter.References.NilReference;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
import Nutt.Types.Functional.Actionable.Procedure.Signature;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@ANativeProcedure("native.files")
public class DeleteFile extends NativeProcedure
{
	public DeleteFile()
	{
		super("delete_file",new Signature("path:String"));
	}

	@Override public NuttReference proceed(List<NuttReference> argumentList) throws NuttSuccessReturnException
	{
		String path=argumentList.get(0).getValue().toString();
		try
		{
			Files.deleteIfExists(Path.of(path));
		}
		catch(IOException e)
		{
			throw new RuntimeException(e);
		}
		return NilReference.getInstance();
	}
}
