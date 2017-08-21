package sort;

import org.junit.Assert;
import org.junit.Test;

import sort.QuickSort;

public class QuickSortTest {

	@Test
	public void quickSortTest() {
		final int[] unsorted = { 2, 4, 7, 1, 8, 3, 5, 6 };
		final QuickSort sort = new QuickSort();
		final int[] sorted = sort.sort(unsorted);

		Assert.assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }, sorted);
	}

}
