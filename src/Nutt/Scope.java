package Nutt;

import Nutt.Exceptions.NuttVariableNotDefinedException;
import Nutt.Exceptions.NuttVariableStoreException;
import Nutt.NuttInterpreter.Variable;
import Nutt.Types.Functional.Actionable.Procedure.Procedure;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;
import Nutt.Types.Nil;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;

public class Scope
{
	public final Map<String,Variable> variableMap;
	Scope parent=null;

	public Scope(Map<String,Variable> parentMap)
	{
		variableMap=parentMap;
	}

	public Scope()
	{
		this(new HashMap<>());
	}

	public boolean defined(String variableName)
	{
		return definedLocally(variableName)||parent!=null&&parent.defined(variableName);
	}

	public Variable forgetLocally(String variableName)
	{
		return variableMap.remove(variableName);
	}

	public Variable forgetVariable(String variableName)
	{
		Variable returnVar=null;
		if(!defined(variableName)) return null;
		if(definedLocally(variableName)) returnVar=forgetLocally(variableName);
		if(parent!=null) returnVar=Objects.requireNonNullElse(returnVar,parent.forgetVariable(variableName));
		return returnVar;
	}

	public Variable getVariable(String variableName) throws EmptyStackException
	{
		if(definedLocally(variableName)) return variableMap.get(variableName);
		if(parent!=null) return parent.getVariable(variableName);
		throw new EmptyStackException();
	}

	public IValuable getValuable(String variableName) throws EmptyStackException
	{
		return getVariable(variableName).valuable;
	}

	public Variable setVariable(String variableName,IValuable value)
	{
		try
		{
			if(!defined(variableName)) throw new IllegalAccessException();
			var variableRef=getVariable(variableName);
			var ceilType=variableRef.ceilType;
			if(ceilType.findChild(value.getType())==null&&!ceilType.equals(value.getType()))
			{
				throw new NuttVariableStoreException(ceilType.getDisplayName(),value.getType().getDisplayName());
			}
			if(variableRef.isConstant) throw new RuntimeException();
			return variableRef.setCeilType(ceilType).setValuable(value).setConstant(variableRef.isConstant);
		}
		catch(IllegalAccessException e)
		{
			throw new NuttVariableNotDefinedException(e,variableName);
		}
	}

	public Variable addVariable(Variable variable)
	{
		return addVariable(variable.name,variable.valuable,variable.ceilType,variable.isConstant);
	}

	public Variable addVariable(String variableName,IValuable valuable,Type ceilType,boolean isConstant)
	{
		return addVariable(variableName,valuable,ceilType,isConstant,null);
	}

	public Variable addVariable(String variableName,IValuable valuable,Type ceilType,boolean isConstant,ParserRuleContext tree)
	{
		if(!NuttCommon.isTypeValid(valuable.getType().getDisplayName()))
		{
			throw new RuntimeException("Unknown variable type: %s!".formatted(ceilType));
		}
		if(!NuttCommon.isTypeValid(ceilType.getDisplayName()))
		{
			throw new RuntimeException("Unknown ceil type: %s!".formatted(ceilType));
		}
		if(definedLocally(variableName))
		{
			throw new RuntimeException
					(
							tree!=null
							?"Variable %s is already defined at line %s!".formatted(variableName,tree.start.getLine())
							:"Variable %s is already defined!".formatted(variableName)
					);
		}
		var putted=new Variable(ceilType,valuable,variableName,isConstant);
		variableMap.put(variableName,putted);
		return putted;
	}

	public boolean definedLocally(String variableName)
	{
		return has(variableName)||variableMap.containsKey(variableName);
		//return variableMap.containsKey(variableName);
	}

	private boolean has(String name)
	{
		return !variableMap
				.values()
				.stream()
				.filter(v->Objects.equals(v.name,name))
				.toList()
				.isEmpty();
	}

	public Variable addVariable(String variableName)
	{
		return addVariable(variableName,new Nil(),"Valuable");
	}

	public Variable addVariable(String variableName,IValuable variable,Type ceilType)
	{
		return addVariable(variableName,variable,ceilType,false);
	}

	public Variable addVariable(String variableName,IValuable variable)
	{
		return addVariable(variableName,variable,variable.getType());
	}

	public Scope addLocalType(String typeName,Type parent,List<String> children)
	{
		return addLocalType(typeName,parent.getDisplayName(),children);
	}

	public Scope addLocalType(String typeName,String parentName,List<String> children)
	{
		addVariable(typeName,TypeInferencer.addCustomType(typeName,parentName,children),parentName);
		System.out.println(typeName);
		return this;
	}

	public Scope clear()
	{
		for(var entry: variableMap.entrySet())
		{
			switch(entry.getValue().getValuable())
			{
				case Procedure procedure when procedure.getName().startsWith("\\") -> --Procedure.lambdaCount;
				case Type type -> TypeInferencer.removeCustomType(type.getDisplayName());
				default -> {}
			}
			variableMap.remove(entry.getKey());
		}
		return this;
	}

	@Override
	public String toString()
	{
		if(parent==null) return variableMap.toString();
		return variableMap+parent.toString();
	}

	public Variable addVariable(String name,IValuable variable,String ceilType)
	{
		return addVariable(name,variable,TypeInferencer.findType(ceilType));
	}
}
