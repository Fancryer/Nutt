// Generated from F:/NuttTest/src\Nutt.g4 by ANTLR 4.12.0
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NuttParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NuttVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NuttParser#chunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChunk(NuttParser.ChunkContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(NuttParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#module_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_start(NuttParser.Module_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#module_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_name(NuttParser.Module_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#module_import}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_import(NuttParser.Module_importContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#module_deport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_deport(NuttParser.Module_deportContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#module_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_list(NuttParser.Module_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#module_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_group(NuttParser.Module_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#module_name_or_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_name_or_group(NuttParser.Module_name_or_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(NuttParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code demandStat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDemandStat(NuttParser.DemandStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exec_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_stat(NuttParser.Exec_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code module_import_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_import_stat(NuttParser.Module_import_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code module_deport_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_deport_stat(NuttParser.Module_deport_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code group_assignment_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_assignment_stat(NuttParser.Group_assignment_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var_decl_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl_stat(NuttParser.Var_decl_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forget_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForget_stat(NuttParser.Forget_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functiondef_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondef_stat(NuttParser.Functiondef_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functioncall_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall_stat(NuttParser.Functioncall_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code do_done_block_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_done_block_stat(NuttParser.Do_done_block_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loop_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_stat(NuttParser.Loop_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code composed_assign_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposed_assign_stat(NuttParser.Composed_assign_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code self_in_place_op_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf_in_place_op_stat(NuttParser.Self_in_place_op_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if_then_else_block_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_then_else_block_stat(NuttParser.If_then_else_block_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code try_catch_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_catch_stat(NuttParser.Try_catch_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pass_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_stat(NuttParser.Pass_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code type_def_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_def_stat(NuttParser.Type_def_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code enum_def_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_def_stat(NuttParser.Enum_def_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code record_def_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_def_stat(NuttParser.Record_def_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exit_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_stat(NuttParser.Exit_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code yield_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_stat(NuttParser.Yield_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code break_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stat(NuttParser.Break_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continue_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stat(NuttParser.Continue_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#type_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_param(NuttParser.Type_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#type_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_param_list(NuttParser.Type_param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_def(NuttParser.Type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#record_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_def(NuttParser.Record_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#record_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_member(NuttParser.Record_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#record_member_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_member_list(NuttParser.Record_member_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#implementation_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementation_list(NuttParser.Implementation_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#implementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementation(NuttParser.ImplementationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#using}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing(NuttParser.UsingContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#overloading_operator_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverloading_operator_param(NuttParser.Overloading_operator_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#overloading_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverloading_operator(NuttParser.Overloading_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#enum_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_def(NuttParser.Enum_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#group_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_assignment(NuttParser.Group_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#do_done_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_done_block(NuttParser.Do_done_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#composed_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposed_assign(NuttParser.Composed_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#self_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf_assign(NuttParser.Self_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#if_then_else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_then_else_block(NuttParser.If_then_else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#then_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThen_block(NuttParser.Then_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_block(NuttParser.Else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#forget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForget(NuttParser.ForgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#flat_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlat_name_list(NuttParser.Flat_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(NuttParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#for_each_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_each_loop(NuttParser.For_each_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#op_direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_direction(NuttParser.Op_directionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#while_do_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_do_loop(NuttParser.While_do_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#repeat_until_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_until_loop(NuttParser.Repeat_until_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#break}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(NuttParser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#continue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue(NuttParser.ContinueContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#function_yield}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_yield(NuttParser.Function_yieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#try_catch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_catch(NuttParser.Try_catchContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#demand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDemand(NuttParser.DemandContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(NuttParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#func_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_param(NuttParser.Func_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#constant_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_qualifier(NuttParser.Constant_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#var_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_header(NuttParser.Var_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#func_param_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_param_header(NuttParser.Func_param_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#by_type_var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBy_type_var_decl(NuttParser.By_type_var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#by_value_var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBy_value_var_decl(NuttParser.By_value_var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#enumeration_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeration_initializer(NuttParser.Enumeration_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#list_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_initializer(NuttParser.List_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#enum_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_list(NuttParser.Enum_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(NuttParser.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#enum_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_case(NuttParser.Enum_caseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explicit_array}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_array(NuttParser.Explicit_arrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explicit_variable}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_variable(NuttParser.Explicit_variableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array_access}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_access(NuttParser.Array_accessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code type_cast}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_cast(NuttParser.Type_castContext ctx);
	/**
	 * Visit a parse tree produced by the {@code using_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_exp(NuttParser.Using_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prefix_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_exp(NuttParser.Prefix_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instance_of_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstance_of_exp(NuttParser.Instance_of_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explicit_atom}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_atom(NuttParser.Explicit_atomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function_definition_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition_exp(NuttParser.Function_definition_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code type_of_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_of_exp(NuttParser.Type_of_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code contains_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContains_exp(NuttParser.Contains_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fold_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFold_exp(NuttParser.Fold_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code range_array_initializer_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_array_initializer_exp(NuttParser.Range_array_initializer_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code map_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_exp(NuttParser.Map_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eval_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval_exp(NuttParser.Eval_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code record_initializer_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_initializer_exp(NuttParser.Record_initializer_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_exp(NuttParser.Filter_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code func_call_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call_exp(NuttParser.Func_call_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code spread_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpread_exp(NuttParser.Spread_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quarternary_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuarternary_exp(NuttParser.Quarternary_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infix_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfix_exp(NuttParser.Infix_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code map_initializer_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_initializer_exp(NuttParser.Map_initializer_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesis_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis_exp(NuttParser.Parenthesis_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code record_member_access}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_member_access(NuttParser.Record_member_accessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explicit_enum_case}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_enum_case(NuttParser.Explicit_enum_caseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explicit_enumeration}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_enumeration(NuttParser.Explicit_enumerationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code match_to_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch_to_exp(NuttParser.Match_to_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#fold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFold(NuttParser.FoldContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#range_array_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_array_initializer(NuttParser.Range_array_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#map_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_element(NuttParser.Map_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#map_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_initializer(NuttParser.Map_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#record_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_element(NuttParser.Record_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#record_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_initializer(NuttParser.Record_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#operator_logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_logical(NuttParser.Operator_logicalContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#default_match_branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_match_branch(NuttParser.Default_match_branchContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#match_branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch_branch(NuttParser.Match_branchContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#final_match_branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinal_match_branch(NuttParser.Final_match_branchContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#case_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_list(NuttParser.Case_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(NuttParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#nil}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil(NuttParser.NilContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#boolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(NuttParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(NuttParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(NuttParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#functioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(NuttParser.FunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#using_in_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_in_call(NuttParser.Using_in_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#func_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_param_list(NuttParser.Func_param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#func_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_parameters(NuttParser.Func_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#func_output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_output(NuttParser.Func_outputContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#local_funct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_funct(NuttParser.Local_functContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#funcbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncbody(NuttParser.FuncbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#lambda_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_decl(NuttParser.Lambda_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#operator_infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_infix(NuttParser.Operator_infixContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#operator_composed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_composed(NuttParser.Operator_composedContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#operator_math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_math(NuttParser.Operator_mathContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#operator_postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_postfix(NuttParser.Operator_postfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#composed_assign_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposed_assign_op(NuttParser.Composed_assign_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#op_mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_mult(NuttParser.Op_multContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#op_div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_div(NuttParser.Op_divContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#operator_bitwise}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_bitwise(NuttParser.Operator_bitwiseContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#operator_prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_prefix(NuttParser.Operator_prefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#operator_comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_comparison(NuttParser.Operator_comparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#op_less_equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_less_equal(NuttParser.Op_less_equalContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#op_greater_equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_greater_equal(NuttParser.Op_greater_equalContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#op_not_similar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_not_similar(NuttParser.Op_not_similarContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#op_not_equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_not_equal(NuttParser.Op_not_equalContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#op_equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_equal(NuttParser.Op_equalContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#kw_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_in(NuttParser.Kw_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#kw_not_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_not_in(NuttParser.Kw_not_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#kw_true}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_true(NuttParser.Kw_trueContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#kw_false}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_false(NuttParser.Kw_falseContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#kw_all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_all(NuttParser.Kw_allContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#inner_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInner_string(NuttParser.Inner_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#normal_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormal_string(NuttParser.Normal_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#interpolated_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolated_string(NuttParser.Interpolated_stringContext ctx);
}