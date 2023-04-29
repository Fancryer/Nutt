package Nutt;

import Nutt.Exceptions.NuttParameterizationException;
import Nutt.Types.Functional.Actionable.Procedure.LambdaBuilder;
import Nutt.Types.Functional.Actionable.Procedure.ProcedureBuilder;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.Map.Map;
import Nutt.Types.Functional.Listable.Set.Set;
import Nutt.Types.Functional.Listable.String.String;
import Nutt.Types.Functional.Numerable.Float.Float;
import Nutt.Types.Functional.Numerable.Int.Int;
import Nutt.Types.Functional.Type.IType;
import Nutt.Types.IValuable;
import Nutt.Types.Nil;
import Nutt.Visitors.NuttStatementVisitor;
import gen.NuttLexer;
import gen.NuttParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class NuttEnvironment
{
	public NuttEnvironment()
	{

	}

	public NuttEnvironment(java.lang.String source,java.lang.String moduleRootPath)
	{
		visit(source);
		clearInterpreter();
	}

	public static IValuable constructValuable(java.lang.String type)
	{
		return constructValuable(TypeInferencer.findType(type));
	}

	public static IValuable constructValuable(IType type)
	{
		if(type==null) return null;
		if(!TypeInferencer.hasType(type.getDisplayName())) throw new RuntimeException();
		return switch(type.getDisplayName())
		{
			case "Listable","Array" -> new Array();
			case "String" -> new String();
			case "Set" -> new Set();
			case "Map" -> new Map();
			case "Numerable","Int" -> new Int();
			case "Float" -> new Float();
			case "Actionable","Procedure" -> new ProcedureBuilder().createProcedure();
			default -> new Nil();
		};
	}

	public static IValuable constructGenericValuable(IType type,List<IType> typeParameters)
	{
		if(type==null||!TypeInferencer.hasType(type.getDisplayName())) throw new RuntimeException();
		var typeParametersAmount=typeParameters.size();
		var typeName=type.getDisplayName();
		return switch(typeName)
		{
			case "Listable","Array" ->
			{
				if(typeParametersAmount!=1)
					throw new NuttParameterizationException("Array",typeParameters);
				yield new Array(typeParameters.get(0));
			}
			case "String" -> new String();
			case "Set" -> new Set();
			case "Map" -> new Map();
			case "Numerable","Int" -> new Int();
			case "Float" -> new Float();
			case "Actionable","Procedure" -> new LambdaBuilder()
					.setSignature(new Signature())
					.setFunctionBody("nil")
					.setOutput(new Nil())
					.createProcedure();
			default ->
			{
				if(TypeInferencer.verdict("Record",typeName)) yield NuttInterpreter.getRecord(typeName).replicate();
				throw new RuntimeException();
			}
		};
	}

	public static NuttInterpreter.Variable constructNil(java.lang.String name,boolean isConstant)
	{
		return constructVariable(name,new Nil(),isConstant);
	}

	public static NuttInterpreter.Variable constructVariable(java.lang.String name,IValuable valuable,boolean isConstant)
	{
		return new NuttInterpreter.Variable(TypeInferencer.findType("Valuable"),valuable,name,isConstant);
	}

	public static List<Tree> getChildren(Tree tree)
	{
		List<Tree> children=new ArrayList<>();
		if(tree==null) return children;
		var count=tree.getChildCount();
		if(count==0) return children;
		for(int i=0;i<count;++i) children.add(tree.getChild(i));
		return children;
	}

	public static NuttParser getTempParser(java.lang.String source)
	{
		return new NuttParser(new CommonTokenStream(new NuttLexer(CharStreams.fromString(source))));
	}

	public static NuttParser parseAsSource(ParseTree ctx,boolean removeTrailing)
	{
		return getTempParser(removeTrailing?NuttCommon.removeFirstAndLastChars(toSourceCode(ctx)):toSourceCode(ctx));
	}

	public static NuttParser parseAsSource(ParseTree ctx)
	{
		return parseAsSource(ctx,false);
	}

	public static java.lang.String toSourceCode(Tree tree,StringBuilder stringBuilder)
	{
		if(tree==null) return null;
		int childCount=tree.getChildCount();
		IntStream.range(0,childCount).mapToObj(tree::getChild).forEach
				(child->
				 {
					 if(child instanceof TerminalNode parserRuleContext)
						 stringBuilder
								 .append(parserRuleContext)
								 .append(" ");
					 toSourceCode(child,stringBuilder);
				 }
				);
		return stringBuilder.toString().trim().replace("<EOF>","");
	}

	public static java.lang.String toSourceCode(Tree tree)
	{
		return toSourceCode(tree,new StringBuilder());
	}

	public NuttEnvironment visit(java.lang.String source)
	{
		var parser=setup(source);
		new NuttStatementVisitor().visit(parser.chunk());
		return this;
	}

	private void clearInterpreter()
	{
		NuttInterpreter.clear();
	}

	private NuttParser setup(java.lang.String source)
	{
		return new NuttParser(new CommonTokenStream(new NuttLexer(CharStreams.fromString(source))));
	}
}
