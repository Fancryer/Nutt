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
	| OP_Or
	| OP_Not;

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
    //| 'if' exp 'then' block ('elseif' exp 'then' block)* ('else' block)? KW_End #IfThenElse
    //| loop #LoopStatement
    //| 'local' 'funct' NAME funcbody #LocalFunct
    //| 'local' attnamelist ('=' explist)? #LocalVar
    //| try_catch #TryCatch
    | OP_Pass
    | laststat
    ;

OP_Pass: '...';

group_assignment: varlist '=' explist;
functiondef_stat: KW_Funct funcname func_any;
macrodef_stat: KW_Define macro KW_As var;
do_done_block: KW_Do block KW_Done;
while_do_loop: KW_While explist do_done_block;
repeat_until_loop: KW_Repeat block KW_Until explist;
in_place_op_stat: var in_place_op varExpOrPar;
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

for_loop: KW_For var_header by_value_var_decl ',' counterBound=exp(',' step=exp)? do_done_block;
for_each_loop: KW_For KW_Every var_decl KW_In explist do_done_block;

loop: for_loop #ForLoop
	| KW_Reverse for_loop #ReverseForLoop
    | for_each_loop #ForEachLoop
    | while_do_loop #WhileDoLoop
    | repeat_until_loop #RepeatUntilLoop;

attnamelist: NAME attrib (',' NAME attrib)*;

attrib: ('<' NAME '>')?;

laststat: function_yield
    | KW_Break
    | KW_Continue;

function_yield: KW_Yield exp?;



//label: '::' NAME '::';

funcname: NAME ('.' NAME)*;

varlist: var (',' var)*;

try_catch: KW_Try stat* KW_Catch stat* KW_End;
demand: KW_Demand exp;









//Nutt declarations start

var_decl: var_header (short_var_decl
    | by_type_var_decl
    | by_value_var_decl
    | full_var_decl);

constant_qualifier: KW_VAR
	| KW_VAL;

var_header: constant_qualifier NAME;

short_var_decl: ('=' nil_type)?;
by_type_var_decl: ':' type=type_decl;
by_value_var_decl: '=' assign_right=varExpOrPar;
full_var_decl: ':' type=type_decl '=' assign_right=varExpOrPar;

type_decl: either_type
	| functional_type
    | action_type
    | number_type
    | list_type
    | nil_type;

action_kind: TW_Actionable
	| TW_Procedure
	| TW_Macro;

TW_Actionable: 'Actionable';
TW_Procedure: 'Procedure';
TW_Macro: 'Macro';

action_type: action_kind ('|' func_parameters)?;

list_initializer: '<' explist '>';

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

list_length_decl: OP_Length (number | varExpOrPar);

varExpOrPar: var
    | exp
    | parExp;

set_type: 'Set';
map_type: 'Map';
array_type: 'Array';
string_type: 'String';

either_type: 'Either';
functional_type: 'Functional';
nil_type: 'Nil';

//Nutt types end

var_decl_list: var_decl (',' var_decl)*;

explist: (varExpOrPar ',')* varExpOrPar;

//| '...' #ExplicitEpsilon
//| tableconstructor #TableConstructor
//| <assoc=right> exp operatorFunctCat exp #FunctCatExpression
//| exp operatorAnd exp #AndExpression
//| exp operatorOr exp #OrExpression

exp: var #explicit_variable
	| atom #explicit_atom
    | macro #explicit_macro
    | functiondef #function_definition_exp
    | funcname '(' arguments=explist? ')' #func_call_exp
    | left=exp operatorBitwise right=exp #bitwise_exp
    | left=exp operator_math right=exp #math_exp
    | left=exp operator_logical right=exp #logical_exp
    | operatorUnary exp #unary_expression
    | <assoc=right> left=exp op=OP_STRCAT right=exp #str_cat_expression
    | left=exp OP_LeftFold right=exp #fold_expression
    | left=exp operatorComparison right=exp #comparison_expression
    | <assoc=right> left=exp OP_Power right=exp #power_expression
    | '(' exp ')' #parenthesis_exp
    | KW_TypeOf exp #type_of_exp
    | exp KW_As type_decl #type_cast
    | funcname OP_FunctCat funcname #func_cat_exp
    | exp '?' if_true=exp ('@' if_false=exp)? ('@' if_undefined=exp)? #quarternary_exp;

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

varOrExp: var
    | parExp;

parExp: '(' exp ')';

var: NAME;// varSuffix) varSuffix*;


func_parameters: '(' parlist? ')';
func_output: (either_output | default_output) '=';

either_output: (':' either_type)?;
default_output: ':' (type_decl);

functiondef: lambda_decl
    | (KW_Funct func_any);

funcbody: func_parameters func_output block KW_Return;

KW_Return: 'return';

func_ref: OP_FunctRef (varExpOrPar | functiondef);
func_copy: OP_FunctCopy (varExpOrPar | functiondef);
func_concat: OP_FunctCat (varExpOrPar | functiondef);

func_any: lambda_decl
    | func_ref
    | func_copy
    | func_concat
    | funcbody;

lambda_decl: '\\' (var_decl | func_parameters) OP_LambdaReturn (stat | exp);

parlist: var_decl_list;// (',' '...')?
    //| '...';

//tableconstructor: '{' fieldlist? '}';

fieldlist: field (fieldsep field)* fieldsep?;

field: '[' exp ']' '=' exp
    | NAME '=' exp
    | exp;

fieldsep: ',' #CommaSep
    | ';' #SemicolonSep;

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

OP_LeftFold: '<--';
OP_RightFold: '-->';

OP_Less: '<';
OP_Greater: '>';
OP_LessEqual: '<=';
OP_GreaterEqual: '>=';
OP_NotSimilar: '!=';
OP_NotEqual: '!==';
OP_Similar: '==';
OP_Equal: '===';

OP_Tilda: '~';
OP_BIT_LSHIFT: '<<';
OP_BIT_RSHIFT: '>>';
OP_BIT_OR: '|';
OP_BIT_AND: '&';

OP_Length: '#';
OP_Power: '^';

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