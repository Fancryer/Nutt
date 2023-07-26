package Nutt.Types.Functional.Numerable;

import Nutt.Types.Functional.IFunctional;
import Nutt.Types.Functional.Numerable.Int.Int;
import Nutt.Types.Functional.Numerable.Float.Float;
import ch.obermuhlner.math.big.BigDecimalMath;
import ch.obermuhlner.math.big.BigRational;

import java.math.BigDecimal;
import java.math.MathContext;

public interface INumerable extends IFunctional
{
	static final MathContext longMathContext=MathContext.UNLIMITED;//new MathContext(2_147_483_647);

	static INumerable sub(INumerable left,INumerable right)
	{
		var l=BigDecimalMath.toBigDecimal(left.toString());
		var r=BigDecimalMath.toBigDecimal(right.toString());
		return fromString(String.valueOf(l.subtract(r)));
	}

	static INumerable fromString(String value)
	{
		try
		{
			return Int.fromString(value);
		}
		catch(IllegalArgumentException e)
		{
			return Float.fromString(value);
		}
	}

	static INumerable incr(INumerable a)
	{
		return add(a,new Int(1));
	}

	static INumerable add(INumerable left,INumerable right)
	{
		var l=left.toBigDecimal();
		var r=right.toBigDecimal();
		left=fromString(String.valueOf(l.add(r)));
		return left;
	}

	static INumerable decr(INumerable a)
	{
		return add(a,new Int(-1));
	}

	static INumerable mult(INumerable left,INumerable right)
	{
		var l=BigDecimalMath.toBigDecimal(left.toString());
		var r=BigDecimalMath.toBigDecimal(right.toString());
		return fromString(l.multiply(r).toString());
	}

	static INumerable div(INumerable left,INumerable right)
	{
		try
		{
			return applyTriFunction(left,BigDecimal::divide,right);
		}
		catch(ArithmeticException e)
		{
			return fromString(BigRational
					                  .valueOf(left.toBigDecimal())
					                  .divide(BigRational.valueOf(right.toBigDecimal()))
					                  .toString());
		}
	}

	static INumerable mod(INumerable left,INumerable right)
	{
		return applyTriFunction(left,BigDecimal::remainder,right);
	}

	static INumerable intDiv(INumerable left,INumerable right)
	{
		return applyTriFunction(left,(l,r,ctx)->l.divideToIntegralValue(r).toBigInteger(),right);
	}

	static INumerable negate(INumerable numerable)
	{
		return fromString(numerable.toBigDecimal().negate().toString());
	}

	static INumerable abs(INumerable numerable)
	{
		return fromString(BigDecimalMath.toBigDecimal(numerable.toString()).abs().toString());
	}

	static INumerable bitSwap(INumerable numerable)
	{
		var bd=BigDecimalMath.toBigDecimal(numerable.toString()).toBigInteger();
		byte[] bytes=new byte[bd.bitLength()];
		for(int i=bytes.length-1;i>=0;--i) bd=bd.flipBit(i);
		return fromString(BigDecimalMath.toBigDecimal(new String(bd.toByteArray())).toString());
	}

	static INumerable pow(INumerable left,INumerable right)
	{
		return applyTriFunction(left,BigDecimalMath::pow,right);
	}

	static INumerable applyTriFunction(INumerable l,
	                                   Nutt.Runtime.TriFunction<BigDecimal,BigDecimal,MathContext,Number> infixFunction,
	                                   INumerable r)
	{
		return fromString(infixFunction.apply(l.toBigDecimal(),r.toBigDecimal(),longMathContext).toString());
	}

	private BigDecimal toBigDecimal()
	{
		return this.asFloat().asBigDecimal();
	}

	public boolean isBoolean()
	{
		return !isInt()&&!isFloat();
	}

	abstract public boolean isInt();

	abstract public boolean isFloat();

	@Override abstract public Number getValue();

	@Override abstract public void setValue(Number value);

	abstract Int asInt();

	abstract Float asFloat();

	@Override abstract public INumerable replicate();
}
