package Nutt.Interpreter;

import Nutt.Interpreter.References.NuttReference;
import Nutt.Types.Functional.Numerable.Boolean;
import gen.NuttParser.ExpContext;
import lombok.AllArgsConstructor;

import java.util.function.Function;

import static gen.NuttParser.StatContext;

@AllArgsConstructor
public sealed abstract class Loop permits ForEachLoop, WhileDoLoop, RepeatUntilLoop
{
	protected final Function<ExpContext,Boolean> condition;
	protected final ExpContext expContext;
	protected final StatContext statContext;

	public abstract NuttReference run();
}
