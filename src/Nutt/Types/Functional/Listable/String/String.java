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

	@Override public int getLength()
	{
		return content.length();
	}
}
