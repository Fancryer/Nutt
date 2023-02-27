package Nutt;

import Nutt.Types.Functional.Listable.String.String;
import Nutt.Types.Functional.Numerable.Float.Float;
import Nutt.Types.Functional.Numerable.INumerable;
import Nutt.Types.Functional.Numerable.Int.Int;
import Nutt.Types.IValuable;
import Nutt.Types.Nil;
import Nutt.Types.TypeCaster;
import com.sun.jdi.InvalidTypeException;
import gen.NuttBaseVisitor;
import gen.NuttParser;

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
		return
				new String(new NuttCompareVisitor(parser,interpreter).visitComparison_expression(ctx).toString());
	}

	@Override
	public IValuable visitStr_cat_expression(NuttParser.Str_cat_expressionContext ctx)
	{
		var l_val=visit(ctx.left).getValue().toString();
		var r_val=visit(ctx.right).getValue().toString();
		return new String(l_val+r_val);
	}

	@Override
	public IValuable visitString(NuttParser.StringContext ctx)
	{
		java.lang.String str;
		if(ctx.NORMALSTRING()!=null) str=ctx.NORMALSTRING().getSymbol().getText();
		else if(ctx.CHARSTRING()!=null) str=ctx.CHARSTRING().getSymbol().getText();
		else if(ctx.LONGSTRING()!=null) str=ctx.LONGSTRING().getSymbol().getText();
		else throw new RuntimeException();
		return new String(NuttCommon.removeLastChar(NuttCommon.removeFirstChar(str)));
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
	public IValuable visitFunctioncall(NuttParser.FunctioncallContext ctx)
	{
		return new NuttFunctionVisitor(parser,interpreter).visitFunctioncall(ctx);
	}

	@Override
	public IValuable visitValuable_output(NuttParser.Valuable_outputContext ctx)
	{
		if(ctx.valuable_type()!=null) return new Nil();
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
		if(ctx.valuable_output()!=null) return visitValuable_output(ctx.valuable_output());
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
		return new NuttFunctionVisitor(parser,interpreter).visitFunc_call_exp(ctx);
	}

	//	@Override
	//	public IValuable visitFunctionCallExp(NuttParser.FunctionCallExpContext ctx)
	//	{
	//		return new Nutt.NuttFunctionVisitor(parser,interpreter).visitFunctionCallExp(ctx);
	//	}

	@Override
	public IValuable visitInstance_of_exp(NuttParser.Instance_of_expContext ctx)
	{
		var ceilType=ctx.type_exp!=null?visit(ctx.type_exp).getType():ctx.type_decl().getText();
		return new String(new TypeInferencer().verdict(ceilType,visit(ctx.to_check).getType()).toString());
	}

	@Override
	public IValuable visitFunction_yield(NuttParser.Function_yieldContext ctx)
	{
		return visit(ctx.exp());
	}

	@Override
	public IValuable visitMath_exp(NuttParser.Math_expContext ctx)
	{
		var op=ctx.operator_math().getText();
		IValuable left=visit(ctx.left), right=visit(ctx.right);

		if(!new TypeInferencer().verdict("Numerable",left.getType()))
		{
			throw new ArithmeticException("Cannot perform '"+op+"': left operand is "+left.getType()+", not Numerable!");
		}
		if(!new TypeInferencer().verdict("Numerable",right.getType()))
		{
			throw new ArithmeticException("Cannot perform '"+op+"': right operand is "+right.getType()+", not Numerable!");
		}
		var l_val=left.asFunctional().asNumerable();
		var r_val=right.asFunctional().asNumerable();
		return switch(op)
				{
					case "+" -> add(l_val,r_val);
					case "-" -> sub(l_val,r_val);
					case "*" -> mult(l_val,r_val);
					case "/" -> div(l_val,r_val);
					case "%" -> mod(l_val,r_val);
					case "//" -> intDiv(l_val,r_val);
					default -> throw new UnsupportedOperationException("Unsupported operation: "+op);
				};
	}

	@Override
	public IValuable visitExplicit_array(NuttParser.Explicit_arrayContext ctx)
	{
		return new NuttArrayVisitor(parser,interpreter).visitExplicit_array(ctx);
	}

	@Override
	public IValuable visitArray_access(NuttParser.Array_accessContext ctx)
	{
		var evaluator=new NuttEvalVisitor(parser,interpreter);
		var interferencer=new TypeInferencer();
		var array=evaluator.visit(ctx.arr);
		if(!interferencer.verdict("Listable",array.getType()))
		{
			throw new RuntimeException(
					new InvalidTypeException("Cannot access element of "+array.getType()+" by index!"));
		}
		var index=evaluator.visit(ctx.index);
		if(!"Int".equals(index.getType()))
		{
			throw new RuntimeException(
					new InvalidTypeException("Cannot access element of array with index of "+index.getType()+" type"+
					                         "!"));
		}
		return array.asFunctional().asListable().getAt(index.asFunctional().asNumerable().asInt());
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
			return interpreter.currentScope.getVariable(variableName).valuable;
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