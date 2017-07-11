package array;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Test;

public class CompareArraysTest {

	@Test
	public void testMissingNumber() throws Exception {
		final int[] array1 = { 1, 2, 3, 4, 5 };
		final int[] array2 = { 2, 3, 1, 0, 5 };

		final CompareArrays compare = new CompareArrays();

		assertEquals(compare.findMissingNumber(array1, array2), 4);
	}

	@Test
	public void testMissingNumbers() {
		final int[] array1 = { 2, 3, 1, 0, 5, 0, 8 };
		final int[] array2 = { 1, 2, 3, 4, 5, 6, 7 };

		final HashSet<Integer> missingNumbers = new HashSet<Integer>();
		missingNumbers.add(0);
		missingNumbers.add(8);

		final CompareArrays compare = new CompareArrays();

		assertEquals(compare.findMissingNumbers(array1, array2), missingNumbers);
	}

}
