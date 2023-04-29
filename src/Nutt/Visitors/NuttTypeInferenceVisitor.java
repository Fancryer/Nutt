package Nutt.Visitors;

import Nutt.NuttInterpreter;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Type.IType;
import gen.NuttParser;

import java.util.function.Function;

public class NuttTypeInferenceVisitor extends NuttGenericVisitor
{
	//@Override
	//public Type visitType_decl(Token ctx)
	//	{
	//		if(ctx==null) return TypeInferencer.findType("Nil");
	//		if(ctx.list_decl()!=null) return getListableType(ctx.list_decl());
	//		if(ctx.action_decl()!=null) return getActionType(ctx.action_decl());
	//		return TypeInferencer.findType(ctx.NAME().getText());
	//	}

	private static String getVariableNameFromContext(NuttParser.Explicit_variableContext ctx)
	{
		return ctx.NAME().getSymbol().getText();
	}

	@Override
	public IType visitExplist(NuttParser.ExplistContext ctx)
	{
		var expList=ctx.exp();
		if(expList.isEmpty()) return TypeInferencer.findType("Nil");
		var evaluator=new NuttEvalVisitor();
		Function<NuttParser.ExpContext,IType> inferType=e->evaluator.visit(e).getType();
		var commonType=inferType.apply(expList.get(0));
		if(expList.size()==1) return commonType;
		for(var exp: ctx.exp()) commonType=TypeInferencer.getCommonWrapperType(commonType,inferType.apply(exp));
		System.out.println("expList common type is "+commonType);
		return commonType;
	}

	@Override
	public IType visitNumber(NuttParser.NumberContext ctx)
	{
		if(ctx.Int()!=null||ctx.HexInt()!=null) return TypeInferencer.findType("Int");
		if(ctx.Float()!=null||ctx.HexFloat()!=null) return TypeInferencer.findType("Float");
		throw new RuntimeException("Wrong numerable literal: "+ctx.getText());
	}

	@Override
	public IType visitString(NuttParser.StringContext ctx)
	{
		return TypeInferencer.findType("String");
	}

	@Override
	public IType visitType_param(NuttParser.Type_paramContext ctx)
	{
		var name=ctx.flat_type.getText();
		var inferenced=TypeInferencer.findType(name);
		if(inferenced!=null) return inferenced;
		var valuable=NuttInterpreter.currentScope.getValuable(name);
		if(TypeInferencer.verdict("Record",valuable.getType())) return valuable.getType();
		throw new RuntimeException();
	}

	@Override
	public IType visitFunc_output(NuttParser.Func_outputContext ctx)
	{
		return ctx.by_type_var_decl()==null
		       ?TypeInferencer.findType("Valuable")
		       :visitType_param(ctx.by_type_var_decl().type_param());
	}
}