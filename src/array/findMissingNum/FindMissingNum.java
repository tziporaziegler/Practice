package array.findMissingNum;

import java.util.HashSet;

/** 
 * In an array 1-100 numbers are stored, one number is missing how do you find it?
 * 
 * @author Tzipora Ziegler
 * 
 */

public class FindMissingNum {
	
	/**
	 * This method stores the numbers 1-100 in a HashSet. It then loops
	 * through the array of numbers and removes each number from the set.
	 * At the end of the loop, the number remaining in the set will be the
	 * number missing from the array.
	 * 
	 * @param numbers An array of 1-100 numbers with one number missing
	 * @return The missing number
	 */
	public int missingNumRemove(int[] numbers) {
		// populate set of 1-100
		HashSet<Integer> numberSet = new HashSet<Integer>();
		for (int i = 1; i <= 100; i++) {
			numberSet.add(i);
		}

		// loop through the array of number, and remove all existing
		for (int num : numbers) {
			numberSet.remove(num);
		}

		// should be left with the 1 missing number
		return numberSet.iterator().next();
	}
	
	/**
	 * This method adds up the numbers 1-100 to compute the expected total.
	 * It then adds up the numbers found in the array. Finally, it subtracts
	 * the total found in the array, from the expected total, to determine
	 * the missing number.
	 * 
	 * @param numbers An array of 1-100 numbers with one number missing
	 * @return The missing number
	 */
	public int missingNumAdd(int[] numbers){
		int expectedTotal = 100;
		int total = 0;
		
		for(int i = 1; i < 100; i++){
			expectedTotal += i;
			total += numbers[i - 1];
		}
		
		return expectedTotal - total;
	}
}
