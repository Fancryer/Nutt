parser grammar Nutt;

options
{
	tokenVocab=NuttLexer;
}

chunk: module? EOF;

module: module_start module_require* module_import* block KW_End;

module_start: KW_Module module_name;

module_name: NAME (Dot NAME)*;

module_require: KW_Requires named_import_list;

named_import: module_name (KW_As NAME)?;
named_import_list: named_import (Comma named_import)?;

module_import: KW_Imports module_list;
module_deport: KW_Deports module_list;

module_list: module_name_or_group (Comma module_name_or_group)*;
module_group: module_name (OP_LeftCurly module_list OP_RightCurly);

module_name_or_group: module_name
	| module_group;

block: stat*;

stat: demand #demandStat
//	| exp #statExp
	| KW_Doif exp stat #do_if_stat
	| KW_Doifn exp stat #do_if_not_stat
	| KW_Exec OP_LeftPar stat OP_RightPar #exec_stat
	| module_import #module_import_stat
	| module_deport #module_deport_stat
	| group_assignment #group_assignment_stat
	| group_var_decl #group_var_decl_stat
    | var_decl #var_decl_stat
    | operator_decl #operator_decl_stat
    | annotation_decl #annotation_decl_stat
    | forget #forget_stat
    | KW_Funct flat_name_list funcbody #functiondef_stat
    | /*module_name?*/ name=exp using_in_call? OP_LeftPar arguments=explist? OP_RightPar #functioncall_stat
    | do_done_block #do_done_block_stat
    | loop #loop_stat
    | composed_assign #composed_assign_stat
    | self_assign #self_in_place_op_stat
    | if_then_else_block #if_then_else_block_stat
    | try_catch #try_catch_stat
    | OP_Pass #pass_stat
    | type_def #type_def_stat
//    | enum_def #enum_def_stat
    | record_def #record_def_stat
    | KW_Exit #exit_stat
    | function_yield #yield_stat
    | KW_Break #break_stat
    | KW_Continue #continue_stat
    ;

type_param: flat_type=NAME
	| complex_type_start=NAME OP_Bit_Or (type_param | type_param_list);
type_param_list: OP_LeftCurly type_param (Comma type_param)* OP_RightCurly;

type_def: KW_Type derived_type=type_param (OP_Extends parent_type=type_param)? children=type_param_list;

record_def: annotation* KW_Record NAME OP_LeftCurly record_member_list implementation_list? OP_RightCurly;

record_member: string by_type_var_decl;
record_member_list: record_member (Comma record_member)*;

implementation_list: KW_Implements (operator_decl | lambda_decl)*;

using: OP_LeftCurly overloading_operator_param (Comma overloading_operator_param)* OP_RightCurly;

overloading_operator_param: overloading_operator (Comma overloading_operator)* KW_As NAME;

overloading_operator: operator_infix
	| operator_prefix
	| operator_postfix;

//enum_def: KW_Enum NAME OP_LeftCurly enum_case (Comma enum_case)* OP_RightCurly;

operator_decl: (KW_Prefix | KW_Infix | KW_Postfix)? KW_Operator overloading_operator local_funct;

annotation_decl: KW_Annotation NAME OP_LeftCurly (KW_Param? var_signature)* KW_Yield exp OP_RightCurly;

group_assignment: variables=explist OP_Assign expressions=explist;
do_done_block: KW_Do block KW_Done;
composed_assign: NAME operator_composed;

self_assign: NAME operator_postfix;
if_then_else_block: KW_If exp then_block else_block? KW_End;

then_block: KW_Then? block;
else_block: KW_Else block;

forget: KW_Forget (KW_All | flat_name_list);

flat_name_list: NAME (Comma NAME)*;

loop: for_each_loop
    | while_do_loop
    | repeat_until_loop;

for_each_loop: KW_For NAME op_direction explist stat;

op_direction: OP_Forward
	| OP_Backward;

while_do_loop: KW_While explist stat;

repeat_until_loop: KW_Repeat block KW_Until explist;

function_yield: KW_Yield exp?;

try_catch: KW_Try try_branch=block KW_Catch catch_branch=block KW_End;
demand: KW_Demand exp (KW_With string)?;

//Nutt declarations start

annotation: AtSign NAME (OP_LeftPar record_element_list OP_RightPar)?;

group_var_decl: (KW_Vars | KW_Vals) var_signature_list;

var_signature: NAME by_type=by_type_var_decl? by_value=by_value_var_decl?;

var_decl: constant_qualifier var_signature;

constant_qualifier: KW_VAR | KW_VAL;

by_type_var_decl: Colon type_param;
by_value_var_decl: OP_Assign assign_right=exp;

list_initializer: OP_LeftCurly explist? OP_RightCurly;

//Nutt declarations end

explist: exp (Comma exp)*;

