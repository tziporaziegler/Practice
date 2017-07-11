package string;

import java.util.ArrayList;

/**
 * Given two numbers represented as strings, return multiplication of the numbers as a string.
 * <p>
 * Note: The numbers can be arbitrarily large and are non-negative.<br>
 * Note2: Your answer should not have leading zeroes. For example, 00 is not a valid answer. 
 * <p>
 * For example, given strings <code>"12", "10"</code>, your answer should be <code>"120"</code>.
 * <p>
 * <strong>NOTE:</strong> DO NOT USE BIG INTEGER LIBRARIES.
 * 
 * @author Tzipora Ziegler
 * 
 * @see https://www.interviewbit.com/problems/multiply-strings/
 *
 */
public class MultiplyString {
	public String multiply(String a, String b) {
		if ("0".equals(a) || "0".equals(b))
		{
			return "0";
		}

		final ArrayList<Integer> productArray = new ArrayList<Integer>();
		int moveOver = 1;

		for (int j = b.length() - 1; j >= 0; j--) {
			int leftover = 0;
			int position = productArray.size() - moveOver++;
			final int bottomDigit = Character.getNumericValue(b.charAt(j));

			for (int i = a.length() - 1; i >= 0; i--) {
				final int topDigit = Character.getNumericValue(a.charAt(i));
				final int currentDigit = position >= 0 ? productArray.get(position) : 0;
				final int product = bottomDigit * topDigit + leftover + currentDigit;
				final int placeNumber = product % 10;
				leftover = product / 10;

				if (position >= 0) {
					productArray.set(position, placeNumber);
				}
				else {
					productArray.add(0, placeNumber);
				}

				position--;
			}

			if (leftover != 0) {
				productArray.add(0, leftover);
			}

		}

		return printList(productArray);
	}

	private String printList(ArrayList<Integer> list) {
		final StringBuilder builder = new StringBuilder();
		for (final int digit : list) {
			if (builder.length() > 0 || digit != 0) {
				builder.append(digit);
			}
		}

		return builder.toString();
	}
}
