package array;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Given an array of integers and given a number `x`, find all the unique pairs of elements (a,b),
 * whose summation is equal to X.
 * <p>
 * Do not return repeats, like (0,5) is same as (5,0).
 * 
 * @author Tzipora Ziegler
 *
 */
public class FindPairs {
	
	public ArrayList<Integer> findDoublePairs(int[] arr, int num)
	{
		ArrayList<int>
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i : arr){
			if(set.contains(num))
			set.add(num);
		}
		
	}
	
	public ArrayList<Integer> findTripplePairs()
	{
	
	}
	
}
