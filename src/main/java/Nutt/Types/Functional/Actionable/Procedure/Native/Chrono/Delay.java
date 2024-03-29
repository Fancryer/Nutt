package Nutt.Types.Functional.Actionable.Procedure.Native.Chrono;

import Nutt.Annotations.ANativeProcedure;
import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
import Nutt.Types.Functional.Actionable.Procedure.Procedure;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Numerable.Int.Int;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ANativeProcedure("native.chrono.delay")
public class Delay extends NativeProcedure
{
	public Delay()
	{
		super("delay",new Signature("s:Float,f=()==>nil","Nil"));
	}

	@Override public NuttReference proceed(List<NuttReference> argumentList) throws NuttSuccessReturnException
	{
		var milliseconds=argumentList.get(0)
		                             .getValueAs(Int.class);
		Runnable command=argumentList.size()>1
		                 ?((Procedure)argumentList.get(1).getValue())::proceed
		                 :(()->
		                   {
		                   });
		try(var executorService=Executors.newSingleThreadScheduledExecutor())
		{
			executorService.schedule(command,milliseconds.asLong(),TimeUnit.MILLISECONDS);
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
		return milliseconds.toAnonymousReference();
	}
}