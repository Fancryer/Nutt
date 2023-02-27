grammar Nutt;
import NuttMathLex,NuttLogical;

chunk: module? EOF;

module: module_start module_import* block KW_End;

module_start: KW_Module module_name;

module_name: NAME ('.' NAME)*;// ('.' '*')?
module_import: KW_Imports (KW_ALL | module_name | module_list);

module_list: module_name (',' module_name)*;

block: stat*;

operator_logical: OP_And
	| OP_Or;

OP_And: '&&'
	| 'and';

OP_Or: '||'
	| 'or';

OP_Not: '!'
	| 'not';


// ';' #Semicolon
stat: demand
	| group_assignment
    | var_decl
    | forget
    | functiondef_stat
    | macrodef_stat
    | functioncall
    //| label #LabelDeclaring
    | KW_Break
    //| 'goto' NAME #GoTo
    | do_done_block
    | loop
    | in_place_op_stat
    | self_in_place_op_stat
    | if_then_else_block
    //| 'local' 'funct' NAME funcbody #LocalFunct
    //| 'local' attnamelist (OP_Assign explist)? #LocalVar
    | try_catch
    | OP_Pass
    | laststat
    | type_def
    | enum_def
    ;

type_def: KW_Type NAME KW_Is OP_LeftCurly type_select (',' type_select)* OP_RightCurly;
type_select: type_decl | NAME;

type_member: enum_case | type_decl | NAME;

enum_def: KW_Enum NAME KW_Is OP_LeftBracket enum_case (',' enum_case)* OP_RightBracket;

KW_Type: 'type';
KW_Enum: 'enum';
KW_Is: 'is';

var_or_array_access: var | arr=exp OP_LeftBracket index=exp OP_RightBracket;

group_assignment: var_or_array_access (',' var_or_array_access)* OP_Assign exp (',' exp)*;
functiondef_stat: KW_Funct funcname func_any;
macrodef_stat: KW_Define macro KW_As var;
do_done_block: KW_Do block KW_Done;
in_place_op_stat: var in_place_op exp;
self_in_place_op_stat: var self_in_place_op;
if_then_else_block: KW_If exp then_block else_block? KW_End;

KW_Repeat: 'repeat';
KW_Until: 'until';

KW_As: 'as';
KW_Define: 'define';

then_block: KW_Then? block;
else_block: KW_Else block;

forget: KW_Forget (KW_ALL | flat_name_list);

flat_name_list: NAME (',' NAME)*;

loop: for_loop
	| reverse_for_loop
    | for_each_loop
    | while_do_loop
    | repeat_until_loop;

for_loop: KW_For var_header by_value_var_decl ',' counterBound=exp(',' step=exp)? do_done_block;
reverse_for_loop: KW_Reverse for_loop;
for_each_loop: KW_For KW_Every var_decl KW_In explist do_done_block;
while_do_loop: KW_While explist do_done_block;
repeat_until_loop: KW_Repeat block KW_Until explist;


laststat: function_yield
    | KW_Break
    | KW_Continue;

function_yield: KW_Yield exp?;

funcname: NAME ('.' NAME)*;

varlist: var (',' var)*;

try_catch: KW_Try try_branch=block KW_Catch catch_branch=block KW_End;
demand: KW_Demand exp;









//Nutt declarations start

var_decl: var_header (short_var_decl
    | by_type_var_decl
    | by_value_var_decl
    | full_var_decl);

constant_qualifier: KW_VAR
	| KW_VAL;

var_header: constant_qualifier NAME;

short_var_decl: (OP_Assign nil_type)?;
by_type_var_decl: ':' type=type_decl;
by_value_var_decl: OP_Assign assign_right=exp;
full_var_decl: ':' type=type_decl OP_Assign assign_right=exp;

type_decl: valuable_type
	| functional_type
    | (action_type | '(' action_type ')')
    | number_type
    | list_type
    | nil_type;

valuable_type: 'Valuable';

action_kind: TW_Actionable
	| TW_Procedure
	| TW_Macro;

