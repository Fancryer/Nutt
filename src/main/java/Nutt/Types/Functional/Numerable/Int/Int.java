package Nutt.Types.Functional.Numerable.Int;

import Nutt.TypeInferencer;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Numerable.INumerable;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;
import ch.obermuhlner.math.big.BigDecimalMath;
import org.apache.commons.lang3.mutable.MutableLong;

import java.math.BigInteger;
import java.util.List;

public class Int implements INumerable
{
	EIntType intType;
	private MutableLong longValue=new MutableLong();
	private MutableBigInteger bigIntegerValue=new MutableBigInteger();

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
		longValue.setValue(value);
		intType=EIntType.Long;
	}

	public Int(Int other)
	{
		this(other.asBigInteger());
	}

	public Int(BigInteger value)
	{
		bigIntegerValue=new MutableBigInteger(value);
		intType=EIntType.BigInteger;
		if(fitsInLong(value.toString())) setAsLong(value.longValue());
	}

	private static boolean fitsInLong(java.lang.String n)
	{
		var bigInteger=new BigInteger(n);
		var result=bigInteger.longValue();
		return new BigInteger(java.lang.String.valueOf(result)).compareTo(bigInteger)==0;
	}

	private void setAsLong(java.lang.Long value)
	{
		longValue.setValue(value);
		bigIntegerValue=null;
		intType=EIntType.Long;
	}

	public BigInteger asBigInteger()
	{
		return isBigInteger()?bigIntegerValue.getValue():BigInteger.valueOf(longValue.getValue());
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
		bigIntegerValue=new MutableBigInteger(value);
		longValue=null;
		intType=EIntType.BigInteger;
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

	@Override public void setValue(BigInteger value)
	{
		bigIntegerValue.setValue(value);
	}

	public boolean isLong()
	{
		return intType==EIntType.Long;
	}

	@Override
	public Int asInt()
	{
		return this;
	}

	@Override
	public Float asFloat()
	{
		return Float.fromString(toString());
	}

	@Override
	public java.lang.String toString()
	{
		return (intType==EIntType.Long?longValue:bigIntegerValue).toString();
	}	@Override
	public Type getType()
	{
		return TypeInferencer.findTypeReference("Int");
	}

	@Override public Int replicate()
	{
		return new Int(this);
	}

	@Override
	public boolean canConsumeParameters(List<IValuable> iValuables)
	{
		return false;
	}

	@Override
	public int getLength()
	{
		return toString().length();
	}	@Override public Array asElementsArray()
	{
		return new Array(getType(),toString().chars().mapToObj(obj->new String(obj).asValuable()).toList());
	}

	@Override
	public boolean isTrue()
	{
		return asBigInteger().compareTo(BigInteger.ZERO)!=0;
	}

	public Long asLong()
	{
		return intType==EIntType.Long?longValue.getValue():Long.valueOf(bigIntegerValue.longValue());
	}

	@Override public boolean lessThan(IValuable value)
	{
		return TypeInferencer.verdict("Numerable",value.getType())&&compare(value)<0;
	}

	private int compare(IValuable valuable)
	{
		var left=BigDecimalMath.toBigDecimal(toString());
		var right=BigDecimalMath.toBigDecimal(valuable.toString());
		return left.compareTo(right);
	}

	@Override public boolean greaterTo(IValuable value)
	{
		return TypeInferencer.verdict("Numerable",value.getType())&&compare(value)>0;
	}

	@Override public boolean lessEqualTo(IValuable value)
	{
		return TypeInferencer.verdict("Numerable",value.getType())&&compare(value)<=0;
	}

	@Override public boolean greaterEqualTo(IValuable value)
	{
		return TypeInferencer.verdict("Numerable",value.getType())&&compare(value)>=0;
	}

	@Override public boolean similarTo(IValuable value)
	{
		return TypeInferencer.verdict("Numerable",value.getType())&&compare(value)==0;
	}

	@Override public boolean notSimilarTo(IValuable value)
	{
		return TypeInferencer.verdict("Numerable",value.getType())&&compare(value)!=0;
	}

	@Override public boolean equalTo(IValuable value)
	{
		return TypeInferencer.typesEquals(getType(),value.getType())&&similarTo(value);
	}

	@Override public boolean notEqualTo(IValuable value)
	{
		return TypeInferencer.typesEquals(getType(),value.getType())&&notSimilarTo(value);
	}

	enum EIntType
	{
		Long,
		BigInteger
	}




}