exp: NAME #explicit_variable
	| atom #explicit_atom
	| type_param #explicit_type
	| operator #explicit_operator
	| do_done_block #block_exp
	| OP_Reverse exp #reverse_exp
	| exp OP_Compose exp #compose_exp
	| KW_New exp OP_LeftPar explist OP_RightPar #new_exp
	| KW_Eval OP_LeftPar (exp | block) OP_RightPar #eval_exp
    | record=exp Dot index=string #record_member_access
	| record_initializer #record_initializer_exp
	| map_initializer #map_initializer_exp
    | range_array_initializer #range_array_initializer_exp
	| comprehense_array_initializer #comprehense_array_initializer_exp
    | OP_Pass exp #spread_exp
    | list_initializer #explicit_array
    | local_funct #function_definition_exp
    | operator_prefix exp #prefix_exp
    | left=exp operator_infix right=exp #infix_exp
    | name=exp using_in_call? OP_LeftPar arguments=explist? OP_RightPar #func_call_exp
    | op=operator_infix OP_LeftPar arguments=explist? OP_RightPar #op_call_exp
    | left=exp BackTick used=NAME BackTick right=exp #using_exp
    | left=exp (in=KW_In | not_in=KW_Not_In) right=exp #contains_exp
    | arr=exp OP_LeftBracket index=exp OP_RightBracket #array_access
//    | left=exp fold right=exp #fold_exp
    | OP_LeftPar exp OP_RightPar #parenthesis_exp
    | KW_TypeOf exp #type_of_exp
    | KW_CommonOf explist #common_of_exp
    | to_check=exp KW_InstanceOf (NAME | type_exp=exp) #instance_of_exp
//    | exp KW_As type_param #type_cast
//    | left=exp OP_Map right=exp #map_exp
//    | left=exp OP_Filter right=exp #filter_exp
    | cond=exp Question if_true=exp (Colon if_false=exp)? #quarternary_exp// (AtSign if_undefined=exp)? #quarternary_exp
    | KW_Match matched=exp KW_To match_branch+ default_match_branch? #match_to_exp
    ;

//fold: OP_LeftFold | OP_RightFold;

range_array_initializer: OP_LeftCurly start=exp (Comma next=exp)? OP_Range bound=exp (SemiColon OP_Reverse)? OP_RightCurly;

comprehense_array_initializer: OP_LeftCurly (element=exp KW_Of)? NAME op_direction arr=exp (KW_If pred=exp)? OP_RightCurly;

map_element: key=(Char_String | NAME) SemiColon val=exp;
map_initializer: OP_LeftCurly map_element (Comma map_element)* OP_RightCurly;

record_element: (name_key=NAME | string_key=string) Colon val=exp;
record_element_list: record_element (Comma record_element)*;
record_initializer: OP_LeftCurly record_element_list OP_RightCurly;

operator_logical: OP_And
	| OP_Or
	| OP_Xor;

default_match_branch: KW_Default OP_Case_Arrow exp;
match_branch: KW_Final? explist OP_Case_Arrow branch_exp=exp;

atom: nil
	| boolean
	| number
    | string;

nil: KW_Nil;

boolean: KW_True
	| KW_False;

number: Int
    | HexInt
    | Float
    | HexFloat;

string: Normal_string
    | Char_String;

operator: BackTick operator_infix BackTick;

using_in_call: OP_LeftCurly overloading_operator OP_RightCurly;

var_signature_list: var_signature (Comma var_signature)* (Comma vararg)? | vararg;
vararg: OP_Pass var_signature;

//varargs: Comma OP_Pass;
func_output: by_type_var_decl? (OP_LeftBracket default_output=exp OP_RightBracket)?;

local_funct: lambda_decl
    | (KW_Funct funcbody);

funcbody: annotation* using? (var_signature | OP_LeftPar var_signature_list? OP_RightPar) func_output OP_Assign block KW_Return;
lambda_decl: annotation* using? (var_signature | OP_LeftPar var_signature_list? OP_RightPar) func_output OP_LambdaReturn lambda_exp=exp;

operator_infix: default_infix_operator
	| Op_Custom;

default_infix_operator: operator_math
    | operator_logical
    | operator_comparison
    | OP_Append
    | OP_Reverse;

operator_composed: composed_assign_op exp;

operator_math: OP_Add
    | OP_Sub
    | OP_Mult
    | OP_Div
    | OP_Mod
    | OP_IntDiv
    | OP_Power;

operator_postfix: operator_math operator_math
	| Op_Custom;

composed_assign_op: operator_infix OP_Assign;

//operator_bitwise: OP_Bit_LeftShift
//    | OP_Bit_RightShift
//    | OP_Arithmetic_LeftShift
//    | OP_Arithmetic_RightShift
//    | OP_Bit_Or
//    | OP_Bit_And
//    | OP_Bit_Xor;

operator_prefix: OP_Not
    | OP_Length
    | OP_Sub
    | OP_Add
    | Op_Custom
    ;

operator_comparison: OP_Less
    | OP_Greater
    | OP_Less_Equal
    | Op_Greater_Equal
    | Op_Not_Similar
    | Op_Not_Equal
    | OP_Similar
    | OP_Equal;