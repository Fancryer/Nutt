package Nutt.Interpreter;

import Nutt.Exceptions.NuttBreakException;
import Nutt.Exceptions.NuttContinueException;
import Nutt.Interpreter.References.NilReference;
import Nutt.Interpreter.References.NuttReference;
import Nutt.NuttEnvironment;
import Nutt.Types.Functional.Numerable.Boolean;
import gen.NuttParser;

import java.util.Objects;

import static Nutt.Visitors.VisitorPool.evalVisitor;
import static Nutt.Visitors.VisitorPool.statementVisitor;

public final class WhileDoLoop extends Loop
{
	public WhileDoLoop(NuttParser.ExpContext expContext,NuttParser.StatContext statContext)
	{
		super(e->evalVisitor.visit(e).getValue().simpleCast(Boolean.class),expContext,statContext);
	}

	@Override
	public NuttReference run()
	{
		NuttReference reference=null;
		var whileBlock=NuttEnvironment.parseWithBound("do ",statContext," done").block();
		whileLoop:
		while(condition.apply(expContext).isTrue())
		{
			for(var stat: whileBlock.children)
			{
				try
				{
					reference=statementVisitor.visit(stat);
				}
				catch(NuttBreakException e)
				{
					break whileLoop;
				}
				catch(NuttContinueException e)
				{
					continue whileLoop;
				}
			}
		}
		return Objects.requireNonNullElse(reference,NilReference.getInstance());
	}
}
