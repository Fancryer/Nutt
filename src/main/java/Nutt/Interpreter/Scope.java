package Nutt.Interpreter;

import Nutt.Interpreter.References.AnonymousNuttReference;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Runtime.Mutable;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Actionable.Procedure.Procedure;
import Nutt.Types.Functional.Record.Record;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;
import Nutt.Types.Nil;

import java.util.EmptyStackException;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import static Nutt.Interpreter.NuttInterpreter.EConstantQualifier.Val;
import static Nutt.Interpreter.NuttInterpreter.EConstantQualifier.Var;

public class Scope
{
	public final ReferenceContainer referenceContainer;
	Scope parent=null;

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
		if(!defined(referenceName)) return null;
		if(definedLocally(referenceName)) returnVar=forgetLocally(referenceName);
		if(parent!=null) returnVar=Objects.requireNonNullElse(returnVar,parent.forgetReference(referenceName));
		return returnVar;
	}

	public NuttReference getReference(String variableName) throws EmptyStackException
	{
		if(definedLocally(variableName)) return referenceContainer.get(variableName);
		if(parent!=null) return parent.getReference(variableName);
		throw new EmptyStackException();
	}

	public NuttReference setReference(String referenceName,IValuable value)
	{
		try
		{
			if(!defined(referenceName)) throw new IllegalAccessException();
			var variableRef=getReference(referenceName);
			var ceilType=variableRef.getCeilType();
			var referenceType=value.getType();
			if(ceilType.findChild(referenceType)==null&&!ceilType.equals(referenceType))
			{
				throw new Nutt.Exceptions.NuttVariableStoreException(ceilType.getDisplayName(),referenceType.getDisplayName());
			}
			variableRef.setValue(value);
			return variableRef;
		}
		catch(IllegalAccessException e)
		{
			throw new Nutt.Exceptions.NuttVariableNotDefinedException(e,referenceName);
		}
	}

	public NuttReference addReference(String referenceName)
	{
		return addReference(referenceName,new AnonymousNuttReference(new Mutable<>(new Nil()),Var),"Valuable");
	}

	public NuttReference addReference(String name,NuttReference variable,String ceilType)
	{
		return addReference(name,variable,referenceContainer.get(ceilType).getType());
	}

	public NuttReference addReference(String referenceName,NuttReference reference,Type ceilType)
	{
		if(definedLocally(referenceName))
		{
			throw new RuntimeException("Variable '%s' is already defined!".formatted(referenceName));
		}
		referenceContainer.put(referenceName,reference);
		return reference;
	}

	public boolean definedLocally(String referenceName)
	{
		return referenceContainer.get(referenceName)!=null;
	}

	public NuttReference addRecord(String recordName,Record record,Type ceilType)
	{
		return addReference(recordName,new NuttReference(recordName,new Mutable<>(record),Val,ceilType),ceilType);
	}

	public NuttReference addReference(String referenceName,NuttReference reference)
	{
		return addReference(referenceName,reference,reference.getMutable().get().getType());
	}

	public Scope addLocalType(String typeName,Type parent,List<String> children)
	{
		return addLocalType(typeName,parent.getDisplayName(),children);
	}

	public Scope addLocalType(String typeName,String parentName,List<String> children)
	{
		addReference(typeName,TypeInferencer.addCustomType(typeName,parentName,children),parentName);
		return this;
	}

	public Scope clear()
	{
		var entrySet=Set.copyOf(referenceContainer.entrySet());
		for(var entry: entrySet)
		{
			if(Objects.requireNonNull(entry.getValue().getMutable().get()) instanceof Type type)
				TypeInferencer.removeCustomType(type.getDisplayName());
			referenceContainer.remove(entry.getKey());
		}
		return this;
	}

	@Override
	public String toString()
	{
		return referenceContainer+(parent==null?"":parent.toString());
	}

	public NuttReference addProcedure(String name,Procedure procedure)
	{
		var procedureRef=new NuttReference(name,procedure);
		referenceContainer.put(name,procedureRef);
		return procedureRef;
	}
}
