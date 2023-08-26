package Nutt.Visitors;

import Nutt.Exceptions.*;
import Nutt.Interpreter.NuttInterpreter;
import Nutt.Interpreter.References.AnonymousNuttReference;
import Nutt.Interpreter.References.NilReference;
import Nutt.Interpreter.References.NuttReference;
import Nutt.ModuleLoader;
import Nutt.NuttEnvironment;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.IListable;
import Nutt.Types.Functional.Listable.String.String;
import Nutt.Types.Functional.Numerable.Boolean;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;
import Nutt.Types.Nil;
import com.google.common.collect.Lists;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static Nutt.NuttEnvironment.getTempParser;
import static gen.Nutt.*;

public class NuttStatementVisitor extends NuttGenericVisitor
{
	@Override public NuttReference visitChunk(ChunkContext ctx)
	{
		System.out.println(ctx.module());
		return visitModule(ctx.module());
	}

	@Override public NuttReference visitModule(ModuleContext ctx)
	{
		visitModule_start(ctx.module_start());
		for(var i: ctx.module_import()) visitModule_import(i);
		visitBlock(ctx.block());
		return NilReference.getInstance();
	}

	@Override
	public NuttReference visitModule_start(Module_startContext ctx)
	{
		var moduleName=new ModuleLoader().getFullModuleName(ctx.module_name());
		NuttInterpreter.moduleNames.add(moduleName);
		return new String(moduleName).toAnonymousReference();
	}

	@Override
	public NuttReference visitModule_name(Module_nameContext ctx)
	{
		var packageList=ctx.NAME().stream().map(TerminalNode::getText).toList();
		return AnonymousNuttReference.of(new String(java.lang.String.join("\\\\",packageList)));
	}

	@Override
	public NuttReference visitModule_import(Module_importContext ctx)
	{
		new ModuleLoader().importModuleContext(ctx,this);
		return new String().toAnonymousReference();
	}

	@Override
	public NuttReference visitBlock(BlockContext ctx)
	{
		NuttInterpreter.executeBlockAsScope
				               (
						               ()->
						               {
							               NuttReference ret=NilReference.getInstance();
							               for(var stat: ctx.stat()) ret=visit(stat);
							               return ret;
						               }
				               );
		return new String().toAnonymousReference();
	}

	@Override public NuttReference visitDo_if_stat(Do_if_statContext ctx)
	{
		var cond=VisitorPool.conditionVisitor.visit(ctx.exp()).getValue().simpleCast(Boolean.class).isTrue();
		return cond?visit(ctx.stat()):NilReference.getInstance();
	}

	@Override public NuttReference visitDo_if_not_stat(Do_if_not_statContext ctx)
	{
		var cond=VisitorPool.conditionVisitor.visit(ctx.exp()).getValue().simpleCast(Boolean.class).isTrue();
		return cond?NilReference.getInstance():visit(ctx.stat());
	}

	@Override public NuttReference visitExec_stat(Exec_statContext ctx)
	{
		return visit(getTempParser(new NuttEvalVisitor().visit(ctx.exp()).toString()).stat());
	}

	@Override
	public NuttReference visitFunctiondef_stat(Functiondef_statContext ctx)
	{
		return VisitorPool.declarationVisitor.visitFunctiondef_stat(ctx);
	}

	@Override public NuttReference visitFunctioncall_stat(Functioncall_statContext ctx)
	{
		try
		{
			return VisitorPool.functionVisitor.runStaticFunction(ctx);
		}
		catch(NuttSuccessReturnException e)
		{
			return NilReference.getInstance();
		}
	}

	@Override public NuttReference visitDo_done_block_stat(Do_done_block_statContext ctx)
	{
		return visit(ctx.do_done_block().block());
	}

	@Override public NuttReference visitIf_then_else_block_stat(If_then_else_block_statContext ctx)
	{
		var block=ctx.if_then_else_block();
		var pred=VisitorPool.conditionVisitor.visit(block.exp()).getValue().simpleCast(Boolean.class).isTrue();
		if(pred) return visitBlock(block.then_block().block());
		var elseBlock=block.else_block();
		return elseBlock!=null?visitBlock(elseBlock.block()):new String().toAnonymousReference();
	}

	@Override
	public NuttReference visitType_def_stat(Type_def_statContext ctx)
	{
		var stringExtractor=VisitorPool.stringVisitor;
		var derivedType=stringExtractor.extractTypeName(ctx.type_def().derived_type);
		if(TypeInferencer.hasType(derivedType))
			throw new NuttTypeIsDeclaredException(derivedType);
		var childrenTypes=ctx.type_def().children.type_param().stream().map(NuttEnvironment::toSourceCode).toList();
		var extractedType=stringExtractor.extractTypeName(ctx.type_def().parent_type);
		var parentType=extractedType==null?"Type":extractedType;
		//NuttInterpreter.currentScope.addLocalType(derivedType,parentType,childrenTypes);
		return TypeInferencer.addCustomType(derivedType,parentType,childrenTypes);
	}

