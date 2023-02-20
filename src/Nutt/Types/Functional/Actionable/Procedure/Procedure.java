package Nutt.Types.Functional.Actionable.Procedure;

import Nutt.NuttEvalVisitor;
import Nutt.NuttInterpreter;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Actionable.IActionable;
import Nutt.Types.IValuable;
import gen.NuttParser;

import java.util.ArrayList;
import java.util.List;

public class Procedure implements IActionable
{
	public NuttParser.BlockContext functionBody;
	public ArrayList<NuttInterpreter.Variable> argumentList;
	public IValuable output;
	public NuttParser parser;
	public NuttInterpreter interpreter;

	public Procedure(){}

	public Procedure(List<NuttInterpreter.Variable> argumentList,IValuable output)
	{
		this(new ArrayList<>(argumentList),output,null);
	}

	public Procedure(List<NuttInterpreter.Variable> argumentList,IValuable output,NuttParser.BlockContext functionBody)
	{
		this.argumentList=new ArrayList<>(argumentList);
		this.output=output;
		this.functionBody=functionBody;
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
		if(arguments.size()>argumentList.size())
		{
			throw new IllegalArgumentException(
					"Passed %d arguments, expected %d!".formatted(arguments.size(),argumentList.size()));
		}
		var interferencer=new TypeInferencer();
		for(int i=0;i<argumentList.size();++i)
		{
			if(!interferencer.verdict(argumentList.get(i).ceilType,arguments.get(i).getType()))
			{
				throw new IllegalArgumentException();
			}
			NuttInterpreter.Variable variable=argumentList.get(i);
			variable.valuable=arguments.get(i);
			argumentList.set(i,variable);
		}
		//System.out.println("Evaluated input arguments: "+argumentList);
	}

	public Procedure proceed(List<IValuable> argumentList)
	{
		evaluateArguments(argumentList);
		var evaluator=new NuttEvalVisitor(parser,interpreter);
		for(var stat: functionBody.stat())
		{
			var statValue=evaluator.visitStat(stat);
			if(stat.laststat().function_yield()!=null)
			{
				output=statValue;
				System.out.printf("Function output value is updated: %s!%n",output);
			}
		}
		return this;
	}

	public IValuable yield()
	{
		return output;
	}

	@Override
	public Object getValue()
	{
		return "ProcedureValue...";
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
