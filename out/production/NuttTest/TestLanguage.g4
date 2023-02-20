grammar TestLanguage;

exp: atom
    | bitwise_exp
    | math_exp
    ;

bitwise_exp: left=exp operatorBitwise right=exp;
add_sub_exp: left=exp op=operatorAddSub right=exp;
mul_div_mod_exp: left=exp op=operatorMulDivMod right=exp;

operatorAddSub: OP_Add
    | OP_Sub;

operatorMulDivMod: OP_Mult
    | OP_Div
    | OP_Mod
    | OP_IntDiv;

operatorBitwise: OP_BIT_LSHIFT #BitShiftLeft
    | OP_BIT_RSHIFT #BitShiftRight
    | OP_BIT_OR #BitOr
    | OP_BIT_AND #BitAnd
    | OP_BIT_NOR #BitNor;


math_exp: add_sub_exp
	| mul_div_mod_exp;


atom: explicit_bool
	| explicit_nil;

explicit_nil: KW_Nil;

KW_Nil: 'nil';

explicit_bool: KW_True
	| KW_False;

KW_True: 'true';
KW_False: 'false';