grammar NuttMathLex;

operator_math: OP_Add
    | OP_Sub
    | OP_Mult
    | OP_Div
    | OP_Mod
    | OP_IntDiv;

in_place_op: OP_AddAssign
	| OP_SubAssign
	| OP_MultAssign
	| OP_DivAssign
	| OP_IntDivAssign
	| OP_ModAssign
	| OP_CatAssign;

self_in_place_op: OP_IncrAssign
	| OP_DecrAssign
	| OP_MultSelfAssign
	| OP_CatSelfAssign;

OP_IncrAssign: '++';
OP_DecrAssign: '--';
OP_MultSelfAssign: '**';
OP_CatSelfAssign: '....';

OP_AddAssign: '+=';
OP_SubAssign: '-=';
OP_MultAssign: '*=';
OP_ModAssign: '%=';
OP_DivAssign: '/=';
OP_IntDivAssign: '//=';
OP_CatAssign: '..=';


OP_STRCAT: '..';

OP_Add: '+';
OP_Sub: '-';
OP_Mult: '*';
OP_Div: '/';
OP_Mod: '%';
OP_IntDiv: '//';
