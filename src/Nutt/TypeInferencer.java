package Nutt;

import Nutt.Exceptions.NuttTypeIsDeclaredException;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TypeInferencer
{
	public final static Type typeTree;

	static
	{
		typeTree=new Type("Valuable")
				.addChildrenByNames(List.of("Nil","Functional"));
		var functional=typeTree.findChild("Functional");
		functional
				.addChildrenByNames(List.of("Listable","Numerable","Actionable","Record","Type"))
				.findChild("Numerable")
				.addChildrenByNames(List.of("Int","Float"))
				.findChild("Int")
				.addChild("Boolean");

		functional
				.findChild("Listable")
				.addChildrenByNames(List.of("String","Array","Map","Set"))
				.findChild("Set")
				.addChild("Enumeration");

		functional
				.findChild("Actionable")
				.addChild("Procedure");
	}

	public static Type removeCustomType(String typeName)
	{
		return typeTree.removeChild(typeName);
	}

	public static Type addCustomType(String typeName)
	{
		return addCustomType(typeName,new ArrayList<>());
	}

	public static Type addCustomType(String typeName,List<String> children)
	{
		return addCustomType(typeName,"Type",children);
	}

	public static Type addCustomType(String typeName,String parentName,List<String> children)
	{
		if(!canTypeBeAdded(typeName,parentName)) throw new NuttTypeIsDeclaredException(typeName);
		return findType(parentName).addChild(typeName).addChildrenByNames(children);
	}

	public static Type addCustomType(String typeName,Type parent,List<String> children)
	{
		return addCustomType(typeName,parent.getDisplayName(),children);
	}

	public static boolean canTypeBeAdded(String typeName,String parentName)
	{
		return !hasType(typeName);//||verdict("Type",parentName);
	}

	public static Type findTypeElse(String typeName,String otherTypeName)
	{
		return Objects.requireNonNullElse(findType(typeName),findType(otherTypeName));
	}

	public static Type findType(String typeName)
	{
		return typeTree.findChild(typeName);
	}

	public static boolean hasType(String typeName)
	{
		return findType(typeName)!=null;
	}

	public static Boolean verdict(String typeA,String typeB)
	{
		return verdict(findType(typeA),findType(typeB));
	}

	public static Boolean verdict(Type typeA,Type typeB)
	{
		return typeA!=null
		       &&typeB!=null
		       &&typeA.findChild(typeB)!=null
		       &&typeA.getTypeParameters().equals(typeB.getTypeParameters());
	}

	public static Boolean verdict(String typeA,Type typeB)
	{
		return verdict(typeA,typeB.getDisplayName());
	}

	public static Type findTypeElse(Type type,Type otherType)
	{
		return findTypeElse(type.getDisplayName(),otherType.getDisplayName());
	}
	
	public static Type findType(Type type)
	{
		return findType(type.getDisplayName());
	}

	private static void prettyPrintTypeTree(Type tree,int depth,int offset)
	{
		if(tree!=null)
		{
			System.out.printf("%s[%d:%d] -> %s[%s]%n",
			                  " ".repeat(4*depth),
			                  depth,
			                  offset,
			                  tree.getDisplayName(),
			                  tree.hashCode());
			int i=0;
			for(var child: tree.getChildren()) prettyPrintTypeTree(child,depth+1,i++);
		}
	}

	public static void prettyPrintTypeTree()
	{
		prettyPrintTypeTree(typeTree);
	}

	public static void prettyPrintTypeTree(Type tree)
	{
		prettyPrintTypeTree(tree,0,0);
	}

	public static Boolean verdictAll(String ceilType,List<Type> types)
	{
		return verdictAll(findType(ceilType),types);
	}

	public static Boolean verdictAll(Type ceilType,List<Type> types)
	{
		return types.stream().allMatch(t->verdict(ceilType,t));
	}

	public static Type getCommonIValuableWrapperType(List<IValuable> valuables)
	{
		return getCommonWrapperType(valuables.stream().map(IValuable::getType).toList());
	}

	public static Type getCommonWrapperType(Type typeA,Type typeB)
	{
		return Type.LowestCommonAncestor(typeA,typeB);
	}

	public static Type getCommonWrapperType(List<Type> types)
	{
		if(types.isEmpty()) return findType("Nil");
		var commonType=types.get(0);
		if(types.size()==1) return commonType;
		for(var i=1;i<types.size();++i) commonType=getCommonWrapperType(commonType,types.get(i));
		return commonType;
	}

	public static Type getTypeTreeRoot()
	{
		return typeTree;
	}

	public static boolean typesEquals(Type typeA,Type typeB)
	{
		return typeA.equals(typeB);
	}

	public static boolean typesEquals(String typeA,String typeB)
	{
		return typesEquals(findType(typeA),findType(typeB));
	}
}