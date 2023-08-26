parser grammar Nutt;

options
{
	tokenVocab=NuttLexer;
}

chunk: module? EOF;

module: module_start module_require* module_import* block KW_End;

module_start: KW_Module module_name;

module_name: NAME (Dot NAME)* (KW_As NAME)?;

module_require: KW_Requires named_import_list;

named_import: module_name (KW_As NAME)?;
named_import_list: named_import (Comma named_import)?;

module_import: KW_Imports module_list;
module_deport: KW_Deports module_list;

module_list: module_name_or_group (Comma module_name_or_group)*;
module_group: module_name (Brace_Curly_Left module_list Brace_Curly_Right | Dot KW_All) (KW_As NAME)?;

module_name_or_group: module_name
	| module_group;

block: stat*;

functiondef: KW_Funct flat_name_list funcbody;

funct_modifier: KW_Pure | KW_Static;

stat: demand #demandStat
	| KW_Doif exp stat #do_if_stat
	| KW_Doifn exp stat #do_if_not_stat
	| KW_Exec exp #exec_stat
	| module_import #module_import_stat
	| module_deport #module_deport_stat
	| group_assignment #group_assignment_stat
    | var_decl #var_decl_stat
    | operator_decl #operator_decl_stat
    | annotation_decl #annotation_decl_stat
    | forget #forget_stat
    | functiondef #functiondef_stat
    | name=exp (KW_With using_in_call)? Brace_Paren_Left arguments=explist? Brace_Paren_Right #functioncall_stat
    | do_done_block #do_done_block_stat
    | loop #loop_stat
    | composed_assign #composed_assign_stat
    | self_assign #self_in_place_op_stat
    | if_then_else_block #if_then_else_block_stat
    | try_catch #try_catch_stat
    | OP_Pass #pass_stat
    | type_def #type_def_stat
    | trait_def #trait_def_stat
    | class_def #class_def_stat
//    | enum_def #enum_def_stat
    | record_def #record_def_stat
    | KW_Exit #exit_stat
    | function_return #return_stat
    | function_yield #yield_stat
    | KW_Break #break_stat
    | KW_Continue #continue_stat
    | match_to #match_to_stat
    ;


type_param: flat_type=type_flat_name
	| Brace_Paren_Left type_param Brace_Paren_Right
	| template_type
	| relation_type
	| sum_type=type_param (OP_Add sum_type=type_param)+
//	| union_type=type_param (OP_Mult union_type=type_param)+
	;
template_type: name=type_flat_name Brace_Square_Left type_param_list Brace_Square_Right;
relation_type: KW_Type (OP_Extends type_param OP_Implements type_param | OP_Extends type_param | OP_Implements type_param);
type_param_list: type_param (Comma type_param)*;

trait_def: KW_Trait type_flat_name (OP_Extends parent_trait=type_flat_name)? Brace_Curly_Left signature_def* Brace_Curly_Right;

class_header: KW_Class class_name=type_flat_name
	(OP_Extends parent_class=type_flat_name)?
	(OP_Implements trait=type_flat_name
	(Comma trait=type_flat_name)*)?;

class_def: annotation* class_header Brace_Curly_Left class_member* Brace_Curly_Right;

access_modifier: KW_Public | KW_Protected | KW_Private;

class_member: operator_decl
	| access_modifier? (functiondef | var_decl);

signature_def: NAME funct_signature;
funct_signature: funct_modifier? using? (vararg_or_signature | Brace_Paren_Left var_signature_list? Brace_Paren_Right) func_output;

type_def: KW_Type derived_type=type_param (OP_Extends parent_type=type_param)? (children=type_param_list | OP_Assign type_param);

record_def:
annotation* KW_Record record_name=NAME (OP_Extends parent_record=NAME)? (OP_Implements trait=NAME (Comma trait=NAME)*)?
Brace_Curly_Left
	record_member_list
Brace_Curly_Right;

record_member: (string by_type_var_decl) | operator_decl | functiondef;
record_member_list: record_member*;

using: Brace_Curly_Left overloading_operator_param (Comma overloading_operator_param)* Brace_Curly_Right;

overloading_operator_param: overloading_operator (Comma overloading_operator)* KW_As NAME;

overloading_operator: operator_infix
	| operator_prefix
	| operator_postfix;

//enum_def: KW_Enum NAME Brace_Curly_Left enum_case (Comma enum_case)* Brace_Curly_Right;

operator_decl: operator_qualifier? KW_Operator? overloading_operator local_funct;
operator_qualifier: KW_Prefix | KW_Infix | KW_Postfix;

annotation_decl: KW_Annotation NAME Brace_Curly_Left (KW_Param? vararg_or_signature)* KW_Return exp Brace_Curly_Right;

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

for_each_loop: KW_For ind=(OP_Underscore|NAME) (Comma val=(OP_Underscore|NAME))? op_direction explist stat;

op_direction: OP_Forward
	| OP_Backward;

while_do_loop: KW_While explist stat;

repeat_until_loop: KW_Repeat stat KW_Until explist;

function_return: KW_Return exp?;
function_yield: KW_Yield explist;

