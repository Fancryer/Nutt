grammar Interpol;

string: '"' content* '"' EOF?;

interp: '${' expInner '}';

content: interp
	| chars;

chars: Char+;

expInner: content+
	| string;

Char: '\\"' | ~["];