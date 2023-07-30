// Generated from G:/Nutt/src/main/java\Nutt.g4 by ANTLR 4.12.0
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Nutt}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NuttVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Nutt#chunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChunk(Nutt.ChunkContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(Nutt.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#module_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_start(Nutt.Module_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#module_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_name(Nutt.Module_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#module_require}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_require(Nutt.Module_requireContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#named_import}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_import(Nutt.Named_importContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#named_import_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_import_list(Nutt.Named_import_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#module_import}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_import(Nutt.Module_importContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#module_deport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_deport(Nutt.Module_deportContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#module_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_list(Nutt.Module_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#module_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_group(Nutt.Module_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#module_name_or_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_name_or_group(Nutt.Module_name_or_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Nutt.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#functiondef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondef(Nutt.FunctiondefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code demandStat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDemandStat(Nutt.DemandStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code do_if_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_if_stat(Nutt.Do_if_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code do_if_not_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_if_not_stat(Nutt.Do_if_not_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exec_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_stat(Nutt.Exec_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code module_import_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_import_stat(Nutt.Module_import_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code module_deport_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_deport_stat(Nutt.Module_deport_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code group_assignment_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_assignment_stat(Nutt.Group_assignment_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var_decl_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl_stat(Nutt.Var_decl_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operator_decl_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_decl_stat(Nutt.Operator_decl_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code annotation_decl_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation_decl_stat(Nutt.Annotation_decl_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forget_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForget_stat(Nutt.Forget_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functiondef_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondef_stat(Nutt.Functiondef_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functioncall_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall_stat(Nutt.Functioncall_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code do_done_block_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_done_block_stat(Nutt.Do_done_block_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loop_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_stat(Nutt.Loop_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code composed_assign_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposed_assign_stat(Nutt.Composed_assign_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code self_in_place_op_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf_in_place_op_stat(Nutt.Self_in_place_op_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if_then_else_block_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_then_else_block_stat(Nutt.If_then_else_block_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code try_catch_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_catch_stat(Nutt.Try_catch_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pass_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_stat(Nutt.Pass_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code type_def_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_def_stat(Nutt.Type_def_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code interface_def_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_def_stat(Nutt.Interface_def_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code class_def_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_def_stat(Nutt.Class_def_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code record_def_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_def_stat(Nutt.Record_def_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exit_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_stat(Nutt.Exit_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stat(Nutt.Return_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code yield_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_stat(Nutt.Yield_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code break_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stat(Nutt.Break_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continue_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stat(Nutt.Continue_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#type_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_param(Nutt.Type_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#template_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_type(Nutt.Template_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#relation_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_type(Nutt.Relation_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#type_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_param_list(Nutt.Type_param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#interface_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_def(Nutt.Interface_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#class_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_def(Nutt.Class_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#access_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_modifier(Nutt.Access_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#class_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_member(Nutt.Class_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#signature_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature_def(Nutt.Signature_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#funct_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunct_signature(Nutt.Funct_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_def(Nutt.Type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#record_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_def(Nutt.Record_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#record_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_member(Nutt.Record_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#record_member_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_member_list(Nutt.Record_member_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#using}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing(Nutt.UsingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#overloading_operator_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverloading_operator_param(Nutt.Overloading_operator_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#overloading_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverloading_operator(Nutt.Overloading_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#operator_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_decl(Nutt.Operator_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#annotation_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation_decl(Nutt.Annotation_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#group_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_assignment(Nutt.Group_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#do_done_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_done_block(Nutt.Do_done_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#composed_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposed_assign(Nutt.Composed_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#self_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf_assign(Nutt.Self_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#if_then_else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_then_else_block(Nutt.If_then_else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#then_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThen_block(Nutt.Then_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_block(Nutt.Else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#forget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForget(Nutt.ForgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#flat_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlat_name_list(Nutt.Flat_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(Nutt.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#for_each_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_each_loop(Nutt.For_each_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#op_direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_direction(Nutt.Op_directionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#while_do_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_do_loop(Nutt.While_do_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#repeat_until_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_until_loop(Nutt.Repeat_until_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#function_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_return(Nutt.Function_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#function_yield}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_yield(Nutt.Function_yieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#try_catch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_catch(Nutt.Try_catchContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#demand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDemand(Nutt.DemandContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(Nutt.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#var_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_signature(Nutt.Var_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(Nutt.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#scope_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope_qualifier(Nutt.Scope_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#constant_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_qualifier(Nutt.Constant_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#alias_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_decl(Nutt.Alias_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#alias_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_name(Nutt.Alias_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#by_type_var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBy_type_var_decl(Nutt.By_type_var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#by_value_var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBy_value_var_decl(Nutt.By_value_var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#list_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_initializer(Nutt.List_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(Nutt.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#qualified_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_name(Nutt.Qualified_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explicit_array}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_array(Nutt.Explicit_arrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explicit_variable}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_variable(Nutt.Explicit_variableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code qualified_variable}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_variable(Nutt.Qualified_variableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array_access}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_access(Nutt.Array_accessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explicit_operator}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_operator(Nutt.Explicit_operatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code using_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_exp(Nutt.Using_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compose_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompose_exp(Nutt.Compose_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prefix_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_exp(Nutt.Prefix_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instance_of_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstance_of_exp(Nutt.Instance_of_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explicit_atom}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_atom(Nutt.Explicit_atomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exec_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_exp(Nutt.Exec_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function_definition_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition_exp(Nutt.Function_definition_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code type_of_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_of_exp(Nutt.Type_of_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code contains_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContains_exp(Nutt.Contains_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comprehense_array_initializer_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComprehense_array_initializer_exp(Nutt.Comprehense_array_initializer_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explicit_type}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_type(Nutt.Explicit_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code range_array_initializer_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_array_initializer_exp(Nutt.Range_array_initializer_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eval_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval_exp(Nutt.Eval_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code common_of_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_of_exp(Nutt.Common_of_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code record_initializer_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_initializer_exp(Nutt.Record_initializer_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code func_call_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call_exp(Nutt.Func_call_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code spread_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpread_exp(Nutt.Spread_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quarternary_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuarternary_exp(Nutt.Quarternary_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infix_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfix_exp(Nutt.Infix_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code block_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_exp(Nutt.Block_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code map_initializer_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_initializer_exp(Nutt.Map_initializer_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code op_call_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_call_exp(Nutt.Op_call_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code reverse_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReverse_exp(Nutt.Reverse_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesis_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis_exp(Nutt.Parenthesis_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code record_member_access}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_member_access(Nutt.Record_member_accessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code match_to_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch_to_exp(Nutt.Match_to_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code new_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_exp(Nutt.New_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#range_array_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_array_initializer(Nutt.Range_array_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#comprehense_array_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComprehense_array_initializer(Nutt.Comprehense_array_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#map_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_element(Nutt.Map_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#map_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_initializer(Nutt.Map_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#record_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_element(Nutt.Record_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#record_element_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_element_list(Nutt.Record_element_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#record_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_initializer(Nutt.Record_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#operator_logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_logical(Nutt.Operator_logicalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#default_match_branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_match_branch(Nutt.Default_match_branchContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#match_branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch_branch(Nutt.Match_branchContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(Nutt.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#nil}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil(Nutt.NilContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#boolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(Nutt.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(Nutt.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(Nutt.IntContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(Nutt.FloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(Nutt.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(Nutt.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#using_in_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_in_call(Nutt.Using_in_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#var_signature_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_signature_list(Nutt.Var_signature_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#vararg_or_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVararg_or_signature(Nutt.Vararg_or_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#func_output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_output(Nutt.Func_outputContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#local_funct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_funct(Nutt.Local_functContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#funcbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncbody(Nutt.FuncbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#lambda_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_decl(Nutt.Lambda_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#operator_infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_infix(Nutt.Operator_infixContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#default_infix_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_infix_operator(Nutt.Default_infix_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#operator_composed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_composed(Nutt.Operator_composedContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#operator_math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_math(Nutt.Operator_mathContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#operator_postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_postfix(Nutt.Operator_postfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#composed_assign_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposed_assign_op(Nutt.Composed_assign_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#operator_prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_prefix(Nutt.Operator_prefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link Nutt#operator_comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_comparison(Nutt.Operator_comparisonContext ctx);
}