package Nutt.Interfaces;

import java.util.stream.Stream;

public interface IStreamable<T>
{
	Stream<T> stream();
}