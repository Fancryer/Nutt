// Generated from G:/Nutt/src/main/java\NuttParser.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NuttParser}.
 */
public interface NuttParserListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link NuttParser#module_require}.
	 * @param ctx the parse tree
	 */
	void enterModule_require(NuttParser.Module_requireContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#module_require}.
	 * @param ctx the parse tree
	 */
	void exitModule_require(NuttParser.Module_requireContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#named_import}.
	 * @param ctx the parse tree
	 */
	void enterNamed_import(NuttParser.Named_importContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#named_import}.
	 * @param ctx the parse tree
	 */
	void exitNamed_import(NuttParser.Named_importContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#named_import_list}.
	 * @param ctx the parse tree
	 */
	void enterNamed_import_list(NuttParser.Named_import_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#named_import_list}.
	 * @param ctx the parse tree
	 */
	void exitNamed_import_list(NuttParser.Named_import_listContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#functiondef}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondef(NuttParser.FunctiondefContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#functiondef}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondef(NuttParser.FunctiondefContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#funct_modifier}.
	 * @param ctx the parse tree
	 */
	void enterFunct_modifier(NuttParser.Funct_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#funct_modifier}.
	 * @param ctx the parse tree
	 */
	void exitFunct_modifier(NuttParser.Funct_modifierContext ctx);
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
	 * Enter a parse tree produced by the {@code do_if_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDo_if_stat(NuttParser.Do_if_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code do_if_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDo_if_stat(NuttParser.Do_if_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code do_if_not_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDo_if_not_stat(NuttParser.Do_if_not_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code do_if_not_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDo_if_not_stat(NuttParser.Do_if_not_statContext ctx);
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
	 * Enter a parse tree produced by the {@code operator_decl_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterOperator_decl_stat(NuttParser.Operator_decl_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operator_decl_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitOperator_decl_stat(NuttParser.Operator_decl_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code annotation_decl_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation_decl_stat(NuttParser.Annotation_decl_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code annotation_decl_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation_decl_stat(NuttParser.Annotation_decl_statContext ctx);
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
	 * Enter a parse tree produced by the {@code trait_def_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterTrait_def_stat(NuttParser.Trait_def_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trait_def_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitTrait_def_stat(NuttParser.Trait_def_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class_def_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterClass_def_stat(NuttParser.Class_def_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class_def_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitClass_def_stat(NuttParser.Class_def_statContext ctx);
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
	 * Enter a parse tree produced by the {@code return_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stat(NuttParser.Return_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stat(NuttParser.Return_statContext ctx);
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
	 * Enter a parse tree produced by the {@code match_to_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterMatch_to_stat(NuttParser.Match_to_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code match_to_stat}
	 * labeled alternative in {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitMatch_to_stat(NuttParser.Match_to_statContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#template_type}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_type(NuttParser.Template_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#template_type}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_type(NuttParser.Template_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#relation_type}.
	 * @param ctx the parse tree
	 */
	void enterRelation_type(NuttParser.Relation_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#relation_type}.
	 * @param ctx the parse tree
	 */
	void exitRelation_type(NuttParser.Relation_typeContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#trait_def}.
	 * @param ctx the parse tree
	 */
	void enterTrait_def(NuttParser.Trait_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#trait_def}.
	 * @param ctx the parse tree
	 */
	void exitTrait_def(NuttParser.Trait_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#class_header}.
	 * @param ctx the parse tree
	 */
	void enterClass_header(NuttParser.Class_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#class_header}.
	 * @param ctx the parse tree
	 */
	void exitClass_header(NuttParser.Class_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#class_def}.
	 * @param ctx the parse tree
	 */
	void enterClass_def(NuttParser.Class_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#class_def}.
	 * @param ctx the parse tree
	 */
	void exitClass_def(NuttParser.Class_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#access_modifier}.
	 * @param ctx the parse tree
	 */
	void enterAccess_modifier(NuttParser.Access_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#access_modifier}.
	 * @param ctx the parse tree
	 */
	void exitAccess_modifier(NuttParser.Access_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#class_member}.
	 * @param ctx the parse tree
	 */
	void enterClass_member(NuttParser.Class_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#class_member}.
	 * @param ctx the parse tree
	 */
	void exitClass_member(NuttParser.Class_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#signature_def}.
	 * @param ctx the parse tree
	 */
	void enterSignature_def(NuttParser.Signature_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#signature_def}.
	 * @param ctx the parse tree
	 */
	void exitSignature_def(NuttParser.Signature_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#funct_signature}.
	 * @param ctx the parse tree
	 */
	void enterFunct_signature(NuttParser.Funct_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#funct_signature}.
	 * @param ctx the parse tree
	 */
	void exitFunct_signature(NuttParser.Funct_signatureContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#operator_decl}.
	 * @param ctx the parse tree
	 */
	void enterOperator_decl(NuttParser.Operator_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#operator_decl}.
	 * @param ctx the parse tree
	 */
	void exitOperator_decl(NuttParser.Operator_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#operator_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterOperator_qualifier(NuttParser.Operator_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#operator_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitOperator_qualifier(NuttParser.Operator_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#annotation_decl}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation_decl(NuttParser.Annotation_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#annotation_decl}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation_decl(NuttParser.Annotation_declContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#function_return}.
	 * @param ctx the parse tree
	 */
	void enterFunction_return(NuttParser.Function_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#function_return}.
	 * @param ctx the parse tree
	 */
	void exitFunction_return(NuttParser.Function_returnContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(NuttParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(NuttParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#var_signature}.
	 * @param ctx the parse tree
	 */
	void enterVar_signature(NuttParser.Var_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#var_signature}.
	 * @param ctx the parse tree
	 */
	void exitVar_signature(NuttParser.Var_signatureContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#scope_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterScope_qualifier(NuttParser.Scope_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#scope_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitScope_qualifier(NuttParser.Scope_qualifierContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#type_flat_name}.
	 * @param ctx the parse tree
	 */
	void enterType_flat_name(NuttParser.Type_flat_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#type_flat_name}.
	 * @param ctx the parse tree
	 */
	void exitType_flat_name(NuttParser.Type_flat_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#alias_decl}.
	 * @param ctx the parse tree
	 */
	void enterAlias_decl(NuttParser.Alias_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#alias_decl}.
	 * @param ctx the parse tree
	 */
	void exitAlias_decl(NuttParser.Alias_declContext ctx);
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
	 * Enter a parse tree produced by the {@code this_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterThis_exp(NuttParser.This_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code this_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitThis_exp(NuttParser.This_expContext ctx);
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
	 * Enter a parse tree produced by the {@code compose_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterCompose_exp(NuttParser.Compose_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compose_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitCompose_exp(NuttParser.Compose_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code property_access}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterProperty_access(NuttParser.Property_accessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code property_access}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitProperty_access(NuttParser.Property_accessContext ctx);
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
	 * Enter a parse tree produced by the {@code exec_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExec_exp(NuttParser.Exec_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exec_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExec_exp(NuttParser.Exec_expContext ctx);
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
	 * Enter a parse tree produced by the {@code array_initializer_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterArray_initializer_exp(NuttParser.Array_initializer_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array_initializer_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitArray_initializer_exp(NuttParser.Array_initializer_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comprehense_array_initializer_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterComprehense_array_initializer_exp(NuttParser.Comprehense_array_initializer_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comprehense_array_initializer_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitComprehense_array_initializer_exp(NuttParser.Comprehense_array_initializer_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explicit_type}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_type(NuttParser.Explicit_typeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explicit_type}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_type(NuttParser.Explicit_typeContext ctx);
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
	 * Enter a parse tree produced by the {@code common_of_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterCommon_of_exp(NuttParser.Common_of_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code common_of_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitCommon_of_exp(NuttParser.Common_of_expContext ctx);
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
	 * Enter a parse tree produced by the {@code explicit_operator_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_operator_exp(NuttParser.Explicit_operator_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explicit_operator_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_operator_exp(NuttParser.Explicit_operator_expContext ctx);
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
	 * Enter a parse tree produced by the {@code block_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBlock_exp(NuttParser.Block_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBlock_exp(NuttParser.Block_expContext ctx);
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
	 * Enter a parse tree produced by the {@code op_call_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOp_call_exp(NuttParser.Op_call_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code op_call_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOp_call_exp(NuttParser.Op_call_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code reverse_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterReverse_exp(NuttParser.Reverse_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code reverse_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitReverse_exp(NuttParser.Reverse_expContext ctx);
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
	 * Enter a parse tree produced by the {@code new_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNew_exp(NuttParser.New_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code new_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNew_exp(NuttParser.New_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#match_to}.
	 * @param ctx the parse tree
	 */
	void enterMatch_to(NuttParser.Match_toContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#match_to}.
	 * @param ctx the parse tree
	 */
	void exitMatch_to(NuttParser.Match_toContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#array_initializer}.
	 * @param ctx the parse tree
	 */
	void enterArray_initializer(NuttParser.Array_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#array_initializer}.
	 * @param ctx the parse tree
	 */
	void exitArray_initializer(NuttParser.Array_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#array_element}.
	 * @param ctx the parse tree
	 */
	void enterArray_element(NuttParser.Array_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#array_element}.
	 * @param ctx the parse tree
	 */
	void exitArray_element(NuttParser.Array_elementContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#comprehense_array_initializer}.
	 * @param ctx the parse tree
	 */
	void enterComprehense_array_initializer(NuttParser.Comprehense_array_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#comprehense_array_initializer}.
	 * @param ctx the parse tree
	 */
	void exitComprehense_array_initializer(NuttParser.Comprehense_array_initializerContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#record_element_list}.
	 * @param ctx the parse tree
	 */
	void enterRecord_element_list(NuttParser.Record_element_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#record_element_list}.
	 * @param ctx the parse tree
	 */
	void exitRecord_element_list(NuttParser.Record_element_listContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#int}.
	 * @param ctx the parse tree
	 */
	void enterInt(NuttParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#int}.
	 * @param ctx the parse tree
	 */
	void exitInt(NuttParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#float}.
	 * @param ctx the parse tree
	 */
	void enterFloat(NuttParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#float}.
	 * @param ctx the parse tree
	 */
	void exitFloat(NuttParser.FloatContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#explicit_operator}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_operator(NuttParser.Explicit_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#explicit_operator}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_operator(NuttParser.Explicit_operatorContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#var_signature_list}.
	 * @param ctx the parse tree
	 */
	void enterVar_signature_list(NuttParser.Var_signature_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#var_signature_list}.
	 * @param ctx the parse tree
	 */
	void exitVar_signature_list(NuttParser.Var_signature_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#vararg_or_signature}.
	 * @param ctx the parse tree
	 */
	void enterVararg_or_signature(NuttParser.Vararg_or_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#vararg_or_signature}.
	 * @param ctx the parse tree
	 */
	void exitVararg_or_signature(NuttParser.Vararg_or_signatureContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#default_infix_operator}.
	 * @param ctx the parse tree
	 */
	void enterDefault_infix_operator(NuttParser.Default_infix_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#default_infix_operator}.
	 * @param ctx the parse tree
	 */
	void exitDefault_infix_operator(NuttParser.Default_infix_operatorContext ctx);
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
}