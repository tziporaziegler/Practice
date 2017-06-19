package array.findDuplicateNum;

import static org.junit.Assert.*;

import org.junit.Test;

import array.findDuplicateNum.DuplicateNotFoundException;
import array.findDuplicateNum.FindDuplicateNum;

public class FindDuplicateNumTest {

	@Test
	public void testEndOfArray() throws DuplicateNotFoundException {
		int[] numbers = new int[101];

		for (int i = 1; i <= 100; i++) {
			numbers[i - 1] = i;
		}

		numbers[100] = 67;

		FindDuplicateNum dup = new FindDuplicateNum();
		assertEquals(dup.findDuplicate(numbers), 67);
	}

	@Test
	public void testMiddleOfArray() throws DuplicateNotFoundException {
		int[] numbers = new int[101];

		for (int i = 1; i <= 100; i++) {
			numbers[i - 1] = i;
		}

		numbers[100] = numbers[48];
		numbers[48] = 35;

		FindDuplicateNum dup = new FindDuplicateNum();
		assertEquals(dup.findDuplicate(numbers), 35);
	}

	@Test
	public void testBeginningOfArray() throws DuplicateNotFoundException {
		int[] numbers = new int[101];

		numbers[0] = 1;
		for (int i = 1; i <= 100; i++) {
			numbers[i] = i;
		}

		FindDuplicateNum dup = new FindDuplicateNum();
		assertEquals(dup.findDuplicate(numbers), 1);
	}

}
