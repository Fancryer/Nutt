package Nutt;

import Nutt.Types.Functional.Actionable.Procedure.Procedure;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.Map.Map;
import Nutt.Types.Functional.Listable.Set.Set;
import Nutt.Types.Functional.Listable.String.String;
import Nutt.Types.Functional.Numerable.Float.Float;
import Nutt.Types.Functional.Numerable.Int.Int;
import Nutt.Types.IValuable;
import Nutt.Types.Nil;
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
	NuttLexer lexer;
	CommonTokenStream tokens;
	NuttParser parser;
	ParseTree tree;
	NuttInterpreter interpreter;
	boolean debug;

	public NuttEnvironment()
	{

	}

	public NuttEnvironment(java.lang.String source,boolean debug,boolean drawEnvironment)
	{
		if(drawEnvironment)
		{
			var src_header=ConsoleColorizer.colorize("Source: %n[[%n".formatted(),"blue");
			var src_footer=ConsoleColorizer.colorize("]]","blue");

			System.out.printf(src_header+"%s%n"+src_footer+"%n%n",ConsoleColorizer.colorize(source,"yellow"));
			System.out.println(ConsoleColorizer.colorize("Output: ","blue"));
		}
		visit(source,debug);
		if(drawEnvironment)
		{
			var map_header=ConsoleColorizer.colorize("Variables: %n".formatted(),"blue");
			System.out.println(map_header+ConsoleColorizer.colorize(interpreter.currentScope.toString(),"yellow"));
		}
		clearInterpreter();
	}

	private void clearInterpreter()
	{
		interpreter.clear();
	}

	public static IValuable constructValuable(java.lang.String type)
	{
		return switch(type)
				{
					case "Listable","Array" -> new Array();
					case "String" -> new String();
					case "Set" -> new Set();
					case "Map" -> new Map();
					case "Numerable","Int" -> new Int();
					case "Float" -> new Float();
					case "Actionable","Procedure" -> new Procedure();
					default -> new Nil();
				};
	}

	public static NuttInterpreter.Variable constructNil(java.lang.String name,boolean isConstant)
	{
		return new NuttInterpreter.Variable("Valuable",new Nil(),name,isConstant);
	}

	public static List<Tree> getChildren(Tree tree)
	{
		var count=tree.getChildCount();
		List<Tree> children=new ArrayList<>();
		if(count==0) return children;
		IntStream.range(0,count).forEach(i->children.add(tree.getChild(i)));
		return children;
	}

	public static NuttParser getTempParser(java.lang.String source)
	{
		return new NuttParser(new CommonTokenStream(new NuttLexer(CharStreams.fromString(source))));
	}

	public NuttEnvironment visit(java.lang.String source,boolean debug)
	{
		var parser=setup(source,debug);
		interpreter.statementVisitor.visit(tree);
		return this;
	}

	private NuttParser setup(java.lang.String source,boolean debug)
	{
		this.debug=debug;
		lexer=new NuttLexer(CharStreams.fromString(source));
		tokens=new CommonTokenStream(lexer);
		parser=new NuttParser(tokens);
		tree=parser.chunk();
		interpreter=new NuttInterpreter();
		interpreter.statementVisitor=new NuttStatementVisitor(parser,interpreter,debug);
		return parser;
	}

	public static java.lang.String toSourceCode(Tree tree,StringBuilder stringBuilder)
	{
		int childCount=tree.getChildCount();
		for(int childIndex=0;childIndex<childCount;childIndex++)
		{
			var child=tree.getChild(childIndex);
			if(child instanceof TerminalNode parserRuleContext) stringBuilder.append(parserRuleContext).append(" ");
			toSourceCode(child,stringBuilder);
		}
		return stringBuilder.toString().trim().replace("<EOF>","");
	}

	public static java.lang.String toSourceCode(Tree tree)
	{
		return toSourceCode(tree,new StringBuilder());
	}
}
