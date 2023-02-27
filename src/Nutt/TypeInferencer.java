package Nutt;

import Nutt.Common.TypeRelation;

import java.util.*;
import java.util.function.BiFunction;

public class TypeInferencer
{
	private final HashMap<String,Set<String>> typeCorrections;
	private final ArrayList<TypeRelation> typeRelations;

	public TypeInferencer()
	{
		this(getDefaultRelations());
	}

	public TypeInferencer(ArrayList<TypeRelation> typeRelations)
	{
		this.typeCorrections=getDefaultCorrections();
		this.typeRelations=new ArrayList<>(getDefaultRelations());
		this.typeRelations.addAll(typeRelations);
	}

	static ArrayList<TypeRelation> getDefaultRelations()
	{
		BiFunction<String,Set<String>,TypeRelation> rel=TypeRelation::new;
		return new ArrayList<>(List.of(rel.apply("Valuable",Set.of("Functional","Nil")),rel.apply("Functional",Set.of("Actionable","Numerable","Listable")),
		                               rel.apply("Actionable",Set.of("Procedure","Macro")),rel.apply("Numerable",Set.of("Int","Float")),
		                               rel.apply("Listable",Set.of("Array","Map","String","Set")),rel.apply("Set",Set.of("Enumeration"))));
	}

	static HashMap<String,Set<String>> getDefaultCorrections()
	{
		HashMap<String,Set<String>> corrections=new HashMap<>();
		corrections.put("Functional",Set.of("Function","IFunctional"));
		corrections.put("Actionable",Set.of("Action","IActionable"));
		corrections.put("Numerable",Set.of("Number","INumerable"));
		corrections.put("Listable",Set.of("List","IListable"));
		return corrections;
	}

	private static TypeRelation mapEntryToRelation(Map<String,Set<String>> map,String key)
	{
		return new TypeRelation(key,map.get(key));
	}

	private static TypeRelation mapEntryToRelation(Map.Entry<String,Set<String>> entry)
	{
		return new TypeRelation(entry.getKey(),entry.getValue());
	}

	public TypeInferencer addTypeCorrection(Set<String> toCorrect,String type)
	{
		typeCorrections.put(type,toCorrect);
		return this;
	}

	public Boolean extendsOrEqual(String typeA,String typeB)
	{
		var types=compressTypes(typeA);
		//System.out.println(types);
		return types.contains(typeB);
	}

	public Boolean isContainer(String type)
	{
		var qualifyingTypes=type.split("\\|");
		return switch(qualifyingTypes.length)
				{
					case 0 -> false;
					case 1 -> !Objects.equals(qualifyingTypes[0],"String")&&verdict("Listable",qualifyingTypes[0]);
					default -> verdict("Listable",qualifyingTypes[0])?isContainer(qualifyingTypes[0]):Boolean.valueOf(false);
				};
	}

	public Boolean verdict(String typeA,String typeB)
	{
		//Boolean aIsContainer=isContainer(typeA);
		return extendsOrEqual(typeA,typeB)||canStore(typeA,typeB);
	}

	public Boolean verdict(Boolean extendsOrEqual,Boolean canStore)
	{
		return extendsOrEqual||canStore;
	}

	private String correctType(String type)
	{
		return typeCorrections.keySet().stream().filter(k->Objects.equals(k,type)).findFirst().orElse(type);
	}

	public Set<String> intersectTypes(String ceilType,String floorType)
	{
		return intersect(compressTypes(correctType(ceilType)),compressTypes(correctType(floorType)));
	}

	public Boolean canStore(String ceilType,String floorType)
	{
		var intersection=intersectTypes(ceilType,floorType);
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

	private Set<String> compressedUnion(Set<String> types)
	{
		if(types==null||types.size()==0) return new HashSet<>();
		if(types.size()==1) return compressTypes(types.stream().toList().get(0));
		return union(types.stream().map(this::compressTypes).toList());
	}

	private Set<String> getMembers(String type)
	{
		var memberSet=typeRelations.stream().filter(t->Objects.equals(t.typeName(),type)).findFirst().orElse(null);
		if(memberSet==null) return new HashSet<>();
		if(memberSet.members().size()==1) return compressTypes(memberSet.members().stream().findFirst().get());
		return compressedUnion(memberSet.members());
	}

	public String getWrapType(String type)
	{
		var rel=typeRelations.stream().filter(r->r.members().contains(type)).findFirst().orElse(null);
		return rel!=null?rel.typeName():"";
	}

	public String getCommonWrapperType(String typeA,String typeB)
	{
		Map<String,Set<String>> commonTypes=new HashMap<>();
		for(var rel: typeRelations)
		{
			var members=getMembers(rel.typeName());
			if(!members.containsAll(List.of(typeA,typeB))) continue;
			commonTypes.put(rel.typeName(),members);
			//System.out.println(rel.typeName()+" "+commonTypes.entrySet());
		}
		//System.out.println();
		var commonType=commonTypes.entrySet().stream().min(Comparator.comparingInt(e->e.getValue().size()));
		if(commonType.isPresent())return commonType.get().getKey();
		return "Valuable";
	}
}