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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, OP_And=26, OP_Or=27, OP_Not=28, KW_Type=29, KW_Enum=30, KW_Is=31, 
		KW_Repeat=32, KW_Until=33, KW_As=34, KW_Define=35, TW_Actionable=36, TW_Procedure=37, 
		TW_Macro=38, KW_Return=39, OP_LambdaReturn=40, OP_FunctRef=41, OP_FunctCopy=42, 
		OP_FunctCat=43, OP_LeftFold=44, OP_RightFold=45, OP_Less=46, OP_Greater=47, 
		OP_LessEqual=48, OP_GreaterEqual=49, OP_NotSimilar=50, OP_NotEqual=51, 
		OP_Similar=52, OP_Equal=53, OP_Tilda=54, OP_BIT_LSHIFT=55, OP_BIT_RSHIFT=56, 
		OP_BIT_OR=57, OP_BIT_AND=58, OP_Length=59, OP_Power=60, OP_Assign=61, 
		OP_RightBracket=62, OP_LeftBracket=63, OP_RightCurly=64, OP_LeftCurly=65, 
		OP_Pass=66, KW_If=67, KW_Then=68, KW_Else=69, KW_While=70, KW_Break=71, 
		KW_Funct=72, KW_Forget=73, KW_For=74, KW_Done=75, KW_Do=76, KW_In=77, 
		KW_Every=78, KW_Reverse=79, KW_Continue=80, KW_Yield=81, KW_Catch=82, 
		KW_Try=83, KW_Demand=84, KW_Module=85, KW_End=86, KW_Imports=87, KW_TypeOf=88, 
		KW_InstanceOf=89, KW_Nil=90, KW_True=91, KW_False=92, KW_VAR=93, KW_VAL=94, 
		KW_ALL=95, NAME=96, NORMALSTRING=97, CHARSTRING=98, LONGSTRING=99, MACROSTRING=100, 
		INT=101, HEX=102, FLOAT=103, HEX_FLOAT=104, BlockComment=105, LineComment=106, 
		WS=107, SHEBANG=108, OP_IncrAssign=109, OP_DecrAssign=110, OP_MultSelfAssign=111, 
		OP_CatSelfAssign=112, OP_AddAssign=113, OP_SubAssign=114, OP_MultAssign=115, 
		OP_ModAssign=116, OP_DivAssign=117, OP_IntDivAssign=118, OP_CatAssign=119, 
		OP_STRCAT=120, OP_Add=121, OP_Sub=122, OP_Mult=123, OP_Div=124, OP_Mod=125, 
		OP_IntDiv=126;
	public static final int
		RULE_chunk = 0, RULE_module = 1, RULE_module_start = 2, RULE_module_name = 3, 
		RULE_module_import = 4, RULE_module_list = 5, RULE_block = 6, RULE_operator_logical = 7, 
		RULE_stat = 8, RULE_type_def = 9, RULE_type_select = 10, RULE_type_member = 11, 
		RULE_enum_def = 12, RULE_var_or_array_access = 13, RULE_group_assignment = 14, 
		RULE_functiondef_stat = 15, RULE_macrodef_stat = 16, RULE_do_done_block = 17, 
		RULE_in_place_op_stat = 18, RULE_self_in_place_op_stat = 19, RULE_if_then_else_block = 20, 
		RULE_then_block = 21, RULE_else_block = 22, RULE_forget = 23, RULE_flat_name_list = 24, 
		RULE_loop = 25, RULE_for_loop = 26, RULE_reverse_for_loop = 27, RULE_for_each_loop = 28, 
		RULE_while_do_loop = 29, RULE_repeat_until_loop = 30, RULE_laststat = 31, 
		RULE_function_yield = 32, RULE_funcname = 33, RULE_varlist = 34, RULE_try_catch = 35, 
		RULE_demand = 36, RULE_var_decl = 37, RULE_constant_qualifier = 38, RULE_var_header = 39, 
		RULE_short_var_decl = 40, RULE_by_type_var_decl = 41, RULE_by_value_var_decl = 42, 
		RULE_full_var_decl = 43, RULE_type_decl = 44, RULE_valuable_type = 45, 
		RULE_action_kind = 46, RULE_action_type = 47, RULE_enumeration_initializer = 48, 
		RULE_list_initializer = 49, RULE_number_type = 50, RULE_int_type = 51, 
		RULE_float_type = 52, RULE_generic_type_list = 53, RULE_list_type = 54, 
		RULE_list_length_decl = 55, RULE_set_type = 56, RULE_map_type = 57, RULE_array_type = 58, 
		RULE_string_type = 59, RULE_functional_type = 60, RULE_nil_type = 61, 
		RULE_var_decl_list = 62, RULE_enum_list = 63, RULE_explist = 64, RULE_enum_case = 65, 
		RULE_exp = 66, RULE_match_branch = 67, RULE_match_branch_qualifier = 68, 
		RULE_match_case = 69, RULE_atom = 70, RULE_explicit_nil = 71, RULE_explicit_bool = 72, 
		RULE_number = 73, RULE_string = 74, RULE_macro = 75, RULE_functioncall = 76, 
		RULE_var = 77, RULE_func_parameters = 78, RULE_func_output = 79, RULE_valuable_output = 80, 
		RULE_default_output = 81, RULE_functiondef = 82, RULE_funcbody = 83, RULE_func_ref = 84, 
		RULE_func_copy = 85, RULE_func_concat = 86, RULE_func_any = 87, RULE_lambda_decl = 88, 
		RULE_operatorBitwise = 89, RULE_operatorUnary = 90, RULE_operatorComparison = 91, 
		RULE_operator_math = 92, RULE_in_place_op = 93, RULE_self_in_place_op = 94;
	private static String[] makeRuleNames() {
		return new String[] {
			"chunk", "module", "module_start", "module_name", "module_import", "module_list", 
			"block", "operator_logical", "stat", "type_def", "type_select", "type_member", 
			"enum_def", "var_or_array_access", "group_assignment", "functiondef_stat", 
			"macrodef_stat", "do_done_block", "in_place_op_stat", "self_in_place_op_stat", 
			"if_then_else_block", "then_block", "else_block", "forget", "flat_name_list", 
			"loop", "for_loop", "reverse_for_loop", "for_each_loop", "while_do_loop", 
			"repeat_until_loop", "laststat", "function_yield", "funcname", "varlist", 
			"try_catch", "demand", "var_decl", "constant_qualifier", "var_header", 
			"short_var_decl", "by_type_var_decl", "by_value_var_decl", "full_var_decl", 
			"type_decl", "valuable_type", "action_kind", "action_type", "enumeration_initializer", 
			"list_initializer", "number_type", "int_type", "float_type", "generic_type_list", 
			"list_type", "list_length_decl", "set_type", "map_type", "array_type", 
			"string_type", "functional_type", "nil_type", "var_decl_list", "enum_list", 
			"explist", "enum_case", "exp", "match_branch", "match_branch_qualifier", 
			"match_case", "atom", "explicit_nil", "explicit_bool", "number", "string", 
			"macro", "functioncall", "var", "func_parameters", "func_output", "valuable_output", 
			"default_output", "functiondef", "funcbody", "func_ref", "func_copy", 
			"func_concat", "func_any", "lambda_decl", "operatorBitwise", "operatorUnary", 
			"operatorComparison", "operator_math", "in_place_op", "self_in_place_op"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','", "':'", "'('", "')'", "'Valuable'", "'|=>'", "'Numerable'", 
			"'Int'", "'Float'", "'Listable'", "'Set'", "'Enumeration'", "'Map'", 
			"'Array'", "'String'", "'Functional'", "'Nil'", "'?'", "'@'", "'match'", 
			"'to'", "'matched'", "'final'", "'\\'", null, null, null, "'type'", "'enum'", 
			"'is'", "'repeat'", "'until'", "'as'", "'define'", "'Actionable'", "'Procedure'", 
			"'Macro'", "'return'", "'==>'", "'<=='", "'<=>'", "'<|'", "'<-'", "'->'", 
			"'<'", "'>'", "'<='", "'>='", "'!='", "'!=='", "'=='", "'==='", "'~'", 
			null, "'>>'", "'|'", "'&'", "'#'", "'^'", "'='", "']'", "'['", "'}'", 
			"'{'", "'...'", "'if'", "'then'", "'else'", "'while'", "'break'", "'funct'", 
			"'forget'", "'for'", "'done'", "'do'", "'in'", "'every'", "'reverse'", 
			"'continue'", "'yield'", "'catch'", "'try'", "'demand'", "'module'", 
			"'end'", "'imports'", "'typeof'", "'instanceof'", "'nil'", "'true'", 
			"'false'", "'var'", "'val'", "'all'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'++'", "'--'", "'**'", "'....'", 
			"'+='", "'-='", "'*='", "'%='", "'/='", "'//='", "'..='", "'..'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'//'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "OP_And", "OP_Or", "OP_Not", "KW_Type", "KW_Enum", "KW_Is", 
			"KW_Repeat", "KW_Until", "KW_As", "KW_Define", "TW_Actionable", "TW_Procedure", 
			"TW_Macro", "KW_Return", "OP_LambdaReturn", "OP_FunctRef", "OP_FunctCopy", 
			"OP_FunctCat", "OP_LeftFold", "OP_RightFold", "OP_Less", "OP_Greater", 
			"OP_LessEqual", "OP_GreaterEqual", "OP_NotSimilar", "OP_NotEqual", "OP_Similar", 
			"OP_Equal", "OP_Tilda", "OP_BIT_LSHIFT", "OP_BIT_RSHIFT", "OP_BIT_OR", 
			"OP_BIT_AND", "OP_Length", "OP_Power", "OP_Assign", "OP_RightBracket", 
			"OP_LeftBracket", "OP_RightCurly", "OP_LeftCurly", "OP_Pass", "KW_If", 
			"KW_Then", "KW_Else", "KW_While", "KW_Break", "KW_Funct", "KW_Forget", 
			"KW_For", "KW_Done", "KW_Do", "KW_In", "KW_Every", "KW_Reverse", "KW_Continue", 
			"KW_Yield", "KW_Catch", "KW_Try", "KW_Demand", "KW_Module", "KW_End", 
			"KW_Imports", "KW_TypeOf", "KW_InstanceOf", "KW_Nil", "KW_True", "KW_False", 
			"KW_VAR", "KW_VAL", "KW_ALL", "NAME", "NORMALSTRING", "CHARSTRING", "LONGSTRING", 
			"MACROSTRING", "INT", "HEX", "FLOAT", "HEX_FLOAT", "BlockComment", "LineComment", 
			"WS", "SHEBANG", "OP_IncrAssign", "OP_DecrAssign", "OP_MultSelfAssign", 
			"OP_CatSelfAssign", "OP_AddAssign", "OP_SubAssign", "OP_MultAssign", 
			"OP_ModAssign", "OP_DivAssign", "OP_IntDivAssign", "OP_CatAssign", "OP_STRCAT", 
			"OP_Add", "OP_Sub", "OP_Mult", "OP_Div", "OP_Mod", "OP_IntDiv"
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
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_Module) {
				{
				setState(190);
				module();
				}
			}

			setState(193);
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
			setState(195);
			module_start();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_Imports) {
				{
				{
				setState(196);
				module_import();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			block();
			setState(203);
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
			setState(205);
			match(KW_Module);
			setState(206);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(NAME);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(209);
					match(T__0);
					setState(210);
					match(NAME);
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
			setState(216);
			match(KW_Imports);
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(217);
				match(KW_ALL);
				}
				break;
			case 2:
				{
				setState(218);
				module_name();
				}
				break;
			case 3:
				{
				setState(219);
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
			setState(222);
			module_name();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(223);
				match(T__1);
				setState(224);
				module_name();
				}
				}
				setState(229);
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
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 594475191382310930L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 216173880527408103L) != 0) {
				{
				{
				setState(230);
				stat();
				}
				}
				setState(235);
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
			setState(236);
			_la = _input.LA(1);
			if ( !(_la==OP_And || _la==OP_Or) ) {
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
		public Type_defContext type_def() {
			return getRuleContext(Type_defContext.class,0);
		}
		public Enum_defContext enum_def() {
			return getRuleContext(Enum_defContext.class,0);
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
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				demand();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				group_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				var_decl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				forget();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(242);
				functiondef_stat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(243);
				macrodef_stat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(244);
				functioncall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(245);
				match(KW_Break);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(246);
				do_done_block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(247);
				loop();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(248);
				in_place_op_stat();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(249);
				self_in_place_op_stat();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(250);
				if_then_else_block();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(251);
				try_catch();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(252);
				match(OP_Pass);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(253);
				laststat();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(254);
				type_def();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(255);
				enum_def();
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
	public static class Type_defContext extends ParserRuleContext {
		public TerminalNode KW_Type() { return getToken(NuttParser.KW_Type, 0); }
		public TerminalNode NAME() { return getToken(NuttParser.NAME, 0); }
		public TerminalNode KW_Is() { return getToken(NuttParser.KW_Is, 0); }
		public TerminalNode OP_LeftCurly() { return getToken(NuttParser.OP_LeftCurly, 0); }
		public List<Type_selectContext> type_select() {
			return getRuleContexts(Type_selectContext.class);
		}
		public Type_selectContext type_select(int i) {
			return getRuleContext(Type_selectContext.class,i);
		}
		public TerminalNode OP_RightCurly() { return getToken(NuttParser.OP_RightCurly, 0); }
		public Type_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterType_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitType_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitType_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_defContext type_def() throws RecognitionException {
		Type_defContext _localctx = new Type_defContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(KW_Type);
			setState(259);
			match(NAME);
			setState(260);
			match(KW_Is);
			setState(261);
			match(OP_LeftCurly);
			setState(262);
			type_select();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(263);
				match(T__1);
				setState(264);
				type_select();
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			match(OP_RightCurly);
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
	public static class Type_selectContext extends ParserRuleContext {
		public Type_declContext type_decl() {
			return getRuleContext(Type_declContext.class,0);
		}
		public TerminalNode NAME() { return getToken(NuttParser.NAME, 0); }
		public Type_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterType_select(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitType_select(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitType_select(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_selectContext type_select() throws RecognitionException {
		Type_selectContext _localctx = new Type_selectContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type_select);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__5:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case TW_Actionable:
			case TW_Procedure:
			case TW_Macro:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				type_decl();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(NAME);
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
	public static class Type_memberContext extends ParserRuleContext {
		public Enum_caseContext enum_case() {
			return getRuleContext(Enum_caseContext.class,0);
		}
		public Type_declContext type_decl() {
			return getRuleContext(Type_declContext.class,0);
		}
		public TerminalNode NAME() { return getToken(NuttParser.NAME, 0); }
		public Type_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterType_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitType_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitType_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_memberContext type_member() throws RecognitionException {
		Type_memberContext _localctx = new Type_memberContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type_member);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				enum_case();
				}
				break;
			case T__3:
			case T__5:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case TW_Actionable:
			case TW_Procedure:
			case TW_Macro:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				type_decl();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				match(NAME);
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
	public static class Enum_defContext extends ParserRuleContext {
		public TerminalNode KW_Enum() { return getToken(NuttParser.KW_Enum, 0); }
		public TerminalNode NAME() { return getToken(NuttParser.NAME, 0); }
		public TerminalNode KW_Is() { return getToken(NuttParser.KW_Is, 0); }
		public TerminalNode OP_LeftBracket() { return getToken(NuttParser.OP_LeftBracket, 0); }
		public List<Enum_caseContext> enum_case() {
			return getRuleContexts(Enum_caseContext.class);
		}
		public Enum_caseContext enum_case(int i) {
			return getRuleContext(Enum_caseContext.class,i);
		}
		public TerminalNode OP_RightBracket() { return getToken(NuttParser.OP_RightBracket, 0); }
		public Enum_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterEnum_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitEnum_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitEnum_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_defContext enum_def() throws RecognitionException {
		Enum_defContext _localctx = new Enum_defContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enum_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(KW_Enum);
			setState(282);
			match(NAME);
			setState(283);
			match(KW_Is);
			setState(284);
			match(OP_LeftBracket);
			setState(285);
			enum_case();
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(286);
				match(T__1);
				setState(287);
				enum_case();
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
			match(OP_RightBracket);
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
	public static class Var_or_array_accessContext extends ParserRuleContext {
		public ExpContext arr;
		public ExpContext index;
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode OP_LeftBracket() { return getToken(NuttParser.OP_LeftBracket, 0); }
		public TerminalNode OP_RightBracket() { return getToken(NuttParser.OP_RightBracket, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Var_or_array_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_or_array_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterVar_or_array_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitVar_or_array_access(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitVar_or_array_access(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_or_array_accessContext var_or_array_access() throws RecognitionException {
		Var_or_array_accessContext _localctx = new Var_or_array_accessContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_var_or_array_access);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				((Var_or_array_accessContext)_localctx).arr = exp(0);
				setState(297);
				match(OP_LeftBracket);
				setState(298);
				((Var_or_array_accessContext)_localctx).index = exp(0);
				setState(299);
				match(OP_RightBracket);
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
	public static class Group_assignmentContext extends ParserRuleContext {
		public List<Var_or_array_accessContext> var_or_array_access() {
			return getRuleContexts(Var_or_array_accessContext.class);
		}
		public Var_or_array_accessContext var_or_array_access(int i) {
			return getRuleContext(Var_or_array_accessContext.class,i);
		}
		public TerminalNode OP_Assign() { return getToken(NuttParser.OP_Assign, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
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
		enterRule(_localctx, 28, RULE_group_assignment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			var_or_array_access();
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(304);
				match(T__1);
				setState(305);
				var_or_array_access();
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
			match(OP_Assign);
			setState(312);
			exp(0);
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(313);
					match(T__1);
					setState(314);
					exp(0);
					}
					} 
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 30, RULE_functiondef_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(KW_Funct);
			setState(321);
			funcname();
			setState(322);
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
		enterRule(_localctx, 32, RULE_macrodef_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(KW_Define);
			setState(325);
			macro();
			setState(326);
			match(KW_As);
			setState(327);
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
		enterRule(_localctx, 34, RULE_do_done_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(KW_Do);
			setState(330);
			block();
			setState(331);
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
		enterRule(_localctx, 36, RULE_in_place_op_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			var();
			setState(334);
			in_place_op();
			setState(335);
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
		enterRule(_localctx, 38, RULE_self_in_place_op_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			var();
			setState(338);
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
		enterRule(_localctx, 40, RULE_if_then_else_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(KW_If);
			setState(341);
			exp(0);
			setState(342);
			then_block();
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_Else) {
				{
				setState(343);
				else_block();
				}
			}

			setState(346);
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
		enterRule(_localctx, 42, RULE_then_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_Then) {
				{
				setState(348);
				match(KW_Then);
				}
			}

			setState(351);
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
		enterRule(_localctx, 44, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(KW_Else);
			setState(354);
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
		enterRule(_localctx, 46, RULE_forget);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(KW_Forget);
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ALL:
				{
				setState(357);
				match(KW_ALL);
				}
				break;
			case NAME:
				{
				setState(358);
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
		enterRule(_localctx, 48, RULE_flat_name_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(NAME);
			setState(366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(362);
					match(T__1);
					setState(363);
					match(NAME);
					}
					} 
				}
				setState(368);
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
		enterRule(_localctx, 50, RULE_loop);
		try {
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				for_loop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				reverse_for_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
				for_each_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(372);
				while_do_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(373);
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
		enterRule(_localctx, 52, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(KW_For);
			setState(377);
			var_header();
			setState(378);
			by_value_var_decl();
			setState(379);
			match(T__1);
			setState(380);
			((For_loopContext)_localctx).counterBound = exp(0);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(381);
				match(T__1);
				setState(382);
				((For_loopContext)_localctx).step = exp(0);
				}
			}

			setState(385);
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
		enterRule(_localctx, 54, RULE_reverse_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(KW_Reverse);
			setState(388);
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
		enterRule(_localctx, 56, RULE_for_each_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(KW_For);
			setState(391);
			match(KW_Every);
			setState(392);
			var_decl();
			setState(393);
			match(KW_In);
			setState(394);
			explist();
			setState(395);
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
		enterRule(_localctx, 58, RULE_while_do_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(KW_While);
			setState(398);
			explist();
			setState(399);
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
		enterRule(_localctx, 60, RULE_repeat_until_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(KW_Repeat);
			setState(402);
			block();
			setState(403);
			match(KW_Until);
			setState(404);
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
		enterRule(_localctx, 62, RULE_laststat);
		try {
			setState(409);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_Yield:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				function_yield();
				}
				break;
			case KW_Break:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				match(KW_Break);
				}
				break;
			case KW_Continue:
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
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
		enterRule(_localctx, 64, RULE_function_yield);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(KW_Yield);
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(412);
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
		enterRule(_localctx, 66, RULE_funcname);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(NAME);
			setState(420);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(416);
					match(T__0);
					setState(417);
					match(NAME);
					}
					} 
				}
				setState(422);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 68, RULE_varlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			var();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(424);
				match(T__1);
				setState(425);
				var();
				}
				}
				setState(430);
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
		enterRule(_localctx, 70, RULE_try_catch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(KW_Try);
			setState(432);
			((Try_catchContext)_localctx).try_branch = block();
			setState(433);
			match(KW_Catch);
			setState(434);
			((Try_catchContext)_localctx).catch_branch = block();
			setState(435);
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
		enterRule(_localctx, 72, RULE_demand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(KW_Demand);
			setState(438);
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
		enterRule(_localctx, 74, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			var_header();
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(441);
				short_var_decl();
				}
				break;
			case 2:
				{
				setState(442);
				by_type_var_decl();
				}
				break;
			case 3:
				{
				setState(443);
				by_value_var_decl();
				}
				break;
			case 4:
				{
				setState(444);
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
		enterRule(_localctx, 76, RULE_constant_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
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
		enterRule(_localctx, 78, RULE_var_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			constant_qualifier();
			setState(450);
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
		enterRule(_localctx, 80, RULE_short_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(452);
				match(OP_Assign);
				setState(453);
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
		enterRule(_localctx, 82, RULE_by_type_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(T__2);
			setState(457);
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
		enterRule(_localctx, 84, RULE_by_value_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(OP_Assign);
			setState(460);
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
		enterRule(_localctx, 86, RULE_full_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(T__2);
			setState(463);
			((Full_var_declContext)_localctx).type = type_decl();
			setState(464);
			match(OP_Assign);
			setState(465);
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
		public Valuable_typeContext valuable_type() {
			return getRuleContext(Valuable_typeContext.class,0);
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
		enterRule(_localctx, 88, RULE_type_decl);
		try {
			setState(479);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				valuable_type();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				functional_type();
				}
				break;
			case T__3:
			case TW_Actionable:
			case TW_Procedure:
			case TW_Macro:
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TW_Actionable:
				case TW_Procedure:
				case TW_Macro:
					{
					setState(469);
					action_type();
					}
					break;
				case T__3:
					{
					setState(470);
					match(T__3);
					setState(471);
					action_type();
					setState(472);
					match(T__4);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__7:
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(476);
				number_type();
				}
				break;
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(477);
				list_type();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 6);
				{
				setState(478);
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
	public static class Valuable_typeContext extends ParserRuleContext {
		public Valuable_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuable_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterValuable_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitValuable_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitValuable_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valuable_typeContext valuable_type() throws RecognitionException {
		Valuable_typeContext _localctx = new Valuable_typeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_valuable_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(T__5);
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
		enterRule(_localctx, 92, RULE_action_kind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 481036337152L) != 0) ) {
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
		enterRule(_localctx, 94, RULE_action_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			action_kind();
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(486);
				func_parameters();
				}
				break;
			}
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(489);
				match(T__6);
				setState(490);
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
	public static class Enumeration_initializerContext extends ParserRuleContext {
		public TerminalNode OP_LeftCurly() { return getToken(NuttParser.OP_LeftCurly, 0); }
		public Enum_listContext enum_list() {
			return getRuleContext(Enum_listContext.class,0);
		}
		public TerminalNode OP_RightCurly() { return getToken(NuttParser.OP_RightCurly, 0); }
		public Enumeration_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeration_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterEnumeration_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitEnumeration_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitEnumeration_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enumeration_initializerContext enumeration_initializer() throws RecognitionException {
		Enumeration_initializerContext _localctx = new Enumeration_initializerContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_enumeration_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(OP_LeftCurly);
			setState(494);
			enum_list();
			setState(495);
			match(OP_RightCurly);
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
		public TerminalNode OP_LeftCurly() { return getToken(NuttParser.OP_LeftCurly, 0); }
		public TerminalNode OP_RightCurly() { return getToken(NuttParser.OP_RightCurly, 0); }
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
		enterRule(_localctx, 98, RULE_list_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(OP_LeftCurly);
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 594475151116992530L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 216173879721197697L) != 0) {
				{
				setState(498);
				explist();
				}
			}

			setState(501);
			match(OP_RightCurly);
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
		enterRule(_localctx, 100, RULE_number_type);
		try {
			setState(506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				int_type();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(505);
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
		enterRule(_localctx, 102, RULE_int_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(T__8);
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
		enterRule(_localctx, 104, RULE_float_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
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
		enterRule(_localctx, 106, RULE_generic_type_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
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
		enterRule(_localctx, 108, RULE_list_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				{
				setState(514);
				generic_type_list();
				}
				break;
			case T__11:
			case T__12:
				{
				setState(515);
				set_type();
				}
				break;
			case T__13:
				{
				setState(516);
				map_type();
				}
				break;
			case T__15:
				{
				setState(517);
				string_type();
				}
				break;
			case T__14:
				{
				setState(518);
				array_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_Length) {
					{
					setState(521);
					list_length_decl();
					}
				}

				setState(524);
				match(OP_BIT_OR);
				setState(525);
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
		enterRule(_localctx, 110, RULE_list_length_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(OP_Length);
			setState(529);
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
		enterRule(_localctx, 112, RULE_set_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
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
		enterRule(_localctx, 114, RULE_map_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
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
		enterRule(_localctx, 116, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
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
		enterRule(_localctx, 118, RULE_string_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
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
		enterRule(_localctx, 120, RULE_functional_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
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
		enterRule(_localctx, 122, RULE_nil_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
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
		enterRule(_localctx, 124, RULE_var_decl_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			var_decl();
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(544);
				match(T__1);
				setState(545);
				var_decl();
				}
				}
				setState(550);
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
	public static class Enum_listContext extends ParserRuleContext {
		public List<Enum_caseContext> enum_case() {
			return getRuleContexts(Enum_caseContext.class);
		}
		public Enum_caseContext enum_case(int i) {
			return getRuleContext(Enum_caseContext.class,i);
		}
		public Enum_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterEnum_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitEnum_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitEnum_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_listContext enum_list() throws RecognitionException {
		Enum_listContext _localctx = new Enum_listContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_enum_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			enum_case();
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(552);
				match(T__1);
				setState(553);
				enum_case();
				}
				}
				setState(558);
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
		enterRule(_localctx, 128, RULE_explist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			exp(0);
			setState(564);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(560);
					match(T__1);
					setState(561);
					exp(0);
					}
					} 
				}
				setState(566);
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
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Enum_caseContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(NuttParser.NAME, 0); }
		public Enum_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterEnum_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitEnum_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitEnum_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_caseContext enum_case() throws RecognitionException {
		Enum_caseContext _localctx = new Enum_caseContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_enum_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(T__0);
			setState(568);
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
	public static class Instance_of_expContext extends ExpContext {
		public ExpContext to_check;
		public ExpContext type_exp;
		public TerminalNode KW_InstanceOf() { return getToken(NuttParser.KW_InstanceOf, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Type_declContext type_decl() {
			return getRuleContext(Type_declContext.class,0);
		}
		public Instance_of_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterInstance_of_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitInstance_of_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitInstance_of_exp(this);
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
	public static class Explicit_enum_caseContext extends ExpContext {
		public Enum_caseContext enum_case() {
			return getRuleContext(Enum_caseContext.class,0);
		}
		public Explicit_enum_caseContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterExplicit_enum_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitExplicit_enum_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitExplicit_enum_case(this);
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
	public static class Explicit_enumerationContext extends ExpContext {
		public Enumeration_initializerContext enumeration_initializer() {
			return getRuleContext(Enumeration_initializerContext.class,0);
		}
		public Explicit_enumerationContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterExplicit_enumeration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitExplicit_enumeration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitExplicit_enumeration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Match_to_expContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<Match_branchContext> match_branch() {
			return getRuleContexts(Match_branchContext.class);
		}
		public Match_branchContext match_branch(int i) {
			return getRuleContext(Match_branchContext.class,i);
		}
		public Match_to_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterMatch_to_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitMatch_to_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitMatch_to_exp(this);
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
		int _startState = 132;
		enterRecursionRule(_localctx, 132, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				_localctx = new Explicit_variableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(571);
				var();
				}
				break;
			case 2:
				{
				_localctx = new Explicit_atomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(572);
				atom();
				}
				break;
			case 3:
				{
				_localctx = new Explicit_macroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(573);
				macro();
				}
				break;
			case 4:
				{
				_localctx = new Explicit_enum_caseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(574);
				enum_case();
				}
				break;
			case 5:
				{
				_localctx = new Explicit_enumerationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(575);
				enumeration_initializer();
				}
				break;
			case 6:
				{
				_localctx = new Explicit_arrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(576);
				list_initializer();
				}
				break;
			case 7:
				{
				_localctx = new Function_definition_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(577);
				functiondef();
				}
				break;
			case 8:
				{
				_localctx = new Func_call_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(578);
				funcname();
				setState(579);
				match(T__3);
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 594475151116992530L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 216173879721197697L) != 0) {
					{
					setState(580);
					((Func_call_expContext)_localctx).arguments = explist();
					}
				}

				setState(583);
				match(T__4);
				}
				break;
			case 9:
				{
				_localctx = new Unary_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(585);
				operatorUnary();
				setState(586);
				exp(16);
				}
				break;
			case 10:
				{
				_localctx = new Parenthesis_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(588);
				match(T__3);
				setState(589);
				exp(0);
				setState(590);
				match(T__4);
				}
				break;
			case 11:
				{
				_localctx = new Type_of_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(592);
				match(KW_TypeOf);
				setState(593);
				exp(6);
				}
				break;
			case 12:
				{
				_localctx = new Func_cat_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(594);
				funcname();
				setState(595);
				match(OP_FunctCat);
				setState(596);
				funcname();
				}
				break;
			case 13:
				{
				_localctx = new Match_to_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(598);
				match(T__20);
				setState(599);
				exp(0);
				setState(600);
				match(T__21);
				setState(601);
				match_branch();
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(602);
					match(T__1);
					setState(603);
					match_branch();
					}
					}
					setState(608);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(609);
				match(T__22);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(668);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(666);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						_localctx = new Bitwise_expContext(new ExpContext(_parentctx, _parentState));
						((Bitwise_expContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(613);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(614);
						operatorBitwise();
						setState(615);
						((Bitwise_expContext)_localctx).right = exp(18);
						}
						break;
					case 2:
						{
						_localctx = new Math_expContext(new ExpContext(_parentctx, _parentState));
						((Math_expContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(617);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(618);
						operator_math();
						setState(619);
						((Math_expContext)_localctx).right = exp(16);
						}
						break;
					case 3:
						{
						_localctx = new Comparison_expressionContext(new ExpContext(_parentctx, _parentState));
						((Comparison_expressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(621);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(622);
						operatorComparison();
						setState(623);
						((Comparison_expressionContext)_localctx).right = exp(15);
						}
						break;
					case 4:
						{
						_localctx = new Logical_expContext(new ExpContext(_parentctx, _parentState));
						((Logical_expContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(625);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(626);
						operator_logical();
						setState(627);
						((Logical_expContext)_localctx).right = exp(14);
						}
						break;
					case 5:
						{
						_localctx = new Str_cat_expressionContext(new ExpContext(_parentctx, _parentState));
						((Str_cat_expressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(629);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(630);
						((Str_cat_expressionContext)_localctx).op = match(OP_STRCAT);
						setState(631);
						((Str_cat_expressionContext)_localctx).right = exp(11);
						}
						break;
					case 6:
						{
						_localctx = new Fold_left_expressionContext(new ExpContext(_parentctx, _parentState));
						((Fold_left_expressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(632);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(633);
						match(OP_LeftFold);
						setState(634);
						((Fold_left_expressionContext)_localctx).right = exp(11);
						}
						break;
					case 7:
						{
						_localctx = new Fold_right_expressionContext(new ExpContext(_parentctx, _parentState));
						((Fold_right_expressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(635);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(636);
						match(OP_RightFold);
						setState(637);
						((Fold_right_expressionContext)_localctx).right = exp(10);
						}
						break;
					case 8:
						{
						_localctx = new Power_expressionContext(new ExpContext(_parentctx, _parentState));
						((Power_expressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(638);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(639);
						match(OP_Power);
						setState(640);
						((Power_expressionContext)_localctx).right = exp(8);
						}
						break;
					case 9:
						{
						_localctx = new Array_accessContext(new ExpContext(_parentctx, _parentState));
						((Array_accessContext)_localctx).arr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(641);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(642);
						match(OP_LeftBracket);
						setState(643);
						((Array_accessContext)_localctx).index = exp(0);
						setState(644);
						match(OP_RightBracket);
						}
						break;
					case 10:
						{
						_localctx = new Instance_of_expContext(new ExpContext(_parentctx, _parentState));
						((Instance_of_expContext)_localctx).to_check = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(646);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(647);
						match(KW_InstanceOf);
						setState(650);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
						case 1:
							{
							setState(648);
							type_decl();
							}
							break;
						case 2:
							{
							setState(649);
							((Instance_of_expContext)_localctx).type_exp = exp(0);
							}
							break;
						}
						}
						break;
					case 11:
						{
						_localctx = new Type_castContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(652);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(653);
						match(KW_As);
						setState(654);
						type_decl();
						}
						break;
					case 12:
						{
						_localctx = new Quarternary_expContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(655);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(656);
						match(T__18);
						setState(657);
						((Quarternary_expContext)_localctx).if_true = exp(0);
						setState(660);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
						case 1:
							{
							setState(658);
							match(T__19);
							setState(659);
							((Quarternary_expContext)_localctx).if_false = exp(0);
							}
							break;
						}
						setState(664);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
						case 1:
							{
							setState(662);
							match(T__19);
							setState(663);
							((Quarternary_expContext)_localctx).if_undefined = exp(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(670);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
	public static class Match_branchContext extends ParserRuleContext {
		public List<Match_caseContext> match_case() {
			return getRuleContexts(Match_caseContext.class);
		}
		public Match_caseContext match_case(int i) {
			return getRuleContext(Match_caseContext.class,i);
		}
		public TerminalNode OP_RightFold() { return getToken(NuttParser.OP_RightFold, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Match_branch_qualifierContext match_branch_qualifier() {
			return getRuleContext(Match_branch_qualifierContext.class,0);
		}
		public Match_branchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_branch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterMatch_branch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitMatch_branch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitMatch_branch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Match_branchContext match_branch() throws RecognitionException {
		Match_branchContext _localctx = new Match_branchContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_match_branch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(671);
				match_branch_qualifier();
				}
			}

			setState(674);
			match_case();
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(675);
				match(T__1);
				setState(676);
				match_case();
				}
			}

			setState(679);
			match(OP_RightFold);
			setState(680);
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
	public static class Match_branch_qualifierContext extends ParserRuleContext {
		public Match_branch_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_branch_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterMatch_branch_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitMatch_branch_qualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitMatch_branch_qualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Match_branch_qualifierContext match_branch_qualifier() throws RecognitionException {
		Match_branch_qualifierContext _localctx = new Match_branch_qualifierContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_match_branch_qualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(T__23);
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
	public static class Match_caseContext extends ParserRuleContext {
		public Enum_caseContext enum_case() {
			return getRuleContext(Enum_caseContext.class,0);
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Match_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterMatch_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitMatch_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitMatch_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Match_caseContext match_case() throws RecognitionException {
		Match_caseContext _localctx = new Match_caseContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_match_case);
		try {
			setState(689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(684);
				enum_case();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(685);
				explicit_bool();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(686);
				number();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(687);
				string();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(688);
				exp(0);
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
		enterRule(_localctx, 140, RULE_atom);
		try {
			setState(695);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_Nil:
				enterOuterAlt(_localctx, 1);
				{
				setState(691);
				explicit_nil();
				}
				break;
			case KW_True:
			case KW_False:
				enterOuterAlt(_localctx, 2);
				{
				setState(692);
				explicit_bool();
				}
				break;
			case INT:
			case HEX:
			case FLOAT:
			case HEX_FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(693);
				number();
				}
				break;
			case NORMALSTRING:
			case CHARSTRING:
			case LONGSTRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(694);
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
		enterRule(_localctx, 142, RULE_explicit_nil);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
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
		enterRule(_localctx, 144, RULE_explicit_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
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
		enterRule(_localctx, 146, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
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
		enterRule(_localctx, 148, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			_la = _input.LA(1);
			if ( !((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 7L) != 0) ) {
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
		enterRule(_localctx, 150, RULE_macro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
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
		enterRule(_localctx, 152, RULE_functioncall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(707);
				match(NAME);
				setState(708);
				match(T__0);
				}
				break;
			}
			setState(711);
			match(NAME);
			setState(712);
			match(T__3);
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 594475151116992530L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 216173879721197697L) != 0) {
				{
				setState(713);
				explist();
				}
			}

			setState(716);
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
		enterRule(_localctx, 154, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
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
		enterRule(_localctx, 156, RULE_func_parameters);
		int _la;
		try {
			setState(726);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_VAR:
			case KW_VAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				var_decl();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(721);
				match(T__3);
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_VAR || _la==KW_VAL) {
					{
					setState(722);
					var_decl_list();
					}
				}

				setState(725);
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
		public Valuable_outputContext valuable_output() {
			return getRuleContext(Valuable_outputContext.class,0);
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
		enterRule(_localctx, 158, RULE_func_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(728);
				valuable_output();
				}
				break;
			case 2:
				{
				setState(729);
				default_output();
				}
				break;
			}
			setState(732);
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
	public static class Valuable_outputContext extends ParserRuleContext {
		public Valuable_typeContext valuable_type() {
			return getRuleContext(Valuable_typeContext.class,0);
		}
		public Valuable_outputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuable_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).enterValuable_output(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuttListener ) ((NuttListener)listener).exitValuable_output(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitValuable_output(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valuable_outputContext valuable_output() throws RecognitionException {
		Valuable_outputContext _localctx = new Valuable_outputContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_valuable_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(734);
				match(T__2);
				setState(735);
				valuable_type();
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
		enterRule(_localctx, 162, RULE_default_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			match(T__2);
			{
			setState(739);
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
		enterRule(_localctx, 164, RULE_functiondef);
		try {
			setState(744);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(741);
				lambda_decl();
				}
				break;
			case KW_Funct:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(742);
				match(KW_Funct);
				setState(743);
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
		enterRule(_localctx, 166, RULE_funcbody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			func_parameters();
			setState(747);
			func_output();
			setState(748);
			block();
			setState(749);
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
		enterRule(_localctx, 168, RULE_func_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(OP_FunctRef);
			setState(754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(752);
				exp(0);
				}
				break;
			case 2:
				{
				setState(753);
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
		enterRule(_localctx, 170, RULE_func_copy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(OP_FunctCopy);
			setState(759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(757);
				exp(0);
				}
				break;
			case 2:
				{
				setState(758);
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
		enterRule(_localctx, 172, RULE_func_concat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			match(OP_FunctCat);
			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(762);
				exp(0);
				}
				break;
			case 2:
				{
				setState(763);
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
		enterRule(_localctx, 174, RULE_func_any);
		try {
			setState(771);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				lambda_decl();
				}
				break;
			case OP_FunctRef:
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
				func_ref();
				}
				break;
			case OP_FunctCopy:
				enterOuterAlt(_localctx, 3);
				{
				setState(768);
				func_copy();
				}
				break;
			case OP_FunctCat:
				enterOuterAlt(_localctx, 4);
				{
				setState(769);
				func_concat();
				}
				break;
			case T__3:
			case KW_VAR:
			case KW_VAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(770);
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
		enterRule(_localctx, 176, RULE_lambda_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			match(T__24);
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(774);
				var_decl();
				}
				break;
			case 2:
				{
				setState(775);
				func_parameters();
				}
				break;
			}
			setState(778);
			match(OP_LambdaReturn);
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(779);
				stat();
				}
				break;
			case 2:
				{
				setState(780);
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
		enterRule(_localctx, 178, RULE_operatorBitwise);
		try {
			setState(787);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_BIT_LSHIFT:
				_localctx = new BitShiftLeftContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				match(OP_BIT_LSHIFT);
				}
				break;
			case OP_BIT_RSHIFT:
				_localctx = new BitShiftRightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(784);
				match(OP_BIT_RSHIFT);
				}
				break;
			case OP_BIT_OR:
				_localctx = new BitOrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(785);
				match(OP_BIT_OR);
				}
				break;
			case OP_BIT_AND:
				_localctx = new BitAndContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(786);
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
		enterRule(_localctx, 180, RULE_operatorUnary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 594475151081340928L) != 0 || _la==OP_Add || _la==OP_Sub) ) {
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
		enterRule(_localctx, 182, RULE_operatorComparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 17944029765304320L) != 0) ) {
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
		enterRule(_localctx, 184, RULE_operator_math);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			_la = _input.LA(1);
			if ( !((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & 63L) != 0) ) {
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
		enterRule(_localctx, 186, RULE_in_place_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			_la = _input.LA(1);
			if ( !((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 127L) != 0) ) {
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
		enterRule(_localctx, 188, RULE_self_in_place_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			_la = _input.LA(1);
			if ( !((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & 15L) != 0) ) {
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
		case 66:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 12);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001~\u0320\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0001"+
		"\u0000\u0003\u0000\u00c0\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0005\u0001\u00c6\b\u0001\n\u0001\f\u0001\u00c9\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003\u00d4\b\u0003\n\u0003\f\u0003\u00d7"+
		"\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00dd"+
		"\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00e2\b\u0005"+
		"\n\u0005\f\u0005\u00e5\t\u0005\u0001\u0006\u0005\u0006\u00e8\b\u0006\n"+
		"\u0006\f\u0006\u00eb\t\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0101\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u010a\b\t\n"+
		"\t\f\t\u010d\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0003\n\u0113\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0118\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0121\b\f\n\f\f\f\u0124"+
		"\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u012e\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0133\b\u000e"+
		"\n\u000e\f\u000e\u0136\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u013c\b\u000e\n\u000e\f\u000e\u013f\t\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0159\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0003\u0015\u015e\b"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0168\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u016d\b\u0018\n\u0018\f\u0018\u0170\t\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0177\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u0180\b\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u019a\b\u001f"+
		"\u0001 \u0001 \u0003 \u019e\b \u0001!\u0001!\u0001!\u0005!\u01a3\b!\n"+
		"!\f!\u01a6\t!\u0001\"\u0001\"\u0001\"\u0005\"\u01ab\b\"\n\"\f\"\u01ae"+
		"\t\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0003%\u01be\b%\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0001(\u0001(\u0003(\u01c7\b(\u0001)\u0001)\u0001)\u0001*\u0001"+
		"*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0003,\u01db\b,\u0001,\u0001,\u0001,\u0003,\u01e0"+
		"\b,\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u0003/\u01e8\b/\u0001/\u0001"+
		"/\u0003/\u01ec\b/\u00010\u00010\u00010\u00010\u00011\u00011\u00031\u01f4"+
		"\b1\u00011\u00011\u00012\u00012\u00012\u00032\u01fb\b2\u00013\u00013\u0001"+
		"4\u00014\u00015\u00015\u00016\u00016\u00016\u00016\u00016\u00036\u0208"+
		"\b6\u00016\u00036\u020b\b6\u00016\u00016\u00036\u020f\b6\u00017\u0001"+
		"7\u00017\u00018\u00018\u00019\u00019\u0001:\u0001:\u0001;\u0001;\u0001"+
		"<\u0001<\u0001=\u0001=\u0001>\u0001>\u0001>\u0005>\u0223\b>\n>\f>\u0226"+
		"\t>\u0001?\u0001?\u0001?\u0005?\u022b\b?\n?\f?\u022e\t?\u0001@\u0001@"+
		"\u0001@\u0005@\u0233\b@\n@\f@\u0236\t@\u0001A\u0001A\u0001A\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0003"+
		"B\u0246\bB\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0005B\u025d\bB\nB\fB\u0260\tB\u0001B\u0001B\u0003B\u0264"+
		"\bB\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0003B\u028b\bB\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0003B\u0295\bB\u0001"+
		"B\u0001B\u0003B\u0299\bB\u0005B\u029b\bB\nB\fB\u029e\tB\u0001C\u0003C"+
		"\u02a1\bC\u0001C\u0001C\u0001C\u0003C\u02a6\bC\u0001C\u0001C\u0001C\u0001"+
		"D\u0001D\u0001E\u0001E\u0001E\u0001E\u0001E\u0003E\u02b2\bE\u0001F\u0001"+
		"F\u0001F\u0001F\u0003F\u02b8\bF\u0001G\u0001G\u0001H\u0001H\u0001I\u0001"+
		"I\u0001J\u0001J\u0001K\u0001K\u0001L\u0001L\u0003L\u02c6\bL\u0001L\u0001"+
		"L\u0001L\u0003L\u02cb\bL\u0001L\u0001L\u0001M\u0001M\u0001N\u0001N\u0001"+
		"N\u0003N\u02d4\bN\u0001N\u0003N\u02d7\bN\u0001O\u0001O\u0003O\u02db\b"+
		"O\u0001O\u0001O\u0001P\u0001P\u0003P\u02e1\bP\u0001Q\u0001Q\u0001Q\u0001"+
		"R\u0001R\u0001R\u0003R\u02e9\bR\u0001S\u0001S\u0001S\u0001S\u0001S\u0001"+
		"T\u0001T\u0001T\u0003T\u02f3\bT\u0001U\u0001U\u0001U\u0003U\u02f8\bU\u0001"+
		"V\u0001V\u0001V\u0003V\u02fd\bV\u0001W\u0001W\u0001W\u0001W\u0001W\u0003"+
		"W\u0304\bW\u0001X\u0001X\u0001X\u0003X\u0309\bX\u0001X\u0001X\u0001X\u0003"+
		"X\u030e\bX\u0001Y\u0001Y\u0001Y\u0001Y\u0003Y\u0314\bY\u0001Z\u0001Z\u0001"+
		"[\u0001[\u0001\\\u0001\\\u0001]\u0001]\u0001^\u0001^\u0001^\u0000\u0001"+
		"\u0084_\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u0000\f\u0001\u0000\u001a\u001b\u0001"+
		"\u0000]^\u0001\u0000$&\u0001\u0000\f\r\u0001\u0000[\\\u0001\u0000eh\u0001"+
		"\u0000ac\u0004\u0000\u001c\u001c66;;yz\u0001\u0000.5\u0001\u0000y~\u0001"+
		"\u0000qw\u0001\u0000mp\u033f\u0000\u00bf\u0001\u0000\u0000\u0000\u0002"+
		"\u00c3\u0001\u0000\u0000\u0000\u0004\u00cd\u0001\u0000\u0000\u0000\u0006"+
		"\u00d0\u0001\u0000\u0000\u0000\b\u00d8\u0001\u0000\u0000\u0000\n\u00de"+
		"\u0001\u0000\u0000\u0000\f\u00e9\u0001\u0000\u0000\u0000\u000e\u00ec\u0001"+
		"\u0000\u0000\u0000\u0010\u0100\u0001\u0000\u0000\u0000\u0012\u0102\u0001"+
		"\u0000\u0000\u0000\u0014\u0112\u0001\u0000\u0000\u0000\u0016\u0117\u0001"+
		"\u0000\u0000\u0000\u0018\u0119\u0001\u0000\u0000\u0000\u001a\u012d\u0001"+
		"\u0000\u0000\u0000\u001c\u012f\u0001\u0000\u0000\u0000\u001e\u0140\u0001"+
		"\u0000\u0000\u0000 \u0144\u0001\u0000\u0000\u0000\"\u0149\u0001\u0000"+
		"\u0000\u0000$\u014d\u0001\u0000\u0000\u0000&\u0151\u0001\u0000\u0000\u0000"+
		"(\u0154\u0001\u0000\u0000\u0000*\u015d\u0001\u0000\u0000\u0000,\u0161"+
		"\u0001\u0000\u0000\u0000.\u0164\u0001\u0000\u0000\u00000\u0169\u0001\u0000"+
		"\u0000\u00002\u0176\u0001\u0000\u0000\u00004\u0178\u0001\u0000\u0000\u0000"+
		"6\u0183\u0001\u0000\u0000\u00008\u0186\u0001\u0000\u0000\u0000:\u018d"+
		"\u0001\u0000\u0000\u0000<\u0191\u0001\u0000\u0000\u0000>\u0199\u0001\u0000"+
		"\u0000\u0000@\u019b\u0001\u0000\u0000\u0000B\u019f\u0001\u0000\u0000\u0000"+
		"D\u01a7\u0001\u0000\u0000\u0000F\u01af\u0001\u0000\u0000\u0000H\u01b5"+
		"\u0001\u0000\u0000\u0000J\u01b8\u0001\u0000\u0000\u0000L\u01bf\u0001\u0000"+
		"\u0000\u0000N\u01c1\u0001\u0000\u0000\u0000P\u01c6\u0001\u0000\u0000\u0000"+
		"R\u01c8\u0001\u0000\u0000\u0000T\u01cb\u0001\u0000\u0000\u0000V\u01ce"+
		"\u0001\u0000\u0000\u0000X\u01df\u0001\u0000\u0000\u0000Z\u01e1\u0001\u0000"+
		"\u0000\u0000\\\u01e3\u0001\u0000\u0000\u0000^\u01e5\u0001\u0000\u0000"+
		"\u0000`\u01ed\u0001\u0000\u0000\u0000b\u01f1\u0001\u0000\u0000\u0000d"+
		"\u01fa\u0001\u0000\u0000\u0000f\u01fc\u0001\u0000\u0000\u0000h\u01fe\u0001"+
		"\u0000\u0000\u0000j\u0200\u0001\u0000\u0000\u0000l\u0207\u0001\u0000\u0000"+
		"\u0000n\u0210\u0001\u0000\u0000\u0000p\u0213\u0001\u0000\u0000\u0000r"+
		"\u0215\u0001\u0000\u0000\u0000t\u0217\u0001\u0000\u0000\u0000v\u0219\u0001"+
		"\u0000\u0000\u0000x\u021b\u0001\u0000\u0000\u0000z\u021d\u0001\u0000\u0000"+
		"\u0000|\u021f\u0001\u0000\u0000\u0000~\u0227\u0001\u0000\u0000\u0000\u0080"+
		"\u022f\u0001\u0000\u0000\u0000\u0082\u0237\u0001\u0000\u0000\u0000\u0084"+
		"\u0263\u0001\u0000\u0000\u0000\u0086\u02a0\u0001\u0000\u0000\u0000\u0088"+
		"\u02aa\u0001\u0000\u0000\u0000\u008a\u02b1\u0001\u0000\u0000\u0000\u008c"+
		"\u02b7\u0001\u0000\u0000\u0000\u008e\u02b9\u0001\u0000\u0000\u0000\u0090"+
		"\u02bb\u0001\u0000\u0000\u0000\u0092\u02bd\u0001\u0000\u0000\u0000\u0094"+
		"\u02bf\u0001\u0000\u0000\u0000\u0096\u02c1\u0001\u0000\u0000\u0000\u0098"+
		"\u02c5\u0001\u0000\u0000\u0000\u009a\u02ce\u0001\u0000\u0000\u0000\u009c"+
		"\u02d6\u0001\u0000\u0000\u0000\u009e\u02da\u0001\u0000\u0000\u0000\u00a0"+
		"\u02e0\u0001\u0000\u0000\u0000\u00a2\u02e2\u0001\u0000\u0000\u0000\u00a4"+
		"\u02e8\u0001\u0000\u0000\u0000\u00a6\u02ea\u0001\u0000\u0000\u0000\u00a8"+
		"\u02ef\u0001\u0000\u0000\u0000\u00aa\u02f4\u0001\u0000\u0000\u0000\u00ac"+
		"\u02f9\u0001\u0000\u0000\u0000\u00ae\u0303\u0001\u0000\u0000\u0000\u00b0"+
		"\u0305\u0001\u0000\u0000\u0000\u00b2\u0313\u0001\u0000\u0000\u0000\u00b4"+
		"\u0315\u0001\u0000\u0000\u0000\u00b6\u0317\u0001\u0000\u0000\u0000\u00b8"+
		"\u0319\u0001\u0000\u0000\u0000\u00ba\u031b\u0001\u0000\u0000\u0000\u00bc"+
		"\u031d\u0001\u0000\u0000\u0000\u00be\u00c0\u0003\u0002\u0001\u0000\u00bf"+
		"\u00be\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\u0000\u0000\u0001\u00c2"+
		"\u0001\u0001\u0000\u0000\u0000\u00c3\u00c7\u0003\u0004\u0002\u0000\u00c4"+
		"\u00c6\u0003\b\u0004\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u00c7"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0003\f\u0006\u0000\u00cb\u00cc\u0005"+
		"V\u0000\u0000\u00cc\u0003\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005U\u0000"+
		"\u0000\u00ce\u00cf\u0003\u0006\u0003\u0000\u00cf\u0005\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d5\u0005`\u0000\u0000\u00d1\u00d2\u0005\u0001\u0000\u0000"+
		"\u00d2\u00d4\u0005`\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d6\u0007\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d8\u00dc\u0005W\u0000\u0000\u00d9\u00dd"+
		"\u0005_\u0000\u0000\u00da\u00dd\u0003\u0006\u0003\u0000\u00db\u00dd\u0003"+
		"\n\u0005\u0000\u00dc\u00d9\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000"+
		"\u0000\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dd\t\u0001\u0000\u0000"+
		"\u0000\u00de\u00e3\u0003\u0006\u0003\u0000\u00df\u00e0\u0005\u0002\u0000"+
		"\u0000\u00e0\u00e2\u0003\u0006\u0003\u0000\u00e1\u00df\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u000b\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e8\u0003\u0010\b\u0000"+
		"\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000\u0000"+
		"\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ea\r\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ed\u0007\u0000\u0000\u0000\u00ed\u000f\u0001\u0000\u0000\u0000\u00ee"+
		"\u0101\u0003H$\u0000\u00ef\u0101\u0003\u001c\u000e\u0000\u00f0\u0101\u0003"+
		"J%\u0000\u00f1\u0101\u0003.\u0017\u0000\u00f2\u0101\u0003\u001e\u000f"+
		"\u0000\u00f3\u0101\u0003 \u0010\u0000\u00f4\u0101\u0003\u0098L\u0000\u00f5"+
		"\u0101\u0005G\u0000\u0000\u00f6\u0101\u0003\"\u0011\u0000\u00f7\u0101"+
		"\u00032\u0019\u0000\u00f8\u0101\u0003$\u0012\u0000\u00f9\u0101\u0003&"+
		"\u0013\u0000\u00fa\u0101\u0003(\u0014\u0000\u00fb\u0101\u0003F#\u0000"+
		"\u00fc\u0101\u0005B\u0000\u0000\u00fd\u0101\u0003>\u001f\u0000\u00fe\u0101"+
		"\u0003\u0012\t\u0000\u00ff\u0101\u0003\u0018\f\u0000\u0100\u00ee\u0001"+
		"\u0000\u0000\u0000\u0100\u00ef\u0001\u0000\u0000\u0000\u0100\u00f0\u0001"+
		"\u0000\u0000\u0000\u0100\u00f1\u0001\u0000\u0000\u0000\u0100\u00f2\u0001"+
		"\u0000\u0000\u0000\u0100\u00f3\u0001\u0000\u0000\u0000\u0100\u00f4\u0001"+
		"\u0000\u0000\u0000\u0100\u00f5\u0001\u0000\u0000\u0000\u0100\u00f6\u0001"+
		"\u0000\u0000\u0000\u0100\u00f7\u0001\u0000\u0000\u0000\u0100\u00f8\u0001"+
		"\u0000\u0000\u0000\u0100\u00f9\u0001\u0000\u0000\u0000\u0100\u00fa\u0001"+
		"\u0000\u0000\u0000\u0100\u00fb\u0001\u0000\u0000\u0000\u0100\u00fc\u0001"+
		"\u0000\u0000\u0000\u0100\u00fd\u0001\u0000\u0000\u0000\u0100\u00fe\u0001"+
		"\u0000\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\u0011\u0001"+
		"\u0000\u0000\u0000\u0102\u0103\u0005\u001d\u0000\u0000\u0103\u0104\u0005"+
		"`\u0000\u0000\u0104\u0105\u0005\u001f\u0000\u0000\u0105\u0106\u0005A\u0000"+
		"\u0000\u0106\u010b\u0003\u0014\n\u0000\u0107\u0108\u0005\u0002\u0000\u0000"+
		"\u0108\u010a\u0003\u0014\n\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u010a"+
		"\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b"+
		"\u010c\u0001\u0000\u0000\u0000\u010c\u010e\u0001\u0000\u0000\u0000\u010d"+
		"\u010b\u0001\u0000\u0000\u0000\u010e\u010f\u0005@\u0000\u0000\u010f\u0013"+
		"\u0001\u0000\u0000\u0000\u0110\u0113\u0003X,\u0000\u0111\u0113\u0005`"+
		"\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0111\u0001\u0000"+
		"\u0000\u0000\u0113\u0015\u0001\u0000\u0000\u0000\u0114\u0118\u0003\u0082"+
		"A\u0000\u0115\u0118\u0003X,\u0000\u0116\u0118\u0005`\u0000\u0000\u0117"+
		"\u0114\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117"+
		"\u0116\u0001\u0000\u0000\u0000\u0118\u0017\u0001\u0000\u0000\u0000\u0119"+
		"\u011a\u0005\u001e\u0000\u0000\u011a\u011b\u0005`\u0000\u0000\u011b\u011c"+
		"\u0005\u001f\u0000\u0000\u011c\u011d\u0005?\u0000\u0000\u011d\u0122\u0003"+
		"\u0082A\u0000\u011e\u011f\u0005\u0002\u0000\u0000\u011f\u0121\u0003\u0082"+
		"A\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0121\u0124\u0001\u0000\u0000"+
		"\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000"+
		"\u0000\u0123\u0125\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000"+
		"\u0000\u0125\u0126\u0005>\u0000\u0000\u0126\u0019\u0001\u0000\u0000\u0000"+
		"\u0127\u012e\u0003\u009aM\u0000\u0128\u0129\u0003\u0084B\u0000\u0129\u012a"+
		"\u0005?\u0000\u0000\u012a\u012b\u0003\u0084B\u0000\u012b\u012c\u0005>"+
		"\u0000\u0000\u012c\u012e\u0001\u0000\u0000\u0000\u012d\u0127\u0001\u0000"+
		"\u0000\u0000\u012d\u0128\u0001\u0000\u0000\u0000\u012e\u001b\u0001\u0000"+
		"\u0000\u0000\u012f\u0134\u0003\u001a\r\u0000\u0130\u0131\u0005\u0002\u0000"+
		"\u0000\u0131\u0133\u0003\u001a\r\u0000\u0132\u0130\u0001\u0000\u0000\u0000"+
		"\u0133\u0136\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000"+
		"\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0137\u0001\u0000\u0000\u0000"+
		"\u0136\u0134\u0001\u0000\u0000\u0000\u0137\u0138\u0005=\u0000\u0000\u0138"+
		"\u013d\u0003\u0084B\u0000\u0139\u013a\u0005\u0002\u0000\u0000\u013a\u013c"+
		"\u0003\u0084B\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013c\u013f\u0001"+
		"\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013e\u0001"+
		"\u0000\u0000\u0000\u013e\u001d\u0001\u0000\u0000\u0000\u013f\u013d\u0001"+
		"\u0000\u0000\u0000\u0140\u0141\u0005H\u0000\u0000\u0141\u0142\u0003B!"+
		"\u0000\u0142\u0143\u0003\u00aeW\u0000\u0143\u001f\u0001\u0000\u0000\u0000"+
		"\u0144\u0145\u0005#\u0000\u0000\u0145\u0146\u0003\u0096K\u0000\u0146\u0147"+
		"\u0005\"\u0000\u0000\u0147\u0148\u0003\u009aM\u0000\u0148!\u0001\u0000"+
		"\u0000\u0000\u0149\u014a\u0005L\u0000\u0000\u014a\u014b\u0003\f\u0006"+
		"\u0000\u014b\u014c\u0005K\u0000\u0000\u014c#\u0001\u0000\u0000\u0000\u014d"+
		"\u014e\u0003\u009aM\u0000\u014e\u014f\u0003\u00ba]\u0000\u014f\u0150\u0003"+
		"\u0084B\u0000\u0150%\u0001\u0000\u0000\u0000\u0151\u0152\u0003\u009aM"+
		"\u0000\u0152\u0153\u0003\u00bc^\u0000\u0153\'\u0001\u0000\u0000\u0000"+
		"\u0154\u0155\u0005C\u0000\u0000\u0155\u0156\u0003\u0084B\u0000\u0156\u0158"+
		"\u0003*\u0015\u0000\u0157\u0159\u0003,\u0016\u0000\u0158\u0157\u0001\u0000"+
		"\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000"+
		"\u0000\u0000\u015a\u015b\u0005V\u0000\u0000\u015b)\u0001\u0000\u0000\u0000"+
		"\u015c\u015e\u0005D\u0000\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015d"+
		"\u015e\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f"+
		"\u0160\u0003\f\u0006\u0000\u0160+\u0001\u0000\u0000\u0000\u0161\u0162"+
		"\u0005E\u0000\u0000\u0162\u0163\u0003\f\u0006\u0000\u0163-\u0001\u0000"+
		"\u0000\u0000\u0164\u0167\u0005I\u0000\u0000\u0165\u0168\u0005_\u0000\u0000"+
		"\u0166\u0168\u00030\u0018\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167"+
		"\u0166\u0001\u0000\u0000\u0000\u0168/\u0001\u0000\u0000\u0000\u0169\u016e"+
		"\u0005`\u0000\u0000\u016a\u016b\u0005\u0002\u0000\u0000\u016b\u016d\u0005"+
		"`\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016d\u0170\u0001\u0000"+
		"\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000"+
		"\u0000\u0000\u016f1\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000"+
		"\u0000\u0171\u0177\u00034\u001a\u0000\u0172\u0177\u00036\u001b\u0000\u0173"+
		"\u0177\u00038\u001c\u0000\u0174\u0177\u0003:\u001d\u0000\u0175\u0177\u0003"+
		"<\u001e\u0000\u0176\u0171\u0001\u0000\u0000\u0000\u0176\u0172\u0001\u0000"+
		"\u0000\u0000\u0176\u0173\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000"+
		"\u0000\u0000\u0176\u0175\u0001\u0000\u0000\u0000\u01773\u0001\u0000\u0000"+
		"\u0000\u0178\u0179\u0005J\u0000\u0000\u0179\u017a\u0003N\'\u0000\u017a"+
		"\u017b\u0003T*\u0000\u017b\u017c\u0005\u0002\u0000\u0000\u017c\u017f\u0003"+
		"\u0084B\u0000\u017d\u017e\u0005\u0002\u0000\u0000\u017e\u0180\u0003\u0084"+
		"B\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000"+
		"\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0182\u0003\"\u0011\u0000"+
		"\u01825\u0001\u0000\u0000\u0000\u0183\u0184\u0005O\u0000\u0000\u0184\u0185"+
		"\u00034\u001a\u0000\u01857\u0001\u0000\u0000\u0000\u0186\u0187\u0005J"+
		"\u0000\u0000\u0187\u0188\u0005N\u0000\u0000\u0188\u0189\u0003J%\u0000"+
		"\u0189\u018a\u0005M\u0000\u0000\u018a\u018b\u0003\u0080@\u0000\u018b\u018c"+
		"\u0003\"\u0011\u0000\u018c9\u0001\u0000\u0000\u0000\u018d\u018e\u0005"+
		"F\u0000\u0000\u018e\u018f\u0003\u0080@\u0000\u018f\u0190\u0003\"\u0011"+
		"\u0000\u0190;\u0001\u0000\u0000\u0000\u0191\u0192\u0005 \u0000\u0000\u0192"+
		"\u0193\u0003\f\u0006\u0000\u0193\u0194\u0005!\u0000\u0000\u0194\u0195"+
		"\u0003\u0080@\u0000\u0195=\u0001\u0000\u0000\u0000\u0196\u019a\u0003@"+
		" \u0000\u0197\u019a\u0005G\u0000\u0000\u0198\u019a\u0005P\u0000\u0000"+
		"\u0199\u0196\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000"+
		"\u0199\u0198\u0001\u0000\u0000\u0000\u019a?\u0001\u0000\u0000\u0000\u019b"+
		"\u019d\u0005Q\u0000\u0000\u019c\u019e\u0003\u0084B\u0000\u019d\u019c\u0001"+
		"\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019eA\u0001\u0000"+
		"\u0000\u0000\u019f\u01a4\u0005`\u0000\u0000\u01a0\u01a1\u0005\u0001\u0000"+
		"\u0000\u01a1\u01a3\u0005`\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a6\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5C\u0001\u0000\u0000\u0000\u01a6"+
		"\u01a4\u0001\u0000\u0000\u0000\u01a7\u01ac\u0003\u009aM\u0000\u01a8\u01a9"+
		"\u0005\u0002\u0000\u0000\u01a9\u01ab\u0003\u009aM\u0000\u01aa\u01a8\u0001"+
		"\u0000\u0000\u0000\u01ab\u01ae\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001"+
		"\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01adE\u0001\u0000"+
		"\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01af\u01b0\u0005S\u0000"+
		"\u0000\u01b0\u01b1\u0003\f\u0006\u0000\u01b1\u01b2\u0005R\u0000\u0000"+
		"\u01b2\u01b3\u0003\f\u0006\u0000\u01b3\u01b4\u0005V\u0000\u0000\u01b4"+
		"G\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005T\u0000\u0000\u01b6\u01b7\u0003"+
		"\u0084B\u0000\u01b7I\u0001\u0000\u0000\u0000\u01b8\u01bd\u0003N\'\u0000"+
		"\u01b9\u01be\u0003P(\u0000\u01ba\u01be\u0003R)\u0000\u01bb\u01be\u0003"+
		"T*\u0000\u01bc\u01be\u0003V+\u0000\u01bd\u01b9\u0001\u0000\u0000\u0000"+
		"\u01bd\u01ba\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000"+
		"\u01bd\u01bc\u0001\u0000\u0000\u0000\u01beK\u0001\u0000\u0000\u0000\u01bf"+
		"\u01c0\u0007\u0001\u0000\u0000\u01c0M\u0001\u0000\u0000\u0000\u01c1\u01c2"+
		"\u0003L&\u0000\u01c2\u01c3\u0005`\u0000\u0000\u01c3O\u0001\u0000\u0000"+
		"\u0000\u01c4\u01c5\u0005=\u0000\u0000\u01c5\u01c7\u0003z=\u0000\u01c6"+
		"\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7"+
		"Q\u0001\u0000\u0000\u0000\u01c8\u01c9\u0005\u0003\u0000\u0000\u01c9\u01ca"+
		"\u0003X,\u0000\u01caS\u0001\u0000\u0000\u0000\u01cb\u01cc\u0005=\u0000"+
		"\u0000\u01cc\u01cd\u0003\u0084B\u0000\u01cdU\u0001\u0000\u0000\u0000\u01ce"+
		"\u01cf\u0005\u0003\u0000\u0000\u01cf\u01d0\u0003X,\u0000\u01d0\u01d1\u0005"+
		"=\u0000\u0000\u01d1\u01d2\u0003\u0084B\u0000\u01d2W\u0001\u0000\u0000"+
		"\u0000\u01d3\u01e0\u0003Z-\u0000\u01d4\u01e0\u0003x<\u0000\u01d5\u01db"+
		"\u0003^/\u0000\u01d6\u01d7\u0005\u0004\u0000\u0000\u01d7\u01d8\u0003^"+
		"/\u0000\u01d8\u01d9\u0005\u0005\u0000\u0000\u01d9\u01db\u0001\u0000\u0000"+
		"\u0000\u01da\u01d5\u0001\u0000\u0000\u0000\u01da\u01d6\u0001\u0000\u0000"+
		"\u0000\u01db\u01e0\u0001\u0000\u0000\u0000\u01dc\u01e0\u0003d2\u0000\u01dd"+
		"\u01e0\u0003l6\u0000\u01de\u01e0\u0003z=\u0000\u01df\u01d3\u0001\u0000"+
		"\u0000\u0000\u01df\u01d4\u0001\u0000\u0000\u0000\u01df\u01da\u0001\u0000"+
		"\u0000\u0000\u01df\u01dc\u0001\u0000\u0000\u0000\u01df\u01dd\u0001\u0000"+
		"\u0000\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01e0Y\u0001\u0000\u0000"+
		"\u0000\u01e1\u01e2\u0005\u0006\u0000\u0000\u01e2[\u0001\u0000\u0000\u0000"+
		"\u01e3\u01e4\u0007\u0002\u0000\u0000\u01e4]\u0001\u0000\u0000\u0000\u01e5"+
		"\u01e7\u0003\\.\u0000\u01e6\u01e8\u0003\u009cN\u0000\u01e7\u01e6\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01eb\u0001"+
		"\u0000\u0000\u0000\u01e9\u01ea\u0005\u0007\u0000\u0000\u01ea\u01ec\u0003"+
		"X,\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000"+
		"\u0000\u01ec_\u0001\u0000\u0000\u0000\u01ed\u01ee\u0005A\u0000\u0000\u01ee"+
		"\u01ef\u0003~?\u0000\u01ef\u01f0\u0005@\u0000\u0000\u01f0a\u0001\u0000"+
		"\u0000\u0000\u01f1\u01f3\u0005A\u0000\u0000\u01f2\u01f4\u0003\u0080@\u0000"+
		"\u01f3\u01f2\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000"+
		"\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f6\u0005@\u0000\u0000\u01f6"+
		"c\u0001\u0000\u0000\u0000\u01f7\u01fb\u0005\b\u0000\u0000\u01f8\u01fb"+
		"\u0003f3\u0000\u01f9\u01fb\u0003h4\u0000\u01fa\u01f7\u0001\u0000\u0000"+
		"\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fa\u01f9\u0001\u0000\u0000"+
		"\u0000\u01fbe\u0001\u0000\u0000\u0000\u01fc\u01fd\u0005\t\u0000\u0000"+
		"\u01fdg\u0001\u0000\u0000\u0000\u01fe\u01ff\u0005\n\u0000\u0000\u01ff"+
		"i\u0001\u0000\u0000\u0000\u0200\u0201\u0005\u000b\u0000\u0000\u0201k\u0001"+
		"\u0000\u0000\u0000\u0202\u0208\u0003j5\u0000\u0203\u0208\u0003p8\u0000"+
		"\u0204\u0208\u0003r9\u0000\u0205\u0208\u0003v;\u0000\u0206\u0208\u0003"+
		"t:\u0000\u0207\u0202\u0001\u0000\u0000\u0000\u0207\u0203\u0001\u0000\u0000"+
		"\u0000\u0207\u0204\u0001\u0000\u0000\u0000\u0207\u0205\u0001\u0000\u0000"+
		"\u0000\u0207\u0206\u0001\u0000\u0000\u0000\u0208\u020e\u0001\u0000\u0000"+
		"\u0000\u0209\u020b\u0003n7\u0000\u020a\u0209\u0001\u0000\u0000\u0000\u020a"+
		"\u020b\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c"+
		"\u020d\u00059\u0000\u0000\u020d\u020f\u0003X,\u0000\u020e\u020a\u0001"+
		"\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020fm\u0001\u0000"+
		"\u0000\u0000\u0210\u0211\u0005;\u0000\u0000\u0211\u0212\u0003\u0084B\u0000"+
		"\u0212o\u0001\u0000\u0000\u0000\u0213\u0214\u0007\u0003\u0000\u0000\u0214"+
		"q\u0001\u0000\u0000\u0000\u0215\u0216\u0005\u000e\u0000\u0000\u0216s\u0001"+
		"\u0000\u0000\u0000\u0217\u0218\u0005\u000f\u0000\u0000\u0218u\u0001\u0000"+
		"\u0000\u0000\u0219\u021a\u0005\u0010\u0000\u0000\u021aw\u0001\u0000\u0000"+
		"\u0000\u021b\u021c\u0005\u0011\u0000\u0000\u021cy\u0001\u0000\u0000\u0000"+
		"\u021d\u021e\u0005\u0012\u0000\u0000\u021e{\u0001\u0000\u0000\u0000\u021f"+
		"\u0224\u0003J%\u0000\u0220\u0221\u0005\u0002\u0000\u0000\u0221\u0223\u0003"+
		"J%\u0000\u0222\u0220\u0001\u0000\u0000\u0000\u0223\u0226\u0001\u0000\u0000"+
		"\u0000\u0224\u0222\u0001\u0000\u0000\u0000\u0224\u0225\u0001\u0000\u0000"+
		"\u0000\u0225}\u0001\u0000\u0000\u0000\u0226\u0224\u0001\u0000\u0000\u0000"+
		"\u0227\u022c\u0003\u0082A\u0000\u0228\u0229\u0005\u0002\u0000\u0000\u0229"+
		"\u022b\u0003\u0082A\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022b\u022e"+
		"\u0001\u0000\u0000\u0000\u022c\u022a\u0001\u0000\u0000\u0000\u022c\u022d"+
		"\u0001\u0000\u0000\u0000\u022d\u007f\u0001\u0000\u0000\u0000\u022e\u022c"+
		"\u0001\u0000\u0000\u0000\u022f\u0234\u0003\u0084B\u0000\u0230\u0231\u0005"+
		"\u0002\u0000\u0000\u0231\u0233\u0003\u0084B\u0000\u0232\u0230\u0001\u0000"+
		"\u0000\u0000\u0233\u0236\u0001\u0000\u0000\u0000\u0234\u0232\u0001\u0000"+
		"\u0000\u0000\u0234\u0235\u0001\u0000\u0000\u0000\u0235\u0081\u0001\u0000"+
		"\u0000\u0000\u0236\u0234\u0001\u0000\u0000\u0000\u0237\u0238\u0005\u0001"+
		"\u0000\u0000\u0238\u0239\u0005`\u0000\u0000\u0239\u0083\u0001\u0000\u0000"+
		"\u0000\u023a\u023b\u0006B\uffff\uffff\u0000\u023b\u0264\u0003\u009aM\u0000"+
		"\u023c\u0264\u0003\u008cF\u0000\u023d\u0264\u0003\u0096K\u0000\u023e\u0264"+
		"\u0003\u0082A\u0000\u023f\u0264\u0003`0\u0000\u0240\u0264\u0003b1\u0000"+
		"\u0241\u0264\u0003\u00a4R\u0000\u0242\u0243\u0003B!\u0000\u0243\u0245"+
		"\u0005\u0004\u0000\u0000\u0244\u0246\u0003\u0080@\u0000\u0245\u0244\u0001"+
		"\u0000\u0000\u0000\u0245\u0246\u0001\u0000\u0000\u0000\u0246\u0247\u0001"+
		"\u0000\u0000\u0000\u0247\u0248\u0005\u0005\u0000\u0000\u0248\u0264\u0001"+
		"\u0000\u0000\u0000\u0249\u024a\u0003\u00b4Z\u0000\u024a\u024b\u0003\u0084"+
		"B\u0010\u024b\u0264\u0001\u0000\u0000\u0000\u024c\u024d\u0005\u0004\u0000"+
		"\u0000\u024d\u024e\u0003\u0084B\u0000\u024e\u024f\u0005\u0005\u0000\u0000"+
		"\u024f\u0264\u0001\u0000\u0000\u0000\u0250\u0251\u0005X\u0000\u0000\u0251"+
		"\u0264\u0003\u0084B\u0006\u0252\u0253\u0003B!\u0000\u0253\u0254\u0005"+
		"+\u0000\u0000\u0254\u0255\u0003B!\u0000\u0255\u0264\u0001\u0000\u0000"+
		"\u0000\u0256\u0257\u0005\u0015\u0000\u0000\u0257\u0258\u0003\u0084B\u0000"+
		"\u0258\u0259\u0005\u0016\u0000\u0000\u0259\u025e\u0003\u0086C\u0000\u025a"+
		"\u025b\u0005\u0002\u0000\u0000\u025b\u025d\u0003\u0086C\u0000\u025c\u025a"+
		"\u0001\u0000\u0000\u0000\u025d\u0260\u0001\u0000\u0000\u0000\u025e\u025c"+
		"\u0001\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025f\u0261"+
		"\u0001\u0000\u0000\u0000\u0260\u025e\u0001\u0000\u0000\u0000\u0261\u0262"+
		"\u0005\u0017\u0000\u0000\u0262\u0264\u0001\u0000\u0000\u0000\u0263\u023a"+
		"\u0001\u0000\u0000\u0000\u0263\u023c\u0001\u0000\u0000\u0000\u0263\u023d"+
		"\u0001\u0000\u0000\u0000\u0263\u023e\u0001\u0000\u0000\u0000\u0263\u023f"+
		"\u0001\u0000\u0000\u0000\u0263\u0240\u0001\u0000\u0000\u0000\u0263\u0241"+
		"\u0001\u0000\u0000\u0000\u0263\u0242\u0001\u0000\u0000\u0000\u0263\u0249"+
		"\u0001\u0000\u0000\u0000\u0263\u024c\u0001\u0000\u0000\u0000\u0263\u0250"+
		"\u0001\u0000\u0000\u0000\u0263\u0252\u0001\u0000\u0000\u0000\u0263\u0256"+
		"\u0001\u0000\u0000\u0000\u0264\u029c\u0001\u0000\u0000\u0000\u0265\u0266"+
		"\n\u0011\u0000\u0000\u0266\u0267\u0003\u00b2Y\u0000\u0267\u0268\u0003"+
		"\u0084B\u0012\u0268\u029b\u0001\u0000\u0000\u0000\u0269\u026a\n\u000f"+
		"\u0000\u0000\u026a\u026b\u0003\u00b8\\\u0000\u026b\u026c\u0003\u0084B"+
		"\u0010\u026c\u029b\u0001\u0000\u0000\u0000\u026d\u026e\n\u000e\u0000\u0000"+
		"\u026e\u026f\u0003\u00b6[\u0000\u026f\u0270\u0003\u0084B\u000f\u0270\u029b"+
		"\u0001\u0000\u0000\u0000\u0271\u0272\n\r\u0000\u0000\u0272\u0273\u0003"+
		"\u000e\u0007\u0000\u0273\u0274\u0003\u0084B\u000e\u0274\u029b\u0001\u0000"+
		"\u0000\u0000\u0275\u0276\n\u000b\u0000\u0000\u0276\u0277\u0005x\u0000"+
		"\u0000\u0277\u029b\u0003\u0084B\u000b\u0278\u0279\n\n\u0000\u0000\u0279"+
		"\u027a\u0005,\u0000\u0000\u027a\u029b\u0003\u0084B\u000b\u027b\u027c\n"+
		"\t\u0000\u0000\u027c\u027d\u0005-\u0000\u0000\u027d\u029b\u0003\u0084"+
		"B\n\u027e\u027f\n\b\u0000\u0000\u027f\u0280\u0005<\u0000\u0000\u0280\u029b"+
		"\u0003\u0084B\b\u0281\u0282\n\f\u0000\u0000\u0282\u0283\u0005?\u0000\u0000"+
		"\u0283\u0284\u0003\u0084B\u0000\u0284\u0285\u0005>\u0000\u0000\u0285\u029b"+
		"\u0001\u0000\u0000\u0000\u0286\u0287\n\u0005\u0000\u0000\u0287\u028a\u0005"+
		"Y\u0000\u0000\u0288\u028b\u0003X,\u0000\u0289\u028b\u0003\u0084B\u0000"+
		"\u028a\u0288\u0001\u0000\u0000\u0000\u028a\u0289\u0001\u0000\u0000\u0000"+
		"\u028b\u029b\u0001\u0000\u0000\u0000\u028c\u028d\n\u0004\u0000\u0000\u028d"+
		"\u028e\u0005\"\u0000\u0000\u028e\u029b\u0003X,\u0000\u028f\u0290\n\u0002"+
		"\u0000\u0000\u0290\u0291\u0005\u0013\u0000\u0000\u0291\u0294\u0003\u0084"+
		"B\u0000\u0292\u0293\u0005\u0014\u0000\u0000\u0293\u0295\u0003\u0084B\u0000"+
		"\u0294\u0292\u0001\u0000\u0000\u0000\u0294\u0295\u0001\u0000\u0000\u0000"+
		"\u0295\u0298\u0001\u0000\u0000\u0000\u0296\u0297\u0005\u0014\u0000\u0000"+
		"\u0297\u0299\u0003\u0084B\u0000\u0298\u0296\u0001\u0000\u0000\u0000\u0298"+
		"\u0299\u0001\u0000\u0000\u0000\u0299\u029b\u0001\u0000\u0000\u0000\u029a"+
		"\u0265\u0001\u0000\u0000\u0000\u029a\u0269\u0001\u0000\u0000\u0000\u029a"+
		"\u026d\u0001\u0000\u0000\u0000\u029a\u0271\u0001\u0000\u0000\u0000\u029a"+
		"\u0275\u0001\u0000\u0000\u0000\u029a\u0278\u0001\u0000\u0000\u0000\u029a"+
		"\u027b\u0001\u0000\u0000\u0000\u029a\u027e\u0001\u0000\u0000\u0000\u029a"+
		"\u0281\u0001\u0000\u0000\u0000\u029a\u0286\u0001\u0000\u0000\u0000\u029a"+
		"\u028c\u0001\u0000\u0000\u0000\u029a\u028f\u0001\u0000\u0000\u0000\u029b"+
		"\u029e\u0001\u0000\u0000\u0000\u029c\u029a\u0001\u0000\u0000\u0000\u029c"+
		"\u029d\u0001\u0000\u0000\u0000\u029d\u0085\u0001\u0000\u0000\u0000\u029e"+
		"\u029c\u0001\u0000\u0000\u0000\u029f\u02a1\u0003\u0088D\u0000\u02a0\u029f"+
		"\u0001\u0000\u0000\u0000\u02a0\u02a1\u0001\u0000\u0000\u0000\u02a1\u02a2"+
		"\u0001\u0000\u0000\u0000\u02a2\u02a5\u0003\u008aE\u0000\u02a3\u02a4\u0005"+
		"\u0002\u0000\u0000\u02a4\u02a6\u0003\u008aE\u0000\u02a5\u02a3\u0001\u0000"+
		"\u0000\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6\u02a7\u0001\u0000"+
		"\u0000\u0000\u02a7\u02a8\u0005-\u0000\u0000\u02a8\u02a9\u0003\u0084B\u0000"+
		"\u02a9\u0087\u0001\u0000\u0000\u0000\u02aa\u02ab\u0005\u0018\u0000\u0000"+
		"\u02ab\u0089\u0001\u0000\u0000\u0000\u02ac\u02b2\u0003\u0082A\u0000\u02ad"+
		"\u02b2\u0003\u0090H\u0000\u02ae\u02b2\u0003\u0092I\u0000\u02af\u02b2\u0003"+
		"\u0094J\u0000\u02b0\u02b2\u0003\u0084B\u0000\u02b1\u02ac\u0001\u0000\u0000"+
		"\u0000\u02b1\u02ad\u0001\u0000\u0000\u0000\u02b1\u02ae\u0001\u0000\u0000"+
		"\u0000\u02b1\u02af\u0001\u0000\u0000\u0000\u02b1\u02b0\u0001\u0000\u0000"+
		"\u0000\u02b2\u008b\u0001\u0000\u0000\u0000\u02b3\u02b8\u0003\u008eG\u0000"+
		"\u02b4\u02b8\u0003\u0090H\u0000\u02b5\u02b8\u0003\u0092I\u0000\u02b6\u02b8"+
		"\u0003\u0094J\u0000\u02b7\u02b3\u0001\u0000\u0000\u0000\u02b7\u02b4\u0001"+
		"\u0000\u0000\u0000\u02b7\u02b5\u0001\u0000\u0000\u0000\u02b7\u02b6\u0001"+
		"\u0000\u0000\u0000\u02b8\u008d\u0001\u0000\u0000\u0000\u02b9\u02ba\u0005"+
		"Z\u0000\u0000\u02ba\u008f\u0001\u0000\u0000\u0000\u02bb\u02bc\u0007\u0004"+
		"\u0000\u0000\u02bc\u0091\u0001\u0000\u0000\u0000\u02bd\u02be\u0007\u0005"+
		"\u0000\u0000\u02be\u0093\u0001\u0000\u0000\u0000\u02bf\u02c0\u0007\u0006"+
		"\u0000\u0000\u02c0\u0095\u0001\u0000\u0000\u0000\u02c1\u02c2\u0005d\u0000"+
		"\u0000\u02c2\u0097\u0001\u0000\u0000\u0000\u02c3\u02c4\u0005`\u0000\u0000"+
		"\u02c4\u02c6\u0005\u0001\u0000\u0000\u02c5\u02c3\u0001\u0000\u0000\u0000"+
		"\u02c5\u02c6\u0001\u0000\u0000\u0000\u02c6\u02c7\u0001\u0000\u0000\u0000"+
		"\u02c7\u02c8\u0005`\u0000\u0000\u02c8\u02ca\u0005\u0004\u0000\u0000\u02c9"+
		"\u02cb\u0003\u0080@\u0000\u02ca\u02c9\u0001\u0000\u0000\u0000\u02ca\u02cb"+
		"\u0001\u0000\u0000\u0000\u02cb\u02cc\u0001\u0000\u0000\u0000\u02cc\u02cd"+
		"\u0005\u0005\u0000\u0000\u02cd\u0099\u0001\u0000\u0000\u0000\u02ce\u02cf"+
		"\u0005`\u0000\u0000\u02cf\u009b\u0001\u0000\u0000\u0000\u02d0\u02d7\u0003"+
		"J%\u0000\u02d1\u02d3\u0005\u0004\u0000\u0000\u02d2\u02d4\u0003|>\u0000"+
		"\u02d3\u02d2\u0001\u0000\u0000\u0000\u02d3\u02d4\u0001\u0000\u0000\u0000"+
		"\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5\u02d7\u0005\u0005\u0000\u0000"+
		"\u02d6\u02d0\u0001\u0000\u0000\u0000\u02d6\u02d1\u0001\u0000\u0000\u0000"+
		"\u02d7\u009d\u0001\u0000\u0000\u0000\u02d8\u02db\u0003\u00a0P\u0000\u02d9"+
		"\u02db\u0003\u00a2Q\u0000\u02da\u02d8\u0001\u0000\u0000\u0000\u02da\u02d9"+
		"\u0001\u0000\u0000\u0000\u02db\u02dc\u0001\u0000\u0000\u0000\u02dc\u02dd"+
		"\u0005=\u0000\u0000\u02dd\u009f\u0001\u0000\u0000\u0000\u02de\u02df\u0005"+
		"\u0003\u0000\u0000\u02df\u02e1\u0003Z-\u0000\u02e0\u02de\u0001\u0000\u0000"+
		"\u0000\u02e0\u02e1\u0001\u0000\u0000\u0000\u02e1\u00a1\u0001\u0000\u0000"+
		"\u0000\u02e2\u02e3\u0005\u0003\u0000\u0000\u02e3\u02e4\u0003X,\u0000\u02e4"+
		"\u00a3\u0001\u0000\u0000\u0000\u02e5\u02e9\u0003\u00b0X\u0000\u02e6\u02e7"+
		"\u0005H\u0000\u0000\u02e7\u02e9\u0003\u00aeW\u0000\u02e8\u02e5\u0001\u0000"+
		"\u0000\u0000\u02e8\u02e6\u0001\u0000\u0000\u0000\u02e9\u00a5\u0001\u0000"+
		"\u0000\u0000\u02ea\u02eb\u0003\u009cN\u0000\u02eb\u02ec\u0003\u009eO\u0000"+
		"\u02ec\u02ed\u0003\f\u0006\u0000\u02ed\u02ee\u0005\'\u0000\u0000\u02ee"+
		"\u00a7\u0001\u0000\u0000\u0000\u02ef\u02f2\u0005)\u0000\u0000\u02f0\u02f3"+
		"\u0003\u0084B\u0000\u02f1\u02f3\u0003\u00a4R\u0000\u02f2\u02f0\u0001\u0000"+
		"\u0000\u0000\u02f2\u02f1\u0001\u0000\u0000\u0000\u02f3\u00a9\u0001\u0000"+
		"\u0000\u0000\u02f4\u02f7\u0005*\u0000\u0000\u02f5\u02f8\u0003\u0084B\u0000"+
		"\u02f6\u02f8\u0003\u00a4R\u0000\u02f7\u02f5\u0001\u0000\u0000\u0000\u02f7"+
		"\u02f6\u0001\u0000\u0000\u0000\u02f8\u00ab\u0001\u0000\u0000\u0000\u02f9"+
		"\u02fc\u0005+\u0000\u0000\u02fa\u02fd\u0003\u0084B\u0000\u02fb\u02fd\u0003"+
		"\u00a4R\u0000\u02fc\u02fa\u0001\u0000\u0000\u0000\u02fc\u02fb\u0001\u0000"+
		"\u0000\u0000\u02fd\u00ad\u0001\u0000\u0000\u0000\u02fe\u0304\u0003\u00b0"+
		"X\u0000\u02ff\u0304\u0003\u00a8T\u0000\u0300\u0304\u0003\u00aaU\u0000"+
		"\u0301\u0304\u0003\u00acV\u0000\u0302\u0304\u0003\u00a6S\u0000\u0303\u02fe"+
		"\u0001\u0000\u0000\u0000\u0303\u02ff\u0001\u0000\u0000\u0000\u0303\u0300"+
		"\u0001\u0000\u0000\u0000\u0303\u0301\u0001\u0000\u0000\u0000\u0303\u0302"+
		"\u0001\u0000\u0000\u0000\u0304\u00af\u0001\u0000\u0000\u0000\u0305\u0308"+
		"\u0005\u0019\u0000\u0000\u0306\u0309\u0003J%\u0000\u0307\u0309\u0003\u009c"+
		"N\u0000\u0308\u0306\u0001\u0000\u0000\u0000\u0308\u0307\u0001\u0000\u0000"+
		"\u0000\u0309\u030a\u0001\u0000\u0000\u0000\u030a\u030d\u0005(\u0000\u0000"+
		"\u030b\u030e\u0003\u0010\b\u0000\u030c\u030e\u0003\u0084B\u0000\u030d"+
		"\u030b\u0001\u0000\u0000\u0000\u030d\u030c\u0001\u0000\u0000\u0000\u030e"+
		"\u00b1\u0001\u0000\u0000\u0000\u030f\u0314\u00057\u0000\u0000\u0310\u0314"+
		"\u00058\u0000\u0000\u0311\u0314\u00059\u0000\u0000\u0312\u0314\u0005:"+
		"\u0000\u0000\u0313\u030f\u0001\u0000\u0000\u0000\u0313\u0310\u0001\u0000"+
		"\u0000\u0000\u0313\u0311\u0001\u0000\u0000\u0000\u0313\u0312\u0001\u0000"+
		"\u0000\u0000\u0314\u00b3\u0001\u0000\u0000\u0000\u0315\u0316\u0007\u0007"+
		"\u0000\u0000\u0316\u00b5\u0001\u0000\u0000\u0000\u0317\u0318\u0007\b\u0000"+
		"\u0000\u0318\u00b7\u0001\u0000\u0000\u0000\u0319\u031a\u0007\t\u0000\u0000"+
		"\u031a\u00b9\u0001\u0000\u0000\u0000\u031b\u031c\u0007\n\u0000\u0000\u031c"+
		"\u00bb\u0001\u0000\u0000\u0000\u031d\u031e\u0007\u000b\u0000\u0000\u031e"+
		"\u00bd\u0001\u0000\u0000\u0000@\u00bf\u00c7\u00d5\u00dc\u00e3\u00e9\u0100"+
		"\u010b\u0112\u0117\u0122\u012d\u0134\u013d\u0158\u015d\u0167\u016e\u0176"+
		"\u017f\u0199\u019d\u01a4\u01ac\u01bd\u01c6\u01da\u01df\u01e7\u01eb\u01f3"+
		"\u01fa\u0207\u020a\u020e\u0224\u022c\u0234\u0245\u025e\u0263\u028a\u0294"+
		"\u0298\u029a\u029c\u02a0\u02a5\u02b1\u02b7\u02c5\u02ca\u02d3\u02d6\u02da"+
		"\u02e0\u02e8\u02f2\u02f7\u02fc\u0303\u0308\u030d\u0313";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}