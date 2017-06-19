package array;

import java.util.HashSet;
import java.util.Set;

/** Given two arrays, find which number(s) is not present in the second array.
 * 
 * @author Tzipora Ziegler
 * 
 */
public class CompareArrays {

	/**
	 * @param array1 The first array of numbers
	 * @param array2 The second array of numbers
	 * @return The number from the second array that is
	 * 		not present in the first array
	 * @throws Exception Throws an exception if the missing number is not found
	 */
	public int FindMissingNumber(int[] array1, int[] array2) throws Exception {
		Set<Integer> arraySet = new HashSet<Integer>();

		for (int i : array2) {
			arraySet.add(i);
		}

		for (int i : array1) {
			if (!arraySet.contains(i)) {
				return i;
			}
		}

		throw new Exception("Number not found");
	}
	
	public HashSet<Integer> FindMissingNumbers(int[] array1, int[] array2) {
		Set<Integer> arraySet = new HashSet<Integer>();

		for (int i : array2) {
			arraySet.add(i);
		}
		
		HashSet<Integer> missingNumbers = new HashSet<Integer>();

		for (int i : array1) {
			if (!arraySet.contains(i)) {
				missingNumbers.add(i);
			}
		}

		return missingNumbers;
	}
}
