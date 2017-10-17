package math;

/**
 * Given an integer, determine whether the integer is a valid palindrome.
 * 
 * @author Tzipora Ziegler
 * @see https://leetcode.com/problems/palindrome-number
 */
public class IntPalindromeCheck {

	public class Solution {

		/**
		 * Reverts half of the number and compares it to the other half.
		 * Time complexity : O(log{10}n). We divided the input by 10 for every iteration, so the time complexity is
		 * O(log{10} n)<br>
		 * Space complexity : O(1) - no extra space used
		 * 
		 * @param x
		 * @return
		 */
		public boolean isPalindrome(int x) {
			// Special cases:
			// As discussed above, when x < 0, x is not a palindrome.
			// Also if the last digit of the number is 0, in order to be a palindrome,
			// the first digit of the number also needs to be 0.
			// Only 0 satisfy this property.
			if (x < 0 || (x % 10 == 0 && x != 0)) {
				return false;
			}

			int revertedNumber = 0;
			while (x > revertedNumber) {
				// x % 10 gets the last digit
				// multiply the number by 10 to move them up a place value, and then add the new last digit
				revertedNumber = revertedNumber * 10 + x % 10;

				// remove the last digit by dividing the number by 10 and moving all numbers down a place value.
				x /= 10;
			}

			// When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
			// For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123,
			// since the middle digit doesn't matter in palidrome(it will always equal to itself),
			// we can simply get rid of it.
			return x == revertedNumber || x == revertedNumber / 10;
		}

		/**
		 * Converts the number to a String and compares the String to a reversed version of the String.<br>
		 * This solution is not recommended since it requires extra non-constant space.
		 * 
		 * @param x
		 * @return
		 */
		public boolean isPalindromeUsingString(int x) {
			String s1 = String.valueOf(x);
			String reversed = new StringBuilder(s1).reverse().toString();

			return s1.equals(reversed);
		}
	}
}
