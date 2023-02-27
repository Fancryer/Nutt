package Nutt.Types.Functional.Actionable.Procedure;

import Nutt.NuttDeclarationVisitor;
import Nutt.NuttInterpreter;
import Nutt.NuttInterpreter.Variable;
import Nutt.NuttStatementVisitor;
import Nutt.Types.Functional.Actionable.IActionable;
import Nutt.Types.IValuable;
import Nutt.Types.Nil;
import gen.NuttParser;

import java.util.List;

public class Procedure implements IActionable
{
	public NuttParser.BlockContext functionBody;
	public Parameters parameters;
	public Variable output;
	public NuttParser parser;
	public NuttInterpreter interpreter;
	
	public Procedure(){}
	
	public Procedure(Parameters parameters,NuttParser.BlockContext functionBody)
	{
		this(parameters,functionBody,new Variable("Valuable",new Nil(),"yield",false));
	}
	
	public Procedure(Parameters parameters,NuttParser.BlockContext functionBody,Variable output)
	{
		this.parameters=parameters;
		this.functionBody=functionBody;
		this.output=output;
	}
	
	public Procedure(Procedure procedure)
	{
		this(procedure.parameters,procedure.functionBody);
		parser=procedure.parser;
		interpreter=procedure.interpreter;
		output=procedure.output;
	}
	
	public Procedure setFunctionBody(NuttParser.BlockContext functionBody)
	{
		this.functionBody=functionBody;
		return this;
	}
	
	public Procedure setOutput(Variable output)
	{
		this.output=output;
		return this;
	}
	
	public Procedure setParameters(Parameters parameters)
	{
		this.parameters=parameters;
		return this;
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
		return "Procedure{functionBody='%s', parameters=%s, output=%s}".formatted(functionBody.toStringTree(parser),
		                                                                          parameters,output);
		//NuttEnvironment.toSourceCode(functionBody,parser),parameters,output);
	}
	
	private void evaluateArguments(List<IValuable> arguments)
	{
		if(arguments.isEmpty()) return;
		validateArguments(arguments);
		var declarator=new NuttDeclarationVisitor(parser,interpreter);
		
		//		for(int i=0;i<defaultArgumentDeclarations.size();++i)
		//		{
		//			var parameterName=interpreter.currentScope.getVariable(declarator.visitVar_decl(
		//					defaultArgumentDeclarations.get(i))).name;
		//			interpreter.currentScope.setVariable(parameterName,arguments.get(i));
		//		}
		
		//		System.out.println("Evaluated input arguments: "+defaultArgumentDeclarations.stream()
		//		                                                                            .map(arg->interpreter
		//		                                                                            .currentScope.getVariable(
		//				                                                             arg.name))
		//		                                                                            .toList());
	}
	
	public void validateArguments(List<IValuable> arguments)
	{
		if(arguments.size()>parameters.getSize())
		{
			throw new IllegalArgumentException(
					"Passed "+arguments.size()+" arguments, expected "+parameters.getSize()+"!");
		}
		//		var interferencer=new TypeInferencer();
		//		List<String> passed=new ArrayList<>();
		//		for(int i=0;i<defaultArgumentDeclarations.size();++i)
		//		{
		//			if(!interferencer.verdict(defaultArgumentDeclarations.get(i).ceilType,arguments.get(i).getType()))
		//			{
		//				passed.add("%s|%d|".formatted(arguments.get(i).getType(),i));
		//			}
		//		}
		//		var expected=defaultArgumentDeclarations.stream().map(v->v.ceilType).toList();
		//		if(!passed.isEmpty()) throw new IllegalArgumentException("Passed wrong: %s, expected %s!".formatted
		//		(passed,
		//		                                                                                                    expected));
	}
	
	public Procedure proceed(List<IValuable> argumentList)
	{
		if(argumentList.size()>parameters.getSize()) throw new RuntimeException("Parameter length is too large!");
		declareYield();
		interpreter.setScope(interpreter.createScope());
		declareParameters();
		int i=0;
		//От 0 и до последнего переданного аргумента
		var parameterNames=parameters.asNameList();
		for(;i<argumentList.size();++i)
		{
			interpreter.currentScope.setVariable(parameterNames.get(i),argumentList.get(i));
		}
		new NuttStatementVisitor(parser,interpreter).visitBlock(functionBody);
		interpreter.removeScope();
		//System.out.println(new NuttCommon.PrettyPrintingMap<>(interpreter.currentScope.variableMap));
		return this;
	}
	
	private void declareYield()
	{
		interpreter.currentScope.addVariable("yield",output.valuable,output.ceilType,output.isConstant);
		//interpreter.currentScope.addVariable(output);
	}
	
	private void declareParameters()
	{
		var declarator=new NuttDeclarationVisitor(parser,interpreter);
		for(var decl: parameters.asDeclarationList()) declarator.visitVar_decl(decl);
	}
	
	public IValuable yield()
	{
		//return interpreter.currentScope.yield.valuable;//forgetVariable("yield").valuable;
		return interpreter.currentScope.forgetLocally("yield").valuable;
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
		return parameters.getSize();
	}
	
	@Override
	public boolean asBoolean()
	{
		return false;
	}
}
