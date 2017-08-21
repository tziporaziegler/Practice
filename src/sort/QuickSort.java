package sort;

public class QuickSort {

	public int[] sort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return arr;
		}

		quicksort(arr, 0, arr.length - 1);

		return arr;
	}

	private void quicksort(int[] arr, int start, int end) {
		if (start < end) {
			final int pivotIndex = partition(arr, start, end);
			quicksort(arr, start, pivotIndex - 1);
			quicksort(arr, pivotIndex, end);
		}
	}

	private int partition(int[] arr, int start, int end) {
		int pivotIndex = start;
		final int pivot = arr[end];

		for (int i = start; i < end; i++) {
			if (arr[i] <= pivot) {
				swap(arr, i, pivotIndex);
				pivotIndex++;
			}
		}

		swap(arr, pivotIndex, end);

		return pivotIndex;
	}

	private void swap(int[] arr, int i, int j) {
		final int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
