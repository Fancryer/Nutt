package Nutt;

import Nutt.Exceptions.NuttTypeIsDeclaredException;
import Nutt.Types.Functional.Type.CustomType;
import Nutt.Types.Functional.Type.IType;
import Nutt.Types.IValuable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TypeInferencer
{
	public final static IType typeTree;

	static
	{
		typeTree=new CustomType("Valuable")
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

	public static IType removeCustomType(String typeName)
	{
		return typeTree.removeChild(typeName);
	}

	public static IType addCustomType(String typeName)
	{
		return addCustomType(typeName,new ArrayList<>());
	}

	public static IType addCustomType(String typeName,List<String> children)
	{
		return addCustomType(typeName,"Type",children);
	}

	public static IType addCustomType(String typeName,String parentName,List<String> children)
	{
		if(!canTypeBeAdded(typeName,parentName)) throw new NuttTypeIsDeclaredException(typeName);
		return findType(parentName).addChild("").addChildrenByNames(children);
	}

	public static IType addCustomType(String typeName,IType parent,List<String> children)
	{
		return addCustomType(typeName,parent.getDisplayName(),children);
	}

	public static boolean canTypeBeAdded(String typeName,String parentName)
	{
		return !hasType(typeName);//||verdict("Type",parentName);
	}

	public static IType findTypeElse(String typeName,String otherTypeName)
	{
		return Objects.requireNonNullElse(findType(typeName),findType(otherTypeName));
	}

	public static IType findType(String typeName)
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

	public static Boolean verdict(IType typeA,IType typeB)
	{
		return typeA!=null
		       &&typeB!=null
		       &&typeA.findChild(typeB)!=null
		       &&typeA.getTypeParameters().equals(typeB.getTypeParameters());
	}

	public static Boolean verdict(String typeA,IType typeB)
	{
		return verdict(typeA,typeB.getDisplayName());
	}

	public static IType findTypeElse(IType type,IType otherType)
	{
		return findTypeElse(type.getDisplayName(),otherType.getDisplayName());
	}
	
	public static IType findType(IType type)
	{
		return findType(type.getDisplayName());
	}

	private static void prettyPrintTypeTree(IType tree,int depth,int offset)
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

	public static void prettyPrintTypeTree(IType tree)
	{
		prettyPrintTypeTree(tree,0,0);
	}

	public static Boolean verdictAll(String ceilType,List<IType> types)
	{
		return verdictAll(findType(ceilType),types);
	}

	public static Boolean verdictAll(IType ceilType,List<IType> types)
	{
		return types.stream().allMatch(t->verdict(ceilType,t));
	}

	public static IType getCommonIValuableWrapperType(List<IValuable> valuables)
	{
		return getCommonWrapperType(valuables.stream().map(IValuable::getType).toList());
	}

	public static IType getCommonWrapperType(IType typeA,IType typeB)
	{
		return IType.LowestCommonAncestor(typeA,typeB);
	}

	public static IType getCommonWrapperType(List<IType> types)
	{
		if(types.isEmpty()) return findType("Nil");
		var commonType=types.get(0);
		if(types.size()==1) return commonType;
		for(var i=1;i<types.size();++i) commonType=getCommonWrapperType(commonType,types.get(i));
		return commonType;
	}

	public static IType getTypeTreeRoot()
	{
		return typeTree;
	}

	public static boolean typesEquals(IType typeA,IType typeB)
	{
		return typeA.equals(typeB);
	}

	public static boolean typesEquals(String typeA,String typeB)
	{
		return typesEquals(findType(typeA),findType(typeB));
	}
}