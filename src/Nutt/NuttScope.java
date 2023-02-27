package Nutt;

import Nutt.NuttInterpreter.Variable;
import Nutt.Types.IValuable;
import Nutt.Types.Nil;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.EmptyStackException;
import java.util.Objects;
import java.util.TreeMap;

public class NuttScope
{
	public final TreeMap<String,Variable> variableMap;
	NuttScope parent=null;
	public Variable yield=NuttEnvironment.constructNil("yield",false);

	public NuttScope(TreeMap<String,Variable> parentMap)
	{
		this.variableMap=parentMap;
	}

	public NuttScope()
	{
		this(new TreeMap<>());
	}

	public boolean definedLocally(String variableName)
	{
		return has(variableName)||variableMap.containsKey(variableName);
		//return variableMap.containsKey(variableName);
	}

	private boolean has(String variableName)
	{
		return !variableMap.values().stream().filter(v->Objects.equals(v.name,variableName)).toList().isEmpty();
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
		throw new RuntimeException(variableName+" not found!",new EmptyStackException());
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
			if(!new TypeInferencer().verdict(ceilType,value.getType()))
			{
				var fmt="%s cannot store %s!".formatted(ceilType,value.getType());
				throw new RuntimeException("Nutt variable store exception"+fmt);
			}
			return variableRef.setCeilType(ceilType).setValuable(value).setConstant(variableRef.isConstant);
		}
		catch(IllegalAccessException e)
		{
			throw new RuntimeException("Interpreter doesn't know the \"%s\" variable".formatted(variableName),e);
		}
	}

	public Variable addVariable(Variable variable)
	{
		return addVariable(variable.name,variable.valuable,variable.ceilType,variable.isConstant);
	}

	public Variable addVariable(String variableName)
	{
		return addVariable(variableName,new Nil(),"Either");
	}

	public Variable addVariable(String variableName,IValuable variable,String ceilType,boolean isConstant,
	                            ParserRuleContext tree)
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
			//System.out.println(this);
			throw new RuntimeException("Variable %s is already defined at line %s!".formatted(variableName,tree.start.getLine()));
		}
		return variableMap.put(variableName,new Variable(ceilType,variable,variableName,isConstant));
	}

	public Variable addVariable(String variableName,IValuable variable,String ceilType,boolean isConstant)
	{
		return addVariable(variableName,variable,ceilType,isConstant,null);
	}

	public Variable addVariable(String variableName,IValuable variable,String ceilType)
	{
		return addVariable(variableName,variable,ceilType,false);
	}

	public Variable addVariable(String variableName,IValuable variable)
	{
		return addVariable(variableName,variable,variable.getType());
	}

	@Override
	public String toString()
	{
		if(parent==null) return variableMap.toString();
		return variableMap+parent.toString();
	}
}