try_catch: KW_Try try_branch=stat KW_Catch catch_branch=stat KW_End?;
demand: KW_Demand exp (KW_With string)?;

//Nutt declarations start

annotation: AtSign NAME (Brace_Paren_Left record_element_list Brace_Paren_Right)?;

var_signature: NAME by_type=by_type_var_decl? by_value=by_value_var_decl?;

var_decl: scope_qualifier? constant_qualifier var_signature_list | alias_decl;

scope_qualifier: KW_Global | KW_Outer Brace_Paren_Left exp Brace_Paren_Right;

constant_qualifier: KW_Var | KW_Val | KW_Mut;

type_flat_name: NAME;

alias_decl: KW_Alias anchor_name=NAME KW_As alias_name=NAME (Comma alias_name=NAME)*;


by_type_var_decl: Colon type_param;
by_value_var_decl: OP_Assign assign_right=exp;

//Nutt declarations end

explist: exp (Comma exp)*;

exp: NAME #explicit_variable
	| KW_This #this_exp
	| OP_Pass exp #spread_exp
	| atom #explicit_atom
	| type_param #explicit_type
	| explicit_operator #explicit_operator_exp
	| do_done_block #block_exp
	| OP_Reverse exp #reverse_exp
	| exp OP_Compose exp #compose_exp
	| KW_New exp Brace_Paren_Left explist Brace_Paren_Right #new_exp
	| KW_Eval (exp | block) #eval_exp
	| KW_Exec (exp | stat) #exec_exp
    | exp Dot
	    (
			flat_property=NAME
			| string_property=string
			| (Brace_Square_Left operator_qualifier Brace_Square_Right)? operator=explicit_operator
		) #property_access
	| array_initializer #array_initializer_exp
    | range_array_initializer #range_array_initializer_exp
    | map_initializer #map_initializer_exp
    | record_initializer #record_initializer_exp
	| comprehense_array_initializer #comprehense_array_initializer_exp
    | local_funct #function_definition_exp
    | (explicit_operator | operator_prefix) exp #prefix_exp
    | left=exp (explicit_operator | operator_infix) right=exp #infix_exp
    | exp (KW_With using_in_call)? Brace_Paren_Left arguments=explist? Brace_Paren_Right #func_call_exp
    | op=explicit_operator Brace_Paren_Left arguments=explist? Brace_Paren_Right #op_call_exp
    | left=exp BackTick used=NAME BackTick right=exp #using_exp
    | left=exp (in=KW_In | not_in=KW_Not_In) right=exp #contains_exp
    | Brace_Paren_Left exp Brace_Paren_Right #parenthesis_exp
    | KW_TypeOf exp #type_of_exp
    | KW_CommonOf explist #common_of_exp
    | to_check=exp KW_InstanceOf type_exp=exp #instance_of_exp
//    | exp KW_As type_param #type_cast
    | cond=exp Question if_true=exp (Colon if_false=exp)? #quarternary_exp// (AtSign if_undefined=exp)? #quarternary_exp
    | match_to #match_to_exp
    ;

match_to: KW_Match matched=exp KW_To match_branch+ default_match_branch?;

array_initializer: Brace_Curly_Left (array_element (Comma array_element)*)? Brace_Curly_Right;

array_element: OP_Pass? exp;

range_array_initializer: Brace_Curly_Left start=exp (Comma next=exp)? OP_Range bound=exp (SemiColon OP_Reverse)? Brace_Curly_Right;

comprehense_array_initializer: Brace_Curly_Left (element=exp KW_Of)? NAME op_direction arr=exp (KW_If pred=exp)? Brace_Curly_Right;

map_element: key=exp SemiColon val=exp;
map_initializer: Brace_Curly_Left map_element (Comma map_element)* Brace_Curly_Right;

record_element: (name_key=NAME | string_key=string) Colon val=exp;
record_element_list: record_element (Comma record_element)*;
record_initializer: Brace_Curly_Left record_element_list Brace_Curly_Right;

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

number: int
    | float;

int: Int
	| HexInt;

float: Float
	| HexFloat;

string: Normal_string
    | Char_String;

explicit_operator: BackTick operator_infix BackTick;

using_in_call: Brace_Curly_Left overloading_operator (Comma overloading_operator)* Brace_Curly_Right;

var_signature_list: vararg_or_signature (Comma vararg_or_signature)*;
vararg_or_signature: OP_Pass? var_signature;

//varargs: Comma OP_Pass;
func_output: (by_type_var_decl | Colon exp)? (Brace_Square_Left default_output=exp Brace_Square_Right)?;

local_funct: lambda_decl
    | (KW_Funct funcbody);

funcbody: annotation* funct_signature OP_Assign block KW_End;
lambda_decl: annotation* funct_signature OP_LambdaReturn lambda_exp=exp;

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
//    | OP_Or
//    | OP_Bit_And
//    | OP_Bit_Xor;

operator_prefix: OP_Not
    | OP_Length
    | OP_Sub
    | OP_Add
    | Op_Custom;

operator_comparison: OP_Less
    | OP_Greater
    | OP_Less_Equal
    | Op_Greater_Equal
    | Op_Not_Similar
    | Op_Not_Equal
    | OP_Similar
    | OP_Equal;