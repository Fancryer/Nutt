package Nutt;

import Nutt.Types.Functional.Actionable.Procedure.Procedure;
import Nutt.Types.IValuable;
import gen.NuttBaseVisitor;
import gen.NuttParser;
import gen.NuttParser.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class NuttDeclarationVisitor extends NuttBaseVisitor<String>
{
	NuttParser parser;
	NuttInterpreter interpreter;
	boolean debug;

	public NuttDeclarationVisitor(NuttParser parser,NuttInterpreter interpreter)
	{
		this(parser,interpreter,false);
	}

	public NuttDeclarationVisitor(NuttParser parser,NuttInterpreter interpreter,boolean debug)
	{
		this.parser=parser;
		this.interpreter=interpreter;
		this.debug=debug;
	}

	public String traceVariableName(Var_declContext ctx)
	{
		return ctx.var_header().NAME().getText();
	}

	private IValuable getValueFromValueContext(VarExpOrParContext ctx)
	{
		try
		{
			switch(EByValueDeclaration.fromContext(ctx))
			{
				case Var ->
				{
					String variableName=ctx.var().NAME().getSymbol().getText();
					return interpreter.getValuable(variableName);
				}
				case Exp ->
				{
					//System.out.println(ctx.exp().getText());
					return new NuttEvalVisitor(parser,interpreter).visit(ctx.exp());
				}
				case VarExpOrPar ->
				{
					return new NuttEvalVisitor(parser,interpreter).visit(ctx.parExp().exp());
				}
				default -> throw new IllegalStateException("Unexpected value: "+EByValueDeclaration.fromContext(ctx));
			}
		}
		catch(Exception e)
		{
			throw new RuntimeException("Wrong variable definition!",e);
		}
	}

	@Override
	public String visitFunctiondef_stat(NuttParser.Functiondef_statContext ctx)
	{
		var functionName=String.join("",ctx.funcname().NAME().stream().map(term->term.getSymbol().getText()).toList());
		var funct=ctx.func_any();
		if(funct.lambda_decl()==null)
		{
			var funcBody=funct.funcbody();
			if(funcBody!=null)
			{
				var parameterMaster=new NuttParametersVisitor(parser,interpreter);
				var fmt="Defined function with name %s, %s%n";
				var parameterNames=parameterMaster.visitFunc_parameters(funcBody.func_parameters());
				var output=new NuttFunctionVisitor(parser,interpreter).visitFunc_output(funcBody.func_output());
				var functionInstance=new Procedure(namesToVariables(parameterNames),output,funcBody.block());
				System.out.printf(fmt,functionName,functionInstance);
				interpreter.currentScope.addVariable(functionName,functionInstance,"Actionable",false);
				return functionName;
			}
		}
		return "";
	}

	private List<NuttInterpreter.Variable> namesToVariables(List<String> variableNames)
	{
		return variableNames.stream().map(interpreter::getVariable).toList();
	}

	private List<IValuable> namesToValuables(List<String> variableNames)
	{
		return namesToVariables(variableNames).stream().map(n->n.valuable).toList();
	}

	private String traceVarName(Var_declContext ctx)
	{
		return ctx.var_header().NAME().getSymbol().getText();
	}

	@Override
	public String visit(ParseTree tree)
	{
		//System.out.println(tree.toStringTree(parser));
		return super.visit(tree);
	}

	private String declareByValue(By_value_var_declContext varDeclContext,
	                              Var_declContext declContext)
	{
		var variableName=traceVarName(declContext);
		if(interpreter.currentScope.definedLocally(variableName))
			throw new RuntimeException("Variable \"%s\" is already declared!".formatted(variableName));
		var value=
				new NuttEvalVisitor(parser,interpreter).visitVarExpOrPar(
						varDeclContext.assign_right);//getValueFromValueContext(ctx
		// .assign_right);
		if(debug)
		{
			var format="Visited by_value_var_decl%nvariable %s is declared with value %s%n%n";
			System.out.printf(format,variableName,value);
		}
		interpreter.currentScope.addVariable(variableName,value,value.getWrapType(),
		                                     declaredAsConstant(declContext.var_header().constant_qualifier()));
		return variableName;
	}

	private String declareByType(By_type_var_declContext varDeclContext,
	                             Var_declContext declContext)
	{
		var variableName=traceVarName(declContext);
		if(interpreter.currentScope.definedLocally(variableName))
			throw new RuntimeException("Variable \"%s\" is already declared!".formatted(variableName));
		if(debug)
		{
			System.out.println("Visited by_type_var_decl");
			System.out.printf("variable %s is declared with type %s%n%n",variableName,getType(varDeclContext.type));
		}
		var variableInst=NuttEnvironment.constructValuable(getType(varDeclContext.type));

		interpreter.currentScope.addVariable(variableName,variableInst,getType(varDeclContext.type),
		                                     declaredAsConstant(declContext.var_header().constant_qualifier()));
		return variableName;
	}

	private String declareFull(Full_var_declContext varDeclContext,
	                           Var_declContext declContext)
	{
		var variableName=traceVarName(declContext);
		if(interpreter.currentScope.definedLocally(variableName))
			throw new RuntimeException("Variable \"%s\" is already declared!".formatted(variableName));
		var value=new NuttEvalVisitor(parser,interpreter).visitVarExpOrPar(varDeclContext.assign_right);
		var declaredType=getType(varDeclContext.type);
		if(debug)
		{
			var format="Visited full_var_decl%nvariable %s of type %s is declared as %s with value %s%n%n";
			System.out.printf(format,variableName,declaredType,value.getType(),value.getValue());
		}
		if(new TypeInferencer().verdict(declaredType,value.getType()))
		{
			interpreter.currentScope.addVariable(variableName,value,declaredType,
			                                     declaredAsConstant(declContext.var_header().constant_qualifier()));
			return variableName;
		}
		throw new RuntimeException("Incompatible types: %s cannot store %s!".formatted(declaredType,value.getType()));
	}

	private String declareShort(Short_var_declContext varDeclContext,
	                            Var_declContext declContext)
	{
		if(declaredAsConstant(declContext.var_header().constant_qualifier()))
		{
			throw new RuntimeException("Val constant qualifier is used in short variable declaration!");
		}
		var variableName=declContext.var_header().NAME().getSymbol().getText();
		if(interpreter.currentScope.definedLocally(variableName))
			throw new RuntimeException("Variable \"%s\" is already declared!".formatted(variableName));
		if(debug)
		{
			var nilIsExplicitlyDeclared=varDeclContext.nil_type()!=null;
			System.out.println("Visited short_var_decl");
			System.out.printf("variable %s is declared shortly (with%s explicit Nil value)%n%n",variableName,
			                  nilIsExplicitlyDeclared?"":"out");
		}
		interpreter.currentScope.addVariable(variableName);
		return variableName;
	}

	@Override
	public String visitVar_decl(Var_declContext ctx)
	{
		if(ctx.short_var_decl()!=null) return declareShort(ctx.short_var_decl(),ctx);
		if(ctx.by_type_var_decl()!=null) return declareByType(ctx.by_type_var_decl(),ctx);
		if(ctx.by_value_var_decl()!=null) return declareByValue(ctx.by_value_var_decl(),ctx);
		if(ctx.full_var_decl()!=null) return declareFull(ctx.full_var_decl(),ctx);
		throw new RuntimeException("Unknown variable declaration!");
	}

	private boolean declaredAsConstant(Constant_qualifierContext ctx)
	{
		return ctx.KW_VAL()!=null;
	}

	private String getType(Type_declContext ctx)
	{
		return parser.getVocabulary().getDisplayName(ctx.start.getType()).replaceAll("'","");
	}

	enum EByValueDeclaration
	{
		Var,
		Exp,
		VarExpOrPar;

		public static EByValueDeclaration fromContext(VarExpOrParContext ctx)
		{
			if(ctx.var()!=null) return Var;
			if(ctx.exp()!=null) return Exp;
			return VarExpOrPar;
		}
	}

	enum EVariableDeclaration
	{
		ShortVariableDeclaration,
		ByTypeVariableDeclaration,
		ByValueVariableDeclaration,
		FullVariableDeclaration;

		public static EVariableDeclaration fromVar_declContext(Var_declContext ctx)
		{
			if(ctx.short_var_decl()!=null) return ShortVariableDeclaration;
			if(ctx.by_type_var_decl()!=null) return ByTypeVariableDeclaration;
			if(ctx.by_value_var_decl()!=null) return ByValueVariableDeclaration;
			if(ctx.full_var_decl()!=null) return FullVariableDeclaration;
			throw new RuntimeException();
		}
	}
}