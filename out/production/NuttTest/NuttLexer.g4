lexer grammar NuttLexer;

AtSign: '@';
BackSlash: '\\';
BackTick: '`';
BlockComment: '/|' .*? '|\\' -> skip;
Char_String: '\'' Char* '\'';
Colon: ':';
Comma: ',';
DecimalEscape: '\\' Digit | '\\' [0-2]? Digit Digit;
Dot: '.';
EscapeCharacter: '\\' [abfnrtvz"'|$#\\];
EscapeSequence: EscapeCharacter | '\\' '\r'? '\n' | DecimalEscape | HexEscape | UtfEscape;
Float: IntDigitPart '.' IntDigitPart ExponentPart?;
HexEscape: '\\' 'x' HexDigit HexDigit;
HexFloat: '0' [xX] (HexIntDigitPart? '.' HexIntDigitPart HexExponentPart? | HexIntDigitPart HexExponentPart);
HexInt: '0' [xX] HexIntDigitPart;
Int: (Digit+ DigitOrUnderscore*)? Digit;

KW_All: 'all' | '∀';
KW_As: 'as';
KW_Break: 'break';
KW_Catch: 'catch';
KW_Continue: 'continue';
KW_CommonOf: 'commonof';
KW_Default: 'default';
KW_Define: 'define';
KW_Demand: 'demand';
KW_Deports: 'deports';
KW_Do: 'do';
KW_Doif: 'doif';
KW_Doifn: 'doifn';
KW_Done: 'done';
KW_Else: 'else';
KW_End: 'end';
KW_Enum: 'enum';
KW_Eval: 'eval';
KW_Every: 'every';
KW_Exec: 'exec';
KW_Exit: 'exit';
KW_False: 'false' | '⊥';
KW_Final: 'final';
KW_For: 'for';
KW_Forget: 'forget';
KW_Funct: 'funct';
KW_If: 'if';
KW_Implements: 'implements';
KW_Imports: 'imports';
KW_In: 'in' | '∈';
KW_Infix: 'infix';
KW_InstanceOf: 'instanceof';
KW_Is: 'is';
KW_Local: 'local';
KW_Match: 'match';
KW_Matched: 'matched';
KW_Module: 'module';
KW_Nil: 'nil';
KW_Not_In: OP_Not KW_In | '∉';
KW_Of: 'of';
KW_Operator: 'operator';
KW_Postfix: 'postfix';
KW_Prefix: 'prefix';
KW_Record: 'record';
KW_Repeat: 'repeat';
KW_Return: 'return';
KW_Reverse: 'reverse';
KW_Then: 'then';
KW_To: 'to';
KW_True: 'true' | '⊤';
KW_Try: 'try';
KW_Type: 'type';
KW_TypeOf: 'typeof';
KW_Until: 'until';
KW_VAL: 'val';
KW_VAR: 'var';
KW_Vals: 'vals';
KW_Vars: 'vars';
KW_While: 'while';
KW_Yield: 'yield';
//Lambda: 'Λ' | 'λ';
Lambda: 'lambda';
LineComment: '//|' ~[\r\n]* -> skip;
NAME: [a-zA-Z_][a-zA-Z_0-9]*;
NATIVE: '$$NATIVE.';
OP_Add: '+';
OP_And: '&&' | 'and' | '∧';
OP_Append: ';;';
OP_Arithmetic_LeftShift: '<<<';
OP_Arithmetic_RightShift: '>>>';
OP_Assign: '=';
OP_Backward: '<-|' | '↤';
OP_Bit_And: '&';
OP_Bit_LeftShift: '<<';
OP_Bit_Or: '|';
OP_Bit_RightShift: '>>';
OP_Bit_Xor: 'bxor';
OP_Case_Arrow: '-->';
OP_Div: '/' | '÷';
OP_Equal: '===' | '≡';
OP_Extends: '<:';
//OP_Filter: '??';
OP_Forward: '|->' | '↦';
OP_Greater: '>';
OP_IntDiv: '//';
OP_LambdaReturn: '==>';
OP_LeftBracket: '[';
OP_LeftCurly: '{';
//OP_LeftFold: '<-';
OP_LeftPar: '(';
OP_Length: '#';
OP_Less: '<';
OP_Less_Equal: '<=' | '≤' | '≦';
//OP_Map: '|>';
OP_Mod: '%';
OP_Mult: '*' | '×' | '⋅';
OP_Not: '!' | 'not' | '¬';
OP_Or: '||' | 'or' | '∨';
OP_Pass:'...';
OP_Power: '^';
OP_Range: '..';
OP_Reverse: '<|>';
OP_RightBracket: ']';
OP_RightCurly: '}';
//OP_RightFold: '->';
OP_RightPar: ')';
OP_Similar: '==';
OP_Sub: '-';
OP_Tilda: '~';
OP_Xor: 'xor' | '⊻';
Op_Greater_Equal: '>=' | '≥' | '≧';
Op_Not_Equal: '!==' | '≢';
Op_Not_Similar: '!=' | '≠';

fragment
DEFAULT_OP: '+' | '-' | '*' | '/' | '%' | '$' | '<' | '>' | '&'
	| '|' | '^' | '~' | '?' | '⊕' | '≠' | '≢' | '≥' | '≧' | '⊻' | '∨'
	| '¬' | '×' | '⋅' | '≤' | '≦' | '≡' | '÷' | '↤' | '↦';

Op_Custom: DEFAULT_OP DEFAULT_OP+;

Question: '?';
SHEBANG: '#' '!' SingleLineInputCharacter* -> channel(HIDDEN);
SemiColon: ';';
UtfEscape: '\\' 'u{' HexDigit+ '}';
fragment Char: '\\\'' | ~['];
fragment WChar: '\\"' | ~["];
fragment Digit: [0-9];
fragment DigitOrUnderscore: Digit | '_';
fragment ExponentPart: [eE] [+-]? Digit+;
fragment HexDigit: [0-9a-fA-F];
fragment HexDigitOrUnderscore: HexDigit | '_';
fragment HexExponentPart: [pP] [+-]? Digit+;
fragment HexIntDigitPart: (HexDigit+ HexDigitOrUnderscore*)? HexDigit+;
fragment IntDigitPart: (Digit+ DigitOrUnderscore*)? Digit+;
fragment MacroContent: ~'`';
fragment SingleLineInputCharacter: ~[\r\n\u0085\u2028\u2029];

WS: [ \t\u000C\r\n]+ -> skip;

Normal_string:  '"' WChar* '"';