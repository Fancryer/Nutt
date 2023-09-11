package Nutt.Visitors;

import Nutt.Interpreter.NuttInterpreter;
import Nutt.Interpreter.NuttInterpreter.EConstantQualifier;
import Nutt.Interpreter.References.NilReference;
import Nutt.Interpreter.References.NuttReference;
import Nutt.NuttCommon;
import Nutt.NuttEnvironment;
import Nutt.ParseHelpers.RecordBuilder;
import Nutt.ParseHelpers.Row;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Actionable.Procedure.ProcedureBuilder;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.String.String;
import Nutt.Types.Functional.Type.Type;

import java.util.ArrayList;

import static gen.NuttParser.*;

public class NuttDeclarationVisitor extends NuttGenericVisitor
{
	@Override
	public NuttReference visitFunctiondef_stat(Functiondef_statContext ctx)
	{
		var functionName=ctx.functiondef().flat_name_list().NAME(0).getText();
		var funcBody=ctx.functiondef().funcbody();
		var paramList=funcBody.funct_signature().var_signature_list();
		var inputParameters=paramList!=null
		                    ?paramList.vararg_or_signature()
		                    :new ArrayList<Vararg_or_signatureContext>();
		var output=VisitorPool.typeInferenceVisitor.visitFunc_output(funcBody.funct_signature().func_output());
		var procedure=new ProcedureBuilder()
				.setSignature(new Signature(inputParameters,output.getType().getHeader().getDisplayName()))
				.setFunctionBody(funcBody.block())
				.createProcedure(ctx.functiondef().flat_name_list().NAME(0).getText());
		return NuttInterpreter.currentScope.addProcedure(functionName,procedure);
	}

	@Override public NuttReference visitRecord_def(Record_defContext ctx)
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
			var memberType=VisitorPool.typeInferenceVisitor.visitType_param(member.type_annotation().type_param());
			if(traversedMembers.contains(memberName))
				throw new RuntimeException("Record '%s' cannot contain more than one '%s' row!".formatted(memberName,memberType));
			rowList.add(new Row(NuttCommon.add(traversedMembers,memberName),memberType));
		}
		TypeInferencer.addCustomType(name,"Record",new ArrayList<>());
		return NuttInterpreter.currentScope.addRecord(name,new RecordBuilder().setName(name).setRows(rowList).build());
	}

	@Override
	public NuttReference visitVar_decl(Var_declContext ctx)
	{
		//if(ctx.alias_decl()!=null) return visitAlias_decl(ctx.alias_decl());
		var references=new ArrayList<NuttReference>();
		EConstantQualifier constantQualifier=ctx.constant_qualifier().KW_Val()!=null
		                                     ?EConstantQualifier.Val
		                                     :ctx.constant_qualifier().KW_Var()!=null
		                                      ?EConstantQualifier.Var
		                                      :EConstantQualifier.Mut;
		for(var decl: ctx.var_signature())
		{
			NuttReference typeRef, valueRef;
			if(decl.type!=null)
			{
				var declaredType=VisitorPool.typeInferenceVisitor.visitType_param(decl.type.type_param());
				typeRef=declaredType;
				valueRef=decl.value!=null
				         ?VisitorPool.evalVisitor.visit(decl.value)
				         :NuttEnvironment.constructReference(declaredType.getValueAs(Type.class));
			}
			else
			{
				if(decl.value!=null)
				{
					valueRef=VisitorPool.evalVisitor.visit(decl.value);
					typeRef=TypeInferencer.findTypeReference(valueRef.getType());
				}
				else
				{
					if(constantQualifier==EConstantQualifier.Val)
						throw new RuntimeException("Constant cannot be declared without either value or type!");
					typeRef=TypeInferencer.findTypeReference("Valuable");
					valueRef=NilReference.getInstance();
				}
			}
			references.add(NuttInterpreter.declareVariable
					                              (
							                              decl.NAME().getText(),
							                              typeRef.getValueAs(Type.class),
							                              valueRef.getValue(),
							                              constantQualifier
					                              )
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