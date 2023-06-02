package Nutt.Types.Functional.Type;

import Nutt.ParseHelpers.Row;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.IFunctional;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.String.String;
import Nutt.Types.Functional.Numerable.Boolean;
import Nutt.Types.IValuable;

import java.util.*;

public class Type implements IFunctional
{
	private final java.lang.String displayName;
	public Type parent;
	public List<Type> children=new ArrayList<>();
	public List<Type> typeParameters;

	public Type(java.lang.String displayName)
	{
		this(null,displayName);
	}

	public Type(Type parent,java.lang.String displayName)
	{
		this(parent,displayName,new ArrayList<>());
	}

	public Type(Type parent,java.lang.String displayName,List<Type> typeParameters)
	{
		this.displayName=displayName;
		if(parent!=null) parent.addChild(this);
		this.typeParameters=typeParameters;
	}

	static Type LowestCommonAncestorAll(Type... types)
	{
		return types.length==0?TypeInferencer.findType("Valuable"):LowestCommonAncestorAll(distinct(List.of(types)));
	}

	static Type LowestCommonAncestorAll(List<Type> types)
	{
		if(types.isEmpty()) return TypeInferencer.findType("Valuable");
		var nodeSet=distinct(types);
		var commonAncestor=nodeSet.get(0);
		for(int i=1;i<nodeSet.size();++i) commonAncestor=Type.LowestCommonAncestor(commonAncestor,nodeSet.get(i));
		return commonAncestor;
	}

	static List<Type> distinct(List<Type> nodeList)
	{
		return nodeList.isEmpty()?nodeList:new ArrayList<>(new HashSet<>(nodeList));
	}

	public static Type LowestCommonAncestor(Type n1,Type n2)
	{
		//Create a map to store ancestors of n1
		Map<Type,java.lang.Boolean> ancestors=new HashMap<>();
		//Insert n1 and all its ancestors in map
		while(n1!=null)
		{
			ancestors.put(n1,true);
			n1=n1.getParent();
		}
		//Check if n2 or any of its ancestors in a map.
		while(n2!=null)
		{
			if(ancestors.containsKey(n2)!=ancestors.isEmpty()) return n2;
			n2=n2.getParent();
		}
		return null;
	}

	public boolean hasChild(java.lang.String name)
	{
		return findChild(name)!=null;
	}

	public boolean hasChild(Type node)
	{
		return findChild(node)!=null;
	}

	@Override
	public int getLength()
	{
		return getChildren().size();
	}

	public java.lang.String toStringDebug()
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
	public Type getValue()
	{
		return this;
	}

	@Override
	public Type getType()
	{
		return this;
	}

	@Override
	public Type replicate()
	{
		return new Type(this.parent,this.displayName,this.typeParameters);
	}

	@Override public Array asElementsArray()
	{
		/*
		{
			{'name','name'},
			{'children',{a,b,c}}
		}
		*/
		var childrenAsRows=new ArrayList<Row>();
		var nameAsArray=new Array(List.of(new String("name"),new String(displayName)));
		var childrenAsArray=new Array(List.of(new String("children"),
		                                      new Array("Type",children.stream().map(IValuable::asValuable).toList())));
		return new Array("Valuable",List.of(nameAsArray,childrenAsArray));
	}

	@Override public boolean equals(Object o)
	{
		return this==o
		       ||o instanceof Type type
		         &&children.equals(type.getChildren())
		         &&typeParameters.equals(type.getTypeParameters());
	}

	@Override
	public java.lang.String toString()
	{
		//var childrenList="{"+NuttCommon.removeFirstAndLastChars(children.toString())+"}";
		//return "%s%s".formatted(displayName,children.size()>0?childrenList:"");
		//return asTree();
		return displayName;
	}

	public Type getParent()
	{
		return parent;
	}

	public Type setParent(Type parent)
	{
		this.parent=parent;
		return this;
	}

	public Type addChild(java.lang.String typeName)
	{
		return addChild(new Type(typeName));
	}

	public Type addChild(java.lang.String typeName,List<Type> children)
	{
		return addChild(new Type(typeName)).addChildren(children);
	}

	public Type addChildrenByNames(List<java.lang.String> childrenNames)
	{
		return addChildren(childrenNames
				                   .stream()
				                   .map(Type::new)
				                   .toList());
	}

	public Type addChildren(List<Type> children)
	{
		for(var child: children) addChild(child);
		return this;
	}

	public List<Type> getNestedChildren()
	{
		if(children==null) return new ArrayList<>();
		return new ArrayList<>(children
				                       .stream()
				                       .map(Type::getChildren)
				                       .flatMap(List::stream)
				                       .toList());
	}

	public Set<Type> getChildrenAsSet()
	{
		if(children==null) return new HashSet<>();
		var host=new TreeSet<>(children
				                       .stream()
				                       .toList());
		children
				.stream()
				.map(Type::getChildren)
				.forEach(host::addAll);
		return host;
	}

	public Type getParentType()
	{
		return parent;
	}

	public Type addChild(Type child)
	{
		children.add(child.setParent(this));
		return this;
	}

	public List<Type> getChildren()
	{
		if(children==null||children.isEmpty()) return new ArrayList<>();
		var host=new ArrayList<>(children
				                         .stream()
				                         .toList());
		//children.stream().map(TypeNode::getChildren).forEach(host::addAll);
		return host;
	}

	public List<Type> getTypeParameters()
	{
		return typeParameters;
	}

	public java.lang.String getDisplayName()
	{
		return displayName;
	}

	public Type removeChild(Type type)
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

	public Type removeChild(java.lang.String typeName)
	{
		if(Objects.equals(displayName,typeName)) return parent.removeChild(this);
		for(var child: children)
		{
			var ret=child.removeChild(typeName);
			if(ret!=null) return ret;
		}
		return null;
	}

	public java.lang.String asTree()
	{
		var sb=new StringBuilder(getDisplayName());
		sb.append(":{");
		for(int i=0, childrenSize=getChildren().size();i<childrenSize;i++)
		{
			var child=getChildren().get(i);
			sb.append(child.asTree());
			if(i<childrenSize-1) sb.append(",");
		}
		sb.append("}");
		return sb.toString();
	}

	public Type findChild(java.lang.String typeName)
	{
		if(Objects.equals(displayName,typeName)) return this;
		for(var child: children)
		{
			var ret=child.findChild(typeName);
			if(ret!=null) return ret;
		}
		return null;
	}

	public Type findChild(Type node)
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