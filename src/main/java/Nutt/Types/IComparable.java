package Nutt.Types;

public interface IComparable<T>
{
	boolean lessThan(T value);

	boolean greaterTo(T value);

	boolean lessEqualTo(T value);

	boolean greaterEqualTo(T value);

	boolean similarTo(T value);

	boolean notSimilarTo(T value);

	boolean equalTo(T value);

	boolean notEqualTo(T value);
}
