package array;

import java.util.HashSet;

import exceptions.DuplicateNotFoundException;

/**
 * In an array 1-100 exactly one number is duplicate how do you find it?
 * 
 * @author Tzipora Ziegler
 *
 */
public class FindDuplicateNum {

	/**
	 * @param numbers An array of numbers 1-100 with one duplicate number
	 * @return The duplicated number
	 * @throws DuplicateNotFoundException
	 */
	public int findDuplicate(int[] numbers) throws DuplicateNotFoundException {
		HashSet<Integer> set = new HashSet<Integer>();

		for (int num : numbers) {
			if (set.contains(num)) {
				return num;
			}

			set.add(num);
		}

		throw new DuplicateNotFoundException();
	}
}
