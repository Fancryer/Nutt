package Nutt.Interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReferenceContainer
{
	private final List<NuttReference> references;

	public ReferenceContainer()
	{
		references=new ArrayList<>();
	}

	public ReferenceContainer(List<NuttReference> references)
	{
		this.references=references;
	}

	public List<NuttReference> getReferences()
	{
		return references;
	}

	public NuttReference get(String name)
	{
		return references.stream()
		                 .filter(reference->reference.getName().equals(name))
		                 .findFirst()
		                 .orElse(null);
	}

	public NuttReference get(int index)
	{
		return references.get(index);
	}

	//Returns previous reference
	public NuttReference remove(String name)
	{
		var reference=get(name);
		references.remove(reference);
		return reference;
	}

	public NuttReference remove(int index)
	{
		return references.remove(index);
	}

	public Set<Map.Entry<String,NuttReference>> entrySet()
	{
		return references.stream()
		                 .collect(java.util.stream.Collectors.toMap(NuttReference::getName,reference->reference))
		                 .entrySet();
	}

	public ReferenceContainer put(String name,NuttReference reference)
	{
		references.add(reference);
		return this;
	}
}