TW_Actionable: 'Actionable';
TW_Procedure: 'Procedure';
TW_Macro: 'Macro';

action_type: action_kind func_parameters? ('|=>' type_decl)?;

enumeration_initializer: '{' enum_list '}';

list_initializer: '{' explist? '}';

//Nutt declarations end

//Nutt types start

number_type: 'Numerable'
    | int_type
    | float_type;

int_type: 'Int';
float_type: 'Float';

generic_type_list: 'Listable';

list_type: (generic_type_list
    | set_type
    | map_type
    | string_type
    | array_type) (list_length_decl? '|' type_decl)?;

list_length_decl: OP_Length exp;

set_type: 'Set' | 'Enumeration';
map_type: 'Map';
array_type: 'Array';
string_type: 'String';

functional_type: 'Functional';
nil_type: 'Nil';

//Nutt types end

var_decl_list: var_decl (',' var_decl)*;


enum_list: enum_case (',' enum_case)*;
explist: exp (',' exp)*;

//| '...' #ExplicitEpsilon
//| tableconstructor #TableConstructor
//| <assoc=right> exp operatorFunctCat exp #FunctCatExpression
//| exp operatorAnd exp #AndExpression
//| exp operatorOr exp #OrExpression

enum_case: '.' NAME;

exp: var #explicit_variable
	| atom #explicit_atom
    | macro #explicit_macro
    | enum_case #explicit_enum_case
    | enumeration_initializer #explicit_enumeration
    | list_initializer #explicit_array
    | functiondef #function_definition_exp
    | funcname '(' arguments=explist? ')' #func_call_exp
    | left=exp operatorBitwise right=exp #bitwise_exp
    | operatorUnary exp #unary_expression
    | left=exp operator_math right=exp #math_exp
    | left=exp operatorComparison right=exp #comparison_expression
    | left=exp operator_logical right=exp #logical_exp
    | arr=exp OP_LeftBracket index=exp OP_RightBracket #array_access
    | <assoc=right> left=exp op=OP_STRCAT right=exp #str_cat_expression
    | left=exp OP_LeftFold right=exp #fold_left_expression
    | left=exp OP_RightFold right=exp #fold_right_expression
    | <assoc=right> left=exp OP_Power right=exp #power_expression
    | '(' exp ')' #parenthesis_exp
    | KW_TypeOf exp #type_of_exp
    | to_check=exp KW_InstanceOf (type_decl | type_exp=exp) #instance_of_exp
    | exp KW_As type_decl #type_cast
    | funcname OP_FunctCat funcname #func_cat_exp
    | exp '?' if_true=exp ('@' if_false=exp)? ('@' if_undefined=exp)? #quarternary_exp
    | 'match' exp 'to' match_branch (',' match_branch)* 'matched' #match_to_exp
    ;

match_branch: match_branch_qualifier? match_case (',' match_case)? '->' exp;
match_branch_qualifier: 'final';

match_case: enum_case
	| explicit_bool
	| number
	| string
	| exp;

atom: explicit_nil
	| explicit_bool
	| number
    | string;

explicit_nil: KW_Nil;

explicit_bool: KW_True
	| KW_False;

number: INT
    | HEX
    | FLOAT
    | HEX_FLOAT;

string: NORMALSTRING
    | CHARSTRING
    | LONGSTRING;

macro: MACROSTRING;

functioncall: (NAME '.')? NAME '(' explist? ')';

var: NAME;// varSuffix) varSuffix*;


func_parameters: var_decl
	| ('(' var_decl_list? ')');
func_output: (valuable_output | default_output) OP_Assign;

valuable_output: (':' valuable_type)?;
default_output: ':' (type_decl);

functiondef: lambda_decl
    | (KW_Funct func_any);

funcbody: func_parameters func_output block KW_Return;

KW_Return: 'return';

func_ref: OP_FunctRef (exp | functiondef);
func_copy: OP_FunctCopy (exp | functiondef);
func_concat: OP_FunctCat (exp | functiondef);

