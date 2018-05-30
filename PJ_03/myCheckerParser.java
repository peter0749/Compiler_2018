// $ANTLR 3.5.2 myChecker.g 2018-05-30 19:18:01

    // import packages here.
    import java.util.HashMap;
    import java.lang.Math;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myCheckerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD_ASS_OP", "ADD_OP", "AND_ASS_OP", 
		"AND_OP", "ARROW_OP", "ASSIGN_OP", "BIT_AND_OP", "BIT_OR_OP", "BIT_XOR_OP", 
		"CHAR", "COMMENT", "CONST", "Character_constant", "DIV_ASS_OP", "DIV_OP", 
		"DOT_OP", "ELSE_", "EQ_OP", "FLOAT", "FOR", "Floating_point_constant", 
		"GE_OP", "GREATER_OP", "IF", "INT", "Identifier", "Integer_constant", 
		"LESS_OP", "LE_OP", "LSHIFT_OP", "MAIN", "MM_OP", "MOD_ASS_OP", "MOD_OP", 
		"MUL_ASS_OP", "MUL_OP", "NE_OP", "OR_ASS_OP", "OR_OP", "PP_OP", "RETURN", 
		"RSHIFT_OP", "SUB_ASS_OP", "SUB_OP", "TRINARY_OP1", "TRINARY_OP2", "VOID", 
		"WHILE", "WS", "XOR_ASS_OP", "'('", "')'", "';'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int ADD_ASS_OP=4;
	public static final int ADD_OP=5;
	public static final int AND_ASS_OP=6;
	public static final int AND_OP=7;
	public static final int ARROW_OP=8;
	public static final int ASSIGN_OP=9;
	public static final int BIT_AND_OP=10;
	public static final int BIT_OR_OP=11;
	public static final int BIT_XOR_OP=12;
	public static final int CHAR=13;
	public static final int COMMENT=14;
	public static final int CONST=15;
	public static final int Character_constant=16;
	public static final int DIV_ASS_OP=17;
	public static final int DIV_OP=18;
	public static final int DOT_OP=19;
	public static final int ELSE_=20;
	public static final int EQ_OP=21;
	public static final int FLOAT=22;
	public static final int FOR=23;
	public static final int Floating_point_constant=24;
	public static final int GE_OP=25;
	public static final int GREATER_OP=26;
	public static final int IF=27;
	public static final int INT=28;
	public static final int Identifier=29;
	public static final int Integer_constant=30;
	public static final int LESS_OP=31;
	public static final int LE_OP=32;
	public static final int LSHIFT_OP=33;
	public static final int MAIN=34;
	public static final int MM_OP=35;
	public static final int MOD_ASS_OP=36;
	public static final int MOD_OP=37;
	public static final int MUL_ASS_OP=38;
	public static final int MUL_OP=39;
	public static final int NE_OP=40;
	public static final int OR_ASS_OP=41;
	public static final int OR_OP=42;
	public static final int PP_OP=43;
	public static final int RETURN=44;
	public static final int RSHIFT_OP=45;
	public static final int SUB_ASS_OP=46;
	public static final int SUB_OP=47;
	public static final int TRINARY_OP1=48;
	public static final int TRINARY_OP2=49;
	public static final int VOID=50;
	public static final int WHILE=51;
	public static final int WS=52;
	public static final int XOR_ASS_OP=53;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public myCheckerParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myCheckerParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return myCheckerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myChecker.g"; }


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



	// $ANTLR start "program"
	// myChecker.g:39:1: program : ( VOID | INT | FLOAT ) MAIN '(' ( . )* ')' '{' declarations statements '}' ;
	public final void program() throws RecognitionException {
		try {
			// myChecker.g:40:2: ( ( VOID | INT | FLOAT ) MAIN '(' ( . )* ')' '{' declarations statements '}' )
			// myChecker.g:40:4: ( VOID | INT | FLOAT ) MAIN '(' ( . )* ')' '{' declarations statements '}'
			{
			if ( input.LA(1)==FLOAT||input.LA(1)==INT||input.LA(1)==VOID ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,MAIN,FOLLOW_MAIN_in_program31); 
			match(input,54,FOLLOW_54_in_program33); 
			// myChecker.g:40:30: ( . )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==55) ) {
					alt1=2;
				}
				else if ( ((LA1_0 >= ADD_ASS_OP && LA1_0 <= 54)||(LA1_0 >= 56 && LA1_0 <= 58)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// myChecker.g:40:30: .
					{
					matchAny(input); 
					}
					break;

				default :
					break loop1;
				}
			}

			match(input,55,FOLLOW_55_in_program38); 
			match(input,57,FOLLOW_57_in_program40); 
			pushFollow(FOLLOW_declarations_in_program42);
			declarations();
			state._fsp--;

			pushFollow(FOLLOW_statements_in_program44);
			statements();
			state._fsp--;

			match(input,58,FOLLOW_58_in_program46); 
			 if (TRACEON) System.out.println("VOID MAIN () {declarations statements}"); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "declarations"
	// myChecker.g:44:1: declarations : ( const_type type Identifier ( ASSIGN_OP arith_expression )? ';' declarations |);
	public final void declarations() throws RecognitionException {
		Token Identifier1=null;
		int type2 =0;
		int const_type3 =0;
		ParserRuleReturnScope arith_expression4 =null;

		try {
			// myChecker.g:45:2: ( const_type type Identifier ( ASSIGN_OP arith_expression )? ';' declarations |)
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==CHAR||LA3_0==CONST||LA3_0==FLOAT||LA3_0==INT) ) {
				alt3=1;
			}
			else if ( (LA3_0==Character_constant||(LA3_0 >= FOR && LA3_0 <= Floating_point_constant)||LA3_0==IF||(LA3_0 >= Identifier && LA3_0 <= Integer_constant)||LA3_0==MM_OP||(LA3_0 >= PP_OP && LA3_0 <= RETURN)||LA3_0==SUB_OP||LA3_0==WHILE||LA3_0==54||LA3_0==58) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// myChecker.g:45:4: const_type type Identifier ( ASSIGN_OP arith_expression )? ';' declarations
					{
					pushFollow(FOLLOW_const_type_in_declarations64);
					const_type3=const_type();
					state._fsp--;

					pushFollow(FOLLOW_type_in_declarations66);
					type2=type();
					state._fsp--;

					Identifier1=(Token)match(input,Identifier,FOLLOW_Identifier_in_declarations68); 

						   if (TRACEON) System.out.println("declarations: type Identifier : declarations");
						 
					  	   if (symtab.containsKey((Identifier1!=null?Identifier1.getText():null))) {
							   System.out.println("Type Error: line: " + 
									              Identifier1.getLine() + 
												  ": Redeclared identifier: " +
					                              (Identifier1!=null?Identifier1.getText():null)
					                              );
						   } else {
							   /* Add ID and its attr_type into the symbol table. */
							   symtab.put((Identifier1!=null?Identifier1.getText():null), type2 * const_type3);	   
						   }
						 
					// myChecker.g:59:5: ( ASSIGN_OP arith_expression )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==ASSIGN_OP) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// myChecker.g:59:7: ASSIGN_OP arith_expression
							{
							match(input,ASSIGN_OP,FOLLOW_ASSIGN_OP_in_declarations80); 
							pushFollow(FOLLOW_arith_expression_in_declarations82);
							arith_expression4=arith_expression();
							state._fsp--;


							           int temp = symtab.get((Identifier1!=null?Identifier1.getText():null));
							           if (temp==0 || (arith_expression4!=null?((myCheckerParser.arith_expression_return)arith_expression4).attr_type:0)==0 || Math.abs(temp) != Math.abs((arith_expression4!=null?((myCheckerParser.arith_expression_return)arith_expression4).attr_type:0))) {
							           System.out.println("Type Error: line: " + 
											              (arith_expression4!=null?(arith_expression4.start):null).getLine() +
													      ": Initialization failed. Type mismatch for the two silde operands in an assignment statement. (" +
							                              type_dict[Math.abs(temp)] + " vs " +
							                              type_dict[Math.abs((arith_expression4!=null?((myCheckerParser.arith_expression_return)arith_expression4).attr_type:0))] + ")"
							                              );
							       }
							         
							}
							break;

					}

					match(input,56,FOLLOW_56_in_declarations89); 
					pushFollow(FOLLOW_declarations_in_declarations91);
					declarations();
					state._fsp--;

					}
					break;
				case 2 :
					// myChecker.g:70:4: 
					{
					 if (TRACEON) System.out.println("declarations: "); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declarations"



	// $ANTLR start "const_type"
	// myChecker.g:73:1: const_type returns [int attr_constant] : ( CONST |);
	public final int const_type() throws RecognitionException {
		int attr_constant = 0;


		try {
			// myChecker.g:74:5: ( CONST |)
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==CONST) ) {
				alt4=1;
			}
			else if ( (LA4_0==CHAR||LA4_0==FLOAT||LA4_0==INT) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// myChecker.g:74:7: CONST
					{
					match(input,CONST,FOLLOW_CONST_in_const_type114); 
					 if (TRACEON) System.out.println("type: constant: "); attr_constant = -1; 
					}
					break;
				case 2 :
					// myChecker.g:75:7: 
					{
					 if (TRACEON) System.out.println("type: variable: "); attr_constant = 1; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_constant;
	}
	// $ANTLR end "const_type"



	// $ANTLR start "type"
	// myChecker.g:77:1: type returns [int attr_type] : ( INT | FLOAT | CHAR );
	public final int type() throws RecognitionException {
		int attr_type = 0;


		try {
			// myChecker.g:78:2: ( INT | FLOAT | CHAR )
			int alt5=3;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt5=1;
				}
				break;
			case FLOAT:
				{
				alt5=2;
				}
				break;
			case CHAR:
				{
				alt5=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// myChecker.g:78:4: INT
					{
					match(input,INT,FOLLOW_INT_in_type137); 
					 if (TRACEON) System.out.println("type: INT");  attr_type = 1; 
					}
					break;
				case 2 :
					// myChecker.g:79:4: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_type147); 
					 if (TRACEON) System.out.println("type: FLOAT");  attr_type = 2; 
					}
					break;
				case 3 :
					// myChecker.g:80:4: CHAR
					{
					match(input,CHAR,FOLLOW_CHAR_in_type154); 
					 if (TRACEON) System.out.println("type: CHAR");  attr_type = 3; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_type;
	}
	// $ANTLR end "type"



	// $ANTLR start "statements"
	// myChecker.g:83:1: statements : ( statement statements |);
	public final void statements() throws RecognitionException {
		try {
			// myChecker.g:84:2: ( statement statements |)
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==Character_constant||(LA6_0 >= FOR && LA6_0 <= Floating_point_constant)||LA6_0==IF||(LA6_0 >= Identifier && LA6_0 <= Integer_constant)||LA6_0==MM_OP||(LA6_0 >= PP_OP && LA6_0 <= RETURN)||LA6_0==SUB_OP||LA6_0==WHILE||LA6_0==54) ) {
				alt6=1;
			}
			else if ( (LA6_0==58) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// myChecker.g:84:3: statement statements
					{
					pushFollow(FOLLOW_statement_in_statements165);
					statement();
					state._fsp--;

					pushFollow(FOLLOW_statements_in_statements167);
					statements();
					state._fsp--;

					}
					break;
				case 2 :
					// myChecker.g:85:3: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statements"


	public static class arith_expression_return extends ParserRuleReturnScope {
		public int attr_type;
	};


	// $ANTLR start "arith_expression"
	// myChecker.g:87:1: arith_expression returns [int attr_type] : a= multExpr ( ADD_OP b= multExpr | SUB_OP b= multExpr | EQ_OP b= multExpr | LE_OP b= multExpr | GE_OP b= multExpr | NE_OP b= multExpr | GREATER_OP b= multExpr | LESS_OP b= multExpr )* ;
	public final myCheckerParser.arith_expression_return arith_expression() throws RecognitionException {
		myCheckerParser.arith_expression_return retval = new myCheckerParser.arith_expression_return();
		retval.start = input.LT(1);

		Token ADD_OP5=null;
		Token SUB_OP6=null;
		Token EQ_OP7=null;
		Token LE_OP8=null;
		Token GE_OP9=null;
		Token NE_OP10=null;
		Token GREATER_OP11=null;
		Token LESS_OP12=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;

		try {
			// myChecker.g:88:2: (a= multExpr ( ADD_OP b= multExpr | SUB_OP b= multExpr | EQ_OP b= multExpr | LE_OP b= multExpr | GE_OP b= multExpr | NE_OP b= multExpr | GREATER_OP b= multExpr | LESS_OP b= multExpr )* )
			// myChecker.g:88:4: a= multExpr ( ADD_OP b= multExpr | SUB_OP b= multExpr | EQ_OP b= multExpr | LE_OP b= multExpr | GE_OP b= multExpr | NE_OP b= multExpr | GREATER_OP b= multExpr | LESS_OP b= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_arith_expression187);
			a=multExpr();
			state._fsp--;

			 retval.attr_type = Math.abs((a!=null?((myCheckerParser.multExpr_return)a).attr_type:0)); 
			// myChecker.g:89:7: ( ADD_OP b= multExpr | SUB_OP b= multExpr | EQ_OP b= multExpr | LE_OP b= multExpr | GE_OP b= multExpr | NE_OP b= multExpr | GREATER_OP b= multExpr | LESS_OP b= multExpr )*
			loop7:
			while (true) {
				int alt7=9;
				switch ( input.LA(1) ) {
				case ADD_OP:
					{
					alt7=1;
					}
					break;
				case SUB_OP:
					{
					alt7=2;
					}
					break;
				case EQ_OP:
					{
					alt7=3;
					}
					break;
				case LE_OP:
					{
					alt7=4;
					}
					break;
				case GE_OP:
					{
					alt7=5;
					}
					break;
				case NE_OP:
					{
					alt7=6;
					}
					break;
				case GREATER_OP:
					{
					alt7=7;
					}
					break;
				case LESS_OP:
					{
					alt7=8;
					}
					break;
				}
				switch (alt7) {
				case 1 :
					// myChecker.g:89:9: ADD_OP b= multExpr
					{
					ADD_OP5=(Token)match(input,ADD_OP,FOLLOW_ADD_OP_in_arith_expression199); 
					pushFollow(FOLLOW_multExpr_in_arith_expression205);
					b=multExpr();
					state._fsp--;

					 
					          if (!match_operands((a!=null?((myCheckerParser.multExpr_return)a).attr_type:0), (b!=null?((myCheckerParser.multExpr_return)b).attr_type:0), (a!=null?(a.start):null).getLine(), (ADD_OP5!=null?ADD_OP5.getText():null))) retval.attr_type = 0;
					        
					}
					break;
				case 2 :
					// myChecker.g:93:6: SUB_OP b= multExpr
					{
					SUB_OP6=(Token)match(input,SUB_OP,FOLLOW_SUB_OP_in_arith_expression219); 
					pushFollow(FOLLOW_multExpr_in_arith_expression225);
					b=multExpr();
					state._fsp--;

					 
					          if (!match_operands((a!=null?((myCheckerParser.multExpr_return)a).attr_type:0), (b!=null?((myCheckerParser.multExpr_return)b).attr_type:0), (a!=null?(a.start):null).getLine(), (SUB_OP6!=null?SUB_OP6.getText():null))) retval.attr_type = 0;
					        
					}
					break;
				case 3 :
					// myChecker.g:97:9: EQ_OP b= multExpr
					{
					EQ_OP7=(Token)match(input,EQ_OP,FOLLOW_EQ_OP_in_arith_expression242); 
					pushFollow(FOLLOW_multExpr_in_arith_expression248);
					b=multExpr();
					state._fsp--;

					 
					          if (!match_operands((a!=null?((myCheckerParser.multExpr_return)a).attr_type:0), (b!=null?((myCheckerParser.multExpr_return)b).attr_type:0), (a!=null?(a.start):null).getLine(), (EQ_OP7!=null?EQ_OP7.getText():null))) retval.attr_type = 0;
					        
					}
					break;
				case 4 :
					// myChecker.g:101:9: LE_OP b= multExpr
					{
					LE_OP8=(Token)match(input,LE_OP,FOLLOW_LE_OP_in_arith_expression265); 
					pushFollow(FOLLOW_multExpr_in_arith_expression271);
					b=multExpr();
					state._fsp--;

					 
					          if (!match_operands((a!=null?((myCheckerParser.multExpr_return)a).attr_type:0), (b!=null?((myCheckerParser.multExpr_return)b).attr_type:0), (a!=null?(a.start):null).getLine(), (LE_OP8!=null?LE_OP8.getText():null))) retval.attr_type = 0;
					        
					}
					break;
				case 5 :
					// myChecker.g:105:9: GE_OP b= multExpr
					{
					GE_OP9=(Token)match(input,GE_OP,FOLLOW_GE_OP_in_arith_expression288); 
					pushFollow(FOLLOW_multExpr_in_arith_expression294);
					b=multExpr();
					state._fsp--;

					 
					          if (!match_operands((a!=null?((myCheckerParser.multExpr_return)a).attr_type:0), (b!=null?((myCheckerParser.multExpr_return)b).attr_type:0), (a!=null?(a.start):null).getLine(), (GE_OP9!=null?GE_OP9.getText():null))) retval.attr_type = 0;
					        
					}
					break;
				case 6 :
					// myChecker.g:109:9: NE_OP b= multExpr
					{
					NE_OP10=(Token)match(input,NE_OP,FOLLOW_NE_OP_in_arith_expression311); 
					pushFollow(FOLLOW_multExpr_in_arith_expression317);
					b=multExpr();
					state._fsp--;

					 
					          if (!match_operands((a!=null?((myCheckerParser.multExpr_return)a).attr_type:0), (b!=null?((myCheckerParser.multExpr_return)b).attr_type:0), (a!=null?(a.start):null).getLine(), (NE_OP10!=null?NE_OP10.getText():null))) retval.attr_type = 0;
					        
					}
					break;
				case 7 :
					// myChecker.g:113:9: GREATER_OP b= multExpr
					{
					GREATER_OP11=(Token)match(input,GREATER_OP,FOLLOW_GREATER_OP_in_arith_expression334); 
					pushFollow(FOLLOW_multExpr_in_arith_expression340);
					b=multExpr();
					state._fsp--;

					 
					          if (!match_operands((a!=null?((myCheckerParser.multExpr_return)a).attr_type:0), (b!=null?((myCheckerParser.multExpr_return)b).attr_type:0), (a!=null?(a.start):null).getLine(), (GREATER_OP11!=null?GREATER_OP11.getText():null))) retval.attr_type = 0;
					        
					}
					break;
				case 8 :
					// myChecker.g:117:9: LESS_OP b= multExpr
					{
					LESS_OP12=(Token)match(input,LESS_OP,FOLLOW_LESS_OP_in_arith_expression357); 
					pushFollow(FOLLOW_multExpr_in_arith_expression363);
					b=multExpr();
					state._fsp--;

					 
					          if (!match_operands((a!=null?((myCheckerParser.multExpr_return)a).attr_type:0), (b!=null?((myCheckerParser.multExpr_return)b).attr_type:0), (a!=null?(a.start):null).getLine(), (LESS_OP12!=null?LESS_OP12.getText():null))) retval.attr_type = 0;
					        
					}
					break;

				default :
					break loop7;
				}
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arith_expression"


	public static class multExpr_return extends ParserRuleReturnScope {
		public int attr_type;
	};


	// $ANTLR start "multExpr"
	// myChecker.g:124:1: multExpr returns [int attr_type] : a= signExpr ( '*' signExpr | '/' signExpr )* ;
	public final myCheckerParser.multExpr_return multExpr() throws RecognitionException {
		myCheckerParser.multExpr_return retval = new myCheckerParser.multExpr_return();
		retval.start = input.LT(1);

		int a =0;

		try {
			// myChecker.g:125:2: (a= signExpr ( '*' signExpr | '/' signExpr )* )
			// myChecker.g:125:4: a= signExpr ( '*' signExpr | '/' signExpr )*
			{
			pushFollow(FOLLOW_signExpr_in_multExpr395);
			a=signExpr();
			state._fsp--;

			 retval.attr_type = Math.abs(a); 
			// myChecker.g:126:7: ( '*' signExpr | '/' signExpr )*
			loop8:
			while (true) {
				int alt8=3;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==MUL_OP) ) {
					alt8=1;
				}
				else if ( (LA8_0==DIV_OP) ) {
					alt8=2;
				}

				switch (alt8) {
				case 1 :
					// myChecker.g:126:9: '*' signExpr
					{
					match(input,MUL_OP,FOLLOW_MUL_OP_in_multExpr407); 
					pushFollow(FOLLOW_signExpr_in_multExpr409);
					signExpr();
					state._fsp--;

					}
					break;
				case 2 :
					// myChecker.g:127:9: '/' signExpr
					{
					match(input,DIV_OP,FOLLOW_DIV_OP_in_multExpr419); 
					pushFollow(FOLLOW_signExpr_in_multExpr421);
					signExpr();
					state._fsp--;

					}
					break;

				default :
					break loop8;
				}
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multExpr"



	// $ANTLR start "signExpr"
	// myChecker.g:131:1: signExpr returns [int attr_type] : ( primaryExpr | '-' primaryExpr );
	public final int signExpr() throws RecognitionException {
		int attr_type = 0;


		int primaryExpr13 =0;
		int primaryExpr14 =0;

		try {
			// myChecker.g:132:2: ( primaryExpr | '-' primaryExpr )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==Character_constant||LA9_0==Floating_point_constant||(LA9_0 >= Identifier && LA9_0 <= Integer_constant)||LA9_0==54) ) {
				alt9=1;
			}
			else if ( (LA9_0==SUB_OP) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// myChecker.g:132:4: primaryExpr
					{
					pushFollow(FOLLOW_primaryExpr_in_signExpr442);
					primaryExpr13=primaryExpr();
					state._fsp--;

					 attr_type = Math.abs(primaryExpr13); 
					}
					break;
				case 2 :
					// myChecker.g:133:4: '-' primaryExpr
					{
					match(input,SUB_OP,FOLLOW_SUB_OP_in_signExpr449); 
					pushFollow(FOLLOW_primaryExpr_in_signExpr451);
					primaryExpr14=primaryExpr();
					state._fsp--;

					 attr_type = Math.abs(primaryExpr14); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_type;
	}
	// $ANTLR end "signExpr"



	// $ANTLR start "primaryExpr"
	// myChecker.g:136:1: primaryExpr returns [int attr_type] : ( Integer_constant | Floating_point_constant | Character_constant | Identifier | '(' arith_expression ')' );
	public final int primaryExpr() throws RecognitionException {
		int attr_type = 0;


		Token Identifier15=null;
		ParserRuleReturnScope arith_expression16 =null;

		try {
			// myChecker.g:137:2: ( Integer_constant | Floating_point_constant | Character_constant | Identifier | '(' arith_expression ')' )
			int alt10=5;
			switch ( input.LA(1) ) {
			case Integer_constant:
				{
				alt10=1;
				}
				break;
			case Floating_point_constant:
				{
				alt10=2;
				}
				break;
			case Character_constant:
				{
				alt10=3;
				}
				break;
			case Identifier:
				{
				alt10=4;
				}
				break;
			case 54:
				{
				alt10=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// myChecker.g:137:4: Integer_constant
					{
					match(input,Integer_constant,FOLLOW_Integer_constant_in_primaryExpr473); 
					 attr_type = -1; 
					}
					break;
				case 2 :
					// myChecker.g:138:4: Floating_point_constant
					{
					match(input,Floating_point_constant,FOLLOW_Floating_point_constant_in_primaryExpr487); 
					 attr_type = -2; 
					}
					break;
				case 3 :
					// myChecker.g:139:4: Character_constant
					{
					match(input,Character_constant,FOLLOW_Character_constant_in_primaryExpr494); 
					 attr_type = -3; 
					}
					break;
				case 4 :
					// myChecker.g:140:4: Identifier
					{
					Identifier15=(Token)match(input,Identifier,FOLLOW_Identifier_in_primaryExpr506); 

					       if (symtab.containsKey((Identifier15!=null?Identifier15.getText():null))) {
						       attr_type = symtab.get((Identifier15!=null?Identifier15.getText():null));
						   } else {
					           /* Add codes to report and handle this error */
					           System.out.println("Type Error: line: " + 
									              Identifier15.getLine() +
					                              ": " +
					                              (Identifier15!=null?Identifier15.getText():null) + 
											      ": not declared.");
						       attr_type = 0;
					       }
					    
					}
					break;
				case 5 :
					// myChecker.g:154:4: '(' arith_expression ')'
					{
					match(input,54,FOLLOW_54_in_primaryExpr531); 
					pushFollow(FOLLOW_arith_expression_in_primaryExpr533);
					arith_expression16=arith_expression();
					state._fsp--;

					match(input,55,FOLLOW_55_in_primaryExpr535); 
					 attr_type = (arith_expression16!=null?((myCheckerParser.arith_expression_return)arith_expression16).attr_type:0); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_type;
	}
	// $ANTLR end "primaryExpr"



	// $ANTLR start "uniry_op"
	// myChecker.g:157:1: uniry_op returns [int attr_type] : uniry_op_ ;
	public final int uniry_op() throws RecognitionException {
		int attr_type = 0;


		ParserRuleReturnScope uniry_op_17 =null;

		try {
			// myChecker.g:158:5: ( uniry_op_ )
			// myChecker.g:158:7: uniry_op_
			{
			pushFollow(FOLLOW_uniry_op__in_uniry_op558);
			uniry_op_17=uniry_op_();
			state._fsp--;


			       if (symtab.containsKey((uniry_op_17!=null?((myCheckerParser.uniry_op__return)uniry_op_17).id_:null))) {
				       attr_type = symtab.get((uniry_op_17!=null?((myCheckerParser.uniry_op__return)uniry_op_17).id_:null));
				   } else {
			           /* Add codes to report and handle this error */
			           System.out.println("Type Error: line: " + 
							              (uniry_op_17!=null?(uniry_op_17.start):null).getLine() +
			                              ": " +
			                              (uniry_op_17!=null?((myCheckerParser.uniry_op__return)uniry_op_17).id_:null) + 
									      ": not declared.");
				       attr_type = 0;
			       }
			       if (attr_type<0) { // constant!!
			           System.out.println("Type Error: line: " + 
							              (uniry_op_17!=null?(uniry_op_17.start):null).getLine() +
			                              ": " +
			                              (uniry_op_17!=null?((myCheckerParser.uniry_op__return)uniry_op_17).id_:null) + 
									      ": is constant.");
			       }
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_type;
	}
	// $ANTLR end "uniry_op"


	public static class uniry_op__return extends ParserRuleReturnScope {
		public String id_;
	};


	// $ANTLR start "uniry_op_"
	// myChecker.g:181:1: uniry_op_ returns [String id_] : ( PP_OP Identifier | Identifier PP_OP | MM_OP Identifier | Identifier MM_OP );
	public final myCheckerParser.uniry_op__return uniry_op_() throws RecognitionException {
		myCheckerParser.uniry_op__return retval = new myCheckerParser.uniry_op__return();
		retval.start = input.LT(1);

		Token Identifier18=null;
		Token Identifier19=null;
		Token Identifier20=null;
		Token Identifier21=null;

		try {
			// myChecker.g:182:5: ( PP_OP Identifier | Identifier PP_OP | MM_OP Identifier | Identifier MM_OP )
			int alt11=4;
			switch ( input.LA(1) ) {
			case PP_OP:
				{
				alt11=1;
				}
				break;
			case Identifier:
				{
				int LA11_2 = input.LA(2);
				if ( (LA11_2==PP_OP) ) {
					alt11=2;
				}
				else if ( (LA11_2==MM_OP) ) {
					alt11=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case MM_OP:
				{
				alt11=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// myChecker.g:183:7: PP_OP Identifier
					{
					match(input,PP_OP,FOLLOW_PP_OP_in_uniry_op_592); 
					Identifier18=(Token)match(input,Identifier,FOLLOW_Identifier_in_uniry_op_594); 
					retval.id_ = (Identifier18!=null?Identifier18.getText():null);
					}
					break;
				case 2 :
					// myChecker.g:184:7: Identifier PP_OP
					{
					Identifier19=(Token)match(input,Identifier,FOLLOW_Identifier_in_uniry_op_604); 
					match(input,PP_OP,FOLLOW_PP_OP_in_uniry_op_606); 
					retval.id_ = (Identifier19!=null?Identifier19.getText():null);
					}
					break;
				case 3 :
					// myChecker.g:185:7: MM_OP Identifier
					{
					match(input,MM_OP,FOLLOW_MM_OP_in_uniry_op_616); 
					Identifier20=(Token)match(input,Identifier,FOLLOW_Identifier_in_uniry_op_618); 
					retval.id_ = (Identifier20!=null?Identifier20.getText():null);
					}
					break;
				case 4 :
					// myChecker.g:186:7: Identifier MM_OP
					{
					Identifier21=(Token)match(input,Identifier,FOLLOW_Identifier_in_uniry_op_628); 
					match(input,MM_OP,FOLLOW_MM_OP_in_uniry_op_630); 
					retval.id_ = (Identifier21!=null?Identifier21.getText():null);
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "uniry_op_"



	// $ANTLR start "sub_statement"
	// myChecker.g:189:1: sub_statement returns [int attr_type] : ( uniry_op | Identifier ASSIGN_OP arith_expression | arith_expression );
	public final int sub_statement() throws RecognitionException {
		int attr_type = 0;


		Token Identifier23=null;
		int uniry_op22 =0;
		ParserRuleReturnScope arith_expression24 =null;
		ParserRuleReturnScope arith_expression25 =null;

		try {
			// myChecker.g:190:5: ( uniry_op | Identifier ASSIGN_OP arith_expression | arith_expression )
			int alt12=3;
			switch ( input.LA(1) ) {
			case MM_OP:
			case PP_OP:
				{
				alt12=1;
				}
				break;
			case Identifier:
				{
				switch ( input.LA(2) ) {
				case MM_OP:
				case PP_OP:
					{
					alt12=1;
					}
					break;
				case ASSIGN_OP:
					{
					alt12=2;
					}
					break;
				case ADD_OP:
				case DIV_OP:
				case EQ_OP:
				case GE_OP:
				case GREATER_OP:
				case LESS_OP:
				case LE_OP:
				case MUL_OP:
				case NE_OP:
				case SUB_OP:
				case 55:
				case 56:
					{
					alt12=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Character_constant:
			case Floating_point_constant:
			case Integer_constant:
			case SUB_OP:
			case 54:
				{
				alt12=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// myChecker.g:191:5: uniry_op
					{
					pushFollow(FOLLOW_uniry_op_in_sub_statement658);
					uniry_op22=uniry_op();
					state._fsp--;

					attr_type = uniry_op22;
					}
					break;
				case 2 :
					// myChecker.g:192:7: Identifier ASSIGN_OP arith_expression
					{
					Identifier23=(Token)match(input,Identifier,FOLLOW_Identifier_in_sub_statement668); 
					match(input,ASSIGN_OP,FOLLOW_ASSIGN_OP_in_sub_statement670); 
					pushFollow(FOLLOW_arith_expression_in_sub_statement672);
					arith_expression24=arith_expression();
					state._fsp--;


					     if (symtab.containsKey((Identifier23!=null?Identifier23.getText():null))) {
						       attr_type = symtab.get((Identifier23!=null?Identifier23.getText():null));
						   } else {
					           /* Add codes to report and handle this error */
					           System.out.println("Type Error: line: " + 
									              (arith_expression24!=null?(arith_expression24.start):null).getLine() +
					                              ": " +
					                              (Identifier23!=null?Identifier23.getText():null) + 
											      ": not declared.");
						       attr_type = 0;
						   }

					       if (attr_type < 0) {
					           System.out.println("Type Error: line: " + (arith_expression24!=null?(arith_expression24.start):null).getLine()  + ": Assign value to constant: " + (Identifier23!=null?Identifier23.getText():null));
					       }

					       /*
					       if (TRACEON) {
					           System.out.println("Line: " + (arith_expression24!=null?(arith_expression24.start):null).getLine());
					           System.out.println("ID: " + (Identifier23!=null?Identifier23.getText():null));
					           System.out.println("attr_type: " + attr_type);
					       }
					       */
							
						   if (attr_type==0 || (arith_expression24!=null?((myCheckerParser.arith_expression_return)arith_expression24).attr_type:0)==0 || Math.abs(attr_type) != Math.abs((arith_expression24!=null?((myCheckerParser.arith_expression_return)arith_expression24).attr_type:0))) {
					           System.out.println("Type Error: line: " + 
									              (arith_expression24!=null?(arith_expression24.start):null).getLine() +
											      ": Type mismatch for the two silde operands in an assignment statement. (" +
					                              type_dict[Math.abs(attr_type)] + " vs " +
					                              type_dict[Math.abs((arith_expression24!=null?((myCheckerParser.arith_expression_return)arith_expression24).attr_type:0))] + ")"
					                              );
							   attr_type = 0;
					       }
						 
					}
					break;
				case 3 :
					// myChecker.g:228:8: arith_expression
					{
					pushFollow(FOLLOW_arith_expression_in_sub_statement688);
					arith_expression25=arith_expression();
					state._fsp--;

					attr_type = (arith_expression25!=null?((myCheckerParser.arith_expression_return)arith_expression25).attr_type:0);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_type;
	}
	// $ANTLR end "sub_statement"



	// $ANTLR start "statement"
	// myChecker.g:231:1: statement returns [int attr_type] : ( sub_statement ';' | ifelse_statements | for_statements | while_statements | RETURN ( Identifier | Character_constant | Integer_constant | Floating_point_constant ) ';' );
	public final int statement() throws RecognitionException {
		int attr_type = 0;


		int sub_statement26 =0;

		try {
			// myChecker.g:232:2: ( sub_statement ';' | ifelse_statements | for_statements | while_statements | RETURN ( Identifier | Character_constant | Integer_constant | Floating_point_constant ) ';' )
			int alt13=5;
			switch ( input.LA(1) ) {
			case Character_constant:
			case Floating_point_constant:
			case Identifier:
			case Integer_constant:
			case MM_OP:
			case PP_OP:
			case SUB_OP:
			case 54:
				{
				alt13=1;
				}
				break;
			case IF:
				{
				alt13=2;
				}
				break;
			case FOR:
				{
				alt13=3;
				}
				break;
			case WHILE:
				{
				alt13=4;
				}
				break;
			case RETURN:
				{
				alt13=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// myChecker.g:232:4: sub_statement ';'
					{
					pushFollow(FOLLOW_sub_statement_in_statement709);
					sub_statement26=sub_statement();
					state._fsp--;

					match(input,56,FOLLOW_56_in_statement711); 
					attr_type = sub_statement26;
					}
					break;
				case 2 :
					// myChecker.g:233:4: ifelse_statements
					{
					pushFollow(FOLLOW_ifelse_statements_in_statement718);
					ifelse_statements();
					state._fsp--;

					}
					break;
				case 3 :
					// myChecker.g:234:7: for_statements
					{
					pushFollow(FOLLOW_for_statements_in_statement726);
					for_statements();
					state._fsp--;

					}
					break;
				case 4 :
					// myChecker.g:235:7: while_statements
					{
					pushFollow(FOLLOW_while_statements_in_statement734);
					while_statements();
					state._fsp--;

					}
					break;
				case 5 :
					// myChecker.g:236:7: RETURN ( Identifier | Character_constant | Integer_constant | Floating_point_constant ) ';'
					{
					match(input,RETURN,FOLLOW_RETURN_in_statement742); 
					if ( input.LA(1)==Character_constant||input.LA(1)==Floating_point_constant||(input.LA(1) >= Identifier && input.LA(1) <= Integer_constant) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,56,FOLLOW_56_in_statement754); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_type;
	}
	// $ANTLR end "statement"



	// $ANTLR start "ifelse_statements"
	// myChecker.g:239:1: ifelse_statements : IF '(' arith_expression ')' block_of_statements ( ELSE_ block_of_statements )? ;
	public final void ifelse_statements() throws RecognitionException {
		try {
			// myChecker.g:240:5: ( IF '(' arith_expression ')' block_of_statements ( ELSE_ block_of_statements )? )
			// myChecker.g:240:7: IF '(' arith_expression ')' block_of_statements ( ELSE_ block_of_statements )?
			{
			match(input,IF,FOLLOW_IF_in_ifelse_statements768); 
			match(input,54,FOLLOW_54_in_ifelse_statements770); 
			pushFollow(FOLLOW_arith_expression_in_ifelse_statements772);
			arith_expression();
			state._fsp--;

			match(input,55,FOLLOW_55_in_ifelse_statements774); 
			pushFollow(FOLLOW_block_of_statements_in_ifelse_statements776);
			block_of_statements();
			state._fsp--;

			// myChecker.g:240:55: ( ELSE_ block_of_statements )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==ELSE_) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// myChecker.g:240:56: ELSE_ block_of_statements
					{
					match(input,ELSE_,FOLLOW_ELSE__in_ifelse_statements779); 
					pushFollow(FOLLOW_block_of_statements_in_ifelse_statements781);
					block_of_statements();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ifelse_statements"



	// $ANTLR start "for_statements"
	// myChecker.g:242:1: for_statements : FOR '(' sub_statement ';' sub_statement ';' sub_statement ')' block_of_statements ;
	public final void for_statements() throws RecognitionException {
		try {
			// myChecker.g:243:5: ( FOR '(' sub_statement ';' sub_statement ';' sub_statement ')' block_of_statements )
			// myChecker.g:243:7: FOR '(' sub_statement ';' sub_statement ';' sub_statement ')' block_of_statements
			{
			match(input,FOR,FOLLOW_FOR_in_for_statements796); 
			match(input,54,FOLLOW_54_in_for_statements798); 
			pushFollow(FOLLOW_sub_statement_in_for_statements800);
			sub_statement();
			state._fsp--;

			match(input,56,FOLLOW_56_in_for_statements802); 
			pushFollow(FOLLOW_sub_statement_in_for_statements804);
			sub_statement();
			state._fsp--;

			match(input,56,FOLLOW_56_in_for_statements806); 
			pushFollow(FOLLOW_sub_statement_in_for_statements808);
			sub_statement();
			state._fsp--;

			match(input,55,FOLLOW_55_in_for_statements810); 
			pushFollow(FOLLOW_block_of_statements_in_for_statements813);
			block_of_statements();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "for_statements"



	// $ANTLR start "while_statements"
	// myChecker.g:246:1: while_statements : WHILE '(' sub_statement ')' block_of_statements ;
	public final void while_statements() throws RecognitionException {
		try {
			// myChecker.g:247:5: ( WHILE '(' sub_statement ')' block_of_statements )
			// myChecker.g:247:7: WHILE '(' sub_statement ')' block_of_statements
			{
			match(input,WHILE,FOLLOW_WHILE_in_while_statements830); 
			match(input,54,FOLLOW_54_in_while_statements832); 
			pushFollow(FOLLOW_sub_statement_in_while_statements834);
			sub_statement();
			state._fsp--;

			match(input,55,FOLLOW_55_in_while_statements836); 
			pushFollow(FOLLOW_block_of_statements_in_while_statements838);
			block_of_statements();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "while_statements"



	// $ANTLR start "block_of_statements"
	// myChecker.g:250:1: block_of_statements : ( statement | '{' statements '}' );
	public final void block_of_statements() throws RecognitionException {
		try {
			// myChecker.g:251:5: ( statement | '{' statements '}' )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==Character_constant||(LA15_0 >= FOR && LA15_0 <= Floating_point_constant)||LA15_0==IF||(LA15_0 >= Identifier && LA15_0 <= Integer_constant)||LA15_0==MM_OP||(LA15_0 >= PP_OP && LA15_0 <= RETURN)||LA15_0==SUB_OP||LA15_0==WHILE||LA15_0==54) ) {
				alt15=1;
			}
			else if ( (LA15_0==57) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// myChecker.g:251:7: statement
					{
					pushFollow(FOLLOW_statement_in_block_of_statements856);
					statement();
					state._fsp--;

					}
					break;
				case 2 :
					// myChecker.g:252:7: '{' statements '}'
					{
					match(input,57,FOLLOW_57_in_block_of_statements864); 
					pushFollow(FOLLOW_statements_in_block_of_statements866);
					statements();
					state._fsp--;

					match(input,58,FOLLOW_58_in_block_of_statements868); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "block_of_statements"

	// Delegated rules



	public static final BitSet FOLLOW_set_in_program23 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_MAIN_in_program31 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_program33 = new BitSet(new long[]{0x07FFFFFFFFFFFFF0L});
	public static final BitSet FOLLOW_55_in_program38 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_program40 = new BitSet(new long[]{0x0448980879C1A000L});
	public static final BitSet FOLLOW_declarations_in_program42 = new BitSet(new long[]{0x0448980869810000L});
	public static final BitSet FOLLOW_statements_in_program44 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_program46 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_const_type_in_declarations64 = new BitSet(new long[]{0x0000000010402000L});
	public static final BitSet FOLLOW_type_in_declarations66 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_Identifier_in_declarations68 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_ASSIGN_OP_in_declarations80 = new BitSet(new long[]{0x0040800061010000L});
	public static final BitSet FOLLOW_arith_expression_in_declarations82 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_declarations89 = new BitSet(new long[]{0x000000001040A000L});
	public static final BitSet FOLLOW_declarations_in_declarations91 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_const_type114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_type147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements165 = new BitSet(new long[]{0x0048980869810000L});
	public static final BitSet FOLLOW_statements_in_statements167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression187 = new BitSet(new long[]{0x0000810186200022L});
	public static final BitSet FOLLOW_ADD_OP_in_arith_expression199 = new BitSet(new long[]{0x0040800061010000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression205 = new BitSet(new long[]{0x0000810186200022L});
	public static final BitSet FOLLOW_SUB_OP_in_arith_expression219 = new BitSet(new long[]{0x0040800061010000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression225 = new BitSet(new long[]{0x0000810186200022L});
	public static final BitSet FOLLOW_EQ_OP_in_arith_expression242 = new BitSet(new long[]{0x0040800061010000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression248 = new BitSet(new long[]{0x0000810186200022L});
	public static final BitSet FOLLOW_LE_OP_in_arith_expression265 = new BitSet(new long[]{0x0040800061010000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression271 = new BitSet(new long[]{0x0000810186200022L});
	public static final BitSet FOLLOW_GE_OP_in_arith_expression288 = new BitSet(new long[]{0x0040800061010000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression294 = new BitSet(new long[]{0x0000810186200022L});
	public static final BitSet FOLLOW_NE_OP_in_arith_expression311 = new BitSet(new long[]{0x0040800061010000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression317 = new BitSet(new long[]{0x0000810186200022L});
	public static final BitSet FOLLOW_GREATER_OP_in_arith_expression334 = new BitSet(new long[]{0x0040800061010000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression340 = new BitSet(new long[]{0x0000810186200022L});
	public static final BitSet FOLLOW_LESS_OP_in_arith_expression357 = new BitSet(new long[]{0x0040800061010000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression363 = new BitSet(new long[]{0x0000810186200022L});
	public static final BitSet FOLLOW_signExpr_in_multExpr395 = new BitSet(new long[]{0x0000008000040002L});
	public static final BitSet FOLLOW_MUL_OP_in_multExpr407 = new BitSet(new long[]{0x0040800061010000L});
	public static final BitSet FOLLOW_signExpr_in_multExpr409 = new BitSet(new long[]{0x0000008000040002L});
	public static final BitSet FOLLOW_DIV_OP_in_multExpr419 = new BitSet(new long[]{0x0040800061010000L});
	public static final BitSet FOLLOW_signExpr_in_multExpr421 = new BitSet(new long[]{0x0000008000040002L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUB_OP_in_signExpr449 = new BitSet(new long[]{0x0040000061010000L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_primaryExpr473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Floating_point_constant_in_primaryExpr487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Character_constant_in_primaryExpr494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_primaryExpr531 = new BitSet(new long[]{0x0040800061010000L});
	public static final BitSet FOLLOW_arith_expression_in_primaryExpr533 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_primaryExpr535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_uniry_op__in_uniry_op558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PP_OP_in_uniry_op_592 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_Identifier_in_uniry_op_594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_uniry_op_604 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_PP_OP_in_uniry_op_606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MM_OP_in_uniry_op_616 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_Identifier_in_uniry_op_618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_uniry_op_628 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_MM_OP_in_uniry_op_630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_uniry_op_in_sub_statement658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_sub_statement668 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ASSIGN_OP_in_sub_statement670 = new BitSet(new long[]{0x0040800061010000L});
	public static final BitSet FOLLOW_arith_expression_in_sub_statement672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expression_in_sub_statement688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sub_statement_in_statement709 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_statement711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifelse_statements_in_statement718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_statements_in_statement726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_statements_in_statement734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_statement742 = new BitSet(new long[]{0x0000000061010000L});
	public static final BitSet FOLLOW_set_in_statement744 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_statement754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifelse_statements768 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_ifelse_statements770 = new BitSet(new long[]{0x0040800061010000L});
	public static final BitSet FOLLOW_arith_expression_in_ifelse_statements772 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_ifelse_statements774 = new BitSet(new long[]{0x0248980869810000L});
	public static final BitSet FOLLOW_block_of_statements_in_ifelse_statements776 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_ELSE__in_ifelse_statements779 = new BitSet(new long[]{0x0248980869810000L});
	public static final BitSet FOLLOW_block_of_statements_in_ifelse_statements781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_for_statements796 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_for_statements798 = new BitSet(new long[]{0x0040880861010000L});
	public static final BitSet FOLLOW_sub_statement_in_for_statements800 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_for_statements802 = new BitSet(new long[]{0x0040880861010000L});
	public static final BitSet FOLLOW_sub_statement_in_for_statements804 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_for_statements806 = new BitSet(new long[]{0x0040880861010000L});
	public static final BitSet FOLLOW_sub_statement_in_for_statements808 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_for_statements810 = new BitSet(new long[]{0x0248980869810000L});
	public static final BitSet FOLLOW_block_of_statements_in_for_statements813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_statements830 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_while_statements832 = new BitSet(new long[]{0x0040880861010000L});
	public static final BitSet FOLLOW_sub_statement_in_while_statements834 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_while_statements836 = new BitSet(new long[]{0x0248980869810000L});
	public static final BitSet FOLLOW_block_of_statements_in_while_statements838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_block_of_statements856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_block_of_statements864 = new BitSet(new long[]{0x0448980869810000L});
	public static final BitSet FOLLOW_statements_in_block_of_statements866 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_block_of_statements868 = new BitSet(new long[]{0x0000000000000002L});
}
