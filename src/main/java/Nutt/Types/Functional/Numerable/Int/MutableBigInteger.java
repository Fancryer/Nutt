package Nutt.Types.Functional.Numerable.Int;

import org.apache.commons.lang3.mutable.Mutable;

import java.math.BigInteger;

public class MutableBigInteger extends Number implements Mutable<BigInteger>
{
	private BigInteger bigInteger;

	public MutableBigInteger()
	{
		bigInteger=BigInteger.ZERO;
	}

	public MutableBigInteger(Integer value)
	{
		bigInteger=BigInteger.valueOf(value);
	}

	public MutableBigInteger(Long value)
	{
		bigInteger=BigInteger.valueOf(value);
	}

	public MutableBigInteger(BigInteger value)
	{
		bigInteger=value;
	}

	public MutableBigInteger(MutableBigInteger value)
	{
		bigInteger=value.bigInteger;
	}

	@Override public BigInteger getValue()
	{
		return bigInteger;
	}

	@Override public void setValue(BigInteger bigInteger)
	{

	}

	@Override public int intValue()
	{
		return bigInteger.intValue();
	}

	@Override public long longValue()
	{
		return bigInteger.longValue();
	}

	@Override public float floatValue()
	{
		return bigInteger.floatValue();
	}

	@Override public double doubleValue()
	{
		return bigInteger.doubleValue();
	}

	@Override public String toString()
	{
		return bigInteger.toString();
	}
}
