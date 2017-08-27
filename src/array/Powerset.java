package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given an array or list of objects, return a set of all possible subsets.
 * 
 * @author Tzipora Ziegler
 *
 */
public class Powerset {

	public <T> Set<Set<T>> getPowerset(T[] originalSet, int start) {
		Set<Set<T>> sets = new HashSet<Set<T>>();

		if (originalSet.length == 0 || start >= originalSet.length) {
			sets.add(new HashSet<T>());
			return sets;
		}

		T head = originalSet[start];

		for (Set<T> set : getPowerset(originalSet, ++start)) {
			Set<T> newSet = new HashSet<T>();
			newSet.add(head);
			newSet.addAll(set);
			sets.add(newSet);
			sets.add(set);
		}
		return sets;
	}

	public <T> Set<Set<T>> getPowerset(Set<T> originalSet) {
		Set<Set<T>> sets = new HashSet<Set<T>>();

		if (originalSet.isEmpty()) {
			sets.add(new HashSet<T>());
			return sets;
		}

		List<T> list = new ArrayList<T>(originalSet);
		T head = list.get(0);
		
		//list.remove(0);
		
		for (Set<T> set : getPowerset(new HashSet<T>(list.subList(1, list.size())))) {
			Set<T> newSet = new HashSet<T>();
			newSet.add(head);
			newSet.addAll(set);
			sets.add(newSet);
			sets.add(set);
		}
		return sets;
	}

}
