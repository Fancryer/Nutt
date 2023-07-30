package Nutt.Interpreter;

import Nutt.Runtime.Mutable;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;
import Nutt.Types.Nil;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.EmptyStackException;
import java.util.List;
import java.util.Objects;
import java.util.Set;

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

	public Nutt.Interpreter.NuttReference forgetLocally(String variableName)
	{
		return referenceContainer.remove(variableName);
	}

	public Nutt.Interpreter.NuttReference forgetVariable(String variableName)
	{
		Nutt.Interpreter.NuttReference returnVar=null;
		if(!defined(variableName)) return null;
		if(definedLocally(variableName)) returnVar=forgetLocally(variableName);
		if(parent!=null) returnVar=Objects.requireNonNullElse(returnVar,parent.forgetVariable(variableName));
		return returnVar;
	}

	public Nutt.Interpreter.NuttReference getReference(String variableName) throws EmptyStackException
	{
		if(definedLocally(variableName)) return referenceContainer.get(variableName);
		if(parent!=null) return parent.getReference(variableName);
		throw new EmptyStackException();
	}

	public Nutt.Interpreter.NuttReference setReference(String referenceName,IValuable value)
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

	public Nutt.Interpreter.NuttReference addReference(String referenceName)
	{
		return addReference(referenceName,new AnonymousNuttReference(new Mutable<>(new Nil()),Var),"Valuable");
	}

	public Nutt.Interpreter.NuttReference addReference(String name,Nutt.Interpreter.NuttReference variable,String ceilType)
	{
		return addReference(name,variable,referenceContainer.get(ceilType).getType());
	}

	public Nutt.Interpreter.NuttReference addReference(String referenceName,Nutt.Interpreter.NuttReference reference)
	{
		return addReference(referenceName,reference,reference.getMutable().get().getType());
	}

	public Nutt.Interpreter.NuttReference addReference(String referenceName,Nutt.Interpreter.NuttReference reference,Type ceilType)
	{
		return addReference(referenceName,reference,ceilType,null);
	}

	public Nutt.Interpreter.NuttReference addReference(String referenceName,Nutt.Interpreter.NuttReference reference,Type ceilType,
	                                                   ParserRuleContext tree)
	{
		if(definedLocally(referenceName))
		{
			throw new RuntimeException
					(
							tree!=null
							?"Variable %s is already defined at line %s!".formatted(referenceName,tree.start.getLine())
							:"Variable %s is already defined!".formatted(referenceName)
					);
		}
		referenceContainer.put(referenceName,reference);
		return reference;
	}

	public boolean definedLocally(String referenceName)
	{
		return referenceContainer.get(referenceName)!=null;
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
}
