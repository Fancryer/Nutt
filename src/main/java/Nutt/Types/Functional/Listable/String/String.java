package Nutt.Types.Functional.Listable.String;

import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Interpreter.References.AnonymousNuttReference;
import Nutt.Interpreter.References.NilReference;
import Nutt.Interpreter.References.NuttReference;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.IListable;
import Nutt.Types.Functional.Numerable.Int.Int;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;
import com.google.common.collect.Lists;
import lombok.Getter;

import java.util.*;
import java.util.stream.Collectors;

public class String implements IListable
{
	@Getter
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

	private int compare(IValuable valuable)
	{
		return toString().compareTo
				                 (
						                 valuable.toArray()
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
		return TypeInferencer.findTypeReference("String").getValueAs(Type.class);
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
		return getAt(index.getValueAs(Int.class).getValue().intValue()).toAnonymousReference();
	}

	@Override
	public NuttReference setAt(NuttReference index,NuttReference value)
	{
		if(!(index.getValue() instanceof Int intIndex)) throw new RuntimeException();
		var valueAsStr=java.lang.String.valueOf(value.getValue().getValue());
		var i=intIndex.getValue().intValue();
		return new String(new StringBuilder(content).replace(i,i,valueAsStr).toString()).toAnonymousReference();
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

	@Override public NuttReference setElements(List<NuttReference> elements)
	{
		var content=elements.stream().map(reference->reference.getValue().toString()).collect(Collectors.joining());
		return new String(content).toAnonymousReference();
	}

	@Override public List<NuttReference> getElementsReversed()
	{
		return Lists.reverse(getElements());
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

	@Override public java.lang.String toSerializedString()
	{
		return "'"+this+"'";
	}

	@Override public java.lang.String getValue()
	{
		return content;
	}

	@Override
	public NuttReference getProperty(java.lang.String name)
	{
		return switch(name)
		{
			case "length" -> new Int(content.length()).toAnonymousReference();
			case "sub" -> new NativeProcedure("sub",new Signature("str:String,start:Int,end:Int","String"))
			{
				@Override
				public NuttReference proceed(List<NuttReference> argumentList) throws NuttSuccessReturnException
				{
					return super.proceed(argumentList);
				}
			}.toAnonymousReference();
			case "replace" -> new NativeProcedure("replace",new Signature("str:String,pattern:String,to:String","String"))
			{
				@Override
				public NuttReference proceed(List<NuttReference> argumentList) throws NuttSuccessReturnException
				{
					var str=argumentList.get(0)
					                    .getValueAs(String.class)
					                    .getValue()
					                    .replace(argumentList.get(1).getValueAs(String.class).getValue(),
					                             argumentList.get(2).getValueAs(String.class).getValue());
					return new String(str).toAnonymousReference();
				}
			}.toAnonymousReference();
			default -> NilReference.getInstance();
		};
	}

	@Override
	public Array toArray()
	{
		List<NuttReference> valuables=Arrays
				.stream(content.split(""))
				.map(String::new)
				.map(AnonymousNuttReference::of)
				.collect(Collectors.toList());
		return new Array("String",valuables);
	}
}
