package Nutt.Types.Functional.Numerable;

import Nutt.Runtime.TriFunction;
import Nutt.Types.Functional.IFunctional;
import Nutt.Types.Functional.Numerable.Float.Float;
import Nutt.Types.Functional.Numerable.Int.Int;
import ch.obermuhlner.math.big.BigDecimalMath;
import ch.obermuhlner.math.big.BigRational;

import java.math.BigDecimal;
import java.math.MathContext;

public interface INumerable extends IFunctional
{
	MathContext longMathContext=new MathContext(2_147_483_647);

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
			return new Int(value);
		}
		catch(IllegalArgumentException e)
		{
			return new Float(value);
		}
	}

	static INumerable incr(INumerable a)
	{
		return add(a,new Int("1"));
	}

	static INumerable add(INumerable left,INumerable right)
	{
		var l=BigDecimalMath.toBigDecimal(left.toString());
		var r=BigDecimalMath.toBigDecimal(right.toString());
		return fromString(String.valueOf(l.add(r)));
	}

	static INumerable decr(INumerable a)
	{
		return add(a,new Int("-1"));
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
					                  .valueOf(toBigDecimal(left))
					                  .divide(BigRational.valueOf(toBigDecimal(right)))
					                  .toString());
		}
	}

	private static BigDecimal toBigDecimal(INumerable numerable)
	{
		return BigDecimalMath.toBigDecimal(numerable.toString());
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
		return fromString(toBigDecimal(numerable).negate().toString());
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
	                                   TriFunction<BigDecimal,BigDecimal,MathContext,Number> infixFunction,
	                                   INumerable r)
	{
		return fromString(infixFunction.apply(toBigDecimal(l),toBigDecimal(r),longMathContext).toString());
	}

	default boolean isBoolean()
	{
		return !isInt()&&!isFloat();
	}

	boolean isInt();

	boolean isFloat();

	@Override
	Number getValue();

	Int asInt();

	Float asFloat();

	@Override INumerable replicate();
}
