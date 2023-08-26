package Nutt.Types.Functional.Type.Native;

import Nutt.Types.Functional.Actionable.Procedure.Operator;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Listable.Map.Map;
import lombok.Getter;

public class MapType extends NativeType
{
	@Getter
	private final static MapType instance=new MapType();

	public MapType()
	{
		super(ListableType.getInstance(),"Map");
		addOperators
				(
						Operator.builder()
						        .name("get")
						        .signature(new Signature("m:Map,k:Valuable","Valuable"))
						        .function(list->list.get(0).getValue().simpleCast(Map.class).getAt(list.get(1)))
						        .build()
						        .toAnonymousReference()
				);
	}
}
