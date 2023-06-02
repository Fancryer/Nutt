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
import java.util.List;

public class Int implements INumerable
{
	EIntType intType;
	private Long longValue;
	private BigInteger bigIntegerValue;

	public Int()
	{
		this("0");
	}

	public Int(java.lang.String value)
	{
		fromString(value);
	}

	public Int(Integer value)
	{
		fromString(java.lang.String.valueOf(value));
	}

	public Int(Long value)
	{
		fromString(java.lang.String.valueOf(value));
	}

	public Int(BigInteger value)
	{
		fromString(java.lang.String.valueOf(value));
	}

	public Int(Int other)
	{
		this(other.asBigInteger());
	}

	public void fromString(java.lang.String str)
	{
		if(!isValidInt(str))
		{
			throw new IllegalArgumentException("Value is not a valid NuttInt value");
		}
		if(fitsInLong(str))
			setAsLong(str);
		else
			setAsBigInteger(str);
	}

	//	@Override public Array asElementsArray()
	//	{
	//		List<IValuable> valuables=new ArrayList<>();
	//		for(var digit: toString().toCharArray())
	//		{
	//			if(!Character.isDigit(digit)) continue;
	//			valuables.add(new String(java.lang.String.valueOf(digit)));
	//		}
	//		return new Array("String",valuables);
	//	}

	private boolean isValidInt(java.lang.String value)
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

	private boolean fitsInLong(java.lang.String n)
	{
		var bigInteger=new BigInteger(n);
		var result=bigInteger.longValue();
		return new BigInteger(java.lang.String.valueOf(result)).compareTo(bigInteger)==0;
	}

	private void setAsLong(java.lang.String value)
	{
		longValue=Long.valueOf(value);
		bigIntegerValue=null;
		intType=EIntType.Long;
	}

	private void setAsBigInteger(java.lang.String value)
	{
		bigIntegerValue=new BigInteger(value);
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
		return new Float(toString());
	}

	@Override
	public java.lang.String toString()
	{
		return (intType==EIntType.Long?longValue:bigIntegerValue).toString();
	}

	@Override
	public boolean canConsumeParameters(List<IValuable> iValuables)
	{
		return false;
	}

	@Override
	public Type getType()
	{
		return TypeInferencer.findType("Int");
	}

	@Override
	public int getLength()
	{
		return toString().length();
	}

	@Override public Int replicate()
	{
		return new Int(this);
	}

	@Override public Array asElementsArray()
	{
		return new Array(getType(),toString().chars().mapToObj(obj->new String(obj).asValuable()).toList());
	}

	@Override
	public Boolean asBoolean()
	{
		return new Boolean((intType==EIntType.Long?asLong():asBigInteger().compareTo(BigInteger.ZERO))!=0);
	}

	public Long asLong()
	{
		return intType==EIntType.Long?longValue:Long.valueOf(bigIntegerValue.longValue());
	}

	public BigInteger asBigInteger()
	{
		return isBigInteger()?bigIntegerValue:BigInteger.valueOf(longValue);
	}

	public boolean isBigInteger()
	{
		return intType==EIntType.BigInteger;
	}

	private int compare(IValuable valuable)
	{
		var left=BigDecimalMath.toBigDecimal(toString());
		var right=BigDecimalMath.toBigDecimal(valuable.toString());
		return left.compareTo(right);
	}

	@Override public boolean lessThan(IValuable value)
	{
		return TypeInferencer.verdict("Numerable",value.getType())&&compare(value)<0;
	}

	@Override public boolean greaterTo(IValuable value)
	{
		return TypeInferencer.verdict("Numerable",value.getType())&&compare(value)>0;
	}

	@Override public boolean lessEqalTo(IValuable value)
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
