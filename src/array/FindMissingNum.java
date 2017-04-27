package array;

import java.util.HashSet;

/** In an array 1-100 numbers are stored, one number is missing how do you find it?
 * 
 * @author Tzipora Ziegler */

public class FindMissingNum {
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