	@Override public NuttReference visitRecord_def_stat(Record_def_statContext ctx)
	{
		return VisitorPool.declarationVisitor.visitRecord_def(ctx.record_def());
	}

	@Override public NuttReference visitExit_stat(Exit_statContext ctx)
	{
		throw new NuttExitException();
	}

	@Override public NuttReference visitReturn_stat(Return_statContext ctx)
	{
		throw new NuttSuccessReturnException(VisitorPool.evalVisitor.visit(ctx.function_return().exp()));
	}

	@Override
	public NuttReference visitYield_stat(Yield_statContext ctx)
	{
		throw new NuttSuccessReturnException(VisitorPool.evalVisitor.visit(ctx.function_yield().explist()));
		//return new NuttFunctionVisitor(interpreter).visitFunction_yield();
	}

	@Override
	public NuttReference visitBreak_stat(Break_statContext ctx)
	{
		throw new NuttBreakException();
	}

	@Override
	public NuttReference visitContinue_stat(Continue_statContext ctx)
	{
		throw new NuttContinueException();
	}

	@Override
	public NuttReference visitGroup_assignment(Group_assignmentContext ctx)
	{
		return VisitorPool.assignmentVisitor.visitGroup_assignment(ctx);
	}

	@Override
	public NuttReference visitComposed_assign(Composed_assignContext ctx)
	{
		var variableName=ctx.NAME().getText();
		var operator=NuttEnvironment.toSourceCode(ctx.operator_composed().composed_assign_op().operator_infix());
		Supplier<java.lang.String> normalize=()->"%s=%s%s%s".formatted(
				variableName,variableName,operator,NuttEnvironment.toSourceCode(ctx.operator_composed().exp()));
		return visitGroup_assignment(getTempParser(normalize.get()).group_assignment());
	}

	@Override
	public NuttReference visitSelf_assign(Self_assignContext ctx)
	{
		var variableName=ctx.NAME().getText();
		var firstOp=NuttEnvironment.toSourceCode(ctx.operator_postfix().operator_math(0));
		var secondOp=NuttEnvironment.toSourceCode(ctx.operator_postfix().operator_math(1));
		var postfixOperator=firstOp+secondOp;
		var stepIsOne=postfixOperator.equals("++")||postfixOperator.equals("--");
		var normalize="%s=%s%s%s".formatted(variableName,variableName,firstOp,stepIsOne?"1":variableName);
		return visitGroup_assignment(getTempParser(normalize).group_assignment());
	}

	@Override
	public NuttReference visitForget(ForgetContext ctx)
	{
		if(ctx.KW_All()!=null) NuttInterpreter.forgetAll();
		NuttInterpreter.forgetList(ctx.flat_name_list().NAME().stream().map(ParseTree::getText).toList());
		return NilReference.getInstance();
	}

	@Override
	public NuttReference visitLoop(LoopContext ctx)
	{
		if(ctx.for_each_loop()!=null) return visitFor_each_loop(ctx.for_each_loop());
		if(ctx.while_do_loop()!=null) return visitWhile_do_loop(ctx.while_do_loop());
		if(ctx.repeat_until_loop()!=null) return visitRepeat_until_loop(ctx.repeat_until_loop());
		return super.visitLoop(ctx);
	}

	@Override
	public NuttReference visitFor_each_loop(For_each_loopContext ctx)
	{
		var elementName=new String(ctx.val.getText());
		var bDirectionIsForward=ctx.op_direction().OP_Forward()!=null;
		var expList=bDirectionIsForward?ctx.explist().exp():Lists.reverse(ctx.explist().exp());
		var evaluator=VisitorPool.evalVisitor;
		NuttReference lastValue;
		var block=getTempParser("do %s done".formatted(NuttEnvironment.toSourceCode(ctx.stat()))).block();
		if(expList.size()==1)
		{
			var exp=evaluator.visit(expList.get(0));
			//			if(!TypeInferencer.findTypeReference("Listable").getType().hasChild(exp.getType()))
			//				throw new RuntimeException("Cannot iterate over "+exp.getType());
			//			var listable=exp.getValue().asFunctional().asListable();
			var listable=exp.getValue().spread();
			lastValue=forEachOnIListable
					(
							bDirectionIsForward
							?listable
							:listable.setElements(Lists.reverse(listable.getElements())),
							elementName,
							block
					);
		}
		else lastValue=forEachOnExpList(expList,elementName,block,evaluator);
		NuttInterpreter.currentScope.forgetReference(elementName.toString());
		return lastValue;
	}

	@Override
	public NuttReference visitWhile_do_loop(While_do_loopContext ctx)
	{
		var conditionVisitor=VisitorPool.conditionVisitor;
		var whileBlock=NuttEnvironment.parseWithBound("do ",ctx.stat()," done").block();
		whileLoop:
		while(conditionVisitor.visitExplist(ctx.explist()).getValue().simpleCast(Boolean.class).isTrue())
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
		return new String().toAnonymousReference();
	}

