package Nutt;

import Nutt.Types.Functional.Numerable.INumerable;
import gen.NuttBaseVisitor;
import gen.NuttLexer;
import gen.NuttParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class NuttStatementVisitor extends NuttBaseVisitor<String>
{
	NuttParser parser;
	NuttInterpreter interpreter;
	boolean debug;

	String moduleName;

	public NuttStatementVisitor(NuttParser parser,NuttInterpreter interpreter)
	{
		this(parser,interpreter,false);
	}

	public NuttStatementVisitor(NuttParser parser,NuttInterpreter interpreter,boolean debug)
	{
		this.parser=parser;
		this.interpreter=interpreter;
		this.debug=debug;
	}

	@Override public String visitMacro(NuttParser.MacroContext ctx)
	{
		return super.visitMacro(ctx);
	}

	@Override
	public String visit(ParseTree tree)
	{
		//System.out.println(NuttEnvironment.toSourceCode(tree));
		return super.visit(tree);
	}

	@Override public String visitIn_place_op_stat(NuttParser.In_place_op_statContext ctx)
	{
		var evaluator=new NuttEvalVisitor(parser,interpreter);
		var variableName=new NuttVariableVisitor(parser,interpreter).visitVar(ctx.var());
		var valuable=evaluator.visit(ctx.varExpOrPar());
		var op=ctx.in_place_op();
		var typeInferencer=new TypeInferencer();
		var varType=interpreter.getValuable(variableName).getType();
		var valType=valuable.getType();
		if(!typeInferencer.verdict(interpreter.getValuable(variableName).getWrapType(),valuable.getType()))
		{
			throw new UnsupportedOperationException("Cannot perform %s on %s and %s".formatted(op,varType,valType));
		}
		Supplier<String> normalize=
				()->variableName+op.getText().substring(0,op.getText().length()-1)+valuable.getValue();

		String valueToAssign="";
		String requiredType=null;

		var isNumerableRequired=
				Stream.of(op.OP_AddAssign(),op.OP_SubAssign(),op.OP_MultAssign(),op.OP_DivAssign(),op.OP_ModAssign(),
				          op.OP_IntDivAssign()).anyMatch(Objects::nonNull);

		if(op.OP_CatAssign()!=null)
		{
			requiredType="String";
		}

		else if(isNumerableRequired)
		{
			requiredType="Numerable";
		}

		if(requiredType==null) throw new UnsupportedOperationException();


		if(!typeInferencer.verdict(requiredType,interpreter.getValuable(variableName).getType()))
		{
			throw new UnsupportedOperationException("Cannot perform %s on %s and %s".formatted(op.getText(),
			                                                                                   varType,valType));
		}

		var l_lexer=new NuttLexer(CharStreams.fromString(normalize.get()));
		var l_tokens=new CommonTokenStream(l_lexer);
		var l_parser=new NuttParser(l_tokens);
		interpreter.getVariable(variableName).valuable=evaluator.visit(l_parser.varExpOrPar());
		return variableName;
	}

	@Override
	public String visitModule(NuttParser.ModuleContext ctx)
	{
		return super.visitModule(ctx);
	}


	@Override
	public String visitModule_start(NuttParser.Module_startContext ctx)
	{
		if(ctx.module_name()!=null)
		{
			moduleName=visitModule_name(ctx.module_name());
			if(debug) System.out.printf("Started module %s%n",moduleName);
			return moduleName;
		}
		throw new RuntimeException();
	}

	@Override
	public String visitModule_name(NuttParser.Module_nameContext ctx)
	{
		return String.join("",ctx.NAME().stream().map(term->term.getSymbol().getText()).toList());
	}

	@Override
	public String visitSelf_in_place_op_stat(NuttParser.Self_in_place_op_statContext ctx)
	{
		var variableName=new NuttVariableVisitor(parser,interpreter).visitVar(ctx.var());
		var variableRef=interpreter.getVariable(variableName);
		var op=ctx.self_in_place_op();
		if(op.OP_IncrAssign()!=null)
		{
			if(new TypeInferencer().verdict("Numerable",variableRef.valuable.getType()))
			{
				variableRef.valuable=INumerable.incr(variableRef.valuable.asFunctional().asNumerable());
				return "";
			}
		}
		if(op.OP_DecrAssign()!=null)
		{
			if(new TypeInferencer().verdict("Numerable",variableRef.valuable.getType()))
			{
				variableRef.valuable=INumerable.decr( variableRef.valuable.asFunctional().asNumerable());
				return "";
			}
		}
		return "";
	}

	@Override
	public String visitModule_import(NuttParser.Module_importContext ctx)
	{
		String modulesCompact;
		if(ctx.module_name()!=null) modulesCompact=Set.of(visitModule_name(ctx.module_name())).toString();
		else
		{
			if(ctx.module_list()!=null) modulesCompact=visitModule_list(ctx.module_list());
			else
			{
				if(ctx.KW_ALL()!=null) modulesCompact="all";
				else throw new RuntimeException();
			}
		}
		if(debug) System.out.printf("\"Imported\" modules: %s%n",modulesCompact);
		return super.visitModule_import(ctx);
	}

	@Override
	public String visitModule_list(NuttParser.Module_listContext ctx)
	{
		var modules=ctx.module_name().stream().map(this::visitModule_name).toList();
		return new HashSet<>(modules).toString();
	}

	@Override
	public String visitGroup_assignment(NuttParser.Group_assignmentContext ctx)
	{
		return new NuttAssignmentVisitor(parser,interpreter,debug).visitGroup_assignment(ctx);
	}

	@Override public String visitVar_decl(NuttParser.Var_declContext ctx)
	{
		if(debug) System.out.printf("Variable declaration: %s%n",ctx.var_header().NAME().getText());
		return new NuttDeclarationVisitor(parser,interpreter,debug).visitVar_decl(ctx);
	}

	@Override
	public String visitForget(NuttParser.ForgetContext ctx)
	{
		if(ctx.KW_ALL()!=null) interpreter.forgetAll();
		if(ctx.flat_name_list()!=null) visitFlat_name_list(ctx.flat_name_list());
		return super.visitForget(ctx);
	}

	@Override
	public String visitFlat_name_list(NuttParser.Flat_name_listContext ctx)
	{
		for(var toForget: ctx.NAME()) interpreter.currentScope.forgetVariable(toForget.getSymbol().getText());
		return "";
	}

	@Override
	public String visitFunctioncall(NuttParser.FunctioncallContext ctx)
	{
		return new NuttFunctionVisitor(parser,interpreter).visitFunctioncall(ctx).getValue().toString();
	}

	@Override
	public String visitReverseForLoop(NuttParser.ReverseForLoopContext ctx)
	{
		//for var i=init,boundary,step do
		//  block
		//done

		//1) define variable i and assign init to it - DeclarationVisitor
		var counterName=ctx.for_loop().var_header().NAME().getText();
		new NuttDeclarationVisitor(parser,interpreter).visitBy_value_var_decl(ctx.for_loop().by_value_var_decl());
		//2) define boundary on each iteration - EvalVisitor
		for(;;)
		{
			break;
			//interpreter.getValuable(counterName).getType()
			//3) visit block - StatementVisitor
			//visit(ctx.for_loop().block());
			//4) decrement i by 1 - EvalVisitor
		}
		//5) forget i
		interpreter.currentScope.forgetVariable(counterName);
		return super.visitReverseForLoop(ctx);
	}

	//	@Override
	//	public String visitLabelDeclaring(NuttParser.LabelDeclaringContext ctx)
	//	{
	//		return super.visitLabelDeclaring(ctx);
	//	}
	//
	//	@Override
	//	public String visitBreak(NuttParser.BreakContext ctx)
	//	{
	//		return super.visitBreak(ctx);
	//	}
	//
	//	@Override
	//	public String visitGoTo(NuttParser.GoToContext ctx)
	//	{
	//		return super.visitGoTo(ctx);
	//	}

	@Override
	public String visitWhile_do_loop(NuttParser.While_do_loopContext ctx)
	{
		Function<NuttParser.VarExpOrParContext,Boolean> visitExp=
				exp->new NuttConditionVisitor(parser,interpreter).visit(exp);
		Function<List<Boolean>,Boolean> allIsTrue=(list)->list.stream().allMatch(Boolean::valueOf);
		Function<List<NuttParser.VarExpOrParContext>,List<Boolean>> evalAsBoolList=(expList)->expList.stream()
		                                                                                             .map(visitExp)
		                                                                                             .toList();
		while(allIsTrue.apply(evalAsBoolList.apply(ctx.explist().varExpOrPar())))
		{
			visitBlock(ctx.do_done_block().block());
		}
		return "";
	}

	@Override public String visitDemand(NuttParser.DemandContext ctx)
	{
		if(!new NuttConditionVisitor(parser,interpreter).visitDemand(ctx))
		{
			throw new AssertionError("Fail on demand: "+ctx.exp().toStringTree(parser));
		}
		return "";
	}

	@Override
	public String visitBlock(NuttParser.BlockContext ctx)
	{
		//System.out.println(interpreter.currentScope);
		var oldScope=interpreter.currentScope;
		interpreter.setScope(interpreter.createScope());
		for(var stat:ctx.stat())
		{
			visit(stat);
		}
		interpreter.setScope(oldScope);
		return "";
	}

	@Override public String visitFunction_yield(NuttParser.Function_yieldContext ctx)
	{
		//interpreter.currentScope.yield.valuable=new NuttEvalVisitor(parser,interpreter).visit(ctx.exp());
		interpreter.currentScope.setVariable("yield",new NuttEvalVisitor(parser,interpreter).visit(ctx.exp()));
		return "";
	}

	@Override
	public String visitIf_then_else_block(NuttParser.If_then_else_blockContext ctx)
	{
		var cond=new NuttConditionVisitor(parser,interpreter).visit(ctx.exp());
		if(debug) System.out.println(cond);
		if(cond) return visitBlock(ctx.then_block().block());
		if(ctx.else_block()!=null) return visitBlock(ctx.else_block().block());
		return "";
	}

	//	@Override
	//	public String visitLoopStatement(NuttParser.LoopStatementContext ctx)
	//	{
	//		return super.visitLoopStatement(ctx);
	//	}

	@Override
	public String visitFunctiondef_stat(NuttParser.Functiondef_statContext ctx)
	{
		return new NuttDeclarationVisitor(parser,interpreter).visitFunctiondef_stat(ctx);
	}


	@Override
	public String visitFunc_call_exp(NuttParser.Func_call_expContext ctx)
	{
		return super.visitFunc_call_exp(ctx);
	}

	//	@Override
	//	public String visitLocalFunct(NuttParser.LocalFunctContext ctx)
	//	{
	//		return super.visitLocalFunct(ctx);
	//	}
	//
	//	@Override
	//	public String visitLocalVar(NuttParser.LocalVarContext ctx)
	//	{
	//		return super.visitLocalVar(ctx);
	//	}
}
