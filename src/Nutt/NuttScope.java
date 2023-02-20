package Nutt;

import Nutt.Types.IValuable;
import Nutt.Types.Nil;

import java.util.EmptyStackException;
import java.util.Objects;
import java.util.TreeMap;

public class NuttScope
{
	public final TreeMap<String,NuttInterpreter.Variable> variableMap;
	NuttScope parent=null;
	
	public NuttScope(TreeMap<String,NuttInterpreter.Variable> parentMap)
	{
		this.variableMap=parentMap;
	}
	
	public NuttScope()
	{
		this(new TreeMap<>());
	}
	
	public boolean definedLocally(String variableName)
	{
		return variableMap.containsKey(variableName);
	}
	
	public boolean defined(String variableName)
	{
		return definedLocally(variableName)||parent!=null&&parent.defined(variableName);
	}
	
	public NuttInterpreter.Variable forgetLocally(String variableName)
	{
		return variableMap.remove(variableName);
	}
	
	public NuttInterpreter.Variable forgetVariable(String variableName)
	{
		NuttInterpreter.Variable returnVar=null;
		if(definedLocally(variableName)) returnVar=forgetLocally(variableName);
		if(parent!=null) returnVar=Objects.requireNonNullElse(returnVar,parent.forgetVariable(variableName));
		return returnVar;
	}
	
	public NuttInterpreter.Variable getVariable(String variableName) throws EmptyStackException
	{
		if(definedLocally(variableName)) return variableMap.get(variableName);
		if(parent!=null) return parent.getVariable(variableName);
		throw new EmptyStackException();
	}

	public IValuable getValuable(String variableName) throws EmptyStackException
	{
		return getVariable(variableName).valuable;
	}
	
	public NuttInterpreter.Variable setVariable(String variableName,IValuable value)
	{
		try
		{
			if(!defined(variableName)) throw new IllegalAccessException();
			var variableRef=getVariable(variableName);
			var ceilType=variableRef.ceilType;
			if(!new TypeInferencer().verdict(ceilType,value.getType()))
			{
				throw new RuntimeException("Nutt variable store exception!");
			}
			variableRef.rebase(new NuttInterpreter.Variable(ceilType,value,variableRef.isConstant));
			return variableRef;
		}
		catch(IllegalAccessException e)
		{
			throw new RuntimeException("Interpreter doesn't know the \"%s\" variable".formatted(variableName),e);
		}
	}
	
	public NuttInterpreter.Variable addVariable(String variableName)
	{
		return addVariable(variableName,new Nil(),"Either");
	}
	
	public NuttInterpreter.Variable addVariable(String variableName,IValuable variable,String ceilType,
	                                            boolean isConstant)
	{
		if(!NuttCommon.isTypeValid(variable.getType()))
		{
			throw new RuntimeException("Unknown variable type: %s!".formatted(ceilType));
		}
		if(!NuttCommon.isTypeValid(ceilType))
		{
			throw new RuntimeException("Unknown ceil type: %s!".formatted(ceilType));
		}
		if(definedLocally(variableName))
		{
			throw new RuntimeException("Variable %s is already defined!".formatted(variableName));
		}
		return variableMap.put(variableName,new NuttInterpreter.Variable(ceilType,variable,isConstant));
	}
	
	public NuttInterpreter.Variable addVariable(String variableName,IValuable variable,String ceilType)
	{
		return addVariable(variableName,variable,ceilType,false);
	}
	
	public NuttInterpreter.Variable addVariable(String variableName,IValuable variable)
	{
		return addVariable(variableName,variable,variable.getType());
	}
	
	NuttScope createScope()
	{
		var scope=new NuttScope();
		scope.parent=this;
		return scope;
		
	}
	
	@Override
	public String toString()
	{
		return variableMap.toString();
	}
}
