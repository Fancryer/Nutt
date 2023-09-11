package Nutt.Interfaces;

import Nutt.Interpreter.References.NuttReference;

import java.util.stream.Stream;

public interface IMappable
{
	<T> Stream<T> map(java.util.function.Function<NuttReference,? extends T> mapper);
}