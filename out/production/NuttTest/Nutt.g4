grammar Nutt;

chunk: module? EOF;

module: module_start module_import* block KW_End;

module_start: KW_Module module_name;

module_name: NAME ('.' NAME)*;// ('.' '*')?
module_import: KW_Imports module_list;
module_deport: KW_Deports module_list;

module_list: module_name_or_group (',' module_name_or_group)*;
module_group: module_name (OP_LeftCurly module_list OP_RightCurly);

module_name_or_group: module_name
	| module_group;

block: (stat ';;'?)*;

stat: demand #demandStat
	| 'exec' '`' stat '`' #exec_stat
	| module_import #module_import_stat
	| module_deport #module_deport_stat
	| group_assignment #group_assignment_stat
    | var_decl #var_decl_stat
    | forget #forget_stat
    | KW_Funct flat_name_list funcbody #functiondef_stat
//    | macro_def #macrodef_stat
    | functioncall #functioncall_stat
    | do_done_block #do_done_block_stat
    | loop #loop_stat
    | composed_assign #composed_assign_stat
    | self_assign #self_in_place_op_stat
    | if_then_else_block #if_then_else_block_stat
    | try_catch #try_catch_stat
    | OP_Pass #pass_stat
    | type_def #type_def_stat
    | enum_def #enum_def_stat
    | record_def #record_def_stat
    | 'exit' #exit_stat
    | function_yield #yield_stat
    | break #break_stat
    | continue #continue_stat
    ;

type_param: flat_type=NAME
	| complex_type_start=NAME '|' (type_param | type_param_list);
type_param_list: '{' type_param (',' type_param)* '}';

//type_def: KW_Local? KW_Type derived_type=type_param ('of' generic_types=type_param_list)? (OP_Extends parent_type=type_param)?;
type_def: KW_Local? KW_Type derived_type=type_param (OP_Extends parent_type=type_param)? children=type_param_list;

OP_Extends: '<:';

record_def: KW_Local? KW_Record NAME OP_LeftCurly record_member_list implementation_list? OP_RightCurly;

KW_Implements: 'implements';

record_member: NAME by_type_var_decl;
record_member_list: record_member (',' record_member)*;

implementation_list: KW_Implements OP_LeftCurly implementation* OP_RightCurly;

implementation: lambda_decl;

using: OP_LeftCurly overloading_operator_param (',' overloading_operator_param)* OP_RightCurly;

overloading_operator_param: overloading_operator (',' overloading_operator)* KW_As NAME;

overloading_operator: operator_infix
	| operator_prefix;

enum_def: KW_Enum NAME OP_LeftCurly enum_case (',' enum_case)* OP_RightCurly;

KW_Local: 'local';
KW_Type: 'type';
KW_Record: 'record';
KW_Enum: 'enum';
KW_Is: 'is';

//

group_assignment: variables=explist OP_Assign expressions=explist;
//macro_def: KW_Define macro KW_As NAME;
do_done_block: KW_Do block KW_Done;
composed_assign: NAME operator_composed;

self_assign: NAME operator_postfix;
if_then_else_block: KW_If exp then_block else_block? KW_End;

KW_Repeat: 'repeat';
KW_Until: 'until';

KW_As: 'as';
KW_Define: 'define';

then_block: KW_Then? block;
else_block: KW_Else block;

forget: KW_Forget (kw_all | flat_name_list);

flat_name_list: NAME (',' NAME)*;

loop: for_each_loop
    | while_do_loop
    | repeat_until_loop;

for_each_loop: KW_For NAME op_direction explist do_done_block;

op_direction: OP_Forward
	| OP_Backward;

OP_Forward: '|->'
	| '↦';

OP_Backward: '<-|'
	| '↤';


while_do_loop: KW_While explist do_done_block;
repeat_until_loop: KW_Repeat block KW_Until explist;

break: 'break';
continue: 'continue';

function_yield: KW_Yield exp?;

try_catch: KW_Try try_branch=block KW_Catch catch_branch=block KW_End;
demand: KW_Demand exp;

//Nutt declarations start

var_decl: var_header by_type=by_type_var_decl? by_value=by_value_var_decl?;
func_param: func_param_header by_type=by_type_var_decl? by_value=by_value_var_decl?;

constant_qualifier: KW_VAR
	| KW_VAL;

var_header: constant_qualifier NAME;
func_param_header: constant_qualifier? NAME;

by_type_var_decl: ':' type_param;
by_value_var_decl: OP_Assign assign_right=exp;

enumeration_initializer: '{' enum_list '}';
list_initializer: '{' explist? '}';

//Nutt declarations end

enum_list: enum_case (',' enum_case)*;
explist: exp (',' exp)*;

