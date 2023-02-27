package Nutt.Common;

import java.util.Set;

public record TypeRelation(String typeName,Set<String> members)
{
	public TypeRelation addMember(String typeName)
	{
		members.add(typeName);
		return this;
	}
}