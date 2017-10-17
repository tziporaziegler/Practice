package array;

/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new
 * length.
 * <p>
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * <p>
 * For example,<br>
 * Given input array <em>nums</em> = <code>[1,1,2]</code>,
 * <br>
 * Your function should return length = <code>2</code>, with the first two elements of <em>nums</em> being
 * <code>1</code> and <code>2</code> respectively. It doesn't matter what you leave beyond the new length.
 * 
 * @author Tzipora Ziegler
 * @see https://leetcode.com/problems/remove-duplicates-from-sorted-array
 */
public class RemoveDuplicates {
	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		int start = 0;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[start]) {
				nums[++start] = nums[i];
			}
		}

		return start + 1;
	}
}
