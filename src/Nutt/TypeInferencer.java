package Nutt;

import java.util.*;

public class TypeInferencer
{
	private final HashMap<String,Set<String>> typeRelations;
	private final HashMap<String,Set<String>> typeCorrections;

	public TypeInferencer()
	{
		this(getDefaultRelations());
	}

	private static HashMap<String,Set<String>> getDefaultRelations()
	{
		HashMap<String,Set<String>> relations=new HashMap<>();
		relations.put("Either",Set.of("Valuable"));
		relations.put("Valuable",Set.of("Functional","Nil"));
		relations.put("Functional",Set.of("Actionable","Numerable","Listable"));
		relations.put("Actionable",Set.of("Procedure","Macro"));
		relations.put("Numerable",Set.of("Int","Float"));
		relations.put("Listable",Set.of("Array","Map","String","Set"));
		relations.put("Set",Set.of("Enumeration"));
		return relations;
	}

	private static HashMap<String,Set<String>> getDefaultCorrections()
	{
		HashMap<String,Set<String>> corrections=new HashMap<>();
		corrections.put("Functional",Set.of("Function","IFunctional"));
		corrections.put("Actionable",Set.of("Action","IActionable"));
		corrections.put("Numerable",Set.of("Number","INumerable"));
		corrections.put("Listable",Set.of("List","IListable"));
		return corrections;
	}

	public TypeInferencer addTypeRelation(String type,Set<String> members)
	{
		typeRelations.put(type,members);
		return this;
	}

	public TypeInferencer addTypeCorrection(Set<String> toCorrect,String type)
	{
		typeCorrections.put(type,toCorrect);
		return this;
	}

	public TypeInferencer(HashMap<String,Set<String>> typeRelations)
	{
		this.typeRelations=typeRelations;
		this.typeCorrections=getDefaultCorrections();
	}

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
		return typeCorrections.keySet().stream().filter(k->Objects.equals(k,type)).findFirst().orElse(type);
	}

	public Set<String> intersectTypes(String ceilType,String floorType)
	{
		return intersect(compressTypes(correctType(ceilType)),compressTypes(correctType(floorType)));
	}

	public boolean canStore(String ceilType,String floorType)
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
		var memberSet=typeRelations.get(type);
		if(memberSet==null) return new HashSet<>();
		if(memberSet.size()==1) return compressTypes(memberSet.stream().findFirst().get());
		return compressedUnion(memberSet);
	}

	public String getWrapType(String type)
	{
		return typeRelations.entrySet()
		                    .stream()
		                    .filter(rel->rel.getValue().contains(type))
		                    .findFirst()
		                    .map(Map.Entry::getKey)
		                    .orElse("");
	}

	public String getCommonWrapperType(String typeA,String typeB)
	{
		Map<String,Set<String>> commonTypes=new HashMap<>();
		for(var rel: typeRelations.entrySet())
		{
			var members=getMembers(rel.getKey());
			if(!members.containsAll(List.of(typeA,typeB))) continue;
			commonTypes.put(rel.getKey(),members);
		}
		return commonTypes.entrySet().stream().min(Comparator.comparingInt(e->e.getValue().size())).orElse(
				new AbstractMap.SimpleEntry<>("Either",getDefaultRelations().get("Either"))).getKey();
	}

	/*
	def find_common_type(array_types, scalar_types):
    array_types = [dtype(x) for x in array_types]
    scalar_types = [dtype(x) for x in scalar_types]

    maxa = _can_coerce_all(array_types)
    maxsc = _can_coerce_all(scalar_types)

    if maxa is None:
        return maxsc

    if maxsc is None:
        return maxa

    try:
        index_a = _kind_list.index(maxa.kind)
        index_sc = _kind_list.index(maxsc.kind)
    except ValueError:
        return None

    if index_sc > index_a:
        return _find_common_coerce(maxsc, maxa)
    else:
        return maxa


	*/
}