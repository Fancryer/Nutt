package Nutt.Types.Functional.Numerable;

import Nutt.Interpreter.Logging.EActionStatus;
import Nutt.Interpreter.Logging.ESeverity;
import Nutt.Runtime.TriFunction;
import Nutt.Types.Functional.IFunctional;
import Nutt.Types.Functional.Numerable.Float.Float;
import Nutt.Types.Functional.Numerable.Int.Int;
import ch.obermuhlner.math.big.BigDecimalMath;

import java.math.BigDecimal;
import java.math.MathContext;

import static Nutt.NuttEnvironment.nuttLogger;

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
			return Int.fromString(value);
		}
		catch(IllegalArgumentException e)
		{
			return Float.fromString(value);
		}
	}

	//	static INumerable add(INumerable left,INumerable right)
	//	{
	//		var l=left.toBigDecimal();
	//		var r=right.toBigDecimal();
	//		left=fromString(String.valueOf(l.add(r)));
	//		return left;
	//	}

	static INumerable applyTriFunction(INumerable l,TriFunction<BigDecimal,BigDecimal,MathContext,Number> infixFunction,INumerable r)
	{
		Number number;
		try
		{
			number=infixFunction.apply(l.toBigDecimal(),r.toBigDecimal(),longMathContext);
		}
		catch(Exception e)
		{
			nuttLogger.appendLog("Exception fixed",e.toString(),EActionStatus.Failure,ESeverity.Error);
			number=infixFunction.apply(l.toBigDecimal(),r.toBigDecimal(),new MathContext(100_000));
		}
		return fromString(number.toString());
	}

	private BigDecimal toBigDecimal()
	{
		return this.asFloat().asBigDecimal();
	}

	//	static INumerable div(INumerable left,INumerable right)
	//	{
	//		try
	//		{
	//			return applyTriFunction(left,BigDecimal::divide,right);
	//		}
	//		catch(ArithmeticException e)
	//		{
	//			return fromString(BigRational
	//					                  .valueOf(left.toBigDecimal())
	//					                  .divide(BigRational.valueOf(right.toBigDecimal()))
	//					                  .toString());
	//		}
	//	}

	Float asFloat();

	//	static INumerable intDiv(INumerable left,INumerable right)
	//	{
	//		return applyTriFunction(left,(l,r,ctx)->l.divideToIntegralValue(r).toBigInteger(),right);
	//	}

	static INumerable negate(INumerable numerable)
	{
		return fromString(numerable.toBigDecimal().negate().toString());
	}

	static INumerable abs(INumerable numerable)
	{
		return fromString(BigDecimalMath.toBigDecimal(numerable.toString()).abs().toString());
	}

	//	static INumerable pow(INumerable left,INumerable right)
	//	{
	//		var l=BigRational.valueOf(left.toBigDecimal());
	//		var res=BigRational.valueOf(l.getNumerator(),l.getDenominator());
	//		var r=right.asInt().asBigInteger();
	//		System.out.println("res = "+BigDecimalMath.pow(left.toBigDecimal(),right.toBigDecimal(),longMathContext));
	//		//		while(r.compareTo(BigInteger.ZERO)>0)
	//		//		{
	//		//			r=r.subtract(BigInteger.ONE);
	//		//			res=res.multiply(l);
	//		//			if(r.remainder(BigInteger.valueOf(10_000)).equals(BigInteger.ZERO))
	//		//			{
	//		//				System.out.println("r = "+r);
	//		//				System.out.println("res = "+res);
	//		//			}
	//		//		}
	//		return new Int(res.toBigDecimal(longMathContext).toBigInteger());
	//	}

	Int asInt();

	boolean isBoolean();

	boolean isInt();

	boolean isFloat();

	@Override Number getValue();

	@Override INumerable replicate();
}
