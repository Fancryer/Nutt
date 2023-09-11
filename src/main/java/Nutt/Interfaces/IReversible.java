package Nutt.Interfaces;

import java.util.List;

public interface IReversible<T,E>
{
	List<E> getElementsReversed();

	T reverse();
}