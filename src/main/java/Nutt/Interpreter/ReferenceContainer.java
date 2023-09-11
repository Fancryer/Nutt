package Nutt.Interpreter;

import Nutt.Interpreter.Logging.EActionStatus;
import Nutt.Interpreter.Logging.ESeverity;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.IValuable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static Nutt.NuttEnvironment.nuttLogger;

@Getter
public class ReferenceContainer
{
	private final Map<String,NuttReference> references;

	public ReferenceContainer()
	{
		references=new ConcurrentHashMap<>();
	}

	public ReferenceContainer(List<NuttReference> references)
	{
		this.references=new ConcurrentHashMap<>();
		for(NuttReference reference: references)
		{
			this.references.put(reference.getName(),reference);
		}
	}

	public NuttReference remove(String name)
	{
		NuttReference reference=references.remove(name);
		if(reference!=null)
		{
			nuttLogger.appendLog(
					"Removed variable",
					reference.toString(),
					EActionStatus.Success,
					ESeverity.Info
			                    );
		}
		return reference;
	}

	public NuttReference get(String name)
	{
		return references.get(name);
	}

	public List<Map.Entry<String,NuttReference>> entrySet()
	{
		return new ArrayList<>(references.entrySet());
	}

	public ReferenceContainer put(NuttReference reference)
	{
		nuttLogger.appendLog("Reference adding start",reference.toString());
		references.put(reference.getName(),reference);
		nuttLogger.appendLog(
				"Reference adding finish",
				reference.toString(),
				EActionStatus.Success,
				ESeverity.Info
		                    );
		return this;
	}

	public NuttReference get(IValuable valuable)
	{
		for(NuttReference reference: references.values())
		{
			if(reference.getValue().equals(valuable))
			{
				return reference;
			}
		}
		throw new RuntimeException("Reference not found");
	}

	@Override
	public String toString()
	{
		return references.toString();
	}
}