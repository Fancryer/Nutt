//package Nutt.Runtime;
//
//import Nutt.Types.IValuable;
//
//import java.lang.reflect.InvocationHandler;
//import java.lang.reflect.Method;
//
//public class OperatorProxy implements InvocationHandler
//{
//	private final IValuable original;
//
//	public OperatorProxy(IValuable original)
//	{
//		this.original=original;
//	}
//
//	public Object invoke(Object proxy,Method method,Object[] args) throws Exception
//	{
//		System.out.println("BEFORE");
//		var result=method.invoke(original,args);
//		System.out.println("AFTER");
//		return result;
//	}
//
//	@Override public String toString()
//	{
//		return "OperatorProxy{original=%s}".formatted(original);
//	}
//}
