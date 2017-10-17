package array;

import java.util.HashMap;

/**
 * Given an array of integers, return <strong>indices</strong> of the two numbers such that they add up to a specific
 * target.
 * <p>
 * You may assume that each input would have <strong><em>exactly</em></strong> one solution, and you may not use the
 * same element twice.
 * <p>
 * <strong>Example:</strong>
 * <br>
 * <code>Given nums = [2, 7, 11, 15], target = 9,<br>
 * <br>
 * Because nums[0] + nums[1] = 2 + 7 = 9,<br>
 * return [0, 1].</code>
 * 
 * @author Tzipora Ziegler
 * @see https://leetcode.com/problems/two-sum
 */
public class TwoSum {
	public int[] twoSum(int[] nums, int target) {

		HashMap<Integer, Integer> found = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			int current = nums[i];
			int difference = target - current;

			if (found.containsKey(difference)) {
				return new int[] { found.get(difference), i };
			}

			found.put(current, i);
		}

		return null;
	}
}
