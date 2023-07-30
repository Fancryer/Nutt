package Nutt;

public class Interpolator
{
	public static String interpolate(String source)
	{
		return source;
		//		return NuttEnvironment
		//				.getTempInterpolator(source)
		//				.string()
		//				.content()
		//				.stream()
		//				.map(content->String.valueOf(content.interp()!=null
		//				                             ?VisitorPool.evalVisitor.visit(NuttEnvironment.parseAsSource(content.interp()).exp())
		//				                             :content
		//						                             .chars()
		//						                             .Char()
		//						                             .stream()
		//						                             .map(TerminalNode::getText)
		//						                             .collect(Collectors.joining())))
		//				.collect(Collectors.joining());
	}
}
