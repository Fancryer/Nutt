package Nutt.Types.Functional.Actionable.Macro;

import Nutt.Types.Functional.Actionable.IActionable;
import org.antlr.v4.runtime.tree.ParseTree;

public class Macro implements IActionable
{
	ParseTree macroBody;

	@Override public String toString()
	{
		return "Macro";
	}

	@Override public Object getValue()
	{
		return "MacroValue...";
	}

	@Override public String getType()
	{
		return "Macro";
	}

	@Override public String getWrapType()
	{
		return "Actionable";
	}

	@Override public int getLength()
	{
		throw new NoSuchMethodError("There is no length of a macro!");
	}

	@Override public boolean asBoolean()
	{
		return false;
	}
}
