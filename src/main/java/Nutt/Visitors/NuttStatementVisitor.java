package Nutt.Visitors;

import Nutt.Exceptions.*;
import Nutt.Interpreter.ForEachLoop;
import Nutt.Interpreter.NuttInterpreter;
import Nutt.Interpreter.References.AnonymousNuttReference;
import Nutt.Interpreter.References.NilReference;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Interpreter.WhileDoLoop;
import Nutt.ModuleManager.Loader;
import Nutt.NuttEnvironment;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Actionable.Procedure.Procedure;
import Nutt.Types.Functional.Listable.IListable;
import Nutt.Types.Functional.Listable.String.String;
import Nutt.Types.Functional.Numerable.Boolean;
import Nutt.Types.Functional.Numerable.Int.Int;
import Nutt.Types.Functional.Type.Type;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

import static Nutt.NuttEnvironment.getTempParser;
import static Nutt.Visitors.VisitorPool.evalVisitor;
import static gen.NuttParser.*;

public class NuttStatementVisitor extends NuttGenericVisitor
{
	@Override
	public NuttReference visitChunk(ChunkContext ctx)
	{
		return visitChunk(ctx,null);
	}

	public NuttReference visitChunk(ChunkContext ctx,java.lang.String path)
	{
		//System.out.println(ctx.module());
		return visitModule(ctx.module(),path);
	}

	public NuttReference visitModule(ModuleContext ctx,java.lang.String path)
	{
		visitModule_start(ctx.module_start(),path);
		for(var i: ctx.module_import()) visitModule_import(i);
		visitBlock(ctx.block());
		return NilReference.getInstance();
	}

	public NuttReference visitModule_start(Module_startContext ctx,java.lang.String path)
	{
		return new String(Loader.importModule(ctx.NAME().getText())).toAnonymousReference();
	}

	@Override
	public NuttReference visitModule(ModuleContext ctx)
	{
		return visitModule(ctx,null);
	}

	@Override
	public NuttReference visitModule_start(Module_startContext ctx)
	{
		return visitModule_start(ctx,null);
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
		new Loader().importModuleContext(ctx);
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
		var cond=evalVisitor.visit(ctx.exp()).getValueAs(Boolean.class).isTrue();
		return cond?visit(ctx.stat()):NilReference.getInstance();
	}

	@Override public NuttReference visitDo_if_not_stat(Do_if_not_statContext ctx)
	{
		var cond=evalVisitor.visit(ctx.exp()).getValueAs(Boolean.class).isTrue();
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
		var pred=evalVisitor.visit(block.exp()).getValueAs(Boolean.class).isTrue();
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

	/**
	 Visits the return statement in the Nutt language.
	 @param ctx the return statement context
	 @return the Nutt reference of the evaluated expression
	 */
	@Override
	public NuttReference visitReturn_stat(Return_statContext ctx)
	{
		throw new NuttSuccessReturnException(evalVisitor.visit(ctx.function_return().exp()));
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

	@Override public NuttReference visitMatch_to_stat(Match_to_statContext ctx)
	{
		return visitMatch_to(ctx.match_to());
	}

	@Override
	public NuttReference visitGroup_assignment(Group_assignmentContext ctx)
	{
		return VisitorPool.assignmentVisitor.visitGroup_assignment(ctx);
	}

	@Override
	public NuttReference visitComposed_assign(Composed_assignContext ctx)
	{
		NuttReference reciever=evalVisitor.visit(ctx.exp()), value=evalVisitor.visit(ctx.operator_composed().exp());
		return reciever.setValue
				               (
						               reciever.getType()
						                       .getOperator
								                       (
										                       NuttEnvironment.toSourceCode(ctx.operator_composed()
										                                                       .composed_assign_op()
										                                                       .operator_infix())
								                       )
						                       .getValueAs(Procedure.class)
						                       .proceed(List.of(reciever,value))
						                       .getValue()
				               );
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
		return new ForEachLoop(ctx.exp(),ctx.stat(),ctx.ind.getText(),ctx.val.getText(),ctx.op_direction().OP_Forward()!=null).run();
	}

	private NuttReference forEachOnIListable(IListable listable,java.lang.String indexName,java.lang.String variableName,BlockContext ctx)
	{
		var commonExpType=TypeInferencer.getCommonIValuableWrapperType(listable.getElements());
		Var_declContext varDecl=getTempParser("var %s:%s%n".formatted(variableName,commonExpType)).var_decl();
		VisitorPool.declarationVisitor.visit(varDecl);
		boolean useIndex=!Objects.equals(indexName,"_");
		if(useIndex)
		{
			Var_declContext indDecl=getTempParser("var %s:Int%n".formatted(indexName)).var_decl();
			VisitorPool.declarationVisitor.visit(indDecl);
		}
		NuttReference lastReference=NilReference.getInstance();
		int i=0;
		for(var element: listable)
		{
			if(useIndex)
			{
				NuttInterpreter.currentScope.setReference(indexName,new Int(i++));
				System.out.println(NuttInterpreter.getReference(indexName).getValue());
			}
			lastReference=NuttInterpreter.currentScope.setReference(variableName,element.getValue());
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
		return lastReference;
	}

	@Override
	public NuttReference visitWhile_do_loop(While_do_loopContext ctx)
	{
		return new WhileDoLoop(ctx.exp(),ctx.stat()).run();
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
		if(!VisitorPool.conditionVisitor.visitDemand(ctx).getValueAs(Boolean.class).isTrue())
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

	public NuttReference tryReturn(BlockContext functionBody,Type expectedType)
	{
		try
		{
			visitBlock(functionBody);
		}
		catch(NuttSuccessReturnException e)
		{
			var returnedType=e.getReference().getType();
			if(!TypeInferencer.verdict(TypeInferencer.findTypeReference(expectedType),TypeInferencer.findTypeReference(returnedType)))
				throw new RuntimeException("Returned %s, expected %s".formatted(expectedType,returnedType));
			NuttInterpreter.forget("return");
			return e.getReference();
		}
		return NilReference.getInstance();
	}
}
