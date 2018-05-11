// $ANTLR 3.5.2 mylexer.g 2018-04-08 21:30:40

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class mylexer extends Lexer {
	public static final int EOF=-1;
	public static final int ADD_ASS_OP=4;
	public static final int ADD_OP=5;
	public static final int AND_ASS_OP=6;
	public static final int AND_OP=7;
	public static final int ARROW_OP=8;
	public static final int ASSIGN_OP=9;
	public static final int BIT_AND_OP=10;
	public static final int BIT_OR_OP=11;
	public static final int BIT_XOR_OP=12;
	public static final int CHARACTER=13;
	public static final int CHAR_TYPE=14;
	public static final int COMMA_OP=15;
	public static final int COMMENT1=16;
	public static final int COMMENT2=17;
	public static final int CONST_TYPE=18;
	public static final int DEC_NUM=19;
	public static final int DIGIT=20;
	public static final int DIV_ASS_OP=21;
	public static final int DIV_OP=22;
	public static final int DOT_OP=23;
	public static final int DOUBLE_TYPE=24;
	public static final int DO_=25;
	public static final int ELSE_=26;
	public static final int EQ_OP=27;
	public static final int FLOAT_NUM=28;
	public static final int FLOAT_NUM1=29;
	public static final int FLOAT_NUM2=30;
	public static final int FLOAT_TYPE=31;
	public static final int FOR_=32;
	public static final int GE_OP=33;
	public static final int GOTO_=34;
	public static final int GREATER_OP=35;
	public static final int ID=36;
	public static final int IF_=37;
	public static final int INT_TYPE=38;
	public static final int LEFT_BRACKET=39;
	public static final int LEFT_B_BRACKET=40;
	public static final int LEFT_M_BRACKET=41;
	public static final int LESS_OP=42;
	public static final int LETTER=43;
	public static final int LE_OP=44;
	public static final int LITERAL=45;
	public static final int LONG_TYPE=46;
	public static final int LSHIFT_OP=47;
	public static final int MACRO=48;
	public static final int MM_OP=49;
	public static final int MOD_ASS_OP=50;
	public static final int MOD_OP=51;
	public static final int MUL_ASS_OP=52;
	public static final int MUL_OP=53;
	public static final int NEW_LINE=54;
	public static final int NE_OP=55;
	public static final int OR_ASS_OP=56;
	public static final int OR_OP=57;
	public static final int PP_OP=58;
	public static final int RIGHT_BRACKET=59;
	public static final int RIGHT_B_BRACKET=60;
	public static final int RIGHT_M_BRACKET=61;
	public static final int RSHIFT_OP=62;
	public static final int SEMICOLON=63;
	public static final int STRUCT_=64;
	public static final int SUB_ASS_OP=65;
	public static final int SUB_OP=66;
	public static final int TRINARY_OP1=67;
	public static final int TRINARY_OP2=68;
	public static final int TYPEDEF_=69;
	public static final int UNSIGNED_TYPE=70;
	public static final int VOID_TYPE=71;
	public static final int WHILE_=72;
	public static final int WS=73;
	public static final int XOR_ASS_OP=74;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public mylexer() {} 
	public mylexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public mylexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "mylexer.g"; }

	// $ANTLR start "COMMENT1"
	public final void mCOMMENT1() throws RecognitionException {
		try {
			int _type = COMMENT1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:8:10: ( '//' ( . )* '\\n' )
			// mylexer.g:8:12: '//' ( . )* '\\n'
			{
			match("//"); 

			// mylexer.g:8:16: ( . )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='\n') ) {
					alt1=2;
				}
				else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\uFFFF')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// mylexer.g:8:17: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop1;
				}
			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT1"

	// $ANTLR start "COMMENT2"
	public final void mCOMMENT2() throws RecognitionException {
		try {
			int _type = COMMENT2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:9:10: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// mylexer.g:9:12: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// mylexer.g:9:17: ( options {greedy=false; } : . )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0=='*') ) {
					int LA2_1 = input.LA(2);
					if ( (LA2_1=='/') ) {
						alt2=2;
					}
					else if ( ((LA2_1 >= '\u0000' && LA2_1 <= '.')||(LA2_1 >= '0' && LA2_1 <= '\uFFFF')) ) {
						alt2=1;
					}

				}
				else if ( ((LA2_0 >= '\u0000' && LA2_0 <= ')')||(LA2_0 >= '+' && LA2_0 <= '\uFFFF')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// mylexer.g:9:42: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop2;
				}
			}

			match("*/"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT2"

	// $ANTLR start "MACRO"
	public final void mMACRO() throws RecognitionException {
		try {
			int _type = MACRO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:12:7: ( '#' ( . )* '\\n' )
			// mylexer.g:12:9: '#' ( . )* '\\n'
			{
			match('#'); 
			// mylexer.g:12:12: ( . )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0=='\n') ) {
					alt3=2;
				}
				else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\uFFFF')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// mylexer.g:12:13: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop3;
				}
			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MACRO"

	// $ANTLR start "UNSIGNED_TYPE"
	public final void mUNSIGNED_TYPE() throws RecognitionException {
		try {
			int _type = UNSIGNED_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:17:15: ( 'unsigned' )
			// mylexer.g:17:18: 'unsigned'
			{
			match("unsigned"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNSIGNED_TYPE"

	// $ANTLR start "LONG_TYPE"
	public final void mLONG_TYPE() throws RecognitionException {
		try {
			int _type = LONG_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:18:15: ( 'long' )
			// mylexer.g:18:18: 'long'
			{
			match("long"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LONG_TYPE"

	// $ANTLR start "CONST_TYPE"
	public final void mCONST_TYPE() throws RecognitionException {
		try {
			int _type = CONST_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:19:15: ( 'const' )
			// mylexer.g:19:18: 'const'
			{
			match("const"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONST_TYPE"

	// $ANTLR start "INT_TYPE"
	public final void mINT_TYPE() throws RecognitionException {
		try {
			int _type = INT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:20:15: ( 'int' )
			// mylexer.g:20:18: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_TYPE"

	// $ANTLR start "CHAR_TYPE"
	public final void mCHAR_TYPE() throws RecognitionException {
		try {
			int _type = CHAR_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:21:15: ( 'char' )
			// mylexer.g:21:18: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_TYPE"

	// $ANTLR start "VOID_TYPE"
	public final void mVOID_TYPE() throws RecognitionException {
		try {
			int _type = VOID_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:22:15: ( 'void' )
			// mylexer.g:22:18: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID_TYPE"

	// $ANTLR start "FLOAT_TYPE"
	public final void mFLOAT_TYPE() throws RecognitionException {
		try {
			int _type = FLOAT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:23:15: ( 'float' )
			// mylexer.g:23:18: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_TYPE"

	// $ANTLR start "DOUBLE_TYPE"
	public final void mDOUBLE_TYPE() throws RecognitionException {
		try {
			int _type = DOUBLE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:24:15: ( 'double' )
			// mylexer.g:24:18: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE_TYPE"

	// $ANTLR start "IF_"
	public final void mIF_() throws RecognitionException {
		try {
			int _type = IF_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:25:15: ( 'if' )
			// mylexer.g:25:18: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF_"

	// $ANTLR start "ELSE_"
	public final void mELSE_() throws RecognitionException {
		try {
			int _type = ELSE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:26:15: ( 'else' )
			// mylexer.g:26:18: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE_"

	// $ANTLR start "WHILE_"
	public final void mWHILE_() throws RecognitionException {
		try {
			int _type = WHILE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:27:15: ( 'while' )
			// mylexer.g:27:18: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE_"

	// $ANTLR start "FOR_"
	public final void mFOR_() throws RecognitionException {
		try {
			int _type = FOR_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:28:15: ( 'for' )
			// mylexer.g:28:18: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR_"

	// $ANTLR start "DO_"
	public final void mDO_() throws RecognitionException {
		try {
			int _type = DO_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:29:15: ( 'do' )
			// mylexer.g:29:18: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO_"

	// $ANTLR start "GOTO_"
	public final void mGOTO_() throws RecognitionException {
		try {
			int _type = GOTO_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:30:15: ( 'goto' )
			// mylexer.g:30:18: 'goto'
			{
			match("goto"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GOTO_"

	// $ANTLR start "STRUCT_"
	public final void mSTRUCT_() throws RecognitionException {
		try {
			int _type = STRUCT_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:31:15: ( 'struct' )
			// mylexer.g:31:18: 'struct'
			{
			match("struct"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRUCT_"

	// $ANTLR start "TYPEDEF_"
	public final void mTYPEDEF_() throws RecognitionException {
		try {
			int _type = TYPEDEF_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:32:15: ( 'typedef' )
			// mylexer.g:32:18: 'typedef'
			{
			match("typedef"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPEDEF_"

	// $ANTLR start "EQ_OP"
	public final void mEQ_OP() throws RecognitionException {
		try {
			int _type = EQ_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:38:7: ( '==' )
			// mylexer.g:38:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ_OP"

	// $ANTLR start "LE_OP"
	public final void mLE_OP() throws RecognitionException {
		try {
			int _type = LE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:39:7: ( '<=' )
			// mylexer.g:39:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE_OP"

	// $ANTLR start "GE_OP"
	public final void mGE_OP() throws RecognitionException {
		try {
			int _type = GE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:40:7: ( '>=' )
			// mylexer.g:40:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE_OP"

	// $ANTLR start "NE_OP"
	public final void mNE_OP() throws RecognitionException {
		try {
			int _type = NE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:41:7: ( '!=' )
			// mylexer.g:41:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NE_OP"

	// $ANTLR start "ADD_ASS_OP"
	public final void mADD_ASS_OP() throws RecognitionException {
		try {
			int _type = ADD_ASS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:42:12: ( '+=' )
			// mylexer.g:42:14: '+='
			{
			match("+="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD_ASS_OP"

	// $ANTLR start "SUB_ASS_OP"
	public final void mSUB_ASS_OP() throws RecognitionException {
		try {
			int _type = SUB_ASS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:43:12: ( '-=' )
			// mylexer.g:43:14: '-='
			{
			match("-="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUB_ASS_OP"

	// $ANTLR start "MUL_ASS_OP"
	public final void mMUL_ASS_OP() throws RecognitionException {
		try {
			int _type = MUL_ASS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:44:12: ( '*=' )
			// mylexer.g:44:14: '*='
			{
			match("*="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL_ASS_OP"

	// $ANTLR start "DIV_ASS_OP"
	public final void mDIV_ASS_OP() throws RecognitionException {
		try {
			int _type = DIV_ASS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:45:12: ( '/=' )
			// mylexer.g:45:14: '/='
			{
			match("/="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV_ASS_OP"

	// $ANTLR start "MOD_ASS_OP"
	public final void mMOD_ASS_OP() throws RecognitionException {
		try {
			int _type = MOD_ASS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:46:12: ( '%=' )
			// mylexer.g:46:14: '%='
			{
			match("%="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD_ASS_OP"

	// $ANTLR start "AND_ASS_OP"
	public final void mAND_ASS_OP() throws RecognitionException {
		try {
			int _type = AND_ASS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:47:12: ( '&=' )
			// mylexer.g:47:14: '&='
			{
			match("&="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND_ASS_OP"

	// $ANTLR start "OR_ASS_OP"
	public final void mOR_ASS_OP() throws RecognitionException {
		try {
			int _type = OR_ASS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:48:12: ( '|=' )
			// mylexer.g:48:14: '|='
			{
			match("|="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR_ASS_OP"

	// $ANTLR start "XOR_ASS_OP"
	public final void mXOR_ASS_OP() throws RecognitionException {
		try {
			int _type = XOR_ASS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:49:12: ( '^=' )
			// mylexer.g:49:14: '^='
			{
			match("^="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "XOR_ASS_OP"

	// $ANTLR start "PP_OP"
	public final void mPP_OP() throws RecognitionException {
		try {
			int _type = PP_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:50:7: ( '++' )
			// mylexer.g:50:9: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PP_OP"

	// $ANTLR start "MM_OP"
	public final void mMM_OP() throws RecognitionException {
		try {
			int _type = MM_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:51:7: ( '--' )
			// mylexer.g:51:9: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MM_OP"

	// $ANTLR start "AND_OP"
	public final void mAND_OP() throws RecognitionException {
		try {
			int _type = AND_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:52:8: ( '&&' )
			// mylexer.g:52:10: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND_OP"

	// $ANTLR start "OR_OP"
	public final void mOR_OP() throws RecognitionException {
		try {
			int _type = OR_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:53:7: ( '||' )
			// mylexer.g:53:9: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR_OP"

	// $ANTLR start "RSHIFT_OP"
	public final void mRSHIFT_OP() throws RecognitionException {
		try {
			int _type = RSHIFT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:54:11: ( '<<' )
			// mylexer.g:54:13: '<<'
			{
			match("<<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSHIFT_OP"

	// $ANTLR start "LSHIFT_OP"
	public final void mLSHIFT_OP() throws RecognitionException {
		try {
			int _type = LSHIFT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:55:11: ( '>>' )
			// mylexer.g:55:13: '>>'
			{
			match(">>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSHIFT_OP"

	// $ANTLR start "ARROW_OP"
	public final void mARROW_OP() throws RecognitionException {
		try {
			int _type = ARROW_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:56:9: ( '->' )
			// mylexer.g:56:11: '->'
			{
			match("->"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARROW_OP"

	// $ANTLR start "ASSIGN_OP"
	public final void mASSIGN_OP() throws RecognitionException {
		try {
			int _type = ASSIGN_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:57:11: ( '=' )
			// mylexer.g:57:13: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN_OP"

	// $ANTLR start "LESS_OP"
	public final void mLESS_OP() throws RecognitionException {
		try {
			int _type = LESS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:58:9: ( '<' )
			// mylexer.g:58:11: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESS_OP"

	// $ANTLR start "GREATER_OP"
	public final void mGREATER_OP() throws RecognitionException {
		try {
			int _type = GREATER_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:59:12: ( '>' )
			// mylexer.g:59:14: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATER_OP"

	// $ANTLR start "BIT_AND_OP"
	public final void mBIT_AND_OP() throws RecognitionException {
		try {
			int _type = BIT_AND_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:60:12: ( '&' )
			// mylexer.g:60:14: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BIT_AND_OP"

	// $ANTLR start "BIT_OR_OP"
	public final void mBIT_OR_OP() throws RecognitionException {
		try {
			int _type = BIT_OR_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:61:12: ( '|' )
			// mylexer.g:61:14: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BIT_OR_OP"

	// $ANTLR start "BIT_XOR_OP"
	public final void mBIT_XOR_OP() throws RecognitionException {
		try {
			int _type = BIT_XOR_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:62:12: ( '^' )
			// mylexer.g:62:14: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BIT_XOR_OP"

	// $ANTLR start "ADD_OP"
	public final void mADD_OP() throws RecognitionException {
		try {
			int _type = ADD_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:63:9: ( '+' )
			// mylexer.g:63:11: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD_OP"

	// $ANTLR start "SUB_OP"
	public final void mSUB_OP() throws RecognitionException {
		try {
			int _type = SUB_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:64:9: ( '-' )
			// mylexer.g:64:11: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUB_OP"

	// $ANTLR start "DIV_OP"
	public final void mDIV_OP() throws RecognitionException {
		try {
			int _type = DIV_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:65:9: ( '/' )
			// mylexer.g:65:11: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV_OP"

	// $ANTLR start "MUL_OP"
	public final void mMUL_OP() throws RecognitionException {
		try {
			int _type = MUL_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:66:9: ( '*' )
			// mylexer.g:66:11: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL_OP"

	// $ANTLR start "MOD_OP"
	public final void mMOD_OP() throws RecognitionException {
		try {
			int _type = MOD_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:67:9: ( '%' )
			// mylexer.g:67:11: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD_OP"

	// $ANTLR start "COMMA_OP"
	public final void mCOMMA_OP() throws RecognitionException {
		try {
			int _type = COMMA_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:68:9: ( ',' )
			// mylexer.g:68:11: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA_OP"

	// $ANTLR start "DOT_OP"
	public final void mDOT_OP() throws RecognitionException {
		try {
			int _type = DOT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:69:7: ( '.' )
			// mylexer.g:69:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT_OP"

	// $ANTLR start "TRINARY_OP1"
	public final void mTRINARY_OP1() throws RecognitionException {
		try {
			int _type = TRINARY_OP1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:70:12: ( '?' )
			// mylexer.g:70:14: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRINARY_OP1"

	// $ANTLR start "TRINARY_OP2"
	public final void mTRINARY_OP2() throws RecognitionException {
		try {
			int _type = TRINARY_OP2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:71:12: ( ':' )
			// mylexer.g:71:14: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRINARY_OP2"

	// $ANTLR start "DEC_NUM"
	public final void mDEC_NUM() throws RecognitionException {
		try {
			int _type = DEC_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:76:9: ( ( '0' | ( '1' .. '9' ) ( DIGIT )* ) ( LETTER )* )
			// mylexer.g:76:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* ) ( LETTER )*
			{
			// mylexer.g:76:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='0') ) {
				alt5=1;
			}
			else if ( ((LA5_0 >= '1' && LA5_0 <= '9')) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// mylexer.g:76:12: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// mylexer.g:76:18: ( '1' .. '9' ) ( DIGIT )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// mylexer.g:76:28: ( DIGIT )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// mylexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop4;
						}
					}

					}
					break;

			}

			// mylexer.g:76:37: ( LETTER )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEC_NUM"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:78:4: ( ( LETTER ) ( LETTER | DIGIT )* )
			// mylexer.g:78:6: ( LETTER ) ( LETTER | DIGIT )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// mylexer.g:78:14: ( LETTER | DIGIT )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop7;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "FLOAT_NUM"
	public final void mFLOAT_NUM() throws RecognitionException {
		try {
			int _type = FLOAT_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:80:10: ( ( FLOAT_NUM1 | FLOAT_NUM2 ) ( LETTER )* )
			// mylexer.g:80:12: ( FLOAT_NUM1 | FLOAT_NUM2 ) ( LETTER )*
			{
			// mylexer.g:80:12: ( FLOAT_NUM1 | FLOAT_NUM2 )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
				alt8=1;
			}
			else if ( (LA8_0=='.') ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// mylexer.g:80:13: FLOAT_NUM1
					{
					mFLOAT_NUM1(); 

					}
					break;
				case 2 :
					// mylexer.g:80:26: FLOAT_NUM2
					{
					mFLOAT_NUM2(); 

					}
					break;

			}

			// mylexer.g:80:37: ( LETTER )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= 'A' && LA9_0 <= 'Z')||LA9_0=='_'||(LA9_0 >= 'a' && LA9_0 <= 'z')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop9;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM"

	// $ANTLR start "FLOAT_NUM1"
	public final void mFLOAT_NUM1() throws RecognitionException {
		try {
			// mylexer.g:81:20: ( ( DIGIT )+ '.' ( DIGIT )* )
			// mylexer.g:81:22: ( DIGIT )+ '.' ( DIGIT )*
			{
			// mylexer.g:81:22: ( DIGIT )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			match('.'); 
			// mylexer.g:81:33: ( DIGIT )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop11;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM1"

	// $ANTLR start "FLOAT_NUM2"
	public final void mFLOAT_NUM2() throws RecognitionException {
		try {
			// mylexer.g:82:20: ( '.' ( DIGIT )+ )
			// mylexer.g:82:22: '.' ( DIGIT )+
			{
			match('.'); 
			// mylexer.g:82:25: ( DIGIT )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM2"

	// $ANTLR start "LITERAL"
	public final void mLITERAL() throws RecognitionException {
		try {
			int _type = LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:87:8: ( '\\\"' ( . )* '\\\"' )
			// mylexer.g:87:10: '\\\"' ( . )* '\\\"'
			{
			match('\"'); 
			// mylexer.g:87:14: ( . )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0=='\"') ) {
					alt13=2;
				}
				else if ( ((LA13_0 >= '\u0000' && LA13_0 <= '!')||(LA13_0 >= '#' && LA13_0 <= '\uFFFF')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// mylexer.g:87:15: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop13;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LITERAL"

	// $ANTLR start "CHARACTER"
	public final void mCHARACTER() throws RecognitionException {
		try {
			int _type = CHARACTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:88:10: ( '\\'' ( . ) '\\'' )
			// mylexer.g:88:12: '\\'' ( . ) '\\''
			{
			match('\''); 
			// mylexer.g:88:16: ( . )
			// mylexer.g:88:17: .
			{
			matchAny(); 
			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHARACTER"

	// $ANTLR start "LEFT_BRACKET"
	public final void mLEFT_BRACKET() throws RecognitionException {
		try {
			int _type = LEFT_BRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:93:13: ( '(' )
			// mylexer.g:93:15: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFT_BRACKET"

	// $ANTLR start "RIGHT_BRACKET"
	public final void mRIGHT_BRACKET() throws RecognitionException {
		try {
			int _type = RIGHT_BRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:94:14: ( ')' )
			// mylexer.g:94:16: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHT_BRACKET"

	// $ANTLR start "LEFT_B_BRACKET"
	public final void mLEFT_B_BRACKET() throws RecognitionException {
		try {
			int _type = LEFT_B_BRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:95:15: ( '{' )
			// mylexer.g:95:17: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFT_B_BRACKET"

	// $ANTLR start "RIGHT_B_BRACKET"
	public final void mRIGHT_B_BRACKET() throws RecognitionException {
		try {
			int _type = RIGHT_B_BRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:96:16: ( '}' )
			// mylexer.g:96:18: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHT_B_BRACKET"

	// $ANTLR start "LEFT_M_BRACKET"
	public final void mLEFT_M_BRACKET() throws RecognitionException {
		try {
			int _type = LEFT_M_BRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:97:15: ( '[' )
			// mylexer.g:97:17: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFT_M_BRACKET"

	// $ANTLR start "RIGHT_M_BRACKET"
	public final void mRIGHT_M_BRACKET() throws RecognitionException {
		try {
			int _type = RIGHT_M_BRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:98:16: ( ']' )
			// mylexer.g:98:18: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHT_M_BRACKET"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// mylexer.g:101:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
			// mylexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// mylexer.g:102:16: ( '0' .. '9' )
			// mylexer.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:104:10: ( ';' )
			// mylexer.g:104:12: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "NEW_LINE"
	public final void mNEW_LINE() throws RecognitionException {
		try {
			int _type = NEW_LINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:105:9: ( '\\n' )
			// mylexer.g:105:11: '\\n'
			{
			match('\n'); 
			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEW_LINE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:106:5: ( ( ' ' | '\\r' | '\\t' )+ )
			// mylexer.g:106:7: ( ' ' | '\\r' | '\\t' )+
			{
			// mylexer.g:106:7: ( ' ' | '\\r' | '\\t' )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0=='\t'||LA14_0=='\r'||LA14_0==' ') ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// mylexer.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// mylexer.g:1:8: ( COMMENT1 | COMMENT2 | MACRO | UNSIGNED_TYPE | LONG_TYPE | CONST_TYPE | INT_TYPE | CHAR_TYPE | VOID_TYPE | FLOAT_TYPE | DOUBLE_TYPE | IF_ | ELSE_ | WHILE_ | FOR_ | DO_ | GOTO_ | STRUCT_ | TYPEDEF_ | EQ_OP | LE_OP | GE_OP | NE_OP | ADD_ASS_OP | SUB_ASS_OP | MUL_ASS_OP | DIV_ASS_OP | MOD_ASS_OP | AND_ASS_OP | OR_ASS_OP | XOR_ASS_OP | PP_OP | MM_OP | AND_OP | OR_OP | RSHIFT_OP | LSHIFT_OP | ARROW_OP | ASSIGN_OP | LESS_OP | GREATER_OP | BIT_AND_OP | BIT_OR_OP | BIT_XOR_OP | ADD_OP | SUB_OP | DIV_OP | MUL_OP | MOD_OP | COMMA_OP | DOT_OP | TRINARY_OP1 | TRINARY_OP2 | DEC_NUM | ID | FLOAT_NUM | LITERAL | CHARACTER | LEFT_BRACKET | RIGHT_BRACKET | LEFT_B_BRACKET | RIGHT_B_BRACKET | LEFT_M_BRACKET | RIGHT_M_BRACKET | SEMICOLON | NEW_LINE | WS )
		int alt15=67;
		alt15 = dfa15.predict(input);
		switch (alt15) {
			case 1 :
				// mylexer.g:1:10: COMMENT1
				{
				mCOMMENT1(); 

				}
				break;
			case 2 :
				// mylexer.g:1:19: COMMENT2
				{
				mCOMMENT2(); 

				}
				break;
			case 3 :
				// mylexer.g:1:28: MACRO
				{
				mMACRO(); 

				}
				break;
			case 4 :
				// mylexer.g:1:34: UNSIGNED_TYPE
				{
				mUNSIGNED_TYPE(); 

				}
				break;
			case 5 :
				// mylexer.g:1:48: LONG_TYPE
				{
				mLONG_TYPE(); 

				}
				break;
			case 6 :
				// mylexer.g:1:58: CONST_TYPE
				{
				mCONST_TYPE(); 

				}
				break;
			case 7 :
				// mylexer.g:1:69: INT_TYPE
				{
				mINT_TYPE(); 

				}
				break;
			case 8 :
				// mylexer.g:1:78: CHAR_TYPE
				{
				mCHAR_TYPE(); 

				}
				break;
			case 9 :
				// mylexer.g:1:88: VOID_TYPE
				{
				mVOID_TYPE(); 

				}
				break;
			case 10 :
				// mylexer.g:1:98: FLOAT_TYPE
				{
				mFLOAT_TYPE(); 

				}
				break;
			case 11 :
				// mylexer.g:1:109: DOUBLE_TYPE
				{
				mDOUBLE_TYPE(); 

				}
				break;
			case 12 :
				// mylexer.g:1:121: IF_
				{
				mIF_(); 

				}
				break;
			case 13 :
				// mylexer.g:1:125: ELSE_
				{
				mELSE_(); 

				}
				break;
			case 14 :
				// mylexer.g:1:131: WHILE_
				{
				mWHILE_(); 

				}
				break;
			case 15 :
				// mylexer.g:1:138: FOR_
				{
				mFOR_(); 

				}
				break;
			case 16 :
				// mylexer.g:1:143: DO_
				{
				mDO_(); 

				}
				break;
			case 17 :
				// mylexer.g:1:147: GOTO_
				{
				mGOTO_(); 

				}
				break;
			case 18 :
				// mylexer.g:1:153: STRUCT_
				{
				mSTRUCT_(); 

				}
				break;
			case 19 :
				// mylexer.g:1:161: TYPEDEF_
				{
				mTYPEDEF_(); 

				}
				break;
			case 20 :
				// mylexer.g:1:170: EQ_OP
				{
				mEQ_OP(); 

				}
				break;
			case 21 :
				// mylexer.g:1:176: LE_OP
				{
				mLE_OP(); 

				}
				break;
			case 22 :
				// mylexer.g:1:182: GE_OP
				{
				mGE_OP(); 

				}
				break;
			case 23 :
				// mylexer.g:1:188: NE_OP
				{
				mNE_OP(); 

				}
				break;
			case 24 :
				// mylexer.g:1:194: ADD_ASS_OP
				{
				mADD_ASS_OP(); 

				}
				break;
			case 25 :
				// mylexer.g:1:205: SUB_ASS_OP
				{
				mSUB_ASS_OP(); 

				}
				break;
			case 26 :
				// mylexer.g:1:216: MUL_ASS_OP
				{
				mMUL_ASS_OP(); 

				}
				break;
			case 27 :
				// mylexer.g:1:227: DIV_ASS_OP
				{
				mDIV_ASS_OP(); 

				}
				break;
			case 28 :
				// mylexer.g:1:238: MOD_ASS_OP
				{
				mMOD_ASS_OP(); 

				}
				break;
			case 29 :
				// mylexer.g:1:249: AND_ASS_OP
				{
				mAND_ASS_OP(); 

				}
				break;
			case 30 :
				// mylexer.g:1:260: OR_ASS_OP
				{
				mOR_ASS_OP(); 

				}
				break;
			case 31 :
				// mylexer.g:1:270: XOR_ASS_OP
				{
				mXOR_ASS_OP(); 

				}
				break;
			case 32 :
				// mylexer.g:1:281: PP_OP
				{
				mPP_OP(); 

				}
				break;
			case 33 :
				// mylexer.g:1:287: MM_OP
				{
				mMM_OP(); 

				}
				break;
			case 34 :
				// mylexer.g:1:293: AND_OP
				{
				mAND_OP(); 

				}
				break;
			case 35 :
				// mylexer.g:1:300: OR_OP
				{
				mOR_OP(); 

				}
				break;
			case 36 :
				// mylexer.g:1:306: RSHIFT_OP
				{
				mRSHIFT_OP(); 

				}
				break;
			case 37 :
				// mylexer.g:1:316: LSHIFT_OP
				{
				mLSHIFT_OP(); 

				}
				break;
			case 38 :
				// mylexer.g:1:326: ARROW_OP
				{
				mARROW_OP(); 

				}
				break;
			case 39 :
				// mylexer.g:1:335: ASSIGN_OP
				{
				mASSIGN_OP(); 

				}
				break;
			case 40 :
				// mylexer.g:1:345: LESS_OP
				{
				mLESS_OP(); 

				}
				break;
			case 41 :
				// mylexer.g:1:353: GREATER_OP
				{
				mGREATER_OP(); 

				}
				break;
			case 42 :
				// mylexer.g:1:364: BIT_AND_OP
				{
				mBIT_AND_OP(); 

				}
				break;
			case 43 :
				// mylexer.g:1:375: BIT_OR_OP
				{
				mBIT_OR_OP(); 

				}
				break;
			case 44 :
				// mylexer.g:1:385: BIT_XOR_OP
				{
				mBIT_XOR_OP(); 

				}
				break;
			case 45 :
				// mylexer.g:1:396: ADD_OP
				{
				mADD_OP(); 

				}
				break;
			case 46 :
				// mylexer.g:1:403: SUB_OP
				{
				mSUB_OP(); 

				}
				break;
			case 47 :
				// mylexer.g:1:410: DIV_OP
				{
				mDIV_OP(); 

				}
				break;
			case 48 :
				// mylexer.g:1:417: MUL_OP
				{
				mMUL_OP(); 

				}
				break;
			case 49 :
				// mylexer.g:1:424: MOD_OP
				{
				mMOD_OP(); 

				}
				break;
			case 50 :
				// mylexer.g:1:431: COMMA_OP
				{
				mCOMMA_OP(); 

				}
				break;
			case 51 :
				// mylexer.g:1:440: DOT_OP
				{
				mDOT_OP(); 

				}
				break;
			case 52 :
				// mylexer.g:1:447: TRINARY_OP1
				{
				mTRINARY_OP1(); 

				}
				break;
			case 53 :
				// mylexer.g:1:459: TRINARY_OP2
				{
				mTRINARY_OP2(); 

				}
				break;
			case 54 :
				// mylexer.g:1:471: DEC_NUM
				{
				mDEC_NUM(); 

				}
				break;
			case 55 :
				// mylexer.g:1:479: ID
				{
				mID(); 

				}
				break;
			case 56 :
				// mylexer.g:1:482: FLOAT_NUM
				{
				mFLOAT_NUM(); 

				}
				break;
			case 57 :
				// mylexer.g:1:492: LITERAL
				{
				mLITERAL(); 

				}
				break;
			case 58 :
				// mylexer.g:1:500: CHARACTER
				{
				mCHARACTER(); 

				}
				break;
			case 59 :
				// mylexer.g:1:510: LEFT_BRACKET
				{
				mLEFT_BRACKET(); 

				}
				break;
			case 60 :
				// mylexer.g:1:523: RIGHT_BRACKET
				{
				mRIGHT_BRACKET(); 

				}
				break;
			case 61 :
				// mylexer.g:1:537: LEFT_B_BRACKET
				{
				mLEFT_B_BRACKET(); 

				}
				break;
			case 62 :
				// mylexer.g:1:552: RIGHT_B_BRACKET
				{
				mRIGHT_B_BRACKET(); 

				}
				break;
			case 63 :
				// mylexer.g:1:568: LEFT_M_BRACKET
				{
				mLEFT_M_BRACKET(); 

				}
				break;
			case 64 :
				// mylexer.g:1:583: RIGHT_M_BRACKET
				{
				mRIGHT_M_BRACKET(); 

				}
				break;
			case 65 :
				// mylexer.g:1:599: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 66 :
				// mylexer.g:1:609: NEW_LINE
				{
				mNEW_LINE(); 

				}
				break;
			case 67 :
				// mylexer.g:1:618: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA15 dfa15 = new DFA15(this);
	static final String DFA15_eotS =
		"\1\uffff\1\57\1\uffff\14\40\1\100\1\103\1\106\1\uffff\1\111\1\115\1\117"+
		"\1\121\1\124\1\127\1\131\1\uffff\1\132\2\uffff\2\134\20\uffff\5\40\1\143"+
		"\3\40\1\150\5\40\36\uffff\1\134\4\40\1\162\1\uffff\2\40\1\165\1\40\1\uffff"+
		"\6\40\1\175\1\40\1\177\1\uffff\1\u0080\1\40\1\uffff\1\40\1\u0083\1\40"+
		"\1\u0085\3\40\1\uffff\1\u0089\2\uffff\1\u008a\1\40\1\uffff\1\u008c\1\uffff"+
		"\3\40\2\uffff\1\u0090\1\uffff\1\u0091\2\40\2\uffff\1\u0094\1\u0095\2\uffff";
	static final String DFA15_eofS =
		"\u0096\uffff";
	static final String DFA15_minS =
		"\1\11\1\52\1\uffff\1\156\1\157\1\150\1\146\1\157\1\154\1\157\1\154\1\150"+
		"\1\157\1\164\1\171\1\75\1\74\1\75\1\uffff\1\53\1\55\2\75\1\46\2\75\1\uffff"+
		"\1\60\2\uffff\2\56\20\uffff\1\163\2\156\1\141\1\164\1\60\1\151\1\157\1"+
		"\162\1\60\1\163\1\151\1\164\1\162\1\160\36\uffff\1\56\1\151\1\147\1\163"+
		"\1\162\1\60\1\uffff\1\144\1\141\1\60\1\142\1\uffff\1\145\1\154\1\157\1"+
		"\165\1\145\1\147\1\60\1\164\1\60\1\uffff\1\60\1\164\1\uffff\1\154\1\60"+
		"\1\145\1\60\1\143\1\144\1\156\1\uffff\1\60\2\uffff\1\60\1\145\1\uffff"+
		"\1\60\1\uffff\1\164\2\145\2\uffff\1\60\1\uffff\1\60\1\146\1\144\2\uffff"+
		"\2\60\2\uffff";
	static final String DFA15_maxS =
		"\1\175\1\75\1\uffff\1\156\2\157\1\156\3\157\1\154\1\150\1\157\1\164\1"+
		"\171\2\75\1\76\1\uffff\1\75\1\76\3\75\1\174\1\75\1\uffff\1\71\2\uffff"+
		"\2\71\20\uffff\1\163\2\156\1\141\1\164\1\172\1\151\1\157\1\162\1\172\1"+
		"\163\1\151\1\164\1\162\1\160\36\uffff\1\71\1\151\1\147\1\163\1\162\1\172"+
		"\1\uffff\1\144\1\141\1\172\1\142\1\uffff\1\145\1\154\1\157\1\165\1\145"+
		"\1\147\1\172\1\164\1\172\1\uffff\1\172\1\164\1\uffff\1\154\1\172\1\145"+
		"\1\172\1\143\1\144\1\156\1\uffff\1\172\2\uffff\1\172\1\145\1\uffff\1\172"+
		"\1\uffff\1\164\2\145\2\uffff\1\172\1\uffff\1\172\1\146\1\144\2\uffff\2"+
		"\172\2\uffff";
	static final String DFA15_acceptS =
		"\2\uffff\1\3\17\uffff\1\27\7\uffff\1\62\1\uffff\1\64\1\65\2\uffff\1\67"+
		"\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\1\1\2\1"+
		"\33\1\57\17\uffff\1\24\1\47\1\25\1\44\1\50\1\26\1\45\1\51\1\30\1\40\1"+
		"\55\1\31\1\41\1\46\1\56\1\32\1\60\1\34\1\61\1\35\1\42\1\52\1\36\1\43\1"+
		"\53\1\37\1\54\1\63\1\70\1\66\6\uffff\1\14\4\uffff\1\20\11\uffff\1\7\2"+
		"\uffff\1\17\7\uffff\1\5\1\uffff\1\10\1\11\2\uffff\1\15\1\uffff\1\21\3"+
		"\uffff\1\6\1\12\1\uffff\1\16\3\uffff\1\13\1\22\2\uffff\1\23\1\4";
	static final String DFA15_specialS =
		"\u0096\uffff}>";
	static final String[] DFA15_transitionS = {
			"\1\53\1\52\2\uffff\1\53\22\uffff\1\53\1\22\1\41\1\2\1\uffff\1\26\1\27"+
			"\1\42\1\43\1\44\1\25\1\23\1\32\1\24\1\33\1\1\1\36\11\37\1\35\1\51\1\20"+
			"\1\17\1\21\1\34\1\uffff\32\40\1\47\1\uffff\1\50\1\31\1\40\1\uffff\2\40"+
			"\1\5\1\11\1\12\1\10\1\14\1\40\1\6\2\40\1\4\6\40\1\15\1\16\1\3\1\7\1\13"+
			"\3\40\1\45\1\30\1\46",
			"\1\55\4\uffff\1\54\15\uffff\1\56",
			"",
			"\1\60",
			"\1\61",
			"\1\63\6\uffff\1\62",
			"\1\65\7\uffff\1\64",
			"\1\66",
			"\1\67\2\uffff\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\102\1\101",
			"\1\104\1\105",
			"",
			"\1\110\21\uffff\1\107",
			"\1\113\17\uffff\1\112\1\114",
			"\1\116",
			"\1\120",
			"\1\123\26\uffff\1\122",
			"\1\125\76\uffff\1\126",
			"\1\130",
			"",
			"\12\133",
			"",
			"",
			"\1\133\1\uffff\12\133",
			"\1\133\1\uffff\12\135",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\144",
			"\1\145",
			"\1\146",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\24\40\1\147\5\40",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\133\1\uffff\12\135",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\163",
			"\1\164",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\166",
			"",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\176",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u0081",
			"",
			"\1\u0082",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u0084",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u008b",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u0092",
			"\1\u0093",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			""
	};

	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
	static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
	static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
	static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	protected class DFA15 extends DFA {

		public DFA15(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( COMMENT1 | COMMENT2 | MACRO | UNSIGNED_TYPE | LONG_TYPE | CONST_TYPE | INT_TYPE | CHAR_TYPE | VOID_TYPE | FLOAT_TYPE | DOUBLE_TYPE | IF_ | ELSE_ | WHILE_ | FOR_ | DO_ | GOTO_ | STRUCT_ | TYPEDEF_ | EQ_OP | LE_OP | GE_OP | NE_OP | ADD_ASS_OP | SUB_ASS_OP | MUL_ASS_OP | DIV_ASS_OP | MOD_ASS_OP | AND_ASS_OP | OR_ASS_OP | XOR_ASS_OP | PP_OP | MM_OP | AND_OP | OR_OP | RSHIFT_OP | LSHIFT_OP | ARROW_OP | ASSIGN_OP | LESS_OP | GREATER_OP | BIT_AND_OP | BIT_OR_OP | BIT_XOR_OP | ADD_OP | SUB_OP | DIV_OP | MUL_OP | MOD_OP | COMMA_OP | DOT_OP | TRINARY_OP1 | TRINARY_OP2 | DEC_NUM | ID | FLOAT_NUM | LITERAL | CHARACTER | LEFT_BRACKET | RIGHT_BRACKET | LEFT_B_BRACKET | RIGHT_B_BRACKET | LEFT_M_BRACKET | RIGHT_M_BRACKET | SEMICOLON | NEW_LINE | WS );";
		}
	}

}
