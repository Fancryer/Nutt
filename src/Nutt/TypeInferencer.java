package Nutt;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;

public class TypeInferencer
{
	public boolean extendsOrEqual(String typeA,String typeB)
	{
		var types=compressTypes(typeA);
		//System.out.println(types);
		return types.contains(typeB);
	}
	
	public boolean isContainer(String type)
	{
		var qualifyingTypes=type.split("\\|");
		return switch(qualifyingTypes.length)
				{
					case 0 -> false;
					case 1 -> !Objects.equals(qualifyingTypes[0],"String")&&verdict("Listable",qualifyingTypes[0]);
					default ->
					{
						if(verdict("Listable",qualifyingTypes[0])) yield isContainer(qualifyingTypes[0]);
						yield false;
					}
				};
	}
	
	public boolean verdict(String typeA,String typeB)
	{
		//boolean aIsContainer=isContainer(typeA);
		return extendsOrEqual(typeA,typeB)||canStore(typeA,typeB);
	}
	
	public boolean verdict(boolean extendsOrEqual,boolean canStore)
	{
		return extendsOrEqual||canStore;
	}
	
	private String correctType(String type)
	{
		return switch(type)
				{
					case "Function","IFunctional" -> "Functional";
					case "Action","IActionable" -> "Actionable";
					case "Number","INumerable" -> "Numerable";
					case "List","IListable" -> "Listable";
					default -> type;
				};
	}
	
	public Set<String> intersectTypes(String ceilType,String floorType)
	{
		return intersect(compressTypes(correctType(ceilType)),compressTypes(correctType(floorType)));
	}
	
	public boolean canStore(String ceilType,String floorType)
	{
		//System.out.printf("Store check: %s:>%s?%n",ceilType,floorType);
		var intersection=intersectTypes(ceilType,floorType);
		//System.out.println("Intersection: "+intersection);
		return !intersection.isEmpty()&&!intersection.contains(ceilType);
	}
	
	private Set<String> compressTypes(String type,Set<String> typeMembers)
	{
		var res=new HashSet<>(List.of(type));
		res.addAll(typeMembers);
		return res;
	}
	
	private Set<String> compressTypes(String type)
	{
		return compressTypes(type,getMembers(type));
	}
	
	private Set<String> union(Set<String> a,Set<String> b)
	{
		var host=new HashSet<>(a);
		host.addAll(b);
		return host;
	}
	
	private Set<String> intersect(Set<String> a,Set<String> b)
	{
		var host=new HashSet<>(a);
		host.retainAll(b);
		return host;
	}
	
	private Set<String> union(List<Set<String>> sets)
	{
		if(sets==null||sets.size()==0) return new HashSet<>();
		Set<String> host=new HashSet<>(sets.get(0));
		for(var i=1;i<sets.size();++i) host=union(host,sets.get(i));
		return host;
	}
	
	private Set<String> compressedUnion(String... types)
	{
		return types==null||types.length==0?new HashSet<>():
		       types.length==1?compressTypes(types[0]):
		       union(Stream.of(types).map(this::compressTypes).toList());
	}
	
	private Set<String> getMembers(String type)
	{
		return switch(type)
				{
					case "Either" -> compressTypes("Valuable");
					case "Valuable" -> compressedUnion("Functional","Nil");
					case "Functional" -> compressedUnion("Actionable","Numerable","Listable");
					case "Actionable" -> compressedUnion("Procedure","Macro");
					case "Numerable" -> compressedUnion("Int","Float");
					case "Listable" -> compressedUnion("Array","Map","String","Set");
					case "Set" -> compressTypes("Enumeration");
					default -> new HashSet<>();
				};
	}
	
	public String getWrapType(String type)
	{
		return switch(type)
				{
					case "Valuable" -> "Either";
					case "Functional","Nil" -> "Valuable";
					case "Actionable","Numerable","Listable" -> "Functional";
					case "Procedure","Macro" -> "Actionable";
					case "Int","Float" -> "Numerable";
					case "Array","Map","String","Set" -> "Listable";
					case "Enumeration" -> "Set";
					default -> "";
				};
	}
}