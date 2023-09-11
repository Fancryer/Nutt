package Nutt.Interfaces;

/**
 The `IIndexed` interface represents functionality for accessing elements by index.
 @param <R> the type of the returned value when accessing an element
 @param <I> the type of the index
 @param <V> the type of the value that can be set at an index */
public interface IIndexed<R,I,V>
{
	/**
	 Gets the element at the specified index.
	 @param index the index of the element
	 @return the element at the specified index
	 */
	R getAt(I index);

	/**
	 Sets the value at the specified index.
	 @param index the index to set the value at
	 @param value the value to be set
	 @return the previous value at the specified index
	 */
	R setAt(I index,V value);
}