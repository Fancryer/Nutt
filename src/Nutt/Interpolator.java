package Nutt;

import Nutt.Visitors.NuttEvalVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.stream.Collectors;

public class Interpolator
{
	public static String interpolate(String source)
	{
		return NuttEnvironment
				.getTempInterpolator(source)
				.string()
				.content()
				.stream()
				.map(content->String.valueOf(content.interp()!=null
				                             ?new NuttEvalVisitor().visit(NuttEnvironment.parseAsSource(content.interp()).exp())
				                             :content
						                             .chars()
						                             .Char()
						                             .stream()
						                             .map(TerminalNode::getText)
						                             .collect(Collectors.joining())))
				.collect(Collectors.joining());
	}
}
