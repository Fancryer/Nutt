grammar TypeTreeTemplate;

type_tree: type EOF;

type: NAME type_body? (OP_Shrinks (type | type_group))?;

type_group: type (',' type)* '|';

type_body: '[' operator* ']';

operator: '[' name=Char_String ',' signature=Char_String (',' return_type=NAME)? ']' Operator_body;

Operator_body: '`' Src* '`';

NAME: Alpha (Alpha | Digit | OP_Underscore)* | OP_Underscore (Alpha | Digit | OP_Underscore)+;
Char_String: '\'' Char* '\'';
OP_Shrinks: ':>';
OP_Underscore: '_';
fragment Alpha: AlphaLower | AlphaUpper;
fragment AlphaLower: [a-z];
fragment AlphaUpper: [A-Z];
fragment Digit: [0-9];
fragment Char: ~['];
fragment Src: ~[`];
WS: [ \t\u000C\r\n]+ -> skip;