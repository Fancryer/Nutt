grammar JavaClassTree;

type_tree: section* EOF;

section: Section_Header package_list;

package_list: package (',' package)*;

Section_Header: '[:' ~('[' | ']' | ':')* ':]';

package: packageName '{' package_member_list '}';
package_member: classType | package;

package_member_list: package_member (',' package_member)*;

classType: typeName Char_String? typeArguments? (OP_Implements package_member_list '|')? (OP_Shrinks package_member_list '|')?;

typeArguments: '<' typeArgumentList '>';

typeArgumentList: typeArgument ( ',' typeArgument )*;

typeArgument: referenceType | wildcard;

wildcard: '?' wildcardBounds?;

wildcardBounds: 'extends' referenceType | 'super' referenceType;

referenceType: classOrInterfaceType
    | typeVariable
    | arrayType;

typeVariable: typeName;

primitiveType: numericType | 'boolean';

numericType: integralType
        | floatingPointType;

integralType: 'byte'
        | 'short'
        | 'int'
        | 'long'
        | 'char';

floatingPointType: 'float'
        | 'double';

arrayType: primitiveType dims
	| classType     dims
	| typeVariable  dims;

dims: '[' ']' dims*;

classOrInterfaceType: (packageName '.')? typeIdentifier typeArguments? coit?;

packageName: Identifier ('.' packageName)?;

typeName: (packageName '.')? typeIdentifier;

coit: '.' typeIdentifier typeArguments? coit?;


typeIdentifier: Identifier;

Identifier:	JavaLetter JavaLetterOrDigit*;

fragment
JavaLetter
	:	[a-zA-Z$_] // these are the "java letters" below 0x7F
	|	// covers all characters above 0x7F which are not a surrogate
		~[\u0000-\u007F\uD800-\uDBFF]
		{ Character.isJavaIdentifierStart(_input.LA(-1)) }?
	|	// covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
		[\uD800-\uDBFF] [\uDC00-\uDFFF]
		{ Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1))) }?
	;

fragment
JavaLetterOrDigit
	:	[a-zA-Z0-9$_] // these are the "java letters or digits" below 0x7F
	|	// covers all characters above 0x7F which are not a surrogate
		~[\u0000-\u007F\uD800-\uDBFF]
		{ Character.isJavaIdentifierPart(_input.LA(-1)) }?
	|	// covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
		[\uD800-\uDBFF] [\uDC00-\uDFFF]
		{ Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1))) }?
	;

Char_String: '\'' Char* '\'';
OP_Shrinks: ':>';
OP_Implements: '::';

OP_Underscore: '_';
fragment Alpha: AlphaLower | AlphaUpper;
fragment AlphaLower: [a-z];
fragment AlphaUpper: [A-Z];
fragment Digit: [0-9];
fragment Char: ~['];
WS: [ \t\u000C\r\n]+ -> skip;
BlockComment: '/|' .*? '|\\' -> skip;