package math;

/**
 * @author Tzipora Ziegler
 * @see https://www.youtube.com/watch?v=P8Xa2BitN3I
 */
public class FibonacciSequence {

	/**
	 * Calculates and returns a string with `num` number of elements in the fibonacci sequence, space separated.
	 * 
	 * @param num The number of elements in the sequence to print
	 * @return A string with with `num` number of elements in the fibonacci sequence, space separated.
	 */
	public String printSequence(int num) {
		StringBuilder builder = new StringBuilder();

		for (int i = 1; i <= num; i++) {
			builder.append(getElement(i));
			builder.append(" ");
		}
		return builder.toString();
	}

	/**
	 * Non-Memoization<br>
	 * Time complexity = O(2^n)<br>
	 * Space complexity = O(n) for call stack
	 * 
	 * @param position
	 * @return
	 */
	public int getElement(int position) {
		if (position == 0) {
			return 0;
		}

		if (position == 1 || position == 2) {
			return 1;
		}

		return getElement(position - 1) + getElement(position - 2); // tail recursion
	}

	/**
	 * Memoization<br>
	 * Time complexity = O(n)<br>
	 * Space complexity = O(n) for call stack + O(n) for memo array = O(n)
	 * <p>
	 * Decrease time complexity by increasing space complexity. Only compute each
	 * fib number once and then store the number.
	 * 
	 * @param position
	 * @param memo
	 * @return
	 */
	public int getElementMemoization(int position, int[] memo) {
		if (position == 0) {
			return 0;
		}

		if (position == 1 || position == 2) {
			return 1;
		}

		if (memo[position - 2] == 0) {
			// save time by only computing the fib of each number once
			memo[position - 2] = getElementMemoization(position - 1, memo) + getElementMemoization(position - 2, memo);
		}
		return memo[position - 2];
	}
}
