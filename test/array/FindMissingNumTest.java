package array;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindMissingNumTest {

	@Test
	public void test52() {
		int[] numbers = new int[99];

		int number = 1;

		for (int i = 0; i < 99; i++) {
			numbers[i] = number;
			number++;

			if (number == 52) {
				number++;
			}
		}

		final FindMissingNum missing = new FindMissingNum();

		assertEquals(missing.missingNumRemove(numbers), 52);
		assertEquals(missing.missingNumAdd(numbers), 52);
	}

	@Test
	public void test1() {
		int[] numbers = new int[99];

		int number = 2;

		for (int i = 0; i < 99; i++) {
			numbers[i] = number;
			number++;
		}

		final FindMissingNum missing = new FindMissingNum();

		assertEquals(missing.missingNumRemove(numbers), 1);
		assertEquals(missing.missingNumAdd(numbers), 1);
	}

	@Test
	public void test100() {
		int[] numbers = new int[99];

		for (int i = 0; i < 99; i++) {
			numbers[i] = i + 1;
		}

		final FindMissingNum missing = new FindMissingNum();

		assertEquals(missing.missingNumRemove(numbers), 100);
		assertEquals(missing.missingNumAdd(numbers), 100);
	}
}
