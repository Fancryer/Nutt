package Nutt.Interpreter.References;

import Nutt.Exceptions.NuttConstantReferenceWriteException;
import Nutt.Interpreter.NuttInterpreter.EConstantQualifier;
import Nutt.Runtime.Mutable;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;
import Nutt.Types.Nil;
import lombok.Getter;
import lombok.Setter;

import static Nutt.Interpreter.NuttInterpreter.EConstantQualifier.*;

@Getter
public class NuttReference
{
	protected final Mutable<IValuable> value;
	@Getter
	protected final EConstantQualifier qualifier;
	@Getter
	protected final Type ceilType;
	@Setter
	protected String name;

	public NuttReference(String name,IValuable value)
	{
		this(name,new Mutable<>(value));
	}

	public NuttReference(String name,Mutable<IValuable> value)
	{
		this(name,value,Var);
	}

	public NuttReference(String name,Mutable<IValuable> value,EConstantQualifier qualifier)
	{
		this(name,value,qualifier,value.get().getType());
	}

	public NuttReference(String name,Mutable<IValuable> value,EConstantQualifier qualifier,Type ceilType)
	{
		this.name=name;
		this.value=value;
		this.qualifier=qualifier;
		this.ceilType=ceilType;
	}

	public NuttReference(String name)
	{
		this(name,new Mutable<>(new Nil()),Var);
	}

	public NuttReference(Mutable<IValuable> value,EConstantQualifier qualifier,Type type)
	{
		this("anonymous"+type,value,qualifier,type);
	}

	public Type getType()
	{
		return value.get().getType();
	}

	public <T extends IValuable,U> U getNestedValueAs(Class<T> type,Class<U> valueClass)
	{
		var val=getValueAs(type).getValue();
		if(!valueClass.isInstance(val)) throw new ClassCastException();
		return valueClass.cast(val);
	}

	public <T extends IValuable> T getValueAs(Class<T> type)
	{
		return getValue().simpleCast(type);
	}

	/** @return value of variable if variable appears as mutable, otherwise its copy. */
	public IValuable getValue()
	{
		return (isMutable()?value:value.replicate()).get();
	}

	public boolean isMutable()
	{
		return qualifier==Mut;
	}

	public NuttReference setValue(IValuable newValue)
	{
		if(isConstant()) throw new NuttConstantReferenceWriteException(name,newValue);
		else value.set(newValue);
		return this;
	}

	public boolean isConstant()
	{
		return qualifier==Val;
	}

	public boolean isWriteable()
	{
		return !isConstant();
	}

	@Override public String toString()
	{
		return "{name='%s',value=%s,qualifier=%s,ceilType=%s}".formatted(name,value.get(),qualifier,ceilType);
	}
}