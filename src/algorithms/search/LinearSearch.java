package algorithms.search;

public class LinearSearch {

	public boolean search(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return true;
			}
		}

		return false;
	}
}
