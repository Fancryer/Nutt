// Generated from java-escape by ANTLR 4.11.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class NuttParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, OP_And=23, OP_Or=24, 
		OP_Not=25, KW_Repeat=26, KW_Until=27, KW_As=28, KW_Define=29, TW_Actionable=30, 
		TW_Procedure=31, TW_Macro=32, KW_Return=33, OP_LambdaReturn=34, OP_FunctRef=35, 
		OP_FunctCopy=36, OP_FunctCat=37, OP_LeftFold=38, OP_RightFold=39, OP_Less=40, 
		OP_Greater=41, OP_LessEqual=42, OP_GreaterEqual=43, OP_NotSimilar=44, 
		OP_NotEqual=45, OP_Similar=46, OP_Equal=47, OP_Tilda=48, OP_BIT_LSHIFT=49, 
		OP_BIT_RSHIFT=50, OP_BIT_OR=51, OP_BIT_AND=52, OP_Length=53, OP_Power=54, 
		OP_Assign=55, OP_RightBracket=56, OP_LeftBracket=57, OP_Pass=58, KW_If=59, 
		KW_Then=60, KW_Else=61, KW_While=62, KW_Break=63, KW_Funct=64, KW_Forget=65, 
		KW_For=66, KW_Done=67, KW_Do=68, KW_In=69, KW_Every=70, KW_Reverse=71, 
		KW_Continue=72, KW_Yield=73, KW_Catch=74, KW_Try=75, KW_Demand=76, KW_Module=77, 
		KW_End=78, KW_Imports=79, KW_TypeOf=80, KW_FullTypeOf=81, KW_Nil=82, KW_True=83, 
		KW_False=84, KW_VAR=85, KW_VAL=86, KW_ALL=87, NAME=88, NORMALSTRING=89, 
		CHARSTRING=90, LONGSTRING=91, MACROSTRING=92, INT=93, HEX=94, FLOAT=95, 
		HEX_FLOAT=96, BlockComment=97, LineComment=98, WS=99, SHEBANG=100, OP_IncrAssign=101, 
		OP_DecrAssign=102, OP_MultSelfAssign=103, OP_CatSelfAssign=104, OP_AddAssign=105, 
		OP_SubAssign=106, OP_MultAssign=107, OP_ModAssign=108, OP_DivAssign=109, 
		OP_IntDivAssign=110, OP_CatAssign=111, OP_STRCAT=112, OP_Add=113, OP_Sub=114, 
		OP_Mult=115, OP_Div=116, OP_Mod=117, OP_IntDiv=118;
	public static final int
		RULE_chunk = 0, RULE_module = 1, RULE_module_start = 2, RULE_module_name = 3, 
		RULE_module_import = 4, RULE_module_list = 5, RULE_block = 6, RULE_operator_logical = 7, 
		RULE_stat = 8, RULE_array_set = 9, RULE_group_assignment = 10, RULE_functiondef_stat = 11, 
		RULE_macrodef_stat = 12, RULE_do_done_block = 13, RULE_while_do_loop = 14, 
		RULE_repeat_until_loop = 15, RULE_in_place_op_stat = 16, RULE_self_in_place_op_stat = 17, 
		RULE_if_then_else_block = 18, RULE_then_block = 19, RULE_else_block = 20, 
		RULE_forget = 21, RULE_flat_name_list = 22, RULE_for_loop = 23, RULE_reverse_for_loop = 24, 
		RULE_for_each_loop = 25, RULE_loop = 26, RULE_attnamelist = 27, RULE_attrib = 28, 
		RULE_laststat = 29, RULE_function_yield = 30, RULE_funcname = 31, RULE_varlist = 32, 
		RULE_try_catch = 33, RULE_demand = 34, RULE_var_decl = 35, RULE_constant_qualifier = 36, 
		RULE_var_header = 37, RULE_short_var_decl = 38, RULE_by_type_var_decl = 39, 
		RULE_by_value_var_decl = 40, RULE_full_var_decl = 41, RULE_type_decl = 42, 
		RULE_action_kind = 43, RULE_action_type = 44, RULE_list_initializer = 45, 
		RULE_number_type = 46, RULE_int_type = 47, RULE_float_type = 48, RULE_generic_type_list = 49, 
		RULE_list_type = 50, RULE_list_length_decl = 51, RULE_set_type = 52, RULE_map_type = 53, 
		RULE_array_type = 54, RULE_string_type = 55, RULE_either_type = 56, RULE_functional_type = 57, 
		RULE_nil_type = 58, RULE_var_decl_list = 59, RULE_explist = 60, RULE_exp = 61, 
		RULE_atom = 62, RULE_explicit_nil = 63, RULE_explicit_bool = 64, RULE_number = 65, 
		RULE_string = 66, RULE_macro = 67, RULE_functioncall = 68, RULE_var = 69, 
		RULE_func_parameters = 70, RULE_func_output = 71, RULE_either_output = 72, 
		RULE_default_output = 73, RULE_functiondef = 74, RULE_funcbody = 75, RULE_func_ref = 76, 
		RULE_func_copy = 77, RULE_func_concat = 78, RULE_func_any = 79, RULE_lambda_decl = 80, 
		RULE_operatorBitwise = 81, RULE_operatorUnary = 82, RULE_operatorComparison = 83, 
		RULE_operator_math = 84, RULE_in_place_op = 85, RULE_self_in_place_op = 86;
	private static String[] makeRuleNames() {
		return new String[] {
			"chunk", "module", "module_start", "module_name", "module_import", "module_list", 
			"block", "operator_logical", "stat", "array_set", "group_assignment", 
			"functiondef_stat", "macrodef_stat", "do_done_block", "while_do_loop", 
			"repeat_until_loop", "in_place_op_stat", "self_in_place_op_stat", "if_then_else_block", 
			"then_block", "else_block", "forget", "flat_name_list", "for_loop", "reverse_for_loop", 
			"for_each_loop", "loop", "attnamelist", "attrib", "laststat", "function_yield", 
			"funcname", "varlist", "try_catch", "demand", "var_decl", "constant_qualifier", 
			"var_header", "short_var_decl", "by_type_var_decl", "by_value_var_decl", 
			"full_var_decl", "type_decl", "action_kind", "action_type", "list_initializer", 
			"number_type", "int_type", "float_type", "generic_type_list", "list_type", 
			"list_length_decl", "set_type", "map_type", "array_type", "string_type", 
			"either_type", "functional_type", "nil_type", "var_decl_list", "explist", 
			"exp", "atom", "explicit_nil", "explicit_bool", "number", "string", "macro", 
			"functioncall", "var", "func_parameters", "func_output", "either_output", 
			"default_output", "functiondef", "funcbody", "func_ref", "func_copy", 
			"func_concat", "func_any", "lambda_decl", "operatorBitwise", "operatorUnary", 
			"operatorComparison", "operator_math", "in_place_op", "self_in_place_op"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','", "':'", "'('", "')'", "'|=>'", "'{'", "'}'", "'Numerable'", 
			"'Int'", "'Float'", "'Listable'", "'Set'", "'Map'", "'Array'", "'String'", 
			"'Either'", "'Functional'", "'Nil'", "'?'", "'@'", "'\\'", null, null, 
			null, "'repeat'", "'until'", "'as'", "'define'", "'Actionable'", "'Procedure'", 
			"'Macro'", "'return'", "'==>'", "'<=='", "'<=>'", "'<|'", "'<-'", "'->'", 
			"'<'", "'>'", "'<='", "'>='", "'!='", "'!=='", "'=='", "'==='", "'~'", 
			null, "'>>'", "'|'", "'&'", "'#'", "'^'", "'='", "']'", "'['", "'...'", 
			"'if'", "'then'", "'else'", "'while'", "'break'", "'funct'", "'forget'", 
			"'for'", "'done'", "'do'", "'in'", "'every'", "'reverse'", "'continue'", 
			"'yield'", "'catch'", "'try'", "'demand'", "'module'", "'end'", "'imports'", 
			"'typeof'", "'fulltypeof'", "'nil'", "'true'", "'false'", "'var'", "'val'", 
			"'all'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'++'", "'--'", "'**'", "'....'", "'+='", "'-='", "'*='", 
			"'%='", "'/='", "'//='", "'..='", "'..'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'//'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "OP_And", 
			"OP_Or", "OP_Not", "KW_Repeat", "KW_Until", "KW_As", "KW_Define", "TW_Actionable", 
			"TW_Procedure", "TW_Macro", "KW_Return", "OP_LambdaReturn", "OP_FunctRef", 
			"OP_FunctCopy", "OP_FunctCat", "OP_LeftFold", "OP_RightFold", "OP_Less", 
			"OP_Greater", "OP_LessEqual", "OP_GreaterEqual", "OP_NotSimilar", "OP_NotEqual", 
			"OP_Similar", "OP_Equal", "OP_Tilda", "OP_BIT_LSHIFT", "OP_BIT_RSHIFT", 
			"OP_BIT_OR", "OP_BIT_AND", "OP_Length", "OP_Power", "OP_Assign", "OP_RightBracket", 
			"OP_LeftBracket", "OP_Pass", "KW_If", "KW_Then", "KW_Else", "KW_While", 
			"KW_Break", "KW_Funct", "KW_Forget", "KW_For", "KW_Done", "KW_Do", "KW_In", 
			"KW_Every", "KW_Reverse", "KW_Continue", "KW_Yield", "KW_Catch", "KW_Try", 
			"KW_Demand", "KW_Module", "KW_End", "KW_Imports", "KW_TypeOf", "KW_FullTypeOf", 
			"KW_Nil", "KW_True", "KW_False", "KW_VAR", "KW_VAL", "KW_ALL", "NAME", 
			"NORMALSTRING", "CHARSTRING", "LONGSTRING", "MACROSTRING", "INT", "HEX", 
			"FLOAT", "HEX_FLOAT", "BlockComment", "LineComment", "WS", "SHEBANG", 
			"OP_IncrAssign", "OP_DecrAssign", "OP_MultSelfAssign", "OP_CatSelfAssign", 
			"OP_AddAssign", "OP_SubAssign", "OP_MultAssign", "OP_ModAssign", "OP_DivAssign", 
			"OP_IntDivAssign", "OP_CatAssign", "OP_STRCAT", "OP_Add", "OP_Sub", "OP_Mult", 
			"OP_Div", "OP_Mod", "OP_IntDiv"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NuttParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChunkContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(NuttParser.EOF, 0); }
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public ChunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chunk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitChunk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChunkContext chunk() throws RecognitionException {
		ChunkContext _localctx = new ChunkContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_chunk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_Module) {
				{
				setState(174);
				module();
				}
			}

			setState(177);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModuleContext extends ParserRuleContext {
		public Module_startContext module_start() {
			return getRuleContext(Module_startContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode KW_End() { return getToken(NuttParser.KW_End, 0); }
		public List<Module_importContext> module_import() {
			return getRuleContexts(Module_importContext.class);
		}
		public Module_importContext module_import(int i) {
			return getRuleContext(Module_importContext.class,i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			module_start();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_Imports) {
				{
				{
				setState(180);
				module_import();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			block();
			setState(187);
			match(KW_End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Module_startContext extends ParserRuleContext {
		public TerminalNode KW_Module() { return getToken(NuttParser.KW_Module, 0); }
		public Module_nameContext module_name() {
			return getRuleContext(Module_nameContext.class,0);
		}
		public Module_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterModule_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitModule_start(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitModule_start(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_startContext module_start() throws RecognitionException {
		Module_startContext _localctx = new Module_startContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_module_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(KW_Module);
			setState(190);
			module_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Module_nameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(NuttParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(NuttParser.NAME, i);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitModule_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitModule_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_module_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(NAME);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(193);
				match(T__0);
				setState(194);
				match(NAME);
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Module_importContext extends ParserRuleContext {
		public TerminalNode KW_Imports() { return getToken(NuttParser.KW_Imports, 0); }
		public TerminalNode KW_ALL() { return getToken(NuttParser.KW_ALL, 0); }
		public Module_nameContext module_name() {
			return getRuleContext(Module_nameContext.class,0);
		}
		public Module_listContext module_list() {
			return getRuleContext(Module_listContext.class,0);
		}
		public Module_importContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_import; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterModule_import(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitModule_import(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitModule_import(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_importContext module_import() throws RecognitionException {
		Module_importContext _localctx = new Module_importContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_module_import);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(KW_Imports);
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(201);
				match(KW_ALL);
				}
				break;
			case 2:
				{
				setState(202);
				module_name();
				}
				break;
			case 3:
				{
				setState(203);
				module_list();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Module_listContext extends ParserRuleContext {
		public List<Module_nameContext> module_name() {
			return getRuleContexts(Module_nameContext.class);
		}
		public Module_nameContext module_name(int i) {
			return getRuleContext(Module_nameContext.class,i);
		}
		public Module_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterModule_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitModule_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitModule_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_listContext module_list() throws RecognitionException {
		Module_listContext _localctx = new Module_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_module_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			module_name();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(207);
				match(T__1);
				setState(208);
				module_name();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 6343009957037735945L) != 0) {
				{
				{
				setState(214);
				stat();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Operator_logicalContext extends ParserRuleContext {
		public TerminalNode OP_And() { return getToken(NuttParser.OP_And, 0); }
		public TerminalNode OP_Or() { return getToken(NuttParser.OP_Or, 0); }
		public TerminalNode OP_Not() { return getToken(NuttParser.OP_Not, 0); }
		public Operator_logicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_logical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterOperator_logical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitOperator_logical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitOperator_logical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_logicalContext operator_logical() throws RecognitionException {
		Operator_logicalContext _localctx = new Operator_logicalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operator_logical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public DemandContext demand() {
			return getRuleContext(DemandContext.class,0);
		}
		public Group_assignmentContext group_assignment() {
			return getRuleContext(Group_assignmentContext.class,0);
		}
		public Array_setContext array_set() {
			return getRuleContext(Array_setContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public ForgetContext forget() {
			return getRuleContext(ForgetContext.class,0);
		}
		public Functiondef_statContext functiondef_stat() {
			return getRuleContext(Functiondef_statContext.class,0);
		}
		public Macrodef_statContext macrodef_stat() {
			return getRuleContext(Macrodef_statContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public TerminalNode KW_Break() { return getToken(NuttParser.KW_Break, 0); }
		public Do_done_blockContext do_done_block() {
			return getRuleContext(Do_done_blockContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public In_place_op_statContext in_place_op_stat() {
			return getRuleContext(In_place_op_statContext.class,0);
		}
		public Self_in_place_op_statContext self_in_place_op_stat() {
			return getRuleContext(Self_in_place_op_statContext.class,0);
		}
		public If_then_else_blockContext if_then_else_block() {
			return getRuleContext(If_then_else_blockContext.class,0);
		}
		public Try_catchContext try_catch() {
			return getRuleContext(Try_catchContext.class,0);
		}
		public TerminalNode OP_Pass() { return getToken(NuttParser.OP_Pass, 0); }
		public LaststatContext laststat() {
			return getRuleContext(LaststatContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stat);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				demand();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				group_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				array_set();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				var_decl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(226);
				forget();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(227);
				functiondef_stat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(228);
				macrodef_stat();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(229);
				functioncall();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(230);
				match(KW_Break);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(231);
				do_done_block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(232);
				loop();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(233);
				in_place_op_stat();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(234);
				self_in_place_op_stat();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(235);
				if_then_else_block();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(236);
				try_catch();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(237);
				match(OP_Pass);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(238);
				laststat();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_setContext extends ParserRuleContext {
		public VarContext arr;
		public ExpContext index;
		public ExpContext value;
		public TerminalNode OP_LeftBracket() { return getToken(NuttParser.OP_LeftBracket, 0); }
		public TerminalNode OP_RightBracket() { return getToken(NuttParser.OP_RightBracket, 0); }
		public TerminalNode OP_Assign() { return getToken(NuttParser.OP_Assign, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Array_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterArray_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitArray_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitArray_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_setContext array_set() throws RecognitionException {
		Array_setContext _localctx = new Array_setContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_array_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			((Array_setContext)_localctx).arr = var();
			setState(242);
			match(OP_LeftBracket);
			setState(243);
			((Array_setContext)_localctx).index = exp(0);
			setState(244);
			match(OP_RightBracket);
			setState(245);
			match(OP_Assign);
			setState(246);
			((Array_setContext)_localctx).value = exp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Group_assignmentContext extends ParserRuleContext {
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TerminalNode OP_Assign() { return getToken(NuttParser.OP_Assign, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public Group_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterGroup_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitGroup_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitGroup_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_assignmentContext group_assignment() throws RecognitionException {
		Group_assignmentContext _localctx = new Group_assignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_group_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			varlist();
			setState(249);
			match(OP_Assign);
			setState(250);
			explist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Functiondef_statContext extends ParserRuleContext {
		public TerminalNode KW_Funct() { return getToken(NuttParser.KW_Funct, 0); }
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public Func_anyContext func_any() {
			return getRuleContext(Func_anyContext.class,0);
		}
		public Functiondef_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondef_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterFunctiondef_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitFunctiondef_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFunctiondef_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Functiondef_statContext functiondef_stat() throws RecognitionException {
		Functiondef_statContext _localctx = new Functiondef_statContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functiondef_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(KW_Funct);
			setState(253);
			funcname();
			setState(254);
			func_any();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Macrodef_statContext extends ParserRuleContext {
		public TerminalNode KW_Define() { return getToken(NuttParser.KW_Define, 0); }
		public MacroContext macro() {
			return getRuleContext(MacroContext.class,0);
		}
		public TerminalNode KW_As() { return getToken(NuttParser.KW_As, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Macrodef_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macrodef_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterMacrodef_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitMacrodef_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitMacrodef_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Macrodef_statContext macrodef_stat() throws RecognitionException {
		Macrodef_statContext _localctx = new Macrodef_statContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_macrodef_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(KW_Define);
			setState(257);
			macro();
			setState(258);
			match(KW_As);
			setState(259);
			var();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Do_done_blockContext extends ParserRuleContext {
		public TerminalNode KW_Do() { return getToken(NuttParser.KW_Do, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode KW_Done() { return getToken(NuttParser.KW_Done, 0); }
		public Do_done_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_done_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterDo_done_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitDo_done_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitDo_done_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_done_blockContext do_done_block() throws RecognitionException {
		Do_done_blockContext _localctx = new Do_done_blockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_do_done_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(KW_Do);
			setState(262);
			block();
			setState(263);
			match(KW_Done);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_do_loopContext extends ParserRuleContext {
		public TerminalNode KW_While() { return getToken(NuttParser.KW_While, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public Do_done_blockContext do_done_block() {
			return getRuleContext(Do_done_blockContext.class,0);
		}
		public While_do_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_do_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterWhile_do_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitWhile_do_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitWhile_do_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_do_loopContext while_do_loop() throws RecognitionException {
		While_do_loopContext _localctx = new While_do_loopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_while_do_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(KW_While);
			setState(266);
			explist();
			setState(267);
			do_done_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Repeat_until_loopContext extends ParserRuleContext {
		public TerminalNode KW_Repeat() { return getToken(NuttParser.KW_Repeat, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode KW_Until() { return getToken(NuttParser.KW_Until, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public Repeat_until_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_until_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterRepeat_until_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitRepeat_until_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitRepeat_until_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repeat_until_loopContext repeat_until_loop() throws RecognitionException {
		Repeat_until_loopContext _localctx = new Repeat_until_loopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_repeat_until_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(KW_Repeat);
			setState(270);
			block();
			setState(271);
			match(KW_Until);
			setState(272);
			explist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class In_place_op_statContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public In_place_opContext in_place_op() {
			return getRuleContext(In_place_opContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public In_place_op_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_place_op_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterIn_place_op_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitIn_place_op_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitIn_place_op_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_place_op_statContext in_place_op_stat() throws RecognitionException {
		In_place_op_statContext _localctx = new In_place_op_statContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_in_place_op_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			var();
			setState(275);
			in_place_op();
			setState(276);
			exp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Self_in_place_op_statContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Self_in_place_opContext self_in_place_op() {
			return getRuleContext(Self_in_place_opContext.class,0);
		}
		public Self_in_place_op_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self_in_place_op_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterSelf_in_place_op_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitSelf_in_place_op_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitSelf_in_place_op_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Self_in_place_op_statContext self_in_place_op_stat() throws RecognitionException {
		Self_in_place_op_statContext _localctx = new Self_in_place_op_statContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_self_in_place_op_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			var();
			setState(279);
			self_in_place_op();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_then_else_blockContext extends ParserRuleContext {
		public TerminalNode KW_If() { return getToken(NuttParser.KW_If, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Then_blockContext then_block() {
			return getRuleContext(Then_blockContext.class,0);
		}
		public TerminalNode KW_End() { return getToken(NuttParser.KW_End, 0); }
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_then_else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_then_else_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterIf_then_else_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitIf_then_else_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitIf_then_else_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_then_else_blockContext if_then_else_block() throws RecognitionException {
		If_then_else_blockContext _localctx = new If_then_else_blockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_if_then_else_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(KW_If);
			setState(282);
			exp(0);
			setState(283);
			then_block();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_Else) {
				{
				setState(284);
				else_block();
				}
			}

			setState(287);
			match(KW_End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Then_blockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode KW_Then() { return getToken(NuttParser.KW_Then, 0); }
		public Then_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_then_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterThen_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitThen_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitThen_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Then_blockContext then_block() throws RecognitionException {
		Then_blockContext _localctx = new Then_blockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_then_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_Then) {
				{
				setState(289);
				match(KW_Then);
				}
			}

			setState(292);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode KW_Else() { return getToken(NuttParser.KW_Else, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterElse_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitElse_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitElse_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(KW_Else);
			setState(295);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForgetContext extends ParserRuleContext {
		public TerminalNode KW_Forget() { return getToken(NuttParser.KW_Forget, 0); }
		public TerminalNode KW_ALL() { return getToken(NuttParser.KW_ALL, 0); }
		public Flat_name_listContext flat_name_list() {
			return getRuleContext(Flat_name_listContext.class,0);
		}
		public ForgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterForget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitForget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitForget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForgetContext forget() throws RecognitionException {
		ForgetContext _localctx = new ForgetContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_forget);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(KW_Forget);
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ALL:
				{
				setState(298);
				match(KW_ALL);
				}
				break;
			case NAME:
				{
				setState(299);
				flat_name_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Flat_name_listContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(NuttParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(NuttParser.NAME, i);
		}
		public Flat_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flat_name_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterFlat_name_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitFlat_name_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFlat_name_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flat_name_listContext flat_name_list() throws RecognitionException {
		Flat_name_listContext _localctx = new Flat_name_listContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_flat_name_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(NAME);
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(303);
					match(T__1);
					setState(304);
					match(NAME);
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_loopContext extends ParserRuleContext {
		public ExpContext counterBound;
		public ExpContext step;
		public TerminalNode KW_For() { return getToken(NuttParser.KW_For, 0); }
		public Var_headerContext var_header() {
			return getRuleContext(Var_headerContext.class,0);
		}
		public By_value_var_declContext by_value_var_decl() {
			return getRuleContext(By_value_var_declContext.class,0);
		}
		public Do_done_blockContext do_done_block() {
			return getRuleContext(Do_done_blockContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(KW_For);
			setState(311);
			var_header();
			setState(312);
			by_value_var_decl();
			setState(313);
			match(T__1);
			setState(314);
			((For_loopContext)_localctx).counterBound = exp(0);
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(315);
				match(T__1);
				setState(316);
				((For_loopContext)_localctx).step = exp(0);
				}
			}

			setState(319);
			do_done_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Reverse_for_loopContext extends ParserRuleContext {
		public TerminalNode KW_Reverse() { return getToken(NuttParser.KW_Reverse, 0); }
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public Reverse_for_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reverse_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterReverse_for_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitReverse_for_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitReverse_for_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reverse_for_loopContext reverse_for_loop() throws RecognitionException {
		Reverse_for_loopContext _localctx = new Reverse_for_loopContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_reverse_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(KW_Reverse);
			setState(322);
			for_loop();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_each_loopContext extends ParserRuleContext {
		public TerminalNode KW_For() { return getToken(NuttParser.KW_For, 0); }
		public TerminalNode KW_Every() { return getToken(NuttParser.KW_Every, 0); }
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public TerminalNode KW_In() { return getToken(NuttParser.KW_In, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public Do_done_blockContext do_done_block() {
			return getRuleContext(Do_done_blockContext.class,0);
		}
		public For_each_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_each_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterFor_each_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitFor_each_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFor_each_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_each_loopContext for_each_loop() throws RecognitionException {
		For_each_loopContext _localctx = new For_each_loopContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_for_each_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(KW_For);
			setState(325);
			match(KW_Every);
			setState(326);
			var_decl();
			setState(327);
			match(KW_In);
			setState(328);
			explist();
			setState(329);
			do_done_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ParserRuleContext {
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public Reverse_for_loopContext reverse_for_loop() {
			return getRuleContext(Reverse_for_loopContext.class,0);
		}
		public For_each_loopContext for_each_loop() {
			return getRuleContext(For_each_loopContext.class,0);
		}
		public While_do_loopContext while_do_loop() {
			return getRuleContext(While_do_loopContext.class,0);
		}
		public Repeat_until_loopContext repeat_until_loop() {
			return getRuleContext(Repeat_until_loopContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_loop);
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				for_loop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				reverse_for_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				for_each_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
				while_do_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(335);
				repeat_until_loop();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttnamelistContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(NuttParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(NuttParser.NAME, i);
		}
		public List<AttribContext> attrib() {
			return getRuleContexts(AttribContext.class);
		}
		public AttribContext attrib(int i) {
			return getRuleContext(AttribContext.class,i);
		}
		public AttnamelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attnamelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterAttnamelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitAttnamelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitAttnamelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttnamelistContext attnamelist() throws RecognitionException {
		AttnamelistContext _localctx = new AttnamelistContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_attnamelist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(NAME);
			setState(339);
			attrib();
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(340);
				match(T__1);
				setState(341);
				match(NAME);
				setState(342);
				attrib();
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttribContext extends ParserRuleContext {
		public TerminalNode OP_Less() { return getToken(NuttParser.OP_Less, 0); }
		public TerminalNode NAME() { return getToken(NuttParser.NAME, 0); }
		public TerminalNode OP_Greater() { return getToken(NuttParser.OP_Greater, 0); }
		public AttribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterAttrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitAttrib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitAttrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttribContext attrib() throws RecognitionException {
		AttribContext _localctx = new AttribContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_attrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Less) {
				{
				setState(348);
				match(OP_Less);
				setState(349);
				match(NAME);
				setState(350);
				match(OP_Greater);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LaststatContext extends ParserRuleContext {
		public Function_yieldContext function_yield() {
			return getRuleContext(Function_yieldContext.class,0);
		}
		public TerminalNode KW_Break() { return getToken(NuttParser.KW_Break, 0); }
		public TerminalNode KW_Continue() { return getToken(NuttParser.KW_Continue, 0); }
		public LaststatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_laststat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterLaststat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitLaststat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitLaststat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LaststatContext laststat() throws RecognitionException {
		LaststatContext _localctx = new LaststatContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_laststat);
		try {
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_Yield:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				function_yield();
				}
				break;
			case KW_Break:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				match(KW_Break);
				}
				break;
			case KW_Continue:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				match(KW_Continue);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_yieldContext extends ParserRuleContext {
		public TerminalNode KW_Yield() { return getToken(NuttParser.KW_Yield, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Function_yieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_yield; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterFunction_yield(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitFunction_yield(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFunction_yield(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_yieldContext function_yield() throws RecognitionException {
		Function_yieldContext _localctx = new Function_yieldContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_function_yield);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(KW_Yield);
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(359);
				exp(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncnameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(NuttParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(NuttParser.NAME, i);
		}
		public FuncnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterFuncname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitFuncname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFuncname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncnameContext funcname() throws RecognitionException {
		FuncnameContext _localctx = new FuncnameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_funcname);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(NAME);
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(363);
					match(T__0);
					setState(364);
					match(NAME);
					}
					} 
				}
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarlistContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitVarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_varlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			var();
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(371);
				match(T__1);
				setState(372);
				var();
				}
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Try_catchContext extends ParserRuleContext {
		public BlockContext try_branch;
		public BlockContext catch_branch;
		public TerminalNode KW_Try() { return getToken(NuttParser.KW_Try, 0); }
		public TerminalNode KW_Catch() { return getToken(NuttParser.KW_Catch, 0); }
		public TerminalNode KW_End() { return getToken(NuttParser.KW_End, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public Try_catchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_catch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterTry_catch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitTry_catch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitTry_catch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_catchContext try_catch() throws RecognitionException {
		Try_catchContext _localctx = new Try_catchContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_try_catch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(KW_Try);
			setState(379);
			((Try_catchContext)_localctx).try_branch = block();
			setState(380);
			match(KW_Catch);
			setState(381);
			((Try_catchContext)_localctx).catch_branch = block();
			setState(382);
			match(KW_End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DemandContext extends ParserRuleContext {
		public TerminalNode KW_Demand() { return getToken(NuttParser.KW_Demand, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DemandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_demand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterDemand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitDemand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitDemand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DemandContext demand() throws RecognitionException {
		DemandContext _localctx = new DemandContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_demand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(KW_Demand);
			setState(385);
			exp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_declContext extends ParserRuleContext {
		public Var_headerContext var_header() {
			return getRuleContext(Var_headerContext.class,0);
		}
		public Short_var_declContext short_var_decl() {
			return getRuleContext(Short_var_declContext.class,0);
		}
		public By_type_var_declContext by_type_var_decl() {
			return getRuleContext(By_type_var_declContext.class,0);
		}
		public By_value_var_declContext by_value_var_decl() {
			return getRuleContext(By_value_var_declContext.class,0);
		}
		public Full_var_declContext full_var_decl() {
			return getRuleContext(Full_var_declContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			var_header();
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(388);
				short_var_decl();
				}
				break;
			case 2:
				{
				setState(389);
				by_type_var_decl();
				}
				break;
			case 3:
				{
				setState(390);
				by_value_var_decl();
				}
				break;
			case 4:
				{
				setState(391);
				full_var_decl();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Constant_qualifierContext extends ParserRuleContext {
		public TerminalNode KW_VAR() { return getToken(NuttParser.KW_VAR, 0); }
		public TerminalNode KW_VAL() { return getToken(NuttParser.KW_VAL, 0); }
		public Constant_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterConstant_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitConstant_qualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitConstant_qualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_qualifierContext constant_qualifier() throws RecognitionException {
		Constant_qualifierContext _localctx = new Constant_qualifierContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_constant_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_la = _input.LA(1);
			if ( !(_la==KW_VAR || _la==KW_VAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_headerContext extends ParserRuleContext {
		public Constant_qualifierContext constant_qualifier() {
			return getRuleContext(Constant_qualifierContext.class,0);
		}
		public TerminalNode NAME() { return getToken(NuttParser.NAME, 0); }
		public Var_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterVar_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitVar_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitVar_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_headerContext var_header() throws RecognitionException {
		Var_headerContext _localctx = new Var_headerContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_var_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			constant_qualifier();
			setState(397);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Short_var_declContext extends ParserRuleContext {
		public TerminalNode OP_Assign() { return getToken(NuttParser.OP_Assign, 0); }
		public Nil_typeContext nil_type() {
			return getRuleContext(Nil_typeContext.class,0);
		}
		public Short_var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_short_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterShort_var_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitShort_var_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitShort_var_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Short_var_declContext short_var_decl() throws RecognitionException {
		Short_var_declContext _localctx = new Short_var_declContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_short_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(399);
				match(OP_Assign);
				setState(400);
				nil_type();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class By_type_var_declContext extends ParserRuleContext {
		public Type_declContext type;
		public Type_declContext type_decl() {
			return getRuleContext(Type_declContext.class,0);
		}
		public By_type_var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_by_type_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterBy_type_var_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitBy_type_var_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitBy_type_var_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final By_type_var_declContext by_type_var_decl() throws RecognitionException {
		By_type_var_declContext _localctx = new By_type_var_declContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_by_type_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(T__2);
			setState(404);
			((By_type_var_declContext)_localctx).type = type_decl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class By_value_var_declContext extends ParserRuleContext {
		public ExpContext assign_right;
		public TerminalNode OP_Assign() { return getToken(NuttParser.OP_Assign, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public By_value_var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_by_value_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterBy_value_var_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitBy_value_var_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitBy_value_var_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final By_value_var_declContext by_value_var_decl() throws RecognitionException {
		By_value_var_declContext _localctx = new By_value_var_declContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_by_value_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(OP_Assign);
			setState(407);
			((By_value_var_declContext)_localctx).assign_right = exp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Full_var_declContext extends ParserRuleContext {
		public Type_declContext type;
		public ExpContext assign_right;
		public TerminalNode OP_Assign() { return getToken(NuttParser.OP_Assign, 0); }
		public Type_declContext type_decl() {
			return getRuleContext(Type_declContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Full_var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_full_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterFull_var_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitFull_var_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFull_var_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Full_var_declContext full_var_decl() throws RecognitionException {
		Full_var_declContext _localctx = new Full_var_declContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_full_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(T__2);
			setState(410);
			((Full_var_declContext)_localctx).type = type_decl();
			setState(411);
			match(OP_Assign);
			setState(412);
			((Full_var_declContext)_localctx).assign_right = exp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_declContext extends ParserRuleContext {
		public Either_typeContext either_type() {
			return getRuleContext(Either_typeContext.class,0);
		}
		public Functional_typeContext functional_type() {
			return getRuleContext(Functional_typeContext.class,0);
		}
		public Action_typeContext action_type() {
			return getRuleContext(Action_typeContext.class,0);
		}
		public Number_typeContext number_type() {
			return getRuleContext(Number_typeContext.class,0);
		}
		public List_typeContext list_type() {
			return getRuleContext(List_typeContext.class,0);
		}
		public Nil_typeContext nil_type() {
			return getRuleContext(Nil_typeContext.class,0);
		}
		public Type_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterType_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitType_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitType_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_declContext type_decl() throws RecognitionException {
		Type_declContext _localctx = new Type_declContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_type_decl);
		try {
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				either_type();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				functional_type();
				}
				break;
			case T__3:
			case TW_Actionable:
			case TW_Procedure:
			case TW_Macro:
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TW_Actionable:
				case TW_Procedure:
				case TW_Macro:
					{
					setState(416);
					action_type();
					}
					break;
				case T__3:
					{
					setState(417);
					match(T__3);
					setState(418);
					action_type();
					setState(419);
					match(T__4);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(423);
				number_type();
				}
				break;
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(424);
				list_type();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 6);
				{
				setState(425);
				nil_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Action_kindContext extends ParserRuleContext {
		public TerminalNode TW_Actionable() { return getToken(NuttParser.TW_Actionable, 0); }
		public TerminalNode TW_Procedure() { return getToken(NuttParser.TW_Procedure, 0); }
		public TerminalNode TW_Macro() { return getToken(NuttParser.TW_Macro, 0); }
		public Action_kindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action_kind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterAction_kind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitAction_kind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitAction_kind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Action_kindContext action_kind() throws RecognitionException {
		Action_kindContext _localctx = new Action_kindContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_action_kind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 7516192768L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Action_typeContext extends ParserRuleContext {
		public Action_kindContext action_kind() {
			return getRuleContext(Action_kindContext.class,0);
		}
		public Func_parametersContext func_parameters() {
			return getRuleContext(Func_parametersContext.class,0);
		}
		public Type_declContext type_decl() {
			return getRuleContext(Type_declContext.class,0);
		}
		public Action_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterAction_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitAction_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitAction_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Action_typeContext action_type() throws RecognitionException {
		Action_typeContext _localctx = new Action_typeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_action_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			action_kind();
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(431);
				func_parameters();
				}
				break;
			}
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(434);
				match(T__5);
				setState(435);
				type_decl();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class List_initializerContext extends ParserRuleContext {
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public List_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterList_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitList_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitList_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_initializerContext list_initializer() throws RecognitionException {
		List_initializerContext _localctx = new List_initializerContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_list_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(T__6);
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 9288674269200528L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1688858435452929L) != 0) {
				{
				setState(439);
				explist();
				}
			}

			setState(442);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Number_typeContext extends ParserRuleContext {
		public Int_typeContext int_type() {
			return getRuleContext(Int_typeContext.class,0);
		}
		public Float_typeContext float_type() {
			return getRuleContext(Float_typeContext.class,0);
		}
		public Number_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterNumber_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitNumber_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitNumber_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_typeContext number_type() throws RecognitionException {
		Number_typeContext _localctx = new Number_typeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_number_type);
		try {
			setState(447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				int_type();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(446);
				float_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Int_typeContext extends ParserRuleContext {
		public Int_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterInt_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitInt_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitInt_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_typeContext int_type() throws RecognitionException {
		Int_typeContext _localctx = new Int_typeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_int_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Float_typeContext extends ParserRuleContext {
		public Float_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterFloat_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitFloat_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFloat_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_typeContext float_type() throws RecognitionException {
		Float_typeContext _localctx = new Float_typeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_float_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Generic_type_listContext extends ParserRuleContext {
		public Generic_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_type_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterGeneric_type_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitGeneric_type_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitGeneric_type_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_type_listContext generic_type_list() throws RecognitionException {
		Generic_type_listContext _localctx = new Generic_type_listContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_generic_type_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class List_typeContext extends ParserRuleContext {
		public Generic_type_listContext generic_type_list() {
			return getRuleContext(Generic_type_listContext.class,0);
		}
		public Set_typeContext set_type() {
			return getRuleContext(Set_typeContext.class,0);
		}
		public Map_typeContext map_type() {
			return getRuleContext(Map_typeContext.class,0);
		}
		public String_typeContext string_type() {
			return getRuleContext(String_typeContext.class,0);
		}
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public TerminalNode OP_BIT_OR() { return getToken(NuttParser.OP_BIT_OR, 0); }
		public Type_declContext type_decl() {
			return getRuleContext(Type_declContext.class,0);
		}
		public List_length_declContext list_length_decl() {
			return getRuleContext(List_length_declContext.class,0);
		}
		public List_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterList_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitList_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitList_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_typeContext list_type() throws RecognitionException {
		List_typeContext _localctx = new List_typeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_list_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(455);
				generic_type_list();
				}
				break;
			case T__12:
				{
				setState(456);
				set_type();
				}
				break;
			case T__13:
				{
				setState(457);
				map_type();
				}
				break;
			case T__15:
				{
				setState(458);
				string_type();
				}
				break;
			case T__14:
				{
				setState(459);
				array_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_Length) {
					{
					setState(462);
					list_length_decl();
					}
				}

				setState(465);
				match(OP_BIT_OR);
				setState(466);
				type_decl();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class List_length_declContext extends ParserRuleContext {
		public TerminalNode OP_Length() { return getToken(NuttParser.OP_Length, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List_length_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_length_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterList_length_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitList_length_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitList_length_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_length_declContext list_length_decl() throws RecognitionException {
		List_length_declContext _localctx = new List_length_declContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_list_length_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(OP_Length);
			setState(470);
			exp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Set_typeContext extends ParserRuleContext {
		public Set_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterSet_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitSet_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitSet_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_typeContext set_type() throws RecognitionException {
		Set_typeContext _localctx = new Set_typeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_set_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Map_typeContext extends ParserRuleContext {
		public Map_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterMap_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitMap_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitMap_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Map_typeContext map_type() throws RecognitionException {
		Map_typeContext _localctx = new Map_typeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_map_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_typeContext extends ParserRuleContext {
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterArray_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitArray_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitArray_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class String_typeContext extends ParserRuleContext {
		public String_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterString_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitString_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitString_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_typeContext string_type() throws RecognitionException {
		String_typeContext _localctx = new String_typeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_string_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Either_typeContext extends ParserRuleContext {
		public Either_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_either_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterEither_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitEither_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitEither_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Either_typeContext either_type() throws RecognitionException {
		Either_typeContext _localctx = new Either_typeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_either_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Functional_typeContext extends ParserRuleContext {
		public Functional_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functional_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterFunctional_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitFunctional_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFunctional_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Functional_typeContext functional_type() throws RecognitionException {
		Functional_typeContext _localctx = new Functional_typeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_functional_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nil_typeContext extends ParserRuleContext {
		public Nil_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nil_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterNil_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitNil_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitNil_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nil_typeContext nil_type() throws RecognitionException {
		Nil_typeContext _localctx = new Nil_typeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_nil_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_decl_listContext extends ParserRuleContext {
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public Var_decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterVar_decl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitVar_decl_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitVar_decl_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_decl_listContext var_decl_list() throws RecognitionException {
		Var_decl_listContext _localctx = new Var_decl_listContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_var_decl_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			var_decl();
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(487);
				match(T__1);
				setState(488);
				var_decl();
				}
				}
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExplistContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterExplist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitExplist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitExplist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_explist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			exp(0);
			setState(499);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(495);
					match(T__1);
					setState(496);
					exp(0);
					}
					} 
				}
				setState(501);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Power_expressionContext extends ExpContext {
		public ExpContext left;
		public ExpContext right;
		public TerminalNode OP_Power() { return getToken(NuttParser.OP_Power, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Power_expressionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterPower_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitPower_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitPower_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Explicit_arrayContext extends ExpContext {
		public List_initializerContext list_initializer() {
			return getRuleContext(List_initializerContext.class,0);
		}
		public Explicit_arrayContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterExplicit_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitExplicit_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitExplicit_array(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Logical_expContext extends ExpContext {
		public ExpContext left;
		public ExpContext right;
		public Operator_logicalContext operator_logical() {
			return getRuleContext(Operator_logicalContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Logical_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterLogical_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitLogical_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitLogical_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Explicit_variableContext extends ExpContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Explicit_variableContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterExplicit_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitExplicit_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitExplicit_variable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Array_accessContext extends ExpContext {
		public ExpContext arr;
		public ExpContext index;
		public TerminalNode OP_LeftBracket() { return getToken(NuttParser.OP_LeftBracket, 0); }
		public TerminalNode OP_RightBracket() { return getToken(NuttParser.OP_RightBracket, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Array_accessContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterArray_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitArray_access(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitArray_access(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Full_type_of_expContext extends ExpContext {
		public TerminalNode KW_FullTypeOf() { return getToken(NuttParser.KW_FullTypeOf, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Full_type_of_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterFull_type_of_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitFull_type_of_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFull_type_of_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Func_call_expContext extends ExpContext {
		public ExplistContext arguments;
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public Func_call_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterFunc_call_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitFunc_call_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFunc_call_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Type_castContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode KW_As() { return getToken(NuttParser.KW_As, 0); }
		public Type_declContext type_decl() {
			return getRuleContext(Type_declContext.class,0);
		}
		public Type_castContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterType_cast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitType_cast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitType_cast(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Str_cat_expressionContext extends ExpContext {
		public ExpContext left;
		public Token op;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode OP_STRCAT() { return getToken(NuttParser.OP_STRCAT, 0); }
		public Str_cat_expressionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterStr_cat_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitStr_cat_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitStr_cat_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Explicit_macroContext extends ExpContext {
		public MacroContext macro() {
			return getRuleContext(MacroContext.class,0);
		}
		public Explicit_macroContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterExplicit_macro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitExplicit_macro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitExplicit_macro(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Comparison_expressionContext extends ExpContext {
		public ExpContext left;
		public ExpContext right;
		public OperatorComparisonContext operatorComparison() {
			return getRuleContext(OperatorComparisonContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Comparison_expressionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterComparison_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitComparison_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitComparison_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Quarternary_expContext extends ExpContext {
		public ExpContext if_true;
		public ExpContext if_false;
		public ExpContext if_undefined;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Quarternary_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterQuarternary_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitQuarternary_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitQuarternary_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Unary_expressionContext extends ExpContext {
		public OperatorUnaryContext operatorUnary() {
			return getRuleContext(OperatorUnaryContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Unary_expressionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitUnary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Bitwise_expContext extends ExpContext {
		public ExpContext left;
		public ExpContext right;
		public OperatorBitwiseContext operatorBitwise() {
			return getRuleContext(OperatorBitwiseContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Bitwise_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterBitwise_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitBitwise_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitBitwise_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Fold_left_expressionContext extends ExpContext {
		public ExpContext left;
		public ExpContext right;
		public TerminalNode OP_LeftFold() { return getToken(NuttParser.OP_LeftFold, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Fold_left_expressionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterFold_left_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitFold_left_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFold_left_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Math_expContext extends ExpContext {
		public ExpContext left;
		public ExpContext right;
		public Operator_mathContext operator_math() {
			return getRuleContext(Operator_mathContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Math_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterMath_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitMath_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitMath_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Explicit_atomContext extends ExpContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public Explicit_atomContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterExplicit_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitExplicit_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitExplicit_atom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Parenthesis_expContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Parenthesis_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterParenthesis_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitParenthesis_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitParenthesis_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Function_definition_expContext extends ExpContext {
		public FunctiondefContext functiondef() {
			return getRuleContext(FunctiondefContext.class,0);
		}
		public Function_definition_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterFunction_definition_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitFunction_definition_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFunction_definition_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Type_of_expContext extends ExpContext {
		public TerminalNode KW_TypeOf() { return getToken(NuttParser.KW_TypeOf, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Type_of_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterType_of_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitType_of_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitType_of_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Func_cat_expContext extends ExpContext {
		public List<FuncnameContext> funcname() {
			return getRuleContexts(FuncnameContext.class);
		}
		public FuncnameContext funcname(int i) {
			return getRuleContext(FuncnameContext.class,i);
		}
		public TerminalNode OP_FunctCat() { return getToken(NuttParser.OP_FunctCat, 0); }
		public Func_cat_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterFunc_cat_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitFunc_cat_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFunc_cat_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Fold_right_expressionContext extends ExpContext {
		public ExpContext left;
		public ExpContext right;
		public TerminalNode OP_RightFold() { return getToken(NuttParser.OP_RightFold, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Fold_right_expressionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterFold_right_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitFold_right_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFold_right_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				_localctx = new Explicit_variableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(503);
				var();
				}
				break;
			case 2:
				{
				_localctx = new Explicit_atomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(504);
				atom();
				}
				break;
			case 3:
				{
				_localctx = new Explicit_macroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(505);
				macro();
				}
				break;
			case 4:
				{
				_localctx = new Explicit_arrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(506);
				list_initializer();
				}
				break;
			case 5:
				{
				_localctx = new Function_definition_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(507);
				functiondef();
				}
				break;
			case 6:
				{
				_localctx = new Func_call_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(508);
				funcname();
				setState(509);
				match(T__3);
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 9288674269200528L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1688858435452929L) != 0) {
					{
					setState(510);
					((Func_call_expContext)_localctx).arguments = explist();
					}
				}

				setState(513);
				match(T__4);
				}
				break;
			case 7:
				{
				_localctx = new Unary_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(515);
				operatorUnary();
				setState(516);
				exp(13);
				}
				break;
			case 8:
				{
				_localctx = new Parenthesis_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(518);
				match(T__3);
				setState(519);
				exp(0);
				setState(520);
				match(T__4);
				}
				break;
			case 9:
				{
				_localctx = new Type_of_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(522);
				match(KW_TypeOf);
				setState(523);
				exp(5);
				}
				break;
			case 10:
				{
				_localctx = new Full_type_of_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(524);
				match(KW_FullTypeOf);
				setState(525);
				exp(4);
				}
				break;
			case 11:
				{
				_localctx = new Func_cat_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(526);
				funcname();
				setState(527);
				match(OP_FunctCat);
				setState(528);
				funcname();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(581);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(579);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new Bitwise_expContext(new ExpContext(_parentctx, _parentState));
						((Bitwise_expContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(532);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(533);
						operatorBitwise();
						setState(534);
						((Bitwise_expContext)_localctx).right = exp(17);
						}
						break;
					case 2:
						{
						_localctx = new Math_expContext(new ExpContext(_parentctx, _parentState));
						((Math_expContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(536);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(537);
						operator_math();
						setState(538);
						((Math_expContext)_localctx).right = exp(16);
						}
						break;
					case 3:
						{
						_localctx = new Logical_expContext(new ExpContext(_parentctx, _parentState));
						((Logical_expContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(540);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(541);
						operator_logical();
						setState(542);
						((Logical_expContext)_localctx).right = exp(15);
						}
						break;
					case 4:
						{
						_localctx = new Str_cat_expressionContext(new ExpContext(_parentctx, _parentState));
						((Str_cat_expressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(544);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(545);
						((Str_cat_expressionContext)_localctx).op = match(OP_STRCAT);
						setState(546);
						((Str_cat_expressionContext)_localctx).right = exp(11);
						}
						break;
					case 5:
						{
						_localctx = new Fold_left_expressionContext(new ExpContext(_parentctx, _parentState));
						((Fold_left_expressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(547);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(548);
						match(OP_LeftFold);
						setState(549);
						((Fold_left_expressionContext)_localctx).right = exp(11);
						}
						break;
					case 6:
						{
						_localctx = new Fold_right_expressionContext(new ExpContext(_parentctx, _parentState));
						((Fold_right_expressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(550);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(551);
						match(OP_RightFold);
						setState(552);
						((Fold_right_expressionContext)_localctx).right = exp(10);
						}
						break;
					case 7:
						{
						_localctx = new Comparison_expressionContext(new ExpContext(_parentctx, _parentState));
						((Comparison_expressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(553);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(554);
						operatorComparison();
						setState(555);
						((Comparison_expressionContext)_localctx).right = exp(9);
						}
						break;
					case 8:
						{
						_localctx = new Power_expressionContext(new ExpContext(_parentctx, _parentState));
						((Power_expressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(557);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(558);
						match(OP_Power);
						setState(559);
						((Power_expressionContext)_localctx).right = exp(7);
						}
						break;
					case 9:
						{
						_localctx = new Array_accessContext(new ExpContext(_parentctx, _parentState));
						((Array_accessContext)_localctx).arr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(560);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(561);
						match(OP_LeftBracket);
						setState(562);
						((Array_accessContext)_localctx).index = exp(0);
						setState(563);
						match(OP_RightBracket);
						}
						break;
					case 10:
						{
						_localctx = new Type_castContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(565);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(566);
						match(KW_As);
						setState(567);
						type_decl();
						}
						break;
					case 11:
						{
						_localctx = new Quarternary_expContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(568);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(569);
						match(T__19);
						setState(570);
						((Quarternary_expContext)_localctx).if_true = exp(0);
						setState(573);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
						case 1:
							{
							setState(571);
							match(T__20);
							setState(572);
							((Quarternary_expContext)_localctx).if_false = exp(0);
							}
							break;
						}
						setState(577);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
						case 1:
							{
							setState(575);
							match(T__20);
							setState(576);
							((Quarternary_expContext)_localctx).if_undefined = exp(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(583);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public Explicit_nilContext explicit_nil() {
			return getRuleContext(Explicit_nilContext.class,0);
		}
		public Explicit_boolContext explicit_bool() {
			return getRuleContext(Explicit_boolContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_atom);
		try {
			setState(588);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_Nil:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				explicit_nil();
				}
				break;
			case KW_True:
			case KW_False:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				explicit_bool();
				}
				break;
			case INT:
			case HEX:
			case FLOAT:
			case HEX_FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(586);
				number();
				}
				break;
			case NORMALSTRING:
			case CHARSTRING:
			case LONGSTRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(587);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Explicit_nilContext extends ParserRuleContext {
		public TerminalNode KW_Nil() { return getToken(NuttParser.KW_Nil, 0); }
		public Explicit_nilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_nil; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterExplicit_nil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitExplicit_nil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitExplicit_nil(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Explicit_nilContext explicit_nil() throws RecognitionException {
		Explicit_nilContext _localctx = new Explicit_nilContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_explicit_nil);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(KW_Nil);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Explicit_boolContext extends ParserRuleContext {
		public TerminalNode KW_True() { return getToken(NuttParser.KW_True, 0); }
		public TerminalNode KW_False() { return getToken(NuttParser.KW_False, 0); }
		public Explicit_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterExplicit_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitExplicit_bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitExplicit_bool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Explicit_boolContext explicit_bool() throws RecognitionException {
		Explicit_boolContext _localctx = new Explicit_boolContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_explicit_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			_la = _input.LA(1);
			if ( !(_la==KW_True || _la==KW_False) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(NuttParser.INT, 0); }
		public TerminalNode HEX() { return getToken(NuttParser.HEX, 0); }
		public TerminalNode FLOAT() { return getToken(NuttParser.FLOAT, 0); }
		public TerminalNode HEX_FLOAT() { return getToken(NuttParser.HEX_FLOAT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			_la = _input.LA(1);
			if ( !((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 15L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public TerminalNode NORMALSTRING() { return getToken(NuttParser.NORMALSTRING, 0); }
		public TerminalNode CHARSTRING() { return getToken(NuttParser.CHARSTRING, 0); }
		public TerminalNode LONGSTRING() { return getToken(NuttParser.LONGSTRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			_la = _input.LA(1);
			if ( !((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 7L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MacroContext extends ParserRuleContext {
		public TerminalNode MACROSTRING() { return getToken(NuttParser.MACROSTRING, 0); }
		public MacroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterMacro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitMacro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitMacro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroContext macro() throws RecognitionException {
		MacroContext _localctx = new MacroContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_macro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(MACROSTRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctioncallContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(NuttParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(NuttParser.NAME, i);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitFunctioncall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_functioncall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(600);
				match(NAME);
				setState(601);
				match(T__0);
				}
				break;
			}
			setState(604);
			match(NAME);
			setState(605);
			match(T__3);
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 9288674269200528L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1688858435452929L) != 0) {
				{
				setState(606);
				explist();
				}
			}

			setState(609);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(NuttParser.NAME, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_parametersContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Var_decl_listContext var_decl_list() {
			return getRuleContext(Var_decl_listContext.class,0);
		}
		public Func_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterFunc_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitFunc_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFunc_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_parametersContext func_parameters() throws RecognitionException {
		Func_parametersContext _localctx = new Func_parametersContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_func_parameters);
		int _la;
		try {
			setState(619);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_VAR:
			case KW_VAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(613);
				var_decl();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(614);
				match(T__3);
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_VAR || _la==KW_VAL) {
					{
					setState(615);
					var_decl_list();
					}
				}

				setState(618);
				match(T__4);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_outputContext extends ParserRuleContext {
		public TerminalNode OP_Assign() { return getToken(NuttParser.OP_Assign, 0); }
		public Either_outputContext either_output() {
			return getRuleContext(Either_outputContext.class,0);
		}
		public Default_outputContext default_output() {
			return getRuleContext(Default_outputContext.class,0);
		}
		public Func_outputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterFunc_output(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitFunc_output(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFunc_output(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_outputContext func_output() throws RecognitionException {
		Func_outputContext _localctx = new Func_outputContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_func_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(621);
				either_output();
				}
				break;
			case 2:
				{
				setState(622);
				default_output();
				}
				break;
			}
			setState(625);
			match(OP_Assign);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Either_outputContext extends ParserRuleContext {
		public Either_typeContext either_type() {
			return getRuleContext(Either_typeContext.class,0);
		}
		public Either_outputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_either_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterEither_output(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitEither_output(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitEither_output(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Either_outputContext either_output() throws RecognitionException {
		Either_outputContext _localctx = new Either_outputContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_either_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(627);
				match(T__2);
				setState(628);
				either_type();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Default_outputContext extends ParserRuleContext {
		public Type_declContext type_decl() {
			return getRuleContext(Type_declContext.class,0);
		}
		public Default_outputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterDefault_output(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitDefault_output(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitDefault_output(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_outputContext default_output() throws RecognitionException {
		Default_outputContext _localctx = new Default_outputContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_default_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(T__2);
			{
			setState(632);
			type_decl();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctiondefContext extends ParserRuleContext {
		public Lambda_declContext lambda_decl() {
			return getRuleContext(Lambda_declContext.class,0);
		}
		public TerminalNode KW_Funct() { return getToken(NuttParser.KW_Funct, 0); }
		public Func_anyContext func_any() {
			return getRuleContext(Func_anyContext.class,0);
		}
		public FunctiondefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterFunctiondef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitFunctiondef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFunctiondef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondefContext functiondef() throws RecognitionException {
		FunctiondefContext _localctx = new FunctiondefContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_functiondef);
		try {
			setState(637);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(634);
				lambda_decl();
				}
				break;
			case KW_Funct:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(635);
				match(KW_Funct);
				setState(636);
				func_any();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncbodyContext extends ParserRuleContext {
		public Func_parametersContext func_parameters() {
			return getRuleContext(Func_parametersContext.class,0);
		}
		public Func_outputContext func_output() {
			return getRuleContext(Func_outputContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode KW_Return() { return getToken(NuttParser.KW_Return, 0); }
		public FuncbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterFuncbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitFuncbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFuncbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncbodyContext funcbody() throws RecognitionException {
		FuncbodyContext _localctx = new FuncbodyContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_funcbody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			func_parameters();
			setState(640);
			func_output();
			setState(641);
			block();
			setState(642);
			match(KW_Return);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_refContext extends ParserRuleContext {
		public TerminalNode OP_FunctRef() { return getToken(NuttParser.OP_FunctRef, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FunctiondefContext functiondef() {
			return getRuleContext(FunctiondefContext.class,0);
		}
		public Func_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterFunc_ref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitFunc_ref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFunc_ref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_refContext func_ref() throws RecognitionException {
		Func_refContext _localctx = new Func_refContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_func_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(OP_FunctRef);
			setState(647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(645);
				exp(0);
				}
				break;
			case 2:
				{
				setState(646);
				functiondef();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_copyContext extends ParserRuleContext {
		public TerminalNode OP_FunctCopy() { return getToken(NuttParser.OP_FunctCopy, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FunctiondefContext functiondef() {
			return getRuleContext(FunctiondefContext.class,0);
		}
		public Func_copyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_copy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterFunc_copy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitFunc_copy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFunc_copy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_copyContext func_copy() throws RecognitionException {
		Func_copyContext _localctx = new Func_copyContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_func_copy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(OP_FunctCopy);
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(650);
				exp(0);
				}
				break;
			case 2:
				{
				setState(651);
				functiondef();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_concatContext extends ParserRuleContext {
		public TerminalNode OP_FunctCat() { return getToken(NuttParser.OP_FunctCat, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FunctiondefContext functiondef() {
			return getRuleContext(FunctiondefContext.class,0);
		}
		public Func_concatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_concat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterFunc_concat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitFunc_concat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFunc_concat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_concatContext func_concat() throws RecognitionException {
		Func_concatContext _localctx = new Func_concatContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_func_concat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			match(OP_FunctCat);
			setState(657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(655);
				exp(0);
				}
				break;
			case 2:
				{
				setState(656);
				functiondef();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_anyContext extends ParserRuleContext {
		public Lambda_declContext lambda_decl() {
			return getRuleContext(Lambda_declContext.class,0);
		}
		public Func_refContext func_ref() {
			return getRuleContext(Func_refContext.class,0);
		}
		public Func_copyContext func_copy() {
			return getRuleContext(Func_copyContext.class,0);
		}
		public Func_concatContext func_concat() {
			return getRuleContext(Func_concatContext.class,0);
		}
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public Func_anyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_any; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterFunc_any(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitFunc_any(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFunc_any(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_anyContext func_any() throws RecognitionException {
		Func_anyContext _localctx = new Func_anyContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_func_any);
		try {
			setState(664);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				lambda_decl();
				}
				break;
			case OP_FunctRef:
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
				func_ref();
				}
				break;
			case OP_FunctCopy:
				enterOuterAlt(_localctx, 3);
				{
				setState(661);
				func_copy();
				}
				break;
			case OP_FunctCat:
				enterOuterAlt(_localctx, 4);
				{
				setState(662);
				func_concat();
				}
				break;
			case T__3:
			case KW_VAR:
			case KW_VAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(663);
				funcbody();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Lambda_declContext extends ParserRuleContext {
		public TerminalNode OP_LambdaReturn() { return getToken(NuttParser.OP_LambdaReturn, 0); }
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Func_parametersContext func_parameters() {
			return getRuleContext(Func_parametersContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Lambda_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterLambda_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitLambda_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitLambda_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lambda_declContext lambda_decl() throws RecognitionException {
		Lambda_declContext _localctx = new Lambda_declContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_lambda_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(T__21);
			setState(669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(667);
				var_decl();
				}
				break;
			case 2:
				{
				setState(668);
				func_parameters();
				}
				break;
			}
			setState(671);
			match(OP_LambdaReturn);
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(672);
				stat();
				}
				break;
			case 2:
				{
				setState(673);
				exp(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorBitwiseContext extends ParserRuleContext {
		public OperatorBitwiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorBitwise; }
	 
		public OperatorBitwiseContext() { }
		public void copyFrom(OperatorBitwiseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitShiftLeftContext extends OperatorBitwiseContext {
		public TerminalNode OP_BIT_LSHIFT() { return getToken(NuttParser.OP_BIT_LSHIFT, 0); }
		public BitShiftLeftContext(OperatorBitwiseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterBitShiftLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitBitShiftLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitBitShiftLeft(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitOrContext extends OperatorBitwiseContext {
		public TerminalNode OP_BIT_OR() { return getToken(NuttParser.OP_BIT_OR, 0); }
		public BitOrContext(OperatorBitwiseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterBitOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitBitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitBitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitShiftRightContext extends OperatorBitwiseContext {
		public TerminalNode OP_BIT_RSHIFT() { return getToken(NuttParser.OP_BIT_RSHIFT, 0); }
		public BitShiftRightContext(OperatorBitwiseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterBitShiftRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitBitShiftRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitBitShiftRight(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitAndContext extends OperatorBitwiseContext {
		public TerminalNode OP_BIT_AND() { return getToken(NuttParser.OP_BIT_AND, 0); }
		public BitAndContext(OperatorBitwiseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterBitAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitBitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitBitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorBitwiseContext operatorBitwise() throws RecognitionException {
		OperatorBitwiseContext _localctx = new OperatorBitwiseContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_operatorBitwise);
		try {
			setState(680);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_BIT_LSHIFT:
				_localctx = new BitShiftLeftContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				match(OP_BIT_LSHIFT);
				}
				break;
			case OP_BIT_RSHIFT:
				_localctx = new BitShiftRightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(677);
				match(OP_BIT_RSHIFT);
				}
				break;
			case OP_BIT_OR:
				_localctx = new BitOrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(678);
				match(OP_BIT_OR);
				}
				break;
			case OP_BIT_AND:
				_localctx = new BitAndContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(679);
				match(OP_BIT_AND);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorUnaryContext extends ParserRuleContext {
		public TerminalNode OP_Not() { return getToken(NuttParser.OP_Not, 0); }
		public TerminalNode OP_Length() { return getToken(NuttParser.OP_Length, 0); }
		public TerminalNode OP_Sub() { return getToken(NuttParser.OP_Sub, 0); }
		public TerminalNode OP_Add() { return getToken(NuttParser.OP_Add, 0); }
		public TerminalNode OP_Tilda() { return getToken(NuttParser.OP_Tilda, 0); }
		public OperatorUnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorUnary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterOperatorUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitOperatorUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitOperatorUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorUnaryContext operatorUnary() throws RecognitionException {
		OperatorUnaryContext _localctx = new OperatorUnaryContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_operatorUnary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 9288674265006080L) != 0 || _la==OP_Add || _la==OP_Sub) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorComparisonContext extends ParserRuleContext {
		public TerminalNode OP_Less() { return getToken(NuttParser.OP_Less, 0); }
		public TerminalNode OP_Greater() { return getToken(NuttParser.OP_Greater, 0); }
		public TerminalNode OP_LessEqual() { return getToken(NuttParser.OP_LessEqual, 0); }
		public TerminalNode OP_GreaterEqual() { return getToken(NuttParser.OP_GreaterEqual, 0); }
		public TerminalNode OP_NotSimilar() { return getToken(NuttParser.OP_NotSimilar, 0); }
		public TerminalNode OP_NotEqual() { return getToken(NuttParser.OP_NotEqual, 0); }
		public TerminalNode OP_Similar() { return getToken(NuttParser.OP_Similar, 0); }
		public TerminalNode OP_Equal() { return getToken(NuttParser.OP_Equal, 0); }
		public OperatorComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorComparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterOperatorComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitOperatorComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitOperatorComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorComparisonContext operatorComparison() throws RecognitionException {
		OperatorComparisonContext _localctx = new OperatorComparisonContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_operatorComparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 280375465082880L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Operator_mathContext extends ParserRuleContext {
		public TerminalNode OP_Add() { return getToken(NuttParser.OP_Add, 0); }
		public TerminalNode OP_Sub() { return getToken(NuttParser.OP_Sub, 0); }
		public TerminalNode OP_Mult() { return getToken(NuttParser.OP_Mult, 0); }
		public TerminalNode OP_Div() { return getToken(NuttParser.OP_Div, 0); }
		public TerminalNode OP_Mod() { return getToken(NuttParser.OP_Mod, 0); }
		public TerminalNode OP_IntDiv() { return getToken(NuttParser.OP_IntDiv, 0); }
		public Operator_mathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterOperator_math(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitOperator_math(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitOperator_math(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_mathContext operator_math() throws RecognitionException {
		Operator_mathContext _localctx = new Operator_mathContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_operator_math);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			_la = _input.LA(1);
			if ( !((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 63L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class In_place_opContext extends ParserRuleContext {
		public TerminalNode OP_AddAssign() { return getToken(NuttParser.OP_AddAssign, 0); }
		public TerminalNode OP_SubAssign() { return getToken(NuttParser.OP_SubAssign, 0); }
		public TerminalNode OP_MultAssign() { return getToken(NuttParser.OP_MultAssign, 0); }
		public TerminalNode OP_DivAssign() { return getToken(NuttParser.OP_DivAssign, 0); }
		public TerminalNode OP_IntDivAssign() { return getToken(NuttParser.OP_IntDivAssign, 0); }
		public TerminalNode OP_ModAssign() { return getToken(NuttParser.OP_ModAssign, 0); }
		public TerminalNode OP_CatAssign() { return getToken(NuttParser.OP_CatAssign, 0); }
		public In_place_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_place_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterIn_place_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitIn_place_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitIn_place_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_place_opContext in_place_op() throws RecognitionException {
		In_place_opContext _localctx = new In_place_opContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_in_place_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			_la = _input.LA(1);
			if ( !((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & 127L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Self_in_place_opContext extends ParserRuleContext {
		public TerminalNode OP_IncrAssign() { return getToken(NuttParser.OP_IncrAssign, 0); }
		public TerminalNode OP_DecrAssign() { return getToken(NuttParser.OP_DecrAssign, 0); }
		public TerminalNode OP_MultSelfAssign() { return getToken(NuttParser.OP_MultSelfAssign, 0); }
		public TerminalNode OP_CatSelfAssign() { return getToken(NuttParser.OP_CatSelfAssign, 0); }
		public Self_in_place_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self_in_place_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterSelf_in_place_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitSelf_in_place_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitSelf_in_place_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Self_in_place_opContext self_in_place_op() throws RecognitionException {
		Self_in_place_opContext _localctx = new Self_in_place_opContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_self_in_place_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			_la = _input.LA(1);
			if ( !((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & 15L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 61:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 12);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001v\u02b5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0001\u0000\u0003\u0000\u00b0\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001\u00b6\b\u0001\n\u0001"+
		"\f\u0001\u00b9\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"\u00c4\b\u0003\n\u0003\f\u0003\u00c7\t\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u00cd\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u00d2\b\u0005\n\u0005\f\u0005\u00d5\t\u0005\u0001\u0006"+
		"\u0005\u0006\u00d8\b\u0006\n\u0006\f\u0006\u00db\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u00f0\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u011e\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0003\u0013\u0123\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u012d\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u0132\b\u0016\n\u0016\f\u0016\u0135\t\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u013e"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u0151\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0005\u001b\u0158\b\u001b\n\u001b\f\u001b\u015b\t\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u0160\b\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u0165\b\u001d\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u0169\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u016e\b"+
		"\u001f\n\u001f\f\u001f\u0171\t\u001f\u0001 \u0001 \u0001 \u0005 \u0176"+
		"\b \n \f \u0179\t \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u0189\b#\u0001$\u0001"+
		"$\u0001%\u0001%\u0001%\u0001&\u0001&\u0003&\u0192\b&\u0001\'\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u01a6\b*\u0001*\u0001*\u0001"+
		"*\u0003*\u01ab\b*\u0001+\u0001+\u0001,\u0001,\u0003,\u01b1\b,\u0001,\u0001"+
		",\u0003,\u01b5\b,\u0001-\u0001-\u0003-\u01b9\b-\u0001-\u0001-\u0001.\u0001"+
		".\u0001.\u0003.\u01c0\b.\u0001/\u0001/\u00010\u00010\u00011\u00011\u0001"+
		"2\u00012\u00012\u00012\u00012\u00032\u01cd\b2\u00012\u00032\u01d0\b2\u0001"+
		"2\u00012\u00032\u01d4\b2\u00013\u00013\u00013\u00014\u00014\u00015\u0001"+
		"5\u00016\u00016\u00017\u00017\u00018\u00018\u00019\u00019\u0001:\u0001"+
		":\u0001;\u0001;\u0001;\u0005;\u01ea\b;\n;\f;\u01ed\t;\u0001<\u0001<\u0001"+
		"<\u0005<\u01f2\b<\n<\f<\u01f5\t<\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0003=\u0200\b=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0003=\u0213\b=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0003=\u023e\b=\u0001=\u0001=\u0003"+
		"=\u0242\b=\u0005=\u0244\b=\n=\f=\u0247\t=\u0001>\u0001>\u0001>\u0001>"+
		"\u0003>\u024d\b>\u0001?\u0001?\u0001@\u0001@\u0001A\u0001A\u0001B\u0001"+
		"B\u0001C\u0001C\u0001D\u0001D\u0003D\u025b\bD\u0001D\u0001D\u0001D\u0003"+
		"D\u0260\bD\u0001D\u0001D\u0001E\u0001E\u0001F\u0001F\u0001F\u0003F\u0269"+
		"\bF\u0001F\u0003F\u026c\bF\u0001G\u0001G\u0003G\u0270\bG\u0001G\u0001"+
		"G\u0001H\u0001H\u0003H\u0276\bH\u0001I\u0001I\u0001I\u0001J\u0001J\u0001"+
		"J\u0003J\u027e\bJ\u0001K\u0001K\u0001K\u0001K\u0001K\u0001L\u0001L\u0001"+
		"L\u0003L\u0288\bL\u0001M\u0001M\u0001M\u0003M\u028d\bM\u0001N\u0001N\u0001"+
		"N\u0003N\u0292\bN\u0001O\u0001O\u0001O\u0001O\u0001O\u0003O\u0299\bO\u0001"+
		"P\u0001P\u0001P\u0003P\u029e\bP\u0001P\u0001P\u0001P\u0003P\u02a3\bP\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0003Q\u02a9\bQ\u0001R\u0001R\u0001S\u0001S\u0001"+
		"T\u0001T\u0001U\u0001U\u0001V\u0001V\u0001V\u0000\u0001zW\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u0000\u000b\u0001\u0000\u0017"+
		"\u0019\u0001\u0000UV\u0001\u0000\u001e \u0001\u0000ST\u0001\u0000]`\u0001"+
		"\u0000Y[\u0004\u0000\u0019\u00190055qr\u0001\u0000(/\u0001\u0000qv\u0001"+
		"\u0000io\u0001\u0000eh\u02c9\u0000\u00af\u0001\u0000\u0000\u0000\u0002"+
		"\u00b3\u0001\u0000\u0000\u0000\u0004\u00bd\u0001\u0000\u0000\u0000\u0006"+
		"\u00c0\u0001\u0000\u0000\u0000\b\u00c8\u0001\u0000\u0000\u0000\n\u00ce"+
		"\u0001\u0000\u0000\u0000\f\u00d9\u0001\u0000\u0000\u0000\u000e\u00dc\u0001"+
		"\u0000\u0000\u0000\u0010\u00ef\u0001\u0000\u0000\u0000\u0012\u00f1\u0001"+
		"\u0000\u0000\u0000\u0014\u00f8\u0001\u0000\u0000\u0000\u0016\u00fc\u0001"+
		"\u0000\u0000\u0000\u0018\u0100\u0001\u0000\u0000\u0000\u001a\u0105\u0001"+
		"\u0000\u0000\u0000\u001c\u0109\u0001\u0000\u0000\u0000\u001e\u010d\u0001"+
		"\u0000\u0000\u0000 \u0112\u0001\u0000\u0000\u0000\"\u0116\u0001\u0000"+
		"\u0000\u0000$\u0119\u0001\u0000\u0000\u0000&\u0122\u0001\u0000\u0000\u0000"+
		"(\u0126\u0001\u0000\u0000\u0000*\u0129\u0001\u0000\u0000\u0000,\u012e"+
		"\u0001\u0000\u0000\u0000.\u0136\u0001\u0000\u0000\u00000\u0141\u0001\u0000"+
		"\u0000\u00002\u0144\u0001\u0000\u0000\u00004\u0150\u0001\u0000\u0000\u0000"+
		"6\u0152\u0001\u0000\u0000\u00008\u015f\u0001\u0000\u0000\u0000:\u0164"+
		"\u0001\u0000\u0000\u0000<\u0166\u0001\u0000\u0000\u0000>\u016a\u0001\u0000"+
		"\u0000\u0000@\u0172\u0001\u0000\u0000\u0000B\u017a\u0001\u0000\u0000\u0000"+
		"D\u0180\u0001\u0000\u0000\u0000F\u0183\u0001\u0000\u0000\u0000H\u018a"+
		"\u0001\u0000\u0000\u0000J\u018c\u0001\u0000\u0000\u0000L\u0191\u0001\u0000"+
		"\u0000\u0000N\u0193\u0001\u0000\u0000\u0000P\u0196\u0001\u0000\u0000\u0000"+
		"R\u0199\u0001\u0000\u0000\u0000T\u01aa\u0001\u0000\u0000\u0000V\u01ac"+
		"\u0001\u0000\u0000\u0000X\u01ae\u0001\u0000\u0000\u0000Z\u01b6\u0001\u0000"+
		"\u0000\u0000\\\u01bf\u0001\u0000\u0000\u0000^\u01c1\u0001\u0000\u0000"+
		"\u0000`\u01c3\u0001\u0000\u0000\u0000b\u01c5\u0001\u0000\u0000\u0000d"+
		"\u01cc\u0001\u0000\u0000\u0000f\u01d5\u0001\u0000\u0000\u0000h\u01d8\u0001"+
		"\u0000\u0000\u0000j\u01da\u0001\u0000\u0000\u0000l\u01dc\u0001\u0000\u0000"+
		"\u0000n\u01de\u0001\u0000\u0000\u0000p\u01e0\u0001\u0000\u0000\u0000r"+
		"\u01e2\u0001\u0000\u0000\u0000t\u01e4\u0001\u0000\u0000\u0000v\u01e6\u0001"+
		"\u0000\u0000\u0000x\u01ee\u0001\u0000\u0000\u0000z\u0212\u0001\u0000\u0000"+
		"\u0000|\u024c\u0001\u0000\u0000\u0000~\u024e\u0001\u0000\u0000\u0000\u0080"+
		"\u0250\u0001\u0000\u0000\u0000\u0082\u0252\u0001\u0000\u0000\u0000\u0084"+
		"\u0254\u0001\u0000\u0000\u0000\u0086\u0256\u0001\u0000\u0000\u0000\u0088"+
		"\u025a\u0001\u0000\u0000\u0000\u008a\u0263\u0001\u0000\u0000\u0000\u008c"+
		"\u026b\u0001\u0000\u0000\u0000\u008e\u026f\u0001\u0000\u0000\u0000\u0090"+
		"\u0275\u0001\u0000\u0000\u0000\u0092\u0277\u0001\u0000\u0000\u0000\u0094"+
		"\u027d\u0001\u0000\u0000\u0000\u0096\u027f\u0001\u0000\u0000\u0000\u0098"+
		"\u0284\u0001\u0000\u0000\u0000\u009a\u0289\u0001\u0000\u0000\u0000\u009c"+
		"\u028e\u0001\u0000\u0000\u0000\u009e\u0298\u0001\u0000\u0000\u0000\u00a0"+
		"\u029a\u0001\u0000\u0000\u0000\u00a2\u02a8\u0001\u0000\u0000\u0000\u00a4"+
		"\u02aa\u0001\u0000\u0000\u0000\u00a6\u02ac\u0001\u0000\u0000\u0000\u00a8"+
		"\u02ae\u0001\u0000\u0000\u0000\u00aa\u02b0\u0001\u0000\u0000\u0000\u00ac"+
		"\u02b2\u0001\u0000\u0000\u0000\u00ae\u00b0\u0003\u0002\u0001\u0000\u00af"+
		"\u00ae\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u0000\u0000\u0001\u00b2"+
		"\u0001\u0001\u0000\u0000\u0000\u00b3\u00b7\u0003\u0004\u0002\u0000\u00b4"+
		"\u00b6\u0003\b\u0004\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9\u00b7"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0003\f\u0006\u0000\u00bb\u00bc\u0005"+
		"N\u0000\u0000\u00bc\u0003\u0001\u0000\u0000\u0000\u00bd\u00be\u0005M\u0000"+
		"\u0000\u00be\u00bf\u0003\u0006\u0003\u0000\u00bf\u0005\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c5\u0005X\u0000\u0000\u00c1\u00c2\u0005\u0001\u0000\u0000"+
		"\u00c2\u00c4\u0005X\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c6\u0007\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c8\u00cc\u0005O\u0000\u0000\u00c9\u00cd"+
		"\u0005W\u0000\u0000\u00ca\u00cd\u0003\u0006\u0003\u0000\u00cb\u00cd\u0003"+
		"\n\u0005\u0000\u00cc\u00c9\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd\t\u0001\u0000\u0000"+
		"\u0000\u00ce\u00d3\u0003\u0006\u0003\u0000\u00cf\u00d0\u0005\u0002\u0000"+
		"\u0000\u00d0\u00d2\u0003\u0006\u0003\u0000\u00d1\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u000b\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d8\u0003\u0010\b\u0000"+
		"\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000"+
		"\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000"+
		"\u00da\r\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0007\u0000\u0000\u0000\u00dd\u000f\u0001\u0000\u0000\u0000\u00de"+
		"\u00f0\u0003D\"\u0000\u00df\u00f0\u0003\u0014\n\u0000\u00e0\u00f0\u0003"+
		"\u0012\t\u0000\u00e1\u00f0\u0003F#\u0000\u00e2\u00f0\u0003*\u0015\u0000"+
		"\u00e3\u00f0\u0003\u0016\u000b\u0000\u00e4\u00f0\u0003\u0018\f\u0000\u00e5"+
		"\u00f0\u0003\u0088D\u0000\u00e6\u00f0\u0005?\u0000\u0000\u00e7\u00f0\u0003"+
		"\u001a\r\u0000\u00e8\u00f0\u00034\u001a\u0000\u00e9\u00f0\u0003 \u0010"+
		"\u0000\u00ea\u00f0\u0003\"\u0011\u0000\u00eb\u00f0\u0003$\u0012\u0000"+
		"\u00ec\u00f0\u0003B!\u0000\u00ed\u00f0\u0005:\u0000\u0000\u00ee\u00f0"+
		"\u0003:\u001d\u0000\u00ef\u00de\u0001\u0000\u0000\u0000\u00ef\u00df\u0001"+
		"\u0000\u0000\u0000\u00ef\u00e0\u0001\u0000\u0000\u0000\u00ef\u00e1\u0001"+
		"\u0000\u0000\u0000\u00ef\u00e2\u0001\u0000\u0000\u0000\u00ef\u00e3\u0001"+
		"\u0000\u0000\u0000\u00ef\u00e4\u0001\u0000\u0000\u0000\u00ef\u00e5\u0001"+
		"\u0000\u0000\u0000\u00ef\u00e6\u0001\u0000\u0000\u0000\u00ef\u00e7\u0001"+
		"\u0000\u0000\u0000\u00ef\u00e8\u0001\u0000\u0000\u0000\u00ef\u00e9\u0001"+
		"\u0000\u0000\u0000\u00ef\u00ea\u0001\u0000\u0000\u0000\u00ef\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ef\u00ec\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0\u0011\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0003\u008aE\u0000\u00f2\u00f3\u00059\u0000"+
		"\u0000\u00f3\u00f4\u0003z=\u0000\u00f4\u00f5\u00058\u0000\u0000\u00f5"+
		"\u00f6\u00057\u0000\u0000\u00f6\u00f7\u0003z=\u0000\u00f7\u0013\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f9\u0003@ \u0000\u00f9\u00fa\u00057\u0000"+
		"\u0000\u00fa\u00fb\u0003x<\u0000\u00fb\u0015\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0005@\u0000\u0000\u00fd\u00fe\u0003>\u001f\u0000\u00fe\u00ff\u0003"+
		"\u009eO\u0000\u00ff\u0017\u0001\u0000\u0000\u0000\u0100\u0101\u0005\u001d"+
		"\u0000\u0000\u0101\u0102\u0003\u0086C\u0000\u0102\u0103\u0005\u001c\u0000"+
		"\u0000\u0103\u0104\u0003\u008aE\u0000\u0104\u0019\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0005D\u0000\u0000\u0106\u0107\u0003\f\u0006\u0000\u0107"+
		"\u0108\u0005C\u0000\u0000\u0108\u001b\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0005>\u0000\u0000\u010a\u010b\u0003x<\u0000\u010b\u010c\u0003\u001a"+
		"\r\u0000\u010c\u001d\u0001\u0000\u0000\u0000\u010d\u010e\u0005\u001a\u0000"+
		"\u0000\u010e\u010f\u0003\f\u0006\u0000\u010f\u0110\u0005\u001b\u0000\u0000"+
		"\u0110\u0111\u0003x<\u0000\u0111\u001f\u0001\u0000\u0000\u0000\u0112\u0113"+
		"\u0003\u008aE\u0000\u0113\u0114\u0003\u00aaU\u0000\u0114\u0115\u0003z"+
		"=\u0000\u0115!\u0001\u0000\u0000\u0000\u0116\u0117\u0003\u008aE\u0000"+
		"\u0117\u0118\u0003\u00acV\u0000\u0118#\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0005;\u0000\u0000\u011a\u011b\u0003z=\u0000\u011b\u011d\u0003&\u0013"+
		"\u0000\u011c\u011e\u0003(\u0014\u0000\u011d\u011c\u0001\u0000\u0000\u0000"+
		"\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000"+
		"\u011f\u0120\u0005N\u0000\u0000\u0120%\u0001\u0000\u0000\u0000\u0121\u0123"+
		"\u0005<\u0000\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0122\u0123\u0001"+
		"\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0125\u0003"+
		"\f\u0006\u0000\u0125\'\u0001\u0000\u0000\u0000\u0126\u0127\u0005=\u0000"+
		"\u0000\u0127\u0128\u0003\f\u0006\u0000\u0128)\u0001\u0000\u0000\u0000"+
		"\u0129\u012c\u0005A\u0000\u0000\u012a\u012d\u0005W\u0000\u0000\u012b\u012d"+
		"\u0003,\u0016\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012b\u0001"+
		"\u0000\u0000\u0000\u012d+\u0001\u0000\u0000\u0000\u012e\u0133\u0005X\u0000"+
		"\u0000\u012f\u0130\u0005\u0002\u0000\u0000\u0130\u0132\u0005X\u0000\u0000"+
		"\u0131\u012f\u0001\u0000\u0000\u0000\u0132\u0135\u0001\u0000\u0000\u0000"+
		"\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000"+
		"\u0134-\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0136"+
		"\u0137\u0005B\u0000\u0000\u0137\u0138\u0003J%\u0000\u0138\u0139\u0003"+
		"P(\u0000\u0139\u013a\u0005\u0002\u0000\u0000\u013a\u013d\u0003z=\u0000"+
		"\u013b\u013c\u0005\u0002\u0000\u0000\u013c\u013e\u0003z=\u0000\u013d\u013b"+
		"\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u013f"+
		"\u0001\u0000\u0000\u0000\u013f\u0140\u0003\u001a\r\u0000\u0140/\u0001"+
		"\u0000\u0000\u0000\u0141\u0142\u0005G\u0000\u0000\u0142\u0143\u0003.\u0017"+
		"\u0000\u01431\u0001\u0000\u0000\u0000\u0144\u0145\u0005B\u0000\u0000\u0145"+
		"\u0146\u0005F\u0000\u0000\u0146\u0147\u0003F#\u0000\u0147\u0148\u0005"+
		"E\u0000\u0000\u0148\u0149\u0003x<\u0000\u0149\u014a\u0003\u001a\r\u0000"+
		"\u014a3\u0001\u0000\u0000\u0000\u014b\u0151\u0003.\u0017\u0000\u014c\u0151"+
		"\u00030\u0018\u0000\u014d\u0151\u00032\u0019\u0000\u014e\u0151\u0003\u001c"+
		"\u000e\u0000\u014f\u0151\u0003\u001e\u000f\u0000\u0150\u014b\u0001\u0000"+
		"\u0000\u0000\u0150\u014c\u0001\u0000\u0000\u0000\u0150\u014d\u0001\u0000"+
		"\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0150\u014f\u0001\u0000"+
		"\u0000\u0000\u01515\u0001\u0000\u0000\u0000\u0152\u0153\u0005X\u0000\u0000"+
		"\u0153\u0159\u00038\u001c\u0000\u0154\u0155\u0005\u0002\u0000\u0000\u0155"+
		"\u0156\u0005X\u0000\u0000\u0156\u0158\u00038\u001c\u0000\u0157\u0154\u0001"+
		"\u0000\u0000\u0000\u0158\u015b\u0001\u0000\u0000\u0000\u0159\u0157\u0001"+
		"\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a7\u0001\u0000"+
		"\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015c\u015d\u0005(\u0000"+
		"\u0000\u015d\u015e\u0005X\u0000\u0000\u015e\u0160\u0005)\u0000\u0000\u015f"+
		"\u015c\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160"+
		"9\u0001\u0000\u0000\u0000\u0161\u0165\u0003<\u001e\u0000\u0162\u0165\u0005"+
		"?\u0000\u0000\u0163\u0165\u0005H\u0000\u0000\u0164\u0161\u0001\u0000\u0000"+
		"\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0164\u0163\u0001\u0000\u0000"+
		"\u0000\u0165;\u0001\u0000\u0000\u0000\u0166\u0168\u0005I\u0000\u0000\u0167"+
		"\u0169\u0003z=\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u0168\u0169\u0001"+
		"\u0000\u0000\u0000\u0169=\u0001\u0000\u0000\u0000\u016a\u016f\u0005X\u0000"+
		"\u0000\u016b\u016c\u0005\u0001\u0000\u0000\u016c\u016e\u0005X\u0000\u0000"+
		"\u016d\u016b\u0001\u0000\u0000\u0000\u016e\u0171\u0001\u0000\u0000\u0000"+
		"\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000"+
		"\u0170?\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0172"+
		"\u0177\u0003\u008aE\u0000\u0173\u0174\u0005\u0002\u0000\u0000\u0174\u0176"+
		"\u0003\u008aE\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0176\u0179\u0001"+
		"\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001"+
		"\u0000\u0000\u0000\u0178A\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000"+
		"\u0000\u0000\u017a\u017b\u0005K\u0000\u0000\u017b\u017c\u0003\f\u0006"+
		"\u0000\u017c\u017d\u0005J\u0000\u0000\u017d\u017e\u0003\f\u0006\u0000"+
		"\u017e\u017f\u0005N\u0000\u0000\u017fC\u0001\u0000\u0000\u0000\u0180\u0181"+
		"\u0005L\u0000\u0000\u0181\u0182\u0003z=\u0000\u0182E\u0001\u0000\u0000"+
		"\u0000\u0183\u0188\u0003J%\u0000\u0184\u0189\u0003L&\u0000\u0185\u0189"+
		"\u0003N\'\u0000\u0186\u0189\u0003P(\u0000\u0187\u0189\u0003R)\u0000\u0188"+
		"\u0184\u0001\u0000\u0000\u0000\u0188\u0185\u0001\u0000\u0000\u0000\u0188"+
		"\u0186\u0001\u0000\u0000\u0000\u0188\u0187\u0001\u0000\u0000\u0000\u0189"+
		"G\u0001\u0000\u0000\u0000\u018a\u018b\u0007\u0001\u0000\u0000\u018bI\u0001"+
		"\u0000\u0000\u0000\u018c\u018d\u0003H$\u0000\u018d\u018e\u0005X\u0000"+
		"\u0000\u018eK\u0001\u0000\u0000\u0000\u018f\u0190\u00057\u0000\u0000\u0190"+
		"\u0192\u0003t:\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0191\u0192\u0001"+
		"\u0000\u0000\u0000\u0192M\u0001\u0000\u0000\u0000\u0193\u0194\u0005\u0003"+
		"\u0000\u0000\u0194\u0195\u0003T*\u0000\u0195O\u0001\u0000\u0000\u0000"+
		"\u0196\u0197\u00057\u0000\u0000\u0197\u0198\u0003z=\u0000\u0198Q\u0001"+
		"\u0000\u0000\u0000\u0199\u019a\u0005\u0003\u0000\u0000\u019a\u019b\u0003"+
		"T*\u0000\u019b\u019c\u00057\u0000\u0000\u019c\u019d\u0003z=\u0000\u019d"+
		"S\u0001\u0000\u0000\u0000\u019e\u01ab\u0003p8\u0000\u019f\u01ab\u0003"+
		"r9\u0000\u01a0\u01a6\u0003X,\u0000\u01a1\u01a2\u0005\u0004\u0000\u0000"+
		"\u01a2\u01a3\u0003X,\u0000\u01a3\u01a4\u0005\u0005\u0000\u0000\u01a4\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a0\u0001\u0000\u0000\u0000\u01a5\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a6\u01ab\u0001\u0000\u0000\u0000\u01a7\u01ab"+
		"\u0003\\.\u0000\u01a8\u01ab\u0003d2\u0000\u01a9\u01ab\u0003t:\u0000\u01aa"+
		"\u019e\u0001\u0000\u0000\u0000\u01aa\u019f\u0001\u0000\u0000\u0000\u01aa"+
		"\u01a5\u0001\u0000\u0000\u0000\u01aa\u01a7\u0001\u0000\u0000\u0000\u01aa"+
		"\u01a8\u0001\u0000\u0000\u0000\u01aa\u01a9\u0001\u0000\u0000\u0000\u01ab"+
		"U\u0001\u0000\u0000\u0000\u01ac\u01ad\u0007\u0002\u0000\u0000\u01adW\u0001"+
		"\u0000\u0000\u0000\u01ae\u01b0\u0003V+\u0000\u01af\u01b1\u0003\u008cF"+
		"\u0000\u01b0\u01af\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b4\u0001\u0000\u0000\u0000\u01b2\u01b3\u0005\u0006\u0000"+
		"\u0000\u01b3\u01b5\u0003T*\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b5\u0001\u0000\u0000\u0000\u01b5Y\u0001\u0000\u0000\u0000\u01b6\u01b8"+
		"\u0005\u0007\u0000\u0000\u01b7\u01b9\u0003x<\u0000\u01b8\u01b7\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000"+
		"\u0000\u0000\u01ba\u01bb\u0005\b\u0000\u0000\u01bb[\u0001\u0000\u0000"+
		"\u0000\u01bc\u01c0\u0005\t\u0000\u0000\u01bd\u01c0\u0003^/\u0000\u01be"+
		"\u01c0\u0003`0\u0000\u01bf\u01bc\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001"+
		"\u0000\u0000\u0000\u01bf\u01be\u0001\u0000\u0000\u0000\u01c0]\u0001\u0000"+
		"\u0000\u0000\u01c1\u01c2\u0005\n\u0000\u0000\u01c2_\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c4\u0005\u000b\u0000\u0000\u01c4a\u0001\u0000\u0000\u0000"+
		"\u01c5\u01c6\u0005\f\u0000\u0000\u01c6c\u0001\u0000\u0000\u0000\u01c7"+
		"\u01cd\u0003b1\u0000\u01c8\u01cd\u0003h4\u0000\u01c9\u01cd\u0003j5\u0000"+
		"\u01ca\u01cd\u0003n7\u0000\u01cb\u01cd\u0003l6\u0000\u01cc\u01c7\u0001"+
		"\u0000\u0000\u0000\u01cc\u01c8\u0001\u0000\u0000\u0000\u01cc\u01c9\u0001"+
		"\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000\u0000\u0000\u01cc\u01cb\u0001"+
		"\u0000\u0000\u0000\u01cd\u01d3\u0001\u0000\u0000\u0000\u01ce\u01d0\u0003"+
		"f3\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000"+
		"\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d2\u00053\u0000\u0000"+
		"\u01d2\u01d4\u0003T*\u0000\u01d3\u01cf\u0001\u0000\u0000\u0000\u01d3\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d4e\u0001\u0000\u0000\u0000\u01d5\u01d6\u0005"+
		"5\u0000\u0000\u01d6\u01d7\u0003z=\u0000\u01d7g\u0001\u0000\u0000\u0000"+
		"\u01d8\u01d9\u0005\r\u0000\u0000\u01d9i\u0001\u0000\u0000\u0000\u01da"+
		"\u01db\u0005\u000e\u0000\u0000\u01dbk\u0001\u0000\u0000\u0000\u01dc\u01dd"+
		"\u0005\u000f\u0000\u0000\u01ddm\u0001\u0000\u0000\u0000\u01de\u01df\u0005"+
		"\u0010\u0000\u0000\u01dfo\u0001\u0000\u0000\u0000\u01e0\u01e1\u0005\u0011"+
		"\u0000\u0000\u01e1q\u0001\u0000\u0000\u0000\u01e2\u01e3\u0005\u0012\u0000"+
		"\u0000\u01e3s\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005\u0013\u0000\u0000"+
		"\u01e5u\u0001\u0000\u0000\u0000\u01e6\u01eb\u0003F#\u0000\u01e7\u01e8"+
		"\u0005\u0002\u0000\u0000\u01e8\u01ea\u0003F#\u0000\u01e9\u01e7\u0001\u0000"+
		"\u0000\u0000\u01ea\u01ed\u0001\u0000\u0000\u0000\u01eb\u01e9\u0001\u0000"+
		"\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ecw\u0001\u0000\u0000"+
		"\u0000\u01ed\u01eb\u0001\u0000\u0000\u0000\u01ee\u01f3\u0003z=\u0000\u01ef"+
		"\u01f0\u0005\u0002\u0000\u0000\u01f0\u01f2\u0003z=\u0000\u01f1\u01ef\u0001"+
		"\u0000\u0000\u0000\u01f2\u01f5\u0001\u0000\u0000\u0000\u01f3\u01f1\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4y\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f6\u01f7\u0006=\uffff"+
		"\uffff\u0000\u01f7\u0213\u0003\u008aE\u0000\u01f8\u0213\u0003|>\u0000"+
		"\u01f9\u0213\u0003\u0086C\u0000\u01fa\u0213\u0003Z-\u0000\u01fb\u0213"+
		"\u0003\u0094J\u0000\u01fc\u01fd\u0003>\u001f\u0000\u01fd\u01ff\u0005\u0004"+
		"\u0000\u0000\u01fe\u0200\u0003x<\u0000\u01ff\u01fe\u0001\u0000\u0000\u0000"+
		"\u01ff\u0200\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000"+
		"\u0201\u0202\u0005\u0005\u0000\u0000\u0202\u0213\u0001\u0000\u0000\u0000"+
		"\u0203\u0204\u0003\u00a4R\u0000\u0204\u0205\u0003z=\r\u0205\u0213\u0001"+
		"\u0000\u0000\u0000\u0206\u0207\u0005\u0004\u0000\u0000\u0207\u0208\u0003"+
		"z=\u0000\u0208\u0209\u0005\u0005\u0000\u0000\u0209\u0213\u0001\u0000\u0000"+
		"\u0000\u020a\u020b\u0005P\u0000\u0000\u020b\u0213\u0003z=\u0005\u020c"+
		"\u020d\u0005Q\u0000\u0000\u020d\u0213\u0003z=\u0004\u020e\u020f\u0003"+
		">\u001f\u0000\u020f\u0210\u0005%\u0000\u0000\u0210\u0211\u0003>\u001f"+
		"\u0000\u0211\u0213\u0001\u0000\u0000\u0000\u0212\u01f6\u0001\u0000\u0000"+
		"\u0000\u0212\u01f8\u0001\u0000\u0000\u0000\u0212\u01f9\u0001\u0000\u0000"+
		"\u0000\u0212\u01fa\u0001\u0000\u0000\u0000\u0212\u01fb\u0001\u0000\u0000"+
		"\u0000\u0212\u01fc\u0001\u0000\u0000\u0000\u0212\u0203\u0001\u0000\u0000"+
		"\u0000\u0212\u0206\u0001\u0000\u0000\u0000\u0212\u020a\u0001\u0000\u0000"+
		"\u0000\u0212\u020c\u0001\u0000\u0000\u0000\u0212\u020e\u0001\u0000\u0000"+
		"\u0000\u0213\u0245\u0001\u0000\u0000\u0000\u0214\u0215\n\u0010\u0000\u0000"+
		"\u0215\u0216\u0003\u00a2Q\u0000\u0216\u0217\u0003z=\u0011\u0217\u0244"+
		"\u0001\u0000\u0000\u0000\u0218\u0219\n\u000f\u0000\u0000\u0219\u021a\u0003"+
		"\u00a8T\u0000\u021a\u021b\u0003z=\u0010\u021b\u0244\u0001\u0000\u0000"+
		"\u0000\u021c\u021d\n\u000e\u0000\u0000\u021d\u021e\u0003\u000e\u0007\u0000"+
		"\u021e\u021f\u0003z=\u000f\u021f\u0244\u0001\u0000\u0000\u0000\u0220\u0221"+
		"\n\u000b\u0000\u0000\u0221\u0222\u0005p\u0000\u0000\u0222\u0244\u0003"+
		"z=\u000b\u0223\u0224\n\n\u0000\u0000\u0224\u0225\u0005&\u0000\u0000\u0225"+
		"\u0244\u0003z=\u000b\u0226\u0227\n\t\u0000\u0000\u0227\u0228\u0005\'\u0000"+
		"\u0000\u0228\u0244\u0003z=\n\u0229\u022a\n\b\u0000\u0000\u022a\u022b\u0003"+
		"\u00a6S\u0000\u022b\u022c\u0003z=\t\u022c\u0244\u0001\u0000\u0000\u0000"+
		"\u022d\u022e\n\u0007\u0000\u0000\u022e\u022f\u00056\u0000\u0000\u022f"+
		"\u0244\u0003z=\u0007\u0230\u0231\n\f\u0000\u0000\u0231\u0232\u00059\u0000"+
		"\u0000\u0232\u0233\u0003z=\u0000\u0233\u0234\u00058\u0000\u0000\u0234"+
		"\u0244\u0001\u0000\u0000\u0000\u0235\u0236\n\u0003\u0000\u0000\u0236\u0237"+
		"\u0005\u001c\u0000\u0000\u0237\u0244\u0003T*\u0000\u0238\u0239\n\u0001"+
		"\u0000\u0000\u0239\u023a\u0005\u0014\u0000\u0000\u023a\u023d\u0003z=\u0000"+
		"\u023b\u023c\u0005\u0015\u0000\u0000\u023c\u023e\u0003z=\u0000\u023d\u023b"+
		"\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000\u023e\u0241"+
		"\u0001\u0000\u0000\u0000\u023f\u0240\u0005\u0015\u0000\u0000\u0240\u0242"+
		"\u0003z=\u0000\u0241\u023f\u0001\u0000\u0000\u0000\u0241\u0242\u0001\u0000"+
		"\u0000\u0000\u0242\u0244\u0001\u0000\u0000\u0000\u0243\u0214\u0001\u0000"+
		"\u0000\u0000\u0243\u0218\u0001\u0000\u0000\u0000\u0243\u021c\u0001\u0000"+
		"\u0000\u0000\u0243\u0220\u0001\u0000\u0000\u0000\u0243\u0223\u0001\u0000"+
		"\u0000\u0000\u0243\u0226\u0001\u0000\u0000\u0000\u0243\u0229\u0001\u0000"+
		"\u0000\u0000\u0243\u022d\u0001\u0000\u0000\u0000\u0243\u0230\u0001\u0000"+
		"\u0000\u0000\u0243\u0235\u0001\u0000\u0000\u0000\u0243\u0238\u0001\u0000"+
		"\u0000\u0000\u0244\u0247\u0001\u0000\u0000\u0000\u0245\u0243\u0001\u0000"+
		"\u0000\u0000\u0245\u0246\u0001\u0000\u0000\u0000\u0246{\u0001\u0000\u0000"+
		"\u0000\u0247\u0245\u0001\u0000\u0000\u0000\u0248\u024d\u0003~?\u0000\u0249"+
		"\u024d\u0003\u0080@\u0000\u024a\u024d\u0003\u0082A\u0000\u024b\u024d\u0003"+
		"\u0084B\u0000\u024c\u0248\u0001\u0000\u0000\u0000\u024c\u0249\u0001\u0000"+
		"\u0000\u0000\u024c\u024a\u0001\u0000\u0000\u0000\u024c\u024b\u0001\u0000"+
		"\u0000\u0000\u024d}\u0001\u0000\u0000\u0000\u024e\u024f\u0005R\u0000\u0000"+
		"\u024f\u007f\u0001\u0000\u0000\u0000\u0250\u0251\u0007\u0003\u0000\u0000"+
		"\u0251\u0081\u0001\u0000\u0000\u0000\u0252\u0253\u0007\u0004\u0000\u0000"+
		"\u0253\u0083\u0001\u0000\u0000\u0000\u0254\u0255\u0007\u0005\u0000\u0000"+
		"\u0255\u0085\u0001\u0000\u0000\u0000\u0256\u0257\u0005\\\u0000\u0000\u0257"+
		"\u0087\u0001\u0000\u0000\u0000\u0258\u0259\u0005X\u0000\u0000\u0259\u025b"+
		"\u0005\u0001\u0000\u0000\u025a\u0258\u0001\u0000\u0000\u0000\u025a\u025b"+
		"\u0001\u0000\u0000\u0000\u025b\u025c\u0001\u0000\u0000\u0000\u025c\u025d"+
		"\u0005X\u0000\u0000\u025d\u025f\u0005\u0004\u0000\u0000\u025e\u0260\u0003"+
		"x<\u0000\u025f\u025e\u0001\u0000\u0000\u0000\u025f\u0260\u0001\u0000\u0000"+
		"\u0000\u0260\u0261\u0001\u0000\u0000\u0000\u0261\u0262\u0005\u0005\u0000"+
		"\u0000\u0262\u0089\u0001\u0000\u0000\u0000\u0263\u0264\u0005X\u0000\u0000"+
		"\u0264\u008b\u0001\u0000\u0000\u0000\u0265\u026c\u0003F#\u0000\u0266\u0268"+
		"\u0005\u0004\u0000\u0000\u0267\u0269\u0003v;\u0000\u0268\u0267\u0001\u0000"+
		"\u0000\u0000\u0268\u0269\u0001\u0000\u0000\u0000\u0269\u026a\u0001\u0000"+
		"\u0000\u0000\u026a\u026c\u0005\u0005\u0000\u0000\u026b\u0265\u0001\u0000"+
		"\u0000\u0000\u026b\u0266\u0001\u0000\u0000\u0000\u026c\u008d\u0001\u0000"+
		"\u0000\u0000\u026d\u0270\u0003\u0090H\u0000\u026e\u0270\u0003\u0092I\u0000"+
		"\u026f\u026d\u0001\u0000\u0000\u0000\u026f\u026e\u0001\u0000\u0000\u0000"+
		"\u0270\u0271\u0001\u0000\u0000\u0000\u0271\u0272\u00057\u0000\u0000\u0272"+
		"\u008f\u0001\u0000\u0000\u0000\u0273\u0274\u0005\u0003\u0000\u0000\u0274"+
		"\u0276\u0003p8\u0000\u0275\u0273\u0001\u0000\u0000\u0000\u0275\u0276\u0001"+
		"\u0000\u0000\u0000\u0276\u0091\u0001\u0000\u0000\u0000\u0277\u0278\u0005"+
		"\u0003\u0000\u0000\u0278\u0279\u0003T*\u0000\u0279\u0093\u0001\u0000\u0000"+
		"\u0000\u027a\u027e\u0003\u00a0P\u0000\u027b\u027c\u0005@\u0000\u0000\u027c"+
		"\u027e\u0003\u009eO\u0000\u027d\u027a\u0001\u0000\u0000\u0000\u027d\u027b"+
		"\u0001\u0000\u0000\u0000\u027e\u0095\u0001\u0000\u0000\u0000\u027f\u0280"+
		"\u0003\u008cF\u0000\u0280\u0281\u0003\u008eG\u0000\u0281\u0282\u0003\f"+
		"\u0006\u0000\u0282\u0283\u0005!\u0000\u0000\u0283\u0097\u0001\u0000\u0000"+
		"\u0000\u0284\u0287\u0005#\u0000\u0000\u0285\u0288\u0003z=\u0000\u0286"+
		"\u0288\u0003\u0094J\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0287\u0286"+
		"\u0001\u0000\u0000\u0000\u0288\u0099\u0001\u0000\u0000\u0000\u0289\u028c"+
		"\u0005$\u0000\u0000\u028a\u028d\u0003z=\u0000\u028b\u028d\u0003\u0094"+
		"J\u0000\u028c\u028a\u0001\u0000\u0000\u0000\u028c\u028b\u0001\u0000\u0000"+
		"\u0000\u028d\u009b\u0001\u0000\u0000\u0000\u028e\u0291\u0005%\u0000\u0000"+
		"\u028f\u0292\u0003z=\u0000\u0290\u0292\u0003\u0094J\u0000\u0291\u028f"+
		"\u0001\u0000\u0000\u0000\u0291\u0290\u0001\u0000\u0000\u0000\u0292\u009d"+
		"\u0001\u0000\u0000\u0000\u0293\u0299\u0003\u00a0P\u0000\u0294\u0299\u0003"+
		"\u0098L\u0000\u0295\u0299\u0003\u009aM\u0000\u0296\u0299\u0003\u009cN"+
		"\u0000\u0297\u0299\u0003\u0096K\u0000\u0298\u0293\u0001\u0000\u0000\u0000"+
		"\u0298\u0294\u0001\u0000\u0000\u0000\u0298\u0295\u0001\u0000\u0000\u0000"+
		"\u0298\u0296\u0001\u0000\u0000\u0000\u0298\u0297\u0001\u0000\u0000\u0000"+
		"\u0299\u009f\u0001\u0000\u0000\u0000\u029a\u029d\u0005\u0016\u0000\u0000"+
		"\u029b\u029e\u0003F#\u0000\u029c\u029e\u0003\u008cF\u0000\u029d\u029b"+
		"\u0001\u0000\u0000\u0000\u029d\u029c\u0001\u0000\u0000\u0000\u029e\u029f"+
		"\u0001\u0000\u0000\u0000\u029f\u02a2\u0005\"\u0000\u0000\u02a0\u02a3\u0003"+
		"\u0010\b\u0000\u02a1\u02a3\u0003z=\u0000\u02a2\u02a0\u0001\u0000\u0000"+
		"\u0000\u02a2\u02a1\u0001\u0000\u0000\u0000\u02a3\u00a1\u0001\u0000\u0000"+
		"\u0000\u02a4\u02a9\u00051\u0000\u0000\u02a5\u02a9\u00052\u0000\u0000\u02a6"+
		"\u02a9\u00053\u0000\u0000\u02a7\u02a9\u00054\u0000\u0000\u02a8\u02a4\u0001"+
		"\u0000\u0000\u0000\u02a8\u02a5\u0001\u0000\u0000\u0000\u02a8\u02a6\u0001"+
		"\u0000\u0000\u0000\u02a8\u02a7\u0001\u0000\u0000\u0000\u02a9\u00a3\u0001"+
		"\u0000\u0000\u0000\u02aa\u02ab\u0007\u0006\u0000\u0000\u02ab\u00a5\u0001"+
		"\u0000\u0000\u0000\u02ac\u02ad\u0007\u0007\u0000\u0000\u02ad\u00a7\u0001"+
		"\u0000\u0000\u0000\u02ae\u02af\u0007\b\u0000\u0000\u02af\u00a9\u0001\u0000"+
		"\u0000\u0000\u02b0\u02b1\u0007\t\u0000\u0000\u02b1\u00ab\u0001\u0000\u0000"+
		"\u0000\u02b2\u02b3\u0007\n\u0000\u0000\u02b3\u00ad\u0001\u0000\u0000\u0000"+
		"5\u00af\u00b7\u00c5\u00cc\u00d3\u00d9\u00ef\u011d\u0122\u012c\u0133\u013d"+
		"\u0150\u0159\u015f\u0164\u0168\u016f\u0177\u0188\u0191\u01a5\u01aa\u01b0"+
		"\u01b4\u01b8\u01bf\u01cc\u01cf\u01d3\u01eb\u01f3\u01ff\u0212\u023d\u0241"+
		"\u0243\u0245\u024c\u025a\u025f\u0268\u026b\u026f\u0275\u027d\u0287\u028c"+
		"\u0291\u0298\u029d\u02a2\u02a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}