grammar myC;

@header {
// import packages here.
}

@members {
boolean TRACEON = true;
}

program:(VOID|INT) MAIN '(' .* ')' '{' declarations statements '}'
        {if (TRACEON) System.out.println("program:(VOID|INT) MAIN '(' .* ')' '{' declarations statements '}'");};

declarations: type dec_ids ';' declarations 
             { if (TRACEON) System.out.println("declarations: type dec_ids ';' declarations"); }
           | { if (TRACEON) System.out.println("declarations: ");} ;

constants: Integer_constant { if (TRACEON) System.out.println("constants: Integer_constant"); } | Floating_point_constant { if (TRACEON) System.out.println("constants: Floating_point_constant"); } | Character_constant 
           { if (TRACEON) System.out.println("constants: Character_constant"); };

dec_ids: Identifier '=' constants ',' dec_ids 
         { if (TRACEON) System.out.println("dec_ids: Identifier '=' constants ',' dec_ids ( " + $Identifier.text + " : " + $constants.text + " )" ); } 
         | Identifier ',' dec_ids { if (TRACEON) System.out.println("dec_ids: Identifier ',' dec_ids ( " + $Identifier.text + " )"); }
         | Identifier { if (TRACEON) System.out.println( "dec_ids: Identifier ( " + $Identifier.text + " )"); } 
         | Identifier '=' constants { if (TRACEON) System.out.println("dec_ids: Identifier '=' constants" + " ( " + $Identifier.text + " : " + $constants.text + " )"); } ;

type:INT { if (TRACEON) System.out.println("type: INT"); }
   | FLOAT {if (TRACEON) System.out.println("type: FLOAT"); }
   | CHAR {if (TRACEON) System.out.println("type: CHAR"); }
   | VOID {if (TRACEON) System.out.println("type: VOID"); };

statements:statement statements  {if (TRACEON) System.out.println("statements:statement statements"); }
        |;

arith_expression: multExpr
                  ( ADD_OP multExpr
				  | SUB_OP multExpr
				  | EQ_OP  multExpr // ==
				  | LE_OP  multExpr // <=
				  | GE_OP  multExpr // >=
				  | NE_OP  multExpr // !=
				  | GREATER_OP  multExpr // >
				  | LESS_OP     multExpr // <
				  )*
                  {if (TRACEON) System.out.println("arith_expression: multExpr ( ADD_OP multExpr| SUB_OP multExpr | EQ_OP multExpr | LE_OP multExpr | GE_OP multExpr | NE_OP multExpr | GREATER_OP multExpr | LESS_OP multExpr)*"); }
                  ;

uniry_op:
    incrment_op  {if (TRACEON) System.out.println("uniry_op: incrment_op"); } | decrement_op {if (TRACEON) System.out.println("uniry_op: incrment_op"); } ;

incrment_op:
    PP_OP Identifier {if (TRACEON) System.out.println("incrment_op: PP_OP Identifier"); } | Identifier PP_OP {if (TRACEON) System.out.println("incrment_op: Identifier PP_OP"); } ;
decrement_op:
    MM_OP Identifier {if (TRACEON) System.out.println("decrement_op: MM_OP Identifier"); } | Identifier MM_OP {if (TRACEON) System.out.println("decrement_op: Identifier MM_OP"); };

multExpr: signExpr
          ( MUL_OP signExpr
          | DIV_OP signExpr
		  )*
          {if (TRACEON) System.out.println("multExpr: signExpr ( MUL_OP signExpr | DIV_OP signExpr )*"); }
		  ;

signExpr: primaryExpr {if (TRACEON) System.out.println("signExpr: primaryExpr"); }
        | SUB_OP primaryExpr {if (TRACEON) System.out.println("signExpr: SUB_OP primaryExpr"); }
		;
		  
primaryExpr: Integer_constant {if (TRACEON) System.out.println("primaryExpr: Integer_constant"); }
           | Floating_point_constant {if (TRACEON) System.out.println("primaryExpr: Floating_point_constant"); }
           | Identifier {if (TRACEON) System.out.println("primaryExpr: Identifier"); }
		   | '(' arith_expression ')' {if (TRACEON) System.out.println("primaryExpr: '(' arith_expression ')'"); }
           ;

sub_statement: 
           uniry_op {if (TRACEON) System.out.println("sub_statement: uniry_op"); }
         | Identifier ASSIGN_OP arith_expression  {if (TRACEON) System.out.println("sub_statement: Identifier ASSIGN_OP arith_expression ( " + $Identifier.text + " = " + $arith_expression.text + " )"); }
         | arith_expression {if (TRACEON) System.out.println("sub_statement: arith_expression"); }
		 ;
statement:
      sub_statement ';' {if (TRACEON) System.out.println("statement: sub_statement ';'"); }
    | ifelse_statements {if (TRACEON) System.out.println("statement: ifelse_statements"); }
    | for_statements    {if (TRACEON) System.out.println("statement: for_statements"); }
    | RETURN sub_statement ';'  { if (TRACEON) System.out.println("statement: RETURN sub_statement ';'"); }
    ;

ifelse_statements:
    IF '(' arith_expression ')' block_of_statements (ELSE block_of_statements)? {if (TRACEON) System.out.println("ifelse_statements: IF '(' arith_expression ')' block_of_statements (ELSE block_of_statements)?"); };

for_statements:
    FOR '(' sub_statement ';' sub_statement ';' sub_statement ')'  block_of_statements  { if (TRACEON) System.out.println("statement: FOR '(' sub_statement ';' sub_statement ';' sub_statement ')'  block_of_statements"); } ;

block_of_statements: 
                  statement { if (TRACEON) System.out.println("block_of_statements: statement"); }
                  | '{' statements '}' { if (TRACEON) System.out.println("block_of_statements: {statements}"); }
				  ;

/* description of the tokens */
FLOAT:'float';
INT:'int';
CHAR:'char';
MAIN: 'main';
VOID: 'void';
IF: 'if';
ELSE: 'else';
FOR: 'for';

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
RETURN: 'return';

Identifier:('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
Integer_constant:'0'..'9'+;
Floating_point_constant:'0'..'9'+ '.' '0'..'9'+;
Literal_constant: '\"'(.)*'\"';
Character_constant: '\''(.)'\'';

WS:( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};
COMMENT: ('/*' (options{greedy=false;}: .)* '*/') {$channel=HIDDEN;} | ('//'(.)*'\n') {$channel=HIDDEN;};
MACRO: '#'(.)*'\n' {$channel=HIDDEN;}; // Begin with '#' and end with \n
