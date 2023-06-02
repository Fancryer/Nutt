package Nutt.Visitors;

import Nutt.*;
import Nutt.ParseHelpers.Row;
import Nutt.Types.Functional.Actionable.Procedure.ProcedureBuilder;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.String.String;
import Nutt.Types.Functional.Record.Record;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;
import Nutt.Types.Nil;
import gen.Nutt;

import java.util.ArrayList;
import java.util.List;

public class NuttDeclarationVisitor extends NuttGenericVisitor<IValuable>
{
	@Override
	public IValuable visitFunctiondef_stat(Nutt.Functiondef_statContext ctx)
	{
		var functionName=NuttFunctionVisitor.getFunctionName(ctx.flat_name_list().NAME());
		var funcBody=ctx.funcbody();
		var paramList=funcBody.var_signature_list();
		var inputParameters=paramList!=null?paramList.var_signature():new ArrayList<Nutt.Var_signatureContext>();
		var output=new NuttTypeInferenceVisitor().visitFunc_output(funcBody.func_output());
		var procedure=new ProcedureBuilder()
				.setSignature(new Signature(inputParameters,output))
				.setFunctionBody(funcBody.block())
				.setOutput(output)
				.createProcedure();
		NuttInterpreter.currentScope.addVariable(functionName,procedure,TypeInferencer.findType("Procedure"),false,
		                                         ctx);
		return new String(functionName);
	}

	@Override
	public IValuable visitVar_decl(Nutt.Var_declContext ctx)
	{
		var byTypeDecl=ctx.var_signature().by_type;
		var byValueDecl=ctx.var_signature().by_value;
		Pair<Type,IValuable> initPair;
		boolean isConstant=ctx.constant_qualifier().KW_VAL()!=null;
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
				.addVariable(ctx.var_signature().NAME().getText(),initPair.right(),initPair.left(),isConstant)
				.getValuable();
	}

	@Override public Array visitGroup_var_decl(Nutt.Group_var_declContext ctx)
	{
		var prefix=ctx.KW_Vals()!=null?"val ":"var ";
		var valuables=ctx.var_signature_list()
		                 .var_signature()
		                 .stream()
		                 .map(signature->visitVar_decl(NuttEnvironment.parseWithPrefix(prefix,signature).var_decl()))
		                 .toList();
		return new Array(valuables);
	}

	@Override public IValuable visitRecord_def(Nutt.Record_defContext ctx)
	{
		var name=ctx.NAME().getText();
		if(ctx.record_member_list()==null) throw new RuntimeException("Record cannot have no children!");
		List<java.lang.String> traversedMembers=new ArrayList<>();
		List<Row> rowList=new ArrayList<>();
		for(var member: ctx.record_member_list().record_member())
		{
			var memberName=new NuttStringVisitor().visit(member.Char_String()).getValue();
			var memberType=new NuttTypeInferenceVisitor().visitType_param(member.by_type_var_decl().type_param());
			if(traversedMembers.contains(memberName))
				throw new RuntimeException("Record '%s' cannot contain more than one '%s' row!".formatted(memberName,memberType));
			rowList.add(new Row(NuttCommon.add(traversedMembers,memberName),memberType));
		}
		return NuttInterpreter
				.currentScope
				.addVariable(
						name,
						new Record(name,rowList),
						TypeInferencer.addCustomType(name,"Record",new ArrayList<>())
				            )
				.getValuable();
	}
}