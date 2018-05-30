grammar myChecker;

@header {
    // import packages here.
    import java.util.HashMap;
    import java.lang.Math;
}

@members {
    // boolean TRACEON = true;
    boolean TRACEON = false;
    HashMap<String,Integer> symtab = new HashMap<String, Integer>();
    final String[] type_dict = {"err", "int", "float", "char"};
    public boolean match_operands(int a, int b, int a_line, String op) {
        if (a==0 || b==0 || Math.abs(a) != Math.abs(b)) { 
			  System.out.println("Type Error: line: " + 
				                 a_line +
						         ": Type mismatch for the operator " + op + " in an expression. (" +
                                 type_dict[Math.abs(a)] + " vs " +
                                 type_dict[Math.abs(b)] + ")"
                                 );
              return false;
        }
        return true;
    }

	/* abs(attr_type):
       0 => error,
       1 => integer,
       2 => float
       3 => char,

       sign(attr_type):
       <0: const
       >0: variable
    */	   
}

program
	: (VOID|INT|FLOAT) MAIN '(' .* ')' '{' declarations statements '}'
     { if (TRACEON) System.out.println("VOID MAIN () {declarations statements}"); }
	;

declarations
	: const_type type Identifier 
     {
	   if (TRACEON) System.out.println("declarations: type Identifier : declarations");
	 
  	   if (symtab.containsKey($Identifier.text)) {
		   System.out.println("Type Error: line: " + 
				              $Identifier.getLine() + 
							  ": Redeclared identifier: " +
                              $Identifier.text
                              );
	   } else {
		   /* Add ID and its attr_type into the symbol table. */
		   symtab.put($Identifier.text, $type.attr_type * $const_type.attr_constant);	   
	   }
	 } ( ASSIGN_OP arith_expression {
           int temp = symtab.get($Identifier.text);
           if (temp==0 || $arith_expression.attr_type==0 || Math.abs(temp) != Math.abs($arith_expression.attr_type)) {
           System.out.println("Type Error: line: " + 
				              $arith_expression.start.getLine() +
						      ": Initialization failed. Type mismatch for the two silde operands in an assignment statement. (" +
                              type_dict[Math.abs(temp)] + " vs " +
                              type_dict[Math.abs($arith_expression.attr_type)] + ")"
                              );
       }
         } )? ';' declarations
	| { if (TRACEON) System.out.println("declarations: "); }
	;

const_type returns [int attr_constant]
    : CONST { if (TRACEON) System.out.println("type: constant: "); $attr_constant = -1; }
    | { if (TRACEON) System.out.println("type: variable: "); $attr_constant = 1; };

type returns [int attr_type]
	: INT    { if (TRACEON) System.out.println("type: INT");  $attr_type = 1; }
	| FLOAT { if (TRACEON) System.out.println("type: FLOAT");  $attr_type = 2; }
	| CHAR{ if (TRACEON) System.out.println("type: CHAR");  $attr_type = 3; }
	;

statements
	:statement statements
	|;

arith_expression returns [int attr_type]
	: a = multExpr { $attr_type = Math.abs($a.attr_type); }
      ( ADD_OP b = multExpr
	    { 
          if (!match_operands($a.attr_type, $b.attr_type, $a.start.getLine(), $ADD_OP.text)) $attr_type = 0;
        }
	  | SUB_OP b = multExpr
	    { 
          if (!match_operands($a.attr_type, $b.attr_type, $a.start.getLine(), $SUB_OP.text)) $attr_type = 0;
        }
      | EQ_OP b = multExpr
	    { 
          if (!match_operands($a.attr_type, $b.attr_type, $a.start.getLine(), $EQ_OP.text)) $attr_type = 0;
        }
      | LE_OP b = multExpr
	    { 
          if (!match_operands($a.attr_type, $b.attr_type, $a.start.getLine(), $LE_OP.text)) $attr_type = 0;
        }
      | GE_OP b = multExpr
	    { 
          if (!match_operands($a.attr_type, $b.attr_type, $a.start.getLine(), $GE_OP.text)) $attr_type = 0;
        }
      | NE_OP b = multExpr
	    { 
          if (!match_operands($a.attr_type, $b.attr_type, $a.start.getLine(), $NE_OP.text)) $attr_type = 0;
        }
      | GREATER_OP b = multExpr
	    { 
          if (!match_operands($a.attr_type, $b.attr_type, $a.start.getLine(), $GREATER_OP.text)) $attr_type = 0;
        }
      | LESS_OP b = multExpr
	    { 
          if (!match_operands($a.attr_type, $b.attr_type, $a.start.getLine(), $LESS_OP.text)) $attr_type = 0;
        }
	  )*
	;

multExpr returns [int attr_type]
	: a = signExpr { $attr_type = Math.abs($a.attr_type); }
      ( '*' signExpr
      | '/' signExpr
	  )*
	;

