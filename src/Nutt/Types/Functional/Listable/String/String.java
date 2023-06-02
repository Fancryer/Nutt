package Nutt.Types.Functional.Listable.String;

import Nutt.TypeInferencer;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.IListable;
import Nutt.Types.Functional.Numerable.Boolean;
import Nutt.Types.Functional.Numerable.Int.Int;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;

import java.util.*;
import java.util.stream.Collectors;

public class String implements IListable
{

	private java.lang.String content;

	public String()
	{
		this("");
	}

	public String(java.lang.String content)
	{
		this.content=content;
		fixContent();
	}

	public String(Object obj)
	{
		this.content=java.lang.String.valueOf(obj);
		fixContent();
	}

	public String(String string)
	{
		this(string.content);
	}

	private static String from(Object o)
	{
		return new String(java.lang.String.valueOf(o));
	}

	public String replaceAll(java.lang.String regex,java.lang.String replacement)
	{
		return new String(content.replaceAll(regex,replacement));
	}

	private void fixContent()
	{
		if(content==null) content="";
	}

	@Override
	public java.lang.String toString()
	{
		return content;
	}

	@Override
	public boolean canConsumeParameters(List<IValuable> iValuables)
	{
		return false;
	}

	@Override
	public java.lang.String getValue()
	{
		return content;
	}

	@Override
	public Type getType()
	{
		return TypeInferencer.findType("String");
	}

	@Override
	public int getLength()
	{
		return content.length();
	}

	@Override public String replicate()
	{
		return new String(this);
	}

	@Override
	public Boolean asBoolean()
	{
		return new Boolean(Objects.equals(content,"true"));
	}

	@Override
	public IValuable add(IValuable value)
	{
		return new String(content+value.getValue());
	}

	@Override
	public IValuable getAt(IValuable index)
	{
		if(!(index instanceof Int intIndex)) throw new RuntimeException();
		return new String(java.lang.String.valueOf(content.charAt(intIndex
				                                                          .asLong()
				                                                          .intValue())));
	}

	@Override
	public IValuable setAt(IValuable value,IValuable index)
	{
		if(!(index instanceof Int intIndex)) throw new RuntimeException();
		var valueAsStr=java.lang.String.valueOf(value.getValue());
		var i=intIndex
				.asInt()
				.asLong()
				.intValue();
		return new String(new StringBuilder(content)
				                  .replace(i,i,valueAsStr)
				                  .toString());
	}

	@Override
	public List<IValuable> getElements()
	{
		return new ArrayList<>(content
				                       .chars()
				                       .mapToObj(String::from)
				                       .toList());
	}

	@Override
	public IListable setElements(List<IValuable> elements)
	{
		return new String(java.lang.String.join("",elements
				.stream()
				.map(IValuable::toString)
				.toList()));
	}

	@Override
	public Type getElementType()
	{
		return TypeInferencer.findType("String");
	}

	@Override
	public Array asElementsArray()
	{
		List<IValuable> valuables=Arrays
				.stream(content.split(""))
				.map(String::new)
				.collect(Collectors.toList());
		return new Array("String",valuables);
	}

	//	@Override
	//	public IValuable insertAt(IValuable value,IValuable index)
	//	{
	//		if(!(index instanceof Int intIndex)) throw new RuntimeException();
	//		return new String(new StringBuilder(content).insert(intIndex.asLong().intValue(),value).toString());
	//	}

	@Override
	public Iterator<IValuable> iterator()
	{
		return new Iterator<>()
		{
			int index=0;

			@Override
			public boolean hasNext()
			{
				return index<content.length();
			}

			@Override
			public String next()
			{
				var iter=new String(java.lang.String.valueOf(content.charAt(index)));
				index++;
				return iter;
			}
		};
	}

	@Override public IListable addAll(IValuable valuable)
	{
		var newContent=content+valuable.asElementsArray().
		                               getElements().
		                               stream().
		                               map(Objects::toString).
		                               collect(Collectors.joining());
		return new String(newContent);
	}

	@Override public boolean lessThan(IValuable value)
	{
		return TypeInferencer.verdict("Listable",value.getType())&&compare(value)<0;
	}

	private int compare(IValuable valuable)
	{
		return toString().compareTo
				                 (
						                 valuable.asElementsArray()
						                         .getElements()
						                         .stream()
						                         .map(Objects::toString)
						                         .collect(Collectors.joining())
				                 );
	}

	@Override public boolean greaterTo(IValuable value)
	{
		return TypeInferencer.verdict("Listable",value.getType())&&compare(value)>0;
	}

	@Override public boolean lessEqalTo(IValuable value)
	{
		return TypeInferencer.verdict("Listable",value.getType())&&compare(value)<=0;
	}

	@Override public boolean greaterEqualTo(IValuable value)
	{
		return TypeInferencer.verdict("Listable",value.getType())&&compare(value)>=0;
	}

	@Override public boolean similarTo(IValuable value)
	{
		return TypeInferencer.verdict("Listable",value.getType())&&compare(value)==0;
	}

	@Override public boolean notSimilarTo(IValuable value)
	{
		return TypeInferencer.verdict("Listable",value.getType())&&compare(value)!=0;
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