func_any: lambda_decl
    | func_ref
    | func_copy
    | func_concat
    | funcbody;

lambda_decl: '\\' (var_decl | func_parameters) OP_LambdaReturn (stat | exp);

operatorBitwise: OP_BIT_LSHIFT #BitShiftLeft
    | OP_BIT_RSHIFT #BitShiftRight
    | OP_BIT_OR #BitOr
    | OP_BIT_AND #BitAnd;

operatorUnary: OP_Not
    | OP_Length
    | OP_Sub
    | OP_Add
    | OP_Tilda;

operatorComparison: OP_Less
    | OP_Greater
    | OP_LessEqual
    | OP_GreaterEqual
    | OP_NotSimilar
    | OP_NotEqual
    | OP_Similar
    | OP_Equal;

//CategoryStart: Operators

OP_LambdaReturn: '==>';
OP_FunctRef: '<==';
OP_FunctCopy: '<=>';
OP_FunctCat: '<|';

OP_LeftFold: '<-';
OP_RightFold: '->';

OP_Less: '<';
OP_Greater: '>';
OP_LessEqual: '<=';
OP_GreaterEqual: '>=';
OP_NotSimilar: '!=';
OP_NotEqual: '!==';
OP_Similar: '==';
OP_Equal: '===';

OP_Tilda: '~';
OP_BIT_LSHIFT: OP_Less OP_Less;
OP_BIT_RSHIFT: '>>';
OP_BIT_OR: '|';
OP_BIT_AND: '&';

OP_Length: '#';
OP_Power: '^';

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
KW_Break: 'break';
KW_Funct: 'funct';
KW_Forget: 'forget';
KW_For: 'for';
KW_Done: 'done';
KW_Do: 'do';
KW_In: 'in';
KW_Every: 'every';
KW_Reverse: 'reverse';
KW_Continue: 'continue';
KW_Yield: 'yield';
KW_Catch: 'catch';
KW_Try: 'try';
KW_Demand: 'demand';
KW_Module: 'module';
KW_End: 'end';
KW_Imports: 'imports';

KW_TypeOf: 'typeof';
KW_InstanceOf: 'instanceof';
KW_Nil: 'nil';
KW_True: 'true';
KW_False: 'false';

KW_VAR: 'var';
KW_VAL: 'val';
KW_ALL: 'all';

//CategoryEnd: Keywords

//CategoryStart: LEX

NAME: [a-zA-Z_][a-zA-Z_0-9]*;

NORMALSTRING: '"' (EscapeSequence | ~('\\'|'"'))* '"';
CHARSTRING: '\'' (EscapeSequence | ~('\''|'\\'))* '\'';
LONGSTRING: '[' NESTED_STR ']';
MACROSTRING: '`' (EscapeSequence | ~('\\'|'`'))* '`';

fragment
NESTED_STR: '=' NESTED_STR '='
    | '[' .*? ']';

INT: Digit+;
HEX: '0' [xX] HexDigit+;

FLOAT: Digit+ '.' Digit* ExponentPart?
    | '.' Digit+ ExponentPart?
    | Digit+ ExponentPart;

HEX_FLOAT: '0' [xX] HexDigit+ '.' HexDigit* HexExponentPart?
    | '0' [xX] '.' HexDigit+ HexExponentPart?
    | '0' [xX] HexDigit+ HexExponentPart;

fragment
ExponentPart: [eE] [+-]? Digit+;

fragment
HexExponentPart: [pP] [+-]? Digit+;

fragment
EscapeSequence: '\\' [abfnrtvz"'|$#\\]   // World of Warcraft Lua additionally escapes |$#
    | '\\' '\r'? '\n'
    | DecimalEscape
    | HexEscape
    | UtfEscape;

fragment
DecimalEscape: '\\' Digit
    | '\\' Digit Digit
    | '\\' [0-2] Digit Digit;

fragment
HexEscape: '\\' 'x' HexDigit HexDigit;

fragment
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