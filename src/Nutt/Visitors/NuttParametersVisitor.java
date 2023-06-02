package Nutt.Visitors;

import Nutt.NuttEnvironment;
import Nutt.NuttInterpreter;
import Nutt.Types.IValuable;
import gen.Nutt;

import java.util.List;

public class NuttParametersVisitor extends NuttGenericVisitor<IValuable>
{
	public static Nutt.Var_declContext funcParamToVarDecl(Nutt.Var_signatureContext ctx)
	{
		return NuttEnvironment.getTempParser("var"+NuttEnvironment.toSourceCode(ctx)).var_decl();
	}

	public List<NuttInterpreter.Variable> visitParameters(Nutt.Var_signature_listContext ctx)
	{
		var declarator=new NuttDeclarationVisitor();
		return ctx.var_signature()
		          .stream()
		          .map(v->NuttInterpreter.getVariable(declarator.visitVar_decl(funcParamToVarDecl(v)).toString()))
		          .toList();
	}
}