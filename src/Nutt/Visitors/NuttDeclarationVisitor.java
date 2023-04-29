package Nutt.Visitors;

import Nutt.*;
import Nutt.ParseHelpers.Row;
import Nutt.Types.Functional.Actionable.Procedure.ProcedureBuilder;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Listable.String.String;
import Nutt.Types.Functional.Record.Record;
import Nutt.Types.Functional.Type.IType;
import Nutt.Types.IValuable;
import Nutt.Types.Nil;
import gen.NuttParser;
import gen.NuttParser.Func_paramContext;
import gen.NuttParser.Var_declContext;

import java.util.ArrayList;
import java.util.List;

public class NuttDeclarationVisitor extends NuttGenericVisitor
{
	public String traceVariableName(Var_declContext ctx)
	{
		return new String(ctx.var_header().NAME().getText());
	}

	@Override
	public IValuable visitFunctiondef_stat(NuttParser.Functiondef_statContext ctx)
	{
		var functionName=NuttFunctionVisitor.getFunctionName(ctx.flat_name_list().NAME());
		var funcBody=ctx.funcbody();
		var paramList=funcBody.func_parameters().func_param_list();
		var inputParameters=paramList!=null?paramList.func_param():new ArrayList<Func_paramContext>();
		var output=new NuttTypeInferenceVisitor().visitFunc_output(funcBody.func_output());
		var procedure=new ProcedureBuilder().setSignature(new Signature(inputParameters,output))
		                                    .setFunctionBody(funcBody.block())
		                                    .setOutput(output)
		                                    .createProcedure();
		NuttInterpreter.currentScope.addVariable(functionName,procedure,TypeInferencer.findType("Procedure"),false,
		                                         ctx);
		return new String(functionName);
	}


	@Override
	public IValuable visitVar_decl(Var_declContext ctx)
	{
		var byTypeDecl=ctx.by_type;
		var byValueDecl=ctx.by_value;
		Pair<IType,IValuable> initPair;
		boolean isConstant=ctx.var_header().constant_qualifier().KW_VAL()!=null;
		if(byTypeDecl!=null)
		{
			var declaredType=new NuttTypeInferenceVisitor().visitType_param(byTypeDecl.type_param());
			IValuable declaredValue;
			if(byValueDecl!=null) declaredValue=new NuttEvalVisitor().visit(byValueDecl.assign_right);
			else declaredValue=NuttEnvironment.constructValuable(declaredType);
			initPair=new Pair<>(declaredType,declaredValue);
		}
		else
		{
			if(byValueDecl!=null)
			{
				var declaredValue=new NuttEvalVisitor().visit(byValueDecl.assign_right);
				initPair=new Pair<>(declaredValue.getType(),declaredValue);
			}
			else
			{
				if(isConstant) throw new RuntimeException("Constant cannot be declared without either value or type!");
				initPair=new Pair<>(TypeInferencer.findType("Valuable"),new Nil());
			}
		}
		return NuttInterpreter.currentScope
				.addVariable(ctx.var_header().NAME().getText(),initPair.right(),initPair.left(),isConstant)
				.getValuable();
	}

	@Override public IValuable visitRecord_def(NuttParser.Record_defContext ctx)
	{
		var name=ctx.NAME().getText();
		if(ctx.record_member_list()==null) throw new RuntimeException("Record cannot have no children!");
		List<java.lang.String> traversedMembers=new ArrayList<>();
		List<Row> rowList=new ArrayList<>();
		for(var member: ctx.record_member_list().record_member())
		{
			var memberName=member.NAME().getText();
			var memberType=new NuttTypeInferenceVisitor().visitType_param(member.by_type_var_decl().type_param());
			if(traversedMembers.contains(memberName))
				throw new RuntimeException("Record '%s' cannot contain more than one '%s' row!".formatted(memberName,memberType));
			rowList.add(new Row(NuttCommon.add(traversedMembers,memberName),memberType));
		}
		System.out.printf("Declared record '%s'%n",name);
		var value=NuttInterpreter
				.currentScope
				.addVariable(
						name,
						new Record(name,rowList),
						TypeInferencer.addCustomType(name,"Record",new ArrayList<>())
				            )
				.getValuable();
		TypeInferencer.prettyPrintTypeTree();
		return value;
	}
}