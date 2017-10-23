package array;

public class FindSmallestNum {

	public int find(int[] array) throws Exception {
		if (array != null) {
			int smallest = array[0];

			for (int i = 1; i < array.length; i++) {
				int next = array[i];

				if (next < smallest) {
					smallest = next;
				}
			}

			return smallest;
		}

		throw new Exception("Empty array");
	}
}
