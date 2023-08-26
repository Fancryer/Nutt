package Nutt.ParseHelpers;

import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Type.Type;
import lombok.Builder;

@Builder
@lombok.With
public record Row(String name,Type ceilType,NuttReference reference)
{
	public Row(String name,NuttReference reference)
	{
		this(name,reference.getType(),reference);
	}

	@Override public String toString()
	{
		return "%s:%s".formatted(name,reference.getValue().toSerializedString());
	}
}
