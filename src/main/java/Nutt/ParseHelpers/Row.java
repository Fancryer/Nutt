package Nutt.ParseHelpers;

import Nutt.TypeInferencer;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;

public record Row(java.lang.String name,CeiledValue ceiledValue)
{
	public Row(java.lang.String name,java.lang.String ceilType)
	{
		this(name,TypeInferencer.findTypeReference(ceilType).getType());
	}

	public Row(java.lang.String name,Type ceilType)
	{
		this(name,new CeiledValue(ceilType));
	}

	public Row(java.lang.String name,Type ceilType,IValuable valuable)
	{
		this(name,ceilType.getDisplayName(),valuable);
	}

	public Row(java.lang.String name,java.lang.String ceilType,IValuable valuable)
	{
		this(name,new CeiledValue(ceilType,valuable));
	}

	public Type ceilType()
	{
		return ceiledValue().ceilType();
	}

	public IValuable value()
	{
		return ceiledValue().value();
	}

	@Override public java.lang.String toString()
	{
		return "%s:%s".formatted(name,ceiledValue.value().toSerializedString());
	}

	public Row setName(java.lang.String name)
	{
		return new Row(name,ceiledValue);
	}

	public Row setCeiledValue(CeiledValue ceiledValue)
	{
		return new Row(name,ceiledValue);
	}

	public Row setCeilType(java.lang.String ceilType)
	{
		return new Row(name,new CeiledValue(ceilType,ceiledValue.value()));
	}

	public Row setValue(IValuable value)
	{
		return new Row(name,new CeiledValue(ceiledValue.ceilType(),value));
	}
}
