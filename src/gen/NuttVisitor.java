// Generated from java-escape by ANTLR 4.11.1
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
	 * Visit a parse tree produced by {@link NuttParser#module_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_list(NuttParser.Module_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(NuttParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#operator_logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_logical(NuttParser.Operator_logicalContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(NuttParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#group_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_assignment(NuttParser.Group_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#functiondef_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondef_stat(NuttParser.Functiondef_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#macrodef_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacrodef_stat(NuttParser.Macrodef_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#do_done_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_done_block(NuttParser.Do_done_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#while_do_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_do_loop(NuttParser.While_do_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#in_place_op_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_place_op_stat(NuttParser.In_place_op_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#self_in_place_op_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf_in_place_op_stat(NuttParser.Self_in_place_op_statContext ctx);
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
	 * Visit a parse tree produced by {@link NuttParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(NuttParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#for_each_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_each_loop(NuttParser.For_each_loopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link NuttParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(NuttParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReverseForLoop}
	 * labeled alternative in {@link NuttParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReverseForLoop(NuttParser.ReverseForLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForEachLoop}
	 * labeled alternative in {@link NuttParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEachLoop(NuttParser.ForEachLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#attnamelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttnamelist(NuttParser.AttnamelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#attrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrib(NuttParser.AttribContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#laststat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLaststat(NuttParser.LaststatContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#function_yield}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_yield(NuttParser.Function_yieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#funcname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncname(NuttParser.FuncnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(NuttParser.VarlistContext ctx);
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
	 * Visit a parse tree produced by {@link NuttParser#short_var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShort_var_decl(NuttParser.Short_var_declContext ctx);
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
	 * Visit a parse tree produced by {@link NuttParser#full_var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_var_decl(NuttParser.Full_var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#type_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_decl(NuttParser.Type_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#action_kind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction_kind(NuttParser.Action_kindContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#action_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction_type(NuttParser.Action_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#list_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_initializer(NuttParser.List_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#number_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_type(NuttParser.Number_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#int_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_type(NuttParser.Int_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#float_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_type(NuttParser.Float_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#generic_type_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_type_list(NuttParser.Generic_type_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#list_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_type(NuttParser.List_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#list_length_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_length_decl(NuttParser.List_length_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#varExpOrPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpOrPar(NuttParser.VarExpOrParContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#set_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_type(NuttParser.Set_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#map_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_type(NuttParser.Map_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_type(NuttParser.Array_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#string_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_type(NuttParser.String_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#either_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEither_type(NuttParser.Either_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#functional_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctional_type(NuttParser.Functional_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#nil_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil_type(NuttParser.Nil_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#namelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamelist(NuttParser.NamelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(NuttParser.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code power_expression}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower_expression(NuttParser.Power_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logical_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_exp(NuttParser.Logical_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explicit_variable}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_variable(NuttParser.Explicit_variableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code func_call_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call_exp(NuttParser.Func_call_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code type_cast}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_cast(NuttParser.Type_castContext ctx);
	/**
	 * Visit a parse tree produced by the {@code str_cat_expression}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr_cat_expression(NuttParser.Str_cat_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fold_expression}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFold_expression(NuttParser.Fold_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explicit_macro}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_macro(NuttParser.Explicit_macroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison_expression}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_expression(NuttParser.Comparison_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary_expression}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(NuttParser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitwise_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwise_exp(NuttParser.Bitwise_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code math_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_exp(NuttParser.Math_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explicit_atom}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_atom(NuttParser.Explicit_atomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesis_exp}
	 * labeled alternative in {@link NuttParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis_exp(NuttParser.Parenthesis_expContext ctx);
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
	 * Visit a parse tree produced by {@link NuttParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(NuttParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#explicit_nil}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_nil(NuttParser.Explicit_nilContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#explicit_bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_bool(NuttParser.Explicit_boolContext ctx);
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
	 * Visit a parse tree produced by {@link NuttParser#macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro(NuttParser.MacroContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#functioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(NuttParser.FunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#varOrExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarOrExp(NuttParser.VarOrExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#parExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExp(NuttParser.ParExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(NuttParser.VarContext ctx);
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
	 * Visit a parse tree produced by {@link NuttParser#either_output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEither_output(NuttParser.Either_outputContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#default_output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_output(NuttParser.Default_outputContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#functiondef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondef(NuttParser.FunctiondefContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#funcbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncbody(NuttParser.FuncbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#func_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_ref(NuttParser.Func_refContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#func_copy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_copy(NuttParser.Func_copyContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#func_concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_concat(NuttParser.Func_concatContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#func_any}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_any(NuttParser.Func_anyContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#lambda_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_decl(NuttParser.Lambda_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#parlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParlist(NuttParser.ParlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#fieldlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldlist(NuttParser.FieldlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(NuttParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommaSep}
	 * labeled alternative in {@link NuttParser#fieldsep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaSep(NuttParser.CommaSepContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SemicolonSep}
	 * labeled alternative in {@link NuttParser#fieldsep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolonSep(NuttParser.SemicolonSepContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitShiftLeft}
	 * labeled alternative in {@link NuttParser#operatorBitwise}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitShiftLeft(NuttParser.BitShiftLeftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitShiftRight}
	 * labeled alternative in {@link NuttParser#operatorBitwise}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitShiftRight(NuttParser.BitShiftRightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitOr}
	 * labeled alternative in {@link NuttParser#operatorBitwise}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitOr(NuttParser.BitOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitAnd}
	 * labeled alternative in {@link NuttParser#operatorBitwise}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitAnd(NuttParser.BitAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#operatorUnary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorUnary(NuttParser.OperatorUnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#operatorComparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorComparison(NuttParser.OperatorComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#operator_math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_math(NuttParser.Operator_mathContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#in_place_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_place_op(NuttParser.In_place_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuttParser#self_in_place_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf_in_place_op(NuttParser.Self_in_place_opContext ctx);
}