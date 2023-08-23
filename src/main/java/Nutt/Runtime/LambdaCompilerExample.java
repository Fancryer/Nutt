package Nutt.Runtime;

import Nutt.Interpreter.References.NilReference;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.CtNewMethod;

import java.util.function.Function;

public class LambdaCompilerExample
{
	public static void main(String[] args) throws Exception
	{
		var nilReference=NilReference.getInstance();
		String lambdaCode=
				"""
				list -> {
					Int left = list.get(0).getValue().asFunctional().asNumerable().asInt();
					Int right = list.get(1).getValue().asFunctional().asNumerable().asInt();
					String resString = String.valueOf(left + right);
					return Int.fromString(resString).toAnonymousReference();
				}
				""";

		Class<?> lambdaClass=compileLambda(lambdaCode);
		Object lambdaInstance=lambdaClass.getDeclaredConstructor().newInstance();

		// Пример использования скомпилированного лямбда-выражения
		// ...
	}

	private static Class<?> compileLambda(String lambdaCode) throws Exception
	{
		ClassPool classPool=ClassPool.getDefault();

		CtClass lambdaCtClass=classPool.makeClass("CompiledLambda");
		lambdaCtClass.addInterface(classPool.get(Function.class.getName()));

		CtMethod applyMethod=CtNewMethod.make
				                                (
						                                """
						                                public Object apply(Object input)
						                                {
						                                				return Nutt.Interpreter.References.NilReference.getInstance();
						                                }
						                                """,
						                                lambdaCtClass
				                                );
		lambdaCtClass.addMethod(applyMethod);

		return lambdaCtClass.toClass();
	}
}