OP_Map: '|>';
OP_Filter: '??';
OP_LambdaReturn: '==>';
OP_LeftFold: '<-';
OP_RightFold: '->';

enum_case: NAME
	| atom;

//macro_call: '$$' NAME;

exp: NAME #explicit_variable
	| atom #explicit_atom
	| 'eval' '`' exp '`' #eval_exp
	| record=exp OP_LeftBracket string_index=string OP_RightBracket #record_member_access
    | record=exp '.' index=exp #record_member_access
	| record_initializer #record_initializer_exp
	| map_initializer #map_initializer_exp
    | range_array_initializer #range_array_initializer_exp
    | OP_Pass exp #spread_exp
    | enum_case #explicit_enum_case
    | enumeration_initializer #explicit_enumeration
    | list_initializer #explicit_array
    | local_funct #function_definition_exp
    | functioncall #func_call_exp
    | operator_prefix exp #prefix_exp
    | left=exp operator_infix right=exp #infix_exp
    | left=exp '`' used=NAME '`' right=exp #using_exp
    | left=exp (in=kw_in | not_in=kw_not_in) right=exp #contains_exp
    | arr=exp OP_LeftBracket index=exp OP_RightBracket #array_access
    | left=exp fold right=exp #fold_exp
    | '(' exp ')' #parenthesis_exp
    | KW_TypeOf exp #type_of_exp
    | to_check=exp KW_InstanceOf (NAME | type_exp=exp) #instance_of_exp
    | exp KW_As type_param #type_cast
    | left=exp OP_Map right=exp #map_exp
    | left=exp OP_Filter right=exp #filter_exp
    | cond=exp '?' if_true=exp (':' if_false=exp)? ('@' if_undefined=exp)? #quarternary_exp
    | 'match' matched=exp 'to' match_branch+ default_match_branch? 'matched' #match_to_exp
    ;

fold: OP_LeftFold
	| OP_RightFold;

range_array_initializer: OP_LeftCurly start=exp (',' next=exp)? OP_Range bound=exp (';' OP_Reverse?)? OP_RightCurly;
map_element: key=exp ';' val=exp;
map_initializer: OP_LeftCurly map_element (',' map_element)* OP_RightCurly;
record_element: key=exp ':' val=exp;

record_initializer: OP_LeftCurly record_element (',' record_element)* OP_RightCurly;

//
operator_logical: OP_And
	| OP_Or
	| OP_Xor;

OP_And: '&&'
	| 'and'
	| '∧';

OP_Or: '||'
	| 'or'
	| '∨';

OP_Not: '!'
	| 'not'
	| '¬';

OP_Xor: 'xor'
	| '⊻'
	| '⊕';
//

default_match_branch: 'default' '-->' exp;
match_branch: final_match_branch? case_list '-->' exp;
final_match_branch: 'final';

case_list: exp (',' exp)*;

atom: nil
	| boolean
	| number
    | string;

nil: KW_Nil;

boolean: kw_true
	| kw_false;

number: Int
    | HexInt
    | Float
    | HexFloat;

string: Normal_string
    | Char_String;
    //| long_string;

//macro: macro_string;

functioncall: module_name? NAME using_in_call? '(' arguments=explist? ')';

using_in_call: OP_LeftCurly overloading_operator OP_RightCurly;

func_param_list: func_param (',' func_param)*;
//varargs: ',' OP_Pass;
func_parameters: '(' func_param_list? ')';
func_output: by_type_var_decl? (OP_LeftBracket default_output=exp OP_RightBracket)?;

local_funct: lambda_decl
    | (KW_Funct funcbody);

funcbody: func_parameters func_output OP_Assign block KW_Return;

KW_Return: 'return';

lambda_decl: ('\\' | 'Λ' | 'λ') using? func_parameters func_output OP_LambdaReturn lambda_exp=exp;

operator_infix: operator_bitwise
	| operator_math
	| operator_logical
	| operator_comparison;

operator_composed: composed_assign_op exp;

operator_math: OP_Add
    | OP_Sub
    | op_mult
    | op_div
    | OP_Mod
    | OP_IntDiv
    | OP_Power;

operator_postfix: operator_math operator_math;

composed_assign_op: operator_math OP_Assign;

OP_Range: '..';

OP_Add: '+';
OP_Sub: '-';

op_mult: '*'
	| '×'
	| '⋅';

op_div: '/'
	| '÷';

OP_Mod: '%';
OP_IntDiv: '//';
OP_Power: '^';

operator_bitwise: OP_Bit_LeftShift
    | OP_Bit_RightShift
    | OP_Arithmetic_LeftShift
    | OP_Arithmetic_RightShift
    | OP_Bit_Or
    | OP_Bit_And
    | OP_Bit_Xor;

