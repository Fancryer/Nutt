package Nutt;

import Nutt.Types.Functional.Actionable.Procedure.Procedure;
import Nutt.Types.Functional.Listable.String.String;
import Nutt.Types.Functional.Numerable.Float.Float;
import Nutt.Types.Functional.Numerable.INumerable;
import Nutt.Types.Functional.Numerable.Int.Int;
import Nutt.Types.IValuable;
import Nutt.Types.Nil;
import Nutt.Types.TypeCaster;
import gen.NuttBaseVisitor;
import gen.NuttParser;

import java.util.ArrayList;
import java.util.List;

import static Nutt.Types.Functional.Numerable.INumerable.*;

public class NuttEvalVisitor extends NuttBaseVisitor<IValuable>
{
	NuttParser parser;
	NuttInterpreter interpreter;
	boolean debug;
	
	public NuttEvalVisitor(NuttParser parser,NuttInterpreter interpreter)
	{
		this(parser,interpreter,false);
	}
	
	public NuttEvalVisitor(NuttParser parser,NuttInterpreter interpreter,boolean debug)
	{
		this.parser=parser;
		this.interpreter=interpreter;
		this.debug=debug;
	}
	
	@Override
	public IValuable visitComparison_expression(NuttParser.Comparison_expressionContext ctx)
	{
		return new String(new NuttCompareVisitor(parser,interpreter).visitComparison_expression(ctx).toString());
	}
	
	@Override
	public IValuable visitStr_cat_expression(NuttParser.Str_cat_expressionContext ctx)
	{
		var l_val=visit(ctx.left).getValue().toString();
		var r_val=visit(ctx.right).getValue().toString();
		return new String(l_val+r_val);
	}
	
	@Override
	public IValuable visitVarExpOrPar(NuttParser.VarExpOrParContext ctx)
	{
		if(ctx.var()!=null) return visitVar(ctx.var());
		if(ctx.exp()!=null) return visit(ctx.exp());
		if(ctx.parExp()!=null) return visitParExp(ctx.parExp());
		throw new RuntimeException("Unknown varExpOrPar!");
	}
	
	@Override
	public IValuable visitString(NuttParser.StringContext ctx)
	{
		var stringContent=new java.lang.StringBuilder(ctx.getText());
		stringContent.deleteCharAt(0).deleteCharAt(stringContent.length()-1);
		var inferred=new String(stringContent.toString());
		if(debug) System.out.println(inferred);
		return inferred;
	}
	
	@Override
	public IValuable visitUnary_expression(NuttParser.Unary_expressionContext ctx)
	{
		var op=ctx.operatorUnary();
		var value=visit(ctx.exp());
		var valueIsNumerable=new TypeInferencer().verdict("Numerable",value.getType());
		if(op.OP_Sub()!=null)
		{
			if(!valueIsNumerable)
			{
				throw new ArithmeticException("Cannot negate a "+value.getType());
			}
			var res=INumerable.negate(value.asFunctional().asNumerable());
			if(debug) System.out.println(res.getValue());
			return res;
		}
		if(op.OP_Add()!=null)
		{
			if(!valueIsNumerable)
			{
				throw new ArithmeticException("Cannot abs a "+value.getType());
			}
			var res=INumerable.abs(value.asFunctional().asNumerable());
			if(debug) System.out.println(res.getValue());
			return res;
		}
		if(op.OP_Tilda()!=null)
		{
			if(!valueIsNumerable)
			{
				throw new ArithmeticException("Cannot abs a "+value.getType());
			}
			var res=INumerable.bitSwap(value.asFunctional().asNumerable());
			if(debug) System.out.println(res.getValue());
			return res;
		}
		if(op.OP_Length()!=null)
		{
			var res=new Int(java.lang.String.valueOf(value.getLength()));
			if(debug) System.out.println(res.getValue());
			return res;
		}
		if(op.OP_Not()!=null)
		{
			var res=new String(
					java.lang.String.valueOf(!new NuttConditionVisitor(parser,interpreter).visit(ctx.exp())));
			if(debug) System.out.println(res.getValue());
			return res;
		}
		throw new UnsupportedOperationException();
	}
	
	@Override
	public IValuable visitType_of_exp(NuttParser.Type_of_expContext ctx)
	{
		return new String(visit(ctx.exp()).getType());
	}
	
	@Override
	public IValuable visitExplicit_atom(NuttParser.Explicit_atomContext ctx)
	{
		var atom=ctx.atom();
		if(atom.number()!=null)
		{
			return visitNumber(atom.number());
		}
		if(atom.string()!=null)
		{
			return visitString(atom.string());
		}
		if(atom.explicit_bool()!=null)
		{
			return new String(Boolean.toString(atom.explicit_bool().KW_True()!=null));
		}
		if(atom.explicit_nil()!=null)
		{
			return new Nil();
		}
		throw new RuntimeException();
	}
	
	@Override
	public IValuable visitParExp(NuttParser.ParExpContext ctx)
	{
		return visit(ctx.exp());
	}
	
	@Override
	public IValuable visitFunctioncall(NuttParser.FunctioncallContext ctx)
	{
		return new NuttFunctionVisitor(parser,interpreter).visitFunctioncall(ctx);
	}
	
