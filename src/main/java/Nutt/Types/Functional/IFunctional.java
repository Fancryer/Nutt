package Nutt.Types.Functional;

import Nutt.Types.Functional.Actionable.IActionable;
import Nutt.Types.Functional.Listable.IListable;
import Nutt.Types.Functional.Numerable.INumerable;
import Nutt.Types.Functional.Record.Record;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;

import java.util.Objects;

public interface IFunctional extends IValuable
{
	default IActionable asActionable()
	{
		if(!(this instanceof IActionable))
			throw new ClassCastException("Functional type is not an Actionable");
		return (IActionable)this;
	}

	default IListable asListable()
	{
		if(!(this instanceof IListable))
			throw new ClassCastException("Functional type is not a Listable");
		return (IListable)this;
	}

	default INumerable asNumerable()
	{
		if(!(this instanceof INumerable))
			throw new ClassCastException("Functional type is not a Numerable");
		return (INumerable)this;
	}

	default boolean isActionable()
	{
		return Objects.equals(getType().getDisplayName(),"Actionable");
	}

	default boolean isListable()
	{
		return Objects.equals(getType().getDisplayName(),"Listable");
	}

	default boolean isNumerable()
	{
		return Objects.equals(getType().getDisplayName(),"Numerable");
	}

	@Override IFunctional replicate();

	default Record asRecord()
	{
		if(!(this instanceof Record))
			throw new ClassCastException("Functional type is not a Record");
		return (Record)this;
	}

	default Type asType()
	{
		if(!(this instanceof Type))
			throw new ClassCastException("Functional type is not a Type");
		return (Type)this;
	}
}