package array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayUtils {
	public static void printArray(int[] arr) {
		String arrStr = '[' + Arrays.stream(arr)
		        .mapToObj(String::valueOf)
		        .collect(Collectors.joining(",")) + ']';
		
		System.out.println(arrStr);
	}
}
