package Nutt.Types.Functional.Type;

import Nutt.Types.Functional.Numerable.Boolean;
import Nutt.Types.IValuable;

import java.util.*;

public class CustomType implements IType
{
	private final String displayName;
	public IType parent;
	public List<IType> children=new ArrayList<>();
	public List<IType> typeParameters;

	public CustomType(String displayName)
	{
		this(null,displayName);
	}

	public CustomType(IType parent,String displayName)
	{
		this(parent,displayName,new ArrayList<>());
	}

	public CustomType(IType parent,String displayName,List<IType> typeParameters)
	{
		this.displayName=displayName;
		if(parent!=null) parent.addChild(this);
		this.typeParameters=typeParameters;
	}

	public String toStringDebug()
	{
		var parentName=parent==null?"null":parent.getDisplayName();
		return "TypeNode{displayName='%s', parent='%s', children=%s}".formatted(displayName,parentName,getChildren());
	}

	@Override
	public Boolean asBoolean()
	{
		return new Boolean(getLength()!=0);
	}

	@Override
	public boolean canConsumeParameters(List<IValuable> iValuables)
	{
		return true;
	}

	@Override
	public CustomType getValue()
	{
		return this;
	}

	@Override
	public IType getType()
	{
		return this;
	}

	@Override
	public int getLength()
	{
		return children.size();
	}

	@Override public CustomType replicate()
	{
		return new CustomType(this.parent,this.displayName,this.typeParameters);
	}

	
	
	@Override public boolean equals(Object o)
	{
		return this==o
		       ||o instanceof IType type
		         &&children.equals(type.getChildren())
		         &&typeParameters.equals(type.getTypeParameters());
	}

	@Override
	public String toString()
	{
		//var childrenList="{"+NuttCommon.removeFirstAndLastChars(children.toString())+"}";
		//return "%s%s".formatted(displayName,children.size()>0?childrenList:"");
		//return asTree();
		return displayName;
	}

	@Override public IType getParent()
	{
		return parent;
	}

	@Override public IType setParent(IType parent)
	{
		this.parent=parent;
		return this;
	}

	@Override
	public IType addChild(String typeName)
	{
		return addChild(new CustomType(typeName));
	}

	@Override
	public IType addChild(String typeName,List<IType> children)
	{
		return addChild(new CustomType(typeName)).addChildren(children);
	}

	@Override
	public IType addChildrenByNames(List<String> childrenNames)
	{
		return addChildren(childrenNames
				                   .stream()
				                   .map(name->(IType)new CustomType(name))
				                   .toList());
	}

	@Override
	public IType addChildren(List<IType> children)
	{
		for(var child: children) addChild(child);
		return this;
	}

	@Override
	public List<IType> getNestedChildren()
	{
		if(children==null) return new ArrayList<>();
		return new ArrayList<>(children
				                       .stream()
				                       .map(IType::getChildren)
				                       .flatMap(List::stream)
				                       .toList());
	}

	@Override
	public Set<IType> getChildrenAsSet()
	{
		if(children==null) return new HashSet<>();
		var host=new TreeSet<>(children
				                       .stream()
				                       .toList());
		children
				.stream()
				.map(IType::getChildren)
				.forEach(host::addAll);
		return host;
	}

	@Override
	public IType getParentType()
	{
		return parent;
	}

	@Override
	public IType addChild(IType child)
	{
		children.add(child.setParent(this));
		return this;
	}

	@Override
	public List<IType> getChildren()
	{
		if(children==null||children.isEmpty()) return new ArrayList<>();
		var host=new ArrayList<>(children
				                         .stream()
				                         .toList());
		//children.stream().map(TypeNode::getChildren).forEach(host::addAll);
		return host;
	}

	@Override public List<IType> getTypeParameters()
	{
		return typeParameters;
	}

	@Override
	public String getDisplayName()
	{
		return displayName;
	}

	@Override
	public IType removeChild(IType type)
	{
		if(Objects.equals(this,type)) return parent.removeChild(this);
		for(var child: children)
		{
			if(child==type)
			{
				children.remove(type);
				return child;
			}
			var ret=child.removeChild(type);
			if(ret!=null) return ret;
		}
		return null;
	}

	@Override
	public IType removeChild(String typeName)
	{
		if(Objects.equals(displayName,typeName)) return parent.removeChild(this);
		for(var child: children)
		{
			var ret=child.removeChild(typeName);
			if(ret!=null) return ret;
		}
		return null;
	}

	@Override
	public String asTree()
	{
		var sb=new StringBuilder(displayName);
		sb.append(":{");
		for(int i=0, childrenSize=children.size();i<childrenSize;i++)
		{
			var child=children.get(i);
			sb.append(child.asTree());
			if(i<childrenSize-1) sb.append(",");
		}
		sb.append("}");
		return sb.toString();
	}

	@Override
	public IType findChild(String typeName)
	{
		if(Objects.equals(displayName,typeName)) return this;
		for(var child: children)
		{
			var ret=child.findChild(typeName);
			if(ret!=null) return ret;
		}
		return null;
	}

	@Override
	public IType findChild(IType node)
	{
		return findChild(node.getDisplayName());
		//		if(Objects.equals(this,node)) return this;
		//		for(var child: children)
		//		{
		//			var ret=child.findChild(node);
		//			if(ret!=null) return ret;
		//		}
		//		return null;
	}

	@Override public boolean lessThan(IValuable value)
	{
		return false;
	}

	@Override public boolean greaterTo(IValuable value)
	{
		return false;
	}

	@Override public boolean lessEqalTo(IValuable value)
	{
		return false;
	}

	@Override public boolean greaterEqualTo(IValuable value)
	{
		return false;
	}

	@Override public boolean similarTo(IValuable value)
	{
		return false;
	}

	@Override public boolean notSimilarTo(IValuable value)
	{
		return false;
	}

	@Override public boolean equalTo(IValuable value)
	{
		return false;
	}

	@Override public boolean notEqualTo(IValuable value)
	{
		return false;
	}
}
