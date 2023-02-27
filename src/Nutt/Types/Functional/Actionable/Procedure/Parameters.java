package Nutt.Types.Functional.Actionable.Procedure;

import Nutt.Pair;
import gen.NuttParser;
import gen.NuttParser.Var_declContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Parameters
{
	List<Pair<String,Var_declContext>> parameterList;
	NuttParser parser;
	
	public Parameters(List<Var_declContext> parameterList,NuttParser parser)
	{
		this.parameterList=fromDeclList(Objects.requireNonNullElse(parameterList,new ArrayList<>()));
		this.parser=parser;
	}
	
	private List<Pair<String,Var_declContext>> fromDeclList(List<Var_declContext> declContexts)
	{
		return declContexts.stream()
		                   .map(decl->new Pair<>(decl.var_header().NAME().getText(),decl))
		                   .collect(Collectors.toCollection(ArrayList::new));
	}
	
	public int getSize()
	{
		return parameterList.size();
	}
	
	public List<Var_declContext> asDeclarationList()
	{
		return new ArrayList<>(parameterList.stream().map(Pair::val).toList());
	}
	
	public List<String> asNameList()
	{
		return new ArrayList<>(parameterList.stream().map(Pair::key).toList());
	}
	
	@Override
	public String toString()
	{
		return "Parameters{parameterList=%s}".formatted(
				asDeclarationList().stream().map(v->v.toStringTree(parser)).toList());
		//NuttEnvironment.toSourceCode(v,parser)).toList());
	}
}
