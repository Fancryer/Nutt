package Nutt.Types.Functional.Numerable;

import Nutt.TypeInferencer;
import Nutt.Types.Functional.IFunctional;
import Nutt.Types.Functional.Numerable.Float.Float;
import Nutt.Types.Functional.Numerable.Int.Int;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public interface INumerable extends IFunctional
{
	static INumerable sub(INumerable left,INumerable right)
	{
		var l=new BigDecimal(left.getValue().toString());
		var r=new BigDecimal(right.getValue().toString());
		return fromString(String.valueOf(l.add(r)));
	}

	static INumerable fromString(String value)
	{
		try
		{
			new BigInteger(value);
			return new Int(value);
		}
		catch(NumberFormatException e)
		{
			return new Float(value);
		}
	}

	static INumerable add(INumerable left,INumerable right)
	{
		var l=new BigDecimal(left.getValue().toString());
		var r=new BigDecimal(right.getValue().toString());
		return fromString(String.valueOf(l.add(r)));
	}

	static INumerable incr(INumerable a)
	{
		return add(a,new Int("1"));
	}

	static INumerable decr(INumerable a)
	{
		return add(a,new Int("-1"));
	}

	static INumerable mult(INumerable left,INumerable right)
	{
		var l=new BigDecimal(left.getValue().toString());
		var r=new BigDecimal(right.getValue().toString());
		return fromString(l.multiply(r).toString());
	}

	static INumerable div(INumerable left,INumerable right)
	{
		var l=new BigDecimal(left.getValue().toString());
		var r=new BigDecimal(right.getValue().toString());
		return fromString(l.divide(r,RoundingMode.HALF_UP).toString());
	}

	static INumerable mod(INumerable left,INumerable right)
	{
		var l=new BigDecimal(left.getValue().toString());
		var r=new BigDecimal(right.getValue().toString());
		return fromString(l.remainder(r).toString());
	}

	static INumerable intDiv(INumerable left,INumerable right)
	{
		var l=new BigDecimal(left.getValue().toString());
		var r=new BigDecimal(right.getValue().toString());
		return fromString(l.divideToIntegralValue(r).toBigInteger().toString());
	}

	static INumerable negate(INumerable numerable)
	{
		return fromString(new BigDecimal(numerable.getValue().toString()).negate().toString());
	}

	static INumerable abs(INumerable numerable)
	{
		return fromString(new BigDecimal(numerable.getValue().toString()).abs().toString());
	}

	static INumerable bitSwap(INumerable numerable)
	{
		var bd=new BigDecimal(numerable.getValue().toString());
		byte[] bytes=bd.toBigInteger().toByteArray();
		for(int i=0;i<bytes.length;++i) bytes[i]=(byte)~bytes[i];
		return fromString(new BigDecimal(new String(bytes)).toString());
	}

	@Override
	default String getWrapType()
	{
		return "Functional";
	}

	INumerable add(INumerable number);

	boolean isInt();

	default boolean isFloat()
	{
		return !isInt();
	}

	@Override
	Number getValue();

	default Int asInt()
	{
		if(this.isFloat()) throw new ClassCastException("Number type is not an Int");
		return (Int)this;
	}

	default Float asFloat()
	{
		if(this.isInt()) throw new ClassCastException("Number type is not a Float");
		return (Float)this;
	}

	default Boolean less(INumerable numerable)
	{
		return this.compareTo(numerable)<0;
	}

	default Boolean equal(INumerable numerable)
	{
		return this.compareTo(numerable)==0;
	}

	default Boolean greater(INumerable numerable)
	{
		return this.compareTo(numerable)>0;
	}

	@Override
	default int compareToFunctional(IFunctional functional)
	{
		if(!new TypeInferencer().verdict("Numerable",functional.getType()))
		{
			throw new RuntimeException("You cannot compare Numerable with %s!".formatted(functional.getType()));
		}
		return this.compareToNumerable(functional.asNumerable());
	}

	default int compareToNumerable(INumerable numerable)
	{
		var left=new BigDecimal(this.getValue().toString());
		var right=new BigDecimal(numerable.getValue().toString());
		return left.compareTo(right);
	}
}
