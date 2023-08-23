// Generated from G:/Nutt/src/main/java\Nutt.g4 by ANTLR 4.12.0
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
		AtSign=1, BackSlash=2, BackTick=3, BlockComment=4, Brace_Square_Left=5, 
		Brace_Square_Right=6, Brace_Curly_Left=7, Brace_Curly_Right=8, Brace_Paren_Left=9, 
		Brace_Paren_Right=10, Char_String=11, Colon=12, Comma=13, DecimalEscape=14, 
		Dot=15, EscapeCharacter=16, EscapeSequence=17, Float=18, HexEscape=19, 
		HexFloat=20, HexInt=21, Int=22, KW_Alias=23, KW_All=24, KW_Annotation=25, 
		KW_As=26, KW_Break=27, KW_Catch=28, KW_Class=29, KW_Continue=30, KW_CommonOf=31, 
		KW_Default=32, KW_Define=33, KW_Demand=34, KW_Deports=35, KW_Do=36, KW_Doif=37, 
		KW_Doifn=38, KW_Done=39, KW_Else=40, KW_End=41, KW_Enum=42, KW_Eval=43, 
		KW_Every=44, KW_Exec=45, KW_Exit=46, KW_Expose=47, KW_False=48, KW_Final=49, 
		KW_For=50, KW_Forget=51, KW_Funct=52, KW_Global=53, KW_If=54, KW_Imports=55, 
		KW_In=56, KW_Infix=57, KW_InstanceOf=58, KW_Is=59, KW_Local=60, KW_Macro=61, 
		KW_Match=62, KW_Matched=63, KW_Module=64, KW_Mut=65, KW_New=66, KW_Nil=67, 
		KW_Not_In=68, KW_Of=69, KW_On=70, KW_Outer=71, KW_Operator=72, KW_Param=73, 
		KW_Postfix=74, KW_Prefix=75, KW_Private=76, KW_Protected=77, KW_Public=78, 
		KW_Pure=79, KW_Record=80, KW_Repeat=81, KW_Requires=82, KW_Return=83, 
		KW_Reverse=84, KW_Static=85, KW_Then=86, KW_This=87, KW_To=88, KW_Trait=89, 
		KW_True=90, KW_Try=91, KW_Type=92, KW_TypeOf=93, KW_Until=94, KW_Using=95, 
		KW_Val=96, KW_Var=97, KW_While=98, KW_With=99, KW_Yield=100, LineComment=101, 
		NAME=102, NATIVE=103, OP_Add=104, OP_And=105, OP_Append=106, OP_Assign=107, 
		OP_Backward=108, OP_Case_Arrow=109, OP_Compose=110, OP_Div=111, OP_Equal=112, 
		OP_Extends=113, OP_Forward=114, OP_Greater=115, OP_IntDiv=116, OP_Implements=117, 
		OP_LambdaReturn=118, OP_Length=119, OP_Less=120, OP_Less_Equal=121, OP_Mod=122, 
		OP_Mult=123, OP_Not=124, OP_Or=125, OP_Pass=126, OP_Power=127, OP_Range=128, 
		OP_Reverse=129, OP_Similar=130, OP_SlightlyGreater=131, OP_SlightlyLess=132, 
		OP_Sub=133, OP_Tilda=134, OP_Underscore=135, OP_Xor=136, Op_Greater_Equal=137, 
		Op_Not_Equal=138, Op_Not_Similar=139, Op_Custom=140, Question=141, SHEBANG=142, 
		SemiColon=143, Type=144, UtfEscape=145, WS=146, Normal_string=147, TYPE=148;
	public static final int
		RULE_chunk = 0, RULE_module = 1, RULE_module_start = 2, RULE_module_name = 3, 
		RULE_module_require = 4, RULE_named_import = 5, RULE_named_import_list = 6, 
		RULE_module_import = 7, RULE_module_deport = 8, RULE_module_list = 9, 
		RULE_module_group = 10, RULE_module_name_or_group = 11, RULE_block = 12, 
		RULE_functiondef = 13, RULE_funct_modifier = 14, RULE_stat = 15, RULE_type_param = 16, 
		RULE_template_type = 17, RULE_relation_type = 18, RULE_type_param_list = 19, 
		RULE_trait_def = 20, RULE_class_def = 21, RULE_access_modifier = 22, RULE_class_member = 23, 
		RULE_signature_def = 24, RULE_funct_signature = 25, RULE_type_def = 26, 
		RULE_record_def = 27, RULE_record_member = 28, RULE_record_member_list = 29, 
		RULE_using = 30, RULE_overloading_operator_param = 31, RULE_overloading_operator = 32, 
		RULE_operator_decl = 33, RULE_annotation_decl = 34, RULE_group_assignment = 35, 
		RULE_do_done_block = 36, RULE_composed_assign = 37, RULE_self_assign = 38, 
		RULE_if_then_else_block = 39, RULE_then_block = 40, RULE_else_block = 41, 
		RULE_forget = 42, RULE_flat_name_list = 43, RULE_loop = 44, RULE_for_each_loop = 45, 
		RULE_op_direction = 46, RULE_while_do_loop = 47, RULE_repeat_until_loop = 48, 
		RULE_function_return = 49, RULE_function_yield = 50, RULE_try_catch = 51, 
		RULE_demand = 52, RULE_annotation = 53, RULE_var_signature = 54, RULE_var_decl = 55, 
		RULE_scope_qualifier = 56, RULE_constant_qualifier = 57, RULE_type = 58, 
		RULE_alias_decl = 59, RULE_alias_name = 60, RULE_by_type_var_decl = 61, 
		RULE_by_value_var_decl = 62, RULE_array_initializer = 63, RULE_array_element = 64, 
		RULE_spread_pair = 65, RULE_explist = 66, RULE_qualified_name = 67, RULE_exp = 68, 
		RULE_match_to = 69, RULE_range_array_initializer = 70, RULE_comprehense_array_initializer = 71, 
		RULE_map_element = 72, RULE_map_initializer = 73, RULE_record_element = 74, 
		RULE_record_element_list = 75, RULE_record_initializer = 76, RULE_operator_logical = 77, 
		RULE_default_match_branch = 78, RULE_match_branch = 79, RULE_atom = 80, 
		RULE_nil = 81, RULE_boolean = 82, RULE_number = 83, RULE_int = 84, RULE_float = 85, 
		RULE_string = 86, RULE_operator = 87, RULE_using_in_call = 88, RULE_var_signature_list = 89, 
		RULE_vararg_or_signature = 90, RULE_func_output = 91, RULE_local_funct = 92, 
		RULE_funcbody = 93, RULE_lambda_decl = 94, RULE_operator_infix = 95, RULE_default_infix_operator = 96, 
		RULE_operator_composed = 97, RULE_operator_math = 98, RULE_operator_postfix = 99, 
		RULE_composed_assign_op = 100, RULE_operator_prefix = 101, RULE_operator_comparison = 102;
	private static String[] makeRuleNames() {
		return new String[] {
			"chunk", "module", "module_start", "module_name", "module_require", "named_import", 
			"named_import_list", "module_import", "module_deport", "module_list", 
			"module_group", "module_name_or_group", "block", "functiondef", "funct_modifier", 
			"stat", "type_param", "template_type", "relation_type", "type_param_list", 
			"trait_def", "class_def", "access_modifier", "class_member", "signature_def", 
			"funct_signature", "type_def", "record_def", "record_member", "record_member_list", 
			"using", "overloading_operator_param", "overloading_operator", "operator_decl", 
			"annotation_decl", "group_assignment", "do_done_block", "composed_assign", 
			"self_assign", "if_then_else_block", "then_block", "else_block", "forget", 
			"flat_name_list", "loop", "for_each_loop", "op_direction", "while_do_loop", 
			"repeat_until_loop", "function_return", "function_yield", "try_catch", 
			"demand", "annotation", "var_signature", "var_decl", "scope_qualifier", 
			"constant_qualifier", "type", "alias_decl", "alias_name", "by_type_var_decl", 
			"by_value_var_decl", "array_initializer", "array_element", "spread_pair", 
			"explist", "qualified_name", "exp", "match_to", "range_array_initializer", 
			"comprehense_array_initializer", "map_element", "map_initializer", "record_element", 
			"record_element_list", "record_initializer", "operator_logical", "default_match_branch", 
			"match_branch", "atom", "nil", "boolean", "number", "int", "float", "string", 
			"operator", "using_in_call", "var_signature_list", "vararg_or_signature", 
			"func_output", "local_funct", "funcbody", "lambda_decl", "operator_infix", 
			"default_infix_operator", "operator_composed", "operator_math", "operator_postfix", 
			"composed_assign_op", "operator_prefix", "operator_comparison"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@'", "'\\'", "'`'", null, "'['", "']'", "'{'", "'}'", "'('", 
			"')'", null, "':'", "','", null, "'.'", null, null, null, null, null, 
			null, null, "'alias'", null, "'annotation'", "'as'", "'break'", "'catch'", 
			"'class'", "'continue'", "'commonof'", "'default'", "'define'", "'demand'", 
			"'deports'", "'do'", "'doif'", "'doifn'", "'done'", "'else'", "'end'", 
			"'enum'", "'eval'", "'every'", "'exec'", "'exit'", "'expose'", null, 
			"'final'", "'for'", "'forget'", "'funct'", "'global'", "'if'", "'imports'", 
			null, "'infix'", "'instanceof'", "'is'", "'local'", "'macro'", "'match'", 
			"'matched'", "'module'", "'mut'", "'new'", "'nil'", null, "'of'", "'on'", 
			"'outer'", "'operator'", "'param'", "'postfix'", "'prefix'", "'private'", 
			"'protected'", "'public'", "'pure'", "'record'", "'repeat'", "'requires'", 
			"'return'", "'reverse'", "'static'", "'then'", "'this'", "'to'", "'trait'", 
			null, "'try'", "'type'", "'typeof'", "'until'", "'using'", "'val'", "'var'", 
			"'while'", "'with'", "'yield'", null, null, "'$$NATIVE.'", "'+'", null, 
			"';;'", "'='", null, "'-->'", "'<=='", null, null, "'<:'", null, "'>'", 
			"'//'", "'::'", "'==>'", "'#'", "'<'", null, "'%'", null, null, null, 
			"'...'", "'^'", "'..'", "'<|>'", "'=='", "'~>'", "'<~'", "'-'", "'~'", 
			"'_'", null, null, null, null, null, "'?'", null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AtSign", "BackSlash", "BackTick", "BlockComment", "Brace_Square_Left", 
			"Brace_Square_Right", "Brace_Curly_Left", "Brace_Curly_Right", "Brace_Paren_Left", 
			"Brace_Paren_Right", "Char_String", "Colon", "Comma", "DecimalEscape", 
			"Dot", "EscapeCharacter", "EscapeSequence", "Float", "HexEscape", "HexFloat", 
			"HexInt", "Int", "KW_Alias", "KW_All", "KW_Annotation", "KW_As", "KW_Break", 
			"KW_Catch", "KW_Class", "KW_Continue", "KW_CommonOf", "KW_Default", "KW_Define", 
			"KW_Demand", "KW_Deports", "KW_Do", "KW_Doif", "KW_Doifn", "KW_Done", 
			"KW_Else", "KW_End", "KW_Enum", "KW_Eval", "KW_Every", "KW_Exec", "KW_Exit", 
			"KW_Expose", "KW_False", "KW_Final", "KW_For", "KW_Forget", "KW_Funct", 
			"KW_Global", "KW_If", "KW_Imports", "KW_In", "KW_Infix", "KW_InstanceOf", 
			"KW_Is", "KW_Local", "KW_Macro", "KW_Match", "KW_Matched", "KW_Module", 
			"KW_Mut", "KW_New", "KW_Nil", "KW_Not_In", "KW_Of", "KW_On", "KW_Outer", 
			"KW_Operator", "KW_Param", "KW_Postfix", "KW_Prefix", "KW_Private", "KW_Protected", 
			"KW_Public", "KW_Pure", "KW_Record", "KW_Repeat", "KW_Requires", "KW_Return", 
			"KW_Reverse", "KW_Static", "KW_Then", "KW_This", "KW_To", "KW_Trait", 
			"KW_True", "KW_Try", "KW_Type", "KW_TypeOf", "KW_Until", "KW_Using", 
			"KW_Val", "KW_Var", "KW_While", "KW_With", "KW_Yield", "LineComment", 
			"NAME", "NATIVE", "OP_Add", "OP_And", "OP_Append", "OP_Assign", "OP_Backward", 
			"OP_Case_Arrow", "OP_Compose", "OP_Div", "OP_Equal", "OP_Extends", "OP_Forward", 
			"OP_Greater", "OP_IntDiv", "OP_Implements", "OP_LambdaReturn", "OP_Length", 
			"OP_Less", "OP_Less_Equal", "OP_Mod", "OP_Mult", "OP_Not", "OP_Or", "OP_Pass", 
			"OP_Power", "OP_Range", "OP_Reverse", "OP_Similar", "OP_SlightlyGreater", 
			"OP_SlightlyLess", "OP_Sub", "OP_Tilda", "OP_Underscore", "OP_Xor", "Op_Greater_Equal", 
			"Op_Not_Equal", "Op_Not_Similar", "Op_Custom", "Question", "SHEBANG", 
			"SemiColon", "Type", "UtfEscape", "WS", "Normal_string", "TYPE"
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
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_Module) {
				{
				setState(206);
				module();
				}
			}

			setState(209);
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
		public List<Module_requireContext> module_require() {
			return getRuleContexts(Module_requireContext.class);
		}
		public Module_requireContext module_require(int i) {
			return getRuleContext(Module_requireContext.class,i);
		}
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			module_start();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_Requires) {
				{
				{
				setState(212);
				module_require();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(218);
					module_import();
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(224);
			block();
			setState(225);
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
			setState(227);
			match(KW_Module);
			setState(228);
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
		public TerminalNode KW_As() { return getToken(Nutt.KW_As, 0); }
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(NAME);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
					match(Dot);
					setState(232);
					match(NAME);
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(238);
				match(KW_As);
				setState(239);
				match(NAME);
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
	public static class Module_requireContext extends ParserRuleContext {
		public TerminalNode KW_Requires() { return getToken(Nutt.KW_Requires, 0); }
		public Named_import_listContext named_import_list() {
			return getRuleContext(Named_import_listContext.class,0);
		}
		public Module_requireContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_require; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitModule_require(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_requireContext module_require() throws RecognitionException {
		Module_requireContext _localctx = new Module_requireContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_module_require);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(KW_Requires);
			setState(243);
			named_import_list();
			}
		}
		catch (RecognitionException re) {
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
	public static class Named_importContext extends ParserRuleContext {
		public Module_nameContext module_name() {
			return getRuleContext(Module_nameContext.class,0);
		}
		public TerminalNode KW_As() { return getToken(Nutt.KW_As, 0); }
		public TerminalNode NAME() { return getToken(Nutt.NAME, 0); }
		public Named_importContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_import; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitNamed_import(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Named_importContext named_import() throws RecognitionException {
		Named_importContext _localctx = new Named_importContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_named_import);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			module_name();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_As) {
				{
				setState(246);
				match(KW_As);
				setState(247);
				match(NAME);
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
	public static class Named_import_listContext extends ParserRuleContext {
		public List<Named_importContext> named_import() {
			return getRuleContexts(Named_importContext.class);
		}
		public Named_importContext named_import(int i) {
			return getRuleContext(Named_importContext.class,i);
		}
		public TerminalNode Comma() { return getToken(Nutt.Comma, 0); }
		public Named_import_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_import_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitNamed_import_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Named_import_listContext named_import_list() throws RecognitionException {
		Named_import_listContext _localctx = new Named_import_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_named_import_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			named_import();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(251);
				match(Comma);
				setState(252);
				named_import();
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
		enterRule(_localctx, 14, RULE_module_import);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(KW_Imports);
			setState(256);
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
		enterRule(_localctx, 16, RULE_module_deport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(KW_Deports);
			setState(259);
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
		enterRule(_localctx, 18, RULE_module_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			module_name_or_group();
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(262);
					match(Comma);
					setState(263);
					module_name_or_group();
					}
					} 
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		public TerminalNode Brace_Curly_Left() { return getToken(Nutt.Brace_Curly_Left, 0); }
		public Module_listContext module_list() {
			return getRuleContext(Module_listContext.class,0);
		}
		public TerminalNode Brace_Curly_Right() { return getToken(Nutt.Brace_Curly_Right, 0); }
		public TerminalNode Dot() { return getToken(Nutt.Dot, 0); }
		public TerminalNode KW_All() { return getToken(Nutt.KW_All, 0); }
		public TerminalNode KW_As() { return getToken(Nutt.KW_As, 0); }
		public TerminalNode NAME() { return getToken(Nutt.NAME, 0); }
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
		enterRule(_localctx, 20, RULE_module_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			module_name();
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Brace_Curly_Left:
				{
				setState(270);
				match(Brace_Curly_Left);
				setState(271);
				module_list();
				setState(272);
				match(Brace_Curly_Right);
				}
				break;
			case Dot:
				{
				setState(274);
				match(Dot);
				setState(275);
				match(KW_All);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(278);
				match(KW_As);
				setState(279);
				match(NAME);
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
		enterRule(_localctx, 22, RULE_module_name_or_group);
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				module_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
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
		enterRule(_localctx, 24, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(286);
					stat();
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		public TerminalNode KW_Funct() { return getToken(Nutt.KW_Funct, 0); }
		public Flat_name_listContext flat_name_list() {
			return getRuleContext(Flat_name_listContext.class,0);
		}
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public FunctiondefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFunctiondef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondefContext functiondef() throws RecognitionException {
		FunctiondefContext _localctx = new FunctiondefContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functiondef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(KW_Funct);
			setState(293);
			flat_name_list();
			setState(294);
			funcbody();
			}
		}
		catch (RecognitionException re) {
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
	public static class Funct_modifierContext extends ParserRuleContext {
		public TerminalNode KW_Pure() { return getToken(Nutt.KW_Pure, 0); }
		public TerminalNode KW_Static() { return getToken(Nutt.KW_Static, 0); }
		public Funct_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funct_modifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFunct_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funct_modifierContext funct_modifier() throws RecognitionException {
		Funct_modifierContext _localctx = new Funct_modifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funct_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_la = _input.LA(1);
			if ( !(_la==KW_Pure || _la==KW_Static) ) {
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exec_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitExec_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Annotation_decl_statContext extends StatContext {
		public Annotation_declContext annotation_decl() {
			return getRuleContext(Annotation_declContext.class,0);
		}
		public Annotation_decl_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitAnnotation_decl_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Functioncall_statContext extends StatContext {
		public ExpContext name;
		public ExplistContext arguments;
		public TerminalNode Brace_Paren_Left() { return getToken(Nutt.Brace_Paren_Left, 0); }
		public TerminalNode Brace_Paren_Right() { return getToken(Nutt.Brace_Paren_Right, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode KW_With() { return getToken(Nutt.KW_With, 0); }
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
		public FunctiondefContext functiondef() {
			return getRuleContext(FunctiondefContext.class,0);
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
	public static class Return_statContext extends StatContext {
		public Function_returnContext function_return() {
			return getRuleContext(Function_returnContext.class,0);
		}
		public Return_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitReturn_stat(this);
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
	public static class Class_def_statContext extends StatContext {
		public Class_defContext class_def() {
			return getRuleContext(Class_defContext.class,0);
		}
		public Class_def_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitClass_def_stat(this);
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
	public static class Trait_def_statContext extends StatContext {
		public Trait_defContext trait_def() {
			return getRuleContext(Trait_defContext.class,0);
		}
		public Trait_def_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitTrait_def_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Match_to_statContext extends StatContext {
		public Match_toContext match_to() {
			return getRuleContext(Match_toContext.class,0);
		}
		public Match_to_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitMatch_to_stat(this);
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
		enterRule(_localctx, 30, RULE_stat);
		int _la;
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new DemandStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				demand();
				}
				break;
			case 2:
				_localctx = new Do_if_statContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(KW_Doif);
				setState(300);
				exp(0);
				setState(301);
				stat();
				}
				break;
			case 3:
				_localctx = new Do_if_not_statContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
				match(KW_Doifn);
				setState(304);
				exp(0);
				setState(305);
				stat();
				}
				break;
			case 4:
				_localctx = new Exec_statContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
				match(KW_Exec);
				setState(308);
				exp(0);
				}
				break;
			case 5:
				_localctx = new Module_import_statContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(309);
				module_import();
				}
				break;
			case 6:
				_localctx = new Module_deport_statContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(310);
				module_deport();
				}
				break;
			case 7:
				_localctx = new Group_assignment_statContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(311);
				group_assignment();
				}
				break;
			case 8:
				_localctx = new Var_decl_statContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(312);
				var_decl();
				}
				break;
			case 9:
				_localctx = new Operator_decl_statContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(313);
				operator_decl();
				}
				break;
			case 10:
				_localctx = new Annotation_decl_statContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(314);
				annotation_decl();
				}
				break;
			case 11:
				_localctx = new Forget_statContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(315);
				forget();
				}
				break;
			case 12:
				_localctx = new Functiondef_statContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(316);
				functiondef();
				}
				break;
			case 13:
				_localctx = new Functioncall_statContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(317);
				((Functioncall_statContext)_localctx).name = exp(0);
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_With) {
					{
					setState(318);
					match(KW_With);
					setState(319);
					using_in_call();
					}
				}

				setState(322);
				match(Brace_Paren_Left);
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4616515144371145354L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & -4618896821620039677L) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & 133065L) != 0)) {
					{
					setState(323);
					((Functioncall_statContext)_localctx).arguments = explist();
					}
				}

				setState(326);
				match(Brace_Paren_Right);
				}
				break;
			case 14:
				_localctx = new Do_done_block_statContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(328);
				do_done_block();
				}
				break;
			case 15:
				_localctx = new Loop_statContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(329);
				loop();
				}
				break;
			case 16:
				_localctx = new Composed_assign_statContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(330);
				composed_assign();
				}
				break;
			case 17:
				_localctx = new Self_in_place_op_statContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(331);
				self_assign();
				}
				break;
			case 18:
				_localctx = new If_then_else_block_statContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(332);
				if_then_else_block();
				}
				break;
			case 19:
				_localctx = new Try_catch_statContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(333);
				try_catch();
				}
				break;
			case 20:
				_localctx = new Pass_statContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(334);
				match(OP_Pass);
				}
				break;
			case 21:
				_localctx = new Type_def_statContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(335);
				type_def();
				}
				break;
			case 22:
				_localctx = new Trait_def_statContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(336);
				trait_def();
				}
				break;
			case 23:
				_localctx = new Class_def_statContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(337);
				class_def();
				}
				break;
			case 24:
				_localctx = new Record_def_statContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(338);
				record_def();
				}
				break;
			case 25:
				_localctx = new Exit_statContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(339);
				match(KW_Exit);
				}
				break;
			case 26:
				_localctx = new Return_statContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(340);
				function_return();
				}
				break;
			case 27:
				_localctx = new Yield_statContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(341);
				function_yield();
				}
				break;
			case 28:
				_localctx = new Break_statContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(342);
				match(KW_Break);
				}
				break;
			case 29:
				_localctx = new Continue_statContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(343);
				match(KW_Continue);
				}
				break;
			case 30:
				_localctx = new Match_to_statContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(344);
				match_to();
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
		public Type_paramContext sum_type;
		public Token flat_type;
		public TerminalNode NAME() { return getToken(Nutt.NAME, 0); }
		public TerminalNode Brace_Paren_Left() { return getToken(Nutt.Brace_Paren_Left, 0); }
		public List<Type_paramContext> type_param() {
			return getRuleContexts(Type_paramContext.class);
		}
		public Type_paramContext type_param(int i) {
			return getRuleContext(Type_paramContext.class,i);
		}
		public TerminalNode Brace_Paren_Right() { return getToken(Nutt.Brace_Paren_Right, 0); }
		public Template_typeContext template_type() {
			return getRuleContext(Template_typeContext.class,0);
		}
		public Relation_typeContext relation_type() {
			return getRuleContext(Relation_typeContext.class,0);
		}
		public List<TerminalNode> OP_Add() { return getTokens(Nutt.OP_Add); }
		public TerminalNode OP_Add(int i) {
			return getToken(Nutt.OP_Add, i);
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
		return type_param(0);
	}

	private Type_paramContext type_param(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Type_paramContext _localctx = new Type_paramContext(_ctx, _parentState);
		Type_paramContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_type_param, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(348);
				((Type_paramContext)_localctx).flat_type = match(NAME);
				}
				break;
			case 2:
				{
				setState(349);
				match(Brace_Paren_Left);
				setState(350);
				type_param(0);
				setState(351);
				match(Brace_Paren_Right);
				}
				break;
			case 3:
				{
				setState(353);
				template_type();
				}
				break;
			case 4:
				{
				setState(354);
				relation_type();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Type_paramContext(_parentctx, _parentState);
					_localctx.sum_type = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_type_param);
					setState(357);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(360); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(358);
							match(OP_Add);
							setState(359);
							((Type_paramContext)_localctx).sum_type = type_param(0);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(362); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Template_typeContext extends ParserRuleContext {
		public Token complex_type_start;
		public TerminalNode NAME() { return getToken(Nutt.NAME, 0); }
		public TerminalNode OP_Or() { return getToken(Nutt.OP_Or, 0); }
		public Type_paramContext type_param() {
			return getRuleContext(Type_paramContext.class,0);
		}
		public Type_param_listContext type_param_list() {
			return getRuleContext(Type_param_listContext.class,0);
		}
		public Template_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitTemplate_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_typeContext template_type() throws RecognitionException {
		Template_typeContext _localctx = new Template_typeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_template_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			((Template_typeContext)_localctx).complex_type_start = match(NAME);
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_Or:
				{
				setState(370);
				match(OP_Or);
				setState(371);
				type_param(0);
				}
				break;
			case Brace_Curly_Left:
				{
				setState(372);
				type_param_list();
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
	public static class Relation_typeContext extends ParserRuleContext {
		public TerminalNode KW_Type() { return getToken(Nutt.KW_Type, 0); }
		public TerminalNode OP_Extends() { return getToken(Nutt.OP_Extends, 0); }
		public List<Type_paramContext> type_param() {
			return getRuleContexts(Type_paramContext.class);
		}
		public Type_paramContext type_param(int i) {
			return getRuleContext(Type_paramContext.class,i);
		}
		public TerminalNode OP_Implements() { return getToken(Nutt.OP_Implements, 0); }
		public Relation_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitRelation_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relation_typeContext relation_type() throws RecognitionException {
		Relation_typeContext _localctx = new Relation_typeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relation_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(KW_Type);
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(376);
				match(OP_Extends);
				setState(377);
				type_param(0);
				setState(378);
				match(OP_Implements);
				setState(379);
				type_param(0);
				}
				break;
			case 2:
				{
				setState(381);
				match(OP_Extends);
				setState(382);
				type_param(0);
				}
				break;
			case 3:
				{
				setState(383);
				match(OP_Implements);
				setState(384);
				type_param(0);
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
	public static class Type_param_listContext extends ParserRuleContext {
		public TerminalNode Brace_Curly_Left() { return getToken(Nutt.Brace_Curly_Left, 0); }
		public List<Type_paramContext> type_param() {
			return getRuleContexts(Type_paramContext.class);
		}
		public Type_paramContext type_param(int i) {
			return getRuleContext(Type_paramContext.class,i);
		}
		public TerminalNode Brace_Curly_Right() { return getToken(Nutt.Brace_Curly_Right, 0); }
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
		enterRule(_localctx, 38, RULE_type_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(Brace_Curly_Left);
			setState(388);
			type_param(0);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(389);
				match(Comma);
				setState(390);
				type_param(0);
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(396);
			match(Brace_Curly_Right);
			}
		}
		catch (RecognitionException re) {
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
	public static class Trait_defContext extends ParserRuleContext {
		public Token parent_trait;
		public TerminalNode KW_Trait() { return getToken(Nutt.KW_Trait, 0); }
		public List<TerminalNode> NAME() { return getTokens(Nutt.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(Nutt.NAME, i);
		}
		public TerminalNode Brace_Curly_Left() { return getToken(Nutt.Brace_Curly_Left, 0); }
		public TerminalNode Brace_Curly_Right() { return getToken(Nutt.Brace_Curly_Right, 0); }
		public TerminalNode OP_Extends() { return getToken(Nutt.OP_Extends, 0); }
		public List<Signature_defContext> signature_def() {
			return getRuleContexts(Signature_defContext.class);
		}
		public Signature_defContext signature_def(int i) {
			return getRuleContext(Signature_defContext.class,i);
		}
		public Trait_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trait_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitTrait_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trait_defContext trait_def() throws RecognitionException {
		Trait_defContext _localctx = new Trait_defContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_trait_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(KW_Trait);
			setState(399);
			match(NAME);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Extends) {
				{
				setState(400);
				match(OP_Extends);
				setState(401);
				((Trait_defContext)_localctx).parent_trait = match(NAME);
				}
			}

			setState(404);
			match(Brace_Curly_Left);
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(405);
				signature_def();
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(411);
			match(Brace_Curly_Right);
			}
		}
		catch (RecognitionException re) {
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
	public static class Class_defContext extends ParserRuleContext {
		public Token class_name;
		public Token parent_class;
		public Token trait;
		public TerminalNode KW_Class() { return getToken(Nutt.KW_Class, 0); }
		public TerminalNode Brace_Curly_Left() { return getToken(Nutt.Brace_Curly_Left, 0); }
		public TerminalNode Brace_Curly_Right() { return getToken(Nutt.Brace_Curly_Right, 0); }
		public List<TerminalNode> NAME() { return getTokens(Nutt.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(Nutt.NAME, i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode OP_Extends() { return getToken(Nutt.OP_Extends, 0); }
		public TerminalNode OP_Implements() { return getToken(Nutt.OP_Implements, 0); }
		public List<Class_memberContext> class_member() {
			return getRuleContexts(Class_memberContext.class);
		}
		public Class_memberContext class_member(int i) {
			return getRuleContext(Class_memberContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(Nutt.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Nutt.Comma, i);
		}
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitClass_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AtSign) {
				{
				{
				setState(413);
				annotation();
				}
				}
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(419);
			match(KW_Class);
			setState(420);
			((Class_defContext)_localctx).class_name = match(NAME);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Extends) {
				{
				setState(421);
				match(OP_Extends);
				setState(422);
				((Class_defContext)_localctx).parent_class = match(NAME);
				}
			}

			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Implements) {
				{
				setState(425);
				match(OP_Implements);
				setState(426);
				((Class_defContext)_localctx).trait = match(NAME);
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(427);
					match(Comma);
					setState(428);
					((Class_defContext)_localctx).trait = match(NAME);
					}
					}
					setState(433);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(436);
			match(Brace_Curly_Left);
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 157625986966355976L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 6903107289817824961L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 3987L) != 0)) {
				{
				{
				setState(437);
				class_member();
				}
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(443);
			match(Brace_Curly_Right);
			}
		}
		catch (RecognitionException re) {
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
	public static class Access_modifierContext extends ParserRuleContext {
		public TerminalNode KW_Public() { return getToken(Nutt.KW_Public, 0); }
		public TerminalNode KW_Protected() { return getToken(Nutt.KW_Protected, 0); }
		public TerminalNode KW_Private() { return getToken(Nutt.KW_Private, 0); }
		public Access_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_modifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitAccess_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_modifierContext access_modifier() throws RecognitionException {
		Access_modifierContext _localctx = new Access_modifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_access_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_la = _input.LA(1);
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 7L) != 0)) ) {
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
	public static class Class_memberContext extends ParserRuleContext {
		public Operator_declContext operator_decl() {
			return getRuleContext(Operator_declContext.class,0);
		}
		public FunctiondefContext functiondef() {
			return getRuleContext(FunctiondefContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Access_modifierContext access_modifier() {
			return getRuleContext(Access_modifierContext.class,0);
		}
		public Class_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_member; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitClass_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_memberContext class_member() throws RecognitionException {
		Class_memberContext _localctx = new Class_memberContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_class_member);
		int _la;
		try {
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BackTick:
			case KW_Infix:
			case KW_Operator:
			case KW_Postfix:
			case KW_Prefix:
			case OP_Add:
			case OP_And:
			case OP_Append:
			case OP_Div:
			case OP_Equal:
			case OP_Greater:
			case OP_IntDiv:
			case OP_Length:
			case OP_Less:
			case OP_Less_Equal:
			case OP_Mod:
			case OP_Mult:
			case OP_Not:
			case OP_Or:
			case OP_Power:
			case OP_Reverse:
			case OP_Similar:
			case OP_Sub:
			case OP_Xor:
			case Op_Greater_Equal:
			case Op_Not_Equal:
			case Op_Not_Similar:
			case Op_Custom:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				operator_decl();
				}
				break;
			case KW_Alias:
			case KW_Funct:
			case KW_Global:
			case KW_Mut:
			case KW_Outer:
			case KW_Private:
			case KW_Protected:
			case KW_Public:
			case KW_Val:
			case KW_Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 7L) != 0)) {
					{
					setState(448);
					access_modifier();
					}
				}

				setState(453);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_Funct:
					{
					setState(451);
					functiondef();
					}
					break;
				case KW_Alias:
				case KW_Global:
				case KW_Mut:
				case KW_Outer:
				case KW_Val:
				case KW_Var:
					{
					setState(452);
					var_decl();
					}
					break;
				default:
					throw new NoViableAltException(this);
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
	public static class Signature_defContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(Nutt.NAME, 0); }
		public Funct_signatureContext funct_signature() {
			return getRuleContext(Funct_signatureContext.class,0);
		}
		public Signature_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitSignature_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signature_defContext signature_def() throws RecognitionException {
		Signature_defContext _localctx = new Signature_defContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_signature_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(NAME);
			setState(458);
			funct_signature();
			}
		}
		catch (RecognitionException re) {
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
	public static class Funct_signatureContext extends ParserRuleContext {
		public Func_outputContext func_output() {
			return getRuleContext(Func_outputContext.class,0);
		}
		public Vararg_or_signatureContext vararg_or_signature() {
			return getRuleContext(Vararg_or_signatureContext.class,0);
		}
		public TerminalNode Brace_Paren_Left() { return getToken(Nutt.Brace_Paren_Left, 0); }
		public TerminalNode Brace_Paren_Right() { return getToken(Nutt.Brace_Paren_Right, 0); }
		public Funct_modifierContext funct_modifier() {
			return getRuleContext(Funct_modifierContext.class,0);
		}
		public UsingContext using() {
			return getRuleContext(UsingContext.class,0);
		}
		public Var_signature_listContext var_signature_list() {
			return getRuleContext(Var_signature_listContext.class,0);
		}
		public Funct_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funct_signature; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFunct_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funct_signatureContext funct_signature() throws RecognitionException {
		Funct_signatureContext _localctx = new Funct_signatureContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_funct_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_Pure || _la==KW_Static) {
				{
				setState(460);
				funct_modifier();
				}
			}

			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Brace_Curly_Left) {
				{
				setState(463);
				using();
				}
			}

			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
			case OP_Pass:
				{
				setState(466);
				vararg_or_signature();
				}
				break;
			case Brace_Paren_Left:
				{
				setState(467);
				match(Brace_Paren_Left);
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME || _la==OP_Pass) {
					{
					setState(468);
					var_signature_list();
					}
				}

				setState(471);
				match(Brace_Paren_Right);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(474);
			func_output();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode OP_Assign() { return getToken(Nutt.OP_Assign, 0); }
		public TerminalNode OP_Extends() { return getToken(Nutt.OP_Extends, 0); }
		public Type_param_listContext type_param_list() {
			return getRuleContext(Type_param_listContext.class,0);
		}
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
		enterRule(_localctx, 52, RULE_type_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(KW_Type);
			setState(477);
			((Type_defContext)_localctx).derived_type = type_param(0);
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Extends) {
				{
				setState(478);
				match(OP_Extends);
				setState(479);
				((Type_defContext)_localctx).parent_type = type_param(0);
				}
			}

			setState(485);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Brace_Curly_Left:
				{
				setState(482);
				((Type_defContext)_localctx).children = type_param_list();
				}
				break;
			case OP_Assign:
				{
				setState(483);
				match(OP_Assign);
				setState(484);
				type_param(0);
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
	public static class Record_defContext extends ParserRuleContext {
		public Token record_name;
		public Token parent_record;
		public Token trait;
		public TerminalNode KW_Record() { return getToken(Nutt.KW_Record, 0); }
		public TerminalNode Brace_Curly_Left() { return getToken(Nutt.Brace_Curly_Left, 0); }
		public Record_member_listContext record_member_list() {
			return getRuleContext(Record_member_listContext.class,0);
		}
		public TerminalNode Brace_Curly_Right() { return getToken(Nutt.Brace_Curly_Right, 0); }
		public List<TerminalNode> NAME() { return getTokens(Nutt.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(Nutt.NAME, i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode OP_Extends() { return getToken(Nutt.OP_Extends, 0); }
		public TerminalNode OP_Implements() { return getToken(Nutt.OP_Implements, 0); }
		public List<TerminalNode> Comma() { return getTokens(Nutt.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Nutt.Comma, i);
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
		enterRule(_localctx, 54, RULE_record_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AtSign) {
				{
				{
				setState(487);
				annotation();
				}
				}
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(493);
			match(KW_Record);
			setState(494);
			((Record_defContext)_localctx).record_name = match(NAME);
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Extends) {
				{
				setState(495);
				match(OP_Extends);
				setState(496);
				((Record_defContext)_localctx).parent_record = match(NAME);
				}
			}

			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Implements) {
				{
				setState(499);
				match(OP_Implements);
				setState(500);
				((Record_defContext)_localctx).trait = match(NAME);
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(501);
					match(Comma);
					setState(502);
					((Record_defContext)_localctx).trait = match(NAME);
					}
					}
					setState(507);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(510);
			match(Brace_Curly_Left);
			setState(511);
			record_member_list();
			setState(512);
			match(Brace_Curly_Right);
			}
		}
		catch (RecognitionException re) {
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
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public By_type_var_declContext by_type_var_decl() {
			return getRuleContext(By_type_var_declContext.class,0);
		}
		public Operator_declContext operator_decl() {
			return getRuleContext(Operator_declContext.class,0);
		}
		public FunctiondefContext functiondef() {
			return getRuleContext(FunctiondefContext.class,0);
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
		enterRule(_localctx, 56, RULE_record_member);
		try {
			setState(519);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Char_String:
			case Normal_string:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(514);
				string();
				setState(515);
				by_type_var_decl();
				}
				}
				break;
			case BackTick:
			case KW_Infix:
			case KW_Operator:
			case KW_Postfix:
			case KW_Prefix:
			case OP_Add:
			case OP_And:
			case OP_Append:
			case OP_Div:
			case OP_Equal:
			case OP_Greater:
			case OP_IntDiv:
			case OP_Length:
			case OP_Less:
			case OP_Less_Equal:
			case OP_Mod:
			case OP_Mult:
			case OP_Not:
			case OP_Or:
			case OP_Power:
			case OP_Reverse:
			case OP_Similar:
			case OP_Sub:
			case OP_Xor:
			case Op_Greater_Equal:
			case Op_Not_Equal:
			case Op_Not_Similar:
			case Op_Custom:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				operator_decl();
				}
				break;
			case KW_Funct:
				enterOuterAlt(_localctx, 3);
				{
				setState(518);
				functiondef();
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
	public static class Record_member_listContext extends ParserRuleContext {
		public List<Record_memberContext> record_member() {
			return getRuleContexts(Record_memberContext.class);
		}
		public Record_memberContext record_member(int i) {
			return getRuleContext(Record_memberContext.class,i);
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
		enterRule(_localctx, 58, RULE_record_member_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 148618787703228424L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 2792119099092631565L) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & 2079L) != 0)) {
				{
				{
				setState(521);
				record_member();
				}
				}
				setState(526);
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
		public TerminalNode Brace_Curly_Left() { return getToken(Nutt.Brace_Curly_Left, 0); }
		public List<Overloading_operator_paramContext> overloading_operator_param() {
			return getRuleContexts(Overloading_operator_paramContext.class);
		}
		public Overloading_operator_paramContext overloading_operator_param(int i) {
			return getRuleContext(Overloading_operator_paramContext.class,i);
		}
		public TerminalNode Brace_Curly_Right() { return getToken(Nutt.Brace_Curly_Right, 0); }
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
		enterRule(_localctx, 60, RULE_using);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(Brace_Curly_Left);
			setState(528);
			overloading_operator_param();
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(529);
				match(Comma);
				setState(530);
				overloading_operator_param();
				}
				}
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(536);
			match(Brace_Curly_Right);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 62, RULE_overloading_operator_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			overloading_operator();
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(539);
				match(Comma);
				setState(540);
				overloading_operator();
				}
				}
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(546);
			match(KW_As);
			setState(547);
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
		enterRule(_localctx, 64, RULE_overloading_operator);
		try {
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				operator_infix();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				operator_prefix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(551);
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
		public Overloading_operatorContext overloading_operator() {
			return getRuleContext(Overloading_operatorContext.class,0);
		}
		public Local_functContext local_funct() {
			return getRuleContext(Local_functContext.class,0);
		}
		public TerminalNode KW_Operator() { return getToken(Nutt.KW_Operator, 0); }
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
		enterRule(_localctx, 66, RULE_operator_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 393217L) != 0)) {
				{
				setState(554);
				_la = _input.LA(1);
				if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 393217L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_Operator) {
				{
				setState(557);
				match(KW_Operator);
				}
			}

			setState(560);
			overloading_operator();
			setState(561);
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
	public static class Annotation_declContext extends ParserRuleContext {
		public TerminalNode KW_Annotation() { return getToken(Nutt.KW_Annotation, 0); }
		public TerminalNode NAME() { return getToken(Nutt.NAME, 0); }
		public TerminalNode Brace_Curly_Left() { return getToken(Nutt.Brace_Curly_Left, 0); }
		public TerminalNode KW_Return() { return getToken(Nutt.KW_Return, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Brace_Curly_Right() { return getToken(Nutt.Brace_Curly_Right, 0); }
		public List<Vararg_or_signatureContext> vararg_or_signature() {
			return getRuleContexts(Vararg_or_signatureContext.class);
		}
		public Vararg_or_signatureContext vararg_or_signature(int i) {
			return getRuleContext(Vararg_or_signatureContext.class,i);
		}
		public List<TerminalNode> KW_Param() { return getTokens(Nutt.KW_Param); }
		public TerminalNode KW_Param(int i) {
			return getToken(Nutt.KW_Param, i);
		}
		public Annotation_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitAnnotation_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Annotation_declContext annotation_decl() throws RecognitionException {
		Annotation_declContext _localctx = new Annotation_declContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_annotation_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(KW_Annotation);
			setState(564);
			match(NAME);
			setState(565);
			match(Brace_Curly_Left);
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 9007199791611905L) != 0)) {
				{
				{
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_Param) {
					{
					setState(566);
					match(KW_Param);
					}
				}

				setState(569);
				vararg_or_signature();
				}
				}
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(575);
			match(KW_Return);
			setState(576);
			exp(0);
			setState(577);
			match(Brace_Curly_Right);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 70, RULE_group_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			((Group_assignmentContext)_localctx).variables = explist();
			setState(580);
			match(OP_Assign);
			setState(581);
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
		enterRule(_localctx, 72, RULE_do_done_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(KW_Do);
			setState(584);
			block();
			setState(585);
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
		enterRule(_localctx, 74, RULE_composed_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(NAME);
			setState(588);
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
		enterRule(_localctx, 76, RULE_self_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(NAME);
			setState(591);
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
		enterRule(_localctx, 78, RULE_if_then_else_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(KW_If);
			setState(594);
			exp(0);
			setState(595);
			then_block();
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_Else) {
				{
				setState(596);
				else_block();
				}
			}

			setState(599);
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
		enterRule(_localctx, 80, RULE_then_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_Then) {
				{
				setState(601);
				match(KW_Then);
				}
			}

			setState(604);
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
		enterRule(_localctx, 82, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			match(KW_Else);
			setState(607);
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
		enterRule(_localctx, 84, RULE_forget);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(KW_Forget);
			setState(612);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_All:
				{
				setState(610);
				match(KW_All);
				}
				break;
			case NAME:
				{
				setState(611);
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
		enterRule(_localctx, 86, RULE_flat_name_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(NAME);
			setState(619);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(615);
					match(Comma);
					setState(616);
					match(NAME);
					}
					} 
				}
				setState(621);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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
		enterRule(_localctx, 88, RULE_loop);
		try {
			setState(625);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_For:
				enterOuterAlt(_localctx, 1);
				{
				setState(622);
				for_each_loop();
				}
				break;
			case KW_While:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				while_do_loop();
				}
				break;
			case KW_Repeat:
				enterOuterAlt(_localctx, 3);
				{
				setState(624);
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
		public Token ind;
		public Token val;
		public TerminalNode KW_For() { return getToken(Nutt.KW_For, 0); }
		public Op_directionContext op_direction() {
			return getRuleContext(Op_directionContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public List<TerminalNode> OP_Underscore() { return getTokens(Nutt.OP_Underscore); }
		public TerminalNode OP_Underscore(int i) {
			return getToken(Nutt.OP_Underscore, i);
		}
		public List<TerminalNode> NAME() { return getTokens(Nutt.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(Nutt.NAME, i);
		}
		public TerminalNode Comma() { return getToken(Nutt.Comma, 0); }
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
		enterRule(_localctx, 90, RULE_for_each_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			match(KW_For);
			setState(628);
			((For_each_loopContext)_localctx).ind = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==OP_Underscore) ) {
				((For_each_loopContext)_localctx).ind = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(629);
				match(Comma);
				setState(630);
				((For_each_loopContext)_localctx).val = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NAME || _la==OP_Underscore) ) {
					((For_each_loopContext)_localctx).val = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(633);
			op_direction();
			setState(634);
			explist();
			setState(635);
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
		enterRule(_localctx, 92, RULE_op_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
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
		enterRule(_localctx, 94, RULE_while_do_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			match(KW_While);
			setState(640);
			explist();
			setState(641);
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
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
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
		enterRule(_localctx, 96, RULE_repeat_until_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(KW_Repeat);
			setState(644);
			stat();
			setState(645);
			match(KW_Until);
			setState(646);
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
	public static class Function_returnContext extends ParserRuleContext {
		public TerminalNode KW_Return() { return getToken(Nutt.KW_Return, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Function_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_return; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFunction_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_returnContext function_return() throws RecognitionException {
		Function_returnContext _localctx = new Function_returnContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_function_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(KW_Return);
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(649);
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
	public static class Function_yieldContext extends ParserRuleContext {
		public TerminalNode KW_Yield() { return getToken(Nutt.KW_Yield, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
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
		enterRule(_localctx, 100, RULE_function_yield);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(KW_Yield);
			setState(653);
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
	public static class Try_catchContext extends ParserRuleContext {
		public StatContext try_branch;
		public StatContext catch_branch;
		public TerminalNode KW_Try() { return getToken(Nutt.KW_Try, 0); }
		public TerminalNode KW_Catch() { return getToken(Nutt.KW_Catch, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode KW_End() { return getToken(Nutt.KW_End, 0); }
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
		enterRule(_localctx, 102, RULE_try_catch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			match(KW_Try);
			setState(656);
			((Try_catchContext)_localctx).try_branch = stat();
			setState(657);
			match(KW_Catch);
			setState(658);
			((Try_catchContext)_localctx).catch_branch = stat();
			setState(660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(659);
				match(KW_End);
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
	public static class DemandContext extends ParserRuleContext {
		public TerminalNode KW_Demand() { return getToken(Nutt.KW_Demand, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode KW_With() { return getToken(Nutt.KW_With, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
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
		enterRule(_localctx, 104, RULE_demand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			match(KW_Demand);
			setState(663);
			exp(0);
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(664);
				match(KW_With);
				setState(665);
				string();
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
	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AtSign() { return getToken(Nutt.AtSign, 0); }
		public TerminalNode NAME() { return getToken(Nutt.NAME, 0); }
		public TerminalNode Brace_Paren_Left() { return getToken(Nutt.Brace_Paren_Left, 0); }
		public Record_element_listContext record_element_list() {
			return getRuleContext(Record_element_listContext.class,0);
		}
		public TerminalNode Brace_Paren_Right() { return getToken(Nutt.Brace_Paren_Right, 0); }
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
		enterRule(_localctx, 106, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(AtSign);
			setState(669);
			match(NAME);
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(670);
				match(Brace_Paren_Left);
				setState(671);
				record_element_list();
				setState(672);
				match(Brace_Paren_Right);
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
		enterRule(_localctx, 108, RULE_var_signature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			match(NAME);
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(677);
				((Var_signatureContext)_localctx).by_type = by_type_var_decl();
				}
				break;
			}
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(680);
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
		public Var_signature_listContext var_signature_list() {
			return getRuleContext(Var_signature_listContext.class,0);
		}
		public Scope_qualifierContext scope_qualifier() {
			return getRuleContext(Scope_qualifierContext.class,0);
		}
		public Alias_declContext alias_decl() {
			return getRuleContext(Alias_declContext.class,0);
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
		enterRule(_localctx, 110, RULE_var_decl);
		int _la;
		try {
			setState(690);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_Global:
			case KW_Mut:
			case KW_Outer:
			case KW_Val:
			case KW_Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_Global || _la==KW_Outer) {
					{
					setState(683);
					scope_qualifier();
					}
				}

				setState(686);
				constant_qualifier();
				setState(687);
				var_signature_list();
				}
				break;
			case KW_Alias:
				enterOuterAlt(_localctx, 2);
				{
				setState(689);
				alias_decl();
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
	public static class Scope_qualifierContext extends ParserRuleContext {
		public TerminalNode KW_Global() { return getToken(Nutt.KW_Global, 0); }
		public TerminalNode KW_Outer() { return getToken(Nutt.KW_Outer, 0); }
		public TerminalNode Brace_Paren_Left() { return getToken(Nutt.Brace_Paren_Left, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Brace_Paren_Right() { return getToken(Nutt.Brace_Paren_Right, 0); }
		public Scope_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope_qualifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitScope_qualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scope_qualifierContext scope_qualifier() throws RecognitionException {
		Scope_qualifierContext _localctx = new Scope_qualifierContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_scope_qualifier);
		try {
			setState(698);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_Global:
				enterOuterAlt(_localctx, 1);
				{
				setState(692);
				match(KW_Global);
				}
				break;
			case KW_Outer:
				enterOuterAlt(_localctx, 2);
				{
				setState(693);
				match(KW_Outer);
				setState(694);
				match(Brace_Paren_Left);
				setState(695);
				exp(0);
				setState(696);
				match(Brace_Paren_Right);
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
	public static class Constant_qualifierContext extends ParserRuleContext {
		public TerminalNode KW_Var() { return getToken(Nutt.KW_Var, 0); }
		public TerminalNode KW_Val() { return getToken(Nutt.KW_Val, 0); }
		public TerminalNode KW_Mut() { return getToken(Nutt.KW_Mut, 0); }
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
		enterRule(_localctx, 114, RULE_constant_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 6442450945L) != 0)) ) {
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(Nutt.TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			match(TYPE);
			}
		}
		catch (RecognitionException re) {
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
	public static class Alias_declContext extends ParserRuleContext {
		public Token anchor_name;
		public TerminalNode KW_Alias() { return getToken(Nutt.KW_Alias, 0); }
		public TerminalNode KW_As() { return getToken(Nutt.KW_As, 0); }
		public List<Alias_nameContext> alias_name() {
			return getRuleContexts(Alias_nameContext.class);
		}
		public Alias_nameContext alias_name(int i) {
			return getRuleContext(Alias_nameContext.class,i);
		}
		public TerminalNode NAME() { return getToken(Nutt.NAME, 0); }
		public List<TerminalNode> Comma() { return getTokens(Nutt.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Nutt.Comma, i);
		}
		public Alias_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitAlias_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alias_declContext alias_decl() throws RecognitionException {
		Alias_declContext _localctx = new Alias_declContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_alias_decl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(KW_Alias);
			setState(705);
			((Alias_declContext)_localctx).anchor_name = match(NAME);
			setState(706);
			match(KW_As);
			setState(707);
			alias_name();
			setState(712);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(708);
					match(Comma);
					setState(709);
					alias_name();
					}
					} 
				}
				setState(714);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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
	public static class Alias_nameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(Nutt.NAME, 0); }
		public Alias_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitAlias_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alias_nameContext alias_name() throws RecognitionException {
		Alias_nameContext _localctx = new Alias_nameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_alias_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
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
		enterRule(_localctx, 122, RULE_by_type_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			match(Colon);
			setState(718);
			type_param(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 124, RULE_by_value_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(OP_Assign);
			setState(721);
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
	public static class Array_initializerContext extends ParserRuleContext {
		public TerminalNode Brace_Curly_Left() { return getToken(Nutt.Brace_Curly_Left, 0); }
		public TerminalNode Brace_Curly_Right() { return getToken(Nutt.Brace_Curly_Right, 0); }
		public List<Array_elementContext> array_element() {
			return getRuleContexts(Array_elementContext.class);
		}
		public Array_elementContext array_element(int i) {
			return getRuleContext(Array_elementContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(Nutt.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Nutt.Comma, i);
		}
		public Array_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_initializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitArray_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_initializerContext array_initializer() throws RecognitionException {
		Array_initializerContext _localctx = new Array_initializerContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_array_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(Brace_Curly_Left);
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4616515144371145354L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & -4618896821620039677L) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & 133065L) != 0)) {
				{
				setState(724);
				array_element();
				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(725);
					match(Comma);
					setState(726);
					array_element();
					}
					}
					setState(731);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(734);
			match(Brace_Curly_Right);
			}
		}
		catch (RecognitionException re) {
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
	public static class Array_elementContext extends ParserRuleContext {
		public Spread_pairContext spread_pair() {
			return getRuleContext(Spread_pairContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Array_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitArray_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_elementContext array_element() throws RecognitionException {
		Array_elementContext _localctx = new Array_elementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_array_element);
		try {
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(736);
				spread_pair();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(737);
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
	public static class Spread_pairContext extends ParserRuleContext {
		public TerminalNode OP_Pass() { return getToken(Nutt.OP_Pass, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Spread_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spread_pair; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitSpread_pair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Spread_pairContext spread_pair() throws RecognitionException {
		Spread_pairContext _localctx = new Spread_pairContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_spread_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(OP_Pass);
			setState(741);
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
		enterRule(_localctx, 132, RULE_explist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			exp(0);
			setState(748);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(744);
					match(Comma);
					setState(745);
					exp(0);
					}
					} 
				}
				setState(750);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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
	public static class Qualified_nameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(Nutt.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(Nutt.NAME, i);
		}
		public List<TerminalNode> Dot() { return getTokens(Nutt.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(Nutt.Dot, i);
		}
		public Qualified_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitQualified_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_nameContext qualified_name() throws RecognitionException {
		Qualified_nameContext _localctx = new Qualified_nameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_qualified_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(NAME);
			setState(754); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(752);
					match(Dot);
					setState(753);
					match(NAME);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(756); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
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
	public static class This_expContext extends ExpContext {
		public TerminalNode KW_This() { return getToken(Nutt.KW_This, 0); }
		public This_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitThis_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Explicit_arrayContext extends ExpContext {
		public Array_initializerContext array_initializer() {
			return getRuleContext(Array_initializerContext.class,0);
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
	public static class Qualified_variableContext extends ExpContext {
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
		}
		public Qualified_variableContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitQualified_variable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Array_accessContext extends ExpContext {
		public ExpContext arr;
		public ExpContext index;
		public TerminalNode Brace_Square_Left() { return getToken(Nutt.Brace_Square_Left, 0); }
		public TerminalNode Brace_Square_Right() { return getToken(Nutt.Brace_Square_Right, 0); }
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
	public static class Explicit_operatorContext extends ExpContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Explicit_operatorContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitExplicit_operator(this);
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
	public static class Compose_expContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode OP_Compose() { return getToken(Nutt.OP_Compose, 0); }
		public Compose_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitCompose_exp(this);
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
	public static class Exec_expContext extends ExpContext {
		public TerminalNode KW_Exec() { return getToken(Nutt.KW_Exec, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public Exec_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitExec_exp(this);
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
	public static class Explicit_typeContext extends ExpContext {
		public Type_paramContext type_param() {
			return getRuleContext(Type_paramContext.class,0);
		}
		public Explicit_typeContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitExplicit_type(this);
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
		public TerminalNode Brace_Paren_Left() { return getToken(Nutt.Brace_Paren_Left, 0); }
		public TerminalNode Brace_Paren_Right() { return getToken(Nutt.Brace_Paren_Right, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode KW_With() { return getToken(Nutt.KW_With, 0); }
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
		public TerminalNode Brace_Paren_Left() { return getToken(Nutt.Brace_Paren_Left, 0); }
		public TerminalNode Brace_Paren_Right() { return getToken(Nutt.Brace_Paren_Right, 0); }
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
		public TerminalNode Brace_Paren_Left() { return getToken(Nutt.Brace_Paren_Left, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Brace_Paren_Right() { return getToken(Nutt.Brace_Paren_Right, 0); }
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
		public Match_toContext match_to() {
			return getRuleContext(Match_toContext.class,0);
		}
		public Match_to_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitMatch_to_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class New_expContext extends ExpContext {
		public TerminalNode KW_New() { return getToken(Nutt.KW_New, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Brace_Paren_Left() { return getToken(Nutt.Brace_Paren_Left, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public TerminalNode Brace_Paren_Right() { return getToken(Nutt.Brace_Paren_Right, 0); }
		public New_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitNew_exp(this);
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
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				_localctx = new Explicit_variableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(759);
				match(NAME);
				}
				break;
			case 2:
				{
				_localctx = new This_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(760);
				match(KW_This);
				}
				break;
			case 3:
				{
				_localctx = new Qualified_variableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(761);
				qualified_name();
				}
				break;
			case 4:
				{
				_localctx = new Explicit_atomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(762);
				atom();
				}
				break;
			case 5:
				{
				_localctx = new Explicit_typeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(763);
				type_param(0);
				}
				break;
			case 6:
				{
				_localctx = new Explicit_operatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(764);
				operator();
				}
				break;
			case 7:
				{
				_localctx = new Block_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(765);
				do_done_block();
				}
				break;
			case 8:
				{
				_localctx = new Reverse_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(766);
				match(OP_Reverse);
				setState(767);
				exp(25);
				}
				break;
			case 9:
				{
				_localctx = new New_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(768);
				match(KW_New);
				setState(769);
				exp(0);
				setState(770);
				match(Brace_Paren_Left);
				setState(771);
				explist();
				setState(772);
				match(Brace_Paren_Right);
				}
				break;
			case 10:
				{
				_localctx = new Eval_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(774);
				match(KW_Eval);
				setState(777);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(775);
					exp(0);
					}
					break;
				case 2:
					{
					setState(776);
					block();
					}
					break;
				}
				}
				break;
			case 11:
				{
				_localctx = new Exec_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(779);
				match(KW_Exec);
				setState(782);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(780);
					exp(0);
					}
					break;
				case 2:
					{
					setState(781);
					stat();
					}
					break;
				}
				}
				break;
			case 12:
				{
				_localctx = new Record_initializer_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(784);
				record_initializer();
				}
				break;
			case 13:
				{
				_localctx = new Map_initializer_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(785);
				map_initializer();
				}
				break;
			case 14:
				{
				_localctx = new Range_array_initializer_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(786);
				range_array_initializer();
				}
				break;
			case 15:
				{
				_localctx = new Comprehense_array_initializer_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(787);
				comprehense_array_initializer();
				}
				break;
			case 16:
				{
				_localctx = new Explicit_arrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(788);
				array_initializer();
				}
				break;
			case 17:
				{
				_localctx = new Function_definition_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(789);
				local_funct();
				}
				break;
			case 18:
				{
				_localctx = new Prefix_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(790);
				operator_prefix();
				setState(791);
				exp(13);
				}
				break;
			case 19:
				{
				_localctx = new Op_call_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(793);
				((Op_call_expContext)_localctx).op = operator_infix();
				setState(794);
				match(Brace_Paren_Left);
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4616515144371145354L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & -4618896821620039677L) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & 133065L) != 0)) {
					{
					setState(795);
					((Op_call_expContext)_localctx).arguments = explist();
					}
				}

				setState(798);
				match(Brace_Paren_Right);
				}
				break;
			case 20:
				{
				_localctx = new Parenthesis_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(800);
				match(Brace_Paren_Left);
				setState(801);
				exp(0);
				setState(802);
				match(Brace_Paren_Right);
				}
				break;
			case 21:
				{
				_localctx = new Type_of_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(804);
				match(KW_TypeOf);
				setState(805);
				exp(5);
				}
				break;
			case 22:
				{
				_localctx = new Common_of_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(806);
				match(KW_CommonOf);
				setState(807);
				explist();
				}
				break;
			case 23:
				{
				_localctx = new Match_to_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(808);
				match_to();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(862);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(860);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
					case 1:
						{
						_localctx = new Compose_expContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(811);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(812);
						match(OP_Compose);
						setState(813);
						exp(25);
						}
						break;
					case 2:
						{
						_localctx = new Infix_expContext(new ExpContext(_parentctx, _parentState));
						((Infix_expContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(814);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(815);
						operator_infix();
						setState(816);
						((Infix_expContext)_localctx).right = exp(13);
						}
						break;
					case 3:
						{
						_localctx = new Using_expContext(new ExpContext(_parentctx, _parentState));
						((Using_expContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(818);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(819);
						match(BackTick);
						setState(820);
						((Using_expContext)_localctx).used = match(NAME);
						setState(821);
						match(BackTick);
						setState(822);
						((Using_expContext)_localctx).right = exp(10);
						}
						break;
					case 4:
						{
						_localctx = new Contains_expContext(new ExpContext(_parentctx, _parentState));
						((Contains_expContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(823);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(826);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case KW_In:
							{
							setState(824);
							((Contains_expContext)_localctx).in = match(KW_In);
							}
							break;
						case KW_Not_In:
							{
							setState(825);
							((Contains_expContext)_localctx).not_in = match(KW_Not_In);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(828);
						((Contains_expContext)_localctx).right = exp(9);
						}
						break;
					case 5:
						{
						_localctx = new Record_member_accessContext(new ExpContext(_parentctx, _parentState));
						((Record_member_accessContext)_localctx).record = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(829);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(830);
						match(Dot);
						setState(831);
						((Record_member_accessContext)_localctx).index = string();
						}
						break;
					case 6:
						{
						_localctx = new Func_call_expContext(new ExpContext(_parentctx, _parentState));
						((Func_call_expContext)_localctx).name = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(832);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(835);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==KW_With) {
							{
							setState(833);
							match(KW_With);
							setState(834);
							using_in_call();
							}
						}

						setState(837);
						match(Brace_Paren_Left);
						setState(839);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4616515144371145354L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & -4618896821620039677L) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & 133065L) != 0)) {
							{
							setState(838);
							((Func_call_expContext)_localctx).arguments = explist();
							}
						}

						setState(841);
						match(Brace_Paren_Right);
						}
						break;
					case 7:
						{
						_localctx = new Array_accessContext(new ExpContext(_parentctx, _parentState));
						((Array_accessContext)_localctx).arr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(842);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(843);
						match(Brace_Square_Left);
						setState(844);
						((Array_accessContext)_localctx).index = exp(0);
						setState(845);
						match(Brace_Square_Right);
						}
						break;
					case 8:
						{
						_localctx = new Instance_of_expContext(new ExpContext(_parentctx, _parentState));
						((Instance_of_expContext)_localctx).to_check = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(847);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(848);
						match(KW_InstanceOf);
						setState(851);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
						case 1:
							{
							setState(849);
							match(NAME);
							}
							break;
						case 2:
							{
							setState(850);
							((Instance_of_expContext)_localctx).type_exp = exp(0);
							}
							break;
						}
						}
						break;
					case 9:
						{
						_localctx = new Quarternary_expContext(new ExpContext(_parentctx, _parentState));
						((Quarternary_expContext)_localctx).cond = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(853);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(854);
						match(Question);
						setState(855);
						((Quarternary_expContext)_localctx).if_true = exp(0);
						setState(858);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
						case 1:
							{
							setState(856);
							match(Colon);
							setState(857);
							((Quarternary_expContext)_localctx).if_false = exp(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(864);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
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
	public static class Match_toContext extends ParserRuleContext {
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
		public Match_toContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_to; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitMatch_to(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Match_toContext match_to() throws RecognitionException {
		Match_toContext _localctx = new Match_toContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_match_to);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			match(KW_Match);
			setState(866);
			((Match_toContext)_localctx).matched = exp(0);
			setState(867);
			match(KW_To);
			setState(869); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(868);
					match_branch();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(871); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(873);
				default_match_branch();
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
	public static class Range_array_initializerContext extends ParserRuleContext {
		public ExpContext start;
		public ExpContext next;
		public ExpContext bound;
		public TerminalNode Brace_Curly_Left() { return getToken(Nutt.Brace_Curly_Left, 0); }
		public TerminalNode OP_Range() { return getToken(Nutt.OP_Range, 0); }
		public TerminalNode Brace_Curly_Right() { return getToken(Nutt.Brace_Curly_Right, 0); }
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
		enterRule(_localctx, 140, RULE_range_array_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			match(Brace_Curly_Left);
			setState(877);
			((Range_array_initializerContext)_localctx).start = exp(0);
			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(878);
				match(Comma);
				setState(879);
				((Range_array_initializerContext)_localctx).next = exp(0);
				}
			}

			setState(882);
			match(OP_Range);
			setState(883);
			((Range_array_initializerContext)_localctx).bound = exp(0);
			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(884);
				match(SemiColon);
				setState(885);
				match(OP_Reverse);
				}
			}

			setState(888);
			match(Brace_Curly_Right);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode Brace_Curly_Left() { return getToken(Nutt.Brace_Curly_Left, 0); }
		public TerminalNode NAME() { return getToken(Nutt.NAME, 0); }
		public Op_directionContext op_direction() {
			return getRuleContext(Op_directionContext.class,0);
		}
		public TerminalNode Brace_Curly_Right() { return getToken(Nutt.Brace_Curly_Right, 0); }
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
		enterRule(_localctx, 142, RULE_comprehense_array_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			match(Brace_Curly_Left);
			setState(894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(891);
				((Comprehense_array_initializerContext)_localctx).element = exp(0);
				setState(892);
				match(KW_Of);
				}
				break;
			}
			setState(896);
			match(NAME);
			setState(897);
			op_direction();
			setState(898);
			((Comprehense_array_initializerContext)_localctx).arr = exp(0);
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_If) {
				{
				setState(899);
				match(KW_If);
				setState(900);
				((Comprehense_array_initializerContext)_localctx).pred = exp(0);
				}
			}

			setState(903);
			match(Brace_Curly_Right);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 144, RULE_map_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
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
			setState(906);
			match(SemiColon);
			setState(907);
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
		public TerminalNode Brace_Curly_Left() { return getToken(Nutt.Brace_Curly_Left, 0); }
		public List<Map_elementContext> map_element() {
			return getRuleContexts(Map_elementContext.class);
		}
		public Map_elementContext map_element(int i) {
			return getRuleContext(Map_elementContext.class,i);
		}
		public TerminalNode Brace_Curly_Right() { return getToken(Nutt.Brace_Curly_Right, 0); }
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
		enterRule(_localctx, 146, RULE_map_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			match(Brace_Curly_Left);
			setState(910);
			map_element();
			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(911);
				match(Comma);
				setState(912);
				map_element();
				}
				}
				setState(917);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(918);
			match(Brace_Curly_Right);
			}
		}
		catch (RecognitionException re) {
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
		public Token name_key;
		public StringContext string_key;
		public ExpContext val;
		public TerminalNode Colon() { return getToken(Nutt.Colon, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode NAME() { return getToken(Nutt.NAME, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
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
		enterRule(_localctx, 148, RULE_record_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(920);
				((Record_elementContext)_localctx).name_key = match(NAME);
				}
				break;
			case Char_String:
			case Normal_string:
				{
				setState(921);
				((Record_elementContext)_localctx).string_key = string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(924);
			match(Colon);
			setState(925);
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
		enterRule(_localctx, 150, RULE_record_element_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			record_element();
			setState(932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(928);
				match(Comma);
				setState(929);
				record_element();
				}
				}
				setState(934);
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
		public TerminalNode Brace_Curly_Left() { return getToken(Nutt.Brace_Curly_Left, 0); }
		public Record_element_listContext record_element_list() {
			return getRuleContext(Record_element_listContext.class,0);
		}
		public TerminalNode Brace_Curly_Right() { return getToken(Nutt.Brace_Curly_Right, 0); }
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
		enterRule(_localctx, 152, RULE_record_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			match(Brace_Curly_Left);
			setState(936);
			record_element_list();
			setState(937);
			match(Brace_Curly_Right);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 154, RULE_operator_logical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			_la = _input.LA(1);
			if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & 2148532225L) != 0)) ) {
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
		enterRule(_localctx, 156, RULE_default_match_branch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			match(KW_Default);
			setState(942);
			match(OP_Case_Arrow);
			setState(943);
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
		enterRule(_localctx, 158, RULE_match_branch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_Final) {
				{
				setState(945);
				match(KW_Final);
				}
			}

			setState(948);
			explist();
			setState(949);
			match(OP_Case_Arrow);
			setState(950);
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
		enterRule(_localctx, 160, RULE_atom);
		try {
			setState(956);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_Nil:
				enterOuterAlt(_localctx, 1);
				{
				setState(952);
				nil();
				}
				break;
			case KW_False:
			case KW_True:
				enterOuterAlt(_localctx, 2);
				{
				setState(953);
				boolean_();
				}
				break;
			case Float:
			case HexFloat:
			case HexInt:
			case Int:
				enterOuterAlt(_localctx, 3);
				{
				setState(954);
				number();
				}
				break;
			case Char_String:
			case Normal_string:
				enterOuterAlt(_localctx, 4);
				{
				setState(955);
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
		enterRule(_localctx, 162, RULE_nil);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
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
		enterRule(_localctx, 164, RULE_boolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
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
		public IntContext int_() {
			return getRuleContext(IntContext.class,0);
		}
		public FloatContext float_() {
			return getRuleContext(FloatContext.class,0);
		}
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
		enterRule(_localctx, 166, RULE_number);
		try {
			setState(964);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HexInt:
			case Int:
				enterOuterAlt(_localctx, 1);
				{
				setState(962);
				int_();
				}
				break;
			case Float:
			case HexFloat:
				enterOuterAlt(_localctx, 2);
				{
				setState(963);
				float_();
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
	public static class IntContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(Nutt.Int, 0); }
		public TerminalNode HexInt() { return getToken(Nutt.HexInt, 0); }
		public IntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntContext int_() throws RecognitionException {
		IntContext _localctx = new IntContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_int);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
			_la = _input.LA(1);
			if ( !(_la==HexInt || _la==Int) ) {
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
	public static class FloatContext extends ParserRuleContext {
		public TerminalNode Float() { return getToken(Nutt.Float, 0); }
		public TerminalNode HexFloat() { return getToken(Nutt.HexFloat, 0); }
		public FloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatContext float_() throws RecognitionException {
		FloatContext _localctx = new FloatContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_float);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			_la = _input.LA(1);
			if ( !(_la==Float || _la==HexFloat) ) {
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
		enterRule(_localctx, 172, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
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
	public static class OperatorContext extends ParserRuleContext {
		public List<TerminalNode> BackTick() { return getTokens(Nutt.BackTick); }
		public TerminalNode BackTick(int i) {
			return getToken(Nutt.BackTick, i);
		}
		public Operator_infixContext operator_infix() {
			return getRuleContext(Operator_infixContext.class,0);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			match(BackTick);
			setState(973);
			operator_infix();
			setState(974);
			match(BackTick);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode Brace_Curly_Left() { return getToken(Nutt.Brace_Curly_Left, 0); }
		public List<Overloading_operatorContext> overloading_operator() {
			return getRuleContexts(Overloading_operatorContext.class);
		}
		public Overloading_operatorContext overloading_operator(int i) {
			return getRuleContext(Overloading_operatorContext.class,i);
		}
		public TerminalNode Brace_Curly_Right() { return getToken(Nutt.Brace_Curly_Right, 0); }
		public List<TerminalNode> Comma() { return getTokens(Nutt.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Nutt.Comma, i);
		}
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
		enterRule(_localctx, 176, RULE_using_in_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			match(Brace_Curly_Left);
			setState(977);
			overloading_operator();
			setState(982);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(978);
				match(Comma);
				setState(979);
				overloading_operator();
				}
				}
				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(985);
			match(Brace_Curly_Right);
			}
		}
		catch (RecognitionException re) {
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
		public List<Vararg_or_signatureContext> vararg_or_signature() {
			return getRuleContexts(Vararg_or_signatureContext.class);
		}
		public Vararg_or_signatureContext vararg_or_signature(int i) {
			return getRuleContext(Vararg_or_signatureContext.class,i);
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
		enterRule(_localctx, 178, RULE_var_signature_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			vararg_or_signature();
			setState(992);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(988);
					match(Comma);
					setState(989);
					vararg_or_signature();
					}
					} 
				}
				setState(994);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
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
	public static class Vararg_or_signatureContext extends ParserRuleContext {
		public Var_signatureContext var_signature() {
			return getRuleContext(Var_signatureContext.class,0);
		}
		public TerminalNode OP_Pass() { return getToken(Nutt.OP_Pass, 0); }
		public Vararg_or_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vararg_or_signature; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttVisitor ) return ((NuttVisitor<? extends T>)visitor).visitVararg_or_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vararg_or_signatureContext vararg_or_signature() throws RecognitionException {
		Vararg_or_signatureContext _localctx = new Vararg_or_signatureContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_vararg_or_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Pass) {
				{
				setState(995);
				match(OP_Pass);
				}
			}

			setState(998);
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
	public static class Func_outputContext extends ParserRuleContext {
		public ExpContext default_output;
		public By_type_var_declContext by_type_var_decl() {
			return getRuleContext(By_type_var_declContext.class,0);
		}
		public TerminalNode Colon() { return getToken(Nutt.Colon, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode Brace_Square_Left() { return getToken(Nutt.Brace_Square_Left, 0); }
		public TerminalNode Brace_Square_Right() { return getToken(Nutt.Brace_Square_Right, 0); }
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
		enterRule(_localctx, 182, RULE_func_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(1000);
				by_type_var_decl();
				}
				break;
			case 2:
				{
				setState(1001);
				match(Colon);
				setState(1002);
				exp(0);
				}
				break;
			}
			setState(1009);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Brace_Square_Left) {
				{
				setState(1005);
				match(Brace_Square_Left);
				setState(1006);
				((Func_outputContext)_localctx).default_output = exp(0);
				setState(1007);
				match(Brace_Square_Right);
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
		enterRule(_localctx, 184, RULE_local_funct);
		try {
			setState(1014);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AtSign:
			case Brace_Curly_Left:
			case Brace_Paren_Left:
			case KW_Pure:
			case KW_Static:
			case NAME:
			case OP_Pass:
				enterOuterAlt(_localctx, 1);
				{
				setState(1011);
				lambda_decl();
				}
				break;
			case KW_Funct:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1012);
				match(KW_Funct);
				setState(1013);
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
		public Funct_signatureContext funct_signature() {
			return getRuleContext(Funct_signatureContext.class,0);
		}
		public TerminalNode OP_Assign() { return getToken(Nutt.OP_Assign, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode KW_End() { return getToken(Nutt.KW_End, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
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
		enterRule(_localctx, 186, RULE_funcbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AtSign) {
				{
				{
				setState(1016);
				annotation();
				}
				}
				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1022);
			funct_signature();
			setState(1023);
			match(OP_Assign);
			setState(1024);
			block();
			setState(1025);
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
	public static class Lambda_declContext extends ParserRuleContext {
		public ExpContext lambda_exp;
		public Funct_signatureContext funct_signature() {
			return getRuleContext(Funct_signatureContext.class,0);
		}
		public TerminalNode OP_LambdaReturn() { return getToken(Nutt.OP_LambdaReturn, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
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
		enterRule(_localctx, 188, RULE_lambda_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1030);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AtSign) {
				{
				{
				setState(1027);
				annotation();
				}
				}
				setState(1032);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1033);
			funct_signature();
			setState(1034);
			match(OP_LambdaReturn);
			setState(1035);
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
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
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
		enterRule(_localctx, 190, RULE_operator_infix);
		try {
			setState(1040);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BackTick:
				enterOuterAlt(_localctx, 1);
				{
				setState(1037);
				operator();
				}
				break;
			case OP_Add:
			case OP_And:
			case OP_Append:
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
				enterOuterAlt(_localctx, 2);
				{
				setState(1038);
				default_infix_operator();
				}
				break;
			case Op_Custom:
				enterOuterAlt(_localctx, 3);
				{
				setState(1039);
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
		enterRule(_localctx, 192, RULE_default_infix_operator);
		try {
			setState(1047);
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
				setState(1042);
				operator_math();
				}
				break;
			case OP_And:
			case OP_Or:
			case OP_Xor:
				enterOuterAlt(_localctx, 2);
				{
				setState(1043);
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
				enterOuterAlt(_localctx, 3);
				{
				setState(1044);
				operator_comparison();
				}
				break;
			case OP_Append:
				enterOuterAlt(_localctx, 4);
				{
				setState(1045);
				match(OP_Append);
				}
				break;
			case OP_Reverse:
				enterOuterAlt(_localctx, 5);
				{
				setState(1046);
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
		enterRule(_localctx, 194, RULE_operator_composed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
			composed_assign_op();
			setState(1050);
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
		enterRule(_localctx, 196, RULE_operator_math);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			_la = _input.LA(1);
			if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & 546050177L) != 0)) ) {
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
		enterRule(_localctx, 198, RULE_operator_postfix);
		try {
			setState(1058);
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
				setState(1054);
				operator_math();
				setState(1055);
				operator_math();
				}
				break;
			case Op_Custom:
				enterOuterAlt(_localctx, 2);
				{
				setState(1057);
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
		enterRule(_localctx, 200, RULE_composed_assign_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			operator_infix();
			setState(1061);
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
		enterRule(_localctx, 202, RULE_operator_prefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1063);
			_la = _input.LA(1);
			if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & 69257428993L) != 0)) ) {
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
		enterRule(_localctx, 204, RULE_operator_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			_la = _input.LA(1);
			if ( !(((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & 235143945L) != 0)) ) {
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
		case 16:
			return type_param_sempred((Type_paramContext)_localctx, predIndex);
		case 68:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_param_sempred(Type_paramContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 24);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 20);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0094\u042c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0001\u0000\u0003\u0000\u00d0"+
		"\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001\u00d6"+
		"\b\u0001\n\u0001\f\u0001\u00d9\t\u0001\u0001\u0001\u0005\u0001\u00dc\b"+
		"\u0001\n\u0001\f\u0001\u00df\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003\u00ea\b\u0003\n\u0003\f\u0003\u00ed\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u00f1\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00f9\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00fe\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u0109\b"+
		"\t\n\t\f\t\u010c\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u0115\b\n\u0001\n\u0001\n\u0003\n\u0119\b\n\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u011d\b\u000b\u0001\f\u0005\f\u0120\b\f\n\f\f\f\u0123"+
		"\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0141\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u0145\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u015a\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u0164\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0004\u0010\u0169\b\u0010\u000b\u0010\f\u0010\u016a\u0005"+
		"\u0010\u016d\b\u0010\n\u0010\f\u0010\u0170\t\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u0176\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u0182\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u0188\b\u0013\n\u0013\f\u0013\u018b"+
		"\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u0193\b\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0197"+
		"\b\u0014\n\u0014\f\u0014\u019a\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0005\u0015\u019f\b\u0015\n\u0015\f\u0015\u01a2\t\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01a8\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u01ae\b\u0015\n\u0015\f\u0015"+
		"\u01b1\t\u0015\u0003\u0015\u01b3\b\u0015\u0001\u0015\u0001\u0015\u0005"+
		"\u0015\u01b7\b\u0015\n\u0015\f\u0015\u01ba\t\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u01c2\b\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u01c6\b\u0017\u0003\u0017\u01c8\b"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0003\u0019\u01ce"+
		"\b\u0019\u0001\u0019\u0003\u0019\u01d1\b\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u01d6\b\u0019\u0001\u0019\u0003\u0019\u01d9\b"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u01e1\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u01e6\b\u001a\u0001\u001b\u0005\u001b\u01e9\b\u001b\n\u001b\f\u001b"+
		"\u01ec\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u01f2\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b"+
		"\u01f8\b\u001b\n\u001b\f\u001b\u01fb\t\u001b\u0003\u001b\u01fd\b\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0208\b\u001c\u0001\u001d"+
		"\u0005\u001d\u020b\b\u001d\n\u001d\f\u001d\u020e\t\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0214\b\u001e\n\u001e\f\u001e"+
		"\u0217\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u021e\b\u001f\n\u001f\f\u001f\u0221\t\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0003 \u0229\b \u0001!\u0003!"+
		"\u022c\b!\u0001!\u0003!\u022f\b!\u0001!\u0001!\u0001!\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0003\"\u0238\b\"\u0001\"\u0005\"\u023b\b\"\n\"\f\"\u023e"+
		"\t\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0003\'\u0256\b\'\u0001\'\u0001\'\u0001(\u0003"+
		"(\u025b\b(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0003"+
		"*\u0265\b*\u0001+\u0001+\u0001+\u0005+\u026a\b+\n+\f+\u026d\t+\u0001,"+
		"\u0001,\u0001,\u0003,\u0272\b,\u0001-\u0001-\u0001-\u0001-\u0003-\u0278"+
		"\b-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u0001/\u0001"+
		"/\u00010\u00010\u00010\u00010\u00010\u00011\u00011\u00031\u028b\b1\u0001"+
		"2\u00012\u00012\u00013\u00013\u00013\u00013\u00013\u00033\u0295\b3\u0001"+
		"4\u00014\u00014\u00014\u00034\u029b\b4\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00035\u02a3\b5\u00016\u00016\u00036\u02a7\b6\u00016\u00036\u02aa"+
		"\b6\u00017\u00037\u02ad\b7\u00017\u00017\u00017\u00017\u00037\u02b3\b"+
		"7\u00018\u00018\u00018\u00018\u00018\u00018\u00038\u02bb\b8\u00019\u0001"+
		"9\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0005;\u02c7"+
		"\b;\n;\f;\u02ca\t;\u0001<\u0001<\u0001=\u0001=\u0001=\u0001>\u0001>\u0001"+
		">\u0001?\u0001?\u0001?\u0001?\u0005?\u02d8\b?\n?\f?\u02db\t?\u0003?\u02dd"+
		"\b?\u0001?\u0001?\u0001@\u0001@\u0003@\u02e3\b@\u0001A\u0001A\u0001A\u0001"+
		"B\u0001B\u0001B\u0005B\u02eb\bB\nB\fB\u02ee\tB\u0001C\u0001C\u0001C\u0004"+
		"C\u02f3\bC\u000bC\fC\u02f4\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0003D\u030a\bD\u0001D\u0001D\u0001D\u0003D\u030f\bD\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0003D\u031d\bD\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0003D\u032a\bD\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0003D\u033b\bD\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0003D\u0344\bD\u0001D\u0001D\u0003D\u0348\bD\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u0354\bD\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0003D\u035b\bD\u0005D\u035d\bD\nD\fD\u0360\tD"+
		"\u0001E\u0001E\u0001E\u0001E\u0004E\u0366\bE\u000bE\fE\u0367\u0001E\u0003"+
		"E\u036b\bE\u0001F\u0001F\u0001F\u0001F\u0003F\u0371\bF\u0001F\u0001F\u0001"+
		"F\u0001F\u0003F\u0377\bF\u0001F\u0001F\u0001G\u0001G\u0001G\u0001G\u0003"+
		"G\u037f\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u0386\bG\u0001G\u0001"+
		"G\u0001H\u0001H\u0001H\u0001H\u0001I\u0001I\u0001I\u0001I\u0005I\u0392"+
		"\bI\nI\fI\u0395\tI\u0001I\u0001I\u0001J\u0001J\u0003J\u039b\bJ\u0001J"+
		"\u0001J\u0001J\u0001K\u0001K\u0001K\u0005K\u03a3\bK\nK\fK\u03a6\tK\u0001"+
		"L\u0001L\u0001L\u0001L\u0001M\u0001M\u0001N\u0001N\u0001N\u0001N\u0001"+
		"O\u0003O\u03b3\bO\u0001O\u0001O\u0001O\u0001O\u0001P\u0001P\u0001P\u0001"+
		"P\u0003P\u03bd\bP\u0001Q\u0001Q\u0001R\u0001R\u0001S\u0001S\u0003S\u03c5"+
		"\bS\u0001T\u0001T\u0001U\u0001U\u0001V\u0001V\u0001W\u0001W\u0001W\u0001"+
		"W\u0001X\u0001X\u0001X\u0001X\u0005X\u03d5\bX\nX\fX\u03d8\tX\u0001X\u0001"+
		"X\u0001Y\u0001Y\u0001Y\u0005Y\u03df\bY\nY\fY\u03e2\tY\u0001Z\u0003Z\u03e5"+
		"\bZ\u0001Z\u0001Z\u0001[\u0001[\u0001[\u0003[\u03ec\b[\u0001[\u0001[\u0001"+
		"[\u0001[\u0003[\u03f2\b[\u0001\\\u0001\\\u0001\\\u0003\\\u03f7\b\\\u0001"+
		"]\u0005]\u03fa\b]\n]\f]\u03fd\t]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001"+
		"^\u0005^\u0405\b^\n^\f^\u0408\t^\u0001^\u0001^\u0001^\u0001^\u0001_\u0001"+
		"_\u0001_\u0003_\u0411\b_\u0001`\u0001`\u0001`\u0001`\u0001`\u0003`\u0418"+
		"\b`\u0001a\u0001a\u0001a\u0001b\u0001b\u0001c\u0001c\u0001c\u0001c\u0003"+
		"c\u0423\bc\u0001d\u0001d\u0001d\u0001e\u0001e\u0001f\u0001f\u0001f\u0000"+
		"\u0002 \u0088g\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt"+
		"vxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u0000\u000f\u0002\u0000OOUU\u0001\u0000LN\u0002"+
		"\u000099JK\u0002\u0000ff\u0087\u0087\u0002\u0000llrr\u0002\u0000AA`a\u0002"+
		"\u0000\u000b\u000bff\u0003\u0000ii}}\u0088\u0088\u0002\u000000ZZ\u0001"+
		"\u0000\u0015\u0016\u0002\u0000\u0012\u0012\u0014\u0014\u0002\u0000\u000b"+
		"\u000b\u0093\u0093\u0006\u0000hhoottz{\u007f\u007f\u0085\u0085\u0005\u0000"+
		"hhww||\u0085\u0085\u008c\u008c\u0005\u0000ppssxy\u0082\u0082\u0089\u008b"+
		"\u0472\u0000\u00cf\u0001\u0000\u0000\u0000\u0002\u00d3\u0001\u0000\u0000"+
		"\u0000\u0004\u00e3\u0001\u0000\u0000\u0000\u0006\u00e6\u0001\u0000\u0000"+
		"\u0000\b\u00f2\u0001\u0000\u0000\u0000\n\u00f5\u0001\u0000\u0000\u0000"+
		"\f\u00fa\u0001\u0000\u0000\u0000\u000e\u00ff\u0001\u0000\u0000\u0000\u0010"+
		"\u0102\u0001\u0000\u0000\u0000\u0012\u0105\u0001\u0000\u0000\u0000\u0014"+
		"\u010d\u0001\u0000\u0000\u0000\u0016\u011c\u0001\u0000\u0000\u0000\u0018"+
		"\u0121\u0001\u0000\u0000\u0000\u001a\u0124\u0001\u0000\u0000\u0000\u001c"+
		"\u0128\u0001\u0000\u0000\u0000\u001e\u0159\u0001\u0000\u0000\u0000 \u0163"+
		"\u0001\u0000\u0000\u0000\"\u0171\u0001\u0000\u0000\u0000$\u0177\u0001"+
		"\u0000\u0000\u0000&\u0183\u0001\u0000\u0000\u0000(\u018e\u0001\u0000\u0000"+
		"\u0000*\u01a0\u0001\u0000\u0000\u0000,\u01bd\u0001\u0000\u0000\u0000."+
		"\u01c7\u0001\u0000\u0000\u00000\u01c9\u0001\u0000\u0000\u00002\u01cd\u0001"+
		"\u0000\u0000\u00004\u01dc\u0001\u0000\u0000\u00006\u01ea\u0001\u0000\u0000"+
		"\u00008\u0207\u0001\u0000\u0000\u0000:\u020c\u0001\u0000\u0000\u0000<"+
		"\u020f\u0001\u0000\u0000\u0000>\u021a\u0001\u0000\u0000\u0000@\u0228\u0001"+
		"\u0000\u0000\u0000B\u022b\u0001\u0000\u0000\u0000D\u0233\u0001\u0000\u0000"+
		"\u0000F\u0243\u0001\u0000\u0000\u0000H\u0247\u0001\u0000\u0000\u0000J"+
		"\u024b\u0001\u0000\u0000\u0000L\u024e\u0001\u0000\u0000\u0000N\u0251\u0001"+
		"\u0000\u0000\u0000P\u025a\u0001\u0000\u0000\u0000R\u025e\u0001\u0000\u0000"+
		"\u0000T\u0261\u0001\u0000\u0000\u0000V\u0266\u0001\u0000\u0000\u0000X"+
		"\u0271\u0001\u0000\u0000\u0000Z\u0273\u0001\u0000\u0000\u0000\\\u027d"+
		"\u0001\u0000\u0000\u0000^\u027f\u0001\u0000\u0000\u0000`\u0283\u0001\u0000"+
		"\u0000\u0000b\u0288\u0001\u0000\u0000\u0000d\u028c\u0001\u0000\u0000\u0000"+
		"f\u028f\u0001\u0000\u0000\u0000h\u0296\u0001\u0000\u0000\u0000j\u029c"+
		"\u0001\u0000\u0000\u0000l\u02a4\u0001\u0000\u0000\u0000n\u02b2\u0001\u0000"+
		"\u0000\u0000p\u02ba\u0001\u0000\u0000\u0000r\u02bc\u0001\u0000\u0000\u0000"+
		"t\u02be\u0001\u0000\u0000\u0000v\u02c0\u0001\u0000\u0000\u0000x\u02cb"+
		"\u0001\u0000\u0000\u0000z\u02cd\u0001\u0000\u0000\u0000|\u02d0\u0001\u0000"+
		"\u0000\u0000~\u02d3\u0001\u0000\u0000\u0000\u0080\u02e2\u0001\u0000\u0000"+
		"\u0000\u0082\u02e4\u0001\u0000\u0000\u0000\u0084\u02e7\u0001\u0000\u0000"+
		"\u0000\u0086\u02ef\u0001\u0000\u0000\u0000\u0088\u0329\u0001\u0000\u0000"+
		"\u0000\u008a\u0361\u0001\u0000\u0000\u0000\u008c\u036c\u0001\u0000\u0000"+
		"\u0000\u008e\u037a\u0001\u0000\u0000\u0000\u0090\u0389\u0001\u0000\u0000"+
		"\u0000\u0092\u038d\u0001\u0000\u0000\u0000\u0094\u039a\u0001\u0000\u0000"+
		"\u0000\u0096\u039f\u0001\u0000\u0000\u0000\u0098\u03a7\u0001\u0000\u0000"+
		"\u0000\u009a\u03ab\u0001\u0000\u0000\u0000\u009c\u03ad\u0001\u0000\u0000"+
		"\u0000\u009e\u03b2\u0001\u0000\u0000\u0000\u00a0\u03bc\u0001\u0000\u0000"+
		"\u0000\u00a2\u03be\u0001\u0000\u0000\u0000\u00a4\u03c0\u0001\u0000\u0000"+
		"\u0000\u00a6\u03c4\u0001\u0000\u0000\u0000\u00a8\u03c6\u0001\u0000\u0000"+
		"\u0000\u00aa\u03c8\u0001\u0000\u0000\u0000\u00ac\u03ca\u0001\u0000\u0000"+
		"\u0000\u00ae\u03cc\u0001\u0000\u0000\u0000\u00b0\u03d0\u0001\u0000\u0000"+
		"\u0000\u00b2\u03db\u0001\u0000\u0000\u0000\u00b4\u03e4\u0001\u0000\u0000"+
		"\u0000\u00b6\u03eb\u0001\u0000\u0000\u0000\u00b8\u03f6\u0001\u0000\u0000"+
		"\u0000\u00ba\u03fb\u0001\u0000\u0000\u0000\u00bc\u0406\u0001\u0000\u0000"+
		"\u0000\u00be\u0410\u0001\u0000\u0000\u0000\u00c0\u0417\u0001\u0000\u0000"+
		"\u0000\u00c2\u0419\u0001\u0000\u0000\u0000\u00c4\u041c\u0001\u0000\u0000"+
		"\u0000\u00c6\u0422\u0001\u0000\u0000\u0000\u00c8\u0424\u0001\u0000\u0000"+
		"\u0000\u00ca\u0427\u0001\u0000\u0000\u0000\u00cc\u0429\u0001\u0000\u0000"+
		"\u0000\u00ce\u00d0\u0003\u0002\u0001\u0000\u00cf\u00ce\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0005\u0000\u0000\u0001\u00d2\u0001\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d7\u0003\u0004\u0002\u0000\u00d4\u00d6\u0003\b\u0004\u0000"+
		"\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d8\u00dd\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000"+
		"\u00da\u00dc\u0003\u000e\u0007\u0000\u00db\u00da\u0001\u0000\u0000\u0000"+
		"\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000"+
		"\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e0\u0001\u0000\u0000\u0000"+
		"\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e1\u0003\u0018\f\u0000\u00e1"+
		"\u00e2\u0005)\u0000\u0000\u00e2\u0003\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0005@\u0000\u0000\u00e4\u00e5\u0003\u0006\u0003\u0000\u00e5\u0005\u0001"+
		"\u0000\u0000\u0000\u00e6\u00eb\u0005f\u0000\u0000\u00e7\u00e8\u0005\u000f"+
		"\u0000\u0000\u00e8\u00ea\u0005f\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000"+
		"\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00f0\u0001\u0000\u0000"+
		"\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\u001a\u0000"+
		"\u0000\u00ef\u00f1\u0005f\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u0007\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0005R\u0000\u0000\u00f3\u00f4\u0003\f\u0006\u0000\u00f4"+
		"\t\u0001\u0000\u0000\u0000\u00f5\u00f8\u0003\u0006\u0003\u0000\u00f6\u00f7"+
		"\u0005\u001a\u0000\u0000\u00f7\u00f9\u0005f\u0000\u0000\u00f8\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u000b\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fd\u0003\n\u0005\u0000\u00fb\u00fc\u0005\r"+
		"\u0000\u0000\u00fc\u00fe\u0003\n\u0005\u0000\u00fd\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\r\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u00057\u0000\u0000\u0100\u0101\u0003\u0012\t\u0000\u0101"+
		"\u000f\u0001\u0000\u0000\u0000\u0102\u0103\u0005#\u0000\u0000\u0103\u0104"+
		"\u0003\u0012\t\u0000\u0104\u0011\u0001\u0000\u0000\u0000\u0105\u010a\u0003"+
		"\u0016\u000b\u0000\u0106\u0107\u0005\r\u0000\u0000\u0107\u0109\u0003\u0016"+
		"\u000b\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u010c\u0001\u0000"+
		"\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000"+
		"\u0000\u0000\u010b\u0013\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000"+
		"\u0000\u0000\u010d\u0114\u0003\u0006\u0003\u0000\u010e\u010f\u0005\u0007"+
		"\u0000\u0000\u010f\u0110\u0003\u0012\t\u0000\u0110\u0111\u0005\b\u0000"+
		"\u0000\u0111\u0115\u0001\u0000\u0000\u0000\u0112\u0113\u0005\u000f\u0000"+
		"\u0000\u0113\u0115\u0005\u0018\u0000\u0000\u0114\u010e\u0001\u0000\u0000"+
		"\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0005\u001a\u0000\u0000\u0117\u0119\u0005f\u0000\u0000"+
		"\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000"+
		"\u0119\u0015\u0001\u0000\u0000\u0000\u011a\u011d\u0003\u0006\u0003\u0000"+
		"\u011b\u011d\u0003\u0014\n\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c"+
		"\u011b\u0001\u0000\u0000\u0000\u011d\u0017\u0001\u0000\u0000\u0000\u011e"+
		"\u0120\u0003\u001e\u000f\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120"+
		"\u0123\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121"+
		"\u0122\u0001\u0000\u0000\u0000\u0122\u0019\u0001\u0000\u0000\u0000\u0123"+
		"\u0121\u0001\u0000\u0000\u0000\u0124\u0125\u00054\u0000\u0000\u0125\u0126"+
		"\u0003V+\u0000\u0126\u0127\u0003\u00ba]\u0000\u0127\u001b\u0001\u0000"+
		"\u0000\u0000\u0128\u0129\u0007\u0000\u0000\u0000\u0129\u001d\u0001\u0000"+
		"\u0000\u0000\u012a\u015a\u0003h4\u0000\u012b\u012c\u0005%\u0000\u0000"+
		"\u012c\u012d\u0003\u0088D\u0000\u012d\u012e\u0003\u001e\u000f\u0000\u012e"+
		"\u015a\u0001\u0000\u0000\u0000\u012f\u0130\u0005&\u0000\u0000\u0130\u0131"+
		"\u0003\u0088D\u0000\u0131\u0132\u0003\u001e\u000f\u0000\u0132\u015a\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\u0005-\u0000\u0000\u0134\u015a\u0003\u0088"+
		"D\u0000\u0135\u015a\u0003\u000e\u0007\u0000\u0136\u015a\u0003\u0010\b"+
		"\u0000\u0137\u015a\u0003F#\u0000\u0138\u015a\u0003n7\u0000\u0139\u015a"+
		"\u0003B!\u0000\u013a\u015a\u0003D\"\u0000\u013b\u015a\u0003T*\u0000\u013c"+
		"\u015a\u0003\u001a\r\u0000\u013d\u0140\u0003\u0088D\u0000\u013e\u013f"+
		"\u0005c\u0000\u0000\u013f\u0141\u0003\u00b0X\u0000\u0140\u013e\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000"+
		"\u0000\u0000\u0142\u0144\u0005\t\u0000\u0000\u0143\u0145\u0003\u0084B"+
		"\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0005\n\u0000\u0000"+
		"\u0147\u015a\u0001\u0000\u0000\u0000\u0148\u015a\u0003H$\u0000\u0149\u015a"+
		"\u0003X,\u0000\u014a\u015a\u0003J%\u0000\u014b\u015a\u0003L&\u0000\u014c"+
		"\u015a\u0003N\'\u0000\u014d\u015a\u0003f3\u0000\u014e\u015a\u0005~\u0000"+
		"\u0000\u014f\u015a\u00034\u001a\u0000\u0150\u015a\u0003(\u0014\u0000\u0151"+
		"\u015a\u0003*\u0015\u0000\u0152\u015a\u00036\u001b\u0000\u0153\u015a\u0005"+
		".\u0000\u0000\u0154\u015a\u0003b1\u0000\u0155\u015a\u0003d2\u0000\u0156"+
		"\u015a\u0005\u001b\u0000\u0000\u0157\u015a\u0005\u001e\u0000\u0000\u0158"+
		"\u015a\u0003\u008aE\u0000\u0159\u012a\u0001\u0000\u0000\u0000\u0159\u012b"+
		"\u0001\u0000\u0000\u0000\u0159\u012f\u0001\u0000\u0000\u0000\u0159\u0133"+
		"\u0001\u0000\u0000\u0000\u0159\u0135\u0001\u0000\u0000\u0000\u0159\u0136"+
		"\u0001\u0000\u0000\u0000\u0159\u0137\u0001\u0000\u0000\u0000\u0159\u0138"+
		"\u0001\u0000\u0000\u0000\u0159\u0139\u0001\u0000\u0000\u0000\u0159\u013a"+
		"\u0001\u0000\u0000\u0000\u0159\u013b\u0001\u0000\u0000\u0000\u0159\u013c"+
		"\u0001\u0000\u0000\u0000\u0159\u013d\u0001\u0000\u0000\u0000\u0159\u0148"+
		"\u0001\u0000\u0000\u0000\u0159\u0149\u0001\u0000\u0000\u0000\u0159\u014a"+
		"\u0001\u0000\u0000\u0000\u0159\u014b\u0001\u0000\u0000\u0000\u0159\u014c"+
		"\u0001\u0000\u0000\u0000\u0159\u014d\u0001\u0000\u0000\u0000\u0159\u014e"+
		"\u0001\u0000\u0000\u0000\u0159\u014f\u0001\u0000\u0000\u0000\u0159\u0150"+
		"\u0001\u0000\u0000\u0000\u0159\u0151\u0001\u0000\u0000\u0000\u0159\u0152"+
		"\u0001\u0000\u0000\u0000\u0159\u0153\u0001\u0000\u0000\u0000\u0159\u0154"+
		"\u0001\u0000\u0000\u0000\u0159\u0155\u0001\u0000\u0000\u0000\u0159\u0156"+
		"\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u0159\u0158"+
		"\u0001\u0000\u0000\u0000\u015a\u001f\u0001\u0000\u0000\u0000\u015b\u015c"+
		"\u0006\u0010\uffff\uffff\u0000\u015c\u0164\u0005f\u0000\u0000\u015d\u015e"+
		"\u0005\t\u0000\u0000\u015e\u015f\u0003 \u0010\u0000\u015f\u0160\u0005"+
		"\n\u0000\u0000\u0160\u0164\u0001\u0000\u0000\u0000\u0161\u0164\u0003\""+
		"\u0011\u0000\u0162\u0164\u0003$\u0012\u0000\u0163\u015b\u0001\u0000\u0000"+
		"\u0000\u0163\u015d\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000"+
		"\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0164\u016e\u0001\u0000\u0000"+
		"\u0000\u0165\u0168\n\u0001\u0000\u0000\u0166\u0167\u0005h\u0000\u0000"+
		"\u0167\u0169\u0003 \u0010\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0169"+
		"\u016a\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u0001\u0000\u0000\u0000\u016b\u016d\u0001\u0000\u0000\u0000\u016c"+
		"\u0165\u0001\u0000\u0000\u0000\u016d\u0170\u0001\u0000\u0000\u0000\u016e"+
		"\u016c\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f"+
		"!\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0171\u0175"+
		"\u0005f\u0000\u0000\u0172\u0173\u0005}\u0000\u0000\u0173\u0176\u0003 "+
		"\u0010\u0000\u0174\u0176\u0003&\u0013\u0000\u0175\u0172\u0001\u0000\u0000"+
		"\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0176#\u0001\u0000\u0000\u0000"+
		"\u0177\u0181\u0005\\\u0000\u0000\u0178\u0179\u0005q\u0000\u0000\u0179"+
		"\u017a\u0003 \u0010\u0000\u017a\u017b\u0005u\u0000\u0000\u017b\u017c\u0003"+
		" \u0010\u0000\u017c\u0182\u0001\u0000\u0000\u0000\u017d\u017e\u0005q\u0000"+
		"\u0000\u017e\u0182\u0003 \u0010\u0000\u017f\u0180\u0005u\u0000\u0000\u0180"+
		"\u0182\u0003 \u0010\u0000\u0181\u0178\u0001\u0000\u0000\u0000\u0181\u017d"+
		"\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0182%\u0001"+
		"\u0000\u0000\u0000\u0183\u0184\u0005\u0007\u0000\u0000\u0184\u0189\u0003"+
		" \u0010\u0000\u0185\u0186\u0005\r\u0000\u0000\u0186\u0188\u0003 \u0010"+
		"\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0188\u018b\u0001\u0000\u0000"+
		"\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000"+
		"\u0000\u018a\u018c\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000"+
		"\u0000\u018c\u018d\u0005\b\u0000\u0000\u018d\'\u0001\u0000\u0000\u0000"+
		"\u018e\u018f\u0005Y\u0000\u0000\u018f\u0192\u0005f\u0000\u0000\u0190\u0191"+
		"\u0005q\u0000\u0000\u0191\u0193\u0005f\u0000\u0000\u0192\u0190\u0001\u0000"+
		"\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000"+
		"\u0000\u0000\u0194\u0198\u0005\u0007\u0000\u0000\u0195\u0197\u00030\u0018"+
		"\u0000\u0196\u0195\u0001\u0000\u0000\u0000\u0197\u019a\u0001\u0000\u0000"+
		"\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000"+
		"\u0000\u0199\u019b\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000"+
		"\u0000\u019b\u019c\u0005\b\u0000\u0000\u019c)\u0001\u0000\u0000\u0000"+
		"\u019d\u019f\u0003j5\u0000\u019e\u019d\u0001\u0000\u0000\u0000\u019f\u01a2"+
		"\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a0\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a1\u01a3\u0001\u0000\u0000\u0000\u01a2\u01a0"+
		"\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005\u001d\u0000\u0000\u01a4\u01a7"+
		"\u0005f\u0000\u0000\u01a5\u01a6\u0005q\u0000\u0000\u01a6\u01a8\u0005f"+
		"\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000"+
		"\u0000\u0000\u01a8\u01b2\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005u\u0000"+
		"\u0000\u01aa\u01af\u0005f\u0000\u0000\u01ab\u01ac\u0005\r\u0000\u0000"+
		"\u01ac\u01ae\u0005f\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ae"+
		"\u01b1\u0001\u0000\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01af"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b3\u0001\u0000\u0000\u0000\u01b1"+
		"\u01af\u0001\u0000\u0000\u0000\u01b2\u01a9\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b8\u0005\u0007\u0000\u0000\u01b5\u01b7\u0003.\u0017\u0000\u01b6\u01b5"+
		"\u0001\u0000\u0000\u0000\u01b7\u01ba\u0001\u0000\u0000\u0000\u01b8\u01b6"+
		"\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\u01bb"+
		"\u0001\u0000\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000\u01bb\u01bc"+
		"\u0005\b\u0000\u0000\u01bc+\u0001\u0000\u0000\u0000\u01bd\u01be\u0007"+
		"\u0001\u0000\u0000\u01be-\u0001\u0000\u0000\u0000\u01bf\u01c8\u0003B!"+
		"\u0000\u01c0\u01c2\u0003,\u0016\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c5\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c6\u0003\u001a\r\u0000\u01c4\u01c6\u0003n7\u0000\u01c5\u01c3"+
		"\u0001\u0000\u0000\u0000\u01c5\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c8"+
		"\u0001\u0000\u0000\u0000\u01c7\u01bf\u0001\u0000\u0000\u0000\u01c7\u01c1"+
		"\u0001\u0000\u0000\u0000\u01c8/\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005"+
		"f\u0000\u0000\u01ca\u01cb\u00032\u0019\u0000\u01cb1\u0001\u0000\u0000"+
		"\u0000\u01cc\u01ce\u0003\u001c\u000e\u0000\u01cd\u01cc\u0001\u0000\u0000"+
		"\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01d0\u0001\u0000\u0000"+
		"\u0000\u01cf\u01d1\u0003<\u001e\u0000\u01d0\u01cf\u0001\u0000\u0000\u0000"+
		"\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d8\u0001\u0000\u0000\u0000"+
		"\u01d2\u01d9\u0003\u00b4Z\u0000\u01d3\u01d5\u0005\t\u0000\u0000\u01d4"+
		"\u01d6\u0003\u00b2Y\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d5\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01d9"+
		"\u0005\n\u0000\u0000\u01d8\u01d2\u0001\u0000\u0000\u0000\u01d8\u01d3\u0001"+
		"\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01db\u0003"+
		"\u00b6[\u0000\u01db3\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005\\\u0000"+
		"\u0000\u01dd\u01e0\u0003 \u0010\u0000\u01de\u01df\u0005q\u0000\u0000\u01df"+
		"\u01e1\u0003 \u0010\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e0\u01e1"+
		"\u0001\u0000\u0000\u0000\u01e1\u01e5\u0001\u0000\u0000\u0000\u01e2\u01e6"+
		"\u0003&\u0013\u0000\u01e3\u01e4\u0005k\u0000\u0000\u01e4\u01e6\u0003 "+
		"\u0010\u0000\u01e5\u01e2\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e65\u0001\u0000\u0000\u0000\u01e7\u01e9\u0003j5\u0000"+
		"\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e9\u01ec\u0001\u0000\u0000\u0000"+
		"\u01ea\u01e8\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000"+
		"\u01eb\u01ed\u0001\u0000\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000"+
		"\u01ed\u01ee\u0005P\u0000\u0000\u01ee\u01f1\u0005f\u0000\u0000\u01ef\u01f0"+
		"\u0005q\u0000\u0000\u01f0\u01f2\u0005f\u0000\u0000\u01f1\u01ef\u0001\u0000"+
		"\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01fc\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f4\u0005u\u0000\u0000\u01f4\u01f9\u0005f\u0000\u0000"+
		"\u01f5\u01f6\u0005\r\u0000\u0000\u01f6\u01f8\u0005f\u0000\u0000\u01f7"+
		"\u01f5\u0001\u0000\u0000\u0000\u01f8\u01fb\u0001\u0000\u0000\u0000\u01f9"+
		"\u01f7\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa"+
		"\u01fd\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fc"+
		"\u01f3\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd"+
		"\u01fe\u0001\u0000\u0000\u0000\u01fe\u01ff\u0005\u0007\u0000\u0000\u01ff"+
		"\u0200\u0003:\u001d\u0000\u0200\u0201\u0005\b\u0000\u0000\u02017\u0001"+
		"\u0000\u0000\u0000\u0202\u0203\u0003\u00acV\u0000\u0203\u0204\u0003z="+
		"\u0000\u0204\u0208\u0001\u0000\u0000\u0000\u0205\u0208\u0003B!\u0000\u0206"+
		"\u0208\u0003\u001a\r\u0000\u0207\u0202\u0001\u0000\u0000\u0000\u0207\u0205"+
		"\u0001\u0000\u0000\u0000\u0207\u0206\u0001\u0000\u0000\u0000\u02089\u0001"+
		"\u0000\u0000\u0000\u0209\u020b\u00038\u001c\u0000\u020a\u0209\u0001\u0000"+
		"\u0000\u0000\u020b\u020e\u0001\u0000\u0000\u0000\u020c\u020a\u0001\u0000"+
		"\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d;\u0001\u0000\u0000"+
		"\u0000\u020e\u020c\u0001\u0000\u0000\u0000\u020f\u0210\u0005\u0007\u0000"+
		"\u0000\u0210\u0215\u0003>\u001f\u0000\u0211\u0212\u0005\r\u0000\u0000"+
		"\u0212\u0214\u0003>\u001f\u0000\u0213\u0211\u0001\u0000\u0000\u0000\u0214"+
		"\u0217\u0001\u0000\u0000\u0000\u0215\u0213\u0001\u0000\u0000\u0000\u0215"+
		"\u0216\u0001\u0000\u0000\u0000\u0216\u0218\u0001\u0000\u0000\u0000\u0217"+
		"\u0215\u0001\u0000\u0000\u0000\u0218\u0219\u0005\b\u0000\u0000\u0219="+
		"\u0001\u0000\u0000\u0000\u021a\u021f\u0003@ \u0000\u021b\u021c\u0005\r"+
		"\u0000\u0000\u021c\u021e\u0003@ \u0000\u021d\u021b\u0001\u0000\u0000\u0000"+
		"\u021e\u0221\u0001\u0000\u0000\u0000\u021f\u021d\u0001\u0000\u0000\u0000"+
		"\u021f\u0220\u0001\u0000\u0000\u0000\u0220\u0222\u0001\u0000\u0000\u0000"+
		"\u0221\u021f\u0001\u0000\u0000\u0000\u0222\u0223\u0005\u001a\u0000\u0000"+
		"\u0223\u0224\u0005f\u0000\u0000\u0224?\u0001\u0000\u0000\u0000\u0225\u0229"+
		"\u0003\u00be_\u0000\u0226\u0229\u0003\u00cae\u0000\u0227\u0229\u0003\u00c6"+
		"c\u0000\u0228\u0225\u0001\u0000\u0000\u0000\u0228\u0226\u0001\u0000\u0000"+
		"\u0000\u0228\u0227\u0001\u0000\u0000\u0000\u0229A\u0001\u0000\u0000\u0000"+
		"\u022a\u022c\u0007\u0002\u0000\u0000\u022b\u022a\u0001\u0000\u0000\u0000"+
		"\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u022e\u0001\u0000\u0000\u0000"+
		"\u022d\u022f\u0005H\u0000\u0000\u022e\u022d\u0001\u0000\u0000\u0000\u022e"+
		"\u022f\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000\u0000\u0000\u0230"+
		"\u0231\u0003@ \u0000\u0231\u0232\u0003\u00b8\\\u0000\u0232C\u0001\u0000"+
		"\u0000\u0000\u0233\u0234\u0005\u0019\u0000\u0000\u0234\u0235\u0005f\u0000"+
		"\u0000\u0235\u023c\u0005\u0007\u0000\u0000\u0236\u0238\u0005I\u0000\u0000"+
		"\u0237\u0236\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000\u0000"+
		"\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u023b\u0003\u00b4Z\u0000\u023a"+
		"\u0237\u0001\u0000\u0000\u0000\u023b\u023e\u0001\u0000\u0000\u0000\u023c"+
		"\u023a\u0001\u0000\u0000\u0000\u023c\u023d\u0001\u0000\u0000\u0000\u023d"+
		"\u023f\u0001\u0000\u0000\u0000\u023e\u023c\u0001\u0000\u0000\u0000\u023f"+
		"\u0240\u0005S\u0000\u0000\u0240\u0241\u0003\u0088D\u0000\u0241\u0242\u0005"+
		"\b\u0000\u0000\u0242E\u0001\u0000\u0000\u0000\u0243\u0244\u0003\u0084"+
		"B\u0000\u0244\u0245\u0005k\u0000\u0000\u0245\u0246\u0003\u0084B\u0000"+
		"\u0246G\u0001\u0000\u0000\u0000\u0247\u0248\u0005$\u0000\u0000\u0248\u0249"+
		"\u0003\u0018\f\u0000\u0249\u024a\u0005\'\u0000\u0000\u024aI\u0001\u0000"+
		"\u0000\u0000\u024b\u024c\u0005f\u0000\u0000\u024c\u024d\u0003\u00c2a\u0000"+
		"\u024dK\u0001\u0000\u0000\u0000\u024e\u024f\u0005f\u0000\u0000\u024f\u0250"+
		"\u0003\u00c6c\u0000\u0250M\u0001\u0000\u0000\u0000\u0251\u0252\u00056"+
		"\u0000\u0000\u0252\u0253\u0003\u0088D\u0000\u0253\u0255\u0003P(\u0000"+
		"\u0254\u0256\u0003R)\u0000\u0255\u0254\u0001\u0000\u0000\u0000\u0255\u0256"+
		"\u0001\u0000\u0000\u0000\u0256\u0257\u0001\u0000\u0000\u0000\u0257\u0258"+
		"\u0005)\u0000\u0000\u0258O\u0001\u0000\u0000\u0000\u0259\u025b\u0005V"+
		"\u0000\u0000\u025a\u0259\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000"+
		"\u0000\u0000\u025b\u025c\u0001\u0000\u0000\u0000\u025c\u025d\u0003\u0018"+
		"\f\u0000\u025dQ\u0001\u0000\u0000\u0000\u025e\u025f\u0005(\u0000\u0000"+
		"\u025f\u0260\u0003\u0018\f\u0000\u0260S\u0001\u0000\u0000\u0000\u0261"+
		"\u0264\u00053\u0000\u0000\u0262\u0265\u0005\u0018\u0000\u0000\u0263\u0265"+
		"\u0003V+\u0000\u0264\u0262\u0001\u0000\u0000\u0000\u0264\u0263\u0001\u0000"+
		"\u0000\u0000\u0265U\u0001\u0000\u0000\u0000\u0266\u026b\u0005f\u0000\u0000"+
		"\u0267\u0268\u0005\r\u0000\u0000\u0268\u026a\u0005f\u0000\u0000\u0269"+
		"\u0267\u0001\u0000\u0000\u0000\u026a\u026d\u0001\u0000\u0000\u0000\u026b"+
		"\u0269\u0001\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c"+
		"W\u0001\u0000\u0000\u0000\u026d\u026b\u0001\u0000\u0000\u0000\u026e\u0272"+
		"\u0003Z-\u0000\u026f\u0272\u0003^/\u0000\u0270\u0272\u0003`0\u0000\u0271"+
		"\u026e\u0001\u0000\u0000\u0000\u0271\u026f\u0001\u0000\u0000\u0000\u0271"+
		"\u0270\u0001\u0000\u0000\u0000\u0272Y\u0001\u0000\u0000\u0000\u0273\u0274"+
		"\u00052\u0000\u0000\u0274\u0277\u0007\u0003\u0000\u0000\u0275\u0276\u0005"+
		"\r\u0000\u0000\u0276\u0278\u0007\u0003\u0000\u0000\u0277\u0275\u0001\u0000"+
		"\u0000\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000"+
		"\u0000\u0000\u0279\u027a\u0003\\.\u0000\u027a\u027b\u0003\u0084B\u0000"+
		"\u027b\u027c\u0003\u001e\u000f\u0000\u027c[\u0001\u0000\u0000\u0000\u027d"+
		"\u027e\u0007\u0004\u0000\u0000\u027e]\u0001\u0000\u0000\u0000\u027f\u0280"+
		"\u0005b\u0000\u0000\u0280\u0281\u0003\u0084B\u0000\u0281\u0282\u0003\u001e"+
		"\u000f\u0000\u0282_\u0001\u0000\u0000\u0000\u0283\u0284\u0005Q\u0000\u0000"+
		"\u0284\u0285\u0003\u001e\u000f\u0000\u0285\u0286\u0005^\u0000\u0000\u0286"+
		"\u0287\u0003\u0084B\u0000\u0287a\u0001\u0000\u0000\u0000\u0288\u028a\u0005"+
		"S\u0000\u0000\u0289\u028b\u0003\u0088D\u0000\u028a\u0289\u0001\u0000\u0000"+
		"\u0000\u028a\u028b\u0001\u0000\u0000\u0000\u028bc\u0001\u0000\u0000\u0000"+
		"\u028c\u028d\u0005d\u0000\u0000\u028d\u028e\u0003\u0084B\u0000\u028ee"+
		"\u0001\u0000\u0000\u0000\u028f\u0290\u0005[\u0000\u0000\u0290\u0291\u0003"+
		"\u001e\u000f\u0000\u0291\u0292\u0005\u001c\u0000\u0000\u0292\u0294\u0003"+
		"\u001e\u000f\u0000\u0293\u0295\u0005)\u0000\u0000\u0294\u0293\u0001\u0000"+
		"\u0000\u0000\u0294\u0295\u0001\u0000\u0000\u0000\u0295g\u0001\u0000\u0000"+
		"\u0000\u0296\u0297\u0005\"\u0000\u0000\u0297\u029a\u0003\u0088D\u0000"+
		"\u0298\u0299\u0005c\u0000\u0000\u0299\u029b\u0003\u00acV\u0000\u029a\u0298"+
		"\u0001\u0000\u0000\u0000\u029a\u029b\u0001\u0000\u0000\u0000\u029bi\u0001"+
		"\u0000\u0000\u0000\u029c\u029d\u0005\u0001\u0000\u0000\u029d\u02a2\u0005"+
		"f\u0000\u0000\u029e\u029f\u0005\t\u0000\u0000\u029f\u02a0\u0003\u0096"+
		"K\u0000\u02a0\u02a1\u0005\n\u0000\u0000\u02a1\u02a3\u0001\u0000\u0000"+
		"\u0000\u02a2\u029e\u0001\u0000\u0000\u0000\u02a2\u02a3\u0001\u0000\u0000"+
		"\u0000\u02a3k\u0001\u0000\u0000\u0000\u02a4\u02a6\u0005f\u0000\u0000\u02a5"+
		"\u02a7\u0003z=\u0000\u02a6\u02a5\u0001\u0000\u0000\u0000\u02a6\u02a7\u0001"+
		"\u0000\u0000\u0000\u02a7\u02a9\u0001\u0000\u0000\u0000\u02a8\u02aa\u0003"+
		"|>\u0000\u02a9\u02a8\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000"+
		"\u0000\u02aam\u0001\u0000\u0000\u0000\u02ab\u02ad\u0003p8\u0000\u02ac"+
		"\u02ab\u0001\u0000\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000\u02ad"+
		"\u02ae\u0001\u0000\u0000\u0000\u02ae\u02af\u0003r9\u0000\u02af\u02b0\u0003"+
		"\u00b2Y\u0000\u02b0\u02b3\u0001\u0000\u0000\u0000\u02b1\u02b3\u0003v;"+
		"\u0000\u02b2\u02ac\u0001\u0000\u0000\u0000\u02b2\u02b1\u0001\u0000\u0000"+
		"\u0000\u02b3o\u0001\u0000\u0000\u0000\u02b4\u02bb\u00055\u0000\u0000\u02b5"+
		"\u02b6\u0005G\u0000\u0000\u02b6\u02b7\u0005\t\u0000\u0000\u02b7\u02b8"+
		"\u0003\u0088D\u0000\u02b8\u02b9\u0005\n\u0000\u0000\u02b9\u02bb\u0001"+
		"\u0000\u0000\u0000\u02ba\u02b4\u0001\u0000\u0000\u0000\u02ba\u02b5\u0001"+
		"\u0000\u0000\u0000\u02bbq\u0001\u0000\u0000\u0000\u02bc\u02bd\u0007\u0005"+
		"\u0000\u0000\u02bds\u0001\u0000\u0000\u0000\u02be\u02bf\u0005\u0094\u0000"+
		"\u0000\u02bfu\u0001\u0000\u0000\u0000\u02c0\u02c1\u0005\u0017\u0000\u0000"+
		"\u02c1\u02c2\u0005f\u0000\u0000\u02c2\u02c3\u0005\u001a\u0000\u0000\u02c3"+
		"\u02c8\u0003x<\u0000\u02c4\u02c5\u0005\r\u0000\u0000\u02c5\u02c7\u0003"+
		"x<\u0000\u02c6\u02c4\u0001\u0000\u0000\u0000\u02c7\u02ca\u0001\u0000\u0000"+
		"\u0000\u02c8\u02c6\u0001\u0000\u0000\u0000\u02c8\u02c9\u0001\u0000\u0000"+
		"\u0000\u02c9w\u0001\u0000\u0000\u0000\u02ca\u02c8\u0001\u0000\u0000\u0000"+
		"\u02cb\u02cc\u0005f\u0000\u0000\u02ccy\u0001\u0000\u0000\u0000\u02cd\u02ce"+
		"\u0005\f\u0000\u0000\u02ce\u02cf\u0003 \u0010\u0000\u02cf{\u0001\u0000"+
		"\u0000\u0000\u02d0\u02d1\u0005k\u0000\u0000\u02d1\u02d2\u0003\u0088D\u0000"+
		"\u02d2}\u0001\u0000\u0000\u0000\u02d3\u02dc\u0005\u0007\u0000\u0000\u02d4"+
		"\u02d9\u0003\u0080@\u0000\u02d5\u02d6\u0005\r\u0000\u0000\u02d6\u02d8"+
		"\u0003\u0080@\u0000\u02d7\u02d5\u0001\u0000\u0000\u0000\u02d8\u02db\u0001"+
		"\u0000\u0000\u0000\u02d9\u02d7\u0001\u0000\u0000\u0000\u02d9\u02da\u0001"+
		"\u0000\u0000\u0000\u02da\u02dd\u0001\u0000\u0000\u0000\u02db\u02d9\u0001"+
		"\u0000\u0000\u0000\u02dc\u02d4\u0001\u0000\u0000\u0000\u02dc\u02dd\u0001"+
		"\u0000\u0000\u0000\u02dd\u02de\u0001\u0000\u0000\u0000\u02de\u02df\u0005"+
		"\b\u0000\u0000\u02df\u007f\u0001\u0000\u0000\u0000\u02e0\u02e3\u0003\u0082"+
		"A\u0000\u02e1\u02e3\u0003\u0088D\u0000\u02e2\u02e0\u0001\u0000\u0000\u0000"+
		"\u02e2\u02e1\u0001\u0000\u0000\u0000\u02e3\u0081\u0001\u0000\u0000\u0000"+
		"\u02e4\u02e5\u0005~\u0000\u0000\u02e5\u02e6\u0003\u0088D\u0000\u02e6\u0083"+
		"\u0001\u0000\u0000\u0000\u02e7\u02ec\u0003\u0088D\u0000\u02e8\u02e9\u0005"+
		"\r\u0000\u0000\u02e9\u02eb\u0003\u0088D\u0000\u02ea\u02e8\u0001\u0000"+
		"\u0000\u0000\u02eb\u02ee\u0001\u0000\u0000\u0000\u02ec\u02ea\u0001\u0000"+
		"\u0000\u0000\u02ec\u02ed\u0001\u0000\u0000\u0000\u02ed\u0085\u0001\u0000"+
		"\u0000\u0000\u02ee\u02ec\u0001\u0000\u0000\u0000\u02ef\u02f2\u0005f\u0000"+
		"\u0000\u02f0\u02f1\u0005\u000f\u0000\u0000\u02f1\u02f3\u0005f\u0000\u0000"+
		"\u02f2\u02f0\u0001\u0000\u0000\u0000\u02f3\u02f4\u0001\u0000\u0000\u0000"+
		"\u02f4\u02f2\u0001\u0000\u0000\u0000\u02f4\u02f5\u0001\u0000\u0000\u0000"+
		"\u02f5\u0087\u0001\u0000\u0000\u0000\u02f6\u02f7\u0006D\uffff\uffff\u0000"+
		"\u02f7\u032a\u0005f\u0000\u0000\u02f8\u032a\u0005W\u0000\u0000\u02f9\u032a"+
		"\u0003\u0086C\u0000\u02fa\u032a\u0003\u00a0P\u0000\u02fb\u032a\u0003 "+
		"\u0010\u0000\u02fc\u032a\u0003\u00aeW\u0000\u02fd\u032a\u0003H$\u0000"+
		"\u02fe\u02ff\u0005\u0081\u0000\u0000\u02ff\u032a\u0003\u0088D\u0019\u0300"+
		"\u0301\u0005B\u0000\u0000\u0301\u0302\u0003\u0088D\u0000\u0302\u0303\u0005"+
		"\t\u0000\u0000\u0303\u0304\u0003\u0084B\u0000\u0304\u0305\u0005\n\u0000"+
		"\u0000\u0305\u032a\u0001\u0000\u0000\u0000\u0306\u0309\u0005+\u0000\u0000"+
		"\u0307\u030a\u0003\u0088D\u0000\u0308\u030a\u0003\u0018\f\u0000\u0309"+
		"\u0307\u0001\u0000\u0000\u0000\u0309\u0308\u0001\u0000\u0000\u0000\u030a"+
		"\u032a\u0001\u0000\u0000\u0000\u030b\u030e\u0005-\u0000\u0000\u030c\u030f"+
		"\u0003\u0088D\u0000\u030d\u030f\u0003\u001e\u000f\u0000\u030e\u030c\u0001"+
		"\u0000\u0000\u0000\u030e\u030d\u0001\u0000\u0000\u0000\u030f\u032a\u0001"+
		"\u0000\u0000\u0000\u0310\u032a\u0003\u0098L\u0000\u0311\u032a\u0003\u0092"+
		"I\u0000\u0312\u032a\u0003\u008cF\u0000\u0313\u032a\u0003\u008eG\u0000"+
		"\u0314\u032a\u0003~?\u0000\u0315\u032a\u0003\u00b8\\\u0000\u0316\u0317"+
		"\u0003\u00cae\u0000\u0317\u0318\u0003\u0088D\r\u0318\u032a\u0001\u0000"+
		"\u0000\u0000\u0319\u031a\u0003\u00be_\u0000\u031a\u031c\u0005\t\u0000"+
		"\u0000\u031b\u031d\u0003\u0084B\u0000\u031c\u031b\u0001\u0000\u0000\u0000"+
		"\u031c\u031d\u0001\u0000\u0000\u0000\u031d\u031e\u0001\u0000\u0000\u0000"+
		"\u031e\u031f\u0005\n\u0000\u0000\u031f\u032a\u0001\u0000\u0000\u0000\u0320"+
		"\u0321\u0005\t\u0000\u0000\u0321\u0322\u0003\u0088D\u0000\u0322\u0323"+
		"\u0005\n\u0000\u0000\u0323\u032a\u0001\u0000\u0000\u0000\u0324\u0325\u0005"+
		"]\u0000\u0000\u0325\u032a\u0003\u0088D\u0005\u0326\u0327\u0005\u001f\u0000"+
		"\u0000\u0327\u032a\u0003\u0084B\u0000\u0328\u032a\u0003\u008aE\u0000\u0329"+
		"\u02f6\u0001\u0000\u0000\u0000\u0329\u02f8\u0001\u0000\u0000\u0000\u0329"+
		"\u02f9\u0001\u0000\u0000\u0000\u0329\u02fa\u0001\u0000\u0000\u0000\u0329"+
		"\u02fb\u0001\u0000\u0000\u0000\u0329\u02fc\u0001\u0000\u0000\u0000\u0329"+
		"\u02fd\u0001\u0000\u0000\u0000\u0329\u02fe\u0001\u0000\u0000\u0000\u0329"+
		"\u0300\u0001\u0000\u0000\u0000\u0329\u0306\u0001\u0000\u0000\u0000\u0329"+
		"\u030b\u0001\u0000\u0000\u0000\u0329\u0310\u0001\u0000\u0000\u0000\u0329"+
		"\u0311\u0001\u0000\u0000\u0000\u0329\u0312\u0001\u0000\u0000\u0000\u0329"+
		"\u0313\u0001\u0000\u0000\u0000\u0329\u0314\u0001\u0000\u0000\u0000\u0329"+
		"\u0315\u0001\u0000\u0000\u0000\u0329\u0316\u0001\u0000\u0000\u0000\u0329"+
		"\u0319\u0001\u0000\u0000\u0000\u0329\u0320\u0001\u0000\u0000\u0000\u0329"+
		"\u0324\u0001\u0000\u0000\u0000\u0329\u0326\u0001\u0000\u0000\u0000\u0329"+
		"\u0328\u0001\u0000\u0000\u0000\u032a\u035e\u0001\u0000\u0000\u0000\u032b"+
		"\u032c\n\u0018\u0000\u0000\u032c\u032d\u0005n\u0000\u0000\u032d\u035d"+
		"\u0003\u0088D\u0019\u032e\u032f\n\f\u0000\u0000\u032f\u0330\u0003\u00be"+
		"_\u0000\u0330\u0331\u0003\u0088D\r\u0331\u035d\u0001\u0000\u0000\u0000"+
		"\u0332\u0333\n\t\u0000\u0000\u0333\u0334\u0005\u0003\u0000\u0000\u0334"+
		"\u0335\u0005f\u0000\u0000\u0335\u0336\u0005\u0003\u0000\u0000\u0336\u035d"+
		"\u0003\u0088D\n\u0337\u033a\n\b\u0000\u0000\u0338\u033b\u00058\u0000\u0000"+
		"\u0339\u033b\u0005D\u0000\u0000\u033a\u0338\u0001\u0000\u0000\u0000\u033a"+
		"\u0339\u0001\u0000\u0000\u0000\u033b\u033c\u0001\u0000\u0000\u0000\u033c"+
		"\u035d\u0003\u0088D\t\u033d\u033e\n\u0014\u0000\u0000\u033e\u033f\u0005"+
		"\u000f\u0000\u0000\u033f\u035d\u0003\u00acV\u0000\u0340\u0343\n\u000b"+
		"\u0000\u0000\u0341\u0342\u0005c\u0000\u0000\u0342\u0344\u0003\u00b0X\u0000"+
		"\u0343\u0341\u0001\u0000\u0000\u0000\u0343\u0344\u0001\u0000\u0000\u0000"+
		"\u0344\u0345\u0001\u0000\u0000\u0000\u0345\u0347\u0005\t\u0000\u0000\u0346"+
		"\u0348\u0003\u0084B\u0000\u0347\u0346\u0001\u0000\u0000\u0000\u0347\u0348"+
		"\u0001\u0000\u0000\u0000\u0348\u0349\u0001\u0000\u0000\u0000\u0349\u035d"+
		"\u0005\n\u0000\u0000\u034a\u034b\n\u0007\u0000\u0000\u034b\u034c\u0005"+
		"\u0005\u0000\u0000\u034c\u034d\u0003\u0088D\u0000\u034d\u034e\u0005\u0006"+
		"\u0000\u0000\u034e\u035d\u0001\u0000\u0000\u0000\u034f\u0350\n\u0003\u0000"+
		"\u0000\u0350\u0353\u0005:\u0000\u0000\u0351\u0354\u0005f\u0000\u0000\u0352"+
		"\u0354\u0003\u0088D\u0000\u0353\u0351\u0001\u0000\u0000\u0000\u0353\u0352"+
		"\u0001\u0000\u0000\u0000\u0354\u035d\u0001\u0000\u0000\u0000\u0355\u0356"+
		"\n\u0002\u0000\u0000\u0356\u0357\u0005\u008d\u0000\u0000\u0357\u035a\u0003"+
		"\u0088D\u0000\u0358\u0359\u0005\f\u0000\u0000\u0359\u035b\u0003\u0088"+
		"D\u0000\u035a\u0358\u0001\u0000\u0000\u0000\u035a\u035b\u0001\u0000\u0000"+
		"\u0000\u035b\u035d\u0001\u0000\u0000\u0000\u035c\u032b\u0001\u0000\u0000"+
		"\u0000\u035c\u032e\u0001\u0000\u0000\u0000\u035c\u0332\u0001\u0000\u0000"+
		"\u0000\u035c\u0337\u0001\u0000\u0000\u0000\u035c\u033d\u0001\u0000\u0000"+
		"\u0000\u035c\u0340\u0001\u0000\u0000\u0000\u035c\u034a\u0001\u0000\u0000"+
		"\u0000\u035c\u034f\u0001\u0000\u0000\u0000\u035c\u0355\u0001\u0000\u0000"+
		"\u0000\u035d\u0360\u0001\u0000\u0000\u0000\u035e\u035c\u0001\u0000\u0000"+
		"\u0000\u035e\u035f\u0001\u0000\u0000\u0000\u035f\u0089\u0001\u0000\u0000"+
		"\u0000\u0360\u035e\u0001\u0000\u0000\u0000\u0361\u0362\u0005>\u0000\u0000"+
		"\u0362\u0363\u0003\u0088D\u0000\u0363\u0365\u0005X\u0000\u0000\u0364\u0366"+
		"\u0003\u009eO\u0000\u0365\u0364\u0001\u0000\u0000\u0000\u0366\u0367\u0001"+
		"\u0000\u0000\u0000\u0367\u0365\u0001\u0000\u0000\u0000\u0367\u0368\u0001"+
		"\u0000\u0000\u0000\u0368\u036a\u0001\u0000\u0000\u0000\u0369\u036b\u0003"+
		"\u009cN\u0000\u036a\u0369\u0001\u0000\u0000\u0000\u036a\u036b\u0001\u0000"+
		"\u0000\u0000\u036b\u008b\u0001\u0000\u0000\u0000\u036c\u036d\u0005\u0007"+
		"\u0000\u0000\u036d\u0370\u0003\u0088D\u0000\u036e\u036f\u0005\r\u0000"+
		"\u0000\u036f\u0371\u0003\u0088D\u0000\u0370\u036e\u0001\u0000\u0000\u0000"+
		"\u0370\u0371\u0001\u0000\u0000\u0000\u0371\u0372\u0001\u0000\u0000\u0000"+
		"\u0372\u0373\u0005\u0080\u0000\u0000\u0373\u0376\u0003\u0088D\u0000\u0374"+
		"\u0375\u0005\u008f\u0000\u0000\u0375\u0377\u0005\u0081\u0000\u0000\u0376"+
		"\u0374\u0001\u0000\u0000\u0000\u0376\u0377\u0001\u0000\u0000\u0000\u0377"+
		"\u0378\u0001\u0000\u0000\u0000\u0378\u0379\u0005\b\u0000\u0000\u0379\u008d"+
		"\u0001\u0000\u0000\u0000\u037a\u037e\u0005\u0007\u0000\u0000\u037b\u037c"+
		"\u0003\u0088D\u0000\u037c\u037d\u0005E\u0000\u0000\u037d\u037f\u0001\u0000"+
		"\u0000\u0000\u037e\u037b\u0001\u0000\u0000\u0000\u037e\u037f\u0001\u0000"+
		"\u0000\u0000\u037f\u0380\u0001\u0000\u0000\u0000\u0380\u0381\u0005f\u0000"+
		"\u0000\u0381\u0382\u0003\\.\u0000\u0382\u0385\u0003\u0088D\u0000\u0383"+
		"\u0384\u00056\u0000\u0000\u0384\u0386\u0003\u0088D\u0000\u0385\u0383\u0001"+
		"\u0000\u0000\u0000\u0385\u0386\u0001\u0000\u0000\u0000\u0386\u0387\u0001"+
		"\u0000\u0000\u0000\u0387\u0388\u0005\b\u0000\u0000\u0388\u008f\u0001\u0000"+
		"\u0000\u0000\u0389\u038a\u0007\u0006\u0000\u0000\u038a\u038b\u0005\u008f"+
		"\u0000\u0000\u038b\u038c\u0003\u0088D\u0000\u038c\u0091\u0001\u0000\u0000"+
		"\u0000\u038d\u038e\u0005\u0007\u0000\u0000\u038e\u0393\u0003\u0090H\u0000"+
		"\u038f\u0390\u0005\r\u0000\u0000\u0390\u0392\u0003\u0090H\u0000\u0391"+
		"\u038f\u0001\u0000\u0000\u0000\u0392\u0395\u0001\u0000\u0000\u0000\u0393"+
		"\u0391\u0001\u0000\u0000\u0000\u0393\u0394\u0001\u0000\u0000\u0000\u0394"+
		"\u0396\u0001\u0000\u0000\u0000\u0395\u0393\u0001\u0000\u0000\u0000\u0396"+
		"\u0397\u0005\b\u0000\u0000\u0397\u0093\u0001\u0000\u0000\u0000\u0398\u039b"+
		"\u0005f\u0000\u0000\u0399\u039b\u0003\u00acV\u0000\u039a\u0398\u0001\u0000"+
		"\u0000\u0000\u039a\u0399\u0001\u0000\u0000\u0000\u039b\u039c\u0001\u0000"+
		"\u0000\u0000\u039c\u039d\u0005\f\u0000\u0000\u039d\u039e\u0003\u0088D"+
		"\u0000\u039e\u0095\u0001\u0000\u0000\u0000\u039f\u03a4\u0003\u0094J\u0000"+
		"\u03a0\u03a1\u0005\r\u0000\u0000\u03a1\u03a3\u0003\u0094J\u0000\u03a2"+
		"\u03a0\u0001\u0000\u0000\u0000\u03a3\u03a6\u0001\u0000\u0000\u0000\u03a4"+
		"\u03a2\u0001\u0000\u0000\u0000\u03a4\u03a5\u0001\u0000\u0000\u0000\u03a5"+
		"\u0097\u0001\u0000\u0000\u0000\u03a6\u03a4\u0001\u0000\u0000\u0000\u03a7"+
		"\u03a8\u0005\u0007\u0000\u0000\u03a8\u03a9\u0003\u0096K\u0000\u03a9\u03aa"+
		"\u0005\b\u0000\u0000\u03aa\u0099\u0001\u0000\u0000\u0000\u03ab\u03ac\u0007"+
		"\u0007\u0000\u0000\u03ac\u009b\u0001\u0000\u0000\u0000\u03ad\u03ae\u0005"+
		" \u0000\u0000\u03ae\u03af\u0005m\u0000\u0000\u03af\u03b0\u0003\u0088D"+
		"\u0000\u03b0\u009d\u0001\u0000\u0000\u0000\u03b1\u03b3\u00051\u0000\u0000"+
		"\u03b2\u03b1\u0001\u0000\u0000\u0000\u03b2\u03b3\u0001\u0000\u0000\u0000"+
		"\u03b3\u03b4\u0001\u0000\u0000\u0000\u03b4\u03b5\u0003\u0084B\u0000\u03b5"+
		"\u03b6\u0005m\u0000\u0000\u03b6\u03b7\u0003\u0088D\u0000\u03b7\u009f\u0001"+
		"\u0000\u0000\u0000\u03b8\u03bd\u0003\u00a2Q\u0000\u03b9\u03bd\u0003\u00a4"+
		"R\u0000\u03ba\u03bd\u0003\u00a6S\u0000\u03bb\u03bd\u0003\u00acV\u0000"+
		"\u03bc\u03b8\u0001\u0000\u0000\u0000\u03bc\u03b9\u0001\u0000\u0000\u0000"+
		"\u03bc\u03ba\u0001\u0000\u0000\u0000\u03bc\u03bb\u0001\u0000\u0000\u0000"+
		"\u03bd\u00a1\u0001\u0000\u0000\u0000\u03be\u03bf\u0005C\u0000\u0000\u03bf"+
		"\u00a3\u0001\u0000\u0000\u0000\u03c0\u03c1\u0007\b\u0000\u0000\u03c1\u00a5"+
		"\u0001\u0000\u0000\u0000\u03c2\u03c5\u0003\u00a8T\u0000\u03c3\u03c5\u0003"+
		"\u00aaU\u0000\u03c4\u03c2\u0001\u0000\u0000\u0000\u03c4\u03c3\u0001\u0000"+
		"\u0000\u0000\u03c5\u00a7\u0001\u0000\u0000\u0000\u03c6\u03c7\u0007\t\u0000"+
		"\u0000\u03c7\u00a9\u0001\u0000\u0000\u0000\u03c8\u03c9\u0007\n\u0000\u0000"+
		"\u03c9\u00ab\u0001\u0000\u0000\u0000\u03ca\u03cb\u0007\u000b\u0000\u0000"+
		"\u03cb\u00ad\u0001\u0000\u0000\u0000\u03cc\u03cd\u0005\u0003\u0000\u0000"+
		"\u03cd\u03ce\u0003\u00be_\u0000\u03ce\u03cf\u0005\u0003\u0000\u0000\u03cf"+
		"\u00af\u0001\u0000\u0000\u0000\u03d0\u03d1\u0005\u0007\u0000\u0000\u03d1"+
		"\u03d6\u0003@ \u0000\u03d2\u03d3\u0005\r\u0000\u0000\u03d3\u03d5\u0003"+
		"@ \u0000\u03d4\u03d2\u0001\u0000\u0000\u0000\u03d5\u03d8\u0001\u0000\u0000"+
		"\u0000\u03d6\u03d4\u0001\u0000\u0000\u0000\u03d6\u03d7\u0001\u0000\u0000"+
		"\u0000\u03d7\u03d9\u0001\u0000\u0000\u0000\u03d8\u03d6\u0001\u0000\u0000"+
		"\u0000\u03d9\u03da\u0005\b\u0000\u0000\u03da\u00b1\u0001\u0000\u0000\u0000"+
		"\u03db\u03e0\u0003\u00b4Z\u0000\u03dc\u03dd\u0005\r\u0000\u0000\u03dd"+
		"\u03df\u0003\u00b4Z\u0000\u03de\u03dc\u0001\u0000\u0000\u0000\u03df\u03e2"+
		"\u0001\u0000\u0000\u0000\u03e0\u03de\u0001\u0000\u0000\u0000\u03e0\u03e1"+
		"\u0001\u0000\u0000\u0000\u03e1\u00b3\u0001\u0000\u0000\u0000\u03e2\u03e0"+
		"\u0001\u0000\u0000\u0000\u03e3\u03e5\u0005~\u0000\u0000\u03e4\u03e3\u0001"+
		"\u0000\u0000\u0000\u03e4\u03e5\u0001\u0000\u0000\u0000\u03e5\u03e6\u0001"+
		"\u0000\u0000\u0000\u03e6\u03e7\u0003l6\u0000\u03e7\u00b5\u0001\u0000\u0000"+
		"\u0000\u03e8\u03ec\u0003z=\u0000\u03e9\u03ea\u0005\f\u0000\u0000\u03ea"+
		"\u03ec\u0003\u0088D\u0000\u03eb\u03e8\u0001\u0000\u0000\u0000\u03eb\u03e9"+
		"\u0001\u0000\u0000\u0000\u03eb\u03ec\u0001\u0000\u0000\u0000\u03ec\u03f1"+
		"\u0001\u0000\u0000\u0000\u03ed\u03ee\u0005\u0005\u0000\u0000\u03ee\u03ef"+
		"\u0003\u0088D\u0000\u03ef\u03f0\u0005\u0006\u0000\u0000\u03f0\u03f2\u0001"+
		"\u0000\u0000\u0000\u03f1\u03ed\u0001\u0000\u0000\u0000\u03f1\u03f2\u0001"+
		"\u0000\u0000\u0000\u03f2\u00b7\u0001\u0000\u0000\u0000\u03f3\u03f7\u0003"+
		"\u00bc^\u0000\u03f4\u03f5\u00054\u0000\u0000\u03f5\u03f7\u0003\u00ba]"+
		"\u0000\u03f6\u03f3\u0001\u0000\u0000\u0000\u03f6\u03f4\u0001\u0000\u0000"+
		"\u0000\u03f7\u00b9\u0001\u0000\u0000\u0000\u03f8\u03fa\u0003j5\u0000\u03f9"+
		"\u03f8\u0001\u0000\u0000\u0000\u03fa\u03fd\u0001\u0000\u0000\u0000\u03fb"+
		"\u03f9\u0001\u0000\u0000\u0000\u03fb\u03fc\u0001\u0000\u0000\u0000\u03fc"+
		"\u03fe\u0001\u0000\u0000\u0000\u03fd\u03fb\u0001\u0000\u0000\u0000\u03fe"+
		"\u03ff\u00032\u0019\u0000\u03ff\u0400\u0005k\u0000\u0000\u0400\u0401\u0003"+
		"\u0018\f\u0000\u0401\u0402\u0005)\u0000\u0000\u0402\u00bb\u0001\u0000"+
		"\u0000\u0000\u0403\u0405\u0003j5\u0000\u0404\u0403\u0001\u0000\u0000\u0000"+
		"\u0405\u0408\u0001\u0000\u0000\u0000\u0406\u0404\u0001\u0000\u0000\u0000"+
		"\u0406\u0407\u0001\u0000\u0000\u0000\u0407\u0409\u0001\u0000\u0000\u0000"+
		"\u0408\u0406\u0001\u0000\u0000\u0000\u0409\u040a\u00032\u0019\u0000\u040a"+
		"\u040b\u0005v\u0000\u0000\u040b\u040c\u0003\u0088D\u0000\u040c\u00bd\u0001"+
		"\u0000\u0000\u0000\u040d\u0411\u0003\u00aeW\u0000\u040e\u0411\u0003\u00c0"+
		"`\u0000\u040f\u0411\u0005\u008c\u0000\u0000\u0410\u040d\u0001\u0000\u0000"+
		"\u0000\u0410\u040e\u0001\u0000\u0000\u0000\u0410\u040f\u0001\u0000\u0000"+
		"\u0000\u0411\u00bf\u0001\u0000\u0000\u0000\u0412\u0418\u0003\u00c4b\u0000"+
		"\u0413\u0418\u0003\u009aM\u0000\u0414\u0418\u0003\u00ccf\u0000\u0415\u0418"+
		"\u0005j\u0000\u0000\u0416\u0418\u0005\u0081\u0000\u0000\u0417\u0412\u0001"+
		"\u0000\u0000\u0000\u0417\u0413\u0001\u0000\u0000\u0000\u0417\u0414\u0001"+
		"\u0000\u0000\u0000\u0417\u0415\u0001\u0000\u0000\u0000\u0417\u0416\u0001"+
		"\u0000\u0000\u0000\u0418\u00c1\u0001\u0000\u0000\u0000\u0419\u041a\u0003"+
		"\u00c8d\u0000\u041a\u041b\u0003\u0088D\u0000\u041b\u00c3\u0001\u0000\u0000"+
		"\u0000\u041c\u041d\u0007\f\u0000\u0000\u041d\u00c5\u0001\u0000\u0000\u0000"+
		"\u041e\u041f\u0003\u00c4b\u0000\u041f\u0420\u0003\u00c4b\u0000\u0420\u0423"+
		"\u0001\u0000\u0000\u0000\u0421\u0423\u0005\u008c\u0000\u0000\u0422\u041e"+
		"\u0001\u0000\u0000\u0000\u0422\u0421\u0001\u0000\u0000\u0000\u0423\u00c7"+
		"\u0001\u0000\u0000\u0000\u0424\u0425\u0003\u00be_\u0000\u0425\u0426\u0005"+
		"k\u0000\u0000\u0426\u00c9\u0001\u0000\u0000\u0000\u0427\u0428\u0007\r"+
		"\u0000\u0000\u0428\u00cb\u0001\u0000\u0000\u0000\u0429\u042a\u0007\u000e"+
		"\u0000\u0000\u042a\u00cd\u0001\u0000\u0000\u0000i\u00cf\u00d7\u00dd\u00eb"+
		"\u00f0\u00f8\u00fd\u010a\u0114\u0118\u011c\u0121\u0140\u0144\u0159\u0163"+
		"\u016a\u016e\u0175\u0181\u0189\u0192\u0198\u01a0\u01a7\u01af\u01b2\u01b8"+
		"\u01c1\u01c5\u01c7\u01cd\u01d0\u01d5\u01d8\u01e0\u01e5\u01ea\u01f1\u01f9"+
		"\u01fc\u0207\u020c\u0215\u021f\u0228\u022b\u022e\u0237\u023c\u0255\u025a"+
		"\u0264\u026b\u0271\u0277\u028a\u0294\u029a\u02a2\u02a6\u02a9\u02ac\u02b2"+
		"\u02ba\u02c8\u02d9\u02dc\u02e2\u02ec\u02f4\u0309\u030e\u031c\u0329\u033a"+
		"\u0343\u0347\u0353\u035a\u035c\u035e\u0367\u036a\u0370\u0376\u037e\u0385"+
		"\u0393\u039a\u03a4\u03b2\u03bc\u03c4\u03d6\u03e0\u03e4\u03eb\u03f1\u03f6"+
		"\u03fb\u0406\u0410\u0417\u0422";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}