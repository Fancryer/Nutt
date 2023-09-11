// Generated from G:/Nutt/src/main/java\NuttParser.g4 by ANTLR 4.12.0
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
		KW_As=26, KW_Break=27, KW_Both=28, KW_Catch=29, KW_Prototype=30, KW_Continue=31, 
		KW_CommonOf=32, KW_Default=33, KW_Define=34, KW_Demand=35, KW_Deports=36, 
		KW_Do=37, KW_Doif=38, KW_Doifn=39, KW_Done=40, KW_Else=41, KW_End=42, 
		KW_Enum=43, KW_Eval=44, KW_Every=45, KW_Exec=46, KW_Exit=47, KW_Expose=48, 
		KW_False=49, KW_Final=50, KW_For=51, KW_Forget=52, KW_Funct=53, KW_Global=54, 
		KW_If=55, KW_Imports=56, KW_In=57, KW_Infix=58, KW_InstanceOf=59, KW_Is=60, 
		KW_Local=61, KW_Macro=62, KW_Match=63, KW_Matched=64, KW_Module=65, KW_Mut=66, 
		KW_Neither=67, KW_New=68, KW_Nil=69, KW_Not_In=70, KW_Of=71, KW_On=72, 
		KW_Outer=73, KW_Operator=74, KW_Param=75, KW_Postfix=76, KW_Prefix=77, 
		KW_Private=78, KW_Protected=79, KW_Public=80, KW_Record=81, KW_Repeat=82, 
		KW_Requires=83, KW_Return=84, KW_Reverse=85, KW_Then=86, KW_This=87, KW_To=88, 
		KW_Trait=89, KW_True=90, KW_Try=91, KW_Type=92, KW_TypeOf=93, KW_Until=94, 
		KW_Using=95, KW_Val=96, KW_Var=97, KW_Where=98, KW_While=99, KW_With=100, 
		KW_Yield=101, LineComment=102, NAME=103, NATIVE=104, OP_Add=105, OP_And=106, 
		OP_Append=107, OP_Assign=108, OP_Backward=109, OP_Case_Arrow=110, OP_Compose=111, 
		OP_Div=112, OP_Equal=113, OP_Extends=114, OP_Forward=115, OP_Greater=116, 
		OP_IntDiv=117, OP_Implements=118, OP_LambdaReturn=119, OP_Length=120, 
		OP_Less=121, OP_Less_Equal=122, OP_Mod=123, OP_Mult=124, OP_Not=125, OP_Or=126, 
		OP_Pass=127, OP_Placeholder=128, OP_Power=129, OP_Range=130, OP_Reverse=131, 
		OP_Similar=132, OP_SlightlyGreater=133, OP_SlightlyLess=134, OP_Sub=135, 
		OP_Tilda=136, OP_TypeAnnotation=137, OP_Underscore=138, OP_Xor=139, Op_Greater_Equal=140, 
		Op_Not_Equal=141, Op_Not_Similar=142, Op_Custom=143, Question=144, SHEBANG=145, 
		SemiColon=146, UtfEscape=147, WS=148, Normal_string=149;
	public static final int
		RULE_chunk = 0, RULE_module = 1, RULE_module_start = 2, RULE_module_name = 3, 
		RULE_module_require = 4, RULE_named_import = 5, RULE_named_import_list = 6, 
		RULE_module_import = 7, RULE_module_deport = 8, RULE_module_list = 9, 
		RULE_module_group = 10, RULE_module_name_or_group = 11, RULE_absolute_path = 12, 
		RULE_block = 13, RULE_qualified_name = 14, RULE_functiondef = 15, RULE_stat = 16, 
		RULE_macro_decl = 17, RULE_type_param = 18, RULE_template_type = 19, RULE_relation_type = 20, 
		RULE_type_param_list = 21, RULE_trait_def = 22, RULE_prototype_header = 23, 
		RULE_prototype_def = 24, RULE_access_modifier = 25, RULE_prototype_member = 26, 
		RULE_signature_def = 27, RULE_funct_signature = 28, RULE_type_def = 29, 
		RULE_record_def = 30, RULE_record_member = 31, RULE_record_member_list = 32, 
		RULE_using = 33, RULE_overloading_operator_param = 34, RULE_overloading_operator = 35, 
		RULE_operator_decl = 36, RULE_operator_qualifier = 37, RULE_annotation_decl = 38, 
		RULE_group_assignment = 39, RULE_do_done_block = 40, RULE_composed_assign = 41, 
		RULE_if_then_else_block = 42, RULE_then_block = 43, RULE_else_block = 44, 
		RULE_forget = 45, RULE_flat_name_list = 46, RULE_loop = 47, RULE_for_each_loop = 48, 
		RULE_while_do_loop = 49, RULE_repeat_until_loop = 50, RULE_op_direction = 51, 
		RULE_function_return = 52, RULE_function_yield = 53, RULE_try_catch = 54, 
		RULE_demand = 55, RULE_annotation = 56, RULE_var_signature = 57, RULE_var_decl = 58, 
		RULE_constant_qualifier = 59, RULE_type_flat_name = 60, RULE_alias_decl = 61, 
		RULE_type_annotation = 62, RULE_explist = 63, RULE_bracket_access = 64, 
		RULE_dot_access = 65, RULE_exp = 66, RULE_match_to = 67, RULE_array_initializer = 68, 
		RULE_array_element = 69, RULE_set_initializer = 70, RULE_range_array_initializer = 71, 
		RULE_comprehense_array_initializer = 72, RULE_map_element = 73, RULE_map_initializer = 74, 
		RULE_record_element = 75, RULE_record_element_list = 76, RULE_record_initializer = 77, 
		RULE_operator_logical = 78, RULE_default_match_branch = 79, RULE_match_branch = 80, 
		RULE_atom = 81, RULE_nil = 82, RULE_logic = 83, RULE_boolean = 84, RULE_number = 85, 
		RULE_int = 86, RULE_float = 87, RULE_string = 88, RULE_var_signature_list = 89, 
		RULE_vararg_or_signature = 90, RULE_func_output = 91, RULE_local_funct = 92, 
		RULE_funcbody = 93, RULE_lambda_decl = 94, RULE_operator_infix = 95, RULE_default_infix_operator = 96, 
		RULE_operator_composed = 97, RULE_operator_math = 98, RULE_operator_postfix = 99, 
		RULE_composed_assign_op = 100, RULE_operator_prefix = 101, RULE_operator_comparison = 102;
	private static String[] makeRuleNames() {
		return new String[] {
			"chunk", "module", "module_start", "module_name", "module_require", "named_import", 
			"named_import_list", "module_import", "module_deport", "module_list", 
			"module_group", "module_name_or_group", "absolute_path", "block", "qualified_name", 
			"functiondef", "stat", "macro_decl", "type_param", "template_type", "relation_type", 
			"type_param_list", "trait_def", "prototype_header", "prototype_def", 
			"access_modifier", "prototype_member", "signature_def", "funct_signature", 
			"type_def", "record_def", "record_member", "record_member_list", "using", 
			"overloading_operator_param", "overloading_operator", "operator_decl", 
			"operator_qualifier", "annotation_decl", "group_assignment", "do_done_block", 
			"composed_assign", "if_then_else_block", "then_block", "else_block", 
			"forget", "flat_name_list", "loop", "for_each_loop", "while_do_loop", 
			"repeat_until_loop", "op_direction", "function_return", "function_yield", 
			"try_catch", "demand", "annotation", "var_signature", "var_decl", "constant_qualifier", 
			"type_flat_name", "alias_decl", "type_annotation", "explist", "bracket_access", 
			"dot_access", "exp", "match_to", "array_initializer", "array_element", 
			"set_initializer", "range_array_initializer", "comprehense_array_initializer", 
			"map_element", "map_initializer", "record_element", "record_element_list", 
			"record_initializer", "operator_logical", "default_match_branch", "match_branch", 
			"atom", "nil", "logic", "boolean", "number", "int", "float", "string", 
			"var_signature_list", "vararg_or_signature", "func_output", "local_funct", 
			"funcbody", "lambda_decl", "operator_infix", "default_infix_operator", 
			"operator_composed", "operator_math", "operator_postfix", "composed_assign_op", 
			"operator_prefix", "operator_comparison"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@'", "'\\'", "'`'", null, "'['", "']'", "'{'", "'}'", "'('", 
			"')'", null, "':'", "','", null, "'.'", null, null, null, null, null, 
			null, null, "'alias'", null, "'annotation'", "'as'", "'break'", "'both'", 
			"'catch'", "'proto'", "'continue'", "'commonof'", "'default'", "'define'", 
			"'demand'", "'deports'", "'do'", "'doif'", "'doifn'", "'done'", "'else'", 
			"'end'", "'enum'", "'eval'", "'every'", "'exec'", "'exit'", "'expose'", 
			null, "'final'", "'for'", "'forget'", "'funct'", "'global'", "'if'", 
			"'imports'", null, "'infix'", "'instanceof'", "'is'", "'local'", "'macro'", 
			"'match'", "'matched'", "'module'", "'mut'", "'neither'", "'new'", "'nil'", 
			null, "'of'", "'on'", "'outer'", "'operator'", "'param'", "'postfix'", 
			"'prefix'", "'private'", "'protected'", "'public'", "'record'", "'repeat'", 
			"'requires'", "'return'", "'reverse'", "'then'", "'this'", "'to'", "'trait'", 
			null, "'try'", "'type'", "'typeof'", "'until'", "'using'", "'val'", "'var'", 
			"'where'", "'while'", "'with'", "'yield'", null, null, "'$$.'", "'+'", 
			null, "';;'", "'='", null, "'-->'", "'<=='", null, null, "'<:'", null, 
			"'>'", "'//'", "'::'", "'==>'", "'#'", "'<'", null, "'%'", null, null, 
			null, "'...'", "'???'", "'^'", "'..'", "'<|>'", "'=='", "'~>'", "'<~'", 
			"'-'", "'~'", "'->'", "'_'", null, null, null, null, null, "'?'", null, 
			"';'"
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
			"KW_Both", "KW_Catch", "KW_Prototype", "KW_Continue", "KW_CommonOf", 
			"KW_Default", "KW_Define", "KW_Demand", "KW_Deports", "KW_Do", "KW_Doif", 
			"KW_Doifn", "KW_Done", "KW_Else", "KW_End", "KW_Enum", "KW_Eval", "KW_Every", 
			"KW_Exec", "KW_Exit", "KW_Expose", "KW_False", "KW_Final", "KW_For", 
			"KW_Forget", "KW_Funct", "KW_Global", "KW_If", "KW_Imports", "KW_In", 
			"KW_Infix", "KW_InstanceOf", "KW_Is", "KW_Local", "KW_Macro", "KW_Match", 
			"KW_Matched", "KW_Module", "KW_Mut", "KW_Neither", "KW_New", "KW_Nil", 
			"KW_Not_In", "KW_Of", "KW_On", "KW_Outer", "KW_Operator", "KW_Param", 
			"KW_Postfix", "KW_Prefix", "KW_Private", "KW_Protected", "KW_Public", 
			"KW_Record", "KW_Repeat", "KW_Requires", "KW_Return", "KW_Reverse", "KW_Then", 
			"KW_This", "KW_To", "KW_Trait", "KW_True", "KW_Try", "KW_Type", "KW_TypeOf", 
			"KW_Until", "KW_Using", "KW_Val", "KW_Var", "KW_Where", "KW_While", "KW_With", 
			"KW_Yield", "LineComment", "NAME", "NATIVE", "OP_Add", "OP_And", "OP_Append", 
			"OP_Assign", "OP_Backward", "OP_Case_Arrow", "OP_Compose", "OP_Div", 
			"OP_Equal", "OP_Extends", "OP_Forward", "OP_Greater", "OP_IntDiv", "OP_Implements", 
			"OP_LambdaReturn", "OP_Length", "OP_Less", "OP_Less_Equal", "OP_Mod", 
			"OP_Mult", "OP_Not", "OP_Or", "OP_Pass", "OP_Placeholder", "OP_Power", 
			"OP_Range", "OP_Reverse", "OP_Similar", "OP_SlightlyGreater", "OP_SlightlyLess", 
			"OP_Sub", "OP_Tilda", "OP_TypeAnnotation", "OP_Underscore", "OP_Xor", 
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
	public String getGrammarFileName() { return "NuttParser.g4"; }

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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitChunk(this);
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
			if (_la==Char_String || _la==KW_Module || _la==Normal_string) {
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
		public TerminalNode KW_End() { return getToken(NuttParser.KW_End, 0); }
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitModule(this);
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
		public StringContext description;
		public TerminalNode KW_Module() { return getToken(NuttParser.KW_Module, 0); }
		public TerminalNode NAME() { return getToken(NuttParser.NAME, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Module_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitModule_start(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_startContext module_start() throws RecognitionException {
		Module_startContext _localctx = new Module_startContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_module_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Char_String || _la==Normal_string) {
				{
				setState(227);
				((Module_startContext)_localctx).description = string();
				}
			}

			setState(230);
			match(KW_Module);
			setState(231);
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
	public static class Module_nameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(NuttParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(NuttParser.NAME, i);
		}
		public List<TerminalNode> Dot() { return getTokens(NuttParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(NuttParser.Dot, i);
		}
		public TerminalNode KW_As() { return getToken(NuttParser.KW_As, 0); }
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitModule_name(this);
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
			setState(233);
			match(NAME);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(234);
					match(Dot);
					setState(235);
					match(NAME);
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(241);
				match(KW_As);
				setState(242);
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
		public TerminalNode KW_Requires() { return getToken(NuttParser.KW_Requires, 0); }
		public Named_import_listContext named_import_list() {
			return getRuleContext(Named_import_listContext.class,0);
		}
		public Module_requireContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_require; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitModule_require(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_requireContext module_require() throws RecognitionException {
		Module_requireContext _localctx = new Module_requireContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_module_require);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(KW_Requires);
			setState(246);
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
		public TerminalNode KW_As() { return getToken(NuttParser.KW_As, 0); }
		public TerminalNode NAME() { return getToken(NuttParser.NAME, 0); }
		public Named_importContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_import; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitNamed_import(this);
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
			setState(248);
			module_name();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_As) {
				{
				setState(249);
				match(KW_As);
				setState(250);
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
		public TerminalNode Comma() { return getToken(NuttParser.Comma, 0); }
		public Named_import_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_import_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitNamed_import_list(this);
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
			setState(253);
			named_import();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(254);
				match(Comma);
				setState(255);
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
		public TerminalNode KW_Imports() { return getToken(NuttParser.KW_Imports, 0); }
		public Module_listContext module_list() {
			return getRuleContext(Module_listContext.class,0);
		}
		public Module_importContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_import; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitModule_import(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_importContext module_import() throws RecognitionException {
		Module_importContext _localctx = new Module_importContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_module_import);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(KW_Imports);
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
	public static class Module_deportContext extends ParserRuleContext {
		public TerminalNode KW_Deports() { return getToken(NuttParser.KW_Deports, 0); }
		public Module_listContext module_list() {
			return getRuleContext(Module_listContext.class,0);
		}
		public Module_deportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_deport; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitModule_deport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_deportContext module_deport() throws RecognitionException {
		Module_deportContext _localctx = new Module_deportContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_module_deport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(KW_Deports);
			setState(262);
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
		public List<TerminalNode> Comma() { return getTokens(NuttParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(NuttParser.Comma, i);
		}
		public Module_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitModule_list(this);
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
			setState(264);
			module_name_or_group();
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(265);
					match(Comma);
					setState(266);
					module_name_or_group();
					}
					} 
				}
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public TerminalNode Brace_Curly_Left() { return getToken(NuttParser.Brace_Curly_Left, 0); }
		public Module_listContext module_list() {
			return getRuleContext(Module_listContext.class,0);
		}
		public TerminalNode Brace_Curly_Right() { return getToken(NuttParser.Brace_Curly_Right, 0); }
		public TerminalNode Dot() { return getToken(NuttParser.Dot, 0); }
		public TerminalNode KW_All() { return getToken(NuttParser.KW_All, 0); }
		public TerminalNode KW_As() { return getToken(NuttParser.KW_As, 0); }
		public TerminalNode NAME() { return getToken(NuttParser.NAME, 0); }
		public Module_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_group; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitModule_group(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_groupContext module_group() throws RecognitionException {
		Module_groupContext _localctx = new Module_groupContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_module_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			module_name();
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Brace_Curly_Left:
				{
				setState(273);
				match(Brace_Curly_Left);
				setState(274);
				module_list();
				setState(275);
				match(Brace_Curly_Right);
				}
				break;
			case Dot:
				{
				setState(277);
				match(Dot);
				setState(278);
				match(KW_All);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(281);
				match(KW_As);
				setState(282);
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
		public Absolute_pathContext absolute_path() {
			return getRuleContext(Absolute_pathContext.class,0);
		}
		public Module_name_or_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name_or_group; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitModule_name_or_group(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_name_or_groupContext module_name_or_group() throws RecognitionException {
		Module_name_or_groupContext _localctx = new Module_name_or_groupContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_module_name_or_group);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				module_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				module_group();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				absolute_path();
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
	public static class Absolute_pathContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Absolute_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absolute_path; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitAbsolute_path(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Absolute_pathContext absolute_path() throws RecognitionException {
		Absolute_pathContext _localctx = new Absolute_pathContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_absolute_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(292);
					stat();
					}
					} 
				}
				setState(297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		public List<TerminalNode> NAME() { return getTokens(NuttParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(NuttParser.NAME, i);
		}
		public List<TerminalNode> SemiColon() { return getTokens(NuttParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(NuttParser.SemiColon, i);
		}
		public Qualified_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitQualified_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_nameContext qualified_name() throws RecognitionException {
		Qualified_nameContext _localctx = new Qualified_nameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_qualified_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(298);
					match(NAME);
					setState(299);
					match(SemiColon);
					}
					} 
				}
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(305);
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
	public static class FunctiondefContext extends ParserRuleContext {
		public TerminalNode KW_Funct() { return getToken(NuttParser.KW_Funct, 0); }
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitFunctiondef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondefContext functiondef() throws RecognitionException {
		FunctiondefContext _localctx = new FunctiondefContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functiondef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(KW_Funct);
			setState(308);
			qualified_name();
			setState(309);
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
		public TerminalNode KW_Exec() { return getToken(NuttParser.KW_Exec, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exec_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitExec_stat(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitAnnotation_decl_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Functioncall_statContext extends StatContext {
		public ExpContext name;
		public ExplistContext arguments;
		public TerminalNode Brace_Paren_Left() { return getToken(NuttParser.Brace_Paren_Left, 0); }
		public TerminalNode Brace_Paren_Right() { return getToken(NuttParser.Brace_Paren_Right, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public Functioncall_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitFunctioncall_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Exit_statContext extends StatContext {
		public TerminalNode KW_Exit() { return getToken(NuttParser.KW_Exit, 0); }
		public Exit_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitExit_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Prototype_def_statContext extends StatContext {
		public Prototype_defContext prototype_def() {
			return getRuleContext(Prototype_defContext.class,0);
		}
		public Prototype_def_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitPrototype_def_stat(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitFunctiondef_stat(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitYield_stat(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitDemandStat(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitVar_decl_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Do_if_statContext extends StatContext {
		public TerminalNode KW_Doif() { return getToken(NuttParser.KW_Doif, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public Do_if_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitDo_if_stat(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitOperator_decl_stat(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitModule_import_stat(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitModule_deport_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Pass_statContext extends StatContext {
		public TerminalNode OP_Pass() { return getToken(NuttParser.OP_Pass, 0); }
		public Pass_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitPass_stat(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitTry_catch_stat(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitComposed_assign_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Do_if_not_statContext extends StatContext {
		public TerminalNode KW_Doifn() { return getToken(NuttParser.KW_Doifn, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public Do_if_not_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitDo_if_not_stat(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitRecord_def_stat(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitForget_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Break_statContext extends StatContext {
		public TerminalNode KW_Break() { return getToken(NuttParser.KW_Break, 0); }
		public Break_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitBreak_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Macro_decl_statContext extends StatContext {
		public Macro_declContext macro_decl() {
			return getRuleContext(Macro_declContext.class,0);
		}
		public Macro_decl_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitMacro_decl_stat(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitReturn_stat(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitLoop_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Macro_call_statContext extends StatContext {
		public ExplistContext arguments;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode OP_Tilda() { return getToken(NuttParser.OP_Tilda, 0); }
		public TerminalNode Brace_Paren_Left() { return getToken(NuttParser.Brace_Paren_Left, 0); }
		public TerminalNode Brace_Paren_Right() { return getToken(NuttParser.Brace_Paren_Right, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public Macro_call_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitMacro_call_stat(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitIf_then_else_block_stat(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitGroup_assignment_stat(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitTrait_def_stat(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitMatch_to_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Continue_statContext extends StatContext {
		public TerminalNode KW_Continue() { return getToken(NuttParser.KW_Continue, 0); }
		public Continue_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitContinue_stat(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitDo_done_block_stat(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitType_def_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_stat);
		int _la;
		try {
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new DemandStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				demand();
				}
				break;
			case 2:
				_localctx = new Do_if_statContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(KW_Doif);
				setState(313);
				exp(0);
				setState(314);
				stat();
				}
				break;
			case 3:
				_localctx = new Do_if_not_statContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				match(KW_Doifn);
				setState(317);
				exp(0);
				setState(318);
				stat();
				}
				break;
			case 4:
				_localctx = new Exec_statContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(320);
				match(KW_Exec);
				setState(321);
				exp(0);
				}
				break;
			case 5:
				_localctx = new Module_import_statContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(322);
				module_import();
				}
				break;
			case 6:
				_localctx = new Module_deport_statContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(323);
				module_deport();
				}
				break;
			case 7:
				_localctx = new Group_assignment_statContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(324);
				group_assignment();
				}
				break;
			case 8:
				_localctx = new Var_decl_statContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(325);
				var_decl();
				}
				break;
			case 9:
				_localctx = new Macro_decl_statContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(326);
				macro_decl();
				}
				break;
			case 10:
				_localctx = new Operator_decl_statContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(327);
				operator_decl();
				}
				break;
			case 11:
				_localctx = new Annotation_decl_statContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(328);
				annotation_decl();
				}
				break;
			case 12:
				_localctx = new Forget_statContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(329);
				forget();
				}
				break;
			case 13:
				_localctx = new Functiondef_statContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(330);
				functiondef();
				}
				break;
			case 14:
				_localctx = new Functioncall_statContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(331);
				((Functioncall_statContext)_localctx).name = exp(0);
				setState(332);
				match(Brace_Paren_Left);
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9213713784706426206L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1454663160753553415L) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & 266257L) != 0)) {
					{
					setState(333);
					((Functioncall_statContext)_localctx).arguments = explist();
					}
				}

				setState(336);
				match(Brace_Paren_Right);
				}
				break;
			case 15:
				_localctx = new Do_done_block_statContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(338);
				do_done_block();
				}
				break;
			case 16:
				_localctx = new Loop_statContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(339);
				loop();
				}
				break;
			case 17:
				_localctx = new Composed_assign_statContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(340);
				composed_assign();
				}
				break;
			case 18:
				_localctx = new If_then_else_block_statContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(341);
				if_then_else_block();
				}
				break;
			case 19:
				_localctx = new Try_catch_statContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(342);
				try_catch();
				}
				break;
			case 20:
				_localctx = new Pass_statContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(343);
				match(OP_Pass);
				}
				break;
			case 21:
				_localctx = new Type_def_statContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(344);
				type_def();
				}
				break;
			case 22:
				_localctx = new Trait_def_statContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(345);
				trait_def();
				}
				break;
			case 23:
				_localctx = new Prototype_def_statContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(346);
				prototype_def();
				}
				break;
			case 24:
				_localctx = new Macro_call_statContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(347);
				exp(0);
				setState(348);
				match(OP_Tilda);
				setState(355);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(349);
					exp(0);
					}
					break;
				case 2:
					{
					setState(350);
					match(Brace_Paren_Left);
					setState(352);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9213713784706426206L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1454663160753553415L) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & 266257L) != 0)) {
						{
						setState(351);
						((Macro_call_statContext)_localctx).arguments = explist();
						}
					}

					setState(354);
					match(Brace_Paren_Right);
					}
					break;
				}
				}
				break;
			case 25:
				_localctx = new Record_def_statContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(357);
				record_def();
				}
				break;
			case 26:
				_localctx = new Exit_statContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(358);
				match(KW_Exit);
				}
				break;
			case 27:
				_localctx = new Return_statContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(359);
				function_return();
				}
				break;
			case 28:
				_localctx = new Yield_statContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(360);
				function_yield();
				}
				break;
			case 29:
				_localctx = new Break_statContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(361);
				match(KW_Break);
				}
				break;
			case 30:
				_localctx = new Continue_statContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(362);
				match(KW_Continue);
				}
				break;
			case 31:
				_localctx = new Match_to_statContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(363);
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
	public static class Macro_declContext extends ParserRuleContext {
		public TerminalNode KW_Macro() { return getToken(NuttParser.KW_Macro, 0); }
		public TerminalNode NAME() { return getToken(NuttParser.NAME, 0); }
		public Funct_signatureContext funct_signature() {
			return getRuleContext(Funct_signatureContext.class,0);
		}
		public TerminalNode OP_Assign() { return getToken(NuttParser.OP_Assign, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode KW_End() { return getToken(NuttParser.KW_End, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public Macro_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitMacro_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Macro_declContext macro_decl() throws RecognitionException {
		Macro_declContext _localctx = new Macro_declContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_macro_decl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(KW_Macro);
			setState(367);
			match(NAME);
			setState(368);
			funct_signature();
			setState(369);
			match(OP_Assign);
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(370);
						stat();
						}
						} 
					}
					setState(375);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(376);
				exp(0);
				setState(377);
				match(KW_End);
				}
				break;
			case 2:
				{
				setState(379);
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
	public static class Type_paramContext extends ParserRuleContext {
		public Type_paramContext sum_type;
		public Type_flat_nameContext flat_type;
		public Type_flat_nameContext type_flat_name() {
			return getRuleContext(Type_flat_nameContext.class,0);
		}
		public TerminalNode Brace_Paren_Left() { return getToken(NuttParser.Brace_Paren_Left, 0); }
		public List<Type_paramContext> type_param() {
			return getRuleContexts(Type_paramContext.class);
		}
		public Type_paramContext type_param(int i) {
			return getRuleContext(Type_paramContext.class,i);
		}
		public TerminalNode Brace_Paren_Right() { return getToken(NuttParser.Brace_Paren_Right, 0); }
		public Template_typeContext template_type() {
			return getRuleContext(Template_typeContext.class,0);
		}
		public Relation_typeContext relation_type() {
			return getRuleContext(Relation_typeContext.class,0);
		}
		public List<TerminalNode> OP_Add() { return getTokens(NuttParser.OP_Add); }
		public TerminalNode OP_Add(int i) {
			return getToken(NuttParser.OP_Add, i);
		}
		public Type_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitType_param(this);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_type_param, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(383);
				((Type_paramContext)_localctx).flat_type = type_flat_name();
				}
				break;
			case 2:
				{
				setState(384);
				match(Brace_Paren_Left);
				setState(385);
				type_param(0);
				setState(386);
				match(Brace_Paren_Right);
				}
				break;
			case 3:
				{
				setState(388);
				template_type();
				}
				break;
			case 4:
				{
				setState(389);
				relation_type();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(401);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Type_paramContext(_parentctx, _parentState);
					_localctx.sum_type = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_type_param);
					setState(392);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(395); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(393);
							match(OP_Add);
							setState(394);
							((Type_paramContext)_localctx).sum_type = type_param(0);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(397); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(403);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Template_typeContext extends ParserRuleContext {
		public Type_flat_nameContext name;
		public TerminalNode Brace_Square_Left() { return getToken(NuttParser.Brace_Square_Left, 0); }
		public Type_param_listContext type_param_list() {
			return getRuleContext(Type_param_listContext.class,0);
		}
		public TerminalNode Brace_Square_Right() { return getToken(NuttParser.Brace_Square_Right, 0); }
		public Type_flat_nameContext type_flat_name() {
			return getRuleContext(Type_flat_nameContext.class,0);
		}
		public Template_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitTemplate_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_typeContext template_type() throws RecognitionException {
		Template_typeContext _localctx = new Template_typeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_template_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			((Template_typeContext)_localctx).name = type_flat_name();
			setState(405);
			match(Brace_Square_Left);
			setState(406);
			type_param_list();
			setState(407);
			match(Brace_Square_Right);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public Type_flat_nameContext name;
		public Type_flat_nameContext type_flat_name() {
			return getRuleContext(Type_flat_nameContext.class,0);
		}
		public TerminalNode OP_Extends() { return getToken(NuttParser.OP_Extends, 0); }
		public List<Type_paramContext> type_param() {
			return getRuleContexts(Type_paramContext.class);
		}
		public Type_paramContext type_param(int i) {
			return getRuleContext(Type_paramContext.class,i);
		}
		public TerminalNode OP_Implements() { return getToken(NuttParser.OP_Implements, 0); }
		public Relation_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitRelation_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relation_typeContext relation_type() throws RecognitionException {
		Relation_typeContext _localctx = new Relation_typeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_relation_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			((Relation_typeContext)_localctx).name = type_flat_name();
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(410);
				match(OP_Extends);
				setState(411);
				type_param(0);
				setState(412);
				match(OP_Implements);
				setState(413);
				type_param(0);
				}
				break;
			case 2:
				{
				setState(415);
				match(OP_Extends);
				setState(416);
				type_param(0);
				}
				break;
			case 3:
				{
				setState(417);
				match(OP_Implements);
				setState(418);
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
		public List<Type_paramContext> type_param() {
			return getRuleContexts(Type_paramContext.class);
		}
		public Type_paramContext type_param(int i) {
			return getRuleContext(Type_paramContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(NuttParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(NuttParser.Comma, i);
		}
		public Type_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_param_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitType_param_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_param_listContext type_param_list() throws RecognitionException {
		Type_param_listContext _localctx = new Type_param_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_type_param_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			type_param(0);
			setState(426);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(422);
					match(Comma);
					setState(423);
					type_param(0);
					}
					} 
				}
				setState(428);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
	public static class Trait_defContext extends ParserRuleContext {
		public Type_flat_nameContext parent_trait;
		public TerminalNode KW_Trait() { return getToken(NuttParser.KW_Trait, 0); }
		public List<Type_flat_nameContext> type_flat_name() {
			return getRuleContexts(Type_flat_nameContext.class);
		}
		public Type_flat_nameContext type_flat_name(int i) {
			return getRuleContext(Type_flat_nameContext.class,i);
		}
		public TerminalNode Brace_Curly_Left() { return getToken(NuttParser.Brace_Curly_Left, 0); }
		public TerminalNode Brace_Curly_Right() { return getToken(NuttParser.Brace_Curly_Right, 0); }
		public TerminalNode OP_Extends() { return getToken(NuttParser.OP_Extends, 0); }
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitTrait_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trait_defContext trait_def() throws RecognitionException {
		Trait_defContext _localctx = new Trait_defContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_trait_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(KW_Trait);
			setState(430);
			type_flat_name();
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Extends) {
				{
				setState(431);
				match(OP_Extends);
				setState(432);
				((Trait_defContext)_localctx).parent_trait = type_flat_name();
				}
			}

			setState(435);
			match(Brace_Curly_Left);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(436);
				signature_def();
				}
				}
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(442);
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
	public static class Prototype_headerContext extends ParserRuleContext {
		public Type_flat_nameContext prototype_name;
		public Type_flat_nameContext parent_prototype;
		public Type_paramContext trait;
		public TerminalNode KW_Prototype() { return getToken(NuttParser.KW_Prototype, 0); }
		public List<Type_flat_nameContext> type_flat_name() {
			return getRuleContexts(Type_flat_nameContext.class);
		}
		public Type_flat_nameContext type_flat_name(int i) {
			return getRuleContext(Type_flat_nameContext.class,i);
		}
		public TerminalNode OP_Extends() { return getToken(NuttParser.OP_Extends, 0); }
		public TerminalNode OP_Implements() { return getToken(NuttParser.OP_Implements, 0); }
		public List<Type_paramContext> type_param() {
			return getRuleContexts(Type_paramContext.class);
		}
		public Type_paramContext type_param(int i) {
			return getRuleContext(Type_paramContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(NuttParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(NuttParser.Comma, i);
		}
		public Prototype_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prototype_header; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitPrototype_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prototype_headerContext prototype_header() throws RecognitionException {
		Prototype_headerContext _localctx = new Prototype_headerContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_prototype_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(KW_Prototype);
			setState(445);
			((Prototype_headerContext)_localctx).prototype_name = type_flat_name();
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Extends) {
				{
				setState(446);
				match(OP_Extends);
				setState(447);
				((Prototype_headerContext)_localctx).parent_prototype = type_flat_name();
				}
			}

			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Implements) {
				{
				setState(450);
				match(OP_Implements);
				setState(451);
				((Prototype_headerContext)_localctx).trait = type_param(0);
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(452);
					match(Comma);
					setState(453);
					((Prototype_headerContext)_localctx).trait = type_param(0);
					}
					}
					setState(458);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class Prototype_defContext extends ParserRuleContext {
		public Prototype_headerContext prototype_header() {
			return getRuleContext(Prototype_headerContext.class,0);
		}
		public TerminalNode Brace_Curly_Left() { return getToken(NuttParser.Brace_Curly_Left, 0); }
		public TerminalNode Brace_Curly_Right() { return getToken(NuttParser.Brace_Curly_Right, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<Prototype_memberContext> prototype_member() {
			return getRuleContexts(Prototype_memberContext.class);
		}
		public Prototype_memberContext prototype_member(int i) {
			return getRuleContext(Prototype_memberContext.class,i);
		}
		public Prototype_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prototype_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitPrototype_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prototype_defContext prototype_def() throws RecognitionException {
		Prototype_defContext _localctx = new Prototype_defContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_prototype_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AtSign) {
				{
				{
				setState(461);
				annotation();
				}
				}
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(467);
			prototype_header();
			setState(468);
			match(Brace_Curly_Left);
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & -7462438194011168735L) != 0) || ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & 130339833L) != 0)) {
				{
				{
				setState(469);
				prototype_member();
				}
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(475);
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
		public TerminalNode KW_Public() { return getToken(NuttParser.KW_Public, 0); }
		public TerminalNode KW_Protected() { return getToken(NuttParser.KW_Protected, 0); }
		public TerminalNode KW_Private() { return getToken(NuttParser.KW_Private, 0); }
		public Access_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_modifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitAccess_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_modifierContext access_modifier() throws RecognitionException {
		Access_modifierContext _localctx = new Access_modifierContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_access_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			_la = _input.LA(1);
			if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 7L) != 0)) ) {
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
	public static class Prototype_memberContext extends ParserRuleContext {
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
		public Prototype_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prototype_member; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitPrototype_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prototype_memberContext prototype_member() throws RecognitionException {
		Prototype_memberContext _localctx = new Prototype_memberContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_prototype_member);
		int _la;
		try {
			setState(487);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_Infix:
			case KW_On:
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
				setState(479);
				operator_decl();
				}
				break;
			case KW_Funct:
			case KW_Mut:
			case KW_Private:
			case KW_Protected:
			case KW_Public:
			case KW_Val:
			case KW_Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 7L) != 0)) {
					{
					setState(480);
					access_modifier();
					}
				}

				setState(485);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_Funct:
					{
					setState(483);
					functiondef();
					}
					break;
				case KW_Mut:
				case KW_Val:
				case KW_Var:
					{
					setState(484);
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
		public TerminalNode NAME() { return getToken(NuttParser.NAME, 0); }
		public Funct_signatureContext funct_signature() {
			return getRuleContext(Funct_signatureContext.class,0);
		}
		public Signature_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitSignature_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signature_defContext signature_def() throws RecognitionException {
		Signature_defContext _localctx = new Signature_defContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_signature_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(NAME);
			setState(490);
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
		public UsingContext using() {
			return getRuleContext(UsingContext.class,0);
		}
		public TerminalNode Brace_Paren_Left() { return getToken(NuttParser.Brace_Paren_Left, 0); }
		public TerminalNode Brace_Paren_Right() { return getToken(NuttParser.Brace_Paren_Right, 0); }
		public Var_signature_listContext var_signature_list() {
			return getRuleContext(Var_signature_listContext.class,0);
		}
		public Funct_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funct_signature; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitFunct_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funct_signatureContext funct_signature() throws RecognitionException {
		Funct_signatureContext _localctx = new Funct_signatureContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_funct_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Brace_Curly_Left) {
				{
				setState(492);
				using();
				}
			}

			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Brace_Paren_Left) {
				{
				setState(495);
				match(Brace_Paren_Left);
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME || _la==OP_Pass) {
					{
					setState(496);
					var_signature_list();
					}
				}

				setState(499);
				match(Brace_Paren_Right);
				}
			}

			setState(502);
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
		public TerminalNode KW_Type() { return getToken(NuttParser.KW_Type, 0); }
		public List<Type_paramContext> type_param() {
			return getRuleContexts(Type_paramContext.class);
		}
		public Type_paramContext type_param(int i) {
			return getRuleContext(Type_paramContext.class,i);
		}
		public TerminalNode OP_Assign() { return getToken(NuttParser.OP_Assign, 0); }
		public TerminalNode OP_Extends() { return getToken(NuttParser.OP_Extends, 0); }
		public Type_param_listContext type_param_list() {
			return getRuleContext(Type_param_listContext.class,0);
		}
		public Type_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitType_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_defContext type_def() throws RecognitionException {
		Type_defContext _localctx = new Type_defContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_type_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(KW_Type);
			setState(505);
			((Type_defContext)_localctx).derived_type = type_param(0);
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Extends) {
				{
				setState(506);
				match(OP_Extends);
				setState(507);
				((Type_defContext)_localctx).parent_type = type_param(0);
				}
			}

			setState(513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Brace_Paren_Left:
			case NAME:
				{
				setState(510);
				((Type_defContext)_localctx).children = type_param_list();
				}
				break;
			case OP_Assign:
				{
				setState(511);
				match(OP_Assign);
				setState(512);
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
		public Qualified_nameContext parent_record;
		public Qualified_nameContext trait;
		public TerminalNode KW_Record() { return getToken(NuttParser.KW_Record, 0); }
		public TerminalNode Brace_Curly_Left() { return getToken(NuttParser.Brace_Curly_Left, 0); }
		public Record_member_listContext record_member_list() {
			return getRuleContext(Record_member_listContext.class,0);
		}
		public TerminalNode Brace_Curly_Right() { return getToken(NuttParser.Brace_Curly_Right, 0); }
		public TerminalNode NAME() { return getToken(NuttParser.NAME, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode OP_Extends() { return getToken(NuttParser.OP_Extends, 0); }
		public TerminalNode OP_Implements() { return getToken(NuttParser.OP_Implements, 0); }
		public List<Qualified_nameContext> qualified_name() {
			return getRuleContexts(Qualified_nameContext.class);
		}
		public Qualified_nameContext qualified_name(int i) {
			return getRuleContext(Qualified_nameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(NuttParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(NuttParser.Comma, i);
		}
		public Record_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitRecord_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Record_defContext record_def() throws RecognitionException {
		Record_defContext _localctx = new Record_defContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_record_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AtSign) {
				{
				{
				setState(515);
				annotation();
				}
				}
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(521);
			match(KW_Record);
			setState(522);
			((Record_defContext)_localctx).record_name = match(NAME);
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Extends) {
				{
				setState(523);
				match(OP_Extends);
				setState(524);
				((Record_defContext)_localctx).parent_record = qualified_name();
				}
			}

			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Implements) {
				{
				setState(527);
				match(OP_Implements);
				setState(528);
				((Record_defContext)_localctx).trait = qualified_name();
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(529);
					match(Comma);
					setState(530);
					((Record_defContext)_localctx).trait = qualified_name();
					}
					}
					setState(535);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(538);
			match(Brace_Curly_Left);
			setState(539);
			record_member_list();
			setState(540);
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
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitRecord_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Record_memberContext record_member() throws RecognitionException {
		Record_memberContext _localctx = new Record_memberContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_record_member);
		try {
			setState(547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Char_String:
			case Normal_string:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(542);
				string();
				setState(543);
				type_annotation();
				}
				}
				break;
			case KW_Infix:
			case KW_On:
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
				setState(545);
				operator_decl();
				}
				break;
			case KW_Funct:
				enterOuterAlt(_localctx, 3);
				{
				setState(546);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitRecord_member_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Record_member_listContext record_member_list() throws RecognitionException {
		Record_member_listContext _localctx = new Record_member_listContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_record_member_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 297237575406454784L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & -7314071134603837387L) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & 1055L) != 0)) {
				{
				{
				setState(549);
				record_member();
				}
				}
				setState(554);
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
		public TerminalNode Brace_Curly_Left() { return getToken(NuttParser.Brace_Curly_Left, 0); }
		public List<Overloading_operator_paramContext> overloading_operator_param() {
			return getRuleContexts(Overloading_operator_paramContext.class);
		}
		public Overloading_operator_paramContext overloading_operator_param(int i) {
			return getRuleContext(Overloading_operator_paramContext.class,i);
		}
		public TerminalNode Brace_Curly_Right() { return getToken(NuttParser.Brace_Curly_Right, 0); }
		public List<TerminalNode> Comma() { return getTokens(NuttParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(NuttParser.Comma, i);
		}
		public UsingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitUsing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingContext using() throws RecognitionException {
		UsingContext _localctx = new UsingContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_using);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(Brace_Curly_Left);
			setState(556);
			overloading_operator_param();
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(557);
				match(Comma);
				setState(558);
				overloading_operator_param();
				}
				}
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(564);
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
		public TerminalNode KW_As() { return getToken(NuttParser.KW_As, 0); }
		public TerminalNode NAME() { return getToken(NuttParser.NAME, 0); }
		public List<TerminalNode> Comma() { return getTokens(NuttParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(NuttParser.Comma, i);
		}
		public Overloading_operator_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overloading_operator_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitOverloading_operator_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Overloading_operator_paramContext overloading_operator_param() throws RecognitionException {
		Overloading_operator_paramContext _localctx = new Overloading_operator_paramContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_overloading_operator_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			overloading_operator();
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(567);
				match(Comma);
				setState(568);
				overloading_operator();
				}
				}
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(574);
			match(KW_As);
			setState(575);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitOverloading_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Overloading_operatorContext overloading_operator() throws RecognitionException {
		Overloading_operatorContext _localctx = new Overloading_operatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_overloading_operator);
		try {
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				operator_infix();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				operator_prefix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(579);
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
		public Type_paramContext type;
		public Overloading_operatorContext overloading_operator() {
			return getRuleContext(Overloading_operatorContext.class,0);
		}
		public Local_functContext local_funct() {
			return getRuleContext(Local_functContext.class,0);
		}
		public Operator_qualifierContext operator_qualifier() {
			return getRuleContext(Operator_qualifierContext.class,0);
		}
		public TerminalNode KW_Operator() { return getToken(NuttParser.KW_Operator, 0); }
		public TerminalNode KW_On() { return getToken(NuttParser.KW_On, 0); }
		public Type_paramContext type_param() {
			return getRuleContext(Type_paramContext.class,0);
		}
		public Operator_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitOperator_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_declContext operator_decl() throws RecognitionException {
		Operator_declContext _localctx = new Operator_declContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_operator_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 786433L) != 0)) {
				{
				setState(582);
				operator_qualifier();
				}
			}

			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_Operator) {
				{
				setState(585);
				match(KW_Operator);
				}
			}

			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_On) {
				{
				setState(588);
				match(KW_On);
				setState(589);
				((Operator_declContext)_localctx).type = type_param(0);
				}
			}

			setState(592);
			overloading_operator();
			setState(593);
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
	public static class Operator_qualifierContext extends ParserRuleContext {
		public TerminalNode KW_Prefix() { return getToken(NuttParser.KW_Prefix, 0); }
		public TerminalNode KW_Infix() { return getToken(NuttParser.KW_Infix, 0); }
		public TerminalNode KW_Postfix() { return getToken(NuttParser.KW_Postfix, 0); }
		public Operator_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_qualifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitOperator_qualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_qualifierContext operator_qualifier() throws RecognitionException {
		Operator_qualifierContext _localctx = new Operator_qualifierContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_operator_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			_la = _input.LA(1);
			if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 786433L) != 0)) ) {
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
	public static class Annotation_declContext extends ParserRuleContext {
		public TerminalNode KW_Annotation() { return getToken(NuttParser.KW_Annotation, 0); }
		public TerminalNode NAME() { return getToken(NuttParser.NAME, 0); }
		public TerminalNode Brace_Curly_Left() { return getToken(NuttParser.Brace_Curly_Left, 0); }
		public TerminalNode KW_Return() { return getToken(NuttParser.KW_Return, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Brace_Curly_Right() { return getToken(NuttParser.Brace_Curly_Right, 0); }
		public List<Vararg_or_signatureContext> vararg_or_signature() {
			return getRuleContexts(Vararg_or_signatureContext.class);
		}
		public Vararg_or_signatureContext vararg_or_signature(int i) {
			return getRuleContext(Vararg_or_signatureContext.class,i);
		}
		public List<TerminalNode> KW_Param() { return getTokens(NuttParser.KW_Param); }
		public TerminalNode KW_Param(int i) {
			return getToken(NuttParser.KW_Param, i);
		}
		public Annotation_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitAnnotation_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Annotation_declContext annotation_decl() throws RecognitionException {
		Annotation_declContext _localctx = new Annotation_declContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_annotation_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(KW_Annotation);
			setState(598);
			match(NAME);
			setState(599);
			match(Brace_Curly_Left);
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 4503599895805953L) != 0)) {
				{
				{
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_Param) {
					{
					setState(600);
					match(KW_Param);
					}
				}

				setState(603);
				vararg_or_signature();
				}
				}
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(609);
			match(KW_Return);
			setState(610);
			exp(0);
			setState(611);
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
		public TerminalNode OP_Assign() { return getToken(NuttParser.OP_Assign, 0); }
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitGroup_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_assignmentContext group_assignment() throws RecognitionException {
		Group_assignmentContext _localctx = new Group_assignmentContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_group_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			((Group_assignmentContext)_localctx).variables = explist();
			setState(614);
			match(OP_Assign);
			setState(615);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitDo_done_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_done_blockContext do_done_block() throws RecognitionException {
		Do_done_blockContext _localctx = new Do_done_blockContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_do_done_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(KW_Do);
			setState(618);
			block();
			setState(619);
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Operator_composedContext operator_composed() {
			return getRuleContext(Operator_composedContext.class,0);
		}
		public Composed_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_composed_assign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitComposed_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Composed_assignContext composed_assign() throws RecognitionException {
		Composed_assignContext _localctx = new Composed_assignContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_composed_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			exp(0);
			setState(622);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitIf_then_else_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_then_else_blockContext if_then_else_block() throws RecognitionException {
		If_then_else_blockContext _localctx = new If_then_else_blockContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_if_then_else_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(KW_If);
			setState(625);
			exp(0);
			setState(626);
			then_block();
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_Else) {
				{
				setState(627);
				else_block();
				}
			}

			setState(630);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitThen_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Then_blockContext then_block() throws RecognitionException {
		Then_blockContext _localctx = new Then_blockContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_then_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_Then) {
				{
				setState(632);
				match(KW_Then);
				}
			}

			setState(635);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitElse_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(KW_Else);
			setState(638);
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
		public TerminalNode KW_All() { return getToken(NuttParser.KW_All, 0); }
		public Flat_name_listContext flat_name_list() {
			return getRuleContext(Flat_name_listContext.class,0);
		}
		public ForgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forget; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitForget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForgetContext forget() throws RecognitionException {
		ForgetContext _localctx = new ForgetContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_forget);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(KW_Forget);
			setState(643);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_All:
				{
				setState(641);
				match(KW_All);
				}
				break;
			case NAME:
				{
				setState(642);
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
		public List<TerminalNode> Comma() { return getTokens(NuttParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(NuttParser.Comma, i);
		}
		public Flat_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flat_name_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitFlat_name_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flat_name_listContext flat_name_list() throws RecognitionException {
		Flat_name_listContext _localctx = new Flat_name_listContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_flat_name_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(NAME);
			setState(650);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(646);
					match(Comma);
					setState(647);
					match(NAME);
					}
					} 
				}
				setState(652);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_loop);
		try {
			setState(656);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_For:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				for_each_loop();
				}
				break;
			case KW_While:
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
				while_do_loop();
				}
				break;
			case KW_Repeat:
				enterOuterAlt(_localctx, 3);
				{
				setState(655);
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
		public TerminalNode KW_For() { return getToken(NuttParser.KW_For, 0); }
		public Op_directionContext op_direction() {
			return getRuleContext(Op_directionContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public List<TerminalNode> OP_Underscore() { return getTokens(NuttParser.OP_Underscore); }
		public TerminalNode OP_Underscore(int i) {
			return getToken(NuttParser.OP_Underscore, i);
		}
		public List<TerminalNode> NAME() { return getTokens(NuttParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(NuttParser.NAME, i);
		}
		public TerminalNode Comma() { return getToken(NuttParser.Comma, 0); }
		public For_each_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_each_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitFor_each_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_each_loopContext for_each_loop() throws RecognitionException {
		For_each_loopContext _localctx = new For_each_loopContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_for_each_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(KW_For);
			setState(659);
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
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(660);
				match(Comma);
				setState(661);
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

			setState(664);
			op_direction();
			setState(665);
			exp(0);
			setState(666);
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
	public static class While_do_loopContext extends ParserRuleContext {
		public TerminalNode KW_While() { return getToken(NuttParser.KW_While, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitWhile_do_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_do_loopContext while_do_loop() throws RecognitionException {
		While_do_loopContext _localctx = new While_do_loopContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_while_do_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(KW_While);
			setState(669);
			exp(0);
			setState(670);
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
		public TerminalNode KW_Repeat() { return getToken(NuttParser.KW_Repeat, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode KW_Until() { return getToken(NuttParser.KW_Until, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Repeat_until_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_until_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitRepeat_until_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repeat_until_loopContext repeat_until_loop() throws RecognitionException {
		Repeat_until_loopContext _localctx = new Repeat_until_loopContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_repeat_until_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			match(KW_Repeat);
			setState(673);
			stat();
			setState(674);
			match(KW_Until);
			setState(675);
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
	public static class Op_directionContext extends ParserRuleContext {
		public TerminalNode OP_Forward() { return getToken(NuttParser.OP_Forward, 0); }
		public TerminalNode OP_Backward() { return getToken(NuttParser.OP_Backward, 0); }
		public Op_directionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_direction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitOp_direction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_directionContext op_direction() throws RecognitionException {
		Op_directionContext _localctx = new Op_directionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_op_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
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
	public static class Function_returnContext extends ParserRuleContext {
		public TerminalNode KW_Return() { return getToken(NuttParser.KW_Return, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Function_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_return; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitFunction_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_returnContext function_return() throws RecognitionException {
		Function_returnContext _localctx = new Function_returnContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_function_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(KW_Return);
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(680);
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
		public TerminalNode KW_Yield() { return getToken(NuttParser.KW_Yield, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public Function_yieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_yield; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitFunction_yield(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_yieldContext function_yield() throws RecognitionException {
		Function_yieldContext _localctx = new Function_yieldContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_function_yield);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(KW_Yield);
			setState(684);
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
		public TerminalNode KW_Try() { return getToken(NuttParser.KW_Try, 0); }
		public TerminalNode KW_Catch() { return getToken(NuttParser.KW_Catch, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode KW_End() { return getToken(NuttParser.KW_End, 0); }
		public Try_catchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_catch; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitTry_catch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_catchContext try_catch() throws RecognitionException {
		Try_catchContext _localctx = new Try_catchContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_try_catch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(KW_Try);
			setState(687);
			((Try_catchContext)_localctx).try_branch = stat();
			setState(688);
			match(KW_Catch);
			setState(689);
			((Try_catchContext)_localctx).catch_branch = stat();
			setState(691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(690);
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
		public TerminalNode KW_Demand() { return getToken(NuttParser.KW_Demand, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode KW_With() { return getToken(NuttParser.KW_With, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public DemandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_demand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitDemand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DemandContext demand() throws RecognitionException {
		DemandContext _localctx = new DemandContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_demand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(KW_Demand);
			setState(694);
			exp(0);
			setState(697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(695);
				match(KW_With);
				setState(696);
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
		public TerminalNode AtSign() { return getToken(NuttParser.AtSign, 0); }
		public TerminalNode NAME() { return getToken(NuttParser.NAME, 0); }
		public TerminalNode Brace_Paren_Left() { return getToken(NuttParser.Brace_Paren_Left, 0); }
		public Record_element_listContext record_element_list() {
			return getRuleContext(Record_element_listContext.class,0);
		}
		public TerminalNode Brace_Paren_Right() { return getToken(NuttParser.Brace_Paren_Right, 0); }
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			match(AtSign);
			setState(700);
			match(NAME);
			setState(705);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(701);
				match(Brace_Paren_Left);
				setState(702);
				record_element_list();
				setState(703);
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
		public Type_annotationContext type;
		public ExpContext value;
		public TerminalNode NAME() { return getToken(NuttParser.NAME, 0); }
		public TerminalNode OP_Assign() { return getToken(NuttParser.OP_Assign, 0); }
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Var_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_signature; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitVar_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_signatureContext var_signature() throws RecognitionException {
		Var_signatureContext _localctx = new Var_signatureContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_var_signature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(NAME);
			setState(709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(708);
				((Var_signatureContext)_localctx).type = type_annotation();
				}
				break;
			}
			setState(713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(711);
				match(OP_Assign);
				setState(712);
				((Var_signatureContext)_localctx).value = exp(0);
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
		public List<Var_signatureContext> var_signature() {
			return getRuleContexts(Var_signatureContext.class);
		}
		public Var_signatureContext var_signature(int i) {
			return getRuleContext(Var_signatureContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(NuttParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(NuttParser.Comma, i);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_var_decl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			constant_qualifier();
			setState(716);
			var_signature();
			setState(721);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(717);
					match(Comma);
					setState(718);
					var_signature();
					}
					} 
				}
				setState(723);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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
		public TerminalNode KW_Var() { return getToken(NuttParser.KW_Var, 0); }
		public TerminalNode KW_Val() { return getToken(NuttParser.KW_Val, 0); }
		public TerminalNode KW_Mut() { return getToken(NuttParser.KW_Mut, 0); }
		public Constant_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_qualifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitConstant_qualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_qualifierContext constant_qualifier() throws RecognitionException {
		Constant_qualifierContext _localctx = new Constant_qualifierContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_constant_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 3221225473L) != 0)) ) {
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
	public static class Type_flat_nameContext extends ParserRuleContext {
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
		}
		public Type_flat_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_flat_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitType_flat_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_flat_nameContext type_flat_name() throws RecognitionException {
		Type_flat_nameContext _localctx = new Type_flat_nameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_type_flat_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			qualified_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public Qualified_nameContext anchor_name;
		public Token alias_name;
		public TerminalNode KW_Alias() { return getToken(NuttParser.KW_Alias, 0); }
		public TerminalNode KW_As() { return getToken(NuttParser.KW_As, 0); }
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
		}
		public List<TerminalNode> NAME() { return getTokens(NuttParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(NuttParser.NAME, i);
		}
		public List<TerminalNode> Comma() { return getTokens(NuttParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(NuttParser.Comma, i);
		}
		public Alias_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitAlias_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alias_declContext alias_decl() throws RecognitionException {
		Alias_declContext _localctx = new Alias_declContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_alias_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			match(KW_Alias);
			setState(729);
			((Alias_declContext)_localctx).anchor_name = qualified_name();
			setState(730);
			match(KW_As);
			setState(731);
			((Alias_declContext)_localctx).alias_name = match(NAME);
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(732);
				match(Comma);
				setState(733);
				((Alias_declContext)_localctx).alias_name = match(NAME);
				}
				}
				setState(738);
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
	public static class Type_annotationContext extends ParserRuleContext {
		public TerminalNode OP_TypeAnnotation() { return getToken(NuttParser.OP_TypeAnnotation, 0); }
		public Type_paramContext type_param() {
			return getRuleContext(Type_paramContext.class,0);
		}
		public Type_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_annotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitType_annotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_annotationContext type_annotation() throws RecognitionException {
		Type_annotationContext _localctx = new Type_annotationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_type_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			match(OP_TypeAnnotation);
			setState(740);
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
	public static class ExplistContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(NuttParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(NuttParser.Comma, i);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitExplist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_explist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			exp(0);
			setState(747);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(743);
					match(Comma);
					setState(744);
					exp(0);
					}
					} 
				}
				setState(749);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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
	public static class Bracket_accessContext extends ParserRuleContext {
		public TerminalNode Brace_Square_Left() { return getToken(NuttParser.Brace_Square_Left, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Brace_Square_Right() { return getToken(NuttParser.Brace_Square_Right, 0); }
		public Bracket_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracket_access; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitBracket_access(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bracket_accessContext bracket_access() throws RecognitionException {
		Bracket_accessContext _localctx = new Bracket_accessContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_bracket_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			match(Brace_Square_Left);
			setState(751);
			exp(0);
			setState(752);
			match(Brace_Square_Right);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dot_accessContext extends ParserRuleContext {
		public Token flat_property;
		public StringContext string_property;
		public TerminalNode Dot() { return getToken(NuttParser.Dot, 0); }
		public TerminalNode NAME() { return getToken(NuttParser.NAME, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Dot_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_access; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitDot_access(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dot_accessContext dot_access() throws RecognitionException {
		Dot_accessContext _localctx = new Dot_accessContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_dot_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(Dot);
			setState(757);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(755);
				((Dot_accessContext)_localctx).flat_property = match(NAME);
				}
				break;
			case Char_String:
			case Normal_string:
				{
				setState(756);
				((Dot_accessContext)_localctx).string_property = string();
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
		public TerminalNode KW_This() { return getToken(NuttParser.KW_This, 0); }
		public This_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitThis_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Explicit_variableContext extends ExpContext {
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
		}
		public Explicit_variableContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitExplicit_variable(this);
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
		public TerminalNode OP_Compose() { return getToken(NuttParser.OP_Compose, 0); }
		public Compose_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitCompose_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Property_accessContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Bracket_accessContext bracket_access() {
			return getRuleContext(Bracket_accessContext.class,0);
		}
		public Dot_accessContext dot_access() {
			return getRuleContext(Dot_accessContext.class,0);
		}
		public Property_accessContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitProperty_access(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Macro_callContext extends ExpContext {
		public ExplistContext arguments;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode OP_Tilda() { return getToken(NuttParser.OP_Tilda, 0); }
		public TerminalNode Brace_Paren_Left() { return getToken(NuttParser.Brace_Paren_Left, 0); }
		public TerminalNode Brace_Paren_Right() { return getToken(NuttParser.Brace_Paren_Right, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public Macro_callContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitMacro_call(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitPrefix_exp(this);
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
		public Instance_of_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitInstance_of_exp(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitExplicit_atom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Exec_expContext extends ExpContext {
		public TerminalNode KW_Exec() { return getToken(NuttParser.KW_Exec, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public Exec_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitExec_exp(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitFunction_definition_exp(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitType_of_exp(this);
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
		public TerminalNode KW_In() { return getToken(NuttParser.KW_In, 0); }
		public TerminalNode KW_Not_In() { return getToken(NuttParser.KW_Not_In, 0); }
		public Contains_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitContains_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Array_initializer_expContext extends ExpContext {
		public Array_initializerContext array_initializer() {
			return getRuleContext(Array_initializerContext.class,0);
		}
		public Array_initializer_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitArray_initializer_exp(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitComprehense_array_initializer_exp(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitExplicit_type(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitRange_array_initializer_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Eval_expContext extends ExpContext {
		public TerminalNode KW_Eval() { return getToken(NuttParser.KW_Eval, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Eval_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitEval_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Common_of_expContext extends ExpContext {
		public TerminalNode KW_CommonOf() { return getToken(NuttParser.KW_CommonOf, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public Common_of_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitCommon_of_exp(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitRecord_initializer_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Where_expContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode KW_Where() { return getToken(NuttParser.KW_Where, 0); }
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(NuttParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(NuttParser.Comma, i);
		}
		public Where_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitWhere_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Func_call_expContext extends ExpContext {
		public ExplistContext arguments;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Brace_Paren_Left() { return getToken(NuttParser.Brace_Paren_Left, 0); }
		public TerminalNode Brace_Paren_Right() { return getToken(NuttParser.Brace_Paren_Right, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public Func_call_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitFunc_call_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Spread_expContext extends ExpContext {
		public TerminalNode OP_Pass() { return getToken(NuttParser.OP_Pass, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Spread_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitSpread_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Quarternary_expContext extends ExpContext {
		public ExpContext cond;
		public ExpContext if_true;
		public ExpContext if_false;
		public TerminalNode Question() { return getToken(NuttParser.Question, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode Colon() { return getToken(NuttParser.Colon, 0); }
		public Quarternary_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitQuarternary_exp(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitInfix_exp(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitBlock_exp(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitMap_initializer_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Reverse_expContext extends ExpContext {
		public TerminalNode OP_Reverse() { return getToken(NuttParser.OP_Reverse, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Reverse_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitReverse_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Parenthesis_expContext extends ExpContext {
		public TerminalNode Brace_Paren_Left() { return getToken(NuttParser.Brace_Paren_Left, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Brace_Paren_Right() { return getToken(NuttParser.Brace_Paren_Right, 0); }
		public Parenthesis_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitParenthesis_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Set_initializer_expContext extends ExpContext {
		public Set_initializerContext set_initializer() {
			return getRuleContext(Set_initializerContext.class,0);
		}
		public Set_initializer_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitSet_initializer_exp(this);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitMatch_to_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Native_variableContext extends ExpContext {
		public TerminalNode NATIVE() { return getToken(NuttParser.NATIVE, 0); }
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
		}
		public Native_variableContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitNative_variable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class New_expContext extends ExpContext {
		public TerminalNode KW_New() { return getToken(NuttParser.KW_New, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Brace_Paren_Left() { return getToken(NuttParser.Brace_Paren_Left, 0); }
		public TerminalNode Brace_Paren_Right() { return getToken(NuttParser.Brace_Paren_Right, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public New_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitNew_exp(this);
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
			setState(813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				_localctx = new Explicit_variableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(760);
				qualified_name();
				}
				break;
			case 2:
				{
				_localctx = new Native_variableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(761);
				match(NATIVE);
				setState(762);
				qualified_name();
				}
				break;
			case 3:
				{
				_localctx = new This_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(763);
				match(KW_This);
				}
				break;
			case 4:
				{
				_localctx = new Spread_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(764);
				match(OP_Pass);
				setState(765);
				exp(28);
				}
				break;
			case 5:
				{
				_localctx = new Explicit_atomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(766);
				atom();
				}
				break;
			case 6:
				{
				_localctx = new Explicit_typeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(767);
				type_param(0);
				}
				break;
			case 7:
				{
				_localctx = new Block_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(768);
				do_done_block();
				}
				break;
			case 8:
				{
				_localctx = new Reverse_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(769);
				match(OP_Reverse);
				setState(770);
				exp(24);
				}
				break;
			case 9:
				{
				_localctx = new New_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(771);
				match(KW_New);
				setState(772);
				exp(0);
				setState(773);
				match(Brace_Paren_Left);
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9213713784706426206L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1454663160753553415L) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & 266257L) != 0)) {
					{
					setState(774);
					explist();
					}
				}

				setState(777);
				match(Brace_Paren_Right);
				}
				break;
			case 10:
				{
				_localctx = new Eval_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(779);
				match(KW_Eval);
				setState(782);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(780);
					exp(0);
					}
					break;
				case 2:
					{
					setState(781);
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
				setState(784);
				match(KW_Exec);
				setState(787);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(785);
					exp(0);
					}
					break;
				case 2:
					{
					setState(786);
					stat();
					}
					break;
				}
				}
				break;
			case 12:
				{
				_localctx = new Exec_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(789);
				match(KW_Exec);
				setState(792);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(790);
					exp(0);
					}
					break;
				case 2:
					{
					setState(791);
					stat();
					}
					break;
				}
				}
				break;
			case 13:
				{
				_localctx = new Array_initializer_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(794);
				array_initializer();
				}
				break;
			case 14:
				{
				_localctx = new Range_array_initializer_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(795);
				range_array_initializer();
				}
				break;
			case 15:
				{
				_localctx = new Comprehense_array_initializer_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(796);
				comprehense_array_initializer();
				}
				break;
			case 16:
				{
				_localctx = new Set_initializer_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(797);
				set_initializer();
				}
				break;
			case 17:
				{
				_localctx = new Map_initializer_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(798);
				map_initializer();
				}
				break;
			case 18:
				{
				_localctx = new Record_initializer_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(799);
				record_initializer();
				}
				break;
			case 19:
				{
				_localctx = new Function_definition_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(800);
				local_funct();
				}
				break;
			case 20:
				{
				_localctx = new Prefix_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(801);
				operator_prefix();
				setState(802);
				exp(10);
				}
				break;
			case 21:
				{
				_localctx = new Parenthesis_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(804);
				match(Brace_Paren_Left);
				setState(805);
				exp(0);
				setState(806);
				match(Brace_Paren_Right);
				}
				break;
			case 22:
				{
				_localctx = new Type_of_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(808);
				match(KW_TypeOf);
				setState(809);
				exp(5);
				}
				break;
			case 23:
				{
				_localctx = new Common_of_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(810);
				match(KW_CommonOf);
				setState(811);
				explist();
				}
				break;
			case 24:
				{
				_localctx = new Match_to_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(812);
				match_to();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(871);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(869);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
					case 1:
						{
						_localctx = new Compose_expContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(815);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(816);
						match(OP_Compose);
						setState(817);
						exp(24);
						}
						break;
					case 2:
						{
						_localctx = new Infix_expContext(new ExpContext(_parentctx, _parentState));
						((Infix_expContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(818);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(819);
						operator_infix();
						setState(820);
						((Infix_expContext)_localctx).right = exp(10);
						}
						break;
					case 3:
						{
						_localctx = new Contains_expContext(new ExpContext(_parentctx, _parentState));
						((Contains_expContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(822);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(825);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case KW_In:
							{
							setState(823);
							((Contains_expContext)_localctx).in = match(KW_In);
							}
							break;
						case KW_Not_In:
							{
							setState(824);
							((Contains_expContext)_localctx).not_in = match(KW_Not_In);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(827);
						((Contains_expContext)_localctx).right = exp(8);
						}
						break;
					case 4:
						{
						_localctx = new Instance_of_expContext(new ExpContext(_parentctx, _parentState));
						((Instance_of_expContext)_localctx).to_check = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(828);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(829);
						match(KW_InstanceOf);
						setState(830);
						((Instance_of_expContext)_localctx).type_exp = exp(4);
						}
						break;
					case 5:
						{
						_localctx = new Where_expContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(831);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(832);
						match(KW_Where);
						setState(833);
						var_decl();
						setState(838);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(834);
								match(Comma);
								setState(835);
								var_decl();
								}
								} 
							}
							setState(840);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
						}
						}
						break;
					case 6:
						{
						_localctx = new Macro_callContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(841);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(842);
						match(OP_Tilda);
						setState(849);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
						case 1:
							{
							setState(843);
							exp(0);
							}
							break;
						case 2:
							{
							setState(844);
							match(Brace_Paren_Left);
							setState(846);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9213713784706426206L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1454663160753553415L) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & 266257L) != 0)) {
								{
								setState(845);
								((Macro_callContext)_localctx).arguments = explist();
								}
							}

							setState(848);
							match(Brace_Paren_Right);
							}
							break;
						}
						}
						break;
					case 7:
						{
						_localctx = new Property_accessContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(851);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(854);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case Brace_Square_Left:
							{
							setState(852);
							bracket_access();
							}
							break;
						case Dot:
							{
							setState(853);
							dot_access();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 8:
						{
						_localctx = new Func_call_expContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(856);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(857);
						match(Brace_Paren_Left);
						setState(859);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9213713784706426206L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1454663160753553415L) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & 266257L) != 0)) {
							{
							setState(858);
							((Func_call_expContext)_localctx).arguments = explist();
							}
						}

						setState(861);
						match(Brace_Paren_Right);
						}
						break;
					case 9:
						{
						_localctx = new Quarternary_expContext(new ExpContext(_parentctx, _parentState));
						((Quarternary_expContext)_localctx).cond = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(862);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(863);
						match(Question);
						setState(864);
						((Quarternary_expContext)_localctx).if_true = exp(0);
						setState(867);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
						case 1:
							{
							setState(865);
							match(Colon);
							setState(866);
							((Quarternary_expContext)_localctx).if_false = exp(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(873);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
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
		public TerminalNode KW_Match() { return getToken(NuttParser.KW_Match, 0); }
		public TerminalNode KW_To() { return getToken(NuttParser.KW_To, 0); }
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitMatch_to(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Match_toContext match_to() throws RecognitionException {
		Match_toContext _localctx = new Match_toContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_match_to);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			match(KW_Match);
			setState(875);
			((Match_toContext)_localctx).matched = exp(0);
			setState(876);
			match(KW_To);
			setState(878); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(877);
					match_branch();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(880); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(882);
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
	public static class Array_initializerContext extends ParserRuleContext {
		public TerminalNode Brace_Square_Left() { return getToken(NuttParser.Brace_Square_Left, 0); }
		public TerminalNode Brace_Square_Right() { return getToken(NuttParser.Brace_Square_Right, 0); }
		public List<Array_elementContext> array_element() {
			return getRuleContexts(Array_elementContext.class);
		}
		public Array_elementContext array_element(int i) {
			return getRuleContext(Array_elementContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(NuttParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(NuttParser.Comma, i);
		}
		public Array_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_initializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitArray_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_initializerContext array_initializer() throws RecognitionException {
		Array_initializerContext _localctx = new Array_initializerContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_array_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			match(Brace_Square_Left);
			setState(894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9213713784706426206L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1454663160753553415L) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & 266257L) != 0)) {
				{
				setState(886);
				array_element();
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(887);
					match(Comma);
					setState(888);
					array_element();
					}
					}
					setState(893);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(896);
			match(Brace_Square_Right);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode OP_Pass() { return getToken(NuttParser.OP_Pass, 0); }
		public Array_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitArray_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_elementContext array_element() throws RecognitionException {
		Array_elementContext _localctx = new Array_elementContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_array_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(898);
				match(OP_Pass);
				}
				break;
			}
			setState(901);
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
	public static class Set_initializerContext extends ParserRuleContext {
		public TerminalNode Brace_Curly_Left() { return getToken(NuttParser.Brace_Curly_Left, 0); }
		public TerminalNode Brace_Curly_Right() { return getToken(NuttParser.Brace_Curly_Right, 0); }
		public List<Array_elementContext> array_element() {
			return getRuleContexts(Array_elementContext.class);
		}
		public Array_elementContext array_element(int i) {
			return getRuleContext(Array_elementContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(NuttParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(NuttParser.Comma, i);
		}
		public Set_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_initializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitSet_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_initializerContext set_initializer() throws RecognitionException {
		Set_initializerContext _localctx = new Set_initializerContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_set_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			match(Brace_Curly_Left);
			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9213713784706426206L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1454663160753553415L) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & 266257L) != 0)) {
				{
				setState(904);
				array_element();
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(905);
					match(Comma);
					setState(906);
					array_element();
					}
					}
					setState(911);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(914);
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
	public static class Range_array_initializerContext extends ParserRuleContext {
		public ExpContext start;
		public ExpContext next;
		public ExpContext bound;
		public TerminalNode Brace_Square_Left() { return getToken(NuttParser.Brace_Square_Left, 0); }
		public TerminalNode OP_Range() { return getToken(NuttParser.OP_Range, 0); }
		public TerminalNode Brace_Square_Right() { return getToken(NuttParser.Brace_Square_Right, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode Comma() { return getToken(NuttParser.Comma, 0); }
		public TerminalNode SemiColon() { return getToken(NuttParser.SemiColon, 0); }
		public TerminalNode OP_Reverse() { return getToken(NuttParser.OP_Reverse, 0); }
		public Range_array_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_array_initializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitRange_array_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_array_initializerContext range_array_initializer() throws RecognitionException {
		Range_array_initializerContext _localctx = new Range_array_initializerContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_range_array_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			match(Brace_Square_Left);
			setState(917);
			((Range_array_initializerContext)_localctx).start = exp(0);
			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(918);
				match(Comma);
				setState(919);
				((Range_array_initializerContext)_localctx).next = exp(0);
				}
			}

			setState(922);
			match(OP_Range);
			setState(923);
			((Range_array_initializerContext)_localctx).bound = exp(0);
			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(924);
				match(SemiColon);
				setState(925);
				match(OP_Reverse);
				}
			}

			setState(928);
			match(Brace_Square_Right);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public TerminalNode Brace_Square_Left() { return getToken(NuttParser.Brace_Square_Left, 0); }
		public TerminalNode NAME() { return getToken(NuttParser.NAME, 0); }
		public Op_directionContext op_direction() {
			return getRuleContext(Op_directionContext.class,0);
		}
		public TerminalNode Brace_Square_Right() { return getToken(NuttParser.Brace_Square_Right, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode KW_Of() { return getToken(NuttParser.KW_Of, 0); }
		public TerminalNode KW_If() { return getToken(NuttParser.KW_If, 0); }
		public Comprehense_array_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comprehense_array_initializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitComprehense_array_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comprehense_array_initializerContext comprehense_array_initializer() throws RecognitionException {
		Comprehense_array_initializerContext _localctx = new Comprehense_array_initializerContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_comprehense_array_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			match(Brace_Square_Left);
			setState(934);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(931);
				((Comprehense_array_initializerContext)_localctx).element = exp(0);
				setState(932);
				match(KW_Of);
				}
				break;
			}
			setState(936);
			match(NAME);
			setState(937);
			op_direction();
			setState(938);
			((Comprehense_array_initializerContext)_localctx).arr = exp(0);
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_If) {
				{
				setState(939);
				match(KW_If);
				setState(940);
				((Comprehense_array_initializerContext)_localctx).pred = exp(0);
				}
			}

			setState(943);
			match(Brace_Square_Right);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public ExpContext key;
		public ExpContext val;
		public TerminalNode OP_Pass() { return getToken(NuttParser.OP_Pass, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode Colon() { return getToken(NuttParser.Colon, 0); }
		public Map_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitMap_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Map_elementContext map_element() throws RecognitionException {
		Map_elementContext _localctx = new Map_elementContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_map_element);
		try {
			setState(951);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(945);
				match(OP_Pass);
				setState(946);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(947);
				((Map_elementContext)_localctx).key = exp(0);
				setState(948);
				match(Colon);
				setState(949);
				((Map_elementContext)_localctx).val = exp(0);
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
	public static class Map_initializerContext extends ParserRuleContext {
		public TerminalNode Brace_Square_Left() { return getToken(NuttParser.Brace_Square_Left, 0); }
		public List<Map_elementContext> map_element() {
			return getRuleContexts(Map_elementContext.class);
		}
		public Map_elementContext map_element(int i) {
			return getRuleContext(Map_elementContext.class,i);
		}
		public TerminalNode Brace_Square_Right() { return getToken(NuttParser.Brace_Square_Right, 0); }
		public List<TerminalNode> Comma() { return getTokens(NuttParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(NuttParser.Comma, i);
		}
		public Map_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_initializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitMap_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Map_initializerContext map_initializer() throws RecognitionException {
		Map_initializerContext _localctx = new Map_initializerContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_map_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			match(Brace_Square_Left);
			setState(954);
			map_element();
			setState(959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(955);
				match(Comma);
				setState(956);
				map_element();
				}
				}
				setState(961);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(962);
			match(Brace_Square_Right);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public TerminalNode Colon() { return getToken(NuttParser.Colon, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode NAME() { return getToken(NuttParser.NAME, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Record_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitRecord_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Record_elementContext record_element() throws RecognitionException {
		Record_elementContext _localctx = new Record_elementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_record_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(964);
				((Record_elementContext)_localctx).name_key = match(NAME);
				}
				break;
			case Char_String:
			case Normal_string:
				{
				setState(965);
				((Record_elementContext)_localctx).string_key = string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(968);
			match(Colon);
			setState(969);
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
		public List<TerminalNode> Comma() { return getTokens(NuttParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(NuttParser.Comma, i);
		}
		public Record_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_element_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitRecord_element_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Record_element_listContext record_element_list() throws RecognitionException {
		Record_element_listContext _localctx = new Record_element_listContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_record_element_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			record_element();
			setState(976);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(972);
				match(Comma);
				setState(973);
				record_element();
				}
				}
				setState(978);
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
		public TerminalNode Brace_Curly_Left() { return getToken(NuttParser.Brace_Curly_Left, 0); }
		public Record_element_listContext record_element_list() {
			return getRuleContext(Record_element_listContext.class,0);
		}
		public TerminalNode Brace_Curly_Right() { return getToken(NuttParser.Brace_Curly_Right, 0); }
		public Record_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_initializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitRecord_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Record_initializerContext record_initializer() throws RecognitionException {
		Record_initializerContext _localctx = new Record_initializerContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_record_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			match(Brace_Curly_Left);
			setState(980);
			record_element_list();
			setState(981);
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
		public TerminalNode OP_And() { return getToken(NuttParser.OP_And, 0); }
		public TerminalNode OP_Or() { return getToken(NuttParser.OP_Or, 0); }
		public TerminalNode OP_Xor() { return getToken(NuttParser.OP_Xor, 0); }
		public Operator_logicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_logical; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitOperator_logical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_logicalContext operator_logical() throws RecognitionException {
		Operator_logicalContext _localctx = new Operator_logicalContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_operator_logical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			_la = _input.LA(1);
			if ( !(((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & 8590983169L) != 0)) ) {
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
		public TerminalNode KW_Default() { return getToken(NuttParser.KW_Default, 0); }
		public TerminalNode OP_Case_Arrow() { return getToken(NuttParser.OP_Case_Arrow, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Default_match_branchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_match_branch; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitDefault_match_branch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_match_branchContext default_match_branch() throws RecognitionException {
		Default_match_branchContext _localctx = new Default_match_branchContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_default_match_branch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			match(KW_Default);
			setState(986);
			match(OP_Case_Arrow);
			setState(987);
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
		public TerminalNode OP_Case_Arrow() { return getToken(NuttParser.OP_Case_Arrow, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode KW_Final() { return getToken(NuttParser.KW_Final, 0); }
		public Match_branchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_branch; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitMatch_branch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Match_branchContext match_branch() throws RecognitionException {
		Match_branchContext _localctx = new Match_branchContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_match_branch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_Final) {
				{
				setState(989);
				match(KW_Final);
				}
			}

			setState(992);
			explist();
			setState(993);
			match(OP_Case_Arrow);
			setState(994);
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
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_atom);
		try {
			setState(1000);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_Nil:
				enterOuterAlt(_localctx, 1);
				{
				setState(996);
				nil();
				}
				break;
			case KW_Both:
			case KW_False:
			case KW_Neither:
			case KW_True:
				enterOuterAlt(_localctx, 2);
				{
				setState(997);
				logic();
				}
				break;
			case Float:
			case HexFloat:
			case HexInt:
			case Int:
				enterOuterAlt(_localctx, 3);
				{
				setState(998);
				number();
				}
				break;
			case Char_String:
			case Normal_string:
				enterOuterAlt(_localctx, 4);
				{
				setState(999);
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
		public TerminalNode KW_Nil() { return getToken(NuttParser.KW_Nil, 0); }
		public NilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nil; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitNil(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NilContext nil() throws RecognitionException {
		NilContext _localctx = new NilContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_nil);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002);
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
	public static class LogicContext extends ParserRuleContext {
		public TerminalNode KW_Both() { return getToken(NuttParser.KW_Both, 0); }
		public TerminalNode KW_Neither() { return getToken(NuttParser.KW_Neither, 0); }
		public BooleanContext boolean_() {
			return getRuleContext(BooleanContext.class,0);
		}
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_logic);
		try {
			setState(1007);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_Both:
				enterOuterAlt(_localctx, 1);
				{
				setState(1004);
				match(KW_Both);
				}
				break;
			case KW_Neither:
				enterOuterAlt(_localctx, 2);
				{
				setState(1005);
				match(KW_Neither);
				}
				break;
			case KW_False:
			case KW_True:
				enterOuterAlt(_localctx, 3);
				{
				setState(1006);
				boolean_();
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
	public static class BooleanContext extends ParserRuleContext {
		public TerminalNode KW_True() { return getToken(NuttParser.KW_True, 0); }
		public TerminalNode KW_False() { return getToken(NuttParser.KW_False, 0); }
		public BooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanContext boolean_() throws RecognitionException {
		BooleanContext _localctx = new BooleanContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_boolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_number);
		try {
			setState(1013);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HexInt:
			case Int:
				enterOuterAlt(_localctx, 1);
				{
				setState(1011);
				int_();
				}
				break;
			case Float:
			case HexFloat:
				enterOuterAlt(_localctx, 2);
				{
				setState(1012);
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
		public TerminalNode Int() { return getToken(NuttParser.Int, 0); }
		public TerminalNode HexInt() { return getToken(NuttParser.HexInt, 0); }
		public IntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntContext int_() throws RecognitionException {
		IntContext _localctx = new IntContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_int);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
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
		public TerminalNode Float() { return getToken(NuttParser.Float, 0); }
		public TerminalNode HexFloat() { return getToken(NuttParser.HexFloat, 0); }
		public FloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatContext float_() throws RecognitionException {
		FloatContext _localctx = new FloatContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_float);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
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
		public TerminalNode Normal_string() { return getToken(NuttParser.Normal_string, 0); }
		public TerminalNode Char_String() { return getToken(NuttParser.Char_String, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
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
	public static class Var_signature_listContext extends ParserRuleContext {
		public List<Vararg_or_signatureContext> vararg_or_signature() {
			return getRuleContexts(Vararg_or_signatureContext.class);
		}
		public Vararg_or_signatureContext vararg_or_signature(int i) {
			return getRuleContext(Vararg_or_signatureContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(NuttParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(NuttParser.Comma, i);
		}
		public Var_signature_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_signature_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitVar_signature_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_signature_listContext var_signature_list() throws RecognitionException {
		Var_signature_listContext _localctx = new Var_signature_listContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_var_signature_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			vararg_or_signature();
			setState(1026);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1022);
				match(Comma);
				setState(1023);
				vararg_or_signature();
				}
				}
				setState(1028);
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
	public static class Vararg_or_signatureContext extends ParserRuleContext {
		public Var_signatureContext var_signature() {
			return getRuleContext(Var_signatureContext.class,0);
		}
		public TerminalNode OP_Pass() { return getToken(NuttParser.OP_Pass, 0); }
		public Vararg_or_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vararg_or_signature; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitVararg_or_signature(this);
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
			setState(1030);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Pass) {
				{
				setState(1029);
				match(OP_Pass);
				}
			}

			setState(1032);
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
		public TerminalNode Colon() { return getToken(NuttParser.Colon, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Type_paramContext type_param() {
			return getRuleContext(Type_paramContext.class,0);
		}
		public Func_outputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_output; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitFunc_output(this);
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
			setState(1039);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1034);
				match(Colon);
				setState(1037);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(1035);
					exp(0);
					}
					break;
				case 2:
					{
					setState(1036);
					type_param(0);
					}
					break;
				}
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
		public TerminalNode KW_Funct() { return getToken(NuttParser.KW_Funct, 0); }
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public Local_functContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_funct; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitLocal_funct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_functContext local_funct() throws RecognitionException {
		Local_functContext _localctx = new Local_functContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_local_funct);
		try {
			setState(1044);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AtSign:
			case Brace_Curly_Left:
			case Brace_Paren_Left:
			case Colon:
			case OP_LambdaReturn:
				enterOuterAlt(_localctx, 1);
				{
				setState(1041);
				lambda_decl();
				}
				break;
			case KW_Funct:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1042);
				match(KW_Funct);
				setState(1043);
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
		public TerminalNode OP_Assign() { return getToken(NuttParser.OP_Assign, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode KW_End() { return getToken(NuttParser.KW_End, 0); }
		public TerminalNode OP_Placeholder() { return getToken(NuttParser.OP_Placeholder, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitFuncbody(this);
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
			setState(1049);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AtSign) {
				{
				{
				setState(1046);
				annotation();
				}
				}
				setState(1051);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1052);
			funct_signature();
			setState(1053);
			match(OP_Assign);
			setState(1059);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(1054);
				block();
				setState(1055);
				match(KW_End);
				}
				break;
			case 2:
				{
				setState(1057);
				match(OP_Placeholder);
				}
				break;
			case 3:
				{
				setState(1058);
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
	public static class Lambda_declContext extends ParserRuleContext {
		public ExpContext lambda_exp;
		public Funct_signatureContext funct_signature() {
			return getRuleContext(Funct_signatureContext.class,0);
		}
		public TerminalNode OP_LambdaReturn() { return getToken(NuttParser.OP_LambdaReturn, 0); }
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitLambda_decl(this);
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
			setState(1064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AtSign) {
				{
				{
				setState(1061);
				annotation();
				}
				}
				setState(1066);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1067);
			funct_signature();
			setState(1068);
			match(OP_LambdaReturn);
			setState(1069);
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
		public TerminalNode Op_Custom() { return getToken(NuttParser.Op_Custom, 0); }
		public Operator_infixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_infix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitOperator_infix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_infixContext operator_infix() throws RecognitionException {
		Operator_infixContext _localctx = new Operator_infixContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_operator_infix);
		try {
			setState(1073);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
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
				enterOuterAlt(_localctx, 1);
				{
				setState(1071);
				default_infix_operator();
				}
				break;
			case Op_Custom:
				enterOuterAlt(_localctx, 2);
				{
				setState(1072);
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
		public TerminalNode OP_Append() { return getToken(NuttParser.OP_Append, 0); }
		public TerminalNode OP_Reverse() { return getToken(NuttParser.OP_Reverse, 0); }
		public Default_infix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_infix_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitDefault_infix_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_infix_operatorContext default_infix_operator() throws RecognitionException {
		Default_infix_operatorContext _localctx = new Default_infix_operatorContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_default_infix_operator);
		try {
			setState(1080);
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
				setState(1075);
				operator_math();
				}
				break;
			case OP_And:
			case OP_Or:
			case OP_Xor:
				enterOuterAlt(_localctx, 2);
				{
				setState(1076);
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
				setState(1077);
				operator_comparison();
				}
				break;
			case OP_Append:
				enterOuterAlt(_localctx, 4);
				{
				setState(1078);
				match(OP_Append);
				}
				break;
			case OP_Reverse:
				enterOuterAlt(_localctx, 5);
				{
				setState(1079);
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
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitOperator_composed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_composedContext operator_composed() throws RecognitionException {
		Operator_composedContext _localctx = new Operator_composedContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_operator_composed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			composed_assign_op();
			setState(1083);
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
		public TerminalNode OP_Add() { return getToken(NuttParser.OP_Add, 0); }
		public TerminalNode OP_Sub() { return getToken(NuttParser.OP_Sub, 0); }
		public TerminalNode OP_Mult() { return getToken(NuttParser.OP_Mult, 0); }
		public TerminalNode OP_Div() { return getToken(NuttParser.OP_Div, 0); }
		public TerminalNode OP_Mod() { return getToken(NuttParser.OP_Mod, 0); }
		public TerminalNode OP_IntDiv() { return getToken(NuttParser.OP_IntDiv, 0); }
		public TerminalNode OP_Power() { return getToken(NuttParser.OP_Power, 0); }
		public Operator_mathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_math; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitOperator_math(this);
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
			setState(1085);
			_la = _input.LA(1);
			if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & 1091309697L) != 0)) ) {
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
		public TerminalNode Op_Custom() { return getToken(NuttParser.Op_Custom, 0); }
		public Operator_postfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_postfix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitOperator_postfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_postfixContext operator_postfix() throws RecognitionException {
		Operator_postfixContext _localctx = new Operator_postfixContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_operator_postfix);
		try {
			setState(1091);
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
				setState(1087);
				operator_math();
				setState(1088);
				operator_math();
				}
				break;
			case Op_Custom:
				enterOuterAlt(_localctx, 2);
				{
				setState(1090);
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
		public TerminalNode OP_Assign() { return getToken(NuttParser.OP_Assign, 0); }
		public Composed_assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_composed_assign_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitComposed_assign_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Composed_assign_opContext composed_assign_op() throws RecognitionException {
		Composed_assign_opContext _localctx = new Composed_assign_opContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_composed_assign_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			operator_infix();
			setState(1094);
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
		public TerminalNode OP_Not() { return getToken(NuttParser.OP_Not, 0); }
		public TerminalNode OP_Length() { return getToken(NuttParser.OP_Length, 0); }
		public TerminalNode OP_Sub() { return getToken(NuttParser.OP_Sub, 0); }
		public TerminalNode OP_Add() { return getToken(NuttParser.OP_Add, 0); }
		public TerminalNode Op_Custom() { return getToken(NuttParser.Op_Custom, 0); }
		public Operator_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_prefix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitOperator_prefix(this);
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
			setState(1096);
			_la = _input.LA(1);
			if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & 275952730113L) != 0)) ) {
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
		public TerminalNode OP_Less() { return getToken(NuttParser.OP_Less, 0); }
		public TerminalNode OP_Greater() { return getToken(NuttParser.OP_Greater, 0); }
		public TerminalNode OP_Less_Equal() { return getToken(NuttParser.OP_Less_Equal, 0); }
		public TerminalNode Op_Greater_Equal() { return getToken(NuttParser.Op_Greater_Equal, 0); }
		public TerminalNode Op_Not_Similar() { return getToken(NuttParser.Op_Not_Similar, 0); }
		public TerminalNode Op_Not_Equal() { return getToken(NuttParser.Op_Not_Equal, 0); }
		public TerminalNode OP_Similar() { return getToken(NuttParser.OP_Similar, 0); }
		public TerminalNode OP_Equal() { return getToken(NuttParser.OP_Equal, 0); }
		public Operator_comparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_comparison; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuttParserVisitor ) return ((NuttParserVisitor<? extends T>)visitor).visitOperator_comparison(this);
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
			setState(1098);
			_la = _input.LA(1);
			if ( !(((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 940049161L) != 0)) ) {
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
		case 18:
			return type_param_sempred((Type_paramContext)_localctx, predIndex);
		case 66:
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
			return precpred(_ctx, 23);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 32);
		case 6:
			return precpred(_ctx, 30);
		case 7:
			return precpred(_ctx, 18);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0095\u044d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\u0001\u0002\u0003\u0002\u00e5\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00ed\b\u0003\n\u0003"+
		"\f\u0003\u00f0\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00f4\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u00fc\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0101\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0005\t\u010c\b\t\n\t\f\t\u010f\t\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0118\b\n\u0001"+
		"\n\u0001\n\u0003\n\u011c\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0121\b\u000b\u0001\f\u0001\f\u0001\r\u0005\r\u0126\b\r\n\r\f\r"+
		"\u0129\t\r\u0001\u000e\u0001\u000e\u0005\u000e\u012d\b\u000e\n\u000e\f"+
		"\u000e\u0130\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u014f\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u0161\b\u0010\u0001\u0010\u0003\u0010\u0164\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u016d\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u0174\b\u0011\n\u0011\f\u0011\u0177"+
		"\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u017d"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0187\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0004\u0012\u018c\b\u0012\u000b\u0012\f\u0012\u018d"+
		"\u0005\u0012\u0190\b\u0012\n\u0012\f\u0012\u0193\t\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u01a4\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0005\u0015\u01a9\b\u0015\n\u0015\f\u0015\u01ac\t\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01b2\b\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u01b6\b\u0016\n\u0016\f\u0016\u01b9\t\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u01c1\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u01c7\b\u0017\n\u0017\f\u0017\u01ca\t\u0017\u0003\u0017\u01cc\b"+
		"\u0017\u0001\u0018\u0005\u0018\u01cf\b\u0018\n\u0018\f\u0018\u01d2\t\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u01d7\b\u0018\n\u0018"+
		"\f\u0018\u01da\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u01e2\b\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u01e6\b\u001a\u0003\u001a\u01e8\b\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0003\u001c\u01ee\b\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u01f2\b\u001c\u0001\u001c\u0003\u001c\u01f5\b\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u01fd\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u0202\b\u001d\u0001\u001e\u0005\u001e\u0205\b\u001e\n\u001e\f\u001e\u0208"+
		"\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u020e"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0214"+
		"\b\u001e\n\u001e\f\u001e\u0217\t\u001e\u0003\u001e\u0219\b\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0224\b\u001f\u0001 \u0005"+
		" \u0227\b \n \f \u022a\t \u0001!\u0001!\u0001!\u0001!\u0005!\u0230\b!"+
		"\n!\f!\u0233\t!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0005\"\u023a\b"+
		"\"\n\"\f\"\u023d\t\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0003"+
		"#\u0245\b#\u0001$\u0003$\u0248\b$\u0001$\u0003$\u024b\b$\u0001$\u0001"+
		"$\u0003$\u024f\b$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001"+
		"&\u0001&\u0003&\u025a\b&\u0001&\u0005&\u025d\b&\n&\f&\u0260\t&\u0001&"+
		"\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0003*\u0275"+
		"\b*\u0001*\u0001*\u0001+\u0003+\u027a\b+\u0001+\u0001+\u0001,\u0001,\u0001"+
		",\u0001-\u0001-\u0001-\u0003-\u0284\b-\u0001.\u0001.\u0001.\u0005.\u0289"+
		"\b.\n.\f.\u028c\t.\u0001/\u0001/\u0001/\u0003/\u0291\b/\u00010\u00010"+
		"\u00010\u00010\u00030\u0297\b0\u00010\u00010\u00010\u00010\u00011\u0001"+
		"1\u00011\u00011\u00012\u00012\u00012\u00012\u00012\u00013\u00013\u0001"+
		"4\u00014\u00034\u02aa\b4\u00015\u00015\u00015\u00016\u00016\u00016\u0001"+
		"6\u00016\u00036\u02b4\b6\u00017\u00017\u00017\u00017\u00037\u02ba\b7\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00038\u02c2\b8\u00019\u00019\u0003"+
		"9\u02c6\b9\u00019\u00019\u00039\u02ca\b9\u0001:\u0001:\u0001:\u0001:\u0005"+
		":\u02d0\b:\n:\f:\u02d3\t:\u0001;\u0001;\u0001<\u0001<\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0005=\u02df\b=\n=\f=\u02e2\t=\u0001>\u0001>\u0001"+
		">\u0001?\u0001?\u0001?\u0005?\u02ea\b?\n?\f?\u02ed\t?\u0001@\u0001@\u0001"+
		"@\u0001@\u0001A\u0001A\u0001A\u0003A\u02f6\bA\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0003B\u0308\bB\u0001B\u0001B\u0001B\u0001B\u0001B\u0003"+
		"B\u030f\bB\u0001B\u0001B\u0001B\u0003B\u0314\bB\u0001B\u0001B\u0001B\u0003"+
		"B\u0319\bB\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0003B\u032e\bB\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0003B\u033a\bB\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0005B\u0345\bB\nB\fB\u0348\tB\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0003B\u034f\bB\u0001B\u0003B\u0352\bB\u0001B\u0001B\u0001"+
		"B\u0003B\u0357\bB\u0001B\u0001B\u0001B\u0003B\u035c\bB\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0003B\u0364\bB\u0005B\u0366\bB\nB\fB\u0369\tB"+
		"\u0001C\u0001C\u0001C\u0001C\u0004C\u036f\bC\u000bC\fC\u0370\u0001C\u0003"+
		"C\u0374\bC\u0001D\u0001D\u0001D\u0001D\u0005D\u037a\bD\nD\fD\u037d\tD"+
		"\u0003D\u037f\bD\u0001D\u0001D\u0001E\u0003E\u0384\bE\u0001E\u0001E\u0001"+
		"F\u0001F\u0001F\u0001F\u0005F\u038c\bF\nF\fF\u038f\tF\u0003F\u0391\bF"+
		"\u0001F\u0001F\u0001G\u0001G\u0001G\u0001G\u0003G\u0399\bG\u0001G\u0001"+
		"G\u0001G\u0001G\u0003G\u039f\bG\u0001G\u0001G\u0001H\u0001H\u0001H\u0001"+
		"H\u0003H\u03a7\bH\u0001H\u0001H\u0001H\u0001H\u0001H\u0003H\u03ae\bH\u0001"+
		"H\u0001H\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0003I\u03b8\bI\u0001"+
		"J\u0001J\u0001J\u0001J\u0005J\u03be\bJ\nJ\fJ\u03c1\tJ\u0001J\u0001J\u0001"+
		"K\u0001K\u0003K\u03c7\bK\u0001K\u0001K\u0001K\u0001L\u0001L\u0001L\u0005"+
		"L\u03cf\bL\nL\fL\u03d2\tL\u0001M\u0001M\u0001M\u0001M\u0001N\u0001N\u0001"+
		"O\u0001O\u0001O\u0001O\u0001P\u0003P\u03df\bP\u0001P\u0001P\u0001P\u0001"+
		"P\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u03e9\bQ\u0001R\u0001R\u0001S\u0001"+
		"S\u0001S\u0003S\u03f0\bS\u0001T\u0001T\u0001U\u0001U\u0003U\u03f6\bU\u0001"+
		"V\u0001V\u0001W\u0001W\u0001X\u0001X\u0001Y\u0001Y\u0001Y\u0005Y\u0401"+
		"\bY\nY\fY\u0404\tY\u0001Z\u0003Z\u0407\bZ\u0001Z\u0001Z\u0001[\u0001["+
		"\u0001[\u0003[\u040e\b[\u0003[\u0410\b[\u0001\\\u0001\\\u0001\\\u0003"+
		"\\\u0415\b\\\u0001]\u0005]\u0418\b]\n]\f]\u041b\t]\u0001]\u0001]\u0001"+
		"]\u0001]\u0001]\u0001]\u0001]\u0003]\u0424\b]\u0001^\u0005^\u0427\b^\n"+
		"^\f^\u042a\t^\u0001^\u0001^\u0001^\u0001^\u0001_\u0001_\u0003_\u0432\b"+
		"_\u0001`\u0001`\u0001`\u0001`\u0001`\u0003`\u0439\b`\u0001a\u0001a\u0001"+
		"a\u0001b\u0001b\u0001c\u0001c\u0001c\u0001c\u0003c\u0444\bc\u0001d\u0001"+
		"d\u0001d\u0001e\u0001e\u0001f\u0001f\u0001f\u0000\u0002$\u0084g\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u0000\r\u0001\u0000NP\u0002\u0000::LM\u0002\u0000gg\u008a\u008a\u0002"+
		"\u0000mmss\u0002\u0000BB`a\u0003\u0000jj~~\u008b\u008b\u0002\u000011Z"+
		"Z\u0001\u0000\u0015\u0016\u0002\u0000\u0012\u0012\u0014\u0014\u0002\u0000"+
		"\u000b\u000b\u0095\u0095\u0006\u0000iippuu{|\u0081\u0081\u0087\u0087\u0005"+
		"\u0000iixx}}\u0087\u0087\u008f\u008f\u0005\u0000qqttyz\u0084\u0084\u008c"+
		"\u008e\u049f\u0000\u00cf\u0001\u0000\u0000\u0000\u0002\u00d3\u0001\u0000"+
		"\u0000\u0000\u0004\u00e4\u0001\u0000\u0000\u0000\u0006\u00e9\u0001\u0000"+
		"\u0000\u0000\b\u00f5\u0001\u0000\u0000\u0000\n\u00f8\u0001\u0000\u0000"+
		"\u0000\f\u00fd\u0001\u0000\u0000\u0000\u000e\u0102\u0001\u0000\u0000\u0000"+
		"\u0010\u0105\u0001\u0000\u0000\u0000\u0012\u0108\u0001\u0000\u0000\u0000"+
		"\u0014\u0110\u0001\u0000\u0000\u0000\u0016\u0120\u0001\u0000\u0000\u0000"+
		"\u0018\u0122\u0001\u0000\u0000\u0000\u001a\u0127\u0001\u0000\u0000\u0000"+
		"\u001c\u012e\u0001\u0000\u0000\u0000\u001e\u0133\u0001\u0000\u0000\u0000"+
		" \u016c\u0001\u0000\u0000\u0000\"\u016e\u0001\u0000\u0000\u0000$\u0186"+
		"\u0001\u0000\u0000\u0000&\u0194\u0001\u0000\u0000\u0000(\u0199\u0001\u0000"+
		"\u0000\u0000*\u01a5\u0001\u0000\u0000\u0000,\u01ad\u0001\u0000\u0000\u0000"+
		".\u01bc\u0001\u0000\u0000\u00000\u01d0\u0001\u0000\u0000\u00002\u01dd"+
		"\u0001\u0000\u0000\u00004\u01e7\u0001\u0000\u0000\u00006\u01e9\u0001\u0000"+
		"\u0000\u00008\u01ed\u0001\u0000\u0000\u0000:\u01f8\u0001\u0000\u0000\u0000"+
		"<\u0206\u0001\u0000\u0000\u0000>\u0223\u0001\u0000\u0000\u0000@\u0228"+
		"\u0001\u0000\u0000\u0000B\u022b\u0001\u0000\u0000\u0000D\u0236\u0001\u0000"+
		"\u0000\u0000F\u0244\u0001\u0000\u0000\u0000H\u0247\u0001\u0000\u0000\u0000"+
		"J\u0253\u0001\u0000\u0000\u0000L\u0255\u0001\u0000\u0000\u0000N\u0265"+
		"\u0001\u0000\u0000\u0000P\u0269\u0001\u0000\u0000\u0000R\u026d\u0001\u0000"+
		"\u0000\u0000T\u0270\u0001\u0000\u0000\u0000V\u0279\u0001\u0000\u0000\u0000"+
		"X\u027d\u0001\u0000\u0000\u0000Z\u0280\u0001\u0000\u0000\u0000\\\u0285"+
		"\u0001\u0000\u0000\u0000^\u0290\u0001\u0000\u0000\u0000`\u0292\u0001\u0000"+
		"\u0000\u0000b\u029c\u0001\u0000\u0000\u0000d\u02a0\u0001\u0000\u0000\u0000"+
		"f\u02a5\u0001\u0000\u0000\u0000h\u02a7\u0001\u0000\u0000\u0000j\u02ab"+
		"\u0001\u0000\u0000\u0000l\u02ae\u0001\u0000\u0000\u0000n\u02b5\u0001\u0000"+
		"\u0000\u0000p\u02bb\u0001\u0000\u0000\u0000r\u02c3\u0001\u0000\u0000\u0000"+
		"t\u02cb\u0001\u0000\u0000\u0000v\u02d4\u0001\u0000\u0000\u0000x\u02d6"+
		"\u0001\u0000\u0000\u0000z\u02d8\u0001\u0000\u0000\u0000|\u02e3\u0001\u0000"+
		"\u0000\u0000~\u02e6\u0001\u0000\u0000\u0000\u0080\u02ee\u0001\u0000\u0000"+
		"\u0000\u0082\u02f2\u0001\u0000\u0000\u0000\u0084\u032d\u0001\u0000\u0000"+
		"\u0000\u0086\u036a\u0001\u0000\u0000\u0000\u0088\u0375\u0001\u0000\u0000"+
		"\u0000\u008a\u0383\u0001\u0000\u0000\u0000\u008c\u0387\u0001\u0000\u0000"+
		"\u0000\u008e\u0394\u0001\u0000\u0000\u0000\u0090\u03a2\u0001\u0000\u0000"+
		"\u0000\u0092\u03b7\u0001\u0000\u0000\u0000\u0094\u03b9\u0001\u0000\u0000"+
		"\u0000\u0096\u03c6\u0001\u0000\u0000\u0000\u0098\u03cb\u0001\u0000\u0000"+
		"\u0000\u009a\u03d3\u0001\u0000\u0000\u0000\u009c\u03d7\u0001\u0000\u0000"+
		"\u0000\u009e\u03d9\u0001\u0000\u0000\u0000\u00a0\u03de\u0001\u0000\u0000"+
		"\u0000\u00a2\u03e8\u0001\u0000\u0000\u0000\u00a4\u03ea\u0001\u0000\u0000"+
		"\u0000\u00a6\u03ef\u0001\u0000\u0000\u0000\u00a8\u03f1\u0001\u0000\u0000"+
		"\u0000\u00aa\u03f5\u0001\u0000\u0000\u0000\u00ac\u03f7\u0001\u0000\u0000"+
		"\u0000\u00ae\u03f9\u0001\u0000\u0000\u0000\u00b0\u03fb\u0001\u0000\u0000"+
		"\u0000\u00b2\u03fd\u0001\u0000\u0000\u0000\u00b4\u0406\u0001\u0000\u0000"+
		"\u0000\u00b6\u040f\u0001\u0000\u0000\u0000\u00b8\u0414\u0001\u0000\u0000"+
		"\u0000\u00ba\u0419\u0001\u0000\u0000\u0000\u00bc\u0428\u0001\u0000\u0000"+
		"\u0000\u00be\u0431\u0001\u0000\u0000\u0000\u00c0\u0438\u0001\u0000\u0000"+
		"\u0000\u00c2\u043a\u0001\u0000\u0000\u0000\u00c4\u043d\u0001\u0000\u0000"+
		"\u0000\u00c6\u0443\u0001\u0000\u0000\u0000\u00c8\u0445\u0001\u0000\u0000"+
		"\u0000\u00ca\u0448\u0001\u0000\u0000\u0000\u00cc\u044a\u0001\u0000\u0000"+
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
		"\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e1\u0003\u001a\r\u0000\u00e1"+
		"\u00e2\u0005*\u0000\u0000\u00e2\u0003\u0001\u0000\u0000\u0000\u00e3\u00e5"+
		"\u0003\u00b0X\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005"+
		"A\u0000\u0000\u00e7\u00e8\u0005g\u0000\u0000\u00e8\u0005\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ee\u0005g\u0000\u0000\u00ea\u00eb\u0005\u000f\u0000\u0000"+
		"\u00eb\u00ed\u0005g\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed"+
		"\u00f0\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f3\u0001\u0000\u0000\u0000\u00f0"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005\u001a\u0000\u0000\u00f2"+
		"\u00f4\u0005g\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f4\u0007\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0005S\u0000\u0000\u00f6\u00f7\u0003\f\u0006\u0000\u00f7\t\u0001\u0000"+
		"\u0000\u0000\u00f8\u00fb\u0003\u0006\u0003\u0000\u00f9\u00fa\u0005\u001a"+
		"\u0000\u0000\u00fa\u00fc\u0005g\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u000b\u0001\u0000\u0000"+
		"\u0000\u00fd\u0100\u0003\n\u0005\u0000\u00fe\u00ff\u0005\r\u0000\u0000"+
		"\u00ff\u0101\u0003\n\u0005\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0001\u0000\u0000\u0000\u0101\r\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u00058\u0000\u0000\u0103\u0104\u0003\u0012\t\u0000\u0104\u000f\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0005$\u0000\u0000\u0106\u0107\u0003\u0012"+
		"\t\u0000\u0107\u0011\u0001\u0000\u0000\u0000\u0108\u010d\u0003\u0016\u000b"+
		"\u0000\u0109\u010a\u0005\r\u0000\u0000\u010a\u010c\u0003\u0016\u000b\u0000"+
		"\u010b\u0109\u0001\u0000\u0000\u0000\u010c\u010f\u0001\u0000\u0000\u0000"+
		"\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000"+
		"\u010e\u0013\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000"+
		"\u0110\u0117\u0003\u0006\u0003\u0000\u0111\u0112\u0005\u0007\u0000\u0000"+
		"\u0112\u0113\u0003\u0012\t\u0000\u0113\u0114\u0005\b\u0000\u0000\u0114"+
		"\u0118\u0001\u0000\u0000\u0000\u0115\u0116\u0005\u000f\u0000\u0000\u0116"+
		"\u0118\u0005\u0018\u0000\u0000\u0117\u0111\u0001\u0000\u0000\u0000\u0117"+
		"\u0115\u0001\u0000\u0000\u0000\u0118\u011b\u0001\u0000\u0000\u0000\u0119"+
		"\u011a\u0005\u001a\u0000\u0000\u011a\u011c\u0005g\u0000\u0000\u011b\u0119"+
		"\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u0015"+
		"\u0001\u0000\u0000\u0000\u011d\u0121\u0003\u0006\u0003\u0000\u011e\u0121"+
		"\u0003\u0014\n\u0000\u011f\u0121\u0003\u0018\f\u0000\u0120\u011d\u0001"+
		"\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u011f\u0001"+
		"\u0000\u0000\u0000\u0121\u0017\u0001\u0000\u0000\u0000\u0122\u0123\u0003"+
		"\u00b0X\u0000\u0123\u0019\u0001\u0000\u0000\u0000\u0124\u0126\u0003 \u0010"+
		"\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0126\u0129\u0001\u0000\u0000"+
		"\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000"+
		"\u0000\u0128\u001b\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000"+
		"\u0000\u012a\u012b\u0005g\u0000\u0000\u012b\u012d\u0005\u0092\u0000\u0000"+
		"\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u0130\u0001\u0000\u0000\u0000"+
		"\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000"+
		"\u012f\u0131\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000"+
		"\u0131\u0132\u0005g\u0000\u0000\u0132\u001d\u0001\u0000\u0000\u0000\u0133"+
		"\u0134\u00055\u0000\u0000\u0134\u0135\u0003\u001c\u000e\u0000\u0135\u0136"+
		"\u0003\u00ba]\u0000\u0136\u001f\u0001\u0000\u0000\u0000\u0137\u016d\u0003"+
		"n7\u0000\u0138\u0139\u0005&\u0000\u0000\u0139\u013a\u0003\u0084B\u0000"+
		"\u013a\u013b\u0003 \u0010\u0000\u013b\u016d\u0001\u0000\u0000\u0000\u013c"+
		"\u013d\u0005\'\u0000\u0000\u013d\u013e\u0003\u0084B\u0000\u013e\u013f"+
		"\u0003 \u0010\u0000\u013f\u016d\u0001\u0000\u0000\u0000\u0140\u0141\u0005"+
		".\u0000\u0000\u0141\u016d\u0003\u0084B\u0000\u0142\u016d\u0003\u000e\u0007"+
		"\u0000\u0143\u016d\u0003\u0010\b\u0000\u0144\u016d\u0003N\'\u0000\u0145"+
		"\u016d\u0003t:\u0000\u0146\u016d\u0003\"\u0011\u0000\u0147\u016d\u0003"+
		"H$\u0000\u0148\u016d\u0003L&\u0000\u0149\u016d\u0003Z-\u0000\u014a\u016d"+
		"\u0003\u001e\u000f\u0000\u014b\u014c\u0003\u0084B\u0000\u014c\u014e\u0005"+
		"\t\u0000\u0000\u014d\u014f\u0003~?\u0000\u014e\u014d\u0001\u0000\u0000"+
		"\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000"+
		"\u0000\u0150\u0151\u0005\n\u0000\u0000\u0151\u016d\u0001\u0000\u0000\u0000"+
		"\u0152\u016d\u0003P(\u0000\u0153\u016d\u0003^/\u0000\u0154\u016d\u0003"+
		"R)\u0000\u0155\u016d\u0003T*\u0000\u0156\u016d\u0003l6\u0000\u0157\u016d"+
		"\u0005\u007f\u0000\u0000\u0158\u016d\u0003:\u001d\u0000\u0159\u016d\u0003"+
		",\u0016\u0000\u015a\u016d\u00030\u0018\u0000\u015b\u015c\u0003\u0084B"+
		"\u0000\u015c\u0163\u0005\u0088\u0000\u0000\u015d\u0164\u0003\u0084B\u0000"+
		"\u015e\u0160\u0005\t\u0000\u0000\u015f\u0161\u0003~?\u0000\u0160\u015f"+
		"\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0162"+
		"\u0001\u0000\u0000\u0000\u0162\u0164\u0005\n\u0000\u0000\u0163\u015d\u0001"+
		"\u0000\u0000\u0000\u0163\u015e\u0001\u0000\u0000\u0000\u0164\u016d\u0001"+
		"\u0000\u0000\u0000\u0165\u016d\u0003<\u001e\u0000\u0166\u016d\u0005/\u0000"+
		"\u0000\u0167\u016d\u0003h4\u0000\u0168\u016d\u0003j5\u0000\u0169\u016d"+
		"\u0005\u001b\u0000\u0000\u016a\u016d\u0005\u001f\u0000\u0000\u016b\u016d"+
		"\u0003\u0086C\u0000\u016c\u0137\u0001\u0000\u0000\u0000\u016c\u0138\u0001"+
		"\u0000\u0000\u0000\u016c\u013c\u0001\u0000\u0000\u0000\u016c\u0140\u0001"+
		"\u0000\u0000\u0000\u016c\u0142\u0001\u0000\u0000\u0000\u016c\u0143\u0001"+
		"\u0000\u0000\u0000\u016c\u0144\u0001\u0000\u0000\u0000\u016c\u0145\u0001"+
		"\u0000\u0000\u0000\u016c\u0146\u0001\u0000\u0000\u0000\u016c\u0147\u0001"+
		"\u0000\u0000\u0000\u016c\u0148\u0001\u0000\u0000\u0000\u016c\u0149\u0001"+
		"\u0000\u0000\u0000\u016c\u014a\u0001\u0000\u0000\u0000\u016c\u014b\u0001"+
		"\u0000\u0000\u0000\u016c\u0152\u0001\u0000\u0000\u0000\u016c\u0153\u0001"+
		"\u0000\u0000\u0000\u016c\u0154\u0001\u0000\u0000\u0000\u016c\u0155\u0001"+
		"\u0000\u0000\u0000\u016c\u0156\u0001\u0000\u0000\u0000\u016c\u0157\u0001"+
		"\u0000\u0000\u0000\u016c\u0158\u0001\u0000\u0000\u0000\u016c\u0159\u0001"+
		"\u0000\u0000\u0000\u016c\u015a\u0001\u0000\u0000\u0000\u016c\u015b\u0001"+
		"\u0000\u0000\u0000\u016c\u0165\u0001\u0000\u0000\u0000\u016c\u0166\u0001"+
		"\u0000\u0000\u0000\u016c\u0167\u0001\u0000\u0000\u0000\u016c\u0168\u0001"+
		"\u0000\u0000\u0000\u016c\u0169\u0001\u0000\u0000\u0000\u016c\u016a\u0001"+
		"\u0000\u0000\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016d!\u0001\u0000"+
		"\u0000\u0000\u016e\u016f\u0005>\u0000\u0000\u016f\u0170\u0005g\u0000\u0000"+
		"\u0170\u0171\u00038\u001c\u0000\u0171\u017c\u0005l\u0000\u0000\u0172\u0174"+
		"\u0003 \u0010\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0174\u0177\u0001"+
		"\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0176\u0001"+
		"\u0000\u0000\u0000\u0176\u0178\u0001\u0000\u0000\u0000\u0177\u0175\u0001"+
		"\u0000\u0000\u0000\u0178\u0179\u0003\u0084B\u0000\u0179\u017a\u0005*\u0000"+
		"\u0000\u017a\u017d\u0001\u0000\u0000\u0000\u017b\u017d\u0003\u0084B\u0000"+
		"\u017c\u0175\u0001\u0000\u0000\u0000\u017c\u017b\u0001\u0000\u0000\u0000"+
		"\u017d#\u0001\u0000\u0000\u0000\u017e\u017f\u0006\u0012\uffff\uffff\u0000"+
		"\u017f\u0187\u0003x<\u0000\u0180\u0181\u0005\t\u0000\u0000\u0181\u0182"+
		"\u0003$\u0012\u0000\u0182\u0183\u0005\n\u0000\u0000\u0183\u0187\u0001"+
		"\u0000\u0000\u0000\u0184\u0187\u0003&\u0013\u0000\u0185\u0187\u0003(\u0014"+
		"\u0000\u0186\u017e\u0001\u0000\u0000\u0000\u0186\u0180\u0001\u0000\u0000"+
		"\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0185\u0001\u0000\u0000"+
		"\u0000\u0187\u0191\u0001\u0000\u0000\u0000\u0188\u018b\n\u0001\u0000\u0000"+
		"\u0189\u018a\u0005i\u0000\u0000\u018a\u018c\u0003$\u0012\u0000\u018b\u0189"+
		"\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u018b"+
		"\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u0190"+
		"\u0001\u0000\u0000\u0000\u018f\u0188\u0001\u0000\u0000\u0000\u0190\u0193"+
		"\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0191\u0192"+
		"\u0001\u0000\u0000\u0000\u0192%\u0001\u0000\u0000\u0000\u0193\u0191\u0001"+
		"\u0000\u0000\u0000\u0194\u0195\u0003x<\u0000\u0195\u0196\u0005\u0005\u0000"+
		"\u0000\u0196\u0197\u0003*\u0015\u0000\u0197\u0198\u0005\u0006\u0000\u0000"+
		"\u0198\'\u0001\u0000\u0000\u0000\u0199\u01a3\u0003x<\u0000\u019a\u019b"+
		"\u0005r\u0000\u0000\u019b\u019c\u0003$\u0012\u0000\u019c\u019d\u0005v"+
		"\u0000\u0000\u019d\u019e\u0003$\u0012\u0000\u019e\u01a4\u0001\u0000\u0000"+
		"\u0000\u019f\u01a0\u0005r\u0000\u0000\u01a0\u01a4\u0003$\u0012\u0000\u01a1"+
		"\u01a2\u0005v\u0000\u0000\u01a2\u01a4\u0003$\u0012\u0000\u01a3\u019a\u0001"+
		"\u0000\u0000\u0000\u01a3\u019f\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001"+
		"\u0000\u0000\u0000\u01a4)\u0001\u0000\u0000\u0000\u01a5\u01aa\u0003$\u0012"+
		"\u0000\u01a6\u01a7\u0005\r\u0000\u0000\u01a7\u01a9\u0003$\u0012\u0000"+
		"\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a9\u01ac\u0001\u0000\u0000\u0000"+
		"\u01aa\u01a8\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000"+
		"\u01ab+\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ad"+
		"\u01ae\u0005Y\u0000\u0000\u01ae\u01b1\u0003x<\u0000\u01af\u01b0\u0005"+
		"r\u0000\u0000\u01b0\u01b2\u0003x<\u0000\u01b1\u01af\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b7\u0005\u0007\u0000\u0000\u01b4\u01b6\u00036\u001b\u0000"+
		"\u01b5\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b9\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000"+
		"\u01b8\u01ba\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000"+
		"\u01ba\u01bb\u0005\b\u0000\u0000\u01bb-\u0001\u0000\u0000\u0000\u01bc"+
		"\u01bd\u0005\u001e\u0000\u0000\u01bd\u01c0\u0003x<\u0000\u01be\u01bf\u0005"+
		"r\u0000\u0000\u01bf\u01c1\u0003x<\u0000\u01c0\u01be\u0001\u0000\u0000"+
		"\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1\u01cb\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c3\u0005v\u0000\u0000\u01c3\u01c8\u0003$\u0012\u0000\u01c4"+
		"\u01c5\u0005\r\u0000\u0000\u01c5\u01c7\u0003$\u0012\u0000\u01c6\u01c4"+
		"\u0001\u0000\u0000\u0000\u01c7\u01ca\u0001\u0000\u0000\u0000\u01c8\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01cc"+
		"\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01cb\u01c2"+
		"\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc/\u0001"+
		"\u0000\u0000\u0000\u01cd\u01cf\u0003p8\u0000\u01ce\u01cd\u0001\u0000\u0000"+
		"\u0000\u01cf\u01d2\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000"+
		"\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d3\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d3\u01d4\u0003.\u0017\u0000"+
		"\u01d4\u01d8\u0005\u0007\u0000\u0000\u01d5\u01d7\u00034\u001a\u0000\u01d6"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d7\u01da\u0001\u0000\u0000\u0000\u01d8"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9"+
		"\u01db\u0001\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01db"+
		"\u01dc\u0005\b\u0000\u0000\u01dc1\u0001\u0000\u0000\u0000\u01dd\u01de"+
		"\u0007\u0000\u0000\u0000\u01de3\u0001\u0000\u0000\u0000\u01df\u01e8\u0003"+
		"H$\u0000\u01e0\u01e2\u00032\u0019\u0000\u01e1\u01e0\u0001\u0000\u0000"+
		"\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e5\u0001\u0000\u0000"+
		"\u0000\u01e3\u01e6\u0003\u001e\u000f\u0000\u01e4\u01e6\u0003t:\u0000\u01e5"+
		"\u01e3\u0001\u0000\u0000\u0000\u01e5\u01e4\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e8\u0001\u0000\u0000\u0000\u01e7\u01df\u0001\u0000\u0000\u0000\u01e7"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e85\u0001\u0000\u0000\u0000\u01e9\u01ea"+
		"\u0005g\u0000\u0000\u01ea\u01eb\u00038\u001c\u0000\u01eb7\u0001\u0000"+
		"\u0000\u0000\u01ec\u01ee\u0003B!\u0000\u01ed\u01ec\u0001\u0000\u0000\u0000"+
		"\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee\u01f4\u0001\u0000\u0000\u0000"+
		"\u01ef\u01f1\u0005\t\u0000\u0000\u01f0\u01f2\u0003\u00b2Y\u0000\u01f1"+
		"\u01f0\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2"+
		"\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f5\u0005\n\u0000\u0000\u01f4\u01ef"+
		"\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f6"+
		"\u0001\u0000\u0000\u0000\u01f6\u01f7\u0003\u00b6[\u0000\u01f79\u0001\u0000"+
		"\u0000\u0000\u01f8\u01f9\u0005\\\u0000\u0000\u01f9\u01fc\u0003$\u0012"+
		"\u0000\u01fa\u01fb\u0005r\u0000\u0000\u01fb\u01fd\u0003$\u0012\u0000\u01fc"+
		"\u01fa\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd"+
		"\u0201\u0001\u0000\u0000\u0000\u01fe\u0202\u0003*\u0015\u0000\u01ff\u0200"+
		"\u0005l\u0000\u0000\u0200\u0202\u0003$\u0012\u0000\u0201\u01fe\u0001\u0000"+
		"\u0000\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0202;\u0001\u0000\u0000"+
		"\u0000\u0203\u0205\u0003p8\u0000\u0204\u0203\u0001\u0000\u0000\u0000\u0205"+
		"\u0208\u0001\u0000\u0000\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0206"+
		"\u0207\u0001\u0000\u0000\u0000\u0207\u0209\u0001\u0000\u0000\u0000\u0208"+
		"\u0206\u0001\u0000\u0000\u0000\u0209\u020a\u0005Q\u0000\u0000\u020a\u020d"+
		"\u0005g\u0000\u0000\u020b\u020c\u0005r\u0000\u0000\u020c\u020e\u0003\u001c"+
		"\u000e\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020d\u020e\u0001\u0000"+
		"\u0000\u0000\u020e\u0218\u0001\u0000\u0000\u0000\u020f\u0210\u0005v\u0000"+
		"\u0000\u0210\u0215\u0003\u001c\u000e\u0000\u0211\u0212\u0005\r\u0000\u0000"+
		"\u0212\u0214\u0003\u001c\u000e\u0000\u0213\u0211\u0001\u0000\u0000\u0000"+
		"\u0214\u0217\u0001\u0000\u0000\u0000\u0215\u0213\u0001\u0000\u0000\u0000"+
		"\u0215\u0216\u0001\u0000\u0000\u0000\u0216\u0219\u0001\u0000\u0000\u0000"+
		"\u0217\u0215\u0001\u0000\u0000\u0000\u0218\u020f\u0001\u0000\u0000\u0000"+
		"\u0218\u0219\u0001\u0000\u0000\u0000\u0219\u021a\u0001\u0000\u0000\u0000"+
		"\u021a\u021b\u0005\u0007\u0000\u0000\u021b\u021c\u0003@ \u0000\u021c\u021d"+
		"\u0005\b\u0000\u0000\u021d=\u0001\u0000\u0000\u0000\u021e\u021f\u0003"+
		"\u00b0X\u0000\u021f\u0220\u0003|>\u0000\u0220\u0224\u0001\u0000\u0000"+
		"\u0000\u0221\u0224\u0003H$\u0000\u0222\u0224\u0003\u001e\u000f\u0000\u0223"+
		"\u021e\u0001\u0000\u0000\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0223"+
		"\u0222\u0001\u0000\u0000\u0000\u0224?\u0001\u0000\u0000\u0000\u0225\u0227"+
		"\u0003>\u001f\u0000\u0226\u0225\u0001\u0000\u0000\u0000\u0227\u022a\u0001"+
		"\u0000\u0000\u0000\u0228\u0226\u0001\u0000\u0000\u0000\u0228\u0229\u0001"+
		"\u0000\u0000\u0000\u0229A\u0001\u0000\u0000\u0000\u022a\u0228\u0001\u0000"+
		"\u0000\u0000\u022b\u022c\u0005\u0007\u0000\u0000\u022c\u0231\u0003D\""+
		"\u0000\u022d\u022e\u0005\r\u0000\u0000\u022e\u0230\u0003D\"\u0000\u022f"+
		"\u022d\u0001\u0000\u0000\u0000\u0230\u0233\u0001\u0000\u0000\u0000\u0231"+
		"\u022f\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232"+
		"\u0234\u0001\u0000\u0000\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0234"+
		"\u0235\u0005\b\u0000\u0000\u0235C\u0001\u0000\u0000\u0000\u0236\u023b"+
		"\u0003F#\u0000\u0237\u0238\u0005\r\u0000\u0000\u0238\u023a\u0003F#\u0000"+
		"\u0239\u0237\u0001\u0000\u0000\u0000\u023a\u023d\u0001\u0000\u0000\u0000"+
		"\u023b\u0239\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000"+
		"\u023c\u023e\u0001\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000\u0000"+
		"\u023e\u023f\u0005\u001a\u0000\u0000\u023f\u0240\u0005g\u0000\u0000\u0240"+
		"E\u0001\u0000\u0000\u0000\u0241\u0245\u0003\u00be_\u0000\u0242\u0245\u0003"+
		"\u00cae\u0000\u0243\u0245\u0003\u00c6c\u0000\u0244\u0241\u0001\u0000\u0000"+
		"\u0000\u0244\u0242\u0001\u0000\u0000\u0000\u0244\u0243\u0001\u0000\u0000"+
		"\u0000\u0245G\u0001\u0000\u0000\u0000\u0246\u0248\u0003J%\u0000\u0247"+
		"\u0246\u0001\u0000\u0000\u0000\u0247\u0248\u0001\u0000\u0000\u0000\u0248"+
		"\u024a\u0001\u0000\u0000\u0000\u0249\u024b\u0005J\u0000\u0000\u024a\u0249"+
		"\u0001\u0000\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b\u024e"+
		"\u0001\u0000\u0000\u0000\u024c\u024d\u0005H\u0000\u0000\u024d\u024f\u0003"+
		"$\u0012\u0000\u024e\u024c\u0001\u0000\u0000\u0000\u024e\u024f\u0001\u0000"+
		"\u0000\u0000\u024f\u0250\u0001\u0000\u0000\u0000\u0250\u0251\u0003F#\u0000"+
		"\u0251\u0252\u0003\u00b8\\\u0000\u0252I\u0001\u0000\u0000\u0000\u0253"+
		"\u0254\u0007\u0001\u0000\u0000\u0254K\u0001\u0000\u0000\u0000\u0255\u0256"+
		"\u0005\u0019\u0000\u0000\u0256\u0257\u0005g\u0000\u0000\u0257\u025e\u0005"+
		"\u0007\u0000\u0000\u0258\u025a\u0005K\u0000\u0000\u0259\u0258\u0001\u0000"+
		"\u0000\u0000\u0259\u025a\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000"+
		"\u0000\u0000\u025b\u025d\u0003\u00b4Z\u0000\u025c\u0259\u0001\u0000\u0000"+
		"\u0000\u025d\u0260\u0001\u0000\u0000\u0000\u025e\u025c\u0001\u0000\u0000"+
		"\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025f\u0261\u0001\u0000\u0000"+
		"\u0000\u0260\u025e\u0001\u0000\u0000\u0000\u0261\u0262\u0005T\u0000\u0000"+
		"\u0262\u0263\u0003\u0084B\u0000\u0263\u0264\u0005\b\u0000\u0000\u0264"+
		"M\u0001\u0000\u0000\u0000\u0265\u0266\u0003~?\u0000\u0266\u0267\u0005"+
		"l\u0000\u0000\u0267\u0268\u0003~?\u0000\u0268O\u0001\u0000\u0000\u0000"+
		"\u0269\u026a\u0005%\u0000\u0000\u026a\u026b\u0003\u001a\r\u0000\u026b"+
		"\u026c\u0005(\u0000\u0000\u026cQ\u0001\u0000\u0000\u0000\u026d\u026e\u0003"+
		"\u0084B\u0000\u026e\u026f\u0003\u00c2a\u0000\u026fS\u0001\u0000\u0000"+
		"\u0000\u0270\u0271\u00057\u0000\u0000\u0271\u0272\u0003\u0084B\u0000\u0272"+
		"\u0274\u0003V+\u0000\u0273\u0275\u0003X,\u0000\u0274\u0273\u0001\u0000"+
		"\u0000\u0000\u0274\u0275\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000"+
		"\u0000\u0000\u0276\u0277\u0005*\u0000\u0000\u0277U\u0001\u0000\u0000\u0000"+
		"\u0278\u027a\u0005V\u0000\u0000\u0279\u0278\u0001\u0000\u0000\u0000\u0279"+
		"\u027a\u0001\u0000\u0000\u0000\u027a\u027b\u0001\u0000\u0000\u0000\u027b"+
		"\u027c\u0003\u001a\r\u0000\u027cW\u0001\u0000\u0000\u0000\u027d\u027e"+
		"\u0005)\u0000\u0000\u027e\u027f\u0003\u001a\r\u0000\u027fY\u0001\u0000"+
		"\u0000\u0000\u0280\u0283\u00054\u0000\u0000\u0281\u0284\u0005\u0018\u0000"+
		"\u0000\u0282\u0284\u0003\\.\u0000\u0283\u0281\u0001\u0000\u0000\u0000"+
		"\u0283\u0282\u0001\u0000\u0000\u0000\u0284[\u0001\u0000\u0000\u0000\u0285"+
		"\u028a\u0005g\u0000\u0000\u0286\u0287\u0005\r\u0000\u0000\u0287\u0289"+
		"\u0005g\u0000\u0000\u0288\u0286\u0001\u0000\u0000\u0000\u0289\u028c\u0001"+
		"\u0000\u0000\u0000\u028a\u0288\u0001\u0000\u0000\u0000\u028a\u028b\u0001"+
		"\u0000\u0000\u0000\u028b]\u0001\u0000\u0000\u0000\u028c\u028a\u0001\u0000"+
		"\u0000\u0000\u028d\u0291\u0003`0\u0000\u028e\u0291\u0003b1\u0000\u028f"+
		"\u0291\u0003d2\u0000\u0290\u028d\u0001\u0000\u0000\u0000\u0290\u028e\u0001"+
		"\u0000\u0000\u0000\u0290\u028f\u0001\u0000\u0000\u0000\u0291_\u0001\u0000"+
		"\u0000\u0000\u0292\u0293\u00053\u0000\u0000\u0293\u0296\u0007\u0002\u0000"+
		"\u0000\u0294\u0295\u0005\r\u0000\u0000\u0295\u0297\u0007\u0002\u0000\u0000"+
		"\u0296\u0294\u0001\u0000\u0000\u0000\u0296\u0297\u0001\u0000\u0000\u0000"+
		"\u0297\u0298\u0001\u0000\u0000\u0000\u0298\u0299\u0003f3\u0000\u0299\u029a"+
		"\u0003\u0084B\u0000\u029a\u029b\u0003 \u0010\u0000\u029ba\u0001\u0000"+
		"\u0000\u0000\u029c\u029d\u0005c\u0000\u0000\u029d\u029e\u0003\u0084B\u0000"+
		"\u029e\u029f\u0003 \u0010\u0000\u029fc\u0001\u0000\u0000\u0000\u02a0\u02a1"+
		"\u0005R\u0000\u0000\u02a1\u02a2\u0003 \u0010\u0000\u02a2\u02a3\u0005^"+
		"\u0000\u0000\u02a3\u02a4\u0003\u0084B\u0000\u02a4e\u0001\u0000\u0000\u0000"+
		"\u02a5\u02a6\u0007\u0003\u0000\u0000\u02a6g\u0001\u0000\u0000\u0000\u02a7"+
		"\u02a9\u0005T\u0000\u0000\u02a8\u02aa\u0003\u0084B\u0000\u02a9\u02a8\u0001"+
		"\u0000\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000\u0000\u02aai\u0001\u0000"+
		"\u0000\u0000\u02ab\u02ac\u0005e\u0000\u0000\u02ac\u02ad\u0003~?\u0000"+
		"\u02adk\u0001\u0000\u0000\u0000\u02ae\u02af\u0005[\u0000\u0000\u02af\u02b0"+
		"\u0003 \u0010\u0000\u02b0\u02b1\u0005\u001d\u0000\u0000\u02b1\u02b3\u0003"+
		" \u0010\u0000\u02b2\u02b4\u0005*\u0000\u0000\u02b3\u02b2\u0001\u0000\u0000"+
		"\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4m\u0001\u0000\u0000\u0000"+
		"\u02b5\u02b6\u0005#\u0000\u0000\u02b6\u02b9\u0003\u0084B\u0000\u02b7\u02b8"+
		"\u0005d\u0000\u0000\u02b8\u02ba\u0003\u00b0X\u0000\u02b9\u02b7\u0001\u0000"+
		"\u0000\u0000\u02b9\u02ba\u0001\u0000\u0000\u0000\u02bao\u0001\u0000\u0000"+
		"\u0000\u02bb\u02bc\u0005\u0001\u0000\u0000\u02bc\u02c1\u0005g\u0000\u0000"+
		"\u02bd\u02be\u0005\t\u0000\u0000\u02be\u02bf\u0003\u0098L\u0000\u02bf"+
		"\u02c0\u0005\n\u0000\u0000\u02c0\u02c2\u0001\u0000\u0000\u0000\u02c1\u02bd"+
		"\u0001\u0000\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2q\u0001"+
		"\u0000\u0000\u0000\u02c3\u02c5\u0005g\u0000\u0000\u02c4\u02c6\u0003|>"+
		"\u0000\u02c5\u02c4\u0001\u0000\u0000\u0000\u02c5\u02c6\u0001\u0000\u0000"+
		"\u0000\u02c6\u02c9\u0001\u0000\u0000\u0000\u02c7\u02c8\u0005l\u0000\u0000"+
		"\u02c8\u02ca\u0003\u0084B\u0000\u02c9\u02c7\u0001\u0000\u0000\u0000\u02c9"+
		"\u02ca\u0001\u0000\u0000\u0000\u02cas\u0001\u0000\u0000\u0000\u02cb\u02cc"+
		"\u0003v;\u0000\u02cc\u02d1\u0003r9\u0000\u02cd\u02ce\u0005\r\u0000\u0000"+
		"\u02ce\u02d0\u0003r9\u0000\u02cf\u02cd\u0001\u0000\u0000\u0000\u02d0\u02d3"+
		"\u0001\u0000\u0000\u0000\u02d1\u02cf\u0001\u0000\u0000\u0000\u02d1\u02d2"+
		"\u0001\u0000\u0000\u0000\u02d2u\u0001\u0000\u0000\u0000\u02d3\u02d1\u0001"+
		"\u0000\u0000\u0000\u02d4\u02d5\u0007\u0004\u0000\u0000\u02d5w\u0001\u0000"+
		"\u0000\u0000\u02d6\u02d7\u0003\u001c\u000e\u0000\u02d7y\u0001\u0000\u0000"+
		"\u0000\u02d8\u02d9\u0005\u0017\u0000\u0000\u02d9\u02da\u0003\u001c\u000e"+
		"\u0000\u02da\u02db\u0005\u001a\u0000\u0000\u02db\u02e0\u0005g\u0000\u0000"+
		"\u02dc\u02dd\u0005\r\u0000\u0000\u02dd\u02df\u0005g\u0000\u0000\u02de"+
		"\u02dc\u0001\u0000\u0000\u0000\u02df\u02e2\u0001\u0000\u0000\u0000\u02e0"+
		"\u02de\u0001\u0000\u0000\u0000\u02e0\u02e1\u0001\u0000\u0000\u0000\u02e1"+
		"{\u0001\u0000\u0000\u0000\u02e2\u02e0\u0001\u0000\u0000\u0000\u02e3\u02e4"+
		"\u0005\u0089\u0000\u0000\u02e4\u02e5\u0003$\u0012\u0000\u02e5}\u0001\u0000"+
		"\u0000\u0000\u02e6\u02eb\u0003\u0084B\u0000\u02e7\u02e8\u0005\r\u0000"+
		"\u0000\u02e8\u02ea\u0003\u0084B\u0000\u02e9\u02e7\u0001\u0000\u0000\u0000"+
		"\u02ea\u02ed\u0001\u0000\u0000\u0000\u02eb\u02e9\u0001\u0000\u0000\u0000"+
		"\u02eb\u02ec\u0001\u0000\u0000\u0000\u02ec\u007f\u0001\u0000\u0000\u0000"+
		"\u02ed\u02eb\u0001\u0000\u0000\u0000\u02ee\u02ef\u0005\u0005\u0000\u0000"+
		"\u02ef\u02f0\u0003\u0084B\u0000\u02f0\u02f1\u0005\u0006\u0000\u0000\u02f1"+
		"\u0081\u0001\u0000\u0000\u0000\u02f2\u02f5\u0005\u000f\u0000\u0000\u02f3"+
		"\u02f6\u0005g\u0000\u0000\u02f4\u02f6\u0003\u00b0X\u0000\u02f5\u02f3\u0001"+
		"\u0000\u0000\u0000\u02f5\u02f4\u0001\u0000\u0000\u0000\u02f6\u0083\u0001"+
		"\u0000\u0000\u0000\u02f7\u02f8\u0006B\uffff\uffff\u0000\u02f8\u032e\u0003"+
		"\u001c\u000e\u0000\u02f9\u02fa\u0005h\u0000\u0000\u02fa\u032e\u0003\u001c"+
		"\u000e\u0000\u02fb\u032e\u0005W\u0000\u0000\u02fc\u02fd\u0005\u007f\u0000"+
		"\u0000\u02fd\u032e\u0003\u0084B\u001c\u02fe\u032e\u0003\u00a2Q\u0000\u02ff"+
		"\u032e\u0003$\u0012\u0000\u0300\u032e\u0003P(\u0000\u0301\u0302\u0005"+
		"\u0083\u0000\u0000\u0302\u032e\u0003\u0084B\u0018\u0303\u0304\u0005D\u0000"+
		"\u0000\u0304\u0305\u0003\u0084B\u0000\u0305\u0307\u0005\t\u0000\u0000"+
		"\u0306\u0308\u0003~?\u0000\u0307\u0306\u0001\u0000\u0000\u0000\u0307\u0308"+
		"\u0001\u0000\u0000\u0000\u0308\u0309\u0001\u0000\u0000\u0000\u0309\u030a"+
		"\u0005\n\u0000\u0000\u030a\u032e\u0001\u0000\u0000\u0000\u030b\u030e\u0005"+
		",\u0000\u0000\u030c\u030f\u0003\u0084B\u0000\u030d\u030f\u0003\u001a\r"+
		"\u0000\u030e\u030c\u0001\u0000\u0000\u0000\u030e\u030d\u0001\u0000\u0000"+
		"\u0000\u030f\u032e\u0001\u0000\u0000\u0000\u0310\u0313\u0005.\u0000\u0000"+
		"\u0311\u0314\u0003\u0084B\u0000\u0312\u0314\u0003 \u0010\u0000\u0313\u0311"+
		"\u0001\u0000\u0000\u0000\u0313\u0312\u0001\u0000\u0000\u0000\u0314\u032e"+
		"\u0001\u0000\u0000\u0000\u0315\u0318\u0005.\u0000\u0000\u0316\u0319\u0003"+
		"\u0084B\u0000\u0317\u0319\u0003 \u0010\u0000\u0318\u0316\u0001\u0000\u0000"+
		"\u0000\u0318\u0317\u0001\u0000\u0000\u0000\u0319\u032e\u0001\u0000\u0000"+
		"\u0000\u031a\u032e\u0003\u0088D\u0000\u031b\u032e\u0003\u008eG\u0000\u031c"+
		"\u032e\u0003\u0090H\u0000\u031d\u032e\u0003\u008cF\u0000\u031e\u032e\u0003"+
		"\u0094J\u0000\u031f\u032e\u0003\u009aM\u0000\u0320\u032e\u0003\u00b8\\"+
		"\u0000\u0321\u0322\u0003\u00cae\u0000\u0322\u0323\u0003\u0084B\n\u0323"+
		"\u032e\u0001\u0000\u0000\u0000\u0324\u0325\u0005\t\u0000\u0000\u0325\u0326"+
		"\u0003\u0084B\u0000\u0326\u0327\u0005\n\u0000\u0000\u0327\u032e\u0001"+
		"\u0000\u0000\u0000\u0328\u0329\u0005]\u0000\u0000\u0329\u032e\u0003\u0084"+
		"B\u0005\u032a\u032b\u0005 \u0000\u0000\u032b\u032e\u0003~?\u0000\u032c"+
		"\u032e\u0003\u0086C\u0000\u032d\u02f7\u0001\u0000\u0000\u0000\u032d\u02f9"+
		"\u0001\u0000\u0000\u0000\u032d\u02fb\u0001\u0000\u0000\u0000\u032d\u02fc"+
		"\u0001\u0000\u0000\u0000\u032d\u02fe\u0001\u0000\u0000\u0000\u032d\u02ff"+
		"\u0001\u0000\u0000\u0000\u032d\u0300\u0001\u0000\u0000\u0000\u032d\u0301"+
		"\u0001\u0000\u0000\u0000\u032d\u0303\u0001\u0000\u0000\u0000\u032d\u030b"+
		"\u0001\u0000\u0000\u0000\u032d\u0310\u0001\u0000\u0000\u0000\u032d\u0315"+
		"\u0001\u0000\u0000\u0000\u032d\u031a\u0001\u0000\u0000\u0000\u032d\u031b"+
		"\u0001\u0000\u0000\u0000\u032d\u031c\u0001\u0000\u0000\u0000\u032d\u031d"+
		"\u0001\u0000\u0000\u0000\u032d\u031e\u0001\u0000\u0000\u0000\u032d\u031f"+
		"\u0001\u0000\u0000\u0000\u032d\u0320\u0001\u0000\u0000\u0000\u032d\u0321"+
		"\u0001\u0000\u0000\u0000\u032d\u0324\u0001\u0000\u0000\u0000\u032d\u0328"+
		"\u0001\u0000\u0000\u0000\u032d\u032a\u0001\u0000\u0000\u0000\u032d\u032c"+
		"\u0001\u0000\u0000\u0000\u032e\u0367\u0001\u0000\u0000\u0000\u032f\u0330"+
		"\n\u0017\u0000\u0000\u0330\u0331\u0005o\u0000\u0000\u0331\u0366\u0003"+
		"\u0084B\u0018\u0332\u0333\n\t\u0000\u0000\u0333\u0334\u0003\u00be_\u0000"+
		"\u0334\u0335\u0003\u0084B\n\u0335\u0366\u0001\u0000\u0000\u0000\u0336"+
		"\u0339\n\u0007\u0000\u0000\u0337\u033a\u00059\u0000\u0000\u0338\u033a"+
		"\u0005F\u0000\u0000\u0339\u0337\u0001\u0000\u0000\u0000\u0339\u0338\u0001"+
		"\u0000\u0000\u0000\u033a\u033b\u0001\u0000\u0000\u0000\u033b\u0366\u0003"+
		"\u0084B\b\u033c\u033d\n\u0003\u0000\u0000\u033d\u033e\u0005;\u0000\u0000"+
		"\u033e\u0366\u0003\u0084B\u0004\u033f\u0340\n \u0000\u0000\u0340\u0341"+
		"\u0005b\u0000\u0000\u0341\u0346\u0003t:\u0000\u0342\u0343\u0005\r\u0000"+
		"\u0000\u0343\u0345\u0003t:\u0000\u0344\u0342\u0001\u0000\u0000\u0000\u0345"+
		"\u0348\u0001\u0000\u0000\u0000\u0346\u0344\u0001\u0000\u0000\u0000\u0346"+
		"\u0347\u0001\u0000\u0000\u0000\u0347\u0366\u0001\u0000\u0000\u0000\u0348"+
		"\u0346\u0001\u0000\u0000\u0000\u0349\u034a\n\u001e\u0000\u0000\u034a\u0351"+
		"\u0005\u0088\u0000\u0000\u034b\u0352\u0003\u0084B\u0000\u034c\u034e\u0005"+
		"\t\u0000\u0000\u034d\u034f\u0003~?\u0000\u034e\u034d\u0001\u0000\u0000"+
		"\u0000\u034e\u034f\u0001\u0000\u0000\u0000\u034f\u0350\u0001\u0000\u0000"+
		"\u0000\u0350\u0352\u0005\n\u0000\u0000\u0351\u034b\u0001\u0000\u0000\u0000"+
		"\u0351\u034c\u0001\u0000\u0000\u0000\u0352\u0366\u0001\u0000\u0000\u0000"+
		"\u0353\u0356\n\u0012\u0000\u0000\u0354\u0357\u0003\u0080@\u0000\u0355"+
		"\u0357\u0003\u0082A\u0000\u0356\u0354\u0001\u0000\u0000\u0000\u0356\u0355"+
		"\u0001\u0000\u0000\u0000\u0357\u0366\u0001\u0000\u0000\u0000\u0358\u0359"+
		"\n\b\u0000\u0000\u0359\u035b\u0005\t\u0000\u0000\u035a\u035c\u0003~?\u0000"+
		"\u035b\u035a\u0001\u0000\u0000\u0000\u035b\u035c\u0001\u0000\u0000\u0000"+
		"\u035c\u035d\u0001\u0000\u0000\u0000\u035d\u0366\u0005\n\u0000\u0000\u035e"+
		"\u035f\n\u0002\u0000\u0000\u035f\u0360\u0005\u0090\u0000\u0000\u0360\u0363"+
		"\u0003\u0084B\u0000\u0361\u0362\u0005\f\u0000\u0000\u0362\u0364\u0003"+
		"\u0084B\u0000\u0363\u0361\u0001\u0000\u0000\u0000\u0363\u0364\u0001\u0000"+
		"\u0000\u0000\u0364\u0366\u0001\u0000\u0000\u0000\u0365\u032f\u0001\u0000"+
		"\u0000\u0000\u0365\u0332\u0001\u0000\u0000\u0000\u0365\u0336\u0001\u0000"+
		"\u0000\u0000\u0365\u033c\u0001\u0000\u0000\u0000\u0365\u033f\u0001\u0000"+
		"\u0000\u0000\u0365\u0349\u0001\u0000\u0000\u0000\u0365\u0353\u0001\u0000"+
		"\u0000\u0000\u0365\u0358\u0001\u0000\u0000\u0000\u0365\u035e\u0001\u0000"+
		"\u0000\u0000\u0366\u0369\u0001\u0000\u0000\u0000\u0367\u0365\u0001\u0000"+
		"\u0000\u0000\u0367\u0368\u0001\u0000\u0000\u0000\u0368\u0085\u0001\u0000"+
		"\u0000\u0000\u0369\u0367\u0001\u0000\u0000\u0000\u036a\u036b\u0005?\u0000"+
		"\u0000\u036b\u036c\u0003\u0084B\u0000\u036c\u036e\u0005X\u0000\u0000\u036d"+
		"\u036f\u0003\u00a0P\u0000\u036e\u036d\u0001\u0000\u0000\u0000\u036f\u0370"+
		"\u0001\u0000\u0000\u0000\u0370\u036e\u0001\u0000\u0000\u0000\u0370\u0371"+
		"\u0001\u0000\u0000\u0000\u0371\u0373\u0001\u0000\u0000\u0000\u0372\u0374"+
		"\u0003\u009eO\u0000\u0373\u0372\u0001\u0000\u0000\u0000\u0373\u0374\u0001"+
		"\u0000\u0000\u0000\u0374\u0087\u0001\u0000\u0000\u0000\u0375\u037e\u0005"+
		"\u0005\u0000\u0000\u0376\u037b\u0003\u008aE\u0000\u0377\u0378\u0005\r"+
		"\u0000\u0000\u0378\u037a\u0003\u008aE\u0000\u0379\u0377\u0001\u0000\u0000"+
		"\u0000\u037a\u037d\u0001\u0000\u0000\u0000\u037b\u0379\u0001\u0000\u0000"+
		"\u0000\u037b\u037c\u0001\u0000\u0000\u0000\u037c\u037f\u0001\u0000\u0000"+
		"\u0000\u037d\u037b\u0001\u0000\u0000\u0000\u037e\u0376\u0001\u0000\u0000"+
		"\u0000\u037e\u037f\u0001\u0000\u0000\u0000\u037f\u0380\u0001\u0000\u0000"+
		"\u0000\u0380\u0381\u0005\u0006\u0000\u0000\u0381\u0089\u0001\u0000\u0000"+
		"\u0000\u0382\u0384\u0005\u007f\u0000\u0000\u0383\u0382\u0001\u0000\u0000"+
		"\u0000\u0383\u0384\u0001\u0000\u0000\u0000\u0384\u0385\u0001\u0000\u0000"+
		"\u0000\u0385\u0386\u0003\u0084B\u0000\u0386\u008b\u0001\u0000\u0000\u0000"+
		"\u0387\u0390\u0005\u0007\u0000\u0000\u0388\u038d\u0003\u008aE\u0000\u0389"+
		"\u038a\u0005\r\u0000\u0000\u038a\u038c\u0003\u008aE\u0000\u038b\u0389"+
		"\u0001\u0000\u0000\u0000\u038c\u038f\u0001\u0000\u0000\u0000\u038d\u038b"+
		"\u0001\u0000\u0000\u0000\u038d\u038e\u0001\u0000\u0000\u0000\u038e\u0391"+
		"\u0001\u0000\u0000\u0000\u038f\u038d\u0001\u0000\u0000\u0000\u0390\u0388"+
		"\u0001\u0000\u0000\u0000\u0390\u0391\u0001\u0000\u0000\u0000\u0391\u0392"+
		"\u0001\u0000\u0000\u0000\u0392\u0393\u0005\b\u0000\u0000\u0393\u008d\u0001"+
		"\u0000\u0000\u0000\u0394\u0395\u0005\u0005\u0000\u0000\u0395\u0398\u0003"+
		"\u0084B\u0000\u0396\u0397\u0005\r\u0000\u0000\u0397\u0399\u0003\u0084"+
		"B\u0000\u0398\u0396\u0001\u0000\u0000\u0000\u0398\u0399\u0001\u0000\u0000"+
		"\u0000\u0399\u039a\u0001\u0000\u0000\u0000\u039a\u039b\u0005\u0082\u0000"+
		"\u0000\u039b\u039e\u0003\u0084B\u0000\u039c\u039d\u0005\u0092\u0000\u0000"+
		"\u039d\u039f\u0005\u0083\u0000\u0000\u039e\u039c\u0001\u0000\u0000\u0000"+
		"\u039e\u039f\u0001\u0000\u0000\u0000\u039f\u03a0\u0001\u0000\u0000\u0000"+
		"\u03a0\u03a1\u0005\u0006\u0000\u0000\u03a1\u008f\u0001\u0000\u0000\u0000"+
		"\u03a2\u03a6\u0005\u0005\u0000\u0000\u03a3\u03a4\u0003\u0084B\u0000\u03a4"+
		"\u03a5\u0005G\u0000\u0000\u03a5\u03a7\u0001\u0000\u0000\u0000\u03a6\u03a3"+
		"\u0001\u0000\u0000\u0000\u03a6\u03a7\u0001\u0000\u0000\u0000\u03a7\u03a8"+
		"\u0001\u0000\u0000\u0000\u03a8\u03a9\u0005g\u0000\u0000\u03a9\u03aa\u0003"+
		"f3\u0000\u03aa\u03ad\u0003\u0084B\u0000\u03ab\u03ac\u00057\u0000\u0000"+
		"\u03ac\u03ae\u0003\u0084B\u0000\u03ad\u03ab\u0001\u0000\u0000\u0000\u03ad"+
		"\u03ae\u0001\u0000\u0000\u0000\u03ae\u03af\u0001\u0000\u0000\u0000\u03af"+
		"\u03b0\u0005\u0006\u0000\u0000\u03b0\u0091\u0001\u0000\u0000\u0000\u03b1"+
		"\u03b2\u0005\u007f\u0000\u0000\u03b2\u03b8\u0003\u0084B\u0000\u03b3\u03b4"+
		"\u0003\u0084B\u0000\u03b4\u03b5\u0005\f\u0000\u0000\u03b5\u03b6\u0003"+
		"\u0084B\u0000\u03b6\u03b8\u0001\u0000\u0000\u0000\u03b7\u03b1\u0001\u0000"+
		"\u0000\u0000\u03b7\u03b3\u0001\u0000\u0000\u0000\u03b8\u0093\u0001\u0000"+
		"\u0000\u0000\u03b9\u03ba\u0005\u0005\u0000\u0000\u03ba\u03bf\u0003\u0092"+
		"I\u0000\u03bb\u03bc\u0005\r\u0000\u0000\u03bc\u03be\u0003\u0092I\u0000"+
		"\u03bd\u03bb\u0001\u0000\u0000\u0000\u03be\u03c1\u0001\u0000\u0000\u0000"+
		"\u03bf\u03bd\u0001\u0000\u0000\u0000\u03bf\u03c0\u0001\u0000\u0000\u0000"+
		"\u03c0\u03c2\u0001\u0000\u0000\u0000\u03c1\u03bf\u0001\u0000\u0000\u0000"+
		"\u03c2\u03c3\u0005\u0006\u0000\u0000\u03c3\u0095\u0001\u0000\u0000\u0000"+
		"\u03c4\u03c7\u0005g\u0000\u0000\u03c5\u03c7\u0003\u00b0X\u0000\u03c6\u03c4"+
		"\u0001\u0000\u0000\u0000\u03c6\u03c5\u0001\u0000\u0000\u0000\u03c7\u03c8"+
		"\u0001\u0000\u0000\u0000\u03c8\u03c9\u0005\f\u0000\u0000\u03c9\u03ca\u0003"+
		"\u0084B\u0000\u03ca\u0097\u0001\u0000\u0000\u0000\u03cb\u03d0\u0003\u0096"+
		"K\u0000\u03cc\u03cd\u0005\r\u0000\u0000\u03cd\u03cf\u0003\u0096K\u0000"+
		"\u03ce\u03cc\u0001\u0000\u0000\u0000\u03cf\u03d2\u0001\u0000\u0000\u0000"+
		"\u03d0\u03ce\u0001\u0000\u0000\u0000\u03d0\u03d1\u0001\u0000\u0000\u0000"+
		"\u03d1\u0099\u0001\u0000\u0000\u0000\u03d2\u03d0\u0001\u0000\u0000\u0000"+
		"\u03d3\u03d4\u0005\u0007\u0000\u0000\u03d4\u03d5\u0003\u0098L\u0000\u03d5"+
		"\u03d6\u0005\b\u0000\u0000\u03d6\u009b\u0001\u0000\u0000\u0000\u03d7\u03d8"+
		"\u0007\u0005\u0000\u0000\u03d8\u009d\u0001\u0000\u0000\u0000\u03d9\u03da"+
		"\u0005!\u0000\u0000\u03da\u03db\u0005n\u0000\u0000\u03db\u03dc\u0003\u0084"+
		"B\u0000\u03dc\u009f\u0001\u0000\u0000\u0000\u03dd\u03df\u00052\u0000\u0000"+
		"\u03de\u03dd\u0001\u0000\u0000\u0000\u03de\u03df\u0001\u0000\u0000\u0000"+
		"\u03df\u03e0\u0001\u0000\u0000\u0000\u03e0\u03e1\u0003~?\u0000\u03e1\u03e2"+
		"\u0005n\u0000\u0000\u03e2\u03e3\u0003\u0084B\u0000\u03e3\u00a1\u0001\u0000"+
		"\u0000\u0000\u03e4\u03e9\u0003\u00a4R\u0000\u03e5\u03e9\u0003\u00a6S\u0000"+
		"\u03e6\u03e9\u0003\u00aaU\u0000\u03e7\u03e9\u0003\u00b0X\u0000\u03e8\u03e4"+
		"\u0001\u0000\u0000\u0000\u03e8\u03e5\u0001\u0000\u0000\u0000\u03e8\u03e6"+
		"\u0001\u0000\u0000\u0000\u03e8\u03e7\u0001\u0000\u0000\u0000\u03e9\u00a3"+
		"\u0001\u0000\u0000\u0000\u03ea\u03eb\u0005E\u0000\u0000\u03eb\u00a5\u0001"+
		"\u0000\u0000\u0000\u03ec\u03f0\u0005\u001c\u0000\u0000\u03ed\u03f0\u0005"+
		"C\u0000\u0000\u03ee\u03f0\u0003\u00a8T\u0000\u03ef\u03ec\u0001\u0000\u0000"+
		"\u0000\u03ef\u03ed\u0001\u0000\u0000\u0000\u03ef\u03ee\u0001\u0000\u0000"+
		"\u0000\u03f0\u00a7\u0001\u0000\u0000\u0000\u03f1\u03f2\u0007\u0006\u0000"+
		"\u0000\u03f2\u00a9\u0001\u0000\u0000\u0000\u03f3\u03f6\u0003\u00acV\u0000"+
		"\u03f4\u03f6\u0003\u00aeW\u0000\u03f5\u03f3\u0001\u0000\u0000\u0000\u03f5"+
		"\u03f4\u0001\u0000\u0000\u0000\u03f6\u00ab\u0001\u0000\u0000\u0000\u03f7"+
		"\u03f8\u0007\u0007\u0000\u0000\u03f8\u00ad\u0001\u0000\u0000\u0000\u03f9"+
		"\u03fa\u0007\b\u0000\u0000\u03fa\u00af\u0001\u0000\u0000\u0000\u03fb\u03fc"+
		"\u0007\t\u0000\u0000\u03fc\u00b1\u0001\u0000\u0000\u0000\u03fd\u0402\u0003"+
		"\u00b4Z\u0000\u03fe\u03ff\u0005\r\u0000\u0000\u03ff\u0401\u0003\u00b4"+
		"Z\u0000\u0400\u03fe\u0001\u0000\u0000\u0000\u0401\u0404\u0001\u0000\u0000"+
		"\u0000\u0402\u0400\u0001\u0000\u0000\u0000\u0402\u0403\u0001\u0000\u0000"+
		"\u0000\u0403\u00b3\u0001\u0000\u0000\u0000\u0404\u0402\u0001\u0000\u0000"+
		"\u0000\u0405\u0407\u0005\u007f\u0000\u0000\u0406\u0405\u0001\u0000\u0000"+
		"\u0000\u0406\u0407\u0001\u0000\u0000\u0000\u0407\u0408\u0001\u0000\u0000"+
		"\u0000\u0408\u0409\u0003r9\u0000\u0409\u00b5\u0001\u0000\u0000\u0000\u040a"+
		"\u040d\u0005\f\u0000\u0000\u040b\u040e\u0003\u0084B\u0000\u040c\u040e"+
		"\u0003$\u0012\u0000\u040d\u040b\u0001\u0000\u0000\u0000\u040d\u040c\u0001"+
		"\u0000\u0000\u0000\u040e\u0410\u0001\u0000\u0000\u0000\u040f\u040a\u0001"+
		"\u0000\u0000\u0000\u040f\u0410\u0001\u0000\u0000\u0000\u0410\u00b7\u0001"+
		"\u0000\u0000\u0000\u0411\u0415\u0003\u00bc^\u0000\u0412\u0413\u00055\u0000"+
		"\u0000\u0413\u0415\u0003\u00ba]\u0000\u0414\u0411\u0001\u0000\u0000\u0000"+
		"\u0414\u0412\u0001\u0000\u0000\u0000\u0415\u00b9\u0001\u0000\u0000\u0000"+
		"\u0416\u0418\u0003p8\u0000\u0417\u0416\u0001\u0000\u0000\u0000\u0418\u041b"+
		"\u0001\u0000\u0000\u0000\u0419\u0417\u0001\u0000\u0000\u0000\u0419\u041a"+
		"\u0001\u0000\u0000\u0000\u041a\u041c\u0001\u0000\u0000\u0000\u041b\u0419"+
		"\u0001\u0000\u0000\u0000\u041c\u041d\u00038\u001c\u0000\u041d\u0423\u0005"+
		"l\u0000\u0000\u041e\u041f\u0003\u001a\r\u0000\u041f\u0420\u0005*\u0000"+
		"\u0000\u0420\u0424\u0001\u0000\u0000\u0000\u0421\u0424\u0005\u0080\u0000"+
		"\u0000\u0422\u0424\u0003\u0084B\u0000\u0423\u041e\u0001\u0000\u0000\u0000"+
		"\u0423\u0421\u0001\u0000\u0000\u0000\u0423\u0422\u0001\u0000\u0000\u0000"+
		"\u0424\u00bb\u0001\u0000\u0000\u0000\u0425\u0427\u0003p8\u0000\u0426\u0425"+
		"\u0001\u0000\u0000\u0000\u0427\u042a\u0001\u0000\u0000\u0000\u0428\u0426"+
		"\u0001\u0000\u0000\u0000\u0428\u0429\u0001\u0000\u0000\u0000\u0429\u042b"+
		"\u0001\u0000\u0000\u0000\u042a\u0428\u0001\u0000\u0000\u0000\u042b\u042c"+
		"\u00038\u001c\u0000\u042c\u042d\u0005w\u0000\u0000\u042d\u042e\u0003\u0084"+
		"B\u0000\u042e\u00bd\u0001\u0000\u0000\u0000\u042f\u0432\u0003\u00c0`\u0000"+
		"\u0430\u0432\u0005\u008f\u0000\u0000\u0431\u042f\u0001\u0000\u0000\u0000"+
		"\u0431\u0430\u0001\u0000\u0000\u0000\u0432\u00bf\u0001\u0000\u0000\u0000"+
		"\u0433\u0439\u0003\u00c4b\u0000\u0434\u0439\u0003\u009cN\u0000\u0435\u0439"+
		"\u0003\u00ccf\u0000\u0436\u0439\u0005k\u0000\u0000\u0437\u0439\u0005\u0083"+
		"\u0000\u0000\u0438\u0433\u0001\u0000\u0000\u0000\u0438\u0434\u0001\u0000"+
		"\u0000\u0000\u0438\u0435\u0001\u0000\u0000\u0000\u0438\u0436\u0001\u0000"+
		"\u0000\u0000\u0438\u0437\u0001\u0000\u0000\u0000\u0439\u00c1\u0001\u0000"+
		"\u0000\u0000\u043a\u043b\u0003\u00c8d\u0000\u043b\u043c\u0003\u0084B\u0000"+
		"\u043c\u00c3\u0001\u0000\u0000\u0000\u043d\u043e\u0007\n\u0000\u0000\u043e"+
		"\u00c5\u0001\u0000\u0000\u0000\u043f\u0440\u0003\u00c4b\u0000\u0440\u0441"+
		"\u0003\u00c4b\u0000\u0441\u0444\u0001\u0000\u0000\u0000\u0442\u0444\u0005"+
		"\u008f\u0000\u0000\u0443\u043f\u0001\u0000\u0000\u0000\u0443\u0442\u0001"+
		"\u0000\u0000\u0000\u0444\u00c7\u0001\u0000\u0000\u0000\u0445\u0446\u0003"+
		"\u00be_\u0000\u0446\u0447\u0005l\u0000\u0000\u0447\u00c9\u0001\u0000\u0000"+
		"\u0000\u0448\u0449\u0007\u000b\u0000\u0000\u0449\u00cb\u0001\u0000\u0000"+
		"\u0000\u044a\u044b\u0007\f\u0000\u0000\u044b\u00cd\u0001\u0000\u0000\u0000"+
		"r\u00cf\u00d7\u00dd\u00e4\u00ee\u00f3\u00fb\u0100\u010d\u0117\u011b\u0120"+
		"\u0127\u012e\u014e\u0160\u0163\u016c\u0175\u017c\u0186\u018d\u0191\u01a3"+
		"\u01aa\u01b1\u01b7\u01c0\u01c8\u01cb\u01d0\u01d8\u01e1\u01e5\u01e7\u01ed"+
		"\u01f1\u01f4\u01fc\u0201\u0206\u020d\u0215\u0218\u0223\u0228\u0231\u023b"+
		"\u0244\u0247\u024a\u024e\u0259\u025e\u0274\u0279\u0283\u028a\u0290\u0296"+
		"\u02a9\u02b3\u02b9\u02c1\u02c5\u02c9\u02d1\u02e0\u02eb\u02f5\u0307\u030e"+
		"\u0313\u0318\u032d\u0339\u0346\u034e\u0351\u0356\u035b\u0363\u0365\u0367"+
		"\u0370\u0373\u037b\u037e\u0383\u038d\u0390\u0398\u039e\u03a6\u03ad\u03b7"+
		"\u03bf\u03c6\u03d0\u03de\u03e8\u03ef\u03f5\u0402\u0406\u040d\u040f\u0414"+
		"\u0419\u0423\u0428\u0431\u0438\u0443";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}