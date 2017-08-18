package algorithms.search;

public class BinarySearch {
	
	public boolean search(int[] arr, int value) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int middle = (low + high) / 2;

			if (arr[middle] < value) {
				low = middle + 1;
			}
			else if (arr[middle] > value) {
				high = middle - 1;
			}
			else {
				return true;
			}
		}
		return false;
	}

}
