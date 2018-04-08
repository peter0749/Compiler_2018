lexer grammar mylexer;

options {
  language = Java;
}

/* Comments */
COMMENT1 : '//'(.)*'\n';
COMMENT2 : '/*' (options{greedy=false;}: .)* '*/';

/* C macro */
MACRO : '#'(.)*'\n'; // Begin with '#' and end with \n

/*----------------------*/
/*   Reserved Keywords  */
/*----------------------*/
UNSIGNED_TYPE :  'unsigned';
LONG_TYPE     :  'long';
CONST_TYPE    :  'const';
INT_TYPE      :  'int';
CHAR_TYPE     :  'char';
VOID_TYPE     :  'void';
FLOAT_TYPE    :  'float';
DOUBLE_TYPE   :  'double';
IF_           :  'if';
ELSE_         :  'else';
WHILE_        :  'while';
FOR_          :  'for';
DO_           :  'do';
GOTO_         :  'goto';
STRUCT_       :  'struct';
TYPEDEF_      :  'typedef';

/*----------------------*/
/*  Compound Operators  */
/*----------------------*/

EQ_OP : '==';
LE_OP : '<=';
GE_OP : '>=';
NE_OP : '!=';
ADD_ASS_OP : '+=';
SUB_ASS_OP : '-=';
MUL_ASS_OP : '*=';
DIV_ASS_OP : '/=';
MOD_ASS_OP : '%=';
AND_ASS_OP : '&=';
OR_ASS_OP  : '|=';
XOR_ASS_OP : '^=';
PP_OP : '++';
MM_OP : '--'; 
AND_OP : '&&'; 
OR_OP : '||'; 
RSHIFT_OP : '<<';
LSHIFT_OP : '>>';
ARROW_OP: '->';
ASSIGN_OP : '=';
LESS_OP : '<';
GREATER_OP : '>';
BIT_AND_OP : '&';
BIT_OR_OP  : '|';
BIT_XOR_OP : '^';
ADD_OP  : '+';
SUB_OP  : '-';
DIV_OP  : '/';
MUL_OP  : '*';
MOD_OP  : '%';
COMMA_OP: ',';
DOT_OP: '.';
TRINARY_OP1: '?';
TRINARY_OP2: ':';

/*----------------------*/
/*   Numeric Constants  */
/*----------------------*/
DEC_NUM : ('0' | ('1'..'9')(DIGIT)*)(LETTER)*; // e.g. 0LL 0uLL...

ID : (LETTER)(LETTER | DIGIT)*;

FLOAT_NUM: (FLOAT_NUM1 | FLOAT_NUM2)(LETTER)*; // e.g. 0.0f 1.0L
fragment FLOAT_NUM1: (DIGIT)+'.'(DIGIT)*;
fragment FLOAT_NUM2: '.'(DIGIT)+;

/*----------------------*/
/*   Literal Constants  */
/*----------------------*/
LITERAL: '\"'(.)*'\"';
CHARACTER: '\''(.)'\'';

/*----------------------------*/
/* Field, Struct, Indexing... */
/*----------------------------*/
LEFT_BRACKET: '(';
RIGHT_BRACKET: ')';
LEFT_B_BRACKET: '{';
RIGHT_B_BRACKET: '}';
LEFT_M_BRACKET: '[';
RIGHT_M_BRACKET: ']';


fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9';

SEMICOLON: ';';
NEW_LINE: '\n' {skip();};
WS  : (' '|'\r'|'\t')+ {skip();};

