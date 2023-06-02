package Nutt.Types.Functional.Numerable.Float;

import Nutt.TypeInferencer;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.String.String;
import Nutt.Types.Functional.Numerable.Boolean;
import Nutt.Types.Functional.Numerable.INumerable;
import Nutt.Types.Functional.Numerable.Int.Int;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;
import ch.obermuhlner.math.big.BigDecimalMath;

import java.math.BigDecimal;
import java.util.List;

public class Float implements INumerable
{
	private boolean isBigDecimal;
	private Double doubleValue;
	private BigDecimal bigDecimalValue;

	public Float()
	{
		this("0.0");
	}

	public Float(java.lang.String value)
	{
		fromString(value);
	}

	public Float(Float other)
	{
		this(other.toString());
	}

	public void fromString(java.lang.String value)
	{
		if(!isValidFloat(value)) throw new IllegalArgumentException("Value is not a valid NuttFloat value");
		if(fitsInDouble(value))
			setAsDouble(value);
		else
			setAsBigDecimal(value);
	}

	private boolean isValidFloat(java.lang.String value)
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

	private boolean fitsInDouble(java.lang.String n)
	{
		var bigDecimal=BigDecimalMath.toBigDecimal(n);
		var result=bigDecimal.doubleValue();
		boolean isDoubleValueValid=!(Double.isNaN(result)||Double.isInfinite(result));
		var wrappedValue=BigDecimalMath.toBigDecimal(java.lang.String.valueOf(result));
		return isDoubleValueValid&&wrappedValue.compareTo(bigDecimal)==0;
	}

	private void setAsDouble(java.lang.String value)
	{
		doubleValue=Double.valueOf(value);
		bigDecimalValue=null;
		isBigDecimal=false;
	}

	private void setAsBigDecimal(java.lang.String value)
	{
		bigDecimalValue=BigDecimalMath.toBigDecimal(value);
		doubleValue=null;
		isBigDecimal=true;
	}

	@Override
	public Boolean asBoolean()
	{
		return new Boolean((isBigDecimal?asBigDecimal().compareTo(BigDecimal.ZERO):asDouble())!=0);
	}

	public Double asDouble()
	{
		return isDouble()?doubleValue:Double.valueOf(bigDecimalValue.doubleValue());
	}

	public BigDecimal asBigDecimal()
	{
		return isBigDecimal()?bigDecimalValue:BigDecimal.valueOf(doubleValue);
	}

	public boolean isDouble()
	{
		return !isBigDecimal;
	}

	public boolean isBigDecimal()
	{
		return isBigDecimal;
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

	@Override
	public Int asInt()
	{
		var asStr=toString();
		var dotIndex=asStr.indexOf('.');
		return new Int(asStr.substring(Math.max(dotIndex,0)));
	}

	@Override
	public Float asFloat()
	{
		return this;
	}

	@Override
	public java.lang.String toString()
	{
		return isDouble()?doubleValue.toString():bigDecimalValue.toPlainString();
	}

	@Override
	public boolean canConsumeParameters(List<IValuable> iValuables)
	{
		return false;
	}

	@Override
	public Type getType()
	{
		return TypeInferencer.findType("Float");
	}

	@Override
	public int getLength()
	{
		return toString().length();
	}

	@Override public Float replicate()
	{
		return new Float(this);
	}

	@Override public Array asElementsArray()
	{
		var str=toString();
		var parts=str.split(",");
		var left=new String(parts[0]);
		var right=new String(parts[1]);
		return new Array(List.of(left.asElementsArray(),right.asElementsArray()));
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
}