operator_prefix: OP_Not
    | OP_Length
    | OP_Sub
    | OP_Add
    | OP_Tilda;

operator_comparison: OP_Less
    | OP_Greater
    | op_less_equal
    | op_greater_equal
    | op_not_similar
    | op_not_equal
    | OP_Similar
    | op_equal;

//CategoryStart: Operators

OP_Less: '<';
OP_Greater: '>';
op_less_equal: '<='
	| '≤'
	| '≦';
op_greater_equal: '>='
	| '≥'
	| '≧';
op_not_similar: '!='
	| '≠';

op_not_equal: '!=='
	| '≢';
OP_Similar: '==';
op_equal: '==='
	| '≡';

OP_Tilda: '~';
OP_Bit_LeftShift: '<<';
OP_Arithmetic_LeftShift: '<<<';
OP_Bit_RightShift: '>>';
OP_Arithmetic_RightShift: '>>>';
OP_Bit_Or: '|';
OP_Bit_And: '&';
OP_Bit_Xor: 'bxor';

OP_Length: '#';

OP_Assign: '=' ;
OP_RightBracket: ']' ;
OP_LeftBracket: '[' ;
OP_RightCurly: '}' ;
OP_LeftCurly: '{' ;
OP_Pass:'...';

//CategoryEnd: Operators

//CategoryStart: Keywords

KW_If: 'if';
KW_Then: 'then';
KW_Else: 'else';
KW_While: 'while';
//KW_Break: 'break';
KW_Funct: 'funct';
KW_Forget: 'forget';
KW_For: 'for';
KW_Done: 'done';
KW_Do: 'do';
kw_in: 'in'
    | '∈';
kw_not_in: OP_Not kw_in
	| '∉';
KW_Every: 'every';
KW_Reverse: 'reverse';
//KW_Continue: 'continue';
KW_Yield: 'yield';
KW_Catch: 'catch';
KW_Try: 'try';
KW_Demand: 'demand';
KW_Module: 'module';
KW_End: 'end';
KW_Imports: 'imports';
KW_Deports: 'deports';

KW_TypeOf: 'typeof';
KW_InstanceOf: 'instanceof';
KW_Nil: 'nil';
kw_true: 'true'
	| '⊤';
kw_false: 'false'
	| '⊥';

KW_VAR: 'var';
KW_VAL: 'val';
kw_all: 'all'
	| '∀';

//CategoryEnd: Keywords

//CategoryStart: LEX

NAME: [a-zA-Z_][a-zA-Z_0-9]*;

Normal_string: '"' Inner_string* '"';
Inner_string: Interpolated_string
//	| EscapeSequence
	| ~('"');
Interpolated_string: '${' Inner_string '}';


Char_String: '\'' Char* '\'';

fragment
Char: '\\\''
	| ~['];

fragment
MacroContent: ~'`';

fragment
DigitOrUnderscore: Digit
	| '_';

fragment
HexDigitOrUnderscore: HexDigit
	| '_';

Int: (Digit+ DigitOrUnderscore*)? Digit;
HexInt: '0' [xX] HexIntDigitPart;

Float: IntDigitPart '.' IntDigitPart ExponentPart?;
//    | '.' IntDigitPart ExponentPart?
//    | Digit+ DigitOrUnderscore* ExponentPart;

fragment
IntDigitPart: (Digit+ DigitOrUnderscore*)? Digit+;

fragment
HexIntDigitPart: (HexDigit+ HexDigitOrUnderscore*)? HexDigit+;

HexFloat: '0' [xX] (HexIntDigitPart? '.' HexIntDigitPart HexExponentPart? | HexIntDigitPart HexExponentPart);

fragment
ExponentPart: [eE] [+-]? Digit+;

fragment
HexExponentPart: [pP] [+-]? Digit+;

//World of Warcraft Lua additionally escapes |$#
EscapeCharacter: '\\' [abfnrtvz"'|$#\\];

EscapeSequence: EscapeCharacter
    | '\\' '\r'? '\n'
    | DecimalEscape
    | HexEscape
    | UtfEscape;

DecimalEscape: '\\' Digit
    | '\\' [0-2]? Digit Digit;

HexEscape: '\\' 'x' HexDigit HexDigit;

UtfEscape: '\\' 'u{' HexDigit+ '}';

fragment
Digit: [0-9];

fragment
HexDigit: [0-9a-fA-F];

fragment
SingleLineInputCharacter: ~[\r\n\u0085\u2028\u2029];

BlockComment: '/|' .*? '|\\' -> skip;
LineComment: '//|' ~[\r\n]* -> skip;
WS: [ \t\u000C\r\n]+ -> skip;

SHEBANG: '#' '!' SingleLineInputCharacter* -> channel(HIDDEN);

//CategoryEnd: LEX
OP_Reverse : '<|>';