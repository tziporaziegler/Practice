package sort;

public class MergeSort {

	public void mergeSort(int[] array) {
		if (array == null || array.length < 2) {
			return;
		}

		sort(array, new int[array.length], 0, array.length - 1);
	}

	private void sort(int[] arr, int[] temp, int lowIndex, int highIndex) {
		if (lowIndex >= highIndex) {
			return;
		}

		int midIndex = (lowIndex + highIndex) / 2;
		sort(arr, temp, lowIndex, midIndex);
		sort(arr, temp, midIndex + 1, highIndex);
		merge(arr, temp, lowIndex, midIndex, highIndex);
	}

	private void merge(int[] arr, int[] temp, int lowIndex, int midIndex, int highIndex) {
		int left = lowIndex;
		int right = midIndex + 1;
		int index = lowIndex;

		// merge elements until finish one side
		while (left <= midIndex && right <= highIndex) {
			temp[index++] = arr[left] < arr[right] ? arr[left++] : arr[right++];
		}

		// copy remaining elements from whichever side still has elements left
		// will really only use one of the following calls
		System.arraycopy(arr, left, temp, index, midIndex - left + 1);
		System.arraycopy(arr, right, temp, index, highIndex - right + 1);

		// copy all values from temp back to original array
		System.arraycopy(temp, lowIndex, arr, lowIndex, highIndex - lowIndex + 1);
	}
}
