package array;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exceptions.DuplicateNotFoundException;

public class FindDuplicateNumTest {

	@Test
	public void testEndOfArray() throws DuplicateNotFoundException {
		int[] numbers = new int[101];

		for (int i = 1; i <= 100; i++) {
			numbers[i - 1] = i;
		}

		numbers[100] = 67;

		final FindDuplicateNum dup = new FindDuplicateNum();
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

		final FindDuplicateNum dup = new FindDuplicateNum();
		assertEquals(dup.findDuplicate(numbers), 35);
	}

	@Test
	public void testBeginningOfArray() throws DuplicateNotFoundException {
		int[] numbers = new int[101];

		numbers[0] = 1;
		for (int i = 1; i <= 100; i++) {
			numbers[i] = i;
		}

		final FindDuplicateNum dup = new FindDuplicateNum();
		assertEquals(dup.findDuplicate(numbers), 1);
	}

}
