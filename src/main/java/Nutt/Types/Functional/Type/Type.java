package Nutt.Types.Functional.Type;

import Nutt.Exceptions.NuttOperatorNotImplementedException;
import Nutt.Interpreter.References.NuttReference;
import Nutt.NuttCommon;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Actionable.Procedure.Procedure;
import Nutt.Types.Functional.IFunctional;
import Nutt.Types.Functional.Listable.Array.Array;
import lombok.Getter;

import java.util.*;

public class Type implements IFunctional
{
	private final Map<java.lang.String,Procedure> operatorMap=new HashMap<>();
	@Getter
	TypeHeader header;

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
		this.header=TypeHeader.builder().displayName(displayName).parent(parent).typeParameters(typeParameters).build();
		if(parent!=null) header.getParent().addChild(this);
	}

	static NuttReference LowestCommonAncestorAll(NuttReference... types)
	{
		return types.length==0
		       ?TypeInferencer.findTypeReference("Valuable")
		       :LowestCommonAncestorAll(distinct(List.of(types)));
	}

	static NuttReference LowestCommonAncestorAll(List<NuttReference> types)
	{
		if(types.isEmpty()) return TypeInferencer.findTypeReference("Valuable");
		var nodeSet=distinct(types);
		var commonAncestor=nodeSet.get(0);
		for(int i=1;i<nodeSet.size();++i)
			commonAncestor=Type.LowestCommonAncestor(commonAncestor,nodeSet.get(i));
		return commonAncestor;
	}

	static List<NuttReference> distinct(List<NuttReference> nodeList)
	{
		return nodeList.isEmpty()?nodeList:new ArrayList<>(new HashSet<>(nodeList));
	}

	public static NuttReference LowestCommonAncestor(NuttReference n1,NuttReference n2)
	{
		//Create a map to store ancestors of n1
		Map<Type,java.lang.Boolean> ancestors=new HashMap<>();
		//Insert n1 and all its ancestors in map
		while(n1!=null)
		{
			ancestors.put(n1.getType(),true);
			n1=TypeInferencer.findTypeReference(n1.getType().getHeader().getParent());
		}
		//Check if n2 or any of its ancestors in a map.
		while(n2!=null)
		{
			if(ancestors.containsKey(n2.getType())!=ancestors.isEmpty()) return n2;
			n2=TypeInferencer.findTypeReference(n2.getType().getHeader().getParent());
		}
		return null;
	}

	public Type addOperators(Procedure... procedures)
	{
		return addOperators(Arrays.asList(procedures));
	}

	public Type addOperators(List<Procedure> procedures)
	{
		for(var procedure: procedures) operatorMap.put(procedure.getName(),procedure);
		return this;
	}

	public boolean hasChild(java.lang.String name)
	{
		return findChild(name)!=null;
	}

	public boolean hasChild(Type node)
	{
		return findChild(node)!=null;
	}

	public java.lang.String toStringDebug()
	{
		var parentName=getHeader().getParent()==null
		               ?"null"
		               :getHeader().getParent()
		                           .getHeader()
		                           .getDisplayName();
		return "TypeNode{displayName='%s', parent='%s', children=%s}".formatted(getHeader().getDisplayName(),parentName,getChildren());
	}

	public List<Type> getChildren()
	{
		var children=getHeader().getChildren();
		return children==null||children.isEmpty()?new ArrayList<>():new ArrayList<>(children.stream().toList());
	}

	@Override
	public Type getType()
	{
		return this;
	}

	@Override
	public java.lang.String toSerializedString()
	{
		var displayName=getHeader().getDisplayName();
		var typeParameters=getHeader().getTypeParameters();
		return switch(typeParameters.size())
		{
			case 0 -> displayName;
			case 1 -> displayName+"|%s".formatted(typeParameters.get(0).toSerializedString());
			default -> displayName+"{%s}".formatted(NuttCommon.removeFirstAndLastChars(
					typeParameters.stream()
					              .map(Type::toSerializedString)
					              .toList()
					              .toString()));
		};
	}

	@Override
	public Object getValue()
	{
		return null;
	}

	@Override
	public Array spread()
	{
		return new Array(getHeader().getChildren().stream().map(TypeInferencer::findTypeReference).toList());
	}

	@Override
	public Type replicate()
	{
		return new Type(getHeader().getParent(),getHeader().getDisplayName(),getHeader().getTypeParameters());
	}

	@Override public boolean equals(Object o)
	{
		return this==o
		       ||o instanceof Type type
		         &&getHeader().getChildren().equals(type.getChildren())
		         &&getHeader().getTypeParameters().equals(type.getHeader().getTypeParameters());
	}

	@Override
	public java.lang.String toString()
	{
		//var childrenList="{"+NuttCommon.removeFirstAndLastChars(children.toString())+"}";
		//return "%s%s".formatted(displayName,children.size()>0?childrenList:"");
		//return asTree();
		return getHeader().getDisplayName();
	}

	public Type addChild(java.lang.String typeName)
	{
		return addChild(new Type(typeName));
	}

	public Type addChild(Type child)
	{
		child.setParent(this);
		getHeader().getChildren().add(child);
		return this;
	}

	public Type setParent(Type parent)
	{
		this.getHeader().setParent(parent);
		return this;
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
		var children=getHeader().getChildren();
		if(children==null) return new ArrayList<>();
		return new ArrayList<>(children
				                       .stream()
				                       .map(Type::getChildren)
				                       .flatMap(List::stream)
				                       .toList());
	}

	public Set<Type> getChildrenAsSet()
	{
		var children=getHeader().getChildren();
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
		return getHeader().getParent();
	}

	public Type removeChild(Type type)
	{
		var children=getHeader().getChildren();
		if(Objects.equals(this,type)) return getHeader().getParent().removeChild(this);
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
		if(Objects.equals(getHeader().getDisplayName(),typeName)) return getHeader().getParent().removeChild(this);
		for(var child: getHeader().getChildren())
		{
			var ret=child.removeChild(typeName);
			if(ret!=null) return ret;
		}
		return null;
	}

	public java.lang.String asTree()
	{
		var sb=new StringBuilder(getHeader().getDisplayName());
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
		if(Objects.equals(getHeader().getDisplayName(),typeName)) return this;
		for(var child: getHeader().getChildren())
		{
			var ret=child.findChild(typeName);
			if(ret!=null) return ret;
		}
		return null;
	}

	public Type findChild(Type node)
	{
		//return findChild(node.getDisplayName());
		if(Objects.equals(this,node)) return this;
		for(var child: getHeader().getChildren())
		{
			var ret=child.findChild(node);
			if(ret!=null) return ret;
		}
		return null;
	}

	public Procedure getOperator(java.lang.String name)
	{
		return Optional.ofNullable(operatorMap.get(name))
		               .orElseThrow(()->new NuttOperatorNotImplementedException(getHeader().getDisplayName(),name));
	}
}