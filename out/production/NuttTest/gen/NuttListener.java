// Generated from G:/Nutt/out/production/NuttTest\Nutt.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Nutt}.
 */
public interface NuttListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Nutt#chunk}.
	 * @param ctx the parse tree
	 */
	void enterChunk(Nutt.ChunkContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#chunk}.
	 * @param ctx the parse tree
	 */
	void exitChunk(Nutt.ChunkContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(Nutt.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(Nutt.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#module_start}.
	 * @param ctx the parse tree
	 */
	void enterModule_start(Nutt.Module_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#module_start}.
	 * @param ctx the parse tree
	 */
	void exitModule_start(Nutt.Module_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(Nutt.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(Nutt.Module_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#module_import}.
	 * @param ctx the parse tree
	 */
	void enterModule_import(Nutt.Module_importContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#module_import}.
	 * @param ctx the parse tree
	 */
	void exitModule_import(Nutt.Module_importContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#module_deport}.
	 * @param ctx the parse tree
	 */
	void enterModule_deport(Nutt.Module_deportContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#module_deport}.
	 * @param ctx the parse tree
	 */
	void exitModule_deport(Nutt.Module_deportContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#module_list}.
	 * @param ctx the parse tree
	 */
	void enterModule_list(Nutt.Module_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#module_list}.
	 * @param ctx the parse tree
	 */
	void exitModule_list(Nutt.Module_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#module_group}.
	 * @param ctx the parse tree
	 */
	void enterModule_group(Nutt.Module_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#module_group}.
	 * @param ctx the parse tree
	 */
	void exitModule_group(Nutt.Module_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#module_name_or_group}.
	 * @param ctx the parse tree
	 */
	void enterModule_name_or_group(Nutt.Module_name_or_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#module_name_or_group}.
	 * @param ctx the parse tree
	 */
	void exitModule_name_or_group(Nutt.Module_name_or_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Nutt.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Nutt.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code demandStat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void enterDemandStat(Nutt.DemandStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code demandStat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void exitDemandStat(Nutt.DemandStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exec_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void enterExec_stat(Nutt.Exec_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exec_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void exitExec_stat(Nutt.Exec_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code module_import_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void enterModule_import_stat(Nutt.Module_import_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code module_import_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void exitModule_import_stat(Nutt.Module_import_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code module_deport_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void enterModule_deport_stat(Nutt.Module_deport_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code module_deport_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void exitModule_deport_stat(Nutt.Module_deport_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code group_assignment_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void enterGroup_assignment_stat(Nutt.Group_assignment_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code group_assignment_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void exitGroup_assignment_stat(Nutt.Group_assignment_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code group_var_decl_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void enterGroup_var_decl_stat(Nutt.Group_var_decl_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code group_var_decl_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void exitGroup_var_decl_stat(Nutt.Group_var_decl_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var_decl_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl_stat(Nutt.Var_decl_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var_decl_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl_stat(Nutt.Var_decl_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forget_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void enterForget_stat(Nutt.Forget_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forget_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void exitForget_stat(Nutt.Forget_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functiondef_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondef_stat(Nutt.Functiondef_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functiondef_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondef_stat(Nutt.Functiondef_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functioncall_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall_stat(Nutt.Functioncall_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functioncall_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall_stat(Nutt.Functioncall_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code do_done_block_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void enterDo_done_block_stat(Nutt.Do_done_block_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code do_done_block_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void exitDo_done_block_stat(Nutt.Do_done_block_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loop_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void enterLoop_stat(Nutt.Loop_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loop_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void exitLoop_stat(Nutt.Loop_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code composed_assign_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void enterComposed_assign_stat(Nutt.Composed_assign_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code composed_assign_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void exitComposed_assign_stat(Nutt.Composed_assign_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code self_in_place_op_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void enterSelf_in_place_op_stat(Nutt.Self_in_place_op_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code self_in_place_op_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void exitSelf_in_place_op_stat(Nutt.Self_in_place_op_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if_then_else_block_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_then_else_block_stat(Nutt.If_then_else_block_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_then_else_block_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_then_else_block_stat(Nutt.If_then_else_block_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code try_catch_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void enterTry_catch_stat(Nutt.Try_catch_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code try_catch_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void exitTry_catch_stat(Nutt.Try_catch_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pass_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void enterPass_stat(Nutt.Pass_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pass_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void exitPass_stat(Nutt.Pass_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code type_def_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void enterType_def_stat(Nutt.Type_def_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code type_def_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void exitType_def_stat(Nutt.Type_def_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code record_def_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void enterRecord_def_stat(Nutt.Record_def_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code record_def_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void exitRecord_def_stat(Nutt.Record_def_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exit_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void enterExit_stat(Nutt.Exit_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exit_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void exitExit_stat(Nutt.Exit_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code yield_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void enterYield_stat(Nutt.Yield_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code yield_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void exitYield_stat(Nutt.Yield_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code break_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stat(Nutt.Break_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code break_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stat(Nutt.Break_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continue_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stat(Nutt.Continue_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continue_stat}
	 * labeled alternative in {@link Nutt#stat}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stat(Nutt.Continue_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#type_param}.
	 * @param ctx the parse tree
	 */
	void enterType_param(Nutt.Type_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#type_param}.
	 * @param ctx the parse tree
	 */
	void exitType_param(Nutt.Type_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#type_param_list}.
	 * @param ctx the parse tree
	 */
	void enterType_param_list(Nutt.Type_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#type_param_list}.
	 * @param ctx the parse tree
	 */
	void exitType_param_list(Nutt.Type_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#type_def}.
	 * @param ctx the parse tree
	 */
	void enterType_def(Nutt.Type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#type_def}.
	 * @param ctx the parse tree
	 */
	void exitType_def(Nutt.Type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#record_def}.
	 * @param ctx the parse tree
	 */
	void enterRecord_def(Nutt.Record_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#record_def}.
	 * @param ctx the parse tree
	 */
	void exitRecord_def(Nutt.Record_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#record_member}.
	 * @param ctx the parse tree
	 */
	void enterRecord_member(Nutt.Record_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#record_member}.
	 * @param ctx the parse tree
	 */
	void exitRecord_member(Nutt.Record_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#record_member_list}.
	 * @param ctx the parse tree
	 */
	void enterRecord_member_list(Nutt.Record_member_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#record_member_list}.
	 * @param ctx the parse tree
	 */
	void exitRecord_member_list(Nutt.Record_member_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#implementation_list}.
	 * @param ctx the parse tree
	 */
	void enterImplementation_list(Nutt.Implementation_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#implementation_list}.
	 * @param ctx the parse tree
	 */
	void exitImplementation_list(Nutt.Implementation_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#implementation}.
	 * @param ctx the parse tree
	 */
	void enterImplementation(Nutt.ImplementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#implementation}.
	 * @param ctx the parse tree
	 */
	void exitImplementation(Nutt.ImplementationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#using}.
	 * @param ctx the parse tree
	 */
	void enterUsing(Nutt.UsingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#using}.
	 * @param ctx the parse tree
	 */
	void exitUsing(Nutt.UsingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#overloading_operator_param}.
	 * @param ctx the parse tree
	 */
	void enterOverloading_operator_param(Nutt.Overloading_operator_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#overloading_operator_param}.
	 * @param ctx the parse tree
	 */
	void exitOverloading_operator_param(Nutt.Overloading_operator_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#overloading_operator}.
	 * @param ctx the parse tree
	 */
	void enterOverloading_operator(Nutt.Overloading_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#overloading_operator}.
	 * @param ctx the parse tree
	 */
	void exitOverloading_operator(Nutt.Overloading_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#group_assignment}.
	 * @param ctx the parse tree
	 */
	void enterGroup_assignment(Nutt.Group_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#group_assignment}.
	 * @param ctx the parse tree
	 */
	void exitGroup_assignment(Nutt.Group_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#do_done_block}.
	 * @param ctx the parse tree
	 */
	void enterDo_done_block(Nutt.Do_done_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#do_done_block}.
	 * @param ctx the parse tree
	 */
	void exitDo_done_block(Nutt.Do_done_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#composed_assign}.
	 * @param ctx the parse tree
	 */
	void enterComposed_assign(Nutt.Composed_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#composed_assign}.
	 * @param ctx the parse tree
	 */
	void exitComposed_assign(Nutt.Composed_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#self_assign}.
	 * @param ctx the parse tree
	 */
	void enterSelf_assign(Nutt.Self_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#self_assign}.
	 * @param ctx the parse tree
	 */
	void exitSelf_assign(Nutt.Self_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#if_then_else_block}.
	 * @param ctx the parse tree
	 */
	void enterIf_then_else_block(Nutt.If_then_else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#if_then_else_block}.
	 * @param ctx the parse tree
	 */
	void exitIf_then_else_block(Nutt.If_then_else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#then_block}.
	 * @param ctx the parse tree
	 */
	void enterThen_block(Nutt.Then_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#then_block}.
	 * @param ctx the parse tree
	 */
	void exitThen_block(Nutt.Then_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(Nutt.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(Nutt.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#forget}.
	 * @param ctx the parse tree
	 */
	void enterForget(Nutt.ForgetContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#forget}.
	 * @param ctx the parse tree
	 */
	void exitForget(Nutt.ForgetContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#flat_name_list}.
	 * @param ctx the parse tree
	 */
	void enterFlat_name_list(Nutt.Flat_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#flat_name_list}.
	 * @param ctx the parse tree
	 */
	void exitFlat_name_list(Nutt.Flat_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(Nutt.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(Nutt.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#for_each_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_each_loop(Nutt.For_each_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#for_each_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_each_loop(Nutt.For_each_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#op_direction}.
	 * @param ctx the parse tree
	 */
	void enterOp_direction(Nutt.Op_directionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#op_direction}.
	 * @param ctx the parse tree
	 */
	void exitOp_direction(Nutt.Op_directionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#while_do_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_do_loop(Nutt.While_do_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#while_do_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_do_loop(Nutt.While_do_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#repeat_until_loop}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_until_loop(Nutt.Repeat_until_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#repeat_until_loop}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_until_loop(Nutt.Repeat_until_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#function_yield}.
	 * @param ctx the parse tree
	 */
	void enterFunction_yield(Nutt.Function_yieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#function_yield}.
	 * @param ctx the parse tree
	 */
	void exitFunction_yield(Nutt.Function_yieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#try_catch}.
	 * @param ctx the parse tree
	 */
	void enterTry_catch(Nutt.Try_catchContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#try_catch}.
	 * @param ctx the parse tree
	 */
	void exitTry_catch(Nutt.Try_catchContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#demand}.
	 * @param ctx the parse tree
	 */
	void enterDemand(Nutt.DemandContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#demand}.
	 * @param ctx the parse tree
	 */
	void exitDemand(Nutt.DemandContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#group_var_decl}.
	 * @param ctx the parse tree
	 */
	void enterGroup_var_decl(Nutt.Group_var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#group_var_decl}.
	 * @param ctx the parse tree
	 */
	void exitGroup_var_decl(Nutt.Group_var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#var_signature}.
	 * @param ctx the parse tree
	 */
	void enterVar_signature(Nutt.Var_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#var_signature}.
	 * @param ctx the parse tree
	 */
	void exitVar_signature(Nutt.Var_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(Nutt.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(Nutt.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#func_param}.
	 * @param ctx the parse tree
	 */
	void enterFunc_param(Nutt.Func_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#func_param}.
	 * @param ctx the parse tree
	 */
	void exitFunc_param(Nutt.Func_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#constant_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterConstant_qualifier(Nutt.Constant_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#constant_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitConstant_qualifier(Nutt.Constant_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#var_header}.
	 * @param ctx the parse tree
	 */
	void enterVar_header(Nutt.Var_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#var_header}.
	 * @param ctx the parse tree
	 */
	void exitVar_header(Nutt.Var_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#func_param_header}.
	 * @param ctx the parse tree
	 */
	void enterFunc_param_header(Nutt.Func_param_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#func_param_header}.
	 * @param ctx the parse tree
	 */
	void exitFunc_param_header(Nutt.Func_param_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#by_type_var_decl}.
	 * @param ctx the parse tree
	 */
	void enterBy_type_var_decl(Nutt.By_type_var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#by_type_var_decl}.
	 * @param ctx the parse tree
	 */
	void exitBy_type_var_decl(Nutt.By_type_var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#by_value_var_decl}.
	 * @param ctx the parse tree
	 */
	void enterBy_value_var_decl(Nutt.By_value_var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#by_value_var_decl}.
	 * @param ctx the parse tree
	 */
	void exitBy_value_var_decl(Nutt.By_value_var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#list_initializer}.
	 * @param ctx the parse tree
	 */
	void enterList_initializer(Nutt.List_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#list_initializer}.
	 * @param ctx the parse tree
	 */
	void exitList_initializer(Nutt.List_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(Nutt.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(Nutt.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explicit_array}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_array(Nutt.Explicit_arrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explicit_array}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_array(Nutt.Explicit_arrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explicit_variable}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_variable(Nutt.Explicit_variableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explicit_variable}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_variable(Nutt.Explicit_variableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array_access}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void enterArray_access(Nutt.Array_accessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array_access}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void exitArray_access(Nutt.Array_accessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code type_cast}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void enterType_cast(Nutt.Type_castContext ctx);
	/**
	 * Exit a parse tree produced by the {@code type_cast}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void exitType_cast(Nutt.Type_castContext ctx);
	/**
	 * Enter a parse tree produced by the {@code using_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void enterUsing_exp(Nutt.Using_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code using_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void exitUsing_exp(Nutt.Using_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prefix_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_exp(Nutt.Prefix_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prefix_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_exp(Nutt.Prefix_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instance_of_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void enterInstance_of_exp(Nutt.Instance_of_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instance_of_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void exitInstance_of_exp(Nutt.Instance_of_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explicit_atom}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_atom(Nutt.Explicit_atomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explicit_atom}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_atom(Nutt.Explicit_atomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function_definition_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_exp(Nutt.Function_definition_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function_definition_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_exp(Nutt.Function_definition_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code type_of_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void enterType_of_exp(Nutt.Type_of_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code type_of_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void exitType_of_exp(Nutt.Type_of_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code contains_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void enterContains_exp(Nutt.Contains_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code contains_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void exitContains_exp(Nutt.Contains_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fold_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void enterFold_exp(Nutt.Fold_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fold_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void exitFold_exp(Nutt.Fold_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code range_array_initializer_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void enterRange_array_initializer_exp(Nutt.Range_array_initializer_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code range_array_initializer_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void exitRange_array_initializer_exp(Nutt.Range_array_initializer_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code map_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void enterMap_exp(Nutt.Map_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code map_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void exitMap_exp(Nutt.Map_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eval_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void enterEval_exp(Nutt.Eval_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eval_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void exitEval_exp(Nutt.Eval_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code record_initializer_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void enterRecord_initializer_exp(Nutt.Record_initializer_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code record_initializer_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void exitRecord_initializer_exp(Nutt.Record_initializer_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void enterFilter_exp(Nutt.Filter_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void exitFilter_exp(Nutt.Filter_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code func_call_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call_exp(Nutt.Func_call_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code func_call_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call_exp(Nutt.Func_call_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code spread_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void enterSpread_exp(Nutt.Spread_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code spread_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void exitSpread_exp(Nutt.Spread_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quarternary_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void enterQuarternary_exp(Nutt.Quarternary_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quarternary_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void exitQuarternary_exp(Nutt.Quarternary_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infix_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void enterInfix_exp(Nutt.Infix_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infix_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void exitInfix_exp(Nutt.Infix_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void enterBlock_exp(Nutt.Block_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void exitBlock_exp(Nutt.Block_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code map_initializer_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void enterMap_initializer_exp(Nutt.Map_initializer_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code map_initializer_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void exitMap_initializer_exp(Nutt.Map_initializer_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesis_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis_exp(Nutt.Parenthesis_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesis_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis_exp(Nutt.Parenthesis_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code record_member_access}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void enterRecord_member_access(Nutt.Record_member_accessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code record_member_access}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void exitRecord_member_access(Nutt.Record_member_accessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code match_to_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void enterMatch_to_exp(Nutt.Match_to_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code match_to_exp}
	 * labeled alternative in {@link Nutt#exp}.
	 * @param ctx the parse tree
	 */
	void exitMatch_to_exp(Nutt.Match_to_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#fold}.
	 * @param ctx the parse tree
	 */
	void enterFold(Nutt.FoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#fold}.
	 * @param ctx the parse tree
	 */
	void exitFold(Nutt.FoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#range_array_initializer}.
	 * @param ctx the parse tree
	 */
	void enterRange_array_initializer(Nutt.Range_array_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#range_array_initializer}.
	 * @param ctx the parse tree
	 */
	void exitRange_array_initializer(Nutt.Range_array_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#map_element}.
	 * @param ctx the parse tree
	 */
	void enterMap_element(Nutt.Map_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#map_element}.
	 * @param ctx the parse tree
	 */
	void exitMap_element(Nutt.Map_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#map_initializer}.
	 * @param ctx the parse tree
	 */
	void enterMap_initializer(Nutt.Map_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#map_initializer}.
	 * @param ctx the parse tree
	 */
	void exitMap_initializer(Nutt.Map_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#record_element}.
	 * @param ctx the parse tree
	 */
	void enterRecord_element(Nutt.Record_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#record_element}.
	 * @param ctx the parse tree
	 */
	void exitRecord_element(Nutt.Record_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#record_initializer}.
	 * @param ctx the parse tree
	 */
	void enterRecord_initializer(Nutt.Record_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#record_initializer}.
	 * @param ctx the parse tree
	 */
	void exitRecord_initializer(Nutt.Record_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#operator_logical}.
	 * @param ctx the parse tree
	 */
	void enterOperator_logical(Nutt.Operator_logicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#operator_logical}.
	 * @param ctx the parse tree
	 */
	void exitOperator_logical(Nutt.Operator_logicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#default_match_branch}.
	 * @param ctx the parse tree
	 */
	void enterDefault_match_branch(Nutt.Default_match_branchContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#default_match_branch}.
	 * @param ctx the parse tree
	 */
	void exitDefault_match_branch(Nutt.Default_match_branchContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#match_branch}.
	 * @param ctx the parse tree
	 */
	void enterMatch_branch(Nutt.Match_branchContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#match_branch}.
	 * @param ctx the parse tree
	 */
	void exitMatch_branch(Nutt.Match_branchContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(Nutt.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(Nutt.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#nil}.
	 * @param ctx the parse tree
	 */
	void enterNil(Nutt.NilContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#nil}.
	 * @param ctx the parse tree
	 */
	void exitNil(Nutt.NilContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#boolean}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(Nutt.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#boolean}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(Nutt.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(Nutt.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(Nutt.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#string}.
	 * @param ctx the parse tree
	 */
	void enterString(Nutt.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#string}.
	 * @param ctx the parse tree
	 */
	void exitString(Nutt.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#using_in_call}.
	 * @param ctx the parse tree
	 */
	void enterUsing_in_call(Nutt.Using_in_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#using_in_call}.
	 * @param ctx the parse tree
	 */
	void exitUsing_in_call(Nutt.Using_in_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#func_param_list}.
	 * @param ctx the parse tree
	 */
	void enterFunc_param_list(Nutt.Func_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#func_param_list}.
	 * @param ctx the parse tree
	 */
	void exitFunc_param_list(Nutt.Func_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#func_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunc_parameters(Nutt.Func_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#func_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunc_parameters(Nutt.Func_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#func_output}.
	 * @param ctx the parse tree
	 */
	void enterFunc_output(Nutt.Func_outputContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#func_output}.
	 * @param ctx the parse tree
	 */
	void exitFunc_output(Nutt.Func_outputContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#local_funct}.
	 * @param ctx the parse tree
	 */
	void enterLocal_funct(Nutt.Local_functContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#local_funct}.
	 * @param ctx the parse tree
	 */
	void exitLocal_funct(Nutt.Local_functContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#funcbody}.
	 * @param ctx the parse tree
	 */
	void enterFuncbody(Nutt.FuncbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#funcbody}.
	 * @param ctx the parse tree
	 */
	void exitFuncbody(Nutt.FuncbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#lambda_decl}.
	 * @param ctx the parse tree
	 */
	void enterLambda_decl(Nutt.Lambda_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#lambda_decl}.
	 * @param ctx the parse tree
	 */
	void exitLambda_decl(Nutt.Lambda_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#operator_infix}.
	 * @param ctx the parse tree
	 */
	void enterOperator_infix(Nutt.Operator_infixContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#operator_infix}.
	 * @param ctx the parse tree
	 */
	void exitOperator_infix(Nutt.Operator_infixContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#default_infix_operator}.
	 * @param ctx the parse tree
	 */
	void enterDefault_infix_operator(Nutt.Default_infix_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#default_infix_operator}.
	 * @param ctx the parse tree
	 */
	void exitDefault_infix_operator(Nutt.Default_infix_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#operator_composed}.
	 * @param ctx the parse tree
	 */
	void enterOperator_composed(Nutt.Operator_composedContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#operator_composed}.
	 * @param ctx the parse tree
	 */
	void exitOperator_composed(Nutt.Operator_composedContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#operator_math}.
	 * @param ctx the parse tree
	 */
	void enterOperator_math(Nutt.Operator_mathContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#operator_math}.
	 * @param ctx the parse tree
	 */
	void exitOperator_math(Nutt.Operator_mathContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#operator_postfix}.
	 * @param ctx the parse tree
	 */
	void enterOperator_postfix(Nutt.Operator_postfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#operator_postfix}.
	 * @param ctx the parse tree
	 */
	void exitOperator_postfix(Nutt.Operator_postfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#composed_assign_op}.
	 * @param ctx the parse tree
	 */
	void enterComposed_assign_op(Nutt.Composed_assign_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#composed_assign_op}.
	 * @param ctx the parse tree
	 */
	void exitComposed_assign_op(Nutt.Composed_assign_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#operator_bitwise}.
	 * @param ctx the parse tree
	 */
	void enterOperator_bitwise(Nutt.Operator_bitwiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#operator_bitwise}.
	 * @param ctx the parse tree
	 */
	void exitOperator_bitwise(Nutt.Operator_bitwiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#operator_prefix}.
	 * @param ctx the parse tree
	 */
	void enterOperator_prefix(Nutt.Operator_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#operator_prefix}.
	 * @param ctx the parse tree
	 */
	void exitOperator_prefix(Nutt.Operator_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link Nutt#operator_comparison}.
	 * @param ctx the parse tree
	 */
	void enterOperator_comparison(Nutt.Operator_comparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link Nutt#operator_comparison}.
	 * @param ctx the parse tree
	 */
	void exitOperator_comparison(Nutt.Operator_comparisonContext ctx);
}