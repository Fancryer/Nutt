package Nutt;

import Nutt.Exceptions.NuttTypeIsDeclaredException;
import Nutt.Interpreter.NuttInterpreter;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Type.Native.*;
import Nutt.Types.Functional.Type.Type;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

import static Nutt.Interpreter.NuttInterpreter.typeTree;

public class TypeInferencer
{
	public static NuttReference removeCustomType(String typeName)
	{
		var foundReference=findTypeReference(typeName);
		NuttInterpreter.forget(typeName);
		return foundReference;
	}

	public static NuttReference findTypeReference(String typeName)
	{
		try
		{
			return (NuttReference)NuttInterpreter.currentScope.getReference(typeName);
		}
		catch(EmptyStackException e)
		{
			var nativeInstance=switch(typeName)
			{
				case "Valuable" -> ValuableType.getInstance();
				case "Nil" -> NilType.getInstance();
				case "Functional" -> FunctionalType.getInstance();
				case "Listable" -> ListableType.getInstance();
				case "String" -> StringType.getInstance();
				case "Array" -> ArrayType.getInstance();
				case "Set" -> SetType.getInstance();
				case "Map" -> MapType.getInstance();
				case "Actionable" -> ActionableType.getInstance();
				case "Procedure" -> ProcedureType.getInstance();
				case "Numerable" -> NumerableType.getInstance();
				case "Int" -> IntType.getInstance();
				case "Boolean" -> BooleanType.getInstance();
				case "Float" -> FloatType.getInstance();
				case "Record" -> RecordType.getInstance();
				default -> throw new IllegalStateException("Unknown type: %s".formatted(typeName));
			};
			return nativeInstance.toAnonymousReference();
		}
	}

	public static NuttReference addCustomType(String typeName)
	{
		return addCustomType(typeName,new ArrayList<>());
	}

	public static NuttReference addCustomType(String typeName,List<String> children)
	{
		return addCustomType(typeName,"Type",children);
	}

	public static NuttReference addCustomType(String typeName,String parentName,List<String> children)
	{
		if(!canTypeBeAdded(typeName,parentName)) throw new NuttTypeIsDeclaredException(typeName);
		return findTypeReference(findTypeReference(parentName).getType().addChild(typeName).addChildrenByNames(children));
	}

	public static NuttReference findTypeReference(Type type)
	{
		return type==null?null:findTypeReference(type.getHeader().getDisplayName());
	}

	public static boolean canTypeBeAdded(String typeName,String parentName)
	{
		return !hasType(typeName);//||verdict("Type",parentName);
	}

	public static boolean hasType(String typeName)
	{
		return findTypeReference(typeName)!=null;
	}

	public static NuttReference addCustomType(String typeName,Type parent,List<String> children)
	{
		return addCustomType(typeName,parent.getHeader().getDisplayName(),children);
	}

	public static Boolean verdictStringTypeParameters(List<String> typesA,List<String> typesB)
	{
		return typesA.size()==typesB.size()
		       &&IntStream.range(0,typesA.size())
		                  .allMatch(i->verdict(typesA.get(i),typesB.get(i)));
	}

	public static Boolean verdict(String typeA,String typeB)
	{
		return verdict(findTypeReference(typeA),findTypeReference(typeB));
	}

	public static Boolean verdict(NuttReference referenceA,NuttReference referenceB)
	{
		boolean aIsNull=referenceA==null, bIsNull=referenceB==null;
		if(aIsNull||bIsNull) return false;
		Type typeA=referenceA.getType().simpleCast(Type.class), typeB=referenceB.getType().simpleCast(Type.class);
		return typeA.hasChild(typeB);
		//		       &&verdictTypeParameters
		//				       (
		//						       referenceA.getType()
		//						                 .getHeader()
		//						                 .getTypeParameters()
		//						                 .stream()
		//						                 .map(TypeInferencer::findTypeReference)
		//						                 .toList(),
		//						       referenceB.getType()
		//						                 .getHeader().
		//						                 getTypeParameters()
		//						                 .stream()
		//						                 .map(TypeInferencer::findTypeReference)
		//						                 .toList()
		//				       );
	}

	public static Boolean verdictTypeParameters(List<NuttReference> typesA,List<NuttReference> typesB)
	{
		return typesA.size()==typesB.size()
		       &&IntStream.range(0,typesA.size())
		                  .allMatch(i->verdict(typesA.get(i),typesB.get(i)));
	}

	public static Boolean verdict(String typeA,Type typeB)
	{
		System.out.printf("typeA = %s, typeB = %s%n",typeA,typeB);
		return verdict(typeA,typeB.getHeader().getDisplayName());
	}

	public static NuttReference findTypeElse(Type type,Type otherType)
	{
		return findTypeElse(type.getHeader().getDisplayName(),otherType.getHeader().getDisplayName());
	}

	public static NuttReference findTypeElse(String typeName,String otherTypeName)
	{
		return Objects.requireNonNullElse(findTypeReference(typeName),findTypeReference(otherTypeName));
	}

	private static void prettyPrintTypeTree(Type tree,int depth,int offset)
	{
		if(tree!=null)
		{
			System.out.printf("%s[%d:%d] -> %s[%s]%n",
			                  " ".repeat(4*depth),
			                  depth,
			                  offset,
			                  tree.getHeader().getDisplayName(),
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

	public static Boolean verdictAll(String ceilType,List<NuttReference> types)
	{
		return verdictAll(findTypeReference(ceilType),types);
	}

	public static Boolean verdictAll(NuttReference ceilType,List<NuttReference> types)
	{
		return types.stream().allMatch(t->verdict(ceilType,t));
	}

	public static NuttReference getCommonIValuableWrapperType(List<NuttReference> references)
	{
		return getCommonWrapperType(references);
	}

	public static NuttReference getCommonWrapperType(List<NuttReference> types)
	{
		//System.out.println("types = "+types);
		if(types.isEmpty()) return findTypeReference("Nil");
		var commonType=types.get(0);
		if(types.size()==1) return commonType;
		for(var i=1;i<types.size();++i) commonType=getCommonWrapperType(commonType,types.get(i));
		return commonType;
	}

	public static NuttReference getCommonWrapperType(NuttReference typeA,NuttReference typeB)
	{
		return Type.LowestCommonAncestor(typeA,typeB);
	}

	public static Type getTypeTreeRoot()
	{
		return typeTree;
	}

	public static boolean typesEquals(String typeA,String typeB)
	{
		return typesEquals
				(
						findTypeReference(typeA).getType(),
						findTypeReference(typeB).getType()
				);
	}

	public static boolean typesEquals(Type typeA,Type typeB)
	{
		return typeA.equals(typeB);
	}

	public static NuttReference findParent(NuttReference typeReference)
	{
		var parentType=typeReference.getValueAs(Type.class).getHeader().getParent();
		return findTypeReference(parentType);
	}
}