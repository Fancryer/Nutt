// Generated from java-escape by ANTLR 4.11.1
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
	 * Enter a parse tree produced by {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(NuttParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(NuttParser.StatContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#type_select}.
	 * @param ctx the parse tree
	 */
	void enterType_select(NuttParser.Type_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#type_select}.
	 * @param ctx the parse tree
	 */
	void exitType_select(NuttParser.Type_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#type_member}.
	 * @param ctx the parse tree
	 */
	void enterType_member(NuttParser.Type_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#type_member}.
	 * @param ctx the parse tree
	 */
	void exitType_member(NuttParser.Type_memberContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#var_or_array_access}.
	 * @param ctx the parse tree
	 */
	void enterVar_or_array_access(NuttParser.Var_or_array_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#var_or_array_access}.
	 * @param ctx the parse tree
	 */
	void exitVar_or_array_access(NuttParser.Var_or_array_accessContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#functiondef_stat}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondef_stat(NuttParser.Functiondef_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#functiondef_stat}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondef_stat(NuttParser.Functiondef_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#macrodef_stat}.
	 * @param ctx the parse tree
	 */
	void enterMacrodef_stat(NuttParser.Macrodef_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#macrodef_stat}.
	 * @param ctx the parse tree
	 */
	void exitMacrodef_stat(NuttParser.Macrodef_statContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#in_place_op_stat}.
	 * @param ctx the parse tree
	 */
	void enterIn_place_op_stat(NuttParser.In_place_op_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#in_place_op_stat}.
	 * @param ctx the parse tree
	 */
	void exitIn_place_op_stat(NuttParser.In_place_op_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#self_in_place_op_stat}.
	 * @param ctx the parse tree
	 */
	void enterSelf_in_place_op_stat(NuttParser.Self_in_place_op_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#self_in_place_op_stat}.
	 * @param ctx the parse tree
	 */
	void exitSelf_in_place_op_stat(NuttParser.Self_in_place_op_statContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(NuttParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(NuttParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#reverse_for_loop}.
	 * @param ctx the parse tree
	 */
	void enterReverse_for_loop(NuttParser.Reverse_for_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#reverse_for_loop}.
	 * @param ctx the parse tree
	 */
	void exitReverse_for_loop(NuttParser.Reverse_for_loopContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#laststat}.
	 * @param ctx the parse tree
	 */
	void enterLaststat(NuttParser.LaststatContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#laststat}.
	 * @param ctx the parse tree
	 */
	void exitLaststat(NuttParser.LaststatContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#funcname}.
	 * @param ctx the parse tree
	 */
	void enterFuncname(NuttParser.FuncnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#funcname}.
	 * @param ctx the parse tree
	 */
	void exitFuncname(NuttParser.FuncnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(NuttParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(NuttParser.VarlistContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#short_var_decl}.
	 * @param ctx the parse tree
	 */
	void enterShort_var_decl(NuttParser.Short_var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#short_var_decl}.
	 * @param ctx the parse tree
	 */
	void exitShort_var_decl(NuttParser.Short_var_declContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#full_var_decl}.
	 * @param ctx the parse tree
	 */
	void enterFull_var_decl(NuttParser.Full_var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#full_var_decl}.
	 * @param ctx the parse tree
	 */
	void exitFull_var_decl(NuttParser.Full_var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void enterType_decl(NuttParser.Type_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void exitType_decl(NuttParser.Type_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#valuable_type}.
	 * @param ctx the parse tree
	 */
	void enterValuable_type(NuttParser.Valuable_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#valuable_type}.
	 * @param ctx the parse tree
	 */
	void exitValuable_type(NuttParser.Valuable_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#action_kind}.
	 * @param ctx the parse tree
	 */
	void enterAction_kind(NuttParser.Action_kindContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#action_kind}.
	 * @param ctx the parse tree
	 */
	void exitAction_kind(NuttParser.Action_kindContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#action_type}.
	 * @param ctx the parse tree
	 */
	void enterAction_type(NuttParser.Action_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#action_type}.
	 * @param ctx the parse tree
	 */
	void exitAction_type(NuttParser.Action_typeContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#number_type}.
	 * @param ctx the parse tree
	 */
	void enterNumber_type(NuttParser.Number_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#number_type}.
	 * @param ctx the parse tree
	 */
	void exitNumber_type(NuttParser.Number_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#int_type}.
	 * @param ctx the parse tree
	 */
	void enterInt_type(NuttParser.Int_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#int_type}.
	 * @param ctx the parse tree
	 */
	void exitInt_type(NuttParser.Int_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#float_type}.
	 * @param ctx the parse tree
	 */
	void enterFloat_type(NuttParser.Float_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#float_type}.
	 * @param ctx the parse tree
	 */
	void exitFloat_type(NuttParser.Float_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#generic_type_list}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_type_list(NuttParser.Generic_type_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#generic_type_list}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_type_list(NuttParser.Generic_type_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#list_type}.
	 * @param ctx the parse tree
	 */
	void enterList_type(NuttParser.List_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#list_type}.
	 * @param ctx the parse tree
	 */
	void exitList_type(NuttParser.List_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#list_length_decl}.
	 * @param ctx the parse tree
	 */
	void enterList_length_decl(NuttParser.List_length_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#list_length_decl}.
	 * @param ctx the parse tree
	 */
	void exitList_length_decl(NuttParser.List_length_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#set_type}.
	 * @param ctx the parse tree
	 */
	void enterSet_type(NuttParser.Set_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#set_type}.
	 * @param ctx the parse tree
	 */
	void exitSet_type(NuttParser.Set_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#map_type}.
	 * @param ctx the parse tree
	 */
	void enterMap_type(NuttParser.Map_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#map_type}.
	 * @param ctx the parse tree
	 */
	void exitMap_type(NuttParser.Map_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_type(NuttParser.Array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_type(NuttParser.Array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#string_type}.
	 * @param ctx the parse tree
	 */
	void enterString_type(NuttParser.String_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#string_type}.
	 * @param ctx the parse tree
	 */
	void exitString_type(NuttParser.String_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#functional_type}.
	 * @param ctx the parse tree
	 */
	void enterFunctional_type(NuttParser.Functional_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#functional_type}.
	 * @param ctx the parse tree
	 */
	void exitFunctional_type(NuttParser.Functional_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#nil_type}.
	 * @param ctx the parse tree
	 */
	void enterNil_type(NuttParser.Nil_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#nil_type}.
	 * @param ctx the parse tree
	 */
	void exitNil_type(NuttParser.Nil_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#var_decl_list}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl_list(NuttParser.Var_decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#var_decl_list}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl_list(NuttParser.Var_decl_listContext ctx);
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
	 * Enter a parse tree produced by the {@code logical_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLogical_exp(NuttParser.Logical_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logical_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLogical_exp(NuttParser.Logical_expContext ctx);
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
	 * Enter a parse tree produced by the {@code str_cat_expression}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterStr_cat_expression(NuttParser.Str_cat_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code str_cat_expression}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitStr_cat_expression(NuttParser.Str_cat_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary_expression}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(NuttParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary_expression}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(NuttParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwise_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBitwise_exp(NuttParser.Bitwise_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwise_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBitwise_exp(NuttParser.Bitwise_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fold_left_expression}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFold_left_expression(NuttParser.Fold_left_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fold_left_expression}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFold_left_expression(NuttParser.Fold_left_expressionContext ctx);
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
	 * Enter a parse tree produced by the {@code math_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMath_exp(NuttParser.Math_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code math_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMath_exp(NuttParser.Math_expContext ctx);
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
	 * Enter a parse tree produced by the {@code fold_right_expression}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFold_right_expression(NuttParser.Fold_right_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fold_right_expression}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFold_right_expression(NuttParser.Fold_right_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code power_expression}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPower_expression(NuttParser.Power_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code power_expression}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPower_expression(NuttParser.Power_expressionContext ctx);
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
	 * Enter a parse tree produced by the {@code explicit_macro}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_macro(NuttParser.Explicit_macroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explicit_macro}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_macro(NuttParser.Explicit_macroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison_expression}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterComparison_expression(NuttParser.Comparison_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison_expression}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitComparison_expression(NuttParser.Comparison_expressionContext ctx);
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
	 * Enter a parse tree produced by the {@code func_cat_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFunc_cat_exp(NuttParser.Func_cat_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code func_cat_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFunc_cat_exp(NuttParser.Func_cat_expContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#match_branch_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterMatch_branch_qualifier(NuttParser.Match_branch_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#match_branch_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitMatch_branch_qualifier(NuttParser.Match_branch_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#match_case}.
	 * @param ctx the parse tree
	 */
	void enterMatch_case(NuttParser.Match_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#match_case}.
	 * @param ctx the parse tree
	 */
	void exitMatch_case(NuttParser.Match_caseContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#explicit_nil}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_nil(NuttParser.Explicit_nilContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#explicit_nil}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_nil(NuttParser.Explicit_nilContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#explicit_bool}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_bool(NuttParser.Explicit_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#explicit_bool}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_bool(NuttParser.Explicit_boolContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#macro}.
	 * @param ctx the parse tree
	 */
	void enterMacro(NuttParser.MacroContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#macro}.
	 * @param ctx the parse tree
	 */
	void exitMacro(NuttParser.MacroContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(NuttParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(NuttParser.VarContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#valuable_output}.
	 * @param ctx the parse tree
	 */
	void enterValuable_output(NuttParser.Valuable_outputContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#valuable_output}.
	 * @param ctx the parse tree
	 */
	void exitValuable_output(NuttParser.Valuable_outputContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#default_output}.
	 * @param ctx the parse tree
	 */
	void enterDefault_output(NuttParser.Default_outputContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#default_output}.
	 * @param ctx the parse tree
	 */
	void exitDefault_output(NuttParser.Default_outputContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#func_ref}.
	 * @param ctx the parse tree
	 */
	void enterFunc_ref(NuttParser.Func_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#func_ref}.
	 * @param ctx the parse tree
	 */
	void exitFunc_ref(NuttParser.Func_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#func_copy}.
	 * @param ctx the parse tree
	 */
	void enterFunc_copy(NuttParser.Func_copyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#func_copy}.
	 * @param ctx the parse tree
	 */
	void exitFunc_copy(NuttParser.Func_copyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#func_concat}.
	 * @param ctx the parse tree
	 */
	void enterFunc_concat(NuttParser.Func_concatContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#func_concat}.
	 * @param ctx the parse tree
	 */
	void exitFunc_concat(NuttParser.Func_concatContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#func_any}.
	 * @param ctx the parse tree
	 */
	void enterFunc_any(NuttParser.Func_anyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#func_any}.
	 * @param ctx the parse tree
	 */
	void exitFunc_any(NuttParser.Func_anyContext ctx);
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
	 * Enter a parse tree produced by the {@code BitShiftLeft}
	 * labeled alternative in {@link NuttParser#operatorBitwise}.
	 * @param ctx the parse tree
	 */
	void enterBitShiftLeft(NuttParser.BitShiftLeftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitShiftLeft}
	 * labeled alternative in {@link NuttParser#operatorBitwise}.
	 * @param ctx the parse tree
	 */
	void exitBitShiftLeft(NuttParser.BitShiftLeftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitShiftRight}
	 * labeled alternative in {@link NuttParser#operatorBitwise}.
	 * @param ctx the parse tree
	 */
	void enterBitShiftRight(NuttParser.BitShiftRightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitShiftRight}
	 * labeled alternative in {@link NuttParser#operatorBitwise}.
	 * @param ctx the parse tree
	 */
	void exitBitShiftRight(NuttParser.BitShiftRightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitOr}
	 * labeled alternative in {@link NuttParser#operatorBitwise}.
	 * @param ctx the parse tree
	 */
	void enterBitOr(NuttParser.BitOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitOr}
	 * labeled alternative in {@link NuttParser#operatorBitwise}.
	 * @param ctx the parse tree
	 */
	void exitBitOr(NuttParser.BitOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitAnd}
	 * labeled alternative in {@link NuttParser#operatorBitwise}.
	 * @param ctx the parse tree
	 */
	void enterBitAnd(NuttParser.BitAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitAnd}
	 * labeled alternative in {@link NuttParser#operatorBitwise}.
	 * @param ctx the parse tree
	 */
	void exitBitAnd(NuttParser.BitAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#operatorUnary}.
	 * @param ctx the parse tree
	 */
	void enterOperatorUnary(NuttParser.OperatorUnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#operatorUnary}.
	 * @param ctx the parse tree
	 */
	void exitOperatorUnary(NuttParser.OperatorUnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#operatorComparison}.
	 * @param ctx the parse tree
	 */
	void enterOperatorComparison(NuttParser.OperatorComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#operatorComparison}.
	 * @param ctx the parse tree
	 */
	void exitOperatorComparison(NuttParser.OperatorComparisonContext ctx);
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
	 * Enter a parse tree produced by {@link NuttParser#in_place_op}.
	 * @param ctx the parse tree
	 */
	void enterIn_place_op(NuttParser.In_place_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#in_place_op}.
	 * @param ctx the parse tree
	 */
	void exitIn_place_op(NuttParser.In_place_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuttParser#self_in_place_op}.
	 * @param ctx the parse tree
	 */
	void enterSelf_in_place_op(NuttParser.Self_in_place_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuttParser#self_in_place_op}.
	 * @param ctx the parse tree
	 */
	void exitSelf_in_place_op(NuttParser.Self_in_place_opContext ctx);
}