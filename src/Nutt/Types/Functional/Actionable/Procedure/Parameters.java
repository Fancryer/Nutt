package Nutt.Types.Functional.Actionable.Procedure;

import Nutt.NuttEnvironment;
import gen.NuttParser.Var_declContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;

public class Parameters
{
	TreeMap<String,Var_declContext> parameterList;

	public Parameters(List<Var_declContext> parameterList)
	{
		this.parameterList=fromDeclList(Objects.requireNonNullElse(parameterList,new ArrayList<>()));
	}

	private TreeMap<String,Var_declContext> fromDeclList(List<Var_declContext> declContexts)
	{
		var map=new TreeMap<String,Var_declContext>();
		for(var decl:declContexts) map.put(decl.var_header().NAME().getText(),decl);
		return map;
	}

	public int getSize()
	{
		return parameterList.size();
	}

	public List<Var_declContext> asDeclarationList()
	{
		return new ArrayList<>(parameterList.values());
	}

	public List<String> asNameList()
	{
		return new ArrayList<>(parameterList.keySet());
	}

	@Override public String toString()
	{
		return "Parameters{parameterList=%s}".formatted(
				parameterList.values().stream().map(NuttEnvironment::toSourceCode).toList());
	}
}
