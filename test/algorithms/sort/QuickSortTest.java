package algorithms.sort;

import org.junit.Assert;
import org.junit.Test;

import algorithms.sort.QuickSort;

public class QuickSortTest {

	@Test
	public void quickSortTest() {
		int[] unsorted = { 2, 4, 7, 1, 8, 3, 5, 6 };
		QuickSort sort = new QuickSort();
		int[] sorted = sort.sort(unsorted);

		Assert.assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }, sorted);
	}

}
