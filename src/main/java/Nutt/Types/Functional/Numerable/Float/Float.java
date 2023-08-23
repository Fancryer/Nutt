package Nutt.Types.Functional.Numerable.Float;

import Nutt.Interpreter.NuttInterpreter;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.String.String;
import Nutt.Types.Functional.Numerable.INumerable;
import Nutt.Types.Functional.Numerable.Int.Int;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;
import ch.obermuhlner.math.big.BigDecimalMath;

import java.math.BigDecimal;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Float implements INumerable
{
	private boolean isBigDecimal;
	private Double doubleValue;
	private BigDecimal bigDecimalValue;

	public Float()
	{
		this(0.0);
	}

	public Float(Double value)
	{
		setAsDouble(value);
	}

	private void setAsDouble(Double value)
	{
		doubleValue=value;
		bigDecimalValue=null;
		isBigDecimal=false;
	}

	public Float(java.lang.Float value)
	{
		this(value.doubleValue());
	}

	public Float(BigDecimal value)
	{
		setAsBigDecimal(value);
	}

	private void setAsBigDecimal(BigDecimal value)
	{
		bigDecimalValue=value;
		doubleValue=null;
		isBigDecimal=true;
	}

	public Float(Float other)
	{
		this.doubleValue=other.doubleValue;
		this.bigDecimalValue=other.bigDecimalValue;
		this.isBigDecimal=other.isBigDecimal;
	}

	public static Float fromString(java.lang.String value)
	{
		if(!isValidFloat(value)) throw new IllegalArgumentException("Value is not a valid NuttFloat value");
		if(fitsInDouble(value))
			return new Float(Double.parseDouble(value));
		else
			return new Float(new BigDecimal(value));
	}

	private static boolean isValidFloat(java.lang.String value)
	{
		try
		{
			new BigDecimal(value);
			return true;
		}
		catch(NumberFormatException e)
		{
			return false;
		}
	}

	private static boolean fitsInDouble(java.lang.String n)
	{
		System.out.println("n = "+n);
		var bigDecimal=BigDecimalMath.toBigDecimal(n);
		var result=bigDecimal.doubleValue();
		boolean isDoubleValueValid=!(Double.isNaN(result)||Double.isInfinite(result));
		var wrappedValue=BigDecimalMath.toBigDecimal(java.lang.String.valueOf(result));
		return isDoubleValueValid&&wrappedValue.compareTo(bigDecimal)==0;
	}

	private void setAsDouble(java.lang.String value)
	{
		setAsDouble(Double.valueOf(value));
	}

	private void setAsBigDecimal(java.lang.String value)
	{
		setAsBigDecimal(BigDecimalMath.toBigDecimal(value));
	}

	@Override
	public Float asFloat()
	{
		return this;
	}

	@Override
	public Int asInt()
	{
		var asStr=toString();
		var dotIndex=asStr.indexOf('.');
		return Int.fromString(asStr.substring(Math.max(dotIndex,0)));
	}

	@Override public boolean isBoolean()
	{
		return false;
	}

	@Override
	public boolean isInt()
	{
		return false;
	}

	@Override public boolean isFloat()
	{
		return true;
	}

	@Override
	public Number getValue()
	{
		return isDouble()?doubleValue:bigDecimalValue;
	}

	public boolean isDouble()
	{
		return !isBigDecimal;
	}

	@Override public Float replicate()
	{
		return new Float(this);
	}

	@Override
	public java.lang.String toString()
	{
		return isDouble()?doubleValue.toString():bigDecimalValue.toPlainString();
	}

	public Double asDouble()
	{
		return isDouble()?doubleValue:Double.valueOf(bigDecimalValue.doubleValue());
	}

	public BigDecimal asBigDecimal()
	{
		return isBigDecimal()?bigDecimalValue:BigDecimal.valueOf(doubleValue);
	}

	public boolean isBigDecimal()
	{
		return isBigDecimal;
	}

	@Override public Array spread()
	{
		var str=toString();
		var parts=str.split(",");
		var left=new String(parts[0]);
		var right=new String(parts[1]);
		return new Array
				(
						Stream.of(left.spread(),right.spread())
						      .map(NuttInterpreter.currentScope.referenceContainer::get)
						      .collect(Collectors.toList())
				);
	}

	private int compare(IValuable valuable)
	{
		var left=BigDecimalMath.toBigDecimal(toString());
		var right=BigDecimalMath.toBigDecimal(valuable.toString());
		return left.compareTo(right);
	}

	@Override
	public Type getType()
	{
		return TypeInferencer.findTypeReference("Float").getType();
	}
}
