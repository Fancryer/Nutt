package Nutt.Types.Functional.Numerable.Float;

import Nutt.Types.Functional.Numerable.Int.Int;
import Nutt.Types.Functional.Numerable.INumerable;
import Nutt.Types.IValuable;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Float implements INumerable
{
	@Override public String getWrapType()
	{
		return "Numerable";
	}

	@Override public boolean asBoolean()
	{
		return (floatType==EFloatType.Double?asDouble():asBigDecimal().compareTo(BigDecimal.ZERO))!=0;
	}

	@Override public int compareTo(IValuable valuable)
	{
		return 0;
	}

	@Override public int getLength()
	{
		return getValue().toString().length();
	}

	EFloatType floatType;
	private Double doubleValue;
	private BigDecimal bigDecimalValue;

	public Float()
	{
		this("0.0");
	}

	public Float(String value)
	{
		fromString(value);
	}

	private boolean isDouble(String value)
	{
		try
		{
			new BigDecimal(value);
		}
		catch(NumberFormatException e)
		{
			return false;
		}
		return true;
	}

	private String fixValue(String probablyLong)
	{
		return new BigDecimal(new BigInteger(probablyLong)).toPlainString();
	}

	private boolean fitsInDouble(String n)
	{
		return new BigDecimal(n).abs().compareTo(new BigDecimal(Double.MAX_VALUE))<=0;
	}

	private void setAsDouble(String value)
	{
		doubleValue=Double.valueOf(value);
		bigDecimalValue=null;
		floatType=EFloatType.Double;
	}

	private void setAsBigDecimal(String value)
	{
		bigDecimalValue=new BigDecimal(value);
		doubleValue=null;
		floatType=EFloatType.BigDecimal;
	}

	public Double asDouble()
	{
		if(floatType==EFloatType.Double) return doubleValue;
		return bigDecimalValue.doubleValue();
	}

	public BigDecimal asBigDecimal()
	{
		if(floatType==EFloatType.BigDecimal) return bigDecimalValue;
		return BigDecimal.valueOf(doubleValue);
	}

	@Override
	public String toString()
	{
		return "Float|%s: %s".formatted(floatType,floatType==EFloatType.Double?doubleValue:bigDecimalValue);
	}

	@Override
	public INumerable add(INumerable numerable)
	{
		if(numerable.isInt()) throw new RuntimeException();
		try
		{
			BigDecimal a=asBigDecimal(), b=numerable.asFloat().asBigDecimal();
			return new Float(a.subtract(b).toString());
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}

	public INumerable sub(INumerable numerable)
	{
		if(numerable.isInt()) throw new RuntimeException();
		try
		{
			BigDecimal a=asBigDecimal(), b=numerable.asFloat().asBigDecimal();
			return new Float(a.subtract(b).toString());
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}

	@Override
	public boolean isInt()
	{
		return false;
	}

	@Override
	public Number getValue()
	{
		return floatType==EFloatType.Double?doubleValue:bigDecimalValue;
	}

	public void fromString(String value)
	{
		String fixed=isDouble(value)?value:fixValue(value);
		if(fitsInDouble(value))
			setAsDouble(value);
		else
			setAsBigDecimal(value);
	}

	@Override
	public Int asInt()
	{
		throw new RuntimeException("Float is not a Int!");
	}

	@Override
	public Float asFloat()
	{
		return this;
	}

	public EFloatType getFloatType()
	{
		return floatType;
	}

	@Override
	public String getType()
	{
		return "Float";
	}

	enum EFloatType
	{
		Double,
		BigDecimal
	}
}
