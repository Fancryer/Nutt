// Generated from F:/NuttTest/src\Nutt.g4 by ANTLR 4.12.0
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NuttParser}.
 */
public interface NuttListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NuttParser#chunk}.
	 * @param ctx the parse tree
	 */
	void enterChunk(NuttParser.ChunkContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#chunk}.
	 * @param ctx the parse tree
	 */
	void exitChunk(NuttParser.ChunkContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(NuttParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(NuttParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#module_start}.
	 * @param ctx the parse tree
	 */
	void enterModule_start(NuttParser.Module_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#module_start}.
	 * @param ctx the parse tree
	 */
	void exitModule_start(NuttParser.Module_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(NuttParser.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(NuttParser.Module_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#module_import}.
	 * @param ctx the parse tree
	 */
	void enterModule_import(NuttParser.Module_importContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#module_import}.
	 * @param ctx the parse tree
	 */
	void exitModule_import(NuttParser.Module_importContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#module_deport}.
	 * @param ctx the parse tree
	 */
	void enterModule_deport(NuttParser.Module_deportContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#module_deport}.
	 * @param ctx the parse tree
	 */
	void exitModule_deport(NuttParser.Module_deportContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#module_list}.
	 * @param ctx the parse tree
	 */
	void enterModule_list(NuttParser.Module_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#module_list}.
	 * @param ctx the parse tree
	 */
	void exitModule_list(NuttParser.Module_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#module_group}.
	 * @param ctx the parse tree
	 */
	void enterModule_group(NuttParser.Module_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#module_group}.
	 * @param ctx the parse tree
	 */
	void exitModule_group(NuttParser.Module_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#module_name_or_group}.
	 * @param ctx the parse tree
	 */
	void enterModule_name_or_group(NuttParser.Module_name_or_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#module_name_or_group}.
	 * @param ctx the parse tree
	 */
	void exitModule_name_or_group(NuttParser.Module_name_or_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(NuttParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(NuttParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code demandStat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDemandStat(NuttParser.DemandStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code demandStat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDemandStat(NuttParser.DemandStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exec_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterExec_stat(NuttParser.Exec_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exec_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitExec_stat(NuttParser.Exec_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code module_import_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterModule_import_stat(NuttParser.Module_import_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code module_import_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitModule_import_stat(NuttParser.Module_import_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code module_deport_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterModule_deport_stat(NuttParser.Module_deport_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code module_deport_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitModule_deport_stat(NuttParser.Module_deport_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code group_assignment_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterGroup_assignment_stat(NuttParser.Group_assignment_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code group_assignment_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitGroup_assignment_stat(NuttParser.Group_assignment_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var_decl_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl_stat(NuttParser.Var_decl_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var_decl_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl_stat(NuttParser.Var_decl_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forget_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterForget_stat(NuttParser.Forget_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forget_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitForget_stat(NuttParser.Forget_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functiondef_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondef_stat(NuttParser.Functiondef_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functiondef_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondef_stat(NuttParser.Functiondef_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functioncall_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall_stat(NuttParser.Functioncall_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functioncall_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall_stat(NuttParser.Functioncall_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code do_done_block_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDo_done_block_stat(NuttParser.Do_done_block_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code do_done_block_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDo_done_block_stat(NuttParser.Do_done_block_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loop_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterLoop_stat(NuttParser.Loop_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loop_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitLoop_stat(NuttParser.Loop_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code composed_assign_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterComposed_assign_stat(NuttParser.Composed_assign_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code composed_assign_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitComposed_assign_stat(NuttParser.Composed_assign_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code self_in_place_op_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterSelf_in_place_op_stat(NuttParser.Self_in_place_op_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code self_in_place_op_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitSelf_in_place_op_stat(NuttParser.Self_in_place_op_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if_then_else_block_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_then_else_block_stat(NuttParser.If_then_else_block_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_then_else_block_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_then_else_block_stat(NuttParser.If_then_else_block_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code try_catch_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterTry_catch_stat(NuttParser.Try_catch_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code try_catch_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitTry_catch_stat(NuttParser.Try_catch_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pass_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPass_stat(NuttParser.Pass_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pass_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPass_stat(NuttParser.Pass_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code type_def_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterType_def_stat(NuttParser.Type_def_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code type_def_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitType_def_stat(NuttParser.Type_def_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enum_def_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterEnum_def_stat(NuttParser.Enum_def_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enum_def_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitEnum_def_stat(NuttParser.Enum_def_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code record_def_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterRecord_def_stat(NuttParser.Record_def_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code record_def_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitRecord_def_stat(NuttParser.Record_def_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exit_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterExit_stat(NuttParser.Exit_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exit_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitExit_stat(NuttParser.Exit_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code yield_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterYield_stat(NuttParser.Yield_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code yield_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitYield_stat(NuttParser.Yield_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code break_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stat(NuttParser.Break_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code break_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stat(NuttParser.Break_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continue_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stat(NuttParser.Continue_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continue_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stat(NuttParser.Continue_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#type_param}.
	 * @param ctx the parse tree
	 */
	void enterType_param(NuttParser.Type_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#type_param}.
	 * @param ctx the parse tree
	 */
	void exitType_param(NuttParser.Type_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#type_param_list}.
	 * @param ctx the parse tree
	 */
	void enterType_param_list(NuttParser.Type_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#type_param_list}.
	 * @param ctx the parse tree
	 */
	void exitType_param_list(NuttParser.Type_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#type_def}.
	 * @param ctx the parse tree
	 */
	void enterType_def(NuttParser.Type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#type_def}.
	 * @param ctx the parse tree
	 */
	void exitType_def(NuttParser.Type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#record_def}.
	 * @param ctx the parse tree
	 */
	void enterRecord_def(NuttParser.Record_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#record_def}.
	 * @param ctx the parse tree
	 */
	void exitRecord_def(NuttParser.Record_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#record_member}.
	 * @param ctx the parse tree
	 */
	void enterRecord_member(NuttParser.Record_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#record_member}.
	 * @param ctx the parse tree
	 */
	void exitRecord_member(NuttParser.Record_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#record_member_list}.
	 * @param ctx the parse tree
	 */
	void enterRecord_member_list(NuttParser.Record_member_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#record_member_list}.
	 * @param ctx the parse tree
	 */
	void exitRecord_member_list(NuttParser.Record_member_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#implementation_list}.
	 * @param ctx the parse tree
	 */
	void enterImplementation_list(NuttParser.Implementation_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#implementation_list}.
	 * @param ctx the parse tree
	 */
	void exitImplementation_list(NuttParser.Implementation_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#implementation}.
	 * @param ctx the parse tree
	 */
	void enterImplementation(NuttParser.ImplementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#implementation}.
	 * @param ctx the parse tree
	 */
	void exitImplementation(NuttParser.ImplementationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#using}.
	 * @param ctx the parse tree
	 */
	void enterUsing(NuttParser.UsingContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#using}.
	 * @param ctx the parse tree
	 */
	void exitUsing(NuttParser.UsingContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#overloading_operator_param}.
	 * @param ctx the parse tree
	 */
	void enterOverloading_operator_param(NuttParser.Overloading_operator_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#overloading_operator_param}.
	 * @param ctx the parse tree
	 */
	void exitOverloading_operator_param(NuttParser.Overloading_operator_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#overloading_operator}.
	 * @param ctx the parse tree
	 */
	void enterOverloading_operator(NuttParser.Overloading_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#overloading_operator}.
	 * @param ctx the parse tree
	 */
	void exitOverloading_operator(NuttParser.Overloading_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#enum_def}.
	 * @param ctx the parse tree
	 */
	void enterEnum_def(NuttParser.Enum_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#enum_def}.
	 * @param ctx the parse tree
	 */
	void exitEnum_def(NuttParser.Enum_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#group_assignment}.
	 * @param ctx the parse tree
	 */
	void enterGroup_assignment(NuttParser.Group_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#group_assignment}.
	 * @param ctx the parse tree
	 */
	void exitGroup_assignment(NuttParser.Group_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#do_done_block}.
	 * @param ctx the parse tree
	 */
	void enterDo_done_block(NuttParser.Do_done_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#do_done_block}.
	 * @param ctx the parse tree
	 */
	void exitDo_done_block(NuttParser.Do_done_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#composed_assign}.
	 * @param ctx the parse tree
	 */
	void enterComposed_assign(NuttParser.Composed_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#composed_assign}.
	 * @param ctx the parse tree
	 */
	void exitComposed_assign(NuttParser.Composed_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#self_assign}.
	 * @param ctx the parse tree
	 */
	void enterSelf_assign(NuttParser.Self_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#self_assign}.
	 * @param ctx the parse tree
	 */
	void exitSelf_assign(NuttParser.Self_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#if_then_else_block}.
	 * @param ctx the parse tree
	 */
	void enterIf_then_else_block(NuttParser.If_then_else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#if_then_else_block}.
	 * @param ctx the parse tree
	 */
	void exitIf_then_else_block(NuttParser.If_then_else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#then_block}.
	 * @param ctx the parse tree
	 */
	void enterThen_block(NuttParser.Then_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#then_block}.
	 * @param ctx the parse tree
	 */
	void exitThen_block(NuttParser.Then_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(NuttParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(NuttParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#forget}.
	 * @param ctx the parse tree
	 */
	void enterForget(NuttParser.ForgetContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#forget}.
	 * @param ctx the parse tree
	 */
	void exitForget(NuttParser.ForgetContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#flat_name_list}.
	 * @param ctx the parse tree
	 */
	void enterFlat_name_list(NuttParser.Flat_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#flat_name_list}.
	 * @param ctx the parse tree
	 */
	void exitFlat_name_list(NuttParser.Flat_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(NuttParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(NuttParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#for_each_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_each_loop(NuttParser.For_each_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#for_each_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_each_loop(NuttParser.For_each_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#op_direction}.
	 * @param ctx the parse tree
	 */
	void enterOp_direction(NuttParser.Op_directionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#op_direction}.
	 * @param ctx the parse tree
	 */
	void exitOp_direction(NuttParser.Op_directionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#while_do_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_do_loop(NuttParser.While_do_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#while_do_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_do_loop(NuttParser.While_do_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#repeat_until_loop}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_until_loop(NuttParser.Repeat_until_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#repeat_until_loop}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_until_loop(NuttParser.Repeat_until_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#break}.
	 * @param ctx the parse tree
	 */
	void enterBreak(NuttParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#break}.
	 * @param ctx the parse tree
	 */
	void exitBreak(NuttParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#continue}.
	 * @param ctx the parse tree
	 */
	void enterContinue(NuttParser.ContinueContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#continue}.
	 * @param ctx the parse tree
	 */
	void exitContinue(NuttParser.ContinueContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#function_yield}.
	 * @param ctx the parse tree
	 */
	void enterFunction_yield(NuttParser.Function_yieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#function_yield}.
	 * @param ctx the parse tree
	 */
	void exitFunction_yield(NuttParser.Function_yieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#try_catch}.
	 * @param ctx the parse tree
	 */
	void enterTry_catch(NuttParser.Try_catchContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#try_catch}.
	 * @param ctx the parse tree
	 */
	void exitTry_catch(NuttParser.Try_catchContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#demand}.
	 * @param ctx the parse tree
	 */
	void enterDemand(NuttParser.DemandContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#demand}.
	 * @param ctx the parse tree
	 */
	void exitDemand(NuttParser.DemandContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(NuttParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(NuttParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#func_param}.
	 * @param ctx the parse tree
	 */
	void enterFunc_param(NuttParser.Func_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#func_param}.
	 * @param ctx the parse tree
	 */
	void exitFunc_param(NuttParser.Func_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#constant_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterConstant_qualifier(NuttParser.Constant_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#constant_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitConstant_qualifier(NuttParser.Constant_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#var_header}.
	 * @param ctx the parse tree
	 */
	void enterVar_header(NuttParser.Var_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#var_header}.
	 * @param ctx the parse tree
	 */
	void exitVar_header(NuttParser.Var_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#func_param_header}.
	 * @param ctx the parse tree
	 */
	void enterFunc_param_header(NuttParser.Func_param_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#func_param_header}.
	 * @param ctx the parse tree
	 */
	void exitFunc_param_header(NuttParser.Func_param_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#by_type_var_decl}.
	 * @param ctx the parse tree
	 */
	void enterBy_type_var_decl(NuttParser.By_type_var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#by_type_var_decl}.
	 * @param ctx the parse tree
	 */
	void exitBy_type_var_decl(NuttParser.By_type_var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#by_value_var_decl}.
	 * @param ctx the parse tree
	 */
	void enterBy_value_var_decl(NuttParser.By_value_var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#by_value_var_decl}.
	 * @param ctx the parse tree
	 */
	void exitBy_value_var_decl(NuttParser.By_value_var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#enumeration_initializer}.
	 * @param ctx the parse tree
	 */
	void enterEnumeration_initializer(NuttParser.Enumeration_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#enumeration_initializer}.
	 * @param ctx the parse tree
	 */
	void exitEnumeration_initializer(NuttParser.Enumeration_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#list_initializer}.
	 * @param ctx the parse tree
	 */
	void enterList_initializer(NuttParser.List_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#list_initializer}.
	 * @param ctx the parse tree
	 */
	void exitList_initializer(NuttParser.List_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#enum_list}.
	 * @param ctx the parse tree
	 */
	void enterEnum_list(NuttParser.Enum_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#enum_list}.
	 * @param ctx the parse tree
	 */
	void exitEnum_list(NuttParser.Enum_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(NuttParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(NuttParser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#enum_case}.
	 * @param ctx the parse tree
	 */
	void enterEnum_case(NuttParser.Enum_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#enum_case}.
	 * @param ctx the parse tree
	 */
	void exitEnum_case(NuttParser.Enum_caseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explicit_array}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_array(NuttParser.Explicit_arrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explicit_array}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_array(NuttParser.Explicit_arrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explicit_variable}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_variable(NuttParser.Explicit_variableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explicit_variable}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_variable(NuttParser.Explicit_variableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array_access}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterArray_access(NuttParser.Array_accessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array_access}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitArray_access(NuttParser.Array_accessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code type_cast}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterType_cast(NuttParser.Type_castContext ctx);
	/**
	 * Exit a parse tree produced by the {@code type_cast}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitType_cast(NuttParser.Type_castContext ctx);
	/**
	 * Enter a parse tree produced by the {@code using_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterUsing_exp(NuttParser.Using_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code using_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitUsing_exp(NuttParser.Using_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prefix_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_exp(NuttParser.Prefix_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prefix_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_exp(NuttParser.Prefix_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instance_of_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterInstance_of_exp(NuttParser.Instance_of_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instance_of_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitInstance_of_exp(NuttParser.Instance_of_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explicit_atom}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_atom(NuttParser.Explicit_atomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explicit_atom}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_atom(NuttParser.Explicit_atomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function_definition_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_exp(NuttParser.Function_definition_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function_definition_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_exp(NuttParser.Function_definition_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code type_of_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterType_of_exp(NuttParser.Type_of_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code type_of_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitType_of_exp(NuttParser.Type_of_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code contains_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterContains_exp(NuttParser.Contains_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code contains_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitContains_exp(NuttParser.Contains_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fold_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFold_exp(NuttParser.Fold_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fold_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFold_exp(NuttParser.Fold_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code range_array_initializer_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterRange_array_initializer_exp(NuttParser.Range_array_initializer_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code range_array_initializer_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitRange_array_initializer_exp(NuttParser.Range_array_initializer_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code map_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMap_exp(NuttParser.Map_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code map_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMap_exp(NuttParser.Map_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eval_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterEval_exp(NuttParser.Eval_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eval_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitEval_exp(NuttParser.Eval_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code record_initializer_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterRecord_initializer_exp(NuttParser.Record_initializer_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code record_initializer_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitRecord_initializer_exp(NuttParser.Record_initializer_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFilter_exp(NuttParser.Filter_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFilter_exp(NuttParser.Filter_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code func_call_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call_exp(NuttParser.Func_call_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code func_call_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call_exp(NuttParser.Func_call_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code spread_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSpread_exp(NuttParser.Spread_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code spread_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSpread_exp(NuttParser.Spread_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quarternary_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterQuarternary_exp(NuttParser.Quarternary_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quarternary_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitQuarternary_exp(NuttParser.Quarternary_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infix_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterInfix_exp(NuttParser.Infix_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infix_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitInfix_exp(NuttParser.Infix_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code map_initializer_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMap_initializer_exp(NuttParser.Map_initializer_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code map_initializer_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMap_initializer_exp(NuttParser.Map_initializer_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesis_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis_exp(NuttParser.Parenthesis_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesis_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis_exp(NuttParser.Parenthesis_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code record_member_access}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterRecord_member_access(NuttParser.Record_member_accessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code record_member_access}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitRecord_member_access(NuttParser.Record_member_accessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explicit_enum_case}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_enum_case(NuttParser.Explicit_enum_caseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explicit_enum_case}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_enum_case(NuttParser.Explicit_enum_caseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explicit_enumeration}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_enumeration(NuttParser.Explicit_enumerationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explicit_enumeration}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_enumeration(NuttParser.Explicit_enumerationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code match_to_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMatch_to_exp(NuttParser.Match_to_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code match_to_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMatch_to_exp(NuttParser.Match_to_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#fold}.
	 * @param ctx the parse tree
	 */
	void enterFold(NuttParser.FoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#fold}.
	 * @param ctx the parse tree
	 */
	void exitFold(NuttParser.FoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#range_array_initializer}.
	 * @param ctx the parse tree
	 */
	void enterRange_array_initializer(NuttParser.Range_array_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#range_array_initializer}.
	 * @param ctx the parse tree
	 */
	void exitRange_array_initializer(NuttParser.Range_array_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#map_element}.
	 * @param ctx the parse tree
	 */
	void enterMap_element(NuttParser.Map_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#map_element}.
	 * @param ctx the parse tree
	 */
	void exitMap_element(NuttParser.Map_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#map_initializer}.
	 * @param ctx the parse tree
	 */
	void enterMap_initializer(NuttParser.Map_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#map_initializer}.
	 * @param ctx the parse tree
	 */
	void exitMap_initializer(NuttParser.Map_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#record_element}.
	 * @param ctx the parse tree
	 */
	void enterRecord_element(NuttParser.Record_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#record_element}.
	 * @param ctx the parse tree
	 */
	void exitRecord_element(NuttParser.Record_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#record_initializer}.
	 * @param ctx the parse tree
	 */
	void enterRecord_initializer(NuttParser.Record_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#record_initializer}.
	 * @param ctx the parse tree
	 */
	void exitRecord_initializer(NuttParser.Record_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#operator_logical}.
	 * @param ctx the parse tree
	 */
	void enterOperator_logical(NuttParser.Operator_logicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#operator_logical}.
	 * @param ctx the parse tree
	 */
	void exitOperator_logical(NuttParser.Operator_logicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#default_match_branch}.
	 * @param ctx the parse tree
	 */
	void enterDefault_match_branch(NuttParser.Default_match_branchContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#default_match_branch}.
	 * @param ctx the parse tree
	 */
	void exitDefault_match_branch(NuttParser.Default_match_branchContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#match_branch}.
	 * @param ctx the parse tree
	 */
	void enterMatch_branch(NuttParser.Match_branchContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#match_branch}.
	 * @param ctx the parse tree
	 */
	void exitMatch_branch(NuttParser.Match_branchContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#final_match_branch}.
	 * @param ctx the parse tree
	 */
	void enterFinal_match_branch(NuttParser.Final_match_branchContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#final_match_branch}.
	 * @param ctx the parse tree
	 */
	void exitFinal_match_branch(NuttParser.Final_match_branchContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#case_list}.
	 * @param ctx the parse tree
	 */
	void enterCase_list(NuttParser.Case_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#case_list}.
	 * @param ctx the parse tree
	 */
	void exitCase_list(NuttParser.Case_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(NuttParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(NuttParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#nil}.
	 * @param ctx the parse tree
	 */
	void enterNil(NuttParser.NilContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#nil}.
	 * @param ctx the parse tree
	 */
	void exitNil(NuttParser.NilContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#boolean}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(NuttParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#boolean}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(NuttParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(NuttParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(NuttParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(NuttParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(NuttParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(NuttParser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(NuttParser.FunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#using_in_call}.
	 * @param ctx the parse tree
	 */
	void enterUsing_in_call(NuttParser.Using_in_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#using_in_call}.
	 * @param ctx the parse tree
	 */
	void exitUsing_in_call(NuttParser.Using_in_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#func_param_list}.
	 * @param ctx the parse tree
	 */
	void enterFunc_param_list(NuttParser.Func_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#func_param_list}.
	 * @param ctx the parse tree
	 */
	void exitFunc_param_list(NuttParser.Func_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#func_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunc_parameters(NuttParser.Func_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#func_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunc_parameters(NuttParser.Func_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#func_output}.
	 * @param ctx the parse tree
	 */
	void enterFunc_output(NuttParser.Func_outputContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#func_output}.
	 * @param ctx the parse tree
	 */
	void exitFunc_output(NuttParser.Func_outputContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#local_funct}.
	 * @param ctx the parse tree
	 */
	void enterLocal_funct(NuttParser.Local_functContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#local_funct}.
	 * @param ctx the parse tree
	 */
	void exitLocal_funct(NuttParser.Local_functContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#funcbody}.
	 * @param ctx the parse tree
	 */
	void enterFuncbody(NuttParser.FuncbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#funcbody}.
	 * @param ctx the parse tree
	 */
	void exitFuncbody(NuttParser.FuncbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#lambda_decl}.
	 * @param ctx the parse tree
	 */
	void enterLambda_decl(NuttParser.Lambda_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#lambda_decl}.
	 * @param ctx the parse tree
	 */
	void exitLambda_decl(NuttParser.Lambda_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#operator_infix}.
	 * @param ctx the parse tree
	 */
	void enterOperator_infix(NuttParser.Operator_infixContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#operator_infix}.
	 * @param ctx the parse tree
	 */
	void exitOperator_infix(NuttParser.Operator_infixContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#operator_composed}.
	 * @param ctx the parse tree
	 */
	void enterOperator_composed(NuttParser.Operator_composedContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#operator_composed}.
	 * @param ctx the parse tree
	 */
	void exitOperator_composed(NuttParser.Operator_composedContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#operator_math}.
	 * @param ctx the parse tree
	 */
	void enterOperator_math(NuttParser.Operator_mathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#operator_math}.
	 * @param ctx the parse tree
	 */
	void exitOperator_math(NuttParser.Operator_mathContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#operator_postfix}.
	 * @param ctx the parse tree
	 */
	void enterOperator_postfix(NuttParser.Operator_postfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#operator_postfix}.
	 * @param ctx the parse tree
	 */
	void exitOperator_postfix(NuttParser.Operator_postfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#composed_assign_op}.
	 * @param ctx the parse tree
	 */
	void enterComposed_assign_op(NuttParser.Composed_assign_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#composed_assign_op}.
	 * @param ctx the parse tree
	 */
	void exitComposed_assign_op(NuttParser.Composed_assign_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#op_mult}.
	 * @param ctx the parse tree
	 */
	void enterOp_mult(NuttParser.Op_multContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#op_mult}.
	 * @param ctx the parse tree
	 */
	void exitOp_mult(NuttParser.Op_multContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#op_div}.
	 * @param ctx the parse tree
	 */
	void enterOp_div(NuttParser.Op_divContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#op_div}.
	 * @param ctx the parse tree
	 */
	void exitOp_div(NuttParser.Op_divContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#operator_bitwise}.
	 * @param ctx the parse tree
	 */
	void enterOperator_bitwise(NuttParser.Operator_bitwiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#operator_bitwise}.
	 * @param ctx the parse tree
	 */
	void exitOperator_bitwise(NuttParser.Operator_bitwiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#operator_prefix}.
	 * @param ctx the parse tree
	 */
	void enterOperator_prefix(NuttParser.Operator_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#operator_prefix}.
	 * @param ctx the parse tree
	 */
	void exitOperator_prefix(NuttParser.Operator_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#operator_comparison}.
	 * @param ctx the parse tree
	 */
	void enterOperator_comparison(NuttParser.Operator_comparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#operator_comparison}.
	 * @param ctx the parse tree
	 */
	void exitOperator_comparison(NuttParser.Operator_comparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#op_less_equal}.
	 * @param ctx the parse tree
	 */
	void enterOp_less_equal(NuttParser.Op_less_equalContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#op_less_equal}.
	 * @param ctx the parse tree
	 */
	void exitOp_less_equal(NuttParser.Op_less_equalContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#op_greater_equal}.
	 * @param ctx the parse tree
	 */
	void enterOp_greater_equal(NuttParser.Op_greater_equalContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#op_greater_equal}.
	 * @param ctx the parse tree
	 */
	void exitOp_greater_equal(NuttParser.Op_greater_equalContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#op_not_similar}.
	 * @param ctx the parse tree
	 */
	void enterOp_not_similar(NuttParser.Op_not_similarContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#op_not_similar}.
	 * @param ctx the parse tree
	 */
	void exitOp_not_similar(NuttParser.Op_not_similarContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#op_not_equal}.
	 * @param ctx the parse tree
	 */
	void enterOp_not_equal(NuttParser.Op_not_equalContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#op_not_equal}.
	 * @param ctx the parse tree
	 */
	void exitOp_not_equal(NuttParser.Op_not_equalContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#op_equal}.
	 * @param ctx the parse tree
	 */
	void enterOp_equal(NuttParser.Op_equalContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#op_equal}.
	 * @param ctx the parse tree
	 */
	void exitOp_equal(NuttParser.Op_equalContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#kw_in}.
	 * @param ctx the parse tree
	 */
	void enterKw_in(NuttParser.Kw_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#kw_in}.
	 * @param ctx the parse tree
	 */
	void exitKw_in(NuttParser.Kw_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#kw_not_in}.
	 * @param ctx the parse tree
	 */
	void enterKw_not_in(NuttParser.Kw_not_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#kw_not_in}.
	 * @param ctx the parse tree
	 */
	void exitKw_not_in(NuttParser.Kw_not_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#kw_true}.
	 * @param ctx the parse tree
	 */
	void enterKw_true(NuttParser.Kw_trueContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#kw_true}.
	 * @param ctx the parse tree
	 */
	void exitKw_true(NuttParser.Kw_trueContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#kw_false}.
	 * @param ctx the parse tree
	 */
	void enterKw_false(NuttParser.Kw_falseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#kw_false}.
	 * @param ctx the parse tree
	 */
	void exitKw_false(NuttParser.Kw_falseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#kw_all}.
	 * @param ctx the parse tree
	 */
	void enterKw_all(NuttParser.Kw_allContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#kw_all}.
	 * @param ctx the parse tree
	 */
	void exitKw_all(NuttParser.Kw_allContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#inner_string}.
	 * @param ctx the parse tree
	 */
	void enterInner_string(NuttParser.Inner_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#inner_string}.
	 * @param ctx the parse tree
	 */
	void exitInner_string(NuttParser.Inner_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#normal_string}.
	 * @param ctx the parse tree
	 */
	void enterNormal_string(NuttParser.Normal_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#normal_string}.
	 * @param ctx the parse tree
	 */
	void exitNormal_string(NuttParser.Normal_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#interpolated_string}.
	 * @param ctx the parse tree
	 */
	void enterInterpolated_string(NuttParser.Interpolated_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#interpolated_string}.
	 * @param ctx the parse tree
	 */
	void exitInterpolated_string(NuttParser.Interpolated_stringContext ctx);
}