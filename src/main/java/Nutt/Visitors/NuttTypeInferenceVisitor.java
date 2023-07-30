package Nutt.Visitors;

import Nutt.Interpreter.References.NuttReference;
import Nutt.TypeInferencer;
import gen.Nutt;

import java.util.Optional;

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

	private static String getVariableNameFromContext(Nutt.Explicit_variableContext ctx)
	{
		return ctx.NAME().getSymbol().getText();
	}

	@Override
	public NuttReference visitExplist(Nutt.ExplistContext ctx)
	{
		var expList=ctx.exp();
		if(expList.isEmpty()) return TypeInferencer.findTypeReference("Nil");
		var commonType=visit(expList.get(0));
		if(expList.size()==1) return commonType;
		return expList.stream()
		              .map(this::visit)
		              .reduce(commonType,TypeInferencer::getCommonWrapperType);
	}

	@Override public NuttReference visitAtom(Nutt.AtomContext ctx)
	{
		if(ctx.number()!=null) return TypeInferencer.findTypeReference(ctx.number().int_()!=null?"Int":"Float");
		if(ctx.string()!=null) return TypeInferencer.findTypeReference("String");
		if(ctx.boolean_()!=null) return TypeInferencer.findTypeReference("Boolean");
		return TypeInferencer.findTypeReference("Nil");
	}

	@Override
	public NuttReference visitString(Nutt.StringContext ctx)
	{
		return TypeInferencer.findTypeReference("String");
	}

	@Override
	public NuttReference visitFunc_output(Nutt.Func_outputContext ctx)
	{
		return ctx.by_type_var_decl()==null
		       ?TypeInferencer.findTypeReference("Valuable")
		       :visitType_param(ctx.by_type_var_decl().type_param());
	}

	@Override
	public NuttReference visitType_param(Nutt.Type_paramContext ctx)
	{
		var name=ctx.flat_type.getText();
		var typeReference=TypeInferencer.findTypeReference(name);
		return Optional.ofNullable(typeReference).orElseThrow(RuntimeException::new);
	}
}