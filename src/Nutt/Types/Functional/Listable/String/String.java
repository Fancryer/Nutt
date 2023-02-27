package Nutt.Types.Functional.Listable.String;

import Nutt.Types.Functional.Listable.IListable;
import Nutt.Types.IValuable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
	
	@Override
	public java.lang.String toString()
	{
		return "String: "+content;
	}
	
	@Override
	public Object getValue()
	{
		return content;
	}
	
	@Override
	public java.lang.String getType()
	{
		return "String";
	}
	
	@Override
	public java.lang.String getWrapType()
	{
		return "Listable";
	}
	
	@Override
	public boolean asBoolean()
	{
		return Objects.equals(content,"true");
	}
	
	@Override
	public int compareTo(IValuable valuable)
	{
		if(Objects.equals(valuable.getType(),"String"))
		{
			java.lang.String str=(java.lang.String)valuable.getValue();
			return str.compareTo(content);
		}
		throw new RuntimeException();
	}
	
	@Override
	public IValuable add(IValuable value)
	{
		return new String(content+value.getValue());
	}
	
	@Override
	public IValuable getAt(int i)
	{
		return new String(java.lang.String.valueOf(content.charAt(i)));
	}
	
	@Override
	public IValuable setAt(IValuable value,int i)
	{
		return new String(new StringBuilder(content).replace(i,i,java.lang.String.valueOf(value.getValue())).toString());
	}
	
	@Override
	public IValuable insertAt(IValuable value,int i)
	{
		return new String(new StringBuilder(content).insert(i,value).toString());
	}
	
	@Override
	public List<IValuable> getElements()
	{
		var chArr=content.toCharArray();
		var list=new ArrayList<Character>();
		for(var ch:chArr) list.add(ch);
		return list.stream().map(ch->new String(java.lang.String.valueOf(ch))).collect(Collectors.toList());
	}
	
	@Override
	public int getLength()
	{
		return content.length();
	}
}