signExpr returns [int attr_type]
	: primaryExpr { $attr_type = Math.abs($primaryExpr.attr_type); }
	| '-' primaryExpr { $attr_type = Math.abs($primaryExpr.attr_type); }
	;
		  
primaryExpr returns [int attr_type] 
	: Integer_constant        { $attr_type = -1; }
	| Floating_point_constant { $attr_type = -2; }
	| Character_constant      { $attr_type = -3; }
	| Identifier              
    {
       if (symtab.containsKey($Identifier.text)) {
	       $attr_type = symtab.get($Identifier.text);
	   } else {
           /* Add codes to report and handle this error */
           System.out.println("Type Error: line: " + 
				              $Identifier.getLine() +
                              ": " +
                              $Identifier.text + 
						      ": not declared.");
	       $attr_type = 0;
       }
    }
	| '(' arith_expression ')' { $attr_type = $arith_expression.attr_type; }
    ;

uniry_op returns [int attr_type]
    : uniry_op_ 
    {
       if (symtab.containsKey($uniry_op_.id_)) {
	       $attr_type = symtab.get($uniry_op_.id_);
	   } else {
           /* Add codes to report and handle this error */
           System.out.println("Type Error: line: " + 
				              $uniry_op_.start.getLine() +
                              ": " +
                              $uniry_op_.id_ + 
						      ": not declared.");
	       $attr_type = 0;
       }
       if ($attr_type<0) { // constant!!
           System.out.println("Type Error: line: " + 
				              $uniry_op_.start.getLine() +
                              ": " +
                              $uniry_op_.id_ + 
						      ": is constant.");
       }
    }
    ;

uniry_op_ returns [String id_]
    :
      PP_OP Identifier {$id_ = $Identifier.text;}
    | Identifier PP_OP {$id_ = $Identifier.text;}
    | MM_OP Identifier {$id_ = $Identifier.text;}
    | Identifier MM_OP {$id_ = $Identifier.text;}
    ;

sub_statement returns [int attr_type]
    : 
    uniry_op {$attr_type = $uniry_op.attr_type;}
    | Identifier ASSIGN_OP arith_expression
    {
     if (symtab.containsKey($Identifier.text)) {
	       $attr_type = symtab.get($Identifier.text);
	   } else {
           /* Add codes to report and handle this error */
           System.out.println("Type Error: line: " + 
				              $arith_expression.start.getLine() +
                              ": " +
                              $Identifier.text + 
						      ": not declared.");
	       $attr_type = 0;
	   }

       if ($attr_type < 0) {
           System.out.println("Type Error: line: " + $arith_expression.start.getLine()  + ": Assign value to constant: " + $Identifier.text);
       }

       /*
       if (TRACEON) {
           System.out.println("Line: " + $arith_expression.start.getLine());
           System.out.println("ID: " + $Identifier.text);
           System.out.println("attr_type: " + $attr_type);
       }
       */
		
	   if ($attr_type==0 || $arith_expression.attr_type==0 || Math.abs($attr_type) != Math.abs($arith_expression.attr_type)) {
           System.out.println("Type Error: line: " + 
				              $arith_expression.start.getLine() +
						      ": Type mismatch for the two silde operands in an assignment statement. (" +
                              type_dict[Math.abs($attr_type)] + " vs " +
                              type_dict[Math.abs($arith_expression.attr_type)] + ")"
                              );
		   $attr_type = 0;
       }
	 } 
     | arith_expression {$attr_type = $arith_expression.attr_type;}
     ;

statement returns [int attr_type]
	: sub_statement ';' {$attr_type = $sub_statement.attr_type;}
	| ifelse_statements
    | for_statements
    | while_statements
    | RETURN (Identifier|Character_constant|Integer_constant|Floating_point_constant) ';'
	;

ifelse_statements
    : IF '(' arith_expression ')' block_of_statements (ELSE_ block_of_statements)? ;

for_statements
    : FOR '(' sub_statement ';' sub_statement ';' sub_statement ')'  block_of_statements
    ;

while_statements
    : WHILE '(' sub_statement ')' block_of_statements 
    ;

block_of_statements
    : statement
    | '{' statements '}'
    ;

/* ====== description of the tokens ====== */
CONST:'const';
CHAR:'char';
FLOAT:'float';
INT:'int';
MAIN: 'main';
VOID: 'void';
IF: 'if';
ELSE_: 'else';
FOR: 'for';
WHILE: 'while';
RETURN: 'return';

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
// COMMA_OP: ',';
DOT_OP: '.';
TRINARY_OP1: '?';
TRINARY_OP2: ':';

Identifier:('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
Character_constant: '\'' .* '\'';
Integer_constant:'0'..'9'+;
Floating_point_constant:'0'..'9'+ '.' '0'..'9'+;

WS:( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};
COMMENT:'/*' .* '*/' {$channel=HIDDEN;};
