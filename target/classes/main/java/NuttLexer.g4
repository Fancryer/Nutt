lexer grammar NuttLexer;

AtSign: '@';
BackSlash: '\\';
BackTick: '`';
BlockComment: '/|' .*? '|\\' -> skip;
Brace_Square_Left: '[';
Brace_Square_Right: ']';
Brace_Curly_Left: '{';
Brace_Curly_Right: '}';
Brace_Paren_Left: '(';
Brace_Paren_Right: ')';


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

KW_Alias: 'alias';
KW_All: 'all' | '∀';
KW_Annotation: 'annotation';
KW_As: 'as';
KW_Break: 'break';
KW_Both: 'both';
KW_Catch: 'catch';
KW_Prototype: 'proto';
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
KW_Expose: 'expose';
KW_False: 'false' | '⊥';
KW_Final: 'final';
KW_For: 'for';
KW_Forget: 'forget';
KW_Funct: 'funct';
KW_Global: 'global';
KW_If: 'if';
KW_Imports: 'imports';
KW_In: 'in' | '∈';
KW_Infix: 'infix';
KW_InstanceOf: 'instanceof';
KW_Is: 'is';
KW_Local: 'local';
KW_Macro: 'macro';
KW_Match: 'match';
KW_Matched: 'matched';
KW_Module: 'module';
KW_Mut: 'mut';
KW_Neither: 'neither';
KW_New: 'new';
KW_Nil: 'nil';
KW_Not_In: OP_Not KW_In | '∉';
KW_Of: 'of';
KW_On: 'on';
KW_Outer: 'outer';
KW_Operator: 'operator';
KW_Param: 'param';
KW_Postfix: 'postfix';
KW_Prefix: 'prefix';
KW_Private: 'private';
KW_Protected: 'protected';
KW_Public: 'public';
KW_Record: 'record';
KW_Repeat: 'repeat';
KW_Requires: 'requires';
KW_Return: 'return';
KW_Reverse: 'reverse';
KW_Then: 'then';
KW_This: 'this';
KW_To: 'to';
KW_Trait: 'trait';
KW_True: 'true' | '⊤';
KW_Try: 'try';
KW_Type: 'type';
KW_TypeOf: 'typeof';
KW_Until: 'until';
KW_Using: 'using';
KW_Val: 'val';
KW_Var: 'var';
KW_Where: 'where';
KW_While: 'while';
KW_With: 'with';
KW_Yield: 'yield';
LineComment: '//|' ~[\r\n]* -> skip;
//NAME: [a-zA-Z_][a-zA-Z_0-9]*;
//NAME: AlphaLower (AlphaLower | DigitOrUnderscore)* | OP_Underscore (AlphaLower | DigitOrUnderscore)+;

NAME: Alpha (Alpha | DigitOrUnderscore)* | OP_Underscore (Alpha | DigitOrUnderscore)+;

fragment Alpha: AlphaLower | AlphaUpper;
fragment AlphaLower: [a-z];
fragment AlphaUpper: [A-Z];

NATIVE: '$$.';
OP_Add: '+';
OP_And: '&' | 'and' | '∧';
OP_Append: ';;';
//OP_Arithmetic_LeftShift: '<<<';
//OP_Arithmetic_RightShift: '>>>';
OP_Assign: '=';
OP_Backward: '<-|' | '↤';
//OP_Bit_And: '&';
//OP_Bit_LeftShift: '<<';
//OP_Bit_Or: '|';
//OP_Bit_RightShift: '>>';
//OP_Bit_Xor: 'bxor';
OP_Case_Arrow: '-->';
OP_Compose: '<==';
OP_Div: '/' | '÷';
OP_Equal: '===' | '≡';
OP_Extends: '<:';
OP_Forward: '|->' | '↦';
OP_Greater: '>';
OP_IntDiv: '//';
OP_Implements: '::';
OP_LambdaReturn: '==>';
OP_Length: '#';
OP_Less: '<';
OP_Less_Equal: '<=' | '≤' | '≦';
OP_Mod: '%';
OP_Mult: '*' | '×' | '⋅';
OP_Not: '!' | 'not' | '¬';
OP_Or: '|' | 'or' | '∨';
OP_Pass:'...';
OP_Placeholder: '???';
OP_Power: '^';
OP_Range: '..';
OP_Reverse: '<|>';
OP_Similar: '==';
OP_SlightlyGreater: '~>';
OP_SlightlyLess: '<~';
OP_Sub: '-';
OP_Tilda: '~';
OP_TypeAnnotation: '->';
OP_Underscore: '_';
OP_Xor: 'xor' | '⊻';
Op_Greater_Equal: '>=' | '≥' | '≧';
Op_Not_Equal: '!==' | '≢';
Op_Not_Similar: '!=' | '≠';

fragment
DEFAULT_OP: '+' | '-' | '*' | '/' | '%' | '$' | '<' | '>' | '&'
	| '|' | '^' | '~' | '?' | '⊕' | '≠' | '≢' | '≥' | '≧' | '⊻' | '∨'
	| '¬' | '×' | '⋅' | '≤' | '≦' | '≡' | '÷' | '↤' | '↦';

fragment
Exclamation: '!';

Op_Custom: DEFAULT_OP DEFAULT_OP+;

Question: '?';
SHEBANG: '#' '!' SingleLineInputCharacter* -> channel(HIDDEN);
SemiColon: ';';

//Type: (AlphaUpper AlphaLowerOrDigit* OP_Underscore?)* (AlphaUpper AlphaLowerOrDigit*)+;

UtfEscape: '\\' 'u{' HexDigit+ '}';
fragment AlphaLowerOrDigit: AlphaLower | Digit;
fragment Char: ~['];
fragment WChar: ~["];
fragment Digit: [0-9];
fragment DigitOrUnderscore: Digit | OP_Underscore;
fragment ExponentPart: [eE] [+-]? Digit+;
fragment HexDigit: [0-9a-fA-F];
fragment HexDigitOrUnderscore: HexDigit | '_';
fragment HexExponentPart: [pP] [+-]? Digit+;
fragment HexIntDigitPart: (HexDigit+ HexDigitOrUnderscore*)? HexDigit+;
fragment IntDigitPart: (Digit+ DigitOrUnderscore*)? Digit+;
fragment SingleLineInputCharacter: ~[\r\n\u0085\u2028\u2029];

WS: [ \t\u000C\r\n]+ -> skip;

Normal_string: '"' WChar* '"';