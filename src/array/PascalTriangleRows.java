package array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given numRows, generate the first numRows of Pascal's triangle.<br>
 * Pascal's triangle : To generate A[C] in row R, sum up A'[C] and A'[C-1] from previous row R - 1.<br>
 * <p>
 * <strong>Example:</strong>
 * <p>
 * Given numRows = 5
 * <p>
 * Return
 * 
 * <pre>
 * [
 *     [1],
 *     [1,1],
 *     [1,2,1],
 *     [1,3,3,1],
 *     [1,4,6,4,1]
 * ]
 * </pre>
 * 
 * @author Tzipora Ziegler
 * @see https://www.interviewbit.com/problems/pascal-triangle-rows/
 */
public class PascalTriangleRows {
	public ArrayList<ArrayList<Integer>> generate(int a) {
		final ArrayList<ArrayList<Integer>> rows = new ArrayList<ArrayList<Integer>>();

		ArrayList<Integer> previousRow = new ArrayList<Integer>(Arrays.asList(1));
		if (a > 0) {
			rows.add(previousRow);
		}

		for (int i = 1; i < a; i++) {
			final ArrayList<Integer> row = new ArrayList<Integer>();

			row.add(1);

			for (int j = 1; j < i; j++) {
				row.add(previousRow.get(j) + previousRow.get(j - 1));
			}

			row.add(previousRow.get(i - 1));

			rows.add(row);
			previousRow = row;
		}

		return rows;
	}
}
