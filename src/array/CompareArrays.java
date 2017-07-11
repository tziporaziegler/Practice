package array;

import java.util.HashSet;
import java.util.Set;

/**
 * Given two arrays, find which number(s) is not present in the second array.
 * 
 * @author Tzipora Ziegler
 */
public class CompareArrays {

	/**
	 * @param array1 The first array of numbers
	 * @param array2 The second array of numbers
	 * @return The number from the second array that is
	 *         not present in the first array
	 * @throws Exception Throws an exception if the missing number is not found
	 */
	public int findMissingNumber(int[] array1, int[] array2) throws Exception {
		final Set<Integer> arraySet = new HashSet<Integer>();

		for (final int i : array2) {
			arraySet.add(i);
		}

		for (final int i : array1) {
			if (!arraySet.contains(i)) {
				return i;
			}
		}

		throw new Exception("Number not found");
	}

	public HashSet<Integer> findMissingNumbers(int[] array1, int[] array2) {
		final Set<Integer> arraySet = new HashSet<Integer>();

		for (final int i : array2) {
			arraySet.add(i);
		}

		final HashSet<Integer> missingNumbers = new HashSet<Integer>();

		for (final int i : array1) {
			if (!arraySet.contains(i)) {
				missingNumbers.add(i);
			}
		}

		return missingNumbers;
	}
}
