//package Nutt.Visitors;
//
//import Nutt.TypeInferencer;
//import Nutt.Types.Functional.Type.Type;
//import gen.Nutt;
//
//import java.util.function.Function;
//
//public class NuttTypeInferenceVisitor extends NuttGenericVisitor<Type>
//{
//	//@Override
//	//public Type visitType_decl(Token ctx)
//	//	{
//	//		if(ctx==null) return TypeInferencer.findType("Nil");
//	//		if(ctx.list_decl()!=null) return getListableType(ctx.list_decl());
//	//		if(ctx.action_decl()!=null) return getActionType(ctx.action_decl());
//	//		return TypeInferencer.findType(ctx.NAME().getText());
//	//	}
//
//	private static String getVariableNameFromContext(Nutt.Explicit_variableContext ctx)
//	{
//		return ctx.NAME().getSymbol().getText();
//	}
//
//	@Override
//	public Type visitExplist(Nutt.ExplistContext ctx)
//	{
//		var expList=ctx.exp();
//		if(expList.isEmpty()) return TypeInferencer.findType("Nil");
//		var evaluator=VisitorsPool.evalVisitor;
//		Function<Nutt.ExpContext,Type> inferType=e->evaluator.visit(e).getType();
//		var commonType=inferType.apply(expList.get(0));
//		if(expList.size()==1) return commonType;
//		for(var exp: ctx.exp()) commonType=TypeInferencer.getCommonWrapperType(commonType,inferType.apply(exp));
//		System.out.println("expList common type is "+commonType);
//		return commonType;
//	}
//
//	@Override
//	public Type visitNumber(Nutt.NumberContext ctx)
//	{
//		return TypeInferencer.findType(ctx.int_()!=null?"Int":"Float");
//	}
//
//	@Override
//	public Type visitString(Nutt.StringContext ctx)
//	{
//		return TypeInferencer.findType("String");
//	}
//
//	@Override
//	public Type visitType_param(Nutt.Type_paramContext ctx)
//	{
//		var name=ctx.flat_type.getText();
//		var inferenced=TypeInferencer.findType(name);
//		if(inferenced!=null) return inferenced;
//		//		var valuable=NuttInterpreter.currentScope.getValuable(name);
//		//		if(TypeInferencer.verdict("Record",valuable.getType())) return valuable.getType();
//		//return ;
//		throw new RuntimeException();
//	}
//
//	@Override
//	public Type visitFunc_output(Nutt.Func_outputContext ctx)
//	{
//		return ctx.by_type_var_decl()==null
//		       ?TypeInferencer.findType("Valuable")
//		       :visitType_param(ctx.by_type_var_decl().type_param());
//	}
//}