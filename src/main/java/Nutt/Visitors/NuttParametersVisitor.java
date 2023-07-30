//package Nutt.Visitors;
//
//import Nutt.NuttEnvironment;
//import Nutt.NuttInterpreter;
//import Nutt.Types.IValuable;
//import gen.Nutt.Var_declContext;
//import gen.Nutt.Var_signature_listContext;
//
//import java.util.List;
//
//import static gen.Nutt.Vararg_or_signatureContext;
//
//public class NuttParametersVisitor extends NuttGenericVisitor<IValuable>
//{
//	public static Var_declContext funcParamToVarDecl(Vararg_or_signatureContext ctx)
//	{
//		return NuttEnvironment.getTempParser("var"+NuttEnvironment.toSourceCode(ctx)).var_decl();
//	}
//
//	public List<NuttInterpreter.Variable> visitParameters(Var_signature_listContext ctx)
//	{
//		var declarator=VisitorsPool.declarationVisitor;
//		return ctx.vararg_or_signature()
//		          .stream()
//		          .map(v->NuttInterpreter.getVariable(declarator.visitVar_decl(funcParamToVarDecl(v)).toString()))
//		          .toList();
//	}
//}