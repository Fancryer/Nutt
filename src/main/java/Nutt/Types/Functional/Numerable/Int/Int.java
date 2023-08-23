package Nutt.Types.Functional.Numerable.Int;

import Nutt.TypeInferencer;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.String.String;
import Nutt.Types.Functional.Numerable.Boolean;
import Nutt.Types.Functional.Numerable.Float.Float;
import Nutt.Types.Functional.Numerable.INumerable;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;
import ch.obermuhlner.math.big.BigDecimalMath;

import java.math.BigInteger;

public class Int implements INumerable
{
	EIntType intType;
	private Long longValue;
	private BigInteger bigIntegerValue;

	public Int()
	{
		this(0);
	}

	public Int(Integer value)
	{
		this(value.longValue());
	}

	public Int(Long value)
	{
		longValue=value;
		intType=EIntType.Long;
	}

	public Int(Byte value)
	{
		this(value.intValue());
	}

	public Int(Int other)
	{
		this(other.asBigInteger());
		longValue=other.longValue;
	}

	public Int(BigInteger value)
	{
		bigIntegerValue=value;
		intType=EIntType.BigInteger;
		if(fitsInLong(value.toString())) setAsLong(value.longValue());
	}

	private static boolean fitsInLong(java.lang.String n)
	{
		var bigInteger=new BigInteger(n);
		var result=bigInteger.longValue();
		return BigInteger.valueOf(result).compareTo(bigInteger)==0;
	}

	private void setAsLong(java.lang.Long value)
	{
		longValue=value;
		bigIntegerValue=null;
		intType=EIntType.Long;
	}

	public BigInteger asBigInteger()
	{
		return isBigInteger()?bigIntegerValue:BigInteger.valueOf(longValue);
	}

	public boolean isBigInteger()
	{
		return intType==EIntType.BigInteger;
	}

	public static Int fromString(java.lang.String str)
	{
		if(!isValidInt(str))
		{
			throw new IllegalArgumentException("Value is not a valid NuttInt value");
		}
		return fitsInLong(str)?new Int(Long.parseLong(str)):new Int(new BigInteger(str));
	}

	private static boolean isValidInt(java.lang.String value)
	{
		try
		{
			new BigInteger(value);
			return true;
		}
		catch(NumberFormatException e)
		{
			return false;
		}
	}

	private void setAsLong(java.lang.String value)
	{
		setAsLong(Long.parseLong(value));
	}

	private void setAsBigInteger(java.lang.String value)
	{
		setAsBigInteger(new BigInteger(value));
	}

	private void setAsBigInteger(java.math.BigInteger value)
	{
		bigIntegerValue=value;
		longValue=null;
		intType=EIntType.BigInteger;
	}

	@Override
	public Float asFloat()
	{
		return Float.fromString(toString());
	}

	@Override
	public Int asInt()
	{
		return this;
	}

	@Override public boolean isBoolean()
	{
		return false;
	}

	@Override
	public boolean isInt()
	{
		return true;
	}

	@Override public boolean isFloat()
	{
		return false;
	}

	@Override
	public Number getValue()
	{
		return isLong()?longValue:bigIntegerValue;
	}

	public boolean isLong()
	{
		return intType==EIntType.Long;
	}

	@Override public Int replicate()
	{
		return new Int(this);
	}

	@Override public Boolean asBoolean()
	{
		return new Boolean(asBigInteger().compareTo(BigInteger.ZERO)!=0);
	}

	@Override
	public java.lang.String toString()
	{
		return (intType==EIntType.Long?longValue:bigIntegerValue).toString();
	}

	@Override public Array spread()
	{
		return new Array(getType(),new String(toString()).stream().toList());
	}

	@Override
	public Type getType()
	{
		return TypeInferencer.findTypeReference("Int").getType();
	}

	public Long asLong()
	{
		return intType==EIntType.Long?longValue:bigIntegerValue.longValue();
	}

	private int compare(IValuable valuable)
	{
		var left=BigDecimalMath.toBigDecimal(toString());
		var right=BigDecimalMath.toBigDecimal(valuable.toString());
		return left.compareTo(right);
	}

	enum EIntType
	{
		Long,
		BigInteger
	}
}
