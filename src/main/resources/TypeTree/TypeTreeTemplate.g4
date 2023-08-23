grammar TypeTreeTemplate;

type_tree: type EOF;

type: NAME type_body? (OP_Implements (interface))? (OP_Shrinks (type | type_group))?;

interface: NAME '<' (NAME | interface) '>';







type_group: type (',' type)* '|';

type_body: '[' operator_body+ ']';

operator_body: NAME sign_def* sign_group*;

sign_def: Char_String '->' Signature_Name;
Signature_Name: '.' NAME;

sign_group: Signature_Name operator_pair*;

operator_pair: NAME Char_String;

Quoted_String: '`' Src* '`';

NAME: Alpha (Alpha | Digit | OP_Underscore)* | OP_Underscore (Alpha | Digit | OP_Underscore)+;
Char_String: '\'' Char* '\'';
OP_Shrinks: ':>';
OP_Implements: '::';

OP_Underscore: '_';
fragment Alpha: AlphaLower | AlphaUpper;
fragment AlphaLower: [a-z];
fragment AlphaUpper: [A-Z];
fragment Digit: [0-9];
fragment Char: ~['];
fragment Src: ~[`];
WS: [ \t\u000C\r\n]+ -> skip;
BlockComment: '/|' .*? '|\\' -> skip;