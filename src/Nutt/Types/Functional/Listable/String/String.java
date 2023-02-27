package Nutt.Types.Functional.Listable.String;

import Nutt.Types.Functional.Listable.IListable;
import Nutt.Types.IValuable;

import java.util.Objects;

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

	@Override public java.lang.String toString()
	{
		return "String: %s".formatted(content);
	}

	@Override public Object getValue()
	{
		return content;
	}

	@Override public java.lang.String getType()
	{
		return "String";
	}

	@Override public java.lang.String getWrapType()
	{
		return "Listable";
	}

	@Override public boolean asBoolean()
	{
		return Objects.equals(content,"true");
	}

	@Override public int compareTo(IValuable valuable)
	{
		if(Objects.equals(valuable.getType(),"String"))
		{
			java.lang.String str=(java.lang.String)valuable.getValue();
			return str.compareTo(content);
		}
		throw new RuntimeException();
	}

	@Override public IValuable add(IValuable value)
	{
		return new String(content+value.getValue());
	}

	@Override public IValuable getAt(int i)
	{
		return new String(content.substring(i,i));
	}

	@Override public IValuable setAt(IValuable value,int i)
	{
		return new String(new StringBuilder(content).replace(i,i,java.lang.String.valueOf(value)).toString());
	}

	@Override public IValuable insertAt(IValuable value,int i)
	{
		return new String(new StringBuilder(content).insert(i,value).toString());
	}

	@Override public int getLength()
	{
		return content.length();
	}
}
