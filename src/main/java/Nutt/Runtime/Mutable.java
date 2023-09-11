package Nutt.Runtime;

import Nutt.Annotations.IReplicable;

public class Mutable<T> implements IReplicable<Mutable<T>>
{
	private T value;

	public Mutable(T value)
	{
		this.value=value;
	}

	public T get()
	{
		return value;
	}

	public T set(T value)
	{
		this.value=value;
		return value;
	}

	@Override public Mutable<T> replicate()
	{
		return new Mutable<>(value);
	}

	public String toString()
	{
		return value.toString();
	}
}