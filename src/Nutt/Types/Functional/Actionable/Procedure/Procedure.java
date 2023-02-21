package Nutt.Types.Functional.Actionable.Procedure;

import Nutt.NuttEnvironment;
import Nutt.NuttEvalVisitor;
import Nutt.NuttInterpreter;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Actionable.IActionable;
import Nutt.Types.IValuable;
import gen.NuttParser;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.List;

public class Procedure implements IActionable
{
	public NuttParser.BlockContext functionBody;
	public ArrayList<NuttInterpreter.Variable> argumentList;
	public Pair<String,IValuable> output;
	//public IValuable output;
	public NuttParser parser;
	public NuttInterpreter interpreter;
	
	public Procedure(){}
	
	public Procedure(List<NuttInterpreter.Variable> argumentList,String ceilType)
	{
		this(new ArrayList<>(argumentList),ceilType,null);
	}
	
	public Procedure(List<NuttInterpreter.Variable> argumentList,String ceilType,NuttParser.BlockContext functionBody)
	{
		this.argumentList=new ArrayList<>(argumentList);
		this.output=new Pair<>(ceilType,NuttEnvironment.constructValuable(ceilType));
		this.functionBody=functionBody;
	}
	
	public Procedure(Procedure procedure)
	{
		this(procedure.argumentList,procedure.output.a,procedure.functionBody);
		parser=procedure.parser;
		interpreter=procedure.interpreter;
		output=procedure.output;
	}
	
	public Procedure setInterpreter(NuttInterpreter interpreter)
	{
		this.interpreter=interpreter;
		return this;
	}
	
	public Procedure setParser(NuttParser parser)
	{
		this.parser=parser;
		return this;
	}
	
	public Procedure setEnvironment(NuttParser parser,NuttInterpreter interpreter)
	{
		return setParser(parser).setInterpreter(interpreter);
	}
	
	@Override
	public String toString()
	{
		return "Procedure{functionBody='%s', argumentList=%s, output=%s}".formatted(functionBody,argumentList,output);
	}
	
	private void evaluateArguments(List<IValuable> arguments)
	{
		if(arguments.isEmpty()) return;
		validateArguments(arguments);
		for(int i=0;i<argumentList.size();++i)
		{
			NuttInterpreter.Variable variable=argumentList.get(i);
			variable.valuable=arguments.get(i);
			argumentList.set(i,variable);
		}
		//System.out.println("Evaluated input arguments: "+argumentList);
	}
	
	public void validateArguments(List<IValuable> arguments)
	{
		if(arguments.size()>argumentList.size())
		{
			throw new IllegalArgumentException(
					"Passed %d arguments, expected %d!".formatted(arguments.size(),argumentList.size()));
		}
		var interferencer=new TypeInferencer();
		List<String> passed=new ArrayList<>();
		for(int i=0;i<argumentList.size();++i)
		{
			if(!interferencer.verdict(argumentList.get(i).ceilType,arguments.get(i).getType()))
			{
				passed.add("%s|%d|".formatted(arguments.get(i).getType(),i));
			}
		}
		var expected=argumentList.stream().map(v->v.ceilType).toList();
		if(!passed.isEmpty()) throw new IllegalArgumentException("Passed wrong: %s, expected %s!".formatted(passed,
		                                                                                                    expected));
	}
	
	public Procedure proceed(List<IValuable> argumentList)
	{
		evaluateArguments(argumentList);
		var evaluator=new NuttEvalVisitor(parser,interpreter);
		for(var stat: functionBody.stat())
		{
			var statValue=evaluator.visitStat(stat);
			System.out.println(statValue);
			if(stat.laststat()!=null)
			{
				if(stat.laststat().function_yield()!=null)
				{
					output=new Pair<>(output.a,statValue);
					System.out.printf("Function output value is updated: %s!%n",output);
				}
			}
		}
		return this;
	}
	
	public IValuable yield()
	{
		var expectedType=output.a;
		var passedType=output.b.getType();
		if(!new TypeInferencer().verdict(expectedType,passedType))
		{
			throw new RuntimeException("%s cannot store %s!".formatted(expectedType,passedType));
		}
		return output.b;
	}
	
	@Override
	public Object getValue()
	{
		return output;
	}
	
	@Override
	public String getType()
	{
		return "Procedure";
	}
	
	@Override
	public String getWrapType()
	{
		return "Actionable";
	}
	
	@Override
	public int getLength()
	{
		return argumentList.size();
	}
	
	@Override
	public boolean asBoolean()
	{
		return false;
	}
}
