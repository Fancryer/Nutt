package Nutt.Visitors;

import Nutt.Exceptions.*;
import Nutt.*;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.IListable;
import Nutt.Types.Functional.Listable.String.String;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;
import Nutt.Types.Nil;
import com.google.common.collect.Lists;
import gen.Nutt;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class NuttStatementVisitor extends NuttGenericVisitor<IValuable>
{
	@Override
	public String visitModule_start(Nutt.Module_startContext ctx)
	{
		var moduleName=new ModuleLoader().getFullModuleName(ctx.module_name());
		NuttInterpreter.moduleNames.add(moduleName);
		return new String(moduleName);
	}

	@Override
	public String visitModule_name(Nutt.Module_nameContext ctx)
	{
		var packageList=ctx.NAME().stream().map(TerminalNode::getText).toList();
		return new String(java.lang.String.join("\\\\",packageList));
	}

	@Override
	public String visitModule_import(Nutt.Module_importContext ctx)
	{
		new ModuleLoader().importModuleContext(ctx,this);
		return new String();
	}

	@Override
	public String visitBlock(Nutt.BlockContext ctx)
	{
		NuttInterpreter.executeBlockAsScope
				               (
						               ()->
						               {
							               IValuable ret=new Nil();
							               for(var stat: ctx.stat()) ret=visit(stat);
							               return ret;
						               }
				               );
		return new String();
	}

	//	@Override public String visitModule(Nutt.ModuleContext ctx)
	//	{
	//		visitModule_start(ctx.module_start());
	//		for(var i: ctx.module_import()) visitModule_import(i);
	//		visitBlock(ctx.block());
	//		return "";
	//	}

	@Override public IValuable visitDo_done_block_stat(Nutt.Do_done_block_statContext ctx)
	{
		return new String(visit(ctx.do_done_block().block()));
	}

	@Override public IValuable visitIf_then_else_block_stat(Nutt.If_then_else_block_statContext ctx)
	{
		var block=ctx.if_then_else_block();
		var pred=new NuttConditionVisitor().visit(block.exp()).asFunctional().asBoolean();
		if(pred.isTrue()) return visitBlock(block.then_block().block());
		var elseBlock=block.else_block();
		return elseBlock!=null?visitBlock(elseBlock.block()):new String();
	}

	@Override
	public String visitType_def_stat(Nutt.Type_def_statContext ctx)
	{
		System.out.println(ctx.type_def().derived_type.flat_type.getText());
		var stringExtractor=new NuttStringVisitor();
		var derivedType=stringExtractor.extractTypeName(ctx.type_def().derived_type);
		if(TypeInferencer.hasType(derivedType))
			throw new NuttTypeIsDeclaredException(derivedType);
		var childrenTypes=ctx.type_def().children.type_param().stream().map(NuttEnvironment::toSourceCode).toList();
		var extractedType=stringExtractor.extractTypeName(ctx.type_def().parent_type);
		var parentType=extractedType==null?"Type":extractedType;
		//NuttInterpreter.currentScope.addLocalType(derivedType,parentType,childrenTypes);
		TypeInferencer.addCustomType(derivedType,parentType,childrenTypes);
		return new String(derivedType);
	}

	@Override public IValuable visitGroup_var_decl_stat(Nutt.Group_var_decl_statContext ctx)
	{
		return new NuttDeclarationVisitor().visitGroup_var_decl(ctx.group_var_decl());
	}

	@Override public IValuable visitExec_stat(Nutt.Exec_statContext ctx)
	{
		return visit(NuttEnvironment.parseAsSource(ctx.stat()).stat());
	}

	@Override
	public String visitYield_stat(Nutt.Yield_statContext ctx)
	{
		throw new NuttSuccessReturnException(new NuttEvalVisitor().visit(ctx.function_yield().exp()));
		//return new NuttFunctionVisitor(interpreter).visitFunction_yield();
	}

	@Override public IValuable visitRecord_def_stat(Nutt.Record_def_statContext ctx)
	{
		return new NuttDeclarationVisitor().visitRecord_def(ctx.record_def());
	}

	@Override
	public IValuable visitBreak_stat(Nutt.Break_statContext ctx)
	{
		throw new NuttBreakException();
	}

	@Override
	public IValuable visitContinue_stat(Nutt.Continue_statContext ctx)
	{
		throw new NuttContinueException();
	}

	@Override public IValuable visitExit_stat(Nutt.Exit_statContext ctx)
	{
		throw new NuttExitException();
	}

	@Override
	public IValuable visitGroup_assignment(Nutt.Group_assignmentContext ctx)
	{
		return new NuttAssignmentVisitor().visitGroup_assignment(ctx);
	}

	@Override
	public IValuable visitFunctiondef_stat(Nutt.Functiondef_statContext ctx)
	{
		return new NuttDeclarationVisitor().visitFunctiondef_stat(ctx);
	}

	@Override
	public IValuable visitComposed_assign(Nutt.Composed_assignContext ctx)
	{
		var variableName=ctx.NAME().getText();
		Function<ParseTree,java.lang.String> operator=t->NuttCommon.removeLastChar(t.getText());
		Supplier<java.lang.String> normalize=()->"%s=%s%s%s".formatted(variableName,
		                                                               variableName,
		                                                               operator.apply(ctx.operator_composed()),
		                                                               NuttEnvironment.toSourceCode(ctx.operator_composed().exp()));
		return visitGroup_assignment(NuttEnvironment.getTempParser(normalize.get()).group_assignment());
	}

	@Override
	public IValuable visitSelf_assign(Nutt.Self_assignContext ctx)
	{
		var variableName=ctx.NAME().getText();
		var firstOp=NuttEnvironment.toSourceCode(ctx.operator_postfix().operator_math(0));
		var secondOp=NuttEnvironment.toSourceCode(ctx.operator_postfix().operator_math(1));
		var postfixOperator=firstOp+secondOp;
		var stepIsOne=postfixOperator.equals("++")||postfixOperator.equals("--");
		var normalize="%s=%s%s%s".formatted(variableName,variableName,firstOp,stepIsOne?"1":variableName);
		return visitGroup_assignment(NuttEnvironment.getTempParser(normalize).group_assignment());
	}

	@Override
	public Nil visitForget(Nutt.ForgetContext ctx)
	{
		if(ctx.KW_All()!=null) NuttInterpreter.forgetAll();
		NuttInterpreter.forgetList(ctx.flat_name_list().NAME().stream().map(ParseTree::getText).toList());
		return new Nil();
	}

	@Override
	public IValuable visitLoop(Nutt.LoopContext ctx)
	{
		if(ctx.for_each_loop()!=null) return visitFor_each_loop(ctx.for_each_loop());
		if(ctx.while_do_loop()!=null) return visitWhile_do_loop(ctx.while_do_loop());
		if(ctx.repeat_until_loop()!=null) return visitRepeat_until_loop(ctx.repeat_until_loop());
		return super.visitLoop(ctx);
	}

	@Override
	public IValuable visitFor_each_loop(Nutt.For_each_loopContext ctx)
	{
		var variableName=new String(ctx.NAME().getSymbol().getText());
		var bDirectionIsForward=ctx.op_direction().OP_Forward()!=null;
		var expList=bDirectionIsForward?ctx.explist().exp():Lists.reverse(ctx.explist().exp());
		var evaluator=new NuttEvalVisitor();
		IValuable lastValue;
		var block=NuttEnvironment.getTempParser("do %s done".formatted(NuttEnvironment.toSourceCode(ctx.stat()))).block();
		if(expList.size()==1)
		{
			var exp=evaluator.visit(expList.get(0));
			if(TypeInferencer.findType("Listable").findChild(exp.getType())==null)
				throw new RuntimeException("Cannot iterate over "+exp.getType());
			var listable=exp.asFunctional().asListable();
			lastValue=forEachOnIListable(bDirectionIsForward?listable:
			                             listable.setElements(Lists.reverse(listable.getElements())),
			                             variableName,
			                             block);
		}
		else lastValue=forEachOnExpList(expList,variableName,block,evaluator);
		NuttInterpreter.currentScope.forgetVariable(variableName.toString());
		return lastValue;
	}

	@Override
	public String visitWhile_do_loop(Nutt.While_do_loopContext ctx)
	{
		var conditionVisitor=new NuttConditionVisitor();
		var whileBlock=NuttEnvironment.parseWithBound("do ",ctx.stat()," done").block();
		whileLoop:
		while(conditionVisitor.visitExplist(ctx.explist()).isTrue())
		{
			for(var stat: whileBlock.children)
			{
				try
				{
					visit(stat);
				}
				catch(NuttBreakException e)
				{
					break whileLoop;
				}
				catch(NuttContinueException e)
				{
					continue whileLoop;
				}
			}
		}
		return new String();
	}

	@Override
	public IValuable visitTry_catch(Nutt.Try_catchContext ctx)
	{
		var tryBranch=ctx.try_branch;
		var catchBranch=ctx.catch_branch;
		try
		{
			visitBlock(tryBranch);
		}
		catch(Exception tryException)
		{
			try
			{
				visitBlock(catchBranch);
			}
			catch(Exception catchException)
			{
				if(catchException instanceof NuttSuccessReturnException)
					throw catchException;
				throw new RuntimeException("Fail on catch!",catchException);
			}
		}
		return new Nil();
	}

	@Override
	public IValuable visitDemand(Nutt.DemandContext ctx)
	{
		if(!new NuttConditionVisitor().visitDemand(ctx).isTrue())
			throw new RuntimeException("Fail on demand: "+NuttEnvironment.toSourceCode(ctx.exp()));
		return new Nil();
	}

	@Override
	public IValuable visitVar_decl(Nutt.Var_declContext ctx)
	{
		return new NuttDeclarationVisitor().visitVar_decl(ctx);
	}

	@Override
	public IValuable visitFunc_call_exp(Nutt.Func_call_expContext ctx)
	{
		try
		{
			new NuttFunctionVisitor().visitFunc_call_exp(ctx);
			return new Nil();
		}
		catch(NuttSuccessReturnException e)
		{
			return new String(e.getValue());
		}
	}

	@Override public IValuable visitFunctioncall_stat(Nutt.Functioncall_statContext ctx)
	{
		try
		{
			return new NuttFunctionVisitor().runStaticFunction(ctx);
		}
		catch(NuttSuccessReturnException e)
		{
			return new Nil();
		}
	}

	private IValuable forEachOnIListable(IListable listable,String variableName,Nutt.BlockContext ctx)
	{
		var commonExpType=TypeInferencer.getCommonIValuableWrapperType(listable.getElements());
		var varDecl=NuttEnvironment.getTempParser("var %s:%s%n".formatted(variableName,commonExpType)).var_decl();
		new NuttDeclarationVisitor().visit(varDecl);
		IValuable lastValue=new Nil();
		for(var element: listable)
		{
			lastValue=NuttInterpreter.currentScope.setVariable(variableName.getValue(),element).valuable;
			NuttInterpreter.executeBlockAsScope(()->visitBlock(ctx));
		}
		return lastValue;
	}

	//	@Override
	//	public String visitLoopStatement(Nutt.LoopStatementContext ctx)
	//	{
	//		return super.visitLoopStatement(ctx);
	//	}

	private IValuable forEachOnExpList(List<Nutt.ExpContext> expList,String variableName,Nutt.BlockContext block,NuttEvalVisitor evaluator)
	{
		var iteratorDecl="var %s:%s%n".formatted(variableName,TypeInferencer.getTypeTreeRoot());
		new NuttDeclarationVisitor().visit(NuttEnvironment.getTempParser(iteratorDecl).var_decl());
		List<IValuable> valueList=new ArrayList<>();
		for(var exp: expList)
		{
			valueList.add(NuttInterpreter.currentScope.setVariable(variableName.getValue(),evaluator.visit(exp)).valuable);
			NuttInterpreter.executeBlockAsScope(()->visitBlock(block));
		}
		return new Array(valueList);
	}

	public IValuable tryYield(Nutt.BlockContext functionBody,Type expectedType)
	{
		try
		{
			visitBlock(functionBody);
		}
		catch(NuttSuccessReturnException e)
		{
			var yieldedType=e.getValue().getType();
			if(!TypeInferencer.verdict(expectedType,yieldedType))
				throw new RuntimeException("Yielded %s, expected %s".formatted(expectedType,yieldedType));
			NuttInterpreter.forget("yield");
			return e.getValue();
		}
		throw new RuntimeException("Cannot yield from%n`%s`".formatted(NuttEnvironment.toSourceCode(functionBody)));
	}
}