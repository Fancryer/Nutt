package Nutt.Types.Functional.Numerable.Int;

import Nutt.Types.Functional.Numerable.Float.Float;
import Nutt.Types.Functional.Numerable.INumerable;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Int implements INumerable
{
	@Override public String getWrapType()
	{
		return "Numerable";
	}

	@Override public int getLength()
	{
		return getValue().toString().length();
	}

	private java.lang.Number value;

	EIntType intType;

	public Int()
	{
		this("0");
	}

	public Int(String value)
	{
		fromString(value);
	}

	private boolean isLong(String value)
	{
		try
		{
			new BigInteger(value);
		}
		catch(NumberFormatException e)
		{
			return false;
		}
		return true;
	}

	private String fixValue(String probablyDouble)
	{
		return new BigDecimal(probablyDouble).toBigIntegerExact().toString();
	}

	private boolean fitsInLong(String n)
	{
		return new BigInteger(n).abs().compareTo(BigInteger.valueOf(Long.MAX_VALUE))<=0;
	}

	@Override public String toString()
	{
		return "Int|%s: %s".formatted(intType,value);
	}

	@Override public INumerable add(INumerable numerable)
	{
		if(numerable.isFloat()) throw new RuntimeException();
		try
		{
			BigInteger a=asBigInteger(), b=numerable.asInt().asBigInteger();
			return new Int(a.add(b).toString());
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}

	public INumerable sub(INumerable numerable)
	{
		if(numerable.isFloat()) throw new RuntimeException();
		try
		{
			BigInteger a=asBigInteger(), b=numerable.asInt().asBigInteger();
			return new Int(a.subtract(b).toString());
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}

	@Override
	public boolean isInt()
	{
		return true;
	}

	private void setAsLong(String value)
	{
		this.value=Long.valueOf(value);
		intType=EIntType.Long;
	}

	private void setAsBigInteger(String value)
	{
		this.value=new BigInteger(value);
		intType=EIntType.BigInteger;
	}

	public Long asLong()
	{
		if(intType==EIntType.Long) return value.longValue();
		else throw new RuntimeException("Int type is not a Long");
	}

	public BigInteger asBigInteger()
	{
		return intType==EIntType.BigInteger?(BigInteger)value:new BigInteger(String.valueOf(value));
	}

	@Override public Number getValue()
	{
		return value;
	}

	public void fromString(String str)
	{
		if(!isLong(str)) throw new IllegalArgumentException("Value is not a valid NuttInt value");
		if(fitsInLong(str))
			setAsLong(str);
		else
			setAsBigInteger(str);
	}

	@Override public Int asInt()
	{
		return this;
	}

	@Override public Float asFloat()
	{
		throw new RuntimeException("Int is not a Float!");
	}

	@Override public boolean asBoolean()
	{
		return (intType==EIntType.Long?asLong():asBigInteger().compareTo(BigInteger.ZERO))!=0;
	}

	enum EIntType
	{
		Long,
		BigInteger
	}

	public EIntType getIntType()
	{
		return intType;
	}

	@Override public String getType()
	{
		return "Int";
	}

}