	@Override
	public NuttReference visitTry_catch(Try_catchContext ctx)
	{
		var tryBranch=ctx.try_branch;
		var catchBranch=ctx.catch_branch;
		try
		{
			visit(tryBranch);
		}
		catch(Exception tryException)
		{
			try
			{
				visit(catchBranch);
			}
			catch(Exception catchException)
			{
				if(catchException instanceof NuttSuccessReturnException)
					throw catchException;
				throw new RuntimeException("Fail on catch!",catchException);
			}
		}
		return NilReference.getInstance();
	}

	@Override
	public NuttReference visitDemand(DemandContext ctx)
	{
		if(!VisitorPool.conditionVisitor.visitDemand(ctx).getValue().simpleCast(Boolean.class).isTrue())
			throw new RuntimeException("Fail on demand: "+NuttEnvironment.toSourceCode(ctx.exp()));
		return NilReference.getInstance();
	}

	@Override
	public NuttReference visitVar_decl(Var_declContext ctx)
	{
		return VisitorPool.declarationVisitor.visitVar_decl(ctx);
	}

	@Override public NuttReference visitAlias_decl(Alias_declContext ctx)
	{
		return VisitorPool.declarationVisitor.visitAlias_decl(ctx);
	}

	@Override
	public NuttReference visitFunc_call_exp(Func_call_expContext ctx)
	{
		try
		{
			VisitorPool.functionVisitor.visitFunc_call_exp(ctx);
			return NilReference.getInstance();
		}
		catch(NuttSuccessReturnException e)
		{
			return e.getReference();
		}
	}

	private NuttReference forEachOnIListable(IListable listable,String variableName,BlockContext ctx)
	{
		var commonExpType=TypeInferencer.getCommonIValuableWrapperType(listable.getElements());
		var varDecl=getTempParser("var %s:%s%n".formatted(variableName,commonExpType)).var_decl();
		VisitorPool.declarationVisitor.visit(varDecl);
		IValuable lastValue=new Nil();
		for(var element: listable)
		{
			lastValue=NuttInterpreter.currentScope.setReference(variableName.getValue(),element.getValue()).getValue();
			try
			{
				NuttInterpreter.executeBlockAsScope(()->visitBlock(ctx));
			}
			catch(NuttContinueException e)
			{
				continue;
			}
			catch(NuttBreakException e)
			{
				break;
			}
		}
		return lastValue.toAnonymousReference();
	}

	@Override public NuttReference visitMatch_to_stat(Match_to_statContext ctx)
	{
		return visitMatch_to(ctx.match_to());
	}

	@Override public NuttReference visitMatch_to(Match_toContext ctx)
	{
		var matched=visit(ctx.matched);
		NuttReference lastMatch=null;
		Predicate<Match_branchContext> branchSuits=b->b.explist()
		                                               .exp()
		                                               .stream()
		                                               .anyMatch
				                                               (
						                                               m->NuttInterpreter.applyOperator(visit(m),matched,"===")
						                                                                 .getValue()
						                                                                 .simpleCast(Boolean.class)
						                                                                 .isTrue()
				                                               );
		for(var branch: ctx.match_branch().stream().filter(branchSuits).toList())
		{
			if(branchSuits.test(branch))
			{
				lastMatch=visit(branch.exp());
				if(branch.KW_Final()!=null) break;
			}
		}
		if(lastMatch==null)
		{
			if(ctx.default_match_branch()!=null) lastMatch=visit(ctx.default_match_branch().exp());
			else throw new RuntimeException("Non exhaustive match..to expression");
		}
		return lastMatch;
	}

	//	@Override
	//	public NuttReference visitLoopStatement(Nutt.LoopStatementContext ctx)
	//	{
	//		return super.visitLoopStatement(ctx);
	//	}

	private NuttReference forEachOnExpList(List<ExpContext> expList,String variableName,BlockContext block,NuttEvalVisitor evaluator)
	{
		var iteratorDecl="var %s:%s%n".formatted(variableName,TypeInferencer.getTypeTreeRoot());
		VisitorPool.declarationVisitor.visit(getTempParser(iteratorDecl).var_decl());
		List<NuttReference> valueList=new ArrayList<>();
		for(var exp: expList)
		{
			valueList.add(NuttInterpreter.currentScope.setReference(variableName.getValue(),evaluator.visit(exp).getValue()));
			NuttInterpreter.executeBlockAsScope(()->visitBlock(block));
		}
		return new Array(valueList).toAnonymousReference();
	}

	public NuttReference tryYield(BlockContext functionBody,Type expectedType)
	{
		try
		{
			visitBlock(functionBody);
		}
		catch(NuttSuccessReturnException e)
		{
			var yieldedType=e.getReference().getType();
			if(!TypeInferencer.verdict(TypeInferencer.findTypeReference(expectedType),TypeInferencer.findTypeReference(yieldedType)))
				throw new RuntimeException("Yielded %s, expected %s".formatted(expectedType,yieldedType));
			NuttInterpreter.forget("yield");
			return e.getReference();
		}
		return NilReference.getInstance();
	}
}
