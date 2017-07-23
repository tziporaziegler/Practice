package array;

import java.util.Collections;
import java.util.List;

/**
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.<br>
 * <p>
 * <strong>Example:</strong><br>
 * Given <code>[100, 4, 200, 1, 3, 2]</code>,<br>
 * The longest consecutive elements sequence is <code>[1, 2, 3, 4]</code>. Return its length: <code>4</code>.
 * <p>
 * Your algorithm should run in <code>O(n)</code> complexity.
 * 
 * @author Tzipora Ziegler
 * @see https://www.interviewbit.com/problems/longest-consecutive-sequence/
 */
public class LongestConsecutiveSequence {
	public int longestConsecutive(final List<Integer> a) {
		int max = 0;

		if (a == null || a.size() == 0) {
			return max;
		}

		max = 1;

		if (a.size() == 1) {
			return max;
		}

		Collections.sort(a);

		int last = a.get(0);

		int currentCount = 1;

		for (int i = 1; i < a.size(); i++) {

			int current = a.get(i);

			// System.out.println("current: " + current);
			// System.out.println("last: " + last);
			// System.out.println("current count: " + currentCount);

			if (current != last) {

				if (current == last + 1) {
					currentCount++;

					if (currentCount > max) {
						max = currentCount;
					}
				}
				else {
					currentCount = 1;
				}
			}

			last = current;
		}

		return max;
	}
}
