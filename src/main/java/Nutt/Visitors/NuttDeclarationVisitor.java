//package Nutt.Visitors;
//
//import Nutt.*;
//import Nutt.ParseHelpers.RecordBuilder;
//import Nutt.ParseHelpers.Row;
//import Nutt.Types.Functional.Actionable.Procedure.ProcedureBuilder;
//import Nutt.Types.Functional.Actionable.Procedure.Signature;
//import Nutt.Types.Functional.Listable.Array.Array;
//import Nutt.Types.Functional.Listable.String.String;
//import Nutt.Types.Functional.Type.Type;
//import Nutt.Types.IValuable;
//import Nutt.Types.Nil;
//import gen.Nutt;
//
//import java.util.ArrayList;
//
//public class NuttDeclarationVisitor extends NuttGenericVisitor<IValuable>
//{
//	@Override
//	public IValuable visitFunctiondef_stat(Nutt.Functiondef_statContext ctx)
//	{
//		var functionName=NuttFunctionVisitor.getFunctionName(ctx.functiondef().flat_name_list().NAME());
//		var funcBody=ctx.functiondef().funcbody();
//		var paramList=funcBody.funct_signature().var_signature_list();
//		var inputParameters=paramList!=null
//		                    ?paramList.vararg_or_signature()
//		                    :new ArrayList<Nutt.Vararg_or_signatureContext>();
//		var output=VisitorsPool.typeInferenceVisitor.visitFunc_output(funcBody.funct_signature().func_output());
//		var procedure=new ProcedureBuilder()
//				.setSignature(new Signature(inputParameters,output))
//				.setFunctionBody(funcBody.block())
//				.setOutput(output)
//				.createProcedure();
//		NuttInterpreter.currentScope
//				.addVariable
//						(
//								functionName,
//								procedure,
//								TypeInferencer.findType("Procedure"),
//								false,
//								ctx
//						);
//		return new String(functionName);
//	}
//
//	@Override public IValuable visitAlias_decl(Nutt.Alias_declContext ctx)
//	{
//		var aliasNames=ctx.alias_name().stream().map(a->a.NAME().getText()).toList();
//		if(aliasNames.stream().distinct().count()!=aliasNames.size()) throw new RuntimeException("Duplicate names in alias statement!");
//		var anchor=NuttInterpreter.getVariable(ctx.anchor_name.getText());
//		aliasNames.forEach(aliasName->NuttInterpreter.currentScope.variableMap.put(aliasName,anchor));
//		return anchor.valuable;
//	}
//
//	@Override
//	public IValuable visitVar_decl(Nutt.Var_declContext ctx)
//	{
//		if(ctx.alias_decl()!=null)return visitAlias_decl(ctx.alias_decl());
//		var valuables=new ArrayList<IValuable>();
//		for(var decl: ctx.var_signature_list().vararg_or_signature())
//		{
//			var byTypeDecl=decl.var_signature().by_type;
//			var byValueDecl=decl.var_signature().by_value;
//			Pair<Type,IValuable> initPair;
//			boolean isConstant=ctx.constant_qualifier().KW_Val()!=null;
//			//			else if(ctx.constant_qualifier().KW_Mut()!=null)
//			//				constantQualifier=EConstantQualifier.Mut;
//			if(byTypeDecl!=null)
//			{
//				var declaredType=VisitorsPool.typeInferenceVisitor.visitType_param(byTypeDecl.type_param());
//				IValuable declaredValue;
//				if(byValueDecl!=null) declaredValue=VisitorsPool.evalVisitor.visit(byValueDecl.assign_right);
//				else declaredValue=NuttEnvironment.constructValuable(declaredType);
//				initPair=new Pair<>(declaredType,declaredValue);
//			}
//			else
//			{
//				if(byValueDecl!=null)
//				{
//					var declaredValue=VisitorsPool.evalVisitor.visit(byValueDecl.assign_right);
//					initPair=new Pair<>(declaredValue.getType(),declaredValue);
//				}
//				else
//				{
//					if(isConstant)
//						throw new RuntimeException("Constant cannot be declared without either value or type!");
//					initPair=new Pair<>(TypeInferencer.findType("Valuable"),new Nil());
//				}
//			}
//			System.out.printf("name: '%s', valueHash: '%s'%n",decl.var_signature().NAME().getText(),
//			                  initPair.right().getValue().hashCode());
//			valuables.add(NuttInterpreter.currentScope
//					              .addVariable(decl.var_signature().NAME().getText(),
//					                           initPair.right(),
//					                           initPair.left(),
//					                           isConstant)
//					              .getValuable());
//		}
//		return new Array(valuables);
//	}
//
//	@Override public IValuable visitRecord_def(Nutt.Record_defContext ctx)
//	{
//		var name=ctx.record_name.getText();
//		if(ctx.record_member_list()==null) throw new RuntimeException("Record cannot have no children!");
//		var traversedMembers=new ArrayList<java.lang.String>();
//		var rowList=new ArrayList<Row>();
//		for(var member: ctx.record_member_list().record_member())
//		{
//			var memberName=VisitorsPool.stringVisitor.visit(member.string()).getValue();
//			var memberType=VisitorsPool.typeInferenceVisitor.visitType_param(member.by_type_var_decl().type_param());
//			if(traversedMembers.contains(memberName))
//				throw new RuntimeException("Record '%s' cannot contain more than one '%s' row!".formatted(memberName,memberType));
//			rowList.add(new Row(NuttCommon.add(traversedMembers,memberName),memberType));
//		}
//		return NuttInterpreter
//				.currentScope
//				.addVariable(
//						name,
//						new RecordBuilder().setName(name).setRows(rowList).build(),
//						TypeInferencer.addCustomType(name,"Record",new ArrayList<>())
//				            )
//				.getValuable();
//	}
//}