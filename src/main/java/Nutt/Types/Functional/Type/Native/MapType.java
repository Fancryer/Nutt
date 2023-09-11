package Nutt.Types.Functional.Type.Native;

import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Listable.Map.Map;
import lombok.Getter;

import java.util.List;

public class MapType extends NativeType
{
	@Getter
	private final static MapType instance=new MapType();

	public MapType()
	{
		super(ListableType.getInstance(),"Map");
		propertyMap.put
				           (
						           "get",
						           new NativeProcedure("get",new Signature("m:Map,k:Valuable","Valuable"))
						           {
							           @Override
							           public NuttReference proceed(List<NuttReference> argumentList) throws NuttSuccessReturnException
							           {
								           return argumentList.get(0).getValueAs(Map.class).getAt(argumentList.get(1));
							           }
						           }.toAnonymousReference()
				           );
	}
}
