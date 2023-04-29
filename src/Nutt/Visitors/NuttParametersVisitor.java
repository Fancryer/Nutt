package Nutt.Visitors;

import Nutt.NuttEnvironment;
import Nutt.NuttInterpreter;
import gen.NuttParser;

import java.util.List;

public class NuttParametersVisitor extends NuttGenericVisitor
{
	public static NuttParser.Var_declContext funcParamToVarDecl(NuttParser.Func_paramContext ctx)
	{
		var declPrefix=ctx.func_param_header().constant_qualifier()==null?"var ":"";
		return NuttEnvironment.getTempParser(declPrefix+NuttEnvironment.toSourceCode(ctx)).var_decl();
	}


	public List<NuttInterpreter.Variable> visitParameters(NuttParser.Func_parametersContext ctx)
	{
		var declarator=new NuttDeclarationVisitor();
		return ctx.func_param_list()
		          .func_param()
		          .stream()
		          .map(v->NuttInterpreter.getVariable(declarator.visitVar_decl(funcParamToVarDecl(v)).toString()))
		          .toList();
	}
}