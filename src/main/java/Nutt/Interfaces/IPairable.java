package Nutt.Interfaces;

import Nutt.Pair;

import java.util.List;

public interface IPairable<K,V>
{
	List<Pair<K,V>> pairs();

	List<Pair<K,V>> pairsReversed();
}