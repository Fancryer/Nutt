package Nutt.Types.Functional.Listable.String;

import Nutt.Interpreter.AnonymousNuttReference;
import Nutt.Interpreter.NuttReference;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.IListable;
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

	private void fixContent()
	{
		if(content==null) content="";
	}

	public String(byte[] bytes)
	{
		this.content=new java.lang.String(bytes);
		fixContent();
	}

	public String(String string)
	{
		this(string.content);
	}

	public String(Object obj)
	{
		this.content=java.lang.String.valueOf(obj);
		fixContent();
	}

	private static String from(Object o)
	{
		return new String(java.lang.String.valueOf(o));
	}

	public String replaceAll(java.lang.String regex,java.lang.String replacement)
	{
		return new String(content.replaceAll(regex,replacement));
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
	public boolean isTrue()
	{
		return Objects.equals(content,"true");
	}

	@Override
	public String add(NuttReference value)
	{
		return new String(content+value.getMutable().get().getValue());
	}

	@Override
	public String getAt(NuttReference index)
	{
		return getAt(index.getMutable().get().asFunctional().asNumerable().asInt().getValue().intValue());
	}

	@Override
	public String setAt(NuttReference value,NuttReference index)
	{
		if(!(index.getMutable().get() instanceof Int intIndex)) throw new RuntimeException();
		var valueAsStr=java.lang.String.valueOf(value.getMutable().get().getValue());
		var i=intIndex.getValue().intValue();
		return new String(new StringBuilder(content).replace(i,i,valueAsStr).toString());
	}

	@Override
	public List<NuttReference> getElements()
	{
		return new ArrayList<>
				(
						content.chars()
						       .mapToObj(c->AnonymousNuttReference.of(new String(c)))
						       .toList()
				);
	}

	@Override public String setElements(List<? extends IValuable> elements)
	{
		this.content=elements.stream().map(IValuable::toString).collect(Collectors.joining());
		return this;
	}

	@Override
	public Type getElementType()
	{
		return TypeInferencer.findTypeReference("String").getType();
	}

	@Override public Iterator<NuttReference> iterator()
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
			public NuttReference next()
			{
				var iter=new String(java.lang.String.valueOf(content.charAt(index)));
				index++;
				return AnonymousNuttReference.of(iter);
			}
		};
	}

	@Override public String addAll(IValuable valuable)
	{
		var newContent=content+valuable.spread()
		                               .getElements()
		                               .stream()
		                               .map(Objects::toString)
		                               .collect(Collectors.joining());
		return new String(newContent);
	}

	public String getAt(int index)
	{
		return new String(java.lang.String.valueOf(content.charAt(index)));
	}

	@Override public boolean lessThan(IValuable value)
	{
		return TypeInferencer.verdict("Listable",value.getType())&&compare(value)<0;
	}

	private int compare(IValuable valuable)
	{
		return toString().compareTo
				                 (
						                 valuable.spread()
						                         .getElements()
						                         .stream()
						                         .map(Objects::toString)
						                         .collect(Collectors.joining())
				                 );
	}

	@Override
	public java.lang.String toString()
	{
		return content;
	}

	@Override public boolean greaterTo(IValuable value)
	{
		return TypeInferencer.verdict("Listable",value.getType())&&compare(value)>0;
	}

	@Override public boolean lessEqualTo(IValuable value)
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

	@Override
	public Type getType()
	{
		return TypeInferencer.findTypeReference("String").getType();
	}

	@Override public java.lang.String toSerializedString()
	{
		return "'"+this+"'";
	}

	@Override public java.lang.String getValue()
	{
		return content;
	}

	@Override public boolean notEqualTo(IValuable value)
	{
		return TypeInferencer.typesEquals(getType(),value.getType())&&notSimilarTo(value);
	}

	@Override
	public Array spread()
	{
		List<NuttReference> valuables=Arrays
				.stream(content.split(""))
				.map(String::new)
				.map(AnonymousNuttReference::of)
				.collect(Collectors.toList());
		return new Array("String",valuables);
	}
}
