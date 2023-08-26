package Nutt.Interpreter;

import Nutt.Interpreter.Logging.EActionStatus;
import Nutt.Interpreter.Logging.ESeverity;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.IValuable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static Nutt.NuttEnvironment.nuttLogger;

@Getter
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

	public NuttReference get(String name)
	{
		return references.stream()
		                 .filter(reference->reference.getName().equals(name))
		                 .findFirst()
		                 .orElse(null);
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

	public ReferenceContainer put(NuttReference reference)
	{
		nuttLogger.appendLog("Reference adding start",reference.toString());
		references.add(reference);
		nuttLogger.appendLog("Reference adding finish",
		                     reference.toString(),
		                     EActionStatus.Success,
		                     ESeverity.Info);
		return this;
	}

	public NuttReference get(IValuable valuable)
	{
		return references.stream()
		                 .filter(reference->reference.getValue().equals(valuable))
		                 .findFirst()
		                 .orElseThrow();
	}

	@Override public String toString()
	{
		return references.toString();
	}
}
