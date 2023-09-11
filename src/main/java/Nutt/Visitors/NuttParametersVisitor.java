package Nutt.Visitors;

import Nutt.Interpreter.References.NuttReference;
import Nutt.NuttEnvironment;

import java.util.List;

import static Nutt.Interpreter.NuttInterpreter.getReference;
import static Nutt.Visitors.VisitorPool.declarationVisitor;
import static gen.NuttParser.*;

public class NuttParametersVisitor extends NuttGenericVisitor
{
	public List<NuttReference> visitParameters(Var_signature_listContext ctx)
	{
		return ctx.vararg_or_signature()
		          .stream()
		          .map(v->getReference(declarationVisitor.visitVar_decl(funcParamToVarDecl(v)).toString()))
		          .toList();
	}

	public static Var_declContext funcParamToVarDecl(Vararg_or_signatureContext ctx)
	{
		return NuttEnvironment.getTempParser("var"+NuttEnvironment.toSourceCode(ctx)).var_decl();
	}
}