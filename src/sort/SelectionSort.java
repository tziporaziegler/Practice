package sort;

public class SelectionSort {

	public int[] sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int lowIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[lowIndex]) {
					lowIndex = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[lowIndex];
			arr[lowIndex] = temp;
		}
		return arr;
	}

}