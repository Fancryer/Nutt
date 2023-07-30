package Nutt.Interpreter.References;

import Nutt.Exceptions.NuttConstantVariableWriteException;
import Nutt.Interpreter.NuttInterpreter.EConstantQualifier;
import Nutt.Runtime.Mutable;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;
import Nutt.Types.Nil;
import lombok.Getter;

import static Nutt.Interpreter.NuttInterpreter.EConstantQualifier.*;

@Getter
public class NuttReference
{
	private final String name;
	private final Mutable<IValuable> value;
	@Getter
	private final EConstantQualifier qualifier;
	@Getter
	private final Type ceilType;

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

	public Type getType()
	{
		return value.get().getType();
	}

	public IValuable getValue()
	{
		return getMutable().get();
	}

	/**
	 @return value of variable if variable appears as mutable, otherwise its copy.
	 */
	public Mutable<IValuable> getMutable()
	{
		return isMutable()
		       ?value
		       :value.replicate();
	}

	public boolean isMutable()
	{
		return qualifier==Mut;
	}

	public void setValue(IValuable newValue)
	{
		if(isConstant()) throw new NuttConstantVariableWriteException(name,newValue);
		else value.set(newValue);
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
		return "{name='%s',value=%s,qualifier=%s,ceilType=%s}".formatted(name,value,qualifier,ceilType);
	}
}