package Nutt.Visitors;

import Nutt.Exceptions.NuttSuccessReturnException;
import Nutt.Interpreter.NuttInterpreter;
import Nutt.Interpreter.References.NilReference;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Actionable.Procedure.Procedure;
import Nutt.Types.Nil;
import gen.Nutt;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

public class NuttFunctionVisitor extends NuttGenericVisitor
{

	public static Supplier<Nil> getNil()
	{
		return Nil::new;
	}

	public static java.lang.String getFunctionName(List<TerminalNode> nameList)
	{
		return nameList!=null?java.lang.String.join(".",nameList
				.stream()
				.map(ParseTree::getText)
				.toList()):"";
	}

	@Override
	public NuttReference visitFunc_call_exp(Nutt.Func_call_expContext ctx) throws NuttSuccessReturnException
	{
		var evaluator=VisitorPool.evalVisitor;
		List<NuttReference> passedParameters=ctx.arguments==null
		                                     ?new ArrayList<>()
		                                     :ctx.arguments.exp().stream().map(evaluator::visit).toList();
		if(Objects.requireNonNull(evaluator.visit(ctx.exp())).getValue() instanceof Procedure procedure)
			return procedure.replicate().proceed(passedParameters);
		throw new RuntimeException();
	}

	public NuttReference runStaticFunction(Nutt.Functioncall_statContext ctx)
	{
		var name=ctx.name.getText();
		var parameters=ctx.explist()==null
		               ?new ArrayList<NuttReference>()
		               :getArguments(ctx.explist().exp());
		return invokeProcedure(getProcedureAtName(name),parameters);
	}

	private List<NuttReference> getArguments(List<Nutt.ExpContext> contexts)
	{
		return contexts.stream().map(VisitorPool.evalVisitor::visit).toList();
	}

	private Procedure getProcedureAtName(java.lang.String name)
	{
		return NuttInterpreter.getReference(name).getValue().simpleCast(Procedure.class);
	}

	public NuttReference invokeProcedure(Procedure procedure,List<NuttReference> parameters)
	{
		try
		{
			procedure.replicate().proceed(parameters);
		}
		catch(NuttSuccessReturnException e)
		{
			return e.getReference();
		}
		return NilReference.getInstance();
	}

	public NuttReference invokeProcedure(java.lang.String name,List<NuttReference> parameters)
	{
		return invokeProcedure(getProcedureAtName(name),parameters);
	}
}