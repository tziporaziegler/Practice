package array.compareArrays;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Test;

import array.compareArrays.CompareArrays;

public class CompareArraysTest {

	@Test
	public void testMissingNumber() throws Exception {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 2, 3, 1, 0, 5 };

		CompareArrays compare = new CompareArrays();

		assertEquals(compare.FindMissingNumber(array1, array2), 4);
	}
	
	@Test
	public void testMissingNumbers() {
		int[] array1 = { 2, 3, 1, 0, 5, 0, 8 };
		int[] array2 = { 1, 2, 3, 4, 5, 6, 7 };
		
		HashSet<Integer> missingNumbers = new HashSet<Integer>();
		missingNumbers.add(0);
		missingNumbers.add(8);
		
		CompareArrays compare = new CompareArrays();

		assertEquals(compare.FindMissingNumbers(array1, array2), missingNumbers);
	}

}
