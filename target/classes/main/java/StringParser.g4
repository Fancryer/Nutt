parser grammar StringParser;

options {
    tokenVocab = 'StringLexer';
}

start: exp EOF ;

exp :IDENTIFIER
	| LPAR exp RPAR
    | DQUOTE stringContents* DQUOTE
    ;

stringContents : TEXT
               | ESCAPE_SEQUENCE
               | BACKSLASH_PAREN exp RPAR
               ;