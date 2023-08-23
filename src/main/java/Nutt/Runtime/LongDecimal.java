package Nutt.Runtime;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

@Getter
@Setter
public class LongDecimal
{
	private final static int fragmentSize=18;
	private final List<Long> fragments;
	private final int[] zeroRadixIndices;
	private final boolean isPositive;
	private int decimals;

	public LongDecimal()
	{
		fragments=new ArrayList<>();
		zeroRadixIndices=new int[0];
		isPositive=true;
		decimals=0;
	}

	public LongDecimal(String s)
	{
		var parts=s.split("\\.");
		String integralPart=parts[0], fractionalPart=parts.length>1?parts[1]:"";
		var hasSign=integralPart.charAt(0)=='-'||integralPart.charAt(0)=='+';
		isPositive=hasSign&&integralPart.charAt(0)!='-';
		decimals=fractionalPart.length();
		var str=integralPart.substring(hasSign?1:0)+fractionalPart;
		zeroRadixIndices=IntStream.range(0,str.length())
		                          .filter(i->str.charAt(i)=='0')
		                          .map(i->str.length()-i-1)
		                          .sorted()
		                          .toArray();
		var digitsNoZero=str.replace("0","");
		fragments=splitToFragments(digitsNoZero).stream().toList();
	}

	private static List<Long> splitToFragments(String s)
	{
		var substrings=new ArrayList<String>();
		int endIndex=s.length();
		for(;endIndex>0;endIndex=getSparseFragmentSize(endIndex))
			substrings.add(s.substring(getSparseFragmentSize(endIndex),endIndex));

		Collections.reverse(substrings);
		return new ArrayList<>(substrings.stream().map(Long::valueOf).toList());
	}

	private static int getSparseFragmentSize(int endIndex)
	{
		return Math.max(0,endIndex-fragmentSize);
	}

	@Override
	public String toString()
	{
		var sb=new StringBuilder();
		int zeroRadixIndex=0, overallIndex=0;
		for(int i=fragments.size()-1;i>=0;--i)
		{
			long fragment=fragments.get(i);
			if(fragment==0&&zeroRadixIndex<zeroRadixIndices.length&&zeroRadixIndices[zeroRadixIndex]==overallIndex)
			{
				sb.insert(0,'0');
				++zeroRadixIndex;
			}
			while(fragment>0)
			{
				sb.insert(0,fragment%10);
				fragment/=10;
				if(++overallIndex==decimals) sb.insert(0,'.');
			}
		}
		if(!isPositive)
			sb.insert(0,'-');
		else if(sb.length()==0)
			sb.insert(0,'0');
		return sb.toString();
	}

	public int getLength()
	{
		return fragments.stream()
		                .map(Object::toString)
		                .map(String::length)
		                .reduce(Integer::sum)
		                .orElse(0)
		       +zeroRadixIndices.length;
	}

	public LongDecimal add(LongDecimal decimal)
	{
		LongDecimal result=new LongDecimal();
		long carry=0;
		int maxDecimals=0;

		for(int i=Math.max(decimal.fragments.size(),fragments.size())-1;i>=0;i--)
		{
			long fragment1=(i<decimal.fragments.size())?decimal.fragments.get(i):0,
					fragment2=(i<fragments.size())?fragments.get(i):0;

			if(Arrays.binarySearch(decimal.zeroRadixIndices,i)>=0)
				fragment1=0;

			if(Arrays.binarySearch(zeroRadixIndices,i)>=0)
				fragment2=0;

			long sum=fragment1+fragment2+carry;
			carry=(sum/10);
			result.fragments.add(sum%10);

			if(decimal.decimals==i||decimals==i)
				maxDecimals++;
		}

		if(carry>0)
			result.fragments.add(carry);

		result.setDecimals(maxDecimals);
		return result;
	}
}