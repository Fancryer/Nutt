package Nutt;

import Nutt.Annotations.ANativeProcedure;
import Nutt.Interpreter.Logging.EActionStatus;
import Nutt.Interpreter.Logging.ESeverity;
import Nutt.Interpreter.Logging.NuttLogger;
import Nutt.Interpreter.NuttInterpreter;
import Nutt.Interpreter.References.AnonymousNuttReference;
import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Actionable.Procedure.Native.NativeProcedure;
import Nutt.Types.Functional.Actionable.Procedure.ProcedureBuilder;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Listable.Map.Map;
import Nutt.Types.Functional.Listable.Set.Set;
import Nutt.Types.Functional.Listable.String.String;
import Nutt.Types.Functional.Numerable.Float.Float;
import Nutt.Types.Functional.Numerable.Int.Int;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.Nil;
import Nutt.Visitors.VisitorPool;
import com.google.common.reflect.ClassPath;
import gen.NuttLexer;
import gen.NuttParser;
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
	public static final NuttLogger nuttLogger=new NuttLogger();

	static
	{
		nuttLogger.appendLog("Native procedures processing start","succeed");
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
					nuttLogger.appendLog("Native procedure processed",annotation.value());
				}
			}
			nuttLogger.appendLog("Native procedures processing finish","succeed");
		}
		catch(IOException e)
		{
			nuttLogger.appendLog("Native procedures processing finish","failed due to IO exception");
			throw new RuntimeException(e);
		}
	}

	public NuttEnvironment()
	{

	}

	public NuttEnvironment(java.lang.String path,java.lang.String moduleRootPath)
	{
		try
		{
			visit(path);
		}
		catch(Exception e)
		{
			nuttLogger.appendLog("Exception catched",e.toString(),EActionStatus.Failure,ESeverity.Fatal);
			throw e;
		}
		finally
		{
			clearInterpreter();
			nuttLogger.writeLogs();
			//new MarkdownLogger(nuttLogger.writeLogs()).writeLog(nuttLogger.getLogStamps());
		}
	}

	public NuttEnvironment visit(java.lang.String path)
	{
		nuttLogger.appendLog("Environment opening","succeed");
		var parser=setup(path);
		VisitorPool.statementVisitor.visitChunk(parser.chunk(),path);
		return this;
	}

	private NuttParser setup(java.lang.String path)
	{
		return new NuttParser(new CommonTokenStream(new NuttLexer(CharStreams.fromString(NuttCommon.readFileString(path)))));
	}

	private void clearInterpreter()
	{
		try
		{
			NuttInterpreter.clear();
			nuttLogger.appendLog("Environment closing","succeed");
		}
		catch(Exception e)
		{
			nuttLogger.appendLog("Environment closing",e.toString(),EActionStatus.Failure,ESeverity.Fatal);
		}
	}

	public static NuttReference constructReference(java.lang.String type)
	{
		return constructReference(TypeInferencer.findTypeReference(type).getType());
	}

	public static NuttReference constructReference(Type type)
	{
		if(type==null) return null;
		if(!TypeInferencer.hasType(type.getHeader().getDisplayName())) throw new RuntimeException();
		var valuable=switch(type.getHeader().getDisplayName())
		{
			case "Listable","Array" -> new Array();
			case "String" -> new String();
			case "Set" -> new Set();
			case "Map" -> new Map();
			case "Numerable","Int" -> new Int();
			case "Float" -> new Float();
			case "Actionable","Procedure" -> new ProcedureBuilder().createProcedure();
			case "Type" -> TypeInferencer.findTypeReference("Type").getType();
			default -> new Nil();
		};
		return AnonymousNuttReference.of(valuable);
	}

	//	public static InterpolParser getTempInterpolator(java.lang.String source)
	//	{
	//		return new InterpolParser(new CommonTokenStream(new InterpolLexer(CharStreams.fromString(source))));
	//	}

	//	public static IValuable constructGenericValuable(Type type,List<Type> typeParameters)
	//	{
	//		if(type==null||!TypeInferencer.hasType(type.getDisplayName())) throw new RuntimeException();
	//		var typeParametersAmount=typeParameters.size();
	//		var typeName=type.getDisplayName();
	//		return switch(typeName)
	//		{
	//			case "Listable","Array" ->
	//			{
	//				if(typeParametersAmount!=1)
	//					throw new NuttParameterizationException("Array",typeParameters);
	//				yield new Array(typeParameters.get(0));
	//			}
	//			case "String" -> new String();
	//			case "Set" -> new Set();
	//			case "Map" -> new Map();
	//			case "Numerable","Int" -> new Int();
	//			case "Float" -> new Float();
	//			case "Actionable","Procedure" -> new LambdaBuilder()
	//					.setSignature(new Signature())
	//					.setFunctionBody("nil")
	//					.setOutput(new Nil().toAnonymousReference())
	//					.createProcedure();
	//			default ->
	//			{
	//				if(TypeInferencer.verdict("Record",typeName)) yield NuttInterpreter.getRecord(typeName).replicate();
	//				throw new RuntimeException();
	//			}
	//		};
	//	}

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

	public static NuttParser parseWithPrefix(java.lang.String prefix,ParseTree ctx)
	{
		return getTempParser(prefix+toSourceCode(ctx));
	}

	public static NuttParser parseWithBound(java.lang.String prefix,ParseTree ctx,java.lang.String postfix)
	{
		return getTempParser(prefix+toSourceCode(ctx)+postfix);
	}

	public static NuttParser parseAsSource(ParseTree ctx)
	{
		return parseAsSource(ctx,false);
	}

	public static java.lang.String toSourceCode(Tree tree,StringBuilder stringBuilder)
	{
		if(tree==null) return null;
		int childCount=tree.getChildCount();
		IntStream.range(0,childCount)
		         .mapToObj(tree::getChild)
		         .forEach
				         (
						         child->
						         {
							         if(child instanceof TerminalNode parserRuleContext)
								         stringBuilder.append(parserRuleContext)
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
