package sort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MergeSortTest {

	@Test
	public void testDuplicateNum() {
		int[] expecteds = { 1, 2, 2, 3, 5, 6 };

		MergeSort sort = new MergeSort();
		int[] actuals = { 2, 3, 6, 2, 1, 5 };
		sort.mergeSort(actuals);

		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testOneNum() {
		int[] expecteds = { 5 };

		MergeSort sort = new MergeSort();
		int[] actuals = { 5 };
		sort.mergeSort(actuals);

		assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testNull() {
		int[] expecteds = null;

		MergeSort sort = new MergeSort();
		int[] actuals = null;
		sort.mergeSort(actuals);

		assertArrayEquals(expecteds, actuals);
	}
}
