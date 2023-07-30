package Nutt;

import Nutt.Annotations.ANativeProcedure;
import Nutt.Exceptions.NuttParameterizationException;
import Nutt.Types.Functional.Actionable.Procedure.LambdaBuilder;
import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
import Nutt.Types.Functional.Actionable.Procedure.ProcedureBuilder;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.Map.Map;
import Nutt.Types.Functional.Listable.Set.Set;
import Nutt.Types.Functional.Numerable.Int.Int;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;
import Nutt.Types.Nil;
import Nutt.Visitors.VisitorsPool;
import com.google.common.reflect.ClassPath;
import gen.Nutt;
import gen.NuttLexer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.Tree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

public class NuttEnvironment
{
	public static final java.util.Map<java.lang.String,Class<? extends NativeProcedure>> nativeProcedures=new HashMap<>();

	static
	{
		var packageName="Nutt.Types.Functional.Actionable.Procedure.Native";
		var classLoader=Thread.currentThread().getContextClassLoader();
		try
		{
			var classPath=ClassPath.from(classLoader);
			var classes=classPath.getTopLevelClassesRecursive(packageName);
			for(var classInfo: classes)
			{
				var clazz=classInfo.load();
				if(clazz.isAnnotationPresent(ANativeProcedure.class))
				{
					var annotation=clazz.getAnnotation(ANativeProcedure.class);
					nativeProcedures.put(annotation.value(),clazz.asSubclass(NativeProcedure.class));
				}
			}
		}
		catch(IOException e)
		{
			throw new RuntimeException(e);
		}
	}

	public NuttEnvironment()
	{

	}

	public NuttEnvironment(java.lang.String source,java.lang.String moduleRootPath)
	{
		visit(source);
		clearInterpreter();
	}

	public NuttEnvironment visit(java.lang.String source)
	{
		var parser=setup(source);
		VisitorsPool.statementVisitor.visit(parser.chunk());
		return this;
	}

	private Nutt setup(java.lang.String source)
	{
		return new Nutt(new CommonTokenStream(new NuttLexer(CharStreams.fromString(source))));
	}

	private void clearInterpreter()
	{
		NuttInterpreter.clear();
	}

	public static IValuable constructValuable(java.lang.String type)
	{
		return constructValuable(TypeInferencer.findTypeReference(type));
	}

	public static IValuable constructValuable(Type type)
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
			case "Type" -> TypeInferencer.findTypeReference("Type");
			default ->
			{
				//Construct record object
				//				if(TypeInferencer.verdict("Record",type))
				//				{
				//					System.out.println(NuttInterpreter.getRecord(type.getDisplayName()));
				//				}
				yield new Nil();
			}
		};
	}

	//	public static InterpolParser getTempInterpolator(java.lang.String source)
	//	{
	//		return new InterpolParser(new CommonTokenStream(new InterpolLexer(CharStreams.fromString(source))));
	//	}

	public static IValuable constructGenericValuable(Type type,
	                                                 List<Type> typeParameters)
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

	public static List<Tree> getChildren(Tree tree)
	{
		List<Tree> children=new ArrayList<>();
		if(tree==null) return children;
		var count=tree.getChildCount();
		if(count==0) return children;
		for(int i=0;i<count;++i) children.add(tree.getChild(i));
		return children;
	}

	public static Nutt getTempParser(java.lang.String source)
	{
		return new Nutt(new CommonTokenStream(new NuttLexer(CharStreams.fromString(source))));
	}

	public static Nutt parseAsSource(ParseTree ctx,boolean removeTrailing)
	{
		return getTempParser(removeTrailing?NuttCommon.removeFirstAndLastChars(toSourceCode(ctx)):toSourceCode(ctx));
	}

	public static Nutt parseWithPrefix(java.lang.String prefix,ParseTree ctx)
	{
		return getTempParser(prefix+toSourceCode(ctx));
	}

	public static Nutt parseWithBound(java.lang.String prefix,ParseTree ctx,java.lang.String postfix)
	{
		return getTempParser(prefix+toSourceCode(ctx)+postfix);
	}

	public static Nutt parseAsSource(ParseTree ctx)
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

	public static List<java.lang.String> toSourceList(List<Tree> trees)
	{
		return trees.stream().map(NuttEnvironment::toSourceCode).toList();
	}

	public static java.lang.String toSourceCode(Tree tree)
	{
		return toSourceCode(tree,new StringBuilder());
	}
}
