// $ANTLR 3.5.2 myChecker.g 2018-05-30 19:18:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myCheckerLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public myCheckerLexer() {} 
	public myCheckerLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public myCheckerLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "myChecker.g"; }

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:2:7: ( '(' )
			// myChecker.g:2:9: '('
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
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:3:7: ( ')' )
			// myChecker.g:3:9: ')'
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
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:4:7: ( ';' )
			// myChecker.g:4:9: ';'
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
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:5:7: ( '{' )
			// myChecker.g:5:9: '{'
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
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:6:7: ( '}' )
			// myChecker.g:6:9: '}'
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
	// $ANTLR end "T__58"

	// $ANTLR start "CONST"
	public final void mCONST() throws RecognitionException {
		try {
			int _type = CONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:256:6: ( 'const' )
			// myChecker.g:256:7: 'const'
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
	// $ANTLR end "CONST"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:257:5: ( 'char' )
			// myChecker.g:257:6: 'char'
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
	// $ANTLR end "CHAR"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:258:6: ( 'float' )
			// myChecker.g:258:7: 'float'
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
	// $ANTLR end "FLOAT"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:259:4: ( 'int' )
			// myChecker.g:259:5: 'int'
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
	// $ANTLR end "INT"

	// $ANTLR start "MAIN"
	public final void mMAIN() throws RecognitionException {
		try {
			int _type = MAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:260:5: ( 'main' )
			// myChecker.g:260:7: 'main'
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIN"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:261:5: ( 'void' )
			// myChecker.g:261:7: 'void'
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
	// $ANTLR end "VOID"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:262:3: ( 'if' )
			// myChecker.g:262:5: 'if'
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
	// $ANTLR end "IF"

	// $ANTLR start "ELSE_"
	public final void mELSE_() throws RecognitionException {
		try {
			int _type = ELSE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:263:6: ( 'else' )
			// myChecker.g:263:8: 'else'
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

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:264:4: ( 'for' )
			// myChecker.g:264:6: 'for'
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
	// $ANTLR end "FOR"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:265:6: ( 'while' )
			// myChecker.g:265:8: 'while'
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
	// $ANTLR end "WHILE"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:266:7: ( 'return' )
			// myChecker.g:266:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN"

	// $ANTLR start "EQ_OP"
	public final void mEQ_OP() throws RecognitionException {
		try {
			int _type = EQ_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:268:7: ( '==' )
			// myChecker.g:268:9: '=='
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
			// myChecker.g:269:7: ( '<=' )
			// myChecker.g:269:9: '<='
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
			// myChecker.g:270:7: ( '>=' )
			// myChecker.g:270:9: '>='
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
			// myChecker.g:271:7: ( '!=' )
			// myChecker.g:271:9: '!='
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
			// myChecker.g:272:12: ( '+=' )
			// myChecker.g:272:14: '+='
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
			// myChecker.g:273:12: ( '-=' )
			// myChecker.g:273:14: '-='
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
			// myChecker.g:274:12: ( '*=' )
			// myChecker.g:274:14: '*='
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
			// myChecker.g:275:12: ( '/=' )
			// myChecker.g:275:14: '/='
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
			// myChecker.g:276:12: ( '%=' )
			// myChecker.g:276:14: '%='
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
			// myChecker.g:277:12: ( '&=' )
			// myChecker.g:277:14: '&='
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
			// myChecker.g:278:12: ( '|=' )
			// myChecker.g:278:14: '|='
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
			// myChecker.g:279:12: ( '^=' )
			// myChecker.g:279:14: '^='
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
			// myChecker.g:280:7: ( '++' )
			// myChecker.g:280:9: '++'
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
			// myChecker.g:281:7: ( '--' )
			// myChecker.g:281:9: '--'
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
			// myChecker.g:282:8: ( '&&' )
			// myChecker.g:282:10: '&&'
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
			// myChecker.g:283:7: ( '||' )
			// myChecker.g:283:9: '||'
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
			// myChecker.g:284:11: ( '<<' )
			// myChecker.g:284:13: '<<'
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
			// myChecker.g:285:11: ( '>>' )
			// myChecker.g:285:13: '>>'
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
			// myChecker.g:286:9: ( '->' )
			// myChecker.g:286:11: '->'
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
			// myChecker.g:287:11: ( '=' )
			// myChecker.g:287:13: '='
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
			// myChecker.g:288:9: ( '<' )
			// myChecker.g:288:11: '<'
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
			// myChecker.g:289:12: ( '>' )
			// myChecker.g:289:14: '>'
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
			// myChecker.g:290:12: ( '&' )
			// myChecker.g:290:14: '&'
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
			// myChecker.g:291:12: ( '|' )
			// myChecker.g:291:14: '|'
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
			// myChecker.g:292:12: ( '^' )
			// myChecker.g:292:14: '^'
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
			// myChecker.g:293:9: ( '+' )
			// myChecker.g:293:11: '+'
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
			// myChecker.g:294:9: ( '-' )
			// myChecker.g:294:11: '-'
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
			// myChecker.g:295:9: ( '/' )
			// myChecker.g:295:11: '/'
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
			// myChecker.g:296:9: ( '*' )
			// myChecker.g:296:11: '*'
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
			// myChecker.g:297:9: ( '%' )
			// myChecker.g:297:11: '%'
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

	// $ANTLR start "DOT_OP"
	public final void mDOT_OP() throws RecognitionException {
		try {
			int _type = DOT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:299:7: ( '.' )
			// myChecker.g:299:9: '.'
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
			// myChecker.g:300:12: ( '?' )
			// myChecker.g:300:14: '?'
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
			// myChecker.g:301:12: ( ':' )
			// myChecker.g:301:14: ':'
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

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:303:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// myChecker.g:303:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// myChecker.g:303:36: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// myChecker.g:
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
					break loop1;
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
	// $ANTLR end "Identifier"

	// $ANTLR start "Character_constant"
	public final void mCharacter_constant() throws RecognitionException {
		try {
			int _type = Character_constant;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:304:19: ( '\\'' ( . )* '\\'' )
			// myChecker.g:304:21: '\\'' ( . )* '\\''
			{
			match('\''); 
			// myChecker.g:304:26: ( . )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0=='\'') ) {
					alt2=2;
				}
				else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '&')||(LA2_0 >= '(' && LA2_0 <= '\uFFFF')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// myChecker.g:304:26: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop2;
				}
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
	// $ANTLR end "Character_constant"

	// $ANTLR start "Integer_constant"
	public final void mInteger_constant() throws RecognitionException {
		try {
			int _type = Integer_constant;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:305:17: ( ( '0' .. '9' )+ )
			// myChecker.g:305:18: ( '0' .. '9' )+
			{
			// myChecker.g:305:18: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// myChecker.g:
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
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Integer_constant"

	// $ANTLR start "Floating_point_constant"
	public final void mFloating_point_constant() throws RecognitionException {
		try {
			int _type = Floating_point_constant;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:306:24: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
			// myChecker.g:306:25: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
			{
			// myChecker.g:306:25: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// myChecker.g:
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
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			match('.'); 
			// myChecker.g:306:39: ( '0' .. '9' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// myChecker.g:
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
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Floating_point_constant"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:308:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// myChecker.g:308:4: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:309:8: ( '/*' ( . )* '*/' )
			// myChecker.g:309:9: '/*' ( . )* '*/'
			{
			match("/*"); 

			// myChecker.g:309:14: ( . )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='*') ) {
					int LA6_1 = input.LA(2);
					if ( (LA6_1=='/') ) {
						alt6=2;
					}
					else if ( ((LA6_1 >= '\u0000' && LA6_1 <= '.')||(LA6_1 >= '0' && LA6_1 <= '\uFFFF')) ) {
						alt6=1;
					}

				}
				else if ( ((LA6_0 >= '\u0000' && LA6_0 <= ')')||(LA6_0 >= '+' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// myChecker.g:309:14: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop6;
				}
			}

			match("*/"); 

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// myChecker.g:1:8: ( T__54 | T__55 | T__56 | T__57 | T__58 | CONST | CHAR | FLOAT | INT | MAIN | VOID | IF | ELSE_ | FOR | WHILE | RETURN | EQ_OP | LE_OP | GE_OP | NE_OP | ADD_ASS_OP | SUB_ASS_OP | MUL_ASS_OP | DIV_ASS_OP | MOD_ASS_OP | AND_ASS_OP | OR_ASS_OP | XOR_ASS_OP | PP_OP | MM_OP | AND_OP | OR_OP | RSHIFT_OP | LSHIFT_OP | ARROW_OP | ASSIGN_OP | LESS_OP | GREATER_OP | BIT_AND_OP | BIT_OR_OP | BIT_XOR_OP | ADD_OP | SUB_OP | DIV_OP | MUL_OP | MOD_OP | DOT_OP | TRINARY_OP1 | TRINARY_OP2 | Identifier | Character_constant | Integer_constant | Floating_point_constant | WS | COMMENT )
		int alt7=55;
		alt7 = dfa7.predict(input);
		switch (alt7) {
			case 1 :
				// myChecker.g:1:10: T__54
				{
				mT__54(); 

				}
				break;
			case 2 :
				// myChecker.g:1:16: T__55
				{
				mT__55(); 

				}
				break;
			case 3 :
				// myChecker.g:1:22: T__56
				{
				mT__56(); 

				}
				break;
			case 4 :
				// myChecker.g:1:28: T__57
				{
				mT__57(); 

				}
				break;
			case 5 :
				// myChecker.g:1:34: T__58
				{
				mT__58(); 

				}
				break;
			case 6 :
				// myChecker.g:1:40: CONST
				{
				mCONST(); 

				}
				break;
			case 7 :
				// myChecker.g:1:46: CHAR
				{
				mCHAR(); 

				}
				break;
			case 8 :
				// myChecker.g:1:51: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 9 :
				// myChecker.g:1:57: INT
				{
				mINT(); 

				}
				break;
			case 10 :
				// myChecker.g:1:61: MAIN
				{
				mMAIN(); 

				}
				break;
			case 11 :
				// myChecker.g:1:66: VOID
				{
				mVOID(); 

				}
				break;
			case 12 :
				// myChecker.g:1:71: IF
				{
				mIF(); 

				}
				break;
			case 13 :
				// myChecker.g:1:74: ELSE_
				{
				mELSE_(); 

				}
				break;
			case 14 :
				// myChecker.g:1:80: FOR
				{
				mFOR(); 

				}
				break;
			case 15 :
				// myChecker.g:1:84: WHILE
				{
				mWHILE(); 

				}
				break;
			case 16 :
				// myChecker.g:1:90: RETURN
				{
				mRETURN(); 

				}
				break;
			case 17 :
				// myChecker.g:1:97: EQ_OP
				{
				mEQ_OP(); 

				}
				break;
			case 18 :
				// myChecker.g:1:103: LE_OP
				{
				mLE_OP(); 

				}
				break;
			case 19 :
				// myChecker.g:1:109: GE_OP
				{
				mGE_OP(); 

				}
				break;
			case 20 :
				// myChecker.g:1:115: NE_OP
				{
				mNE_OP(); 

				}
				break;
			case 21 :
				// myChecker.g:1:121: ADD_ASS_OP
				{
				mADD_ASS_OP(); 

				}
				break;
			case 22 :
				// myChecker.g:1:132: SUB_ASS_OP
				{
				mSUB_ASS_OP(); 

				}
				break;
			case 23 :
				// myChecker.g:1:143: MUL_ASS_OP
				{
				mMUL_ASS_OP(); 

				}
				break;
			case 24 :
				// myChecker.g:1:154: DIV_ASS_OP
				{
				mDIV_ASS_OP(); 

				}
				break;
			case 25 :
				// myChecker.g:1:165: MOD_ASS_OP
				{
				mMOD_ASS_OP(); 

				}
				break;
			case 26 :
				// myChecker.g:1:176: AND_ASS_OP
				{
				mAND_ASS_OP(); 

				}
				break;
			case 27 :
				// myChecker.g:1:187: OR_ASS_OP
				{
				mOR_ASS_OP(); 

				}
				break;
			case 28 :
				// myChecker.g:1:197: XOR_ASS_OP
				{
				mXOR_ASS_OP(); 

				}
				break;
			case 29 :
				// myChecker.g:1:208: PP_OP
				{
				mPP_OP(); 

				}
				break;
			case 30 :
				// myChecker.g:1:214: MM_OP
				{
				mMM_OP(); 

				}
				break;
			case 31 :
				// myChecker.g:1:220: AND_OP
				{
				mAND_OP(); 

				}
				break;
			case 32 :
				// myChecker.g:1:227: OR_OP
				{
				mOR_OP(); 

				}
				break;
			case 33 :
				// myChecker.g:1:233: RSHIFT_OP
				{
				mRSHIFT_OP(); 

				}
				break;
			case 34 :
				// myChecker.g:1:243: LSHIFT_OP
				{
				mLSHIFT_OP(); 

				}
				break;
			case 35 :
				// myChecker.g:1:253: ARROW_OP
				{
				mARROW_OP(); 

				}
				break;
			case 36 :
				// myChecker.g:1:262: ASSIGN_OP
				{
				mASSIGN_OP(); 

				}
				break;
			case 37 :
				// myChecker.g:1:272: LESS_OP
				{
				mLESS_OP(); 

				}
				break;
			case 38 :
				// myChecker.g:1:280: GREATER_OP
				{
				mGREATER_OP(); 

				}
				break;
			case 39 :
				// myChecker.g:1:291: BIT_AND_OP
				{
				mBIT_AND_OP(); 

				}
				break;
			case 40 :
				// myChecker.g:1:302: BIT_OR_OP
				{
				mBIT_OR_OP(); 

				}
				break;
			case 41 :
				// myChecker.g:1:312: BIT_XOR_OP
				{
				mBIT_XOR_OP(); 

				}
				break;
			case 42 :
				// myChecker.g:1:323: ADD_OP
				{
				mADD_OP(); 

				}
				break;
			case 43 :
				// myChecker.g:1:330: SUB_OP
				{
				mSUB_OP(); 

				}
				break;
			case 44 :
				// myChecker.g:1:337: DIV_OP
				{
				mDIV_OP(); 

				}
				break;
			case 45 :
				// myChecker.g:1:344: MUL_OP
				{
				mMUL_OP(); 

				}
				break;
			case 46 :
				// myChecker.g:1:351: MOD_OP
				{
				mMOD_OP(); 

				}
				break;
			case 47 :
				// myChecker.g:1:358: DOT_OP
				{
				mDOT_OP(); 

				}
				break;
			case 48 :
				// myChecker.g:1:365: TRINARY_OP1
				{
				mTRINARY_OP1(); 

				}
				break;
			case 49 :
				// myChecker.g:1:377: TRINARY_OP2
				{
				mTRINARY_OP2(); 

				}
				break;
			case 50 :
				// myChecker.g:1:389: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 51 :
				// myChecker.g:1:400: Character_constant
				{
				mCharacter_constant(); 

				}
				break;
			case 52 :
				// myChecker.g:1:419: Integer_constant
				{
				mInteger_constant(); 

				}
				break;
			case 53 :
				// myChecker.g:1:436: Floating_point_constant
				{
				mFloating_point_constant(); 

				}
				break;
			case 54 :
				// myChecker.g:1:460: WS
				{
				mWS(); 

				}
				break;
			case 55 :
				// myChecker.g:1:463: COMMENT
				{
				mCOMMENT(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	static final String DFA7_eotS =
		"\6\uffff\10\35\1\55\1\60\1\63\1\uffff\1\66\1\72\1\74\1\77\1\101\1\104"+
		"\1\107\1\111\5\uffff\1\112\1\uffff\5\35\1\121\5\35\40\uffff\3\35\1\132"+
		"\1\133\1\uffff\6\35\1\142\1\35\2\uffff\1\144\1\145\1\146\2\35\1\151\1"+
		"\uffff\1\152\3\uffff\1\153\1\35\3\uffff\1\155\1\uffff";
	static final String DFA7_eofS =
		"\156\uffff";
	static final String DFA7_minS =
		"\1\11\5\uffff\1\150\1\154\1\146\1\141\1\157\1\154\1\150\1\145\1\75\1\74"+
		"\1\75\1\uffff\1\53\1\55\1\75\1\52\1\75\1\46\2\75\5\uffff\1\56\1\uffff"+
		"\1\156\1\141\1\157\1\162\1\164\1\60\2\151\1\163\1\151\1\164\40\uffff\1"+
		"\163\1\162\1\141\2\60\1\uffff\1\156\1\144\1\145\1\154\1\165\1\164\1\60"+
		"\1\164\2\uffff\3\60\1\145\1\162\1\60\1\uffff\1\60\3\uffff\1\60\1\156\3"+
		"\uffff\1\60\1\uffff";
	static final String DFA7_maxS =
		"\1\175\5\uffff\2\157\1\156\1\141\1\157\1\154\1\150\1\145\2\75\1\76\1\uffff"+
		"\1\75\1\76\4\75\1\174\1\75\5\uffff\1\71\1\uffff\1\156\1\141\1\157\1\162"+
		"\1\164\1\172\2\151\1\163\1\151\1\164\40\uffff\1\163\1\162\1\141\2\172"+
		"\1\uffff\1\156\1\144\1\145\1\154\1\165\1\164\1\172\1\164\2\uffff\3\172"+
		"\1\145\1\162\1\172\1\uffff\1\172\3\uffff\1\172\1\156\3\uffff\1\172\1\uffff";
	static final String DFA7_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\13\uffff\1\24\10\uffff\1\57\1\60\1\61\1\62"+
		"\1\63\1\uffff\1\66\13\uffff\1\21\1\44\1\22\1\41\1\45\1\23\1\42\1\46\1"+
		"\25\1\35\1\52\1\26\1\36\1\43\1\53\1\27\1\55\1\30\1\67\1\54\1\31\1\56\1"+
		"\32\1\37\1\47\1\33\1\40\1\50\1\34\1\51\1\64\1\65\5\uffff\1\14\10\uffff"+
		"\1\16\1\11\6\uffff\1\7\1\uffff\1\12\1\13\1\15\2\uffff\1\6\1\10\1\17\1"+
		"\uffff\1\20";
	static final String DFA7_specialS =
		"\156\uffff}>";
	static final String[] DFA7_transitionS = {
			"\2\40\2\uffff\1\40\22\uffff\1\40\1\21\3\uffff\1\26\1\27\1\36\1\1\1\2"+
			"\1\24\1\22\1\uffff\1\23\1\32\1\25\12\37\1\34\1\3\1\17\1\16\1\20\1\33"+
			"\1\uffff\32\35\3\uffff\1\31\1\35\1\uffff\2\35\1\6\1\35\1\13\1\7\2\35"+
			"\1\10\3\35\1\11\4\35\1\15\3\35\1\12\1\14\3\35\1\4\1\30\1\5",
			"",
			"",
			"",
			"",
			"",
			"\1\42\6\uffff\1\41",
			"\1\43\2\uffff\1\44",
			"\1\46\7\uffff\1\45",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\57\1\56",
			"\1\61\1\62",
			"",
			"\1\65\21\uffff\1\64",
			"\1\70\17\uffff\1\67\1\71",
			"\1\73",
			"\1\76\22\uffff\1\75",
			"\1\100",
			"\1\103\26\uffff\1\102",
			"\1\105\76\uffff\1\106",
			"\1\110",
			"",
			"",
			"",
			"",
			"",
			"\1\113\1\uffff\12\37",
			"",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
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
			"",
			"",
			"\1\127",
			"\1\130",
			"\1\131",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\143",
			"",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\147",
			"\1\150",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\154",
			"",
			"",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			""
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__54 | T__55 | T__56 | T__57 | T__58 | CONST | CHAR | FLOAT | INT | MAIN | VOID | IF | ELSE_ | FOR | WHILE | RETURN | EQ_OP | LE_OP | GE_OP | NE_OP | ADD_ASS_OP | SUB_ASS_OP | MUL_ASS_OP | DIV_ASS_OP | MOD_ASS_OP | AND_ASS_OP | OR_ASS_OP | XOR_ASS_OP | PP_OP | MM_OP | AND_OP | OR_OP | RSHIFT_OP | LSHIFT_OP | ARROW_OP | ASSIGN_OP | LESS_OP | GREATER_OP | BIT_AND_OP | BIT_OR_OP | BIT_XOR_OP | ADD_OP | SUB_OP | DIV_OP | MUL_OP | MOD_OP | DOT_OP | TRINARY_OP1 | TRINARY_OP2 | Identifier | Character_constant | Integer_constant | Floating_point_constant | WS | COMMENT );";
		}
	}

}
