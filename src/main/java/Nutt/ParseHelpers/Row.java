package Nutt.ParseHelpers;

import Nutt.Interpreter.References.NuttReference;
import lombok.Builder;

@Builder
@lombok.With
public record Row(String name,String ceilType,NuttReference reference)
{
	public Row(String name,NuttReference reference)
	{
		this(name,reference.getType().getHeader().getDisplayName(),reference);
	}

	@Override public String toString()
	{
		return "%s:%s".formatted(name,reference.getValue().toSerializedString());
	}
}
