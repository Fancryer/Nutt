package Nutt.Visitors;

import Nutt.Interpreter.NuttInterpreter;
import Nutt.Interpreter.NuttInterpreter.EConstantQualifier;
import Nutt.Interpreter.References.NilReference;
import Nutt.Interpreter.References.NuttReference;
import Nutt.NuttCommon;
import Nutt.NuttEnvironment;
import Nutt.Pair;
import Nutt.ParseHelpers.RecordBuilder;
import Nutt.ParseHelpers.Row;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Actionable.Procedure.ProcedureBuilder;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.String.String;
import gen.Nutt;

import java.util.ArrayList;

public class NuttDeclarationVisitor extends NuttGenericVisitor
{
	@Override
	public NuttReference visitFunctiondef_stat(Nutt.Functiondef_statContext ctx)
	{
		var functionName=NuttFunctionVisitor.getFunctionName(ctx.functiondef().flat_name_list().NAME());
		var funcBody=ctx.functiondef().funcbody();
		var paramList=funcBody.funct_signature().var_signature_list();
		var inputParameters=paramList!=null
		                    ?paramList.vararg_or_signature()
		                    :new ArrayList<Nutt.Vararg_or_signatureContext>();
		var output=VisitorPool.typeInferenceVisitor.visitFunc_output(funcBody.funct_signature().func_output());
		var procedure=new ProcedureBuilder()
				.setSignature(new Signature(inputParameters,output.getType().getHeader().getDisplayName()))
				.setFunctionBody(funcBody.block())
				.setOutput(output)
				.createProcedure();
		return NuttInterpreter.currentScope.addProcedure(functionName,procedure);
	}

	@Override public NuttReference visitRecord_def(Nutt.Record_defContext ctx)
	{
		var name=ctx.record_name.getText();
		if(ctx.record_member_list()==null) throw new RuntimeException("Record cannot have no children!");
		var traversedMembers=new ArrayList<java.lang.String>();
		var rowList=new ArrayList<Row>();
		for(var member: ctx.record_member_list().record_member())
		{
			var memberName=VisitorPool.stringVisitor.visit(member.string())
			                                        .getValue()
			                                        .simpleCast(String.class)
			                                        .toString();
			var memberType=VisitorPool.typeInferenceVisitor.visitType_param(member.by_type_var_decl().type_param());
			if(traversedMembers.contains(memberName))
				throw new RuntimeException("Record '%s' cannot contain more than one '%s' row!".formatted(memberName,memberType));
			rowList.add(new Row(NuttCommon.add(traversedMembers,memberName),memberType));
		}
		TypeInferencer.addCustomType(name,"Record",new ArrayList<>());
		return NuttInterpreter.currentScope.addRecord(name,new RecordBuilder().setName(name).setRows(rowList).build());
	}

	@Override
	public NuttReference visitVar_decl(Nutt.Var_declContext ctx)
	{
		if(ctx.alias_decl()!=null) return visitAlias_decl(ctx.alias_decl());
		var references=new ArrayList<NuttReference>();
		for(var decl: ctx.var_signature_list().vararg_or_signature())
		{
			var byTypeDecl=decl.var_signature().by_type;
			var byValueDecl=decl.var_signature().by_value;
			//Type and value pair
			Pair<NuttReference,NuttReference> initPair;
			EConstantQualifier constantQualifier;
			if(ctx.constant_qualifier().KW_Val()!=null) constantQualifier=EConstantQualifier.Val;
			else if(ctx.constant_qualifier().KW_Var()!=null) constantQualifier=EConstantQualifier.Var;
			else constantQualifier=EConstantQualifier.Mut;
			if(byTypeDecl!=null)
			{
				var declaredType=VisitorPool.typeInferenceVisitor.visitType_param(byTypeDecl.type_param());
				NuttReference declaredReference;
				if(byValueDecl!=null) declaredReference=VisitorPool.evalVisitor.visit(byValueDecl.assign_right);
				else declaredReference=NuttEnvironment.constructReference(declaredType.getType());
				initPair=new Pair<>(declaredType,declaredReference);
			}
			else
			{
				if(byValueDecl!=null)
				{
					var declaredReference=VisitorPool.evalVisitor.visit(byValueDecl.assign_right);
					initPair=new Pair<>(TypeInferencer.findTypeReference(declaredReference.getType()),declaredReference);
				}
				else
				{
					if(constantQualifier==EConstantQualifier.Val)
						throw new RuntimeException("Constant cannot be declared without either value or type!");
					initPair=new Pair<>(TypeInferencer.findTypeReference("Valuable"),NilReference.getInstance());
				}
			}
			//System.out.printf("name: '%s', value: '%s'%n",decl.var_signature().NAME().getText(),initPair.right().getValue());
			references.add(NuttInterpreter.declareVariable
					                              (
							                              decl.var_signature().NAME().getText(),
							                              initPair.left().getType(),
							                              initPair.right().getValue(),
							                              constantQualifier)
			              );
		}
		return new Array(references).toAnonymousReference();
	}

	//	@Override public NuttReference visitAlias_decl(Nutt.Alias_declContext ctx)
	//	{
	//		var aliasNames=ctx.alias_name().stream().map(a->a.NAME().getText()).toList();
	//		if(aliasNames.stream().distinct().count()!=aliasNames.size()) throw new RuntimeException("Duplicate names in alias
	//		statement!");
	//		var anchor=NuttInterpreter.getReference(ctx.anchor_name.getText());
	//		aliasNames.forEach(aliasName->NuttInterpreter.currentScope.referenceContainer.put(aliasName,anchor));
	//		return anchor;
	//	}
}