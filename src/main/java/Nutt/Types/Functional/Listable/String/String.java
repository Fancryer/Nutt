package Nutt.Types.Functional.Listable.String;

import Nutt.Interpreter.References.AnonymousNuttReference;
import Nutt.Interpreter.References.NuttReference;
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

	@Override public String replicate()
	{
		return new String(this);
	}

	@Override
	public String add(NuttReference value)
	{
		return new String(content+value.getValue().getValue());
	}

	@Override
	public NuttReference getAt(NuttReference index)
	{
		return getAt(index.getValue().asFunctional().asNumerable().asInt().getValue().intValue()).toAnonymousReference();
	}

	@Override
	public String setAt(NuttReference value,NuttReference index)
	{
		if(!(index.getValue() instanceof Int intIndex)) throw new RuntimeException();
		var valueAsStr=java.lang.String.valueOf(value.getValue().getValue());
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

	@Override public String setElements(List<NuttReference> elements)
	{
		this.content=elements.stream().map(reference->reference.getValue().toString()).collect(Collectors.joining());
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

	@Override public String addAll(IListable listable)
	{
		return new String(content+listable.map(Objects::toString).collect(Collectors.joining()));
	}

	public String getAt(int index)
	{
		return new String(java.lang.String.valueOf(content.charAt(index)));
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
