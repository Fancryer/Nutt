package Nutt.Types.Functional;

import Nutt.Common.TypeRelation;
import Nutt.Types.IValuable;

public class Type implements IValuable
{
	public final String displayName;
	public final TypeRelation relation;
	
	public Type(String displayName,TypeRelation relation)
	{
		this.displayName=displayName;
		this.relation=relation;
	}
	
	public Type(TypeRelation relation)
	{
		this(relation.typeName(),relation);
	}
	
	@Override
	public Object getValue()
	{
		return displayName;
	}
	
	@Override
	public String getType()
	{
		return displayName;
	}
	
	@Override
	public int compareTo(IValuable o)
	{
		return 0;
	}
	
	@Override
	public int getLength()
	{
		return relation.members().size();
	}
}
