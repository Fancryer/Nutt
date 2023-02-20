package Nutt.Types.Functional;

import Nutt.TypeInferencer;
import Nutt.Types.Functional.Actionable.IActionable;
import Nutt.Types.Functional.Listable.IListable;
import Nutt.Types.Functional.Numerable.INumerable;
import Nutt.Types.IValuable;

import java.util.Objects;

public interface IFunctional extends IValuable
{
	default IActionable asActionable()
	{
		if(!(this instanceof IActionable))
			throw new ClassCastException("Function type is not an Action");
		return (IActionable)this;
	}

	default IListable asListable()
	{
		if(!(this instanceof IListable))
			throw new ClassCastException("Function type is not a List");
		return (IListable)this;
	}

	default INumerable asNumerable()
	{
		if(!(this instanceof INumerable))
			throw new ClassCastException("Function type is not a Number");
		return (INumerable)this;
	}

	boolean asBoolean();

	default boolean isActionable()
	{
		return Objects.equals(getType(),"Actionable");
	}

	default boolean isListable()
	{
		return Objects.equals(getType(),"Listable");
	}

	default boolean isNumerable()
	{
		return Objects.equals(getType(),"Numerable");
	}

	@Override default int compareTo(IValuable valuable)
	{
		if(!new TypeInferencer().verdict("Functional",valuable.getType()))
		{
			throw new RuntimeException("You cannot compare Functional with %s!".formatted(valuable.getType()));
		}
		return this.compareToFunctional(valuable.asFunctional());
	}

	int compareToFunctional(IFunctional functional);
}