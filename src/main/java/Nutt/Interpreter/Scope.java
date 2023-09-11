package Nutt.Interpreter;

import Nutt.Exceptions.NuttVariableNotDefinedException;
import Nutt.Interpreter.Logging.EActionStatus;
import Nutt.Interpreter.Logging.ESeverity;
import Nutt.Interpreter.Logging.LogStamp;
import Nutt.Interpreter.References.AnonymousNuttReference;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Runtime.Mutable;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Actionable.Procedure.Procedure;
import Nutt.Types.Functional.Record.Record;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;
import Nutt.Types.Nil;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.EmptyStackException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

import static Nutt.Interpreter.NuttInterpreter.EConstantQualifier.Val;
import static Nutt.Interpreter.NuttInterpreter.EConstantQualifier.Var;
import static Nutt.NuttEnvironment.nuttLogger;

@Getter
@AllArgsConstructor
public class Scope
{
	public ReferenceContainer referenceContainer;
	@Setter
	private Scope parent=null;

	public Scope()
	{
		this(new ReferenceContainer());
	}

	public Scope(ReferenceContainer parentContainer)
	{
		referenceContainer=parentContainer;
	}

	public boolean defined(String referenceName)
	{
		return definedLocally(referenceName)||parent!=null&&parent.defined(referenceName);
	}

	public NuttReference forgetLocally(String variableName)
	{
		return referenceContainer.remove(variableName);
	}

	public NuttReference forgetReference(String referenceName)
	{
		NuttReference returnVar=null;
		if(!defined(referenceName)) throw new NuttVariableNotDefinedException(referenceName);
		if(definedLocally(referenceName)) returnVar=forgetLocally(referenceName);
		if(parent!=null) returnVar=Objects.requireNonNullElse(returnVar,parent.forgetReference(referenceName));
		return returnVar;
	}

	public NuttReference getReference(String variableName) throws EmptyStackException
	{
		if(definedLocally(variableName)) return referenceContainer.get(variableName);
		if(parent!=null) return parent.getReference(variableName);
		throw new NuttVariableNotDefinedException(variableName);
	}

	public NuttReference setReference(String referenceName,IValuable value)
	{
		try
		{
			if(!defined(referenceName)) throw new IllegalAccessException();
			var variableRef=getReference(referenceName);
			var ceilType=variableRef.getCeilType();
			var referenceType=value.getType();
			if(ceilType.findChild(referenceType)==null)
			{
				throw new Nutt.Exceptions.NuttVariableStoreException(ceilType.getHeader().getDisplayName(),
				                                                     referenceType.getHeader().getDisplayName());
			}
			return variableRef.setValue(value);
		}
		catch(IllegalAccessException e)
		{
			throw new Nutt.Exceptions.NuttVariableNotDefinedException(e,referenceName);
		}
	}

	public NuttReference addReference(String referenceName)
	{
		return addReference(referenceName,new AnonymousNuttReference(new Mutable<>(new Nil()),Var));
	}

	public NuttReference addReference(String referenceName,NuttReference reference)
	{
		if(definedLocally(referenceName))
		{
			nuttLogger.appendLog("Variable is already defined:",referenceName,EActionStatus.Failure,ESeverity.Fatal);
			throw new RuntimeException("Variable '%s' is already defined with value '%s'!".formatted(referenceName,reference));
		}
		referenceContainer.put(reference);
		return reference;
	}

	public boolean definedLocally(String referenceName)
	{
		return referenceContainer.get(referenceName)!=null;
	}

	public NuttReference addRecord(String recordName,Record record)
	{
		return addReference(recordName,new NuttReference(recordName,new Mutable<>(record),Val));
	}

	public Scope addLocalType(String typeName,Type parent,List<String> children)
	{
		return addLocalType(typeName,parent.getHeader().getDisplayName(),children);
	}

	public Scope addLocalType(String typeName,String parentName,List<String> children)
	{
		addReference(typeName,TypeInferencer.addCustomType(typeName,parentName,children));
		return this;
	}

	public Scope clear()
	{
		Function<Map.Entry<String,NuttReference>,LogStamp> getLogStamp=entry->
				LogStamp.builder()
				        .action("Removed variable")
				        .message(String.format("%s: %s",
				                               entry.getKey(),
				                               entry.getValue()))
				        .build();
		referenceContainer.entrySet()
		                  .stream()
		                  .map(getLogStamp)
		                  .forEach(nuttLogger::appendLog);
		referenceContainer.getReferences().clear();
		return this;
	}

	@Override
	public String toString()
	{
		return referenceContainer+(parent==null?"":parent.toString());
	}

	public NuttReference addProcedure(String name,Procedure procedure)
	{
		var procedureRef=new NuttReference(name,new Mutable<>(procedure),Val,getReference("Procedure").getValueAs(Type.class));
		referenceContainer.put(procedureRef);
		return procedureRef;
	}
}
