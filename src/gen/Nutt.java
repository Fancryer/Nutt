// Generated from G:/Nutt/src\Nutt.g4 by ANTLR 4.12.0
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
public class Nutt extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AtSign=1, BackSlash=2, BackTick=3, BlockComment=4, Char_String=5, Colon=6, 
		Comma=7, DecimalEscape=8, Dot=9, EscapeCharacter=10, EscapeSequence=11, 
		Float=12, HexEscape=13, HexFloat=14, HexInt=15, Int=16, KW_All=17, KW_As=18, 
		KW_Break=19, KW_Catch=20, KW_Continue=21, KW_CommonOf=22, KW_Default=23, 
		KW_Define=24, KW_Demand=25, KW_Deports=26, KW_Do=27, KW_Doif=28, KW_Doifn=29, 
		KW_Done=30, KW_Else=31, KW_End=32, KW_Enum=33, KW_Eval=34, KW_Every=35, 
		KW_Exec=36, KW_Exit=37, KW_False=38, KW_Final=39, KW_For=40, KW_Forget=41, 
		KW_Funct=42, KW_If=43, KW_Implements=44, KW_Imports=45, KW_In=46, KW_Infix=47, 
		KW_InstanceOf=48, KW_Is=49, KW_Local=50, KW_Match=51, KW_Matched=52, KW_Module=53, 
		KW_Nil=54, KW_Not_In=55, KW_Of=56, KW_Operator=57, KW_Postfix=58, KW_Prefix=59, 
		KW_Record=60, KW_Repeat=61, KW_Return=62, KW_Reverse=63, KW_Then=64, KW_To=65, 
		KW_True=66, KW_Try=67, KW_Type=68, KW_TypeOf=69, KW_Until=70, KW_VAL=71, 
		KW_VAR=72, KW_Vals=73, KW_Vars=74, KW_While=75, KW_Yield=76, Lambda=77, 
		LineComment=78, NAME=79, NATIVE=80, OP_Add=81, OP_And=82, OP_Append=83, 
		OP_Arithmetic_LeftShift=84, OP_Arithmetic_RightShift=85, OP_Assign=86, 
		OP_Backward=87, OP_Bit_And=88, OP_Bit_LeftShift=89, OP_Bit_Or=90, OP_Bit_RightShift=91, 
		OP_Bit_Xor=92, OP_Case_Arrow=93, OP_Div=94, OP_Equal=95, OP_Extends=96, 
		OP_Forward=97, OP_Greater=98, OP_IntDiv=99, OP_LambdaReturn=100, OP_LeftBracket=101, 
		OP_LeftCurly=102, OP_LeftPar=103, OP_Length=104, OP_Less=105, OP_Less_Equal=106, 
		OP_Mod=107, OP_Mult=108, OP_Not=109, OP_Or=110, OP_Pass=111, OP_Power=112, 
		OP_Range=113, OP_Reverse=114, OP_RightBracket=115, OP_RightCurly=116, 
		OP_RightPar=117, OP_Similar=118, OP_Sub=119, OP_Tilda=120, OP_Xor=121, 
		Op_Greater_Equal=122, Op_Not_Equal=123, Op_Not_Similar=124, Op_Custom=125, 
		Question=126, SHEBANG=127, SemiColon=128, UtfEscape=129, WS=130, Normal_string=131;
	public static final int
		RULE_chunk = 0, RULE_module = 1, RULE_module_start = 2, RULE_module_name = 3, 
		RULE_module_import = 4, RULE_module_deport = 5, RULE_module_list = 6, 
		RULE_module_group = 7, RULE_module_name_or_group = 8, RULE_block = 9, 
		RULE_stat = 10, RULE_type_param = 11, RULE_type_param_list = 12, RULE_type_def = 13, 
		RULE_record_def = 14, RULE_record_member = 15, RULE_record_member_list = 16, 
		RULE_implementation_list = 17, RULE_using = 18, RULE_overloading_operator_param = 19, 
		RULE_overloading_operator = 20, RULE_operator_decl = 21, RULE_group_assignment = 22, 
		RULE_do_done_block = 23, RULE_composed_assign = 24, RULE_self_assign = 25, 
		RULE_if_then_else_block = 26, RULE_then_block = 27, RULE_else_block = 28, 
		RULE_forget = 29, RULE_flat_name_list = 30, RULE_loop = 31, RULE_for_each_loop = 32, 
		RULE_op_direction = 33, RULE_while_do_loop = 34, RULE_repeat_until_loop = 35, 
		RULE_function_yield = 36, RULE_try_catch = 37, RULE_demand = 38, RULE_annotation = 39, 
		RULE_group_var_decl = 40, RULE_var_signature = 41, RULE_var_decl = 42, 
		RULE_constant_qualifier = 43, RULE_by_type_var_decl = 44, RULE_by_value_var_decl = 45, 
		RULE_list_initializer = 46, RULE_explist = 47, RULE_exp = 48, RULE_range_array_initializer = 49, 
		RULE_comprehense_array_initializer = 50, RULE_map_element = 51, RULE_map_initializer = 52, 
		RULE_record_element = 53, RULE_record_element_list = 54, RULE_record_initializer = 55, 
		RULE_operator_logical = 56, RULE_default_match_branch = 57, RULE_match_branch = 58, 
		RULE_atom = 59, RULE_nil = 60, RULE_boolean = 61, RULE_number = 62, RULE_string = 63, 
		RULE_using_in_call = 64, RULE_var_signature_list = 65, RULE_func_output = 66, 
		RULE_local_funct = 67, RULE_funcbody = 68, RULE_lambda_decl = 69, RULE_operator_infix = 70, 
		RULE_default_infix_operator = 71, RULE_operator_composed = 72, RULE_operator_math = 73, 
		RULE_operator_postfix = 74, RULE_composed_assign_op = 75, RULE_operator_bitwise = 76, 
		RULE_operator_prefix = 77, RULE_operator_comparison = 78;
	private static String[] makeRuleNames() {
		return new String[] {
			"chunk", "module", "module_start", "module_name", "module_import", "module_deport", 
			"module_list", "module_group", "module_name_or_group", "block", "stat", 
			"type_param", "type_param_list", "type_def", "record_def", "record_member", 
			"record_member_list", "implementation_list", "using", "overloading_operator_param", 
			"overloading_operator", "operator_decl", "group_assignment", "do_done_block", 
			"composed_assign", "self_assign", "if_then_else_block", "then_block", 
			"else_block", "forget", "flat_name_list", "loop", "for_each_loop", "op_direction", 
			"while_do_loop", "repeat_until_loop", "function_yield", "try_catch", 
			"demand", "annotation", "group_var_decl", "var_signature", "var_decl", 
			"constant_qualifier", "by_type_var_decl", "by_value_var_decl", "list_initializer", 
			"explist", "exp", "range_array_initializer", "comprehense_array_initializer", 
			"map_element", "map_initializer", "record_element", "record_element_list", 
			"record_initializer", "operator_logical", "default_match_branch", "match_branch", 
			"atom", "nil", "boolean", "number", "string", "using_in_call", "var_signature_list", 
			"func_output", "local_funct", "funcbody", "lambda_decl", "operator_infix", 
			"default_infix_operator", "operator_composed", "operator_math", "operator_postfix", 
			"composed_assign_op", "operator_bitwise", "operator_prefix", "operator_comparison"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@'", "'\\'", "'`'", null, null, "':'", "','", null, "'.'", null, 
			null, null, null, null, null, null, null, "'as'", "'break'", "'catch'", 
			"'continue'", "'commonof'", "'default'", "'define'", "'demand'", "'deports'", 
			"'do'", "'doif'", "'doifn'", "'done'", "'else'", "'end'", "'enum'", "'eval'", 
			"'every'", "'exec'", "'exit'", null, "'final'", "'for'", "'forget'", 
			"'funct'", "'if'", "'implements'", "'imports'", null, "'infix'", "'instanceof'", 
			"'is'", "'local'", "'match'", "'matched'", "'module'", "'nil'", null, 
			"'of'", "'operator'", "'postfix'", "'prefix'", "'record'", "'repeat'", 
			"'return'", "'reverse'", "'then'", "'to'", null, "'try'", "'type'", "'typeof'", 
			"'until'", "'val'", "'var'", "'vals'", "'vars'", "'while'", "'yield'", 
			"'lambda'", null, null, "'$$NATIVE.'", "'+'", null, "';;'", "'<<<'", 
			"'>>>'", "'='", null, "'&'", "'<<'", "'|'", "'>>'", "'bxor'", "'-->'", 
			null, null, "'<:'", null, "'>'", "'//'", "'==>'", "'['", "'{'", "'('", 
			"'#'", "'<'", null, "'%'", null, null, null, "'...'", "'^'", "'..'", 
			"'<|>'", "']'", "'}'", "')'", "'=='", "'-'", "'~'", null, null, null, 
			null, null, "'?'", null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AtSign", "BackSlash", "BackTick", "BlockComment", "Char_String", 
			"Colon", "Comma", "DecimalEscape", "Dot", "EscapeCharacter", "EscapeSequence", 
			"Float", "HexEscape", "HexFloat", "HexInt", "Int", "KW_All", "KW_As", 
			"KW_Break", "KW_Catch", "KW_Continue", "KW_CommonOf", "KW_Default", "KW_Define", 
			"KW_Demand", "KW_Deports", "KW_Do", "KW_Doif", "KW_Doifn", "KW_Done", 
			"KW_Else", "KW_End", "KW_Enum", "KW_Eval", "KW_Every", "KW_Exec", "KW_Exit", 
			"KW_False", "KW_Final", "KW_For", "KW_Forget", "KW_Funct", "KW_If", "KW_Implements", 
			"KW_Imports", "KW_In", "KW_Infix", "KW_InstanceOf", "KW_Is", "KW_Local", 
			"KW_Match", "KW_Matched", "KW_Module", "KW_Nil", "KW_Not_In", "KW_Of", 
			"KW_Operator", "KW_Postfix", "KW_Prefix", "KW_Record", "KW_Repeat", "KW_Return", 
			"KW_Reverse", "KW_Then", "KW_To", "KW_True", "KW_Try", "KW_Type", "KW_TypeOf", 
			"KW_Until", "KW_VAL", "KW_VAR", "KW_Vals", "KW_Vars", "KW_While", "KW_Yield", 
			"Lambda", "LineComment", "NAME", "NATIVE", "OP_Add", "OP_And", "OP_Append", 
			"OP_Arithmetic_LeftShift", "OP_Arithmetic_RightShift", "OP_Assign", "OP_Backward", 
			"OP_Bit_And", "OP_Bit_LeftShift", "OP_Bit_Or", "OP_Bit_RightShift", "OP_Bit_Xor", 
			"OP_Case_Arrow", "OP_Div", "OP_Equal", "OP_Extends", "OP_Forward", "OP_Greater", 
			"OP_IntDiv", "OP_LambdaReturn", "OP_LeftBracket", "OP_LeftCurly", "OP_LeftPar", 
			"OP_Length", "OP_Less", "OP_Less_Equal", "OP_Mod", "OP_Mult", "OP_Not", 
			"OP_Or", "OP_Pass", "OP_Power", "OP_Range", "OP_Reverse", "OP_RightBracket", 
			"OP_RightCurly", "OP_RightPar", "OP_Similar", "OP_Sub", "OP_Tilda", "OP_Xor", 
			"Op_Greater_Equal", "Op_Not_Equal", "Op_Not_Similar", "Op_Custom", "Question", 
			"SHEBANG", "SemiColon", "UtfEscape", "WS", "Normal_string"
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
	public String getGrammarFileName() { return "Nutt.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Nutt(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChunkContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Nutt.EOF, 0); }
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public ChunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chunk; }
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
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_Module) {
				{
				setState(158);
				module();
				}
			}

			setState(161);
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
		public TerminalNode KW_End() { return getToken(Nutt.KW_End, 0); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_module);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			module_start();
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(164);
					module_import();
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(170);
			block();
			setState(171);
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
		public TerminalNode KW_Module() { return getToken(Nutt.KW_Module, 0); }
		public Module_nameContext module_name() {
			return getRuleContext(Module_nameContext.class,0);
		}
		public Module_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_start; }
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
			setState(173);
			match(KW_Module);
			setState(174);
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
		public List<TerminalNode> NAME() { return getTokens(Nutt.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(Nutt.NAME, i);
		}
		public List<TerminalNode> Dot() { return getTokens(Nutt.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(Nutt.Dot, i);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
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
			setState(176);
			match(NAME);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot) {
				{
				{
				setState(177);
				match(Dot);
				setState(178);
				match(NAME);
				}
				}
				setState(183);
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
		public TerminalNode KW_Imports() { return getToken(Nutt.KW_Imports, 0); }
		public Module_listContext module_list() {
			return getRuleContext(Module_listContext.class,0);
		}
		public Module_importContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_import; }
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
			setState(184);
			match(KW_Imports);
			setState(185);
			module_list();
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
	public static class Module_deportContext extends ParserRuleContext {
		public TerminalNode KW_Deports() { return getToken(Nutt.KW_Deports, 0); }
		public Module_listContext module_list() {
			return getRuleContext(Module_listContext.class,0);
		}
		public Module_deportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_deport; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitModule_deport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_deportContext module_deport() throws RecognitionException {
		Module_deportContext _localctx = new Module_deportContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_module_deport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(KW_Deports);
			setState(188);
			module_list();
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
		public List<Module_name_or_groupContext> module_name_or_group() {
			return getRuleContexts(Module_name_or_groupContext.class);
		}
		public Module_name_or_groupContext module_name_or_group(int i) {
			return getRuleContext(Module_name_or_groupContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(Nutt.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Nutt.Comma, i);
		}
		public Module_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitModule_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_listContext module_list() throws RecognitionException {
		Module_listContext _localctx = new Module_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_module_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			module_name_or_group();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(191);
				match(Comma);
				setState(192);
				module_name_or_group();
				}
				}
				setState(197);
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
	public static class Module_groupContext extends ParserRuleContext {
		public Module_nameContext module_name() {
			return getRuleContext(Module_nameContext.class,0);
		}
		public TerminalNode OP_LeftCurly() { return getToken(Nutt.OP_LeftCurly, 0); }
		public Module_listContext module_list() {
			return getRuleContext(Module_listContext.class,0);
		}
		public TerminalNode OP_RightCurly() { return getToken(Nutt.OP_RightCurly, 0); }
		public Module_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_group; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitModule_group(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_groupContext module_group() throws RecognitionException {
		Module_groupContext _localctx = new Module_groupContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_module_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			module_name();
			{
			setState(199);
			match(OP_LeftCurly);
			setState(200);
			module_list();
			setState(201);
			match(OP_RightCurly);
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
	public static class Module_name_or_groupContext extends ParserRuleContext {
		public Module_nameContext module_name() {
			return getRuleContext(Module_nameContext.class,0);
		}
		public Module_groupContext module_group() {
			return getRuleContext(Module_groupContext.class,0);
		}
		public Module_name_or_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name_or_group; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitModule_name_or_group(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_name_or_groupContext module_name_or_group() throws RecognitionException {
		Module_name_or_groupContext _localctx = new Module_name_or_groupContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_module_name_or_group);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				module_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				module_group();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4488029942472888354L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1130825664036841455L) != 0) || _la==Normal_string) {
				{
				{
				setState(207);
				stat();
				}
				}
				setState(212);
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
	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Exec_statContext extends StatContext {
		public TerminalNode KW_Exec() { return getToken(Nutt.KW_Exec, 0); }
		public TerminalNode OP_LeftPar() { return getToken(Nutt.OP_LeftPar, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode OP_RightPar() { return getToken(Nutt.OP_RightPar, 0); }
		public Exec_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitExec_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Functioncall_statContext extends StatContext {
		public Token name;
		public ExplistContext arguments;
		public TerminalNode OP_LeftPar() { return getToken(Nutt.OP_LeftPar, 0); }
		public TerminalNode OP_RightPar() { return getToken(Nutt.OP_RightPar, 0); }
		public TerminalNode NAME() { return getToken(Nutt.NAME, 0); }
		public Using_in_callContext using_in_call() {
			return getRuleContext(Using_in_callContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public Functioncall_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFunctioncall_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Exit_statContext extends StatContext {
		public TerminalNode KW_Exit() { return getToken(Nutt.KW_Exit, 0); }
		public Exit_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitExit_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Functiondef_statContext extends StatContext {
		public TerminalNode KW_Funct() { return getToken(Nutt.KW_Funct, 0); }
		public Flat_name_listContext flat_name_list() {
			return getRuleContext(Flat_name_listContext.class,0);
		}
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public Functiondef_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFunctiondef_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Yield_statContext extends StatContext {
		public Function_yieldContext function_yield() {
			return getRuleContext(Function_yieldContext.class,0);
		}
		public Yield_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitYield_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DemandStatContext extends StatContext {
		public DemandContext demand() {
			return getRuleContext(DemandContext.class,0);
		}
		public DemandStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitDemandStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Var_decl_statContext extends StatContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Var_decl_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitVar_decl_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Do_if_statContext extends StatContext {
		public TerminalNode KW_Doif() { return getToken(Nutt.KW_Doif, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public Do_if_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitDo_if_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Operator_decl_statContext extends StatContext {
		public Operator_declContext operator_decl() {
			return getRuleContext(Operator_declContext.class,0);
		}
		public Operator_decl_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitOperator_decl_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Module_import_statContext extends StatContext {
		public Module_importContext module_import() {
			return getRuleContext(Module_importContext.class,0);
		}
		public Module_import_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitModule_import_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Module_deport_statContext extends StatContext {
		public Module_deportContext module_deport() {
			return getRuleContext(Module_deportContext.class,0);
		}
		public Module_deport_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitModule_deport_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Pass_statContext extends StatContext {
		public TerminalNode OP_Pass() { return getToken(Nutt.OP_Pass, 0); }
		public Pass_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitPass_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Try_catch_statContext extends StatContext {
		public Try_catchContext try_catch() {
			return getRuleContext(Try_catchContext.class,0);
		}
		public Try_catch_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitTry_catch_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Composed_assign_statContext extends StatContext {
		public Composed_assignContext composed_assign() {
			return getRuleContext(Composed_assignContext.class,0);
		}
		public Composed_assign_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitComposed_assign_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Do_if_not_statContext extends StatContext {
		public TerminalNode KW_Doifn() { return getToken(Nutt.KW_Doifn, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public Do_if_not_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitDo_if_not_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Record_def_statContext extends StatContext {
		public Record_defContext record_def() {
			return getRuleContext(Record_defContext.class,0);
		}
		public Record_def_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitRecord_def_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Forget_statContext extends StatContext {
		public ForgetContext forget() {
			return getRuleContext(ForgetContext.class,0);
		}
		public Forget_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitForget_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Break_statContext extends StatContext {
		public TerminalNode KW_Break() { return getToken(Nutt.KW_Break, 0); }
		public Break_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitBreak_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Loop_statContext extends StatContext {
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public Loop_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitLoop_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class If_then_else_block_statContext extends StatContext {
		public If_then_else_blockContext if_then_else_block() {
			return getRuleContext(If_then_else_blockContext.class,0);
		}
		public If_then_else_block_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitIf_then_else_block_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Group_assignment_statContext extends StatContext {
		public Group_assignmentContext group_assignment() {
			return getRuleContext(Group_assignmentContext.class,0);
		}
		public Group_assignment_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitGroup_assignment_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Group_var_decl_statContext extends StatContext {
		public Group_var_declContext group_var_decl() {
			return getRuleContext(Group_var_declContext.class,0);
		}
		public Group_var_decl_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitGroup_var_decl_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Continue_statContext extends StatContext {
		public TerminalNode KW_Continue() { return getToken(Nutt.KW_Continue, 0); }
		public Continue_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitContinue_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Do_done_block_statContext extends StatContext {
		public Do_done_blockContext do_done_block() {
			return getRuleContext(Do_done_blockContext.class,0);
		}
		public Do_done_block_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitDo_done_block_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Self_in_place_op_statContext extends StatContext {
		public Self_assignContext self_assign() {
			return getRuleContext(Self_assignContext.class,0);
		}
		public Self_in_place_op_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitSelf_in_place_op_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Type_def_statContext extends StatContext {
		public Type_defContext type_def() {
			return getRuleContext(Type_defContext.class,0);
		}
		public Type_def_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitType_def_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stat);
		int _la;
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new DemandStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				demand();
				}
				break;
			case 2:
				_localctx = new Do_if_statContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(KW_Doif);
				setState(215);
				exp(0);
				setState(216);
				stat();
				}
				break;
			case 3:
				_localctx = new Do_if_not_statContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				match(KW_Doifn);
				setState(219);
				exp(0);
				setState(220);
				stat();
				}
				break;
			case 4:
				_localctx = new Exec_statContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				match(KW_Exec);
				setState(223);
				match(OP_LeftPar);
				setState(224);
				stat();
				setState(225);
				match(OP_RightPar);
				}
				break;
			case 5:
				_localctx = new Module_import_statContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(227);
				module_import();
				}
				break;
			case 6:
				_localctx = new Module_deport_statContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(228);
				module_deport();
				}
				break;
			case 7:
				_localctx = new Group_assignment_statContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(229);
				group_assignment();
				}
				break;
			case 8:
				_localctx = new Group_var_decl_statContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(230);
				group_var_decl();
				}
				break;
			case 9:
				_localctx = new Var_decl_statContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(231);
				var_decl();
				}
				break;
			case 10:
				_localctx = new Operator_decl_statContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(232);
				operator_decl();
				}
				break;
			case 11:
				_localctx = new Forget_statContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(233);
				forget();
				}
				break;
			case 12:
				_localctx = new Functiondef_statContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(234);
				match(KW_Funct);
				setState(235);
				flat_name_list();
				setState(236);
				funcbody();
				}
				break;
			case 13:
				_localctx = new Functioncall_statContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(238);
				((Functioncall_statContext)_localctx).name = match(NAME);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_LeftCurly) {
					{
					setState(239);
					using_in_call();
					}
				}

				setState(242);
				match(OP_LeftPar);
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 20270888565985314L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1130825664036839433L) != 0) || _la==Normal_string) {
					{
					setState(243);
					((Functioncall_statContext)_localctx).arguments = explist();
					}
				}

				setState(246);
				match(OP_RightPar);
				}
				break;
			case 14:
				_localctx = new Do_done_block_statContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(247);
				do_done_block();
				}
				break;
			case 15:
				_localctx = new Loop_statContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(248);
				loop();
				}
				break;
			case 16:
				_localctx = new Composed_assign_statContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(249);
				composed_assign();
				}
				break;
			case 17:
				_localctx = new Self_in_place_op_statContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(250);
				self_assign();
				}
				break;
			case 18:
				_localctx = new If_then_else_block_statContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(251);
				if_then_else_block();
				}
				break;
			case 19:
				_localctx = new Try_catch_statContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(252);
				try_catch();
				}
				break;
			case 20:
				_localctx = new Pass_statContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(253);
				match(OP_Pass);
				}
				break;
			case 21:
				_localctx = new Type_def_statContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(254);
				type_def();
				}
				break;
			case 22:
				_localctx = new Record_def_statContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(255);
				record_def();
				}
				break;
			case 23:
				_localctx = new Exit_statContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(256);
				match(KW_Exit);
				}
				break;
			case 24:
				_localctx = new Yield_statContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(257);
				function_yield();
				}
				break;
			case 25:
				_localctx = new Break_statContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(258);
				match(KW_Break);
				}
				break;
			case 26:
				_localctx = new Continue_statContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(259);
				match(KW_Continue);
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
	public static class Type_paramContext extends ParserRuleContext {
		public Token flat_type;
		public Token complex_type_start;
		public TerminalNode NAME() { return getToken(Nutt.NAME, 0); }
		public TerminalNode OP_Bit_Or() { return getToken(Nutt.OP_Bit_Or, 0); }
		public Type_paramContext type_param() {
			return getRuleContext(Type_paramContext.class,0);
		}
		public Type_param_listContext type_param_list() {
			return getRuleContext(Type_param_listContext.class,0);
		}
		public Type_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitType_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_paramContext type_param() throws RecognitionException {
		Type_paramContext _localctx = new Type_paramContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type_param);
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				((Type_paramContext)_localctx).flat_type = match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				((Type_paramContext)_localctx).complex_type_start = match(NAME);
				setState(264);
				match(OP_Bit_Or);
				setState(267);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NAME:
					{
					setState(265);
					type_param();
					}
					break;
				case OP_LeftCurly:
					{
					setState(266);
					type_param_list();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
	public static class Type_param_listContext extends ParserRuleContext {
		public TerminalNode OP_LeftCurly() { return getToken(Nutt.OP_LeftCurly, 0); }
		public List<Type_paramContext> type_param() {
			return getRuleContexts(Type_paramContext.class);
		}
		public Type_paramContext type_param(int i) {
			return getRuleContext(Type_paramContext.class,i);
		}
		public TerminalNode OP_RightCurly() { return getToken(Nutt.OP_RightCurly, 0); }
		public List<TerminalNode> Comma() { return getTokens(Nutt.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Nutt.Comma, i);
		}
		public Type_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_param_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitType_param_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_param_listContext type_param_list() throws RecognitionException {
		Type_param_listContext _localctx = new Type_param_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(OP_LeftCurly);
			setState(272);
			type_param();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(273);
				match(Comma);
				setState(274);
				type_param();
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
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
	public static class Type_defContext extends ParserRuleContext {
		public Type_paramContext derived_type;
		public Type_paramContext parent_type;
		public Type_param_listContext children;
		public TerminalNode KW_Type() { return getToken(Nutt.KW_Type, 0); }
		public List<Type_paramContext> type_param() {
			return getRuleContexts(Type_paramContext.class);
		}
		public Type_paramContext type_param(int i) {
			return getRuleContext(Type_paramContext.class,i);
		}
		public Type_param_listContext type_param_list() {
			return getRuleContext(Type_param_listContext.class,0);
		}
		public TerminalNode OP_Extends() { return getToken(Nutt.OP_Extends, 0); }
		public Type_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitType_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_defContext type_def() throws RecognitionException {
		Type_defContext _localctx = new Type_defContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(KW_Type);
			setState(283);
			((Type_defContext)_localctx).derived_type = type_param();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Extends) {
				{
				setState(284);
				match(OP_Extends);
				setState(285);
				((Type_defContext)_localctx).parent_type = type_param();
				}
			}

			setState(288);
			((Type_defContext)_localctx).children = type_param_list();
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
	public static class Record_defContext extends ParserRuleContext {
		public TerminalNode KW_Record() { return getToken(Nutt.KW_Record, 0); }
		public TerminalNode NAME() { return getToken(Nutt.NAME, 0); }
		public TerminalNode OP_LeftCurly() { return getToken(Nutt.OP_LeftCurly, 0); }
		public Record_member_listContext record_member_list() {
			return getRuleContext(Record_member_listContext.class,0);
		}
		public TerminalNode OP_RightCurly() { return getToken(Nutt.OP_RightCurly, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Implementation_listContext implementation_list() {
			return getRuleContext(Implementation_listContext.class,0);
		}
		public Record_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitRecord_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Record_defContext record_def() throws RecognitionException {
		Record_defContext _localctx = new Record_defContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_record_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AtSign) {
				{
				{
				setState(290);
				annotation();
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
			match(KW_Record);
			setState(297);
			match(NAME);
			setState(298);
			match(OP_LeftCurly);
			setState(299);
			record_member_list();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_Implements) {
				{
				setState(300);
				implementation_list();
				}
			}

			setState(303);
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
	public static class Record_memberContext extends ParserRuleContext {
		public TerminalNode Char_String() { return getToken(Nutt.Char_String, 0); }
		public By_type_var_declContext by_type_var_decl() {
			return getRuleContext(By_type_var_declContext.class,0);
		}
		public Record_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_member; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitRecord_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Record_memberContext record_member() throws RecognitionException {
		Record_memberContext _localctx = new Record_memberContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_record_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(Char_String);
			setState(306);
			by_type_var_decl();
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
	public static class Record_member_listContext extends ParserRuleContext {
		public List<Record_memberContext> record_member() {
			return getRuleContexts(Record_memberContext.class);
		}
		public Record_memberContext record_member(int i) {
			return getRuleContext(Record_memberContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(Nutt.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Nutt.Comma, i);
		}
		public Record_member_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_member_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitRecord_member_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Record_member_listContext record_member_list() throws RecognitionException {
		Record_member_listContext _localctx = new Record_member_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_record_member_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			record_member();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(309);
				match(Comma);
				setState(310);
				record_member();
				}
				}
				setState(315);
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
	public static class Implementation_listContext extends ParserRuleContext {
		public TerminalNode KW_Implements() { return getToken(Nutt.KW_Implements, 0); }
		public List<Operator_declContext> operator_decl() {
			return getRuleContexts(Operator_declContext.class);
		}
		public Operator_declContext operator_decl(int i) {
			return getRuleContext(Operator_declContext.class,i);
		}
		public List<Lambda_declContext> lambda_decl() {
			return getRuleContexts(Lambda_declContext.class);
		}
		public Lambda_declContext lambda_decl(int i) {
			return getRuleContext(Lambda_declContext.class,i);
		}
		public Implementation_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementation_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitImplementation_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Implementation_listContext implementation_list() throws RecognitionException {
		Implementation_listContext _localctx = new Implementation_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_implementation_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(KW_Implements);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008947054019346434L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 25165825L) != 0)) {
				{
				setState(319);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_Infix:
				case KW_Operator:
				case KW_Postfix:
				case KW_Prefix:
					{
					setState(317);
					operator_decl();
					}
					break;
				case AtSign:
				case NAME:
				case OP_LeftCurly:
				case OP_LeftPar:
					{
					setState(318);
					lambda_decl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(323);
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
	public static class UsingContext extends ParserRuleContext {
		public TerminalNode OP_LeftCurly() { return getToken(Nutt.OP_LeftCurly, 0); }
		public List<Overloading_operator_paramContext> overloading_operator_param() {
			return getRuleContexts(Overloading_operator_paramContext.class);
		}
		public Overloading_operator_paramContext overloading_operator_param(int i) {
			return getRuleContext(Overloading_operator_paramContext.class,i);
		}
		public TerminalNode OP_RightCurly() { return getToken(Nutt.OP_RightCurly, 0); }
		public List<TerminalNode> Comma() { return getTokens(Nutt.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Nutt.Comma, i);
		}
		public UsingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitUsing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingContext using() throws RecognitionException {
		UsingContext _localctx = new UsingContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_using);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(OP_LeftCurly);
			setState(325);
			overloading_operator_param();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(326);
				match(Comma);
				setState(327);
				overloading_operator_param();
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(333);
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
	public static class Overloading_operator_paramContext extends ParserRuleContext {
		public List<Overloading_operatorContext> overloading_operator() {
			return getRuleContexts(Overloading_operatorContext.class);
		}
		public Overloading_operatorContext overloading_operator(int i) {
			return getRuleContext(Overloading_operatorContext.class,i);
		}
		public TerminalNode KW_As() { return getToken(Nutt.KW_As, 0); }
		public TerminalNode NAME() { return getToken(Nutt.NAME, 0); }
		public List<TerminalNode> Comma() { return getTokens(Nutt.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Nutt.Comma, i);
		}
		public Overloading_operator_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overloading_operator_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitOverloading_operator_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Overloading_operator_paramContext overloading_operator_param() throws RecognitionException {
		Overloading_operator_paramContext _localctx = new Overloading_operator_paramContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_overloading_operator_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			overloading_operator();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(336);
				match(Comma);
				setState(337);
				overloading_operator();
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343);
			match(KW_As);
			setState(344);
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
	public static class Overloading_operatorContext extends ParserRuleContext {
		public Operator_infixContext operator_infix() {
			return getRuleContext(Operator_infixContext.class,0);
		}
		public Operator_prefixContext operator_prefix() {
			return getRuleContext(Operator_prefixContext.class,0);
		}
		public Operator_postfixContext operator_postfix() {
			return getRuleContext(Operator_postfixContext.class,0);
		}
		public Overloading_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overloading_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitOverloading_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Overloading_operatorContext overloading_operator() throws RecognitionException {
		Overloading_operatorContext _localctx = new Overloading_operatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_overloading_operator);
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				operator_infix();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				operator_prefix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(348);
				operator_postfix();
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
	public static class Operator_declContext extends ParserRuleContext {
		public TerminalNode KW_Operator() { return getToken(Nutt.KW_Operator, 0); }
		public Overloading_operatorContext overloading_operator() {
			return getRuleContext(Overloading_operatorContext.class,0);
		}
		public Local_functContext local_funct() {
			return getRuleContext(Local_functContext.class,0);
		}
		public TerminalNode KW_Prefix() { return getToken(Nutt.KW_Prefix, 0); }
		public TerminalNode KW_Infix() { return getToken(Nutt.KW_Infix, 0); }
		public TerminalNode KW_Postfix() { return getToken(Nutt.KW_Postfix, 0); }
		public Operator_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitOperator_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_declContext operator_decl() throws RecognitionException {
		Operator_declContext _localctx = new Operator_declContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_operator_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 864831865943490560L) != 0)) {
				{
				setState(351);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 864831865943490560L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(354);
			match(KW_Operator);
			setState(355);
			overloading_operator();
			setState(356);
			local_funct();
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
		public ExplistContext variables;
		public ExplistContext expressions;
		public TerminalNode OP_Assign() { return getToken(Nutt.OP_Assign, 0); }
		public List<ExplistContext> explist() {
			return getRuleContexts(ExplistContext.class);
		}
		public ExplistContext explist(int i) {
			return getRuleContext(ExplistContext.class,i);
		}
		public Group_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitGroup_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_assignmentContext group_assignment() throws RecognitionException {
		Group_assignmentContext _localctx = new Group_assignmentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_group_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			((Group_assignmentContext)_localctx).variables = explist();
			setState(359);
			match(OP_Assign);
			setState(360);
			((Group_assignmentContext)_localctx).expressions = explist();
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
		public TerminalNode KW_Do() { return getToken(Nutt.KW_Do, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode KW_Done() { return getToken(Nutt.KW_Done, 0); }
		public Do_done_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_done_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitDo_done_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_done_blockContext do_done_block() throws RecognitionException {
		Do_done_blockContext _localctx = new Do_done_blockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_do_done_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(KW_Do);
			setState(363);
			block();
			setState(364);
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
	public static class Composed_assignContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(Nutt.NAME, 0); }
		public Operator_composedContext operator_composed() {
			return getRuleContext(Operator_composedContext.class,0);
		}
		public Composed_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_composed_assign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitComposed_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Composed_assignContext composed_assign() throws RecognitionException {
		Composed_assignContext _localctx = new Composed_assignContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_composed_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(NAME);
			setState(367);
			operator_composed();
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
	public static class Self_assignContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(Nutt.NAME, 0); }
		public Operator_postfixContext operator_postfix() {
			return getRuleContext(Operator_postfixContext.class,0);
		}
		public Self_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self_assign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitSelf_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Self_assignContext self_assign() throws RecognitionException {
		Self_assignContext _localctx = new Self_assignContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_self_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(NAME);
			setState(370);
			operator_postfix();
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
		public TerminalNode KW_If() { return getToken(Nutt.KW_If, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Then_blockContext then_block() {
			return getRuleContext(Then_blockContext.class,0);
		}
		public TerminalNode KW_End() { return getToken(Nutt.KW_End, 0); }
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_then_else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_then_else_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitIf_then_else_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_then_else_blockContext if_then_else_block() throws RecognitionException {
		If_then_else_blockContext _localctx = new If_then_else_blockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_if_then_else_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(KW_If);
			setState(373);
			exp(0);
			setState(374);
			then_block();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_Else) {
				{
				setState(375);
				else_block();
				}
			}

			setState(378);
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
		public TerminalNode KW_Then() { return getToken(Nutt.KW_Then, 0); }
		public Then_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_then_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitThen_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Then_blockContext then_block() throws RecognitionException {
		Then_blockContext _localctx = new Then_blockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_then_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_Then) {
				{
				setState(380);
				match(KW_Then);
				}
			}

			setState(383);
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
		public TerminalNode KW_Else() { return getToken(Nutt.KW_Else, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitElse_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(KW_Else);
			setState(386);
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
		public TerminalNode KW_Forget() { return getToken(Nutt.KW_Forget, 0); }
		public TerminalNode KW_All() { return getToken(Nutt.KW_All, 0); }
		public Flat_name_listContext flat_name_list() {
			return getRuleContext(Flat_name_listContext.class,0);
		}
		public ForgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forget; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitForget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForgetContext forget() throws RecognitionException {
		ForgetContext _localctx = new ForgetContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_forget);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(KW_Forget);
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_All:
				{
				setState(389);
				match(KW_All);
				}
				break;
			case NAME:
				{
				setState(390);
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
		public List<TerminalNode> NAME() { return getTokens(Nutt.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(Nutt.NAME, i);
		}
		public List<TerminalNode> Comma() { return getTokens(Nutt.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Nutt.Comma, i);
		}
		public Flat_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flat_name_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFlat_name_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flat_name_listContext flat_name_list() throws RecognitionException {
		Flat_name_listContext _localctx = new Flat_name_listContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_flat_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(NAME);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(394);
				match(Comma);
				setState(395);
				match(NAME);
				}
				}
				setState(400);
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
	public static class LoopContext extends ParserRuleContext {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_loop);
		try {
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_For:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				for_each_loop();
				}
				break;
			case KW_While:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				while_do_loop();
				}
				break;
			case KW_Repeat:
				enterOuterAlt(_localctx, 3);
				{
				setState(403);
				repeat_until_loop();
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
	public static class For_each_loopContext extends ParserRuleContext {
		public TerminalNode KW_For() { return getToken(Nutt.KW_For, 0); }
		public TerminalNode NAME() { return getToken(Nutt.NAME, 0); }
		public Op_directionContext op_direction() {
			return getRuleContext(Op_directionContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public For_each_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_each_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFor_each_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_each_loopContext for_each_loop() throws RecognitionException {
		For_each_loopContext _localctx = new For_each_loopContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_for_each_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(KW_For);
			setState(407);
			match(NAME);
			setState(408);
			op_direction();
			setState(409);
			explist();
			setState(410);
			stat();
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
	public static class Op_directionContext extends ParserRuleContext {
		public TerminalNode OP_Forward() { return getToken(Nutt.OP_Forward, 0); }
		public TerminalNode OP_Backward() { return getToken(Nutt.OP_Backward, 0); }
		public Op_directionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_direction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitOp_direction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_directionContext op_direction() throws RecognitionException {
		Op_directionContext _localctx = new Op_directionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_op_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_la = _input.LA(1);
			if ( !(_la==OP_Backward || _la==OP_Forward) ) {
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
	public static class While_do_loopContext extends ParserRuleContext {
		public TerminalNode KW_While() { return getToken(Nutt.KW_While, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public While_do_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_do_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitWhile_do_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_do_loopContext while_do_loop() throws RecognitionException {
		While_do_loopContext _localctx = new While_do_loopContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_while_do_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(KW_While);
			setState(415);
			explist();
			setState(416);
			stat();
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
		public TerminalNode KW_Repeat() { return getToken(Nutt.KW_Repeat, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode KW_Until() { return getToken(Nutt.KW_Until, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public Repeat_until_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_until_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitRepeat_until_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repeat_until_loopContext repeat_until_loop() throws RecognitionException {
		Repeat_until_loopContext _localctx = new Repeat_until_loopContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_repeat_until_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(KW_Repeat);
			setState(419);
			block();
			setState(420);
			match(KW_Until);
			setState(421);
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
	public static class Function_yieldContext extends ParserRuleContext {
		public TerminalNode KW_Yield() { return getToken(Nutt.KW_Yield, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Function_yieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_yield; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFunction_yield(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_yieldContext function_yield() throws RecognitionException {
		Function_yieldContext _localctx = new Function_yieldContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_function_yield);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(KW_Yield);
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(424);
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
	public static class Try_catchContext extends ParserRuleContext {
		public BlockContext try_branch;
		public BlockContext catch_branch;
		public TerminalNode KW_Try() { return getToken(Nutt.KW_Try, 0); }
		public TerminalNode KW_Catch() { return getToken(Nutt.KW_Catch, 0); }
		public TerminalNode KW_End() { return getToken(Nutt.KW_End, 0); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitTry_catch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_catchContext try_catch() throws RecognitionException {
		Try_catchContext _localctx = new Try_catchContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_try_catch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(KW_Try);
			setState(428);
			((Try_catchContext)_localctx).try_branch = block();
			setState(429);
			match(KW_Catch);
			setState(430);
			((Try_catchContext)_localctx).catch_branch = block();
			setState(431);
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
		public TerminalNode KW_Demand() { return getToken(Nutt.KW_Demand, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DemandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_demand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitDemand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DemandContext demand() throws RecognitionException {
		DemandContext _localctx = new DemandContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_demand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(KW_Demand);
			setState(434);
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
	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AtSign() { return getToken(Nutt.AtSign, 0); }
		public TerminalNode NAME() { return getToken(Nutt.NAME, 0); }
		public TerminalNode OP_LeftPar() { return getToken(Nutt.OP_LeftPar, 0); }
		public Record_element_listContext record_element_list() {
			return getRuleContext(Record_element_listContext.class,0);
		}
		public TerminalNode OP_RightPar() { return getToken(Nutt.OP_RightPar, 0); }
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(AtSign);
			setState(437);
			match(NAME);
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(438);
				match(OP_LeftPar);
				setState(439);
				record_element_list();
				setState(440);
				match(OP_RightPar);
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
	public static class Group_var_declContext extends ParserRuleContext {
		public Var_signature_listContext var_signature_list() {
			return getRuleContext(Var_signature_listContext.class,0);
		}
		public TerminalNode KW_Vars() { return getToken(Nutt.KW_Vars, 0); }
		public TerminalNode KW_Vals() { return getToken(Nutt.KW_Vals, 0); }
		public Group_var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_var_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitGroup_var_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_var_declContext group_var_decl() throws RecognitionException {
		Group_var_declContext _localctx = new Group_var_declContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_group_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			_la = _input.LA(1);
			if ( !(_la==KW_Vals || _la==KW_Vars) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(445);
			var_signature_list();
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
	public static class Var_signatureContext extends ParserRuleContext {
		public By_type_var_declContext by_type;
		public By_value_var_declContext by_value;
		public TerminalNode NAME() { return getToken(Nutt.NAME, 0); }
		public By_type_var_declContext by_type_var_decl() {
			return getRuleContext(By_type_var_declContext.class,0);
		}
		public By_value_var_declContext by_value_var_decl() {
			return getRuleContext(By_value_var_declContext.class,0);
		}
		public Var_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_signature; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitVar_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_signatureContext var_signature() throws RecognitionException {
		Var_signatureContext _localctx = new Var_signatureContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_var_signature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(NAME);
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(448);
				((Var_signatureContext)_localctx).by_type = by_type_var_decl();
				}
				break;
			}
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(451);
				((Var_signatureContext)_localctx).by_value = by_value_var_decl();
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
	public static class Var_declContext extends ParserRuleContext {
		public Constant_qualifierContext constant_qualifier() {
			return getRuleContext(Constant_qualifierContext.class,0);
		}
		public Var_signatureContext var_signature() {
			return getRuleContext(Var_signatureContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			constant_qualifier();
			setState(455);
			var_signature();
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
		public TerminalNode KW_VAR() { return getToken(Nutt.KW_VAR, 0); }
		public TerminalNode KW_VAL() { return getToken(Nutt.KW_VAL, 0); }
		public Constant_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_qualifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitConstant_qualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_qualifierContext constant_qualifier() throws RecognitionException {
		Constant_qualifierContext _localctx = new Constant_qualifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_constant_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_la = _input.LA(1);
			if ( !(_la==KW_VAL || _la==KW_VAR) ) {
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
	public static class By_type_var_declContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(Nutt.Colon, 0); }
		public Type_paramContext type_param() {
			return getRuleContext(Type_paramContext.class,0);
		}
		public By_type_var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_by_type_var_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitBy_type_var_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final By_type_var_declContext by_type_var_decl() throws RecognitionException {
		By_type_var_declContext _localctx = new By_type_var_declContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_by_type_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(Colon);
			setState(460);
			type_param();
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
		public TerminalNode OP_Assign() { return getToken(Nutt.OP_Assign, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public By_value_var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_by_value_var_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitBy_value_var_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final By_value_var_declContext by_value_var_decl() throws RecognitionException {
		By_value_var_declContext _localctx = new By_value_var_declContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_by_value_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(OP_Assign);
			setState(463);
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
	public static class List_initializerContext extends ParserRuleContext {
		public TerminalNode OP_LeftCurly() { return getToken(Nutt.OP_LeftCurly, 0); }
		public TerminalNode OP_RightCurly() { return getToken(Nutt.OP_RightCurly, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public List_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_initializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitList_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_initializerContext list_initializer() throws RecognitionException {
		List_initializerContext _localctx = new List_initializerContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_list_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(OP_LeftCurly);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 20270888565985314L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1130825664036839433L) != 0) || _la==Normal_string) {
				{
				setState(466);
				explist();
				}
			}

			setState(469);
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
	public static class ExplistContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(Nutt.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Nutt.Comma, i);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitExplist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_explist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			exp(0);
			setState(476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(472);
					match(Comma);
					setState(473);
					exp(0);
					}
					} 
				}
				setState(478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
	public static class Explicit_arrayContext extends ExpContext {
		public List_initializerContext list_initializer() {
			return getRuleContext(List_initializerContext.class,0);
		}
		public Explicit_arrayContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitExplicit_array(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Explicit_variableContext extends ExpContext {
		public TerminalNode NAME() { return getToken(Nutt.NAME, 0); }
		public Explicit_variableContext(ExpContext ctx) { copyFrom(ctx); }
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
		public TerminalNode OP_LeftBracket() { return getToken(Nutt.OP_LeftBracket, 0); }
		public TerminalNode OP_RightBracket() { return getToken(Nutt.OP_RightBracket, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Array_accessContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitArray_access(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Using_expContext extends ExpContext {
		public ExpContext left;
		public Token used;
		public ExpContext right;
		public List<TerminalNode> BackTick() { return getTokens(Nutt.BackTick); }
		public TerminalNode BackTick(int i) {
			return getToken(Nutt.BackTick, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode NAME() { return getToken(Nutt.NAME, 0); }
		public Using_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitUsing_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Prefix_expContext extends ExpContext {
		public Operator_prefixContext operator_prefix() {
			return getRuleContext(Operator_prefixContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Prefix_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitPrefix_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Instance_of_expContext extends ExpContext {
		public ExpContext to_check;
		public ExpContext type_exp;
		public TerminalNode KW_InstanceOf() { return getToken(Nutt.KW_InstanceOf, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode NAME() { return getToken(Nutt.NAME, 0); }
		public Instance_of_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitInstance_of_exp(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitExplicit_atom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Function_definition_expContext extends ExpContext {
		public Local_functContext local_funct() {
			return getRuleContext(Local_functContext.class,0);
		}
		public Function_definition_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFunction_definition_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Type_of_expContext extends ExpContext {
		public TerminalNode KW_TypeOf() { return getToken(Nutt.KW_TypeOf, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Type_of_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitType_of_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Contains_expContext extends ExpContext {
		public ExpContext left;
		public Token in;
		public Token not_in;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode KW_In() { return getToken(Nutt.KW_In, 0); }
		public TerminalNode KW_Not_In() { return getToken(Nutt.KW_Not_In, 0); }
		public Contains_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitContains_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Comprehense_array_initializer_expContext extends ExpContext {
		public Comprehense_array_initializerContext comprehense_array_initializer() {
			return getRuleContext(Comprehense_array_initializerContext.class,0);
		}
		public Comprehense_array_initializer_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitComprehense_array_initializer_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Range_array_initializer_expContext extends ExpContext {
		public Range_array_initializerContext range_array_initializer() {
			return getRuleContext(Range_array_initializerContext.class,0);
		}
		public Range_array_initializer_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitRange_array_initializer_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Eval_expContext extends ExpContext {
		public TerminalNode KW_Eval() { return getToken(Nutt.KW_Eval, 0); }
		public TerminalNode OP_LeftPar() { return getToken(Nutt.OP_LeftPar, 0); }
		public TerminalNode OP_RightPar() { return getToken(Nutt.OP_RightPar, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Eval_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitEval_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Common_of_expContext extends ExpContext {
		public TerminalNode KW_CommonOf() { return getToken(Nutt.KW_CommonOf, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public Common_of_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitCommon_of_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Record_initializer_expContext extends ExpContext {
		public Record_initializerContext record_initializer() {
			return getRuleContext(Record_initializerContext.class,0);
		}
		public Record_initializer_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitRecord_initializer_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Func_call_expContext extends ExpContext {
		public ExpContext name;
		public ExplistContext arguments;
		public TerminalNode OP_LeftPar() { return getToken(Nutt.OP_LeftPar, 0); }
		public TerminalNode OP_RightPar() { return getToken(Nutt.OP_RightPar, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Using_in_callContext using_in_call() {
			return getRuleContext(Using_in_callContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public Func_call_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFunc_call_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Spread_expContext extends ExpContext {
		public TerminalNode OP_Pass() { return getToken(Nutt.OP_Pass, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Spread_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitSpread_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Quarternary_expContext extends ExpContext {
		public ExpContext cond;
		public ExpContext if_true;
		public ExpContext if_false;
		public TerminalNode Question() { return getToken(Nutt.Question, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode Colon() { return getToken(Nutt.Colon, 0); }
		public Quarternary_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitQuarternary_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Infix_expContext extends ExpContext {
		public ExpContext left;
		public ExpContext right;
		public Operator_infixContext operator_infix() {
			return getRuleContext(Operator_infixContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Infix_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitInfix_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Block_expContext extends ExpContext {
		public Do_done_blockContext do_done_block() {
			return getRuleContext(Do_done_blockContext.class,0);
		}
		public Block_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitBlock_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Map_initializer_expContext extends ExpContext {
		public Map_initializerContext map_initializer() {
			return getRuleContext(Map_initializerContext.class,0);
		}
		public Map_initializer_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitMap_initializer_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Op_call_expContext extends ExpContext {
		public Operator_infixContext op;
		public ExplistContext arguments;
		public TerminalNode OP_LeftPar() { return getToken(Nutt.OP_LeftPar, 0); }
		public TerminalNode OP_RightPar() { return getToken(Nutt.OP_RightPar, 0); }
		public Operator_infixContext operator_infix() {
			return getRuleContext(Operator_infixContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public Op_call_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitOp_call_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Reverse_expContext extends ExpContext {
		public TerminalNode OP_Reverse() { return getToken(Nutt.OP_Reverse, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Reverse_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitReverse_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Parenthesis_expContext extends ExpContext {
		public TerminalNode OP_LeftPar() { return getToken(Nutt.OP_LeftPar, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode OP_RightPar() { return getToken(Nutt.OP_RightPar, 0); }
		public Parenthesis_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitParenthesis_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Record_member_accessContext extends ExpContext {
		public ExpContext record;
		public StringContext index;
		public TerminalNode Dot() { return getToken(Nutt.Dot, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Record_member_accessContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitRecord_member_access(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Match_to_expContext extends ExpContext {
		public ExpContext matched;
		public TerminalNode KW_Match() { return getToken(Nutt.KW_Match, 0); }
		public TerminalNode KW_To() { return getToken(Nutt.KW_To, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<Match_branchContext> match_branch() {
			return getRuleContexts(Match_branchContext.class);
		}
		public Match_branchContext match_branch(int i) {
			return getRuleContext(Match_branchContext.class,i);
		}
		public Default_match_branchContext default_match_branch() {
			return getRuleContext(Default_match_branchContext.class,0);
		}
		public Match_to_expContext(ExpContext ctx) { copyFrom(ctx); }
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
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				_localctx = new Explicit_variableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(480);
				match(NAME);
				}
				break;
			case 2:
				{
				_localctx = new Explicit_atomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(481);
				atom();
				}
				break;
			case 3:
				{
				_localctx = new Block_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(482);
				do_done_block();
				}
				break;
			case 4:
				{
				_localctx = new Reverse_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(483);
				match(OP_Reverse);
				setState(484);
				exp(23);
				}
				break;
			case 5:
				{
				_localctx = new Eval_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(485);
				match(KW_Eval);
				setState(486);
				match(OP_LeftPar);
				setState(489);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(487);
					exp(0);
					}
					break;
				case 2:
					{
					setState(488);
					block();
					}
					break;
				}
				setState(491);
				match(OP_RightPar);
				}
				break;
			case 6:
				{
				_localctx = new Record_initializer_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(493);
				record_initializer();
				}
				break;
			case 7:
				{
				_localctx = new Map_initializer_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(494);
				map_initializer();
				}
				break;
			case 8:
				{
				_localctx = new Range_array_initializer_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(495);
				range_array_initializer();
				}
				break;
			case 9:
				{
				_localctx = new Comprehense_array_initializer_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(496);
				comprehense_array_initializer();
				}
				break;
			case 10:
				{
				_localctx = new Spread_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(497);
				match(OP_Pass);
				setState(498);
				exp(16);
				}
				break;
			case 11:
				{
				_localctx = new Explicit_arrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(499);
				list_initializer();
				}
				break;
			case 12:
				{
				_localctx = new Function_definition_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(500);
				local_funct();
				}
				break;
			case 13:
				{
				_localctx = new Prefix_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(501);
				operator_prefix();
				setState(502);
				exp(13);
				}
				break;
			case 14:
				{
				_localctx = new Op_call_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(504);
				((Op_call_expContext)_localctx).op = operator_infix();
				setState(505);
				match(OP_LeftPar);
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 20270888565985314L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1130825664036839433L) != 0) || _la==Normal_string) {
					{
					setState(506);
					((Op_call_expContext)_localctx).arguments = explist();
					}
				}

				setState(509);
				match(OP_RightPar);
				}
				break;
			case 15:
				{
				_localctx = new Parenthesis_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(511);
				match(OP_LeftPar);
				setState(512);
				exp(0);
				setState(513);
				match(OP_RightPar);
				}
				break;
			case 16:
				{
				_localctx = new Type_of_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(515);
				match(KW_TypeOf);
				setState(516);
				exp(5);
				}
				break;
			case 17:
				{
				_localctx = new Common_of_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(517);
				match(KW_CommonOf);
				setState(518);
				explist();
				}
				break;
			case 18:
				{
				_localctx = new Match_to_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(519);
				match(KW_Match);
				setState(520);
				((Match_to_expContext)_localctx).matched = exp(0);
				setState(521);
				match(KW_To);
				setState(523); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(522);
						match_branch();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(525); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(528);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(527);
					default_match_branch();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(579);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(577);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new Infix_expContext(new ExpContext(_parentctx, _parentState));
						((Infix_expContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(532);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(533);
						operator_infix();
						setState(534);
						((Infix_expContext)_localctx).right = exp(13);
						}
						break;
					case 2:
						{
						_localctx = new Using_expContext(new ExpContext(_parentctx, _parentState));
						((Using_expContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(536);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(537);
						match(BackTick);
						setState(538);
						((Using_expContext)_localctx).used = match(NAME);
						setState(539);
						match(BackTick);
						setState(540);
						((Using_expContext)_localctx).right = exp(10);
						}
						break;
					case 3:
						{
						_localctx = new Contains_expContext(new ExpContext(_parentctx, _parentState));
						((Contains_expContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(541);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(544);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case KW_In:
							{
							setState(542);
							((Contains_expContext)_localctx).in = match(KW_In);
							}
							break;
						case KW_Not_In:
							{
							setState(543);
							((Contains_expContext)_localctx).not_in = match(KW_Not_In);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(546);
						((Contains_expContext)_localctx).right = exp(9);
						}
						break;
					case 4:
						{
						_localctx = new Record_member_accessContext(new ExpContext(_parentctx, _parentState));
						((Record_member_accessContext)_localctx).record = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(547);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(548);
						match(Dot);
						setState(549);
						((Record_member_accessContext)_localctx).index = string();
						}
						break;
					case 5:
						{
						_localctx = new Func_call_expContext(new ExpContext(_parentctx, _parentState));
						((Func_call_expContext)_localctx).name = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(550);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(552);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==OP_LeftCurly) {
							{
							setState(551);
							using_in_call();
							}
						}

						setState(554);
						match(OP_LeftPar);
						setState(556);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 20270888565985314L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1130825664036839433L) != 0) || _la==Normal_string) {
							{
							setState(555);
							((Func_call_expContext)_localctx).arguments = explist();
							}
						}

						setState(558);
						match(OP_RightPar);
						}
						break;
					case 6:
						{
						_localctx = new Array_accessContext(new ExpContext(_parentctx, _parentState));
						((Array_accessContext)_localctx).arr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(559);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(560);
						match(OP_LeftBracket);
						setState(561);
						((Array_accessContext)_localctx).index = exp(0);
						setState(562);
						match(OP_RightBracket);
						}
						break;
					case 7:
						{
						_localctx = new Instance_of_expContext(new ExpContext(_parentctx, _parentState));
						((Instance_of_expContext)_localctx).to_check = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(564);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(565);
						match(KW_InstanceOf);
						setState(568);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
						case 1:
							{
							setState(566);
							match(NAME);
							}
							break;
						case 2:
							{
							setState(567);
							((Instance_of_expContext)_localctx).type_exp = exp(0);
							}
							break;
						}
						}
						break;
					case 8:
						{
						_localctx = new Quarternary_expContext(new ExpContext(_parentctx, _parentState));
						((Quarternary_expContext)_localctx).cond = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(570);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(571);
						match(Question);
						setState(572);
						((Quarternary_expContext)_localctx).if_true = exp(0);
						setState(575);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
						case 1:
							{
							setState(573);
							match(Colon);
							setState(574);
							((Quarternary_expContext)_localctx).if_false = exp(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(581);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
	public static class Range_array_initializerContext extends ParserRuleContext {
		public ExpContext start;
		public ExpContext next;
		public ExpContext bound;
		public TerminalNode OP_LeftCurly() { return getToken(Nutt.OP_LeftCurly, 0); }
		public TerminalNode OP_Range() { return getToken(Nutt.OP_Range, 0); }
		public TerminalNode OP_RightCurly() { return getToken(Nutt.OP_RightCurly, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode Comma() { return getToken(Nutt.Comma, 0); }
		public TerminalNode SemiColon() { return getToken(Nutt.SemiColon, 0); }
		public TerminalNode OP_Reverse() { return getToken(Nutt.OP_Reverse, 0); }
		public Range_array_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_array_initializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitRange_array_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_array_initializerContext range_array_initializer() throws RecognitionException {
		Range_array_initializerContext _localctx = new Range_array_initializerContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_range_array_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(OP_LeftCurly);
			setState(583);
			((Range_array_initializerContext)_localctx).start = exp(0);
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(584);
				match(Comma);
				setState(585);
				((Range_array_initializerContext)_localctx).next = exp(0);
				}
			}

			setState(588);
			match(OP_Range);
			setState(589);
			((Range_array_initializerContext)_localctx).bound = exp(0);
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(590);
				match(SemiColon);
				setState(591);
				match(OP_Reverse);
				}
			}

			setState(594);
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
	public static class Comprehense_array_initializerContext extends ParserRuleContext {
		public ExpContext element;
		public ExpContext arr;
		public ExpContext pred;
		public TerminalNode OP_LeftCurly() { return getToken(Nutt.OP_LeftCurly, 0); }
		public TerminalNode NAME() { return getToken(Nutt.NAME, 0); }
		public Op_directionContext op_direction() {
			return getRuleContext(Op_directionContext.class,0);
		}
		public TerminalNode OP_RightCurly() { return getToken(Nutt.OP_RightCurly, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode KW_Of() { return getToken(Nutt.KW_Of, 0); }
		public TerminalNode KW_If() { return getToken(Nutt.KW_If, 0); }
		public Comprehense_array_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comprehense_array_initializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitComprehense_array_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comprehense_array_initializerContext comprehense_array_initializer() throws RecognitionException {
		Comprehense_array_initializerContext _localctx = new Comprehense_array_initializerContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_comprehense_array_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(OP_LeftCurly);
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(597);
				((Comprehense_array_initializerContext)_localctx).element = exp(0);
				setState(598);
				match(KW_Of);
				}
				break;
			}
			setState(602);
			match(NAME);
			setState(603);
			op_direction();
			setState(604);
			((Comprehense_array_initializerContext)_localctx).arr = exp(0);
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_If) {
				{
				setState(605);
				match(KW_If);
				setState(606);
				((Comprehense_array_initializerContext)_localctx).pred = exp(0);
				}
			}

			setState(609);
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
	public static class Map_elementContext extends ParserRuleContext {
		public Token key;
		public ExpContext val;
		public TerminalNode SemiColon() { return getToken(Nutt.SemiColon, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Char_String() { return getToken(Nutt.Char_String, 0); }
		public TerminalNode NAME() { return getToken(Nutt.NAME, 0); }
		public Map_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitMap_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Map_elementContext map_element() throws RecognitionException {
		Map_elementContext _localctx = new Map_elementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_map_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			((Map_elementContext)_localctx).key = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Char_String || _la==NAME) ) {
				((Map_elementContext)_localctx).key = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(612);
			match(SemiColon);
			setState(613);
			((Map_elementContext)_localctx).val = exp(0);
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
	public static class Map_initializerContext extends ParserRuleContext {
		public TerminalNode OP_LeftCurly() { return getToken(Nutt.OP_LeftCurly, 0); }
		public List<Map_elementContext> map_element() {
			return getRuleContexts(Map_elementContext.class);
		}
		public Map_elementContext map_element(int i) {
			return getRuleContext(Map_elementContext.class,i);
		}
		public TerminalNode OP_RightCurly() { return getToken(Nutt.OP_RightCurly, 0); }
		public List<TerminalNode> Comma() { return getTokens(Nutt.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Nutt.Comma, i);
		}
		public Map_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_initializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitMap_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Map_initializerContext map_initializer() throws RecognitionException {
		Map_initializerContext _localctx = new Map_initializerContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_map_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(OP_LeftCurly);
			setState(616);
			map_element();
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(617);
				match(Comma);
				setState(618);
				map_element();
				}
				}
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(624);
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
	public static class Record_elementContext extends ParserRuleContext {
		public Token key;
		public ExpContext val;
		public TerminalNode Colon() { return getToken(Nutt.Colon, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Char_String() { return getToken(Nutt.Char_String, 0); }
		public TerminalNode NAME() { return getToken(Nutt.NAME, 0); }
		public Record_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitRecord_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Record_elementContext record_element() throws RecognitionException {
		Record_elementContext _localctx = new Record_elementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_record_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			((Record_elementContext)_localctx).key = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Char_String || _la==NAME) ) {
				((Record_elementContext)_localctx).key = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(627);
			match(Colon);
			setState(628);
			((Record_elementContext)_localctx).val = exp(0);
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
	public static class Record_element_listContext extends ParserRuleContext {
		public List<Record_elementContext> record_element() {
			return getRuleContexts(Record_elementContext.class);
		}
		public Record_elementContext record_element(int i) {
			return getRuleContext(Record_elementContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(Nutt.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Nutt.Comma, i);
		}
		public Record_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_element_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitRecord_element_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Record_element_listContext record_element_list() throws RecognitionException {
		Record_element_listContext _localctx = new Record_element_listContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_record_element_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			record_element();
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(631);
				match(Comma);
				setState(632);
				record_element();
				}
				}
				setState(637);
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
	public static class Record_initializerContext extends ParserRuleContext {
		public TerminalNode OP_LeftCurly() { return getToken(Nutt.OP_LeftCurly, 0); }
		public Record_element_listContext record_element_list() {
			return getRuleContext(Record_element_listContext.class,0);
		}
		public TerminalNode OP_RightCurly() { return getToken(Nutt.OP_RightCurly, 0); }
		public Record_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_initializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitRecord_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Record_initializerContext record_initializer() throws RecognitionException {
		Record_initializerContext _localctx = new Record_initializerContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_record_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(OP_LeftCurly);
			setState(639);
			record_element_list();
			setState(640);
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
	public static class Operator_logicalContext extends ParserRuleContext {
		public TerminalNode OP_And() { return getToken(Nutt.OP_And, 0); }
		public TerminalNode OP_Or() { return getToken(Nutt.OP_Or, 0); }
		public TerminalNode OP_Xor() { return getToken(Nutt.OP_Xor, 0); }
		public Operator_logicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_logical; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitOperator_logical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_logicalContext operator_logical() throws RecognitionException {
		Operator_logicalContext _localctx = new Operator_logicalContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_operator_logical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			_la = _input.LA(1);
			if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & 550024249345L) != 0)) ) {
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
	public static class Default_match_branchContext extends ParserRuleContext {
		public TerminalNode KW_Default() { return getToken(Nutt.KW_Default, 0); }
		public TerminalNode OP_Case_Arrow() { return getToken(Nutt.OP_Case_Arrow, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Default_match_branchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_match_branch; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitDefault_match_branch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_match_branchContext default_match_branch() throws RecognitionException {
		Default_match_branchContext _localctx = new Default_match_branchContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_default_match_branch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(KW_Default);
			setState(645);
			match(OP_Case_Arrow);
			setState(646);
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
	public static class Match_branchContext extends ParserRuleContext {
		public ExpContext branch_exp;
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public TerminalNode OP_Case_Arrow() { return getToken(Nutt.OP_Case_Arrow, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode KW_Final() { return getToken(Nutt.KW_Final, 0); }
		public Match_branchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_branch; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitMatch_branch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Match_branchContext match_branch() throws RecognitionException {
		Match_branchContext _localctx = new Match_branchContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_match_branch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_Final) {
				{
				setState(648);
				match(KW_Final);
				}
			}

			setState(651);
			explist();
			setState(652);
			match(OP_Case_Arrow);
			setState(653);
			((Match_branchContext)_localctx).branch_exp = exp(0);
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
		public NilContext nil() {
			return getRuleContext(NilContext.class,0);
		}
		public BooleanContext boolean_() {
			return getRuleContext(BooleanContext.class,0);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_atom);
		try {
			setState(659);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_Nil:
				enterOuterAlt(_localctx, 1);
				{
				setState(655);
				nil();
				}
				break;
			case KW_False:
			case KW_True:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
				boolean_();
				}
				break;
			case Float:
			case HexFloat:
			case HexInt:
			case Int:
				enterOuterAlt(_localctx, 3);
				{
				setState(657);
				number();
				}
				break;
			case Char_String:
			case Normal_string:
				enterOuterAlt(_localctx, 4);
				{
				setState(658);
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
	public static class NilContext extends ParserRuleContext {
		public TerminalNode KW_Nil() { return getToken(Nutt.KW_Nil, 0); }
		public NilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nil; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitNil(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NilContext nil() throws RecognitionException {
		NilContext _localctx = new NilContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_nil);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
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
	public static class BooleanContext extends ParserRuleContext {
		public TerminalNode KW_True() { return getToken(Nutt.KW_True, 0); }
		public TerminalNode KW_False() { return getToken(Nutt.KW_False, 0); }
		public BooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanContext boolean_() throws RecognitionException {
		BooleanContext _localctx = new BooleanContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_boolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			_la = _input.LA(1);
			if ( !(_la==KW_False || _la==KW_True) ) {
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
		public TerminalNode Int() { return getToken(Nutt.Int, 0); }
		public TerminalNode HexInt() { return getToken(Nutt.HexInt, 0); }
		public TerminalNode Float() { return getToken(Nutt.Float, 0); }
		public TerminalNode HexFloat() { return getToken(Nutt.HexFloat, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 118784L) != 0)) ) {
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
		public TerminalNode Normal_string() { return getToken(Nutt.Normal_string, 0); }
		public TerminalNode Char_String() { return getToken(Nutt.Char_String, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			_la = _input.LA(1);
			if ( !(_la==Char_String || _la==Normal_string) ) {
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
	public static class Using_in_callContext extends ParserRuleContext {
		public TerminalNode OP_LeftCurly() { return getToken(Nutt.OP_LeftCurly, 0); }
		public Overloading_operatorContext overloading_operator() {
			return getRuleContext(Overloading_operatorContext.class,0);
		}
		public TerminalNode OP_RightCurly() { return getToken(Nutt.OP_RightCurly, 0); }
		public Using_in_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_in_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitUsing_in_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Using_in_callContext using_in_call() throws RecognitionException {
		Using_in_callContext _localctx = new Using_in_callContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_using_in_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			match(OP_LeftCurly);
			setState(670);
			overloading_operator();
			setState(671);
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
	public static class Var_signature_listContext extends ParserRuleContext {
		public List<Var_signatureContext> var_signature() {
			return getRuleContexts(Var_signatureContext.class);
		}
		public Var_signatureContext var_signature(int i) {
			return getRuleContext(Var_signatureContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(Nutt.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Nutt.Comma, i);
		}
		public Var_signature_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_signature_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitVar_signature_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_signature_listContext var_signature_list() throws RecognitionException {
		Var_signature_listContext _localctx = new Var_signature_listContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_var_signature_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			var_signature();
			setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(674);
				match(Comma);
				setState(675);
				var_signature();
				}
				}
				setState(680);
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
	public static class Func_outputContext extends ParserRuleContext {
		public ExpContext default_output;
		public By_type_var_declContext by_type_var_decl() {
			return getRuleContext(By_type_var_declContext.class,0);
		}
		public TerminalNode OP_LeftBracket() { return getToken(Nutt.OP_LeftBracket, 0); }
		public TerminalNode OP_RightBracket() { return getToken(Nutt.OP_RightBracket, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Func_outputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_output; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFunc_output(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_outputContext func_output() throws RecognitionException {
		Func_outputContext _localctx = new Func_outputContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_func_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(681);
				by_type_var_decl();
				}
			}

			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_LeftBracket) {
				{
				setState(684);
				match(OP_LeftBracket);
				setState(685);
				((Func_outputContext)_localctx).default_output = exp(0);
				setState(686);
				match(OP_RightBracket);
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
	public static class Local_functContext extends ParserRuleContext {
		public Lambda_declContext lambda_decl() {
			return getRuleContext(Lambda_declContext.class,0);
		}
		public TerminalNode KW_Funct() { return getToken(Nutt.KW_Funct, 0); }
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public Local_functContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_funct; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitLocal_funct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_functContext local_funct() throws RecognitionException {
		Local_functContext _localctx = new Local_functContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_local_funct);
		try {
			setState(693);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AtSign:
			case NAME:
			case OP_LeftCurly:
			case OP_LeftPar:
				enterOuterAlt(_localctx, 1);
				{
				setState(690);
				lambda_decl();
				}
				break;
			case KW_Funct:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(691);
				match(KW_Funct);
				setState(692);
				funcbody();
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
		public Func_outputContext func_output() {
			return getRuleContext(Func_outputContext.class,0);
		}
		public TerminalNode OP_Assign() { return getToken(Nutt.OP_Assign, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode KW_Return() { return getToken(Nutt.KW_Return, 0); }
		public Var_signatureContext var_signature() {
			return getRuleContext(Var_signatureContext.class,0);
		}
		public TerminalNode OP_LeftPar() { return getToken(Nutt.OP_LeftPar, 0); }
		public TerminalNode OP_RightPar() { return getToken(Nutt.OP_RightPar, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public UsingContext using() {
			return getRuleContext(UsingContext.class,0);
		}
		public Var_signature_listContext var_signature_list() {
			return getRuleContext(Var_signature_listContext.class,0);
		}
		public FuncbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcbody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFuncbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncbodyContext funcbody() throws RecognitionException {
		FuncbodyContext _localctx = new FuncbodyContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_funcbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AtSign) {
				{
				{
				setState(695);
				annotation();
				}
				}
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_LeftCurly) {
				{
				setState(701);
				using();
				}
			}

			setState(710);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(704);
				var_signature();
				}
				break;
			case OP_LeftPar:
				{
				setState(705);
				match(OP_LeftPar);
				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(706);
					var_signature_list();
					}
				}

				setState(709);
				match(OP_RightPar);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(712);
			func_output();
			setState(713);
			match(OP_Assign);
			setState(714);
			block();
			setState(715);
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
	public static class Lambda_declContext extends ParserRuleContext {
		public ExpContext lambda_exp;
		public Func_outputContext func_output() {
			return getRuleContext(Func_outputContext.class,0);
		}
		public TerminalNode OP_LambdaReturn() { return getToken(Nutt.OP_LambdaReturn, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Var_signatureContext var_signature() {
			return getRuleContext(Var_signatureContext.class,0);
		}
		public TerminalNode OP_LeftPar() { return getToken(Nutt.OP_LeftPar, 0); }
		public TerminalNode OP_RightPar() { return getToken(Nutt.OP_RightPar, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public UsingContext using() {
			return getRuleContext(UsingContext.class,0);
		}
		public Var_signature_listContext var_signature_list() {
			return getRuleContext(Var_signature_listContext.class,0);
		}
		public Lambda_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitLambda_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lambda_declContext lambda_decl() throws RecognitionException {
		Lambda_declContext _localctx = new Lambda_declContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_lambda_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AtSign) {
				{
				{
				setState(717);
				annotation();
				}
				}
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_LeftCurly) {
				{
				setState(723);
				using();
				}
			}

			setState(732);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(726);
				var_signature();
				}
				break;
			case OP_LeftPar:
				{
				setState(727);
				match(OP_LeftPar);
				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(728);
					var_signature_list();
					}
				}

				setState(731);
				match(OP_RightPar);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(734);
			func_output();
			setState(735);
			match(OP_LambdaReturn);
			setState(736);
			((Lambda_declContext)_localctx).lambda_exp = exp(0);
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
	public static class Operator_infixContext extends ParserRuleContext {
		public Default_infix_operatorContext default_infix_operator() {
			return getRuleContext(Default_infix_operatorContext.class,0);
		}
		public TerminalNode Op_Custom() { return getToken(Nutt.Op_Custom, 0); }
		public Operator_infixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_infix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitOperator_infix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_infixContext operator_infix() throws RecognitionException {
		Operator_infixContext _localctx = new Operator_infixContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_operator_infix);
		try {
			setState(740);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_Add:
			case OP_And:
			case OP_Append:
			case OP_Arithmetic_LeftShift:
			case OP_Arithmetic_RightShift:
			case OP_Bit_And:
			case OP_Bit_LeftShift:
			case OP_Bit_Or:
			case OP_Bit_RightShift:
			case OP_Bit_Xor:
			case OP_Div:
			case OP_Equal:
			case OP_Greater:
			case OP_IntDiv:
			case OP_Less:
			case OP_Less_Equal:
			case OP_Mod:
			case OP_Mult:
			case OP_Or:
			case OP_Power:
			case OP_Reverse:
			case OP_Similar:
			case OP_Sub:
			case OP_Xor:
			case Op_Greater_Equal:
			case Op_Not_Equal:
			case Op_Not_Similar:
				enterOuterAlt(_localctx, 1);
				{
				setState(738);
				default_infix_operator();
				}
				break;
			case Op_Custom:
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				match(Op_Custom);
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
	public static class Default_infix_operatorContext extends ParserRuleContext {
		public Operator_bitwiseContext operator_bitwise() {
			return getRuleContext(Operator_bitwiseContext.class,0);
		}
		public Operator_mathContext operator_math() {
			return getRuleContext(Operator_mathContext.class,0);
		}
		public Operator_logicalContext operator_logical() {
			return getRuleContext(Operator_logicalContext.class,0);
		}
		public Operator_comparisonContext operator_comparison() {
			return getRuleContext(Operator_comparisonContext.class,0);
		}
		public TerminalNode OP_Append() { return getToken(Nutt.OP_Append, 0); }
		public TerminalNode OP_Reverse() { return getToken(Nutt.OP_Reverse, 0); }
		public Default_infix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_infix_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitDefault_infix_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_infix_operatorContext default_infix_operator() throws RecognitionException {
		Default_infix_operatorContext _localctx = new Default_infix_operatorContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_default_infix_operator);
		try {
			setState(748);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_Arithmetic_LeftShift:
			case OP_Arithmetic_RightShift:
			case OP_Bit_And:
			case OP_Bit_LeftShift:
			case OP_Bit_Or:
			case OP_Bit_RightShift:
			case OP_Bit_Xor:
				enterOuterAlt(_localctx, 1);
				{
				setState(742);
				operator_bitwise();
				}
				break;
			case OP_Add:
			case OP_Div:
			case OP_IntDiv:
			case OP_Mod:
			case OP_Mult:
			case OP_Power:
			case OP_Sub:
				enterOuterAlt(_localctx, 2);
				{
				setState(743);
				operator_math();
				}
				break;
			case OP_And:
			case OP_Or:
			case OP_Xor:
				enterOuterAlt(_localctx, 3);
				{
				setState(744);
				operator_logical();
				}
				break;
			case OP_Equal:
			case OP_Greater:
			case OP_Less:
			case OP_Less_Equal:
			case OP_Similar:
			case Op_Greater_Equal:
			case Op_Not_Equal:
			case Op_Not_Similar:
				enterOuterAlt(_localctx, 4);
				{
				setState(745);
				operator_comparison();
				}
				break;
			case OP_Append:
				enterOuterAlt(_localctx, 5);
				{
				setState(746);
				match(OP_Append);
				}
				break;
			case OP_Reverse:
				enterOuterAlt(_localctx, 6);
				{
				setState(747);
				match(OP_Reverse);
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
	public static class Operator_composedContext extends ParserRuleContext {
		public Composed_assign_opContext composed_assign_op() {
			return getRuleContext(Composed_assign_opContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Operator_composedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_composed; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitOperator_composed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_composedContext operator_composed() throws RecognitionException {
		Operator_composedContext _localctx = new Operator_composedContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_operator_composed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			composed_assign_op();
			setState(751);
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
	public static class Operator_mathContext extends ParserRuleContext {
		public TerminalNode OP_Add() { return getToken(Nutt.OP_Add, 0); }
		public TerminalNode OP_Sub() { return getToken(Nutt.OP_Sub, 0); }
		public TerminalNode OP_Mult() { return getToken(Nutt.OP_Mult, 0); }
		public TerminalNode OP_Div() { return getToken(Nutt.OP_Div, 0); }
		public TerminalNode OP_Mod() { return getToken(Nutt.OP_Mod, 0); }
		public TerminalNode OP_IntDiv() { return getToken(Nutt.OP_IntDiv, 0); }
		public TerminalNode OP_Power() { return getToken(Nutt.OP_Power, 0); }
		public Operator_mathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_math; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitOperator_math(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_mathContext operator_math() throws RecognitionException {
		Operator_mathContext _localctx = new Operator_mathContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_operator_math);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			_la = _input.LA(1);
			if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 277226987521L) != 0)) ) {
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
	public static class Operator_postfixContext extends ParserRuleContext {
		public List<Operator_mathContext> operator_math() {
			return getRuleContexts(Operator_mathContext.class);
		}
		public Operator_mathContext operator_math(int i) {
			return getRuleContext(Operator_mathContext.class,i);
		}
		public TerminalNode Op_Custom() { return getToken(Nutt.Op_Custom, 0); }
		public Operator_postfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_postfix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitOperator_postfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_postfixContext operator_postfix() throws RecognitionException {
		Operator_postfixContext _localctx = new Operator_postfixContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_operator_postfix);
		try {
			setState(759);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_Add:
			case OP_Div:
			case OP_IntDiv:
			case OP_Mod:
			case OP_Mult:
			case OP_Power:
			case OP_Sub:
				enterOuterAlt(_localctx, 1);
				{
				setState(755);
				operator_math();
				setState(756);
				operator_math();
				}
				break;
			case Op_Custom:
				enterOuterAlt(_localctx, 2);
				{
				setState(758);
				match(Op_Custom);
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
	public static class Composed_assign_opContext extends ParserRuleContext {
		public Operator_infixContext operator_infix() {
			return getRuleContext(Operator_infixContext.class,0);
		}
		public TerminalNode OP_Assign() { return getToken(Nutt.OP_Assign, 0); }
		public Composed_assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_composed_assign_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitComposed_assign_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Composed_assign_opContext composed_assign_op() throws RecognitionException {
		Composed_assign_opContext _localctx = new Composed_assign_opContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_composed_assign_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			operator_infix();
			setState(762);
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
	public static class Operator_bitwiseContext extends ParserRuleContext {
		public TerminalNode OP_Bit_LeftShift() { return getToken(Nutt.OP_Bit_LeftShift, 0); }
		public TerminalNode OP_Bit_RightShift() { return getToken(Nutt.OP_Bit_RightShift, 0); }
		public TerminalNode OP_Arithmetic_LeftShift() { return getToken(Nutt.OP_Arithmetic_LeftShift, 0); }
		public TerminalNode OP_Arithmetic_RightShift() { return getToken(Nutt.OP_Arithmetic_RightShift, 0); }
		public TerminalNode OP_Bit_Or() { return getToken(Nutt.OP_Bit_Or, 0); }
		public TerminalNode OP_Bit_And() { return getToken(Nutt.OP_Bit_And, 0); }
		public TerminalNode OP_Bit_Xor() { return getToken(Nutt.OP_Bit_Xor, 0); }
		public Operator_bitwiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_bitwise; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitOperator_bitwise(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_bitwiseContext operator_bitwise() throws RecognitionException {
		Operator_bitwiseContext _localctx = new Operator_bitwiseContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_operator_bitwise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			_la = _input.LA(1);
			if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 499L) != 0)) ) {
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
	public static class Operator_prefixContext extends ParserRuleContext {
		public TerminalNode OP_Not() { return getToken(Nutt.OP_Not, 0); }
		public TerminalNode OP_Length() { return getToken(Nutt.OP_Length, 0); }
		public TerminalNode OP_Sub() { return getToken(Nutt.OP_Sub, 0); }
		public TerminalNode OP_Add() { return getToken(Nutt.OP_Add, 0); }
		public TerminalNode Op_Custom() { return getToken(Nutt.Op_Custom, 0); }
		public Operator_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_prefix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitOperator_prefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_prefixContext operator_prefix() throws RecognitionException {
		Operator_prefixContext _localctx = new Operator_prefixContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_operator_prefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			_la = _input.LA(1);
			if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 17867340775425L) != 0)) ) {
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
	public static class Operator_comparisonContext extends ParserRuleContext {
		public TerminalNode OP_Less() { return getToken(Nutt.OP_Less, 0); }
		public TerminalNode OP_Greater() { return getToken(Nutt.OP_Greater, 0); }
		public TerminalNode OP_Less_Equal() { return getToken(Nutt.OP_Less_Equal, 0); }
		public TerminalNode Op_Greater_Equal() { return getToken(Nutt.Op_Greater_Equal, 0); }
		public TerminalNode Op_Not_Similar() { return getToken(Nutt.Op_Not_Similar, 0); }
		public TerminalNode Op_Not_Equal() { return getToken(Nutt.Op_Not_Equal, 0); }
		public TerminalNode OP_Similar() { return getToken(Nutt.OP_Similar, 0); }
		public TerminalNode OP_Equal() { return getToken(Nutt.OP_Equal, 0); }
		public Operator_comparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_comparison; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitOperator_comparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_comparisonContext operator_comparison() throws RecognitionException {
		Operator_comparisonContext _localctx = new Operator_comparisonContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_operator_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			_la = _input.LA(1);
			if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 947915785L) != 0)) ) {
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
		case 48:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 21);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0083\u0303\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0001\u0000"+
		"\u0003\u0000\u00a0\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u00a6\b\u0001\n\u0001\f\u0001\u00a9\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003\u00b4\b\u0003\n\u0003\f\u0003\u00b7\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00c2\b\u0006\n\u0006"+
		"\f\u0006\u00c5\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0003\b\u00ce\b\b\u0001\t\u0005\t\u00d1\b"+
		"\t\n\t\f\t\u00d4\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00f1\b\n\u0001\n\u0001\n\u0003\n\u00f5\b\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0105\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u010c\b\u000b"+
		"\u0003\u000b\u010e\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0114"+
		"\b\f\n\f\f\f\u0117\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0003\r\u011f\b\r\u0001\r\u0001\r\u0001\u000e\u0005\u000e\u0124\b\u000e"+
		"\n\u000e\f\u000e\u0127\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u012e\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u0138\b\u0010\n\u0010\f\u0010\u013b\t\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u0140\b\u0011\n\u0011\f\u0011\u0143\t\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0149\b\u0012\n"+
		"\u0012\f\u0012\u014c\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u0153\b\u0013\n\u0013\f\u0013\u0156\t\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u015e\b\u0014\u0001\u0015\u0003\u0015\u0161\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0179\b\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0003\u001b\u017e\b\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u0188\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u018d\b\u001e\n\u001e\f\u001e\u0190\t\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u0195\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001$\u0001$\u0003$\u01aa\b$\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u01bb\b\'\u0001(\u0001(\u0001(\u0001)\u0001)\u0003"+
		")\u01c2\b)\u0001)\u0003)\u01c5\b)\u0001*\u0001*\u0001*\u0001+\u0001+\u0001"+
		",\u0001,\u0001,\u0001-\u0001-\u0001-\u0001.\u0001.\u0003.\u01d4\b.\u0001"+
		".\u0001.\u0001/\u0001/\u0001/\u0005/\u01db\b/\n/\f/\u01de\t/\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00030\u01ea"+
		"\b0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00030\u01fc\b0\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00040\u020c\b0\u000b0\f0\u020d\u00010\u00030\u0211\b"+
		"0\u00030\u0213\b0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00030\u0221\b0\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00030\u0229\b0\u00010\u00010\u00030\u022d\b0\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00030\u0239"+
		"\b0\u00010\u00010\u00010\u00010\u00010\u00030\u0240\b0\u00050\u0242\b"+
		"0\n0\f0\u0245\t0\u00011\u00011\u00011\u00011\u00031\u024b\b1\u00011\u0001"+
		"1\u00011\u00011\u00031\u0251\b1\u00011\u00011\u00012\u00012\u00012\u0001"+
		"2\u00032\u0259\b2\u00012\u00012\u00012\u00012\u00012\u00032\u0260\b2\u0001"+
		"2\u00012\u00013\u00013\u00013\u00013\u00014\u00014\u00014\u00014\u0005"+
		"4\u026c\b4\n4\f4\u026f\t4\u00014\u00014\u00015\u00015\u00015\u00015\u0001"+
		"6\u00016\u00016\u00056\u027a\b6\n6\f6\u027d\t6\u00017\u00017\u00017\u0001"+
		"7\u00018\u00018\u00019\u00019\u00019\u00019\u0001:\u0003:\u028a\b:\u0001"+
		":\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0003;\u0294\b;\u0001"+
		"<\u0001<\u0001=\u0001=\u0001>\u0001>\u0001?\u0001?\u0001@\u0001@\u0001"+
		"@\u0001@\u0001A\u0001A\u0001A\u0005A\u02a5\bA\nA\fA\u02a8\tA\u0001B\u0003"+
		"B\u02ab\bB\u0001B\u0001B\u0001B\u0001B\u0003B\u02b1\bB\u0001C\u0001C\u0001"+
		"C\u0003C\u02b6\bC\u0001D\u0005D\u02b9\bD\nD\fD\u02bc\tD\u0001D\u0003D"+
		"\u02bf\bD\u0001D\u0001D\u0001D\u0003D\u02c4\bD\u0001D\u0003D\u02c7\bD"+
		"\u0001D\u0001D\u0001D\u0001D\u0001D\u0001E\u0005E\u02cf\bE\nE\fE\u02d2"+
		"\tE\u0001E\u0003E\u02d5\bE\u0001E\u0001E\u0001E\u0003E\u02da\bE\u0001"+
		"E\u0003E\u02dd\bE\u0001E\u0001E\u0001E\u0001E\u0001F\u0001F\u0003F\u02e5"+
		"\bF\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u02ed\bG\u0001H\u0001"+
		"H\u0001H\u0001I\u0001I\u0001J\u0001J\u0001J\u0001J\u0003J\u02f8\bJ\u0001"+
		"K\u0001K\u0001K\u0001L\u0001L\u0001M\u0001M\u0001N\u0001N\u0001N\u0000"+
		"\u0001`O\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u0000\r\u0002\u0000//:;\u0002\u0000WWaa\u0001\u0000IJ\u0001"+
		"\u0000GH\u0002\u0000\u0005\u0005OO\u0003\u0000RRnnyy\u0002\u0000&&BB\u0002"+
		"\u0000\f\f\u000e\u0010\u0002\u0000\u0005\u0005\u0083\u0083\u0006\u0000"+
		"QQ^^ccklppww\u0002\u0000TUX\\\u0005\u0000QQhhmmww}}\u0005\u0000__bbij"+
		"vvz|\u032d\u0000\u009f\u0001\u0000\u0000\u0000\u0002\u00a3\u0001\u0000"+
		"\u0000\u0000\u0004\u00ad\u0001\u0000\u0000\u0000\u0006\u00b0\u0001\u0000"+
		"\u0000\u0000\b\u00b8\u0001\u0000\u0000\u0000\n\u00bb\u0001\u0000\u0000"+
		"\u0000\f\u00be\u0001\u0000\u0000\u0000\u000e\u00c6\u0001\u0000\u0000\u0000"+
		"\u0010\u00cd\u0001\u0000\u0000\u0000\u0012\u00d2\u0001\u0000\u0000\u0000"+
		"\u0014\u0104\u0001\u0000\u0000\u0000\u0016\u010d\u0001\u0000\u0000\u0000"+
		"\u0018\u010f\u0001\u0000\u0000\u0000\u001a\u011a\u0001\u0000\u0000\u0000"+
		"\u001c\u0125\u0001\u0000\u0000\u0000\u001e\u0131\u0001\u0000\u0000\u0000"+
		" \u0134\u0001\u0000\u0000\u0000\"\u013c\u0001\u0000\u0000\u0000$\u0144"+
		"\u0001\u0000\u0000\u0000&\u014f\u0001\u0000\u0000\u0000(\u015d\u0001\u0000"+
		"\u0000\u0000*\u0160\u0001\u0000\u0000\u0000,\u0166\u0001\u0000\u0000\u0000"+
		".\u016a\u0001\u0000\u0000\u00000\u016e\u0001\u0000\u0000\u00002\u0171"+
		"\u0001\u0000\u0000\u00004\u0174\u0001\u0000\u0000\u00006\u017d\u0001\u0000"+
		"\u0000\u00008\u0181\u0001\u0000\u0000\u0000:\u0184\u0001\u0000\u0000\u0000"+
		"<\u0189\u0001\u0000\u0000\u0000>\u0194\u0001\u0000\u0000\u0000@\u0196"+
		"\u0001\u0000\u0000\u0000B\u019c\u0001\u0000\u0000\u0000D\u019e\u0001\u0000"+
		"\u0000\u0000F\u01a2\u0001\u0000\u0000\u0000H\u01a7\u0001\u0000\u0000\u0000"+
		"J\u01ab\u0001\u0000\u0000\u0000L\u01b1\u0001\u0000\u0000\u0000N\u01b4"+
		"\u0001\u0000\u0000\u0000P\u01bc\u0001\u0000\u0000\u0000R\u01bf\u0001\u0000"+
		"\u0000\u0000T\u01c6\u0001\u0000\u0000\u0000V\u01c9\u0001\u0000\u0000\u0000"+
		"X\u01cb\u0001\u0000\u0000\u0000Z\u01ce\u0001\u0000\u0000\u0000\\\u01d1"+
		"\u0001\u0000\u0000\u0000^\u01d7\u0001\u0000\u0000\u0000`\u0212\u0001\u0000"+
		"\u0000\u0000b\u0246\u0001\u0000\u0000\u0000d\u0254\u0001\u0000\u0000\u0000"+
		"f\u0263\u0001\u0000\u0000\u0000h\u0267\u0001\u0000\u0000\u0000j\u0272"+
		"\u0001\u0000\u0000\u0000l\u0276\u0001\u0000\u0000\u0000n\u027e\u0001\u0000"+
		"\u0000\u0000p\u0282\u0001\u0000\u0000\u0000r\u0284\u0001\u0000\u0000\u0000"+
		"t\u0289\u0001\u0000\u0000\u0000v\u0293\u0001\u0000\u0000\u0000x\u0295"+
		"\u0001\u0000\u0000\u0000z\u0297\u0001\u0000\u0000\u0000|\u0299\u0001\u0000"+
		"\u0000\u0000~\u029b\u0001\u0000\u0000\u0000\u0080\u029d\u0001\u0000\u0000"+
		"\u0000\u0082\u02a1\u0001\u0000\u0000\u0000\u0084\u02aa\u0001\u0000\u0000"+
		"\u0000\u0086\u02b5\u0001\u0000\u0000\u0000\u0088\u02ba\u0001\u0000\u0000"+
		"\u0000\u008a\u02d0\u0001\u0000\u0000\u0000\u008c\u02e4\u0001\u0000\u0000"+
		"\u0000\u008e\u02ec\u0001\u0000\u0000\u0000\u0090\u02ee\u0001\u0000\u0000"+
		"\u0000\u0092\u02f1\u0001\u0000\u0000\u0000\u0094\u02f7\u0001\u0000\u0000"+
		"\u0000\u0096\u02f9\u0001\u0000\u0000\u0000\u0098\u02fc\u0001\u0000\u0000"+
		"\u0000\u009a\u02fe\u0001\u0000\u0000\u0000\u009c\u0300\u0001\u0000\u0000"+
		"\u0000\u009e\u00a0\u0003\u0002\u0001\u0000\u009f\u009e\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0005\u0000\u0000\u0001\u00a2\u0001\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a7\u0003\u0004\u0002\u0000\u00a4\u00a6\u0003\b\u0004\u0000"+
		"\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\u0003\u0012\t\u0000\u00ab\u00ac\u0005 \u0000\u0000\u00ac"+
		"\u0003\u0001\u0000\u0000\u0000\u00ad\u00ae\u00055\u0000\u0000\u00ae\u00af"+
		"\u0003\u0006\u0003\u0000\u00af\u0005\u0001\u0000\u0000\u0000\u00b0\u00b5"+
		"\u0005O\u0000\u0000\u00b1\u00b2\u0005\t\u0000\u0000\u00b2\u00b4\u0005"+
		"O\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b6\u0007\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0005-\u0000\u0000\u00b9\u00ba\u0003\f\u0006"+
		"\u0000\u00ba\t\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u001a\u0000\u0000"+
		"\u00bc\u00bd\u0003\f\u0006\u0000\u00bd\u000b\u0001\u0000\u0000\u0000\u00be"+
		"\u00c3\u0003\u0010\b\u0000\u00bf\u00c0\u0005\u0007\u0000\u0000\u00c0\u00c2"+
		"\u0003\u0010\b\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c4\r\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0003\u0006\u0003\u0000\u00c7\u00c8\u0005f\u0000"+
		"\u0000\u00c8\u00c9\u0003\f\u0006\u0000\u00c9\u00ca\u0005t\u0000\u0000"+
		"\u00ca\u000f\u0001\u0000\u0000\u0000\u00cb\u00ce\u0003\u0006\u0003\u0000"+
		"\u00cc\u00ce\u0003\u000e\u0007\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u0011\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d1\u0003\u0014\n\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d3\u0013\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d5\u0105\u0003L&\u0000\u00d6\u00d7\u0005"+
		"\u001c\u0000\u0000\u00d7\u00d8\u0003`0\u0000\u00d8\u00d9\u0003\u0014\n"+
		"\u0000\u00d9\u0105\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u001d\u0000"+
		"\u0000\u00db\u00dc\u0003`0\u0000\u00dc\u00dd\u0003\u0014\n\u0000\u00dd"+
		"\u0105\u0001\u0000\u0000\u0000\u00de\u00df\u0005$\u0000\u0000\u00df\u00e0"+
		"\u0005g\u0000\u0000\u00e0\u00e1\u0003\u0014\n\u0000\u00e1\u00e2\u0005"+
		"u\u0000\u0000\u00e2\u0105\u0001\u0000\u0000\u0000\u00e3\u0105\u0003\b"+
		"\u0004\u0000\u00e4\u0105\u0003\n\u0005\u0000\u00e5\u0105\u0003,\u0016"+
		"\u0000\u00e6\u0105\u0003P(\u0000\u00e7\u0105\u0003T*\u0000\u00e8\u0105"+
		"\u0003*\u0015\u0000\u00e9\u0105\u0003:\u001d\u0000\u00ea\u00eb\u0005*"+
		"\u0000\u0000\u00eb\u00ec\u0003<\u001e\u0000\u00ec\u00ed\u0003\u0088D\u0000"+
		"\u00ed\u0105\u0001\u0000\u0000\u0000\u00ee\u00f0\u0005O\u0000\u0000\u00ef"+
		"\u00f1\u0003\u0080@\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f4"+
		"\u0005g\u0000\u0000\u00f3\u00f5\u0003^/\u0000\u00f4\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f6\u0105\u0005u\u0000\u0000\u00f7\u0105\u0003.\u0017\u0000"+
		"\u00f8\u0105\u0003>\u001f\u0000\u00f9\u0105\u00030\u0018\u0000\u00fa\u0105"+
		"\u00032\u0019\u0000\u00fb\u0105\u00034\u001a\u0000\u00fc\u0105\u0003J"+
		"%\u0000\u00fd\u0105\u0005o\u0000\u0000\u00fe\u0105\u0003\u001a\r\u0000"+
		"\u00ff\u0105\u0003\u001c\u000e\u0000\u0100\u0105\u0005%\u0000\u0000\u0101"+
		"\u0105\u0003H$\u0000\u0102\u0105\u0005\u0013\u0000\u0000\u0103\u0105\u0005"+
		"\u0015\u0000\u0000\u0104\u00d5\u0001\u0000\u0000\u0000\u0104\u00d6\u0001"+
		"\u0000\u0000\u0000\u0104\u00da\u0001\u0000\u0000\u0000\u0104\u00de\u0001"+
		"\u0000\u0000\u0000\u0104\u00e3\u0001\u0000\u0000\u0000\u0104\u00e4\u0001"+
		"\u0000\u0000\u0000\u0104\u00e5\u0001\u0000\u0000\u0000\u0104\u00e6\u0001"+
		"\u0000\u0000\u0000\u0104\u00e7\u0001\u0000\u0000\u0000\u0104\u00e8\u0001"+
		"\u0000\u0000\u0000\u0104\u00e9\u0001\u0000\u0000\u0000\u0104\u00ea\u0001"+
		"\u0000\u0000\u0000\u0104\u00ee\u0001\u0000\u0000\u0000\u0104\u00f7\u0001"+
		"\u0000\u0000\u0000\u0104\u00f8\u0001\u0000\u0000\u0000\u0104\u00f9\u0001"+
		"\u0000\u0000\u0000\u0104\u00fa\u0001\u0000\u0000\u0000\u0104\u00fb\u0001"+
		"\u0000\u0000\u0000\u0104\u00fc\u0001\u0000\u0000\u0000\u0104\u00fd\u0001"+
		"\u0000\u0000\u0000\u0104\u00fe\u0001\u0000\u0000\u0000\u0104\u00ff\u0001"+
		"\u0000\u0000\u0000\u0104\u0100\u0001\u0000\u0000\u0000\u0104\u0101\u0001"+
		"\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0103\u0001"+
		"\u0000\u0000\u0000\u0105\u0015\u0001\u0000\u0000\u0000\u0106\u010e\u0005"+
		"O\u0000\u0000\u0107\u0108\u0005O\u0000\u0000\u0108\u010b\u0005Z\u0000"+
		"\u0000\u0109\u010c\u0003\u0016\u000b\u0000\u010a\u010c\u0003\u0018\f\u0000"+
		"\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010a\u0001\u0000\u0000\u0000"+
		"\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u0106\u0001\u0000\u0000\u0000"+
		"\u010d\u0107\u0001\u0000\u0000\u0000\u010e\u0017\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0005f\u0000\u0000\u0110\u0115\u0003\u0016\u000b\u0000\u0111"+
		"\u0112\u0005\u0007\u0000\u0000\u0112\u0114\u0003\u0016\u000b\u0000\u0113"+
		"\u0111\u0001\u0000\u0000\u0000\u0114\u0117\u0001\u0000\u0000\u0000\u0115"+
		"\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116"+
		"\u0118\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0118"+
		"\u0119\u0005t\u0000\u0000\u0119\u0019\u0001\u0000\u0000\u0000\u011a\u011b"+
		"\u0005D\u0000\u0000\u011b\u011e\u0003\u0016\u000b\u0000\u011c\u011d\u0005"+
		"`\u0000\u0000\u011d\u011f\u0003\u0016\u000b\u0000\u011e\u011c\u0001\u0000"+
		"\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000"+
		"\u0000\u0000\u0120\u0121\u0003\u0018\f\u0000\u0121\u001b\u0001\u0000\u0000"+
		"\u0000\u0122\u0124\u0003N\'\u0000\u0123\u0122\u0001\u0000\u0000\u0000"+
		"\u0124\u0127\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000"+
		"\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0128\u0001\u0000\u0000\u0000"+
		"\u0127\u0125\u0001\u0000\u0000\u0000\u0128\u0129\u0005<\u0000\u0000\u0129"+
		"\u012a\u0005O\u0000\u0000\u012a\u012b\u0005f\u0000\u0000\u012b\u012d\u0003"+
		" \u0010\u0000\u012c\u012e\u0003\"\u0011\u0000\u012d\u012c\u0001\u0000"+
		"\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000"+
		"\u0000\u0000\u012f\u0130\u0005t\u0000\u0000\u0130\u001d\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u0005\u0005\u0000\u0000\u0132\u0133\u0003X,\u0000\u0133"+
		"\u001f\u0001\u0000\u0000\u0000\u0134\u0139\u0003\u001e\u000f\u0000\u0135"+
		"\u0136\u0005\u0007\u0000\u0000\u0136\u0138\u0003\u001e\u000f\u0000\u0137"+
		"\u0135\u0001\u0000\u0000\u0000\u0138\u013b\u0001\u0000\u0000\u0000\u0139"+
		"\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a"+
		"!\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013c\u0141"+
		"\u0005,\u0000\u0000\u013d\u0140\u0003*\u0015\u0000\u013e\u0140\u0003\u008a"+
		"E\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u013f\u013e\u0001\u0000\u0000"+
		"\u0000\u0140\u0143\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000"+
		"\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142#\u0001\u0000\u0000\u0000"+
		"\u0143\u0141\u0001\u0000\u0000\u0000\u0144\u0145\u0005f\u0000\u0000\u0145"+
		"\u014a\u0003&\u0013\u0000\u0146\u0147\u0005\u0007\u0000\u0000\u0147\u0149"+
		"\u0003&\u0013\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0149\u014c\u0001"+
		"\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001"+
		"\u0000\u0000\u0000\u014b\u014d\u0001\u0000\u0000\u0000\u014c\u014a\u0001"+
		"\u0000\u0000\u0000\u014d\u014e\u0005t\u0000\u0000\u014e%\u0001\u0000\u0000"+
		"\u0000\u014f\u0154\u0003(\u0014\u0000\u0150\u0151\u0005\u0007\u0000\u0000"+
		"\u0151\u0153\u0003(\u0014\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0153"+
		"\u0156\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0154"+
		"\u0155\u0001\u0000\u0000\u0000\u0155\u0157\u0001\u0000\u0000\u0000\u0156"+
		"\u0154\u0001\u0000\u0000\u0000\u0157\u0158\u0005\u0012\u0000\u0000\u0158"+
		"\u0159\u0005O\u0000\u0000\u0159\'\u0001\u0000\u0000\u0000\u015a\u015e"+
		"\u0003\u008cF\u0000\u015b\u015e\u0003\u009aM\u0000\u015c\u015e\u0003\u0094"+
		"J\u0000\u015d\u015a\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000"+
		"\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015e)\u0001\u0000\u0000\u0000"+
		"\u015f\u0161\u0007\u0000\u0000\u0000\u0160\u015f\u0001\u0000\u0000\u0000"+
		"\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000"+
		"\u0162\u0163\u00059\u0000\u0000\u0163\u0164\u0003(\u0014\u0000\u0164\u0165"+
		"\u0003\u0086C\u0000\u0165+\u0001\u0000\u0000\u0000\u0166\u0167\u0003^"+
		"/\u0000\u0167\u0168\u0005V\u0000\u0000\u0168\u0169\u0003^/\u0000\u0169"+
		"-\u0001\u0000\u0000\u0000\u016a\u016b\u0005\u001b\u0000\u0000\u016b\u016c"+
		"\u0003\u0012\t\u0000\u016c\u016d\u0005\u001e\u0000\u0000\u016d/\u0001"+
		"\u0000\u0000\u0000\u016e\u016f\u0005O\u0000\u0000\u016f\u0170\u0003\u0090"+
		"H\u0000\u01701\u0001\u0000\u0000\u0000\u0171\u0172\u0005O\u0000\u0000"+
		"\u0172\u0173\u0003\u0094J\u0000\u01733\u0001\u0000\u0000\u0000\u0174\u0175"+
		"\u0005+\u0000\u0000\u0175\u0176\u0003`0\u0000\u0176\u0178\u00036\u001b"+
		"\u0000\u0177\u0179\u00038\u001c\u0000\u0178\u0177\u0001\u0000\u0000\u0000"+
		"\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000"+
		"\u017a\u017b\u0005 \u0000\u0000\u017b5\u0001\u0000\u0000\u0000\u017c\u017e"+
		"\u0005@\u0000\u0000\u017d\u017c\u0001\u0000\u0000\u0000\u017d\u017e\u0001"+
		"\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u0180\u0003"+
		"\u0012\t\u0000\u01807\u0001\u0000\u0000\u0000\u0181\u0182\u0005\u001f"+
		"\u0000\u0000\u0182\u0183\u0003\u0012\t\u0000\u01839\u0001\u0000\u0000"+
		"\u0000\u0184\u0187\u0005)\u0000\u0000\u0185\u0188\u0005\u0011\u0000\u0000"+
		"\u0186\u0188\u0003<\u001e\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187"+
		"\u0186\u0001\u0000\u0000\u0000\u0188;\u0001\u0000\u0000\u0000\u0189\u018e"+
		"\u0005O\u0000\u0000\u018a\u018b\u0005\u0007\u0000\u0000\u018b\u018d\u0005"+
		"O\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018d\u0190\u0001\u0000"+
		"\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000"+
		"\u0000\u0000\u018f=\u0001\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000"+
		"\u0000\u0191\u0195\u0003@ \u0000\u0192\u0195\u0003D\"\u0000\u0193\u0195"+
		"\u0003F#\u0000\u0194\u0191\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000"+
		"\u0000\u0000\u0194\u0193\u0001\u0000\u0000\u0000\u0195?\u0001\u0000\u0000"+
		"\u0000\u0196\u0197\u0005(\u0000\u0000\u0197\u0198\u0005O\u0000\u0000\u0198"+
		"\u0199\u0003B!\u0000\u0199\u019a\u0003^/\u0000\u019a\u019b\u0003\u0014"+
		"\n\u0000\u019bA\u0001\u0000\u0000\u0000\u019c\u019d\u0007\u0001\u0000"+
		"\u0000\u019dC\u0001\u0000\u0000\u0000\u019e\u019f\u0005K\u0000\u0000\u019f"+
		"\u01a0\u0003^/\u0000\u01a0\u01a1\u0003\u0014\n\u0000\u01a1E\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a3\u0005=\u0000\u0000\u01a3\u01a4\u0003\u0012\t"+
		"\u0000\u01a4\u01a5\u0005F\u0000\u0000\u01a5\u01a6\u0003^/\u0000\u01a6"+
		"G\u0001\u0000\u0000\u0000\u01a7\u01a9\u0005L\u0000\u0000\u01a8\u01aa\u0003"+
		"`0\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000"+
		"\u0000\u01aaI\u0001\u0000\u0000\u0000\u01ab\u01ac\u0005C\u0000\u0000\u01ac"+
		"\u01ad\u0003\u0012\t\u0000\u01ad\u01ae\u0005\u0014\u0000\u0000\u01ae\u01af"+
		"\u0003\u0012\t\u0000\u01af\u01b0\u0005 \u0000\u0000\u01b0K\u0001\u0000"+
		"\u0000\u0000\u01b1\u01b2\u0005\u0019\u0000\u0000\u01b2\u01b3\u0003`0\u0000"+
		"\u01b3M\u0001\u0000\u0000\u0000\u01b4\u01b5\u0005\u0001\u0000\u0000\u01b5"+
		"\u01ba\u0005O\u0000\u0000\u01b6\u01b7\u0005g\u0000\u0000\u01b7\u01b8\u0003"+
		"l6\u0000\u01b8\u01b9\u0005u\u0000\u0000\u01b9\u01bb\u0001\u0000\u0000"+
		"\u0000\u01ba\u01b6\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000"+
		"\u0000\u01bbO\u0001\u0000\u0000\u0000\u01bc\u01bd\u0007\u0002\u0000\u0000"+
		"\u01bd\u01be\u0003\u0082A\u0000\u01beQ\u0001\u0000\u0000\u0000\u01bf\u01c1"+
		"\u0005O\u0000\u0000\u01c0\u01c2\u0003X,\u0000\u01c1\u01c0\u0001\u0000"+
		"\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c5\u0003Z-\u0000\u01c4\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5S\u0001\u0000\u0000\u0000\u01c6"+
		"\u01c7\u0003V+\u0000\u01c7\u01c8\u0003R)\u0000\u01c8U\u0001\u0000\u0000"+
		"\u0000\u01c9\u01ca\u0007\u0003\u0000\u0000\u01caW\u0001\u0000\u0000\u0000"+
		"\u01cb\u01cc\u0005\u0006\u0000\u0000\u01cc\u01cd\u0003\u0016\u000b\u0000"+
		"\u01cdY\u0001\u0000\u0000\u0000\u01ce\u01cf\u0005V\u0000\u0000\u01cf\u01d0"+
		"\u0003`0\u0000\u01d0[\u0001\u0000\u0000\u0000\u01d1\u01d3\u0005f\u0000"+
		"\u0000\u01d2\u01d4\u0003^/\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d6\u0005t\u0000\u0000\u01d6]\u0001\u0000\u0000\u0000\u01d7\u01dc\u0003"+
		"`0\u0000\u01d8\u01d9\u0005\u0007\u0000\u0000\u01d9\u01db\u0003`0\u0000"+
		"\u01da\u01d8\u0001\u0000\u0000\u0000\u01db\u01de\u0001\u0000\u0000\u0000"+
		"\u01dc\u01da\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000"+
		"\u01dd_\u0001\u0000\u0000\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01df"+
		"\u01e0\u00060\uffff\uffff\u0000\u01e0\u0213\u0005O\u0000\u0000\u01e1\u0213"+
		"\u0003v;\u0000\u01e2\u0213\u0003.\u0017\u0000\u01e3\u01e4\u0005r\u0000"+
		"\u0000\u01e4\u0213\u0003`0\u0017\u01e5\u01e6\u0005\"\u0000\u0000\u01e6"+
		"\u01e9\u0005g\u0000\u0000\u01e7\u01ea\u0003`0\u0000\u01e8\u01ea\u0003"+
		"\u0012\t\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01e9\u01e8\u0001\u0000"+
		"\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb\u01ec\u0005u\u0000"+
		"\u0000\u01ec\u0213\u0001\u0000\u0000\u0000\u01ed\u0213\u0003n7\u0000\u01ee"+
		"\u0213\u0003h4\u0000\u01ef\u0213\u0003b1\u0000\u01f0\u0213\u0003d2\u0000"+
		"\u01f1\u01f2\u0005o\u0000\u0000\u01f2\u0213\u0003`0\u0010\u01f3\u0213"+
		"\u0003\\.\u0000\u01f4\u0213\u0003\u0086C\u0000\u01f5\u01f6\u0003\u009a"+
		"M\u0000\u01f6\u01f7\u0003`0\r\u01f7\u0213\u0001\u0000\u0000\u0000\u01f8"+
		"\u01f9\u0003\u008cF\u0000\u01f9\u01fb\u0005g\u0000\u0000\u01fa\u01fc\u0003"+
		"^/\u0000\u01fb\u01fa\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000"+
		"\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd\u01fe\u0005u\u0000\u0000"+
		"\u01fe\u0213\u0001\u0000\u0000\u0000\u01ff\u0200\u0005g\u0000\u0000\u0200"+
		"\u0201\u0003`0\u0000\u0201\u0202\u0005u\u0000\u0000\u0202\u0213\u0001"+
		"\u0000\u0000\u0000\u0203\u0204\u0005E\u0000\u0000\u0204\u0213\u0003`0"+
		"\u0005\u0205\u0206\u0005\u0016\u0000\u0000\u0206\u0213\u0003^/\u0000\u0207"+
		"\u0208\u00053\u0000\u0000\u0208\u0209\u0003`0\u0000\u0209\u020b\u0005"+
		"A\u0000\u0000\u020a\u020c\u0003t:\u0000\u020b\u020a\u0001\u0000\u0000"+
		"\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d\u020b\u0001\u0000\u0000"+
		"\u0000\u020d\u020e\u0001\u0000\u0000\u0000\u020e\u0210\u0001\u0000\u0000"+
		"\u0000\u020f\u0211\u0003r9\u0000\u0210\u020f\u0001\u0000\u0000\u0000\u0210"+
		"\u0211\u0001\u0000\u0000\u0000\u0211\u0213\u0001\u0000\u0000\u0000\u0212"+
		"\u01df\u0001\u0000\u0000\u0000\u0212\u01e1\u0001\u0000\u0000\u0000\u0212"+
		"\u01e2\u0001\u0000\u0000\u0000\u0212\u01e3\u0001\u0000\u0000\u0000\u0212"+
		"\u01e5\u0001\u0000\u0000\u0000\u0212\u01ed\u0001\u0000\u0000\u0000\u0212"+
		"\u01ee\u0001\u0000\u0000\u0000\u0212\u01ef\u0001\u0000\u0000\u0000\u0212"+
		"\u01f0\u0001\u0000\u0000\u0000\u0212\u01f1\u0001\u0000\u0000\u0000\u0212"+
		"\u01f3\u0001\u0000\u0000\u0000\u0212\u01f4\u0001\u0000\u0000\u0000\u0212"+
		"\u01f5\u0001\u0000\u0000\u0000\u0212\u01f8\u0001\u0000\u0000\u0000\u0212"+
		"\u01ff\u0001\u0000\u0000\u0000\u0212\u0203\u0001\u0000\u0000\u0000\u0212"+
		"\u0205\u0001\u0000\u0000\u0000\u0212\u0207\u0001\u0000\u0000\u0000\u0213"+
		"\u0243\u0001\u0000\u0000\u0000\u0214\u0215\n\f\u0000\u0000\u0215\u0216"+
		"\u0003\u008cF\u0000\u0216\u0217\u0003`0\r\u0217\u0242\u0001\u0000\u0000"+
		"\u0000\u0218\u0219\n\t\u0000\u0000\u0219\u021a\u0005\u0003\u0000\u0000"+
		"\u021a\u021b\u0005O\u0000\u0000\u021b\u021c\u0005\u0003\u0000\u0000\u021c"+
		"\u0242\u0003`0\n\u021d\u0220\n\b\u0000\u0000\u021e\u0221\u0005.\u0000"+
		"\u0000\u021f\u0221\u00057\u0000\u0000\u0220\u021e\u0001\u0000\u0000\u0000"+
		"\u0220\u021f\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000"+
		"\u0222\u0242\u0003`0\t\u0223\u0224\n\u0015\u0000\u0000\u0224\u0225\u0005"+
		"\t\u0000\u0000\u0225\u0242\u0003~?\u0000\u0226\u0228\n\u000b\u0000\u0000"+
		"\u0227\u0229\u0003\u0080@\u0000\u0228\u0227\u0001\u0000\u0000\u0000\u0228"+
		"\u0229\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022a"+
		"\u022c\u0005g\u0000\u0000\u022b\u022d\u0003^/\u0000\u022c\u022b\u0001"+
		"\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u022e\u0001"+
		"\u0000\u0000\u0000\u022e\u0242\u0005u\u0000\u0000\u022f\u0230\n\u0007"+
		"\u0000\u0000\u0230\u0231\u0005e\u0000\u0000\u0231\u0232\u0003`0\u0000"+
		"\u0232\u0233\u0005s\u0000\u0000\u0233\u0242\u0001\u0000\u0000\u0000\u0234"+
		"\u0235\n\u0003\u0000\u0000\u0235\u0238\u00050\u0000\u0000\u0236\u0239"+
		"\u0005O\u0000\u0000\u0237\u0239\u0003`0\u0000\u0238\u0236\u0001\u0000"+
		"\u0000\u0000\u0238\u0237\u0001\u0000\u0000\u0000\u0239\u0242\u0001\u0000"+
		"\u0000\u0000\u023a\u023b\n\u0002\u0000\u0000\u023b\u023c\u0005~\u0000"+
		"\u0000\u023c\u023f\u0003`0\u0000\u023d\u023e\u0005\u0006\u0000\u0000\u023e"+
		"\u0240\u0003`0\u0000\u023f\u023d\u0001\u0000\u0000\u0000\u023f\u0240\u0001"+
		"\u0000\u0000\u0000\u0240\u0242\u0001\u0000\u0000\u0000\u0241\u0214\u0001"+
		"\u0000\u0000\u0000\u0241\u0218\u0001\u0000\u0000\u0000\u0241\u021d\u0001"+
		"\u0000\u0000\u0000\u0241\u0223\u0001\u0000\u0000\u0000\u0241\u0226\u0001"+
		"\u0000\u0000\u0000\u0241\u022f\u0001\u0000\u0000\u0000\u0241\u0234\u0001"+
		"\u0000\u0000\u0000\u0241\u023a\u0001\u0000\u0000\u0000\u0242\u0245\u0001"+
		"\u0000\u0000\u0000\u0243\u0241\u0001\u0000\u0000\u0000\u0243\u0244\u0001"+
		"\u0000\u0000\u0000\u0244a\u0001\u0000\u0000\u0000\u0245\u0243\u0001\u0000"+
		"\u0000\u0000\u0246\u0247\u0005f\u0000\u0000\u0247\u024a\u0003`0\u0000"+
		"\u0248\u0249\u0005\u0007\u0000\u0000\u0249\u024b\u0003`0\u0000\u024a\u0248"+
		"\u0001\u0000\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b\u024c"+
		"\u0001\u0000\u0000\u0000\u024c\u024d\u0005q\u0000\u0000\u024d\u0250\u0003"+
		"`0\u0000\u024e\u024f\u0005\u0080\u0000\u0000\u024f\u0251\u0005r\u0000"+
		"\u0000\u0250\u024e\u0001\u0000\u0000\u0000\u0250\u0251\u0001\u0000\u0000"+
		"\u0000\u0251\u0252\u0001\u0000\u0000\u0000\u0252\u0253\u0005t\u0000\u0000"+
		"\u0253c\u0001\u0000\u0000\u0000\u0254\u0258\u0005f\u0000\u0000\u0255\u0256"+
		"\u0003`0\u0000\u0256\u0257\u00058\u0000\u0000\u0257\u0259\u0001\u0000"+
		"\u0000\u0000\u0258\u0255\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000"+
		"\u0000\u0000\u0259\u025a\u0001\u0000\u0000\u0000\u025a\u025b\u0005O\u0000"+
		"\u0000\u025b\u025c\u0003B!\u0000\u025c\u025f\u0003`0\u0000\u025d\u025e"+
		"\u0005+\u0000\u0000\u025e\u0260\u0003`0\u0000\u025f\u025d\u0001\u0000"+
		"\u0000\u0000\u025f\u0260\u0001\u0000\u0000\u0000\u0260\u0261\u0001\u0000"+
		"\u0000\u0000\u0261\u0262\u0005t\u0000\u0000\u0262e\u0001\u0000\u0000\u0000"+
		"\u0263\u0264\u0007\u0004\u0000\u0000\u0264\u0265\u0005\u0080\u0000\u0000"+
		"\u0265\u0266\u0003`0\u0000\u0266g\u0001\u0000\u0000\u0000\u0267\u0268"+
		"\u0005f\u0000\u0000\u0268\u026d\u0003f3\u0000\u0269\u026a\u0005\u0007"+
		"\u0000\u0000\u026a\u026c\u0003f3\u0000\u026b\u0269\u0001\u0000\u0000\u0000"+
		"\u026c\u026f\u0001\u0000\u0000\u0000\u026d\u026b\u0001\u0000\u0000\u0000"+
		"\u026d\u026e\u0001\u0000\u0000\u0000\u026e\u0270\u0001\u0000\u0000\u0000"+
		"\u026f\u026d\u0001\u0000\u0000\u0000\u0270\u0271\u0005t\u0000\u0000\u0271"+
		"i\u0001\u0000\u0000\u0000\u0272\u0273\u0007\u0004\u0000\u0000\u0273\u0274"+
		"\u0005\u0006\u0000\u0000\u0274\u0275\u0003`0\u0000\u0275k\u0001\u0000"+
		"\u0000\u0000\u0276\u027b\u0003j5\u0000\u0277\u0278\u0005\u0007\u0000\u0000"+
		"\u0278\u027a\u0003j5\u0000\u0279\u0277\u0001\u0000\u0000\u0000\u027a\u027d"+
		"\u0001\u0000\u0000\u0000\u027b\u0279\u0001\u0000\u0000\u0000\u027b\u027c"+
		"\u0001\u0000\u0000\u0000\u027cm\u0001\u0000\u0000\u0000\u027d\u027b\u0001"+
		"\u0000\u0000\u0000\u027e\u027f\u0005f\u0000\u0000\u027f\u0280\u0003l6"+
		"\u0000\u0280\u0281\u0005t\u0000\u0000\u0281o\u0001\u0000\u0000\u0000\u0282"+
		"\u0283\u0007\u0005\u0000\u0000\u0283q\u0001\u0000\u0000\u0000\u0284\u0285"+
		"\u0005\u0017\u0000\u0000\u0285\u0286\u0005]\u0000\u0000\u0286\u0287\u0003"+
		"`0\u0000\u0287s\u0001\u0000\u0000\u0000\u0288\u028a\u0005\'\u0000\u0000"+
		"\u0289\u0288\u0001\u0000\u0000\u0000\u0289\u028a\u0001\u0000\u0000\u0000"+
		"\u028a\u028b\u0001\u0000\u0000\u0000\u028b\u028c\u0003^/\u0000\u028c\u028d"+
		"\u0005]\u0000\u0000\u028d\u028e\u0003`0\u0000\u028eu\u0001\u0000\u0000"+
		"\u0000\u028f\u0294\u0003x<\u0000\u0290\u0294\u0003z=\u0000\u0291\u0294"+
		"\u0003|>\u0000\u0292\u0294\u0003~?\u0000\u0293\u028f\u0001\u0000\u0000"+
		"\u0000\u0293\u0290\u0001\u0000\u0000\u0000\u0293\u0291\u0001\u0000\u0000"+
		"\u0000\u0293\u0292\u0001\u0000\u0000\u0000\u0294w\u0001\u0000\u0000\u0000"+
		"\u0295\u0296\u00056\u0000\u0000\u0296y\u0001\u0000\u0000\u0000\u0297\u0298"+
		"\u0007\u0006\u0000\u0000\u0298{\u0001\u0000\u0000\u0000\u0299\u029a\u0007"+
		"\u0007\u0000\u0000\u029a}\u0001\u0000\u0000\u0000\u029b\u029c\u0007\b"+
		"\u0000\u0000\u029c\u007f\u0001\u0000\u0000\u0000\u029d\u029e\u0005f\u0000"+
		"\u0000\u029e\u029f\u0003(\u0014\u0000\u029f\u02a0\u0005t\u0000\u0000\u02a0"+
		"\u0081\u0001\u0000\u0000\u0000\u02a1\u02a6\u0003R)\u0000\u02a2\u02a3\u0005"+
		"\u0007\u0000\u0000\u02a3\u02a5\u0003R)\u0000\u02a4\u02a2\u0001\u0000\u0000"+
		"\u0000\u02a5\u02a8\u0001\u0000\u0000\u0000\u02a6\u02a4\u0001\u0000\u0000"+
		"\u0000\u02a6\u02a7\u0001\u0000\u0000\u0000\u02a7\u0083\u0001\u0000\u0000"+
		"\u0000\u02a8\u02a6\u0001\u0000\u0000\u0000\u02a9\u02ab\u0003X,\u0000\u02aa"+
		"\u02a9\u0001\u0000\u0000\u0000\u02aa\u02ab\u0001\u0000\u0000\u0000\u02ab"+
		"\u02b0\u0001\u0000\u0000\u0000\u02ac\u02ad\u0005e\u0000\u0000\u02ad\u02ae"+
		"\u0003`0\u0000\u02ae\u02af\u0005s\u0000\u0000\u02af\u02b1\u0001\u0000"+
		"\u0000\u0000\u02b0\u02ac\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001\u0000"+
		"\u0000\u0000\u02b1\u0085\u0001\u0000\u0000\u0000\u02b2\u02b6\u0003\u008a"+
		"E\u0000\u02b3\u02b4\u0005*\u0000\u0000\u02b4\u02b6\u0003\u0088D\u0000"+
		"\u02b5\u02b2\u0001\u0000\u0000\u0000\u02b5\u02b3\u0001\u0000\u0000\u0000"+
		"\u02b6\u0087\u0001\u0000\u0000\u0000\u02b7\u02b9\u0003N\'\u0000\u02b8"+
		"\u02b7\u0001\u0000\u0000\u0000\u02b9\u02bc\u0001\u0000\u0000\u0000\u02ba"+
		"\u02b8\u0001\u0000\u0000\u0000\u02ba\u02bb\u0001\u0000\u0000\u0000\u02bb"+
		"\u02be\u0001\u0000\u0000\u0000\u02bc\u02ba\u0001\u0000\u0000\u0000\u02bd"+
		"\u02bf\u0003$\u0012\u0000\u02be\u02bd\u0001\u0000\u0000\u0000\u02be\u02bf"+
		"\u0001\u0000\u0000\u0000\u02bf\u02c6\u0001\u0000\u0000\u0000\u02c0\u02c7"+
		"\u0003R)\u0000\u02c1\u02c3\u0005g\u0000\u0000\u02c2\u02c4\u0003\u0082"+
		"A\u0000\u02c3\u02c2\u0001\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000"+
		"\u0000\u02c4\u02c5\u0001\u0000\u0000\u0000\u02c5\u02c7\u0005u\u0000\u0000"+
		"\u02c6\u02c0\u0001\u0000\u0000\u0000\u02c6\u02c1\u0001\u0000\u0000\u0000"+
		"\u02c7\u02c8\u0001\u0000\u0000\u0000\u02c8\u02c9\u0003\u0084B\u0000\u02c9"+
		"\u02ca\u0005V\u0000\u0000\u02ca\u02cb\u0003\u0012\t\u0000\u02cb\u02cc"+
		"\u0005>\u0000\u0000\u02cc\u0089\u0001\u0000\u0000\u0000\u02cd\u02cf\u0003"+
		"N\'\u0000\u02ce\u02cd\u0001\u0000\u0000\u0000\u02cf\u02d2\u0001\u0000"+
		"\u0000\u0000\u02d0\u02ce\u0001\u0000\u0000\u0000\u02d0\u02d1\u0001\u0000"+
		"\u0000\u0000\u02d1\u02d4\u0001\u0000\u0000\u0000\u02d2\u02d0\u0001\u0000"+
		"\u0000\u0000\u02d3\u02d5\u0003$\u0012\u0000\u02d4\u02d3\u0001\u0000\u0000"+
		"\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5\u02dc\u0001\u0000\u0000"+
		"\u0000\u02d6\u02dd\u0003R)\u0000\u02d7\u02d9\u0005g\u0000\u0000\u02d8"+
		"\u02da\u0003\u0082A\u0000\u02d9\u02d8\u0001\u0000\u0000\u0000\u02d9\u02da"+
		"\u0001\u0000\u0000\u0000\u02da\u02db\u0001\u0000\u0000\u0000\u02db\u02dd"+
		"\u0005u\u0000\u0000\u02dc\u02d6\u0001\u0000\u0000\u0000\u02dc\u02d7\u0001"+
		"\u0000\u0000\u0000\u02dd\u02de\u0001\u0000\u0000\u0000\u02de\u02df\u0003"+
		"\u0084B\u0000\u02df\u02e0\u0005d\u0000\u0000\u02e0\u02e1\u0003`0\u0000"+
		"\u02e1\u008b\u0001\u0000\u0000\u0000\u02e2\u02e5\u0003\u008eG\u0000\u02e3"+
		"\u02e5\u0005}\u0000\u0000\u02e4\u02e2\u0001\u0000\u0000\u0000\u02e4\u02e3"+
		"\u0001\u0000\u0000\u0000\u02e5\u008d\u0001\u0000\u0000\u0000\u02e6\u02ed"+
		"\u0003\u0098L\u0000\u02e7\u02ed\u0003\u0092I\u0000\u02e8\u02ed\u0003p"+
		"8\u0000\u02e9\u02ed\u0003\u009cN\u0000\u02ea\u02ed\u0005S\u0000\u0000"+
		"\u02eb\u02ed\u0005r\u0000\u0000\u02ec\u02e6\u0001\u0000\u0000\u0000\u02ec"+
		"\u02e7\u0001\u0000\u0000\u0000\u02ec\u02e8\u0001\u0000\u0000\u0000\u02ec"+
		"\u02e9\u0001\u0000\u0000\u0000\u02ec\u02ea\u0001\u0000\u0000\u0000\u02ec"+
		"\u02eb\u0001\u0000\u0000\u0000\u02ed\u008f\u0001\u0000\u0000\u0000\u02ee"+
		"\u02ef\u0003\u0096K\u0000\u02ef\u02f0\u0003`0\u0000\u02f0\u0091\u0001"+
		"\u0000\u0000\u0000\u02f1\u02f2\u0007\t\u0000\u0000\u02f2\u0093\u0001\u0000"+
		"\u0000\u0000\u02f3\u02f4\u0003\u0092I\u0000\u02f4\u02f5\u0003\u0092I\u0000"+
		"\u02f5\u02f8\u0001\u0000\u0000\u0000\u02f6\u02f8\u0005}\u0000\u0000\u02f7"+
		"\u02f3\u0001\u0000\u0000\u0000\u02f7\u02f6\u0001\u0000\u0000\u0000\u02f8"+
		"\u0095\u0001\u0000\u0000\u0000\u02f9\u02fa\u0003\u008cF\u0000\u02fa\u02fb"+
		"\u0005V\u0000\u0000\u02fb\u0097\u0001\u0000\u0000\u0000\u02fc\u02fd\u0007"+
		"\n\u0000\u0000\u02fd\u0099\u0001\u0000\u0000\u0000\u02fe\u02ff\u0007\u000b"+
		"\u0000\u0000\u02ff\u009b\u0001\u0000\u0000\u0000\u0300\u0301\u0007\f\u0000"+
		"\u0000\u0301\u009d\u0001\u0000\u0000\u0000D\u009f\u00a7\u00b5\u00c3\u00cd"+
		"\u00d2\u00f0\u00f4\u0104\u010b\u010d\u0115\u011e\u0125\u012d\u0139\u013f"+
		"\u0141\u014a\u0154\u015d\u0160\u0178\u017d\u0187\u018e\u0194\u01a9\u01ba"+
		"\u01c1\u01c4\u01d3\u01dc\u01e9\u01fb\u020d\u0210\u0212\u0220\u0228\u022c"+
		"\u0238\u023f\u0241\u0243\u024a\u0250\u0258\u025f\u026d\u027b\u0289\u0293"+
		"\u02a6\u02aa\u02b0\u02b5\u02ba\u02be\u02c3\u02c6\u02d0\u02d4\u02d9\u02dc"+
		"\u02e4\u02ec\u02f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}