	@Override
	public IValuable visitEither_output(NuttParser.Either_outputContext ctx)
	{
		if(ctx.either_type()!=null) return new Nil();
		throw new RuntimeException();
	}
	
	@Override
	public IValuable visitDefault_output(NuttParser.Default_outputContext ctx)
	{
		var type=ctx.type_decl();
		if(type.nil_type()!=null) return new Nil();
		return super.visitDefault_output(ctx);
	}
	
	@Override
	public IValuable visitFunc_output(NuttParser.Func_outputContext ctx)
	{
		if(ctx.either_output()!=null) return visitEither_output(ctx.either_output());
		if(ctx.default_output()!=null) return visitDefault_output(ctx.default_output());
		throw new RuntimeException();
	}
	
	@Override
	public IValuable visitIf_then_else_block(NuttParser.If_then_else_blockContext ctx)
	{
		///return new NuttStatementVisitor(parser,interpreter);
		return new Nil();
	}
	
	@Override
	public IValuable visitFunc_call_exp(NuttParser.Func_call_expContext ctx)
	{
		var procedureInstance=interpreter.getProcedure(ctx.funcname().getText()).setEnvironment(parser,interpreter);
		List<IValuable> passedParameters=ctx.arguments==null?new ArrayList<>():
		                                 ctx.arguments.varExpOrPar().stream().map(this::visitVarExpOrPar).toList();
		return new Procedure(procedureInstance).proceed(passedParameters).yield();
	}
	
	//	@Override
	//	public IValuable visitFunctionCallExp(NuttParser.FunctionCallExpContext ctx)
	//	{
	//		return new Nutt.NuttFunctionVisitor(parser,interpreter).visitFunctionCallExp(ctx);
	//	}
	
	
	@Override
	public IValuable visitFunction_yield(NuttParser.Function_yieldContext ctx)
	{
		return visit(ctx.exp());
	}
	
	@Override
	public IValuable visitMath_exp(NuttParser.Math_expContext ctx)
	{
		var op=ctx.operator_math();
		IValuable left=visit(ctx.left), right=visit(ctx.right);
		if(!new TypeInferencer().verdict("Numerable",left.getType()))
		{
			var fmt="left operator is %s, not Numerable!".formatted(left.getType());
			throw new RuntimeException(fmt);
		}
		if(!new TypeInferencer().verdict("Numerable",right.getType()))
		{
			var fmt="right operator is %s, not Numerable!".formatted(right.getType());
			throw new RuntimeException(fmt);
		}
		var l_val=left.asFunctional().asNumerable();
		var r_val=right.asFunctional().asNumerable();
		if(op.OP_Add()!=null) return add(l_val,r_val);
		if(op.OP_Sub()!=null) return sub(l_val,r_val);
		if(op.OP_Mult()!=null) return mult(l_val,r_val);
		if(op.OP_Div()!=null) return div(l_val,r_val);
		if(op.OP_Mod()!=null) return mod(l_val,r_val);
		if(op.OP_IntDiv()!=null) return intDiv(l_val,r_val);
		throw new UnsupportedOperationException("Unsupported operation: "+op.getText());
	}
	
	private boolean isNumber(IValuable valuable)
	{
		return new TypeInferencer().verdict("Numerable",valuable.getType());
	}
	
	@Override
	public IValuable visitNumber(NuttParser.NumberContext ctx)
	{
		IValuable valuable=null;
		if(ctx.INT()!=null) valuable=new Int(ctx.INT().getText());
		if(ctx.HEX()!=null) valuable=new Int(ctx.HEX().getText());
		if(ctx.FLOAT()!=null) valuable=new Float(ctx.FLOAT().getText());
		if(ctx.HEX_FLOAT()!=null) valuable=new Float(ctx.HEX_FLOAT().getText());
		if(valuable==null) throw new RuntimeException("Wrong numerable literal: "+ctx.getText());
		return valuable;
	}
	
	@Override
	public IValuable visitType_cast(NuttParser.Type_castContext ctx)
	{
		var value=visit(ctx.exp());
		var oldType=value.getType();
		var typeToCast=new NuttTypeInferenceVisitor(parser,interpreter).visitType_decl(ctx.type_decl());
		if(!new TypeInferencer().verdict(oldType,typeToCast))
		{
			throw new ClassCastException("%s cannot be casted to %s".formatted(oldType,typeToCast));
		}
		return TypeCaster.cast(value,typeToCast);
	}
	
	@Override
	public IValuable visitVar(NuttParser.VarContext ctx)
	{
		java.lang.String variableName;
		if(ctx.NAME()!=null)
		{
			variableName=ctx.NAME().getSymbol().getText();
			if(debug) System.out.println("Variable visited: "+variableName);
			return interpreter.getValuable(variableName);
		}
		throw new RuntimeException();
	}
	
	@Override
	public IValuable visitParenthesis_exp(NuttParser.Parenthesis_expContext ctx)
	{
		return visit(ctx.exp());
	}
	
	@Override
	public IValuable visitExplicit_variable(NuttParser.Explicit_variableContext ctx)
	{
		return interpreter.getValuable(ctx.var().NAME().getSymbol().getText());
	}
	
	@Override
	public IValuable visitLogical_exp(NuttParser.Logical_expContext ctx)
	{
		return new String(new NuttConditionVisitor(parser,interpreter).visitLogical_exp(ctx).toString());
	}
}