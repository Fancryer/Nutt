package Nutt.Types.Functional.Type;

import Nutt.TypeInferencer;
import Nutt.Types.Functional.IFunctional;

import java.util.*;

public interface IType extends IFunctional
{
	static IType LowestCommonAncestorAll(IType... types)
	{
		return types.length==0?TypeInferencer.findType("Valuable"):LowestCommonAncestorAll(distinct(List.of(types)));
	}

	static IType LowestCommonAncestorAll(List<IType> types)
	{
		if(types.isEmpty()) return TypeInferencer.findType("Valuable");
		var nodeSet=distinct(types);
		var commonAncestor=nodeSet.get(0);
		for(int i=1;i<nodeSet.size();++i) commonAncestor=IType.LowestCommonAncestor(commonAncestor,nodeSet.get(i));
		return commonAncestor;
	}

	static List<IType> distinct(List<IType> nodeList)
	{
		return nodeList.isEmpty()?nodeList:new ArrayList<>(new HashSet<>(nodeList));
	}

	static IType LowestCommonAncestor(IType n1,IType n2)
	{
		// Create a map to store ancestors of n1
		Map<IType,Boolean> ancestors=new HashMap<>();
		// Insert n1 and all its ancestors in map
		while(n1!=null)
		{
			ancestors.put(n1,true);
			n1=n1.getParent();
		}
		// Check if n2 or any of its ancestors in a map.
		while(n2!=null)
		{
			if(ancestors.containsKey(n2)!=ancestors.isEmpty()) return n2;
			n2=n2.getParent();
		}
		return null;
	}

	IType getParent();

	IType setParent(IType parent);

	IType addChild(String name);

	IType addChild(String name,List<IType> children);

	IType addChildrenByNames(List<String> names);

	IType addChildren(List<IType> children);

	List<IType> getNestedChildren();

	Set<IType> getChildrenAsSet();

	IType getParentType();

	IType addChild(IType child);

	List<IType> getTypeParameters();

	String getDisplayName();

	IType removeChild(IType child);

	IType removeChild(String name);

	default String asTree()
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

	IType findChild(String name);

	IType findChild(IType node);

	default boolean hasChild(String name)
	{
		return findChild(name)!=null;
	}

	default boolean hasChild(IType node)
	{
		return findChild(node)!=null;
	}

	@Override default int getLength()
	{
		return getChildren().size();
	}

	List<IType> getChildren();
}