package Nutt.Visitors;

import Nutt.Exceptions.NuttArgumentTypeMismatchException;
import Nutt.Interpreter.References.NuttReference;
import Nutt.NuttEnvironment;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Actionable.Procedure.Procedure;

import java.util.Optional;

import static gen.NuttParser.*;

public class NuttTypeInferenceVisitor extends NuttGenericVisitor
{

	private static String getVariableNameFromContext(Explicit_variableContext ctx)
	{
		return ctx.NAME().getSymbol().getText();
	}

	@Override public NuttReference visitInfix_exp(Infix_expContext ctx)
	{
		System.out.printf("infix_exp: %s%n",NuttEnvironment.toSourceCode(ctx));
		var leftType=visit(ctx.left).getType();
		var rightType=visit(ctx.right).getType();
		var infixOperator=ctx.operator_infix()!=null
		                  ?ctx.operator_infix()
		                  :ctx.explicit_operator().operator_infix();
		var op=leftType.getOperator(NuttEnvironment.toSourceCode(infixOperator))
		               .getValue()
		               .simpleCast(Procedure.class);
		System.out.printf("left: [%s], right: [%s], op: %s%n",leftType,rightType,op);
		var opSignature=op.getSignature();
		String expectedLeftType=opSignature.getInputParameterList().get(0).type(),
				expectedRightType=opSignature.getInputParameterList().get(1).type(),
				expectedOutputType=opSignature.getOutputParameter().type();
		if(!TypeInferencer.verdict(expectedLeftType,leftType))
			throw new NuttArgumentTypeMismatchException(1,expectedLeftType,leftType.toString());
		if(!TypeInferencer.verdict(expectedRightType,rightType))
			throw new NuttArgumentTypeMismatchException(1,expectedRightType,rightType.toString());
		System.out.printf("inferred type: [%s]%n",expectedOutputType);
		return super.visitInfix_exp(ctx);
	}

	@Override
	public NuttReference visitExplist(ExplistContext ctx)
	{
		var expList=ctx.exp();
		if(expList.isEmpty()) return TypeInferencer.findTypeReference("Nil");
		var commonType=visit(expList.get(0));
		if(expList.size()==1) return commonType;
		return expList.stream()
		              .map(this::visit)
		              .reduce(commonType,TypeInferencer::getCommonWrapperType);
	}

	@Override public NuttReference visitAtom(AtomContext ctx)
	{
		if(ctx.number()!=null) return TypeInferencer.findTypeReference(ctx.number().int_()!=null?"Int":"Float");
		if(ctx.string()!=null) return TypeInferencer.findTypeReference("String");
		if(ctx.boolean_()!=null) return TypeInferencer.findTypeReference("Boolean");
		return TypeInferencer.findTypeReference("Nil");
	}

	@Override
	public NuttReference visitString(StringContext ctx)
	{
		return TypeInferencer.findTypeReference("String");
	}

	@Override
	public NuttReference visitFunc_output(Func_outputContext ctx)
	{
		return ctx.type_annotation()==null
		       ?TypeInferencer.findTypeReference("Valuable")
		       :visitType_param(ctx.type_annotation().type_param());
	}

	@Override
	public NuttReference visitType_param(Type_paramContext ctx)
	{
		var name=ctx.flat_type.getText();
		var typeReference=TypeInferencer.findTypeReference(name);
		return Optional.ofNullable(typeReference).orElseThrow(RuntimeException::new);
	}
}