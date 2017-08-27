package array;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class PowersetTest {

	@Test
	public void testSet() {
		Powerset power = new Powerset();

		HashSet<Integer> mySet = new HashSet<Integer>(Arrays.asList(1, 2, 3));
		Set<Set<Integer>> result = power.getPowerset(mySet);

		Set<Set<Integer>> solution = new HashSet<Set<Integer>>();
		solution.add(new HashSet<Integer>());
		solution.add(new HashSet<Integer>(Arrays.asList(1)));
		solution.add(new HashSet<Integer>(Arrays.asList(2)));
		solution.add(new HashSet<Integer>(Arrays.asList(1, 2)));
		solution.add(new HashSet<Integer>(Arrays.asList(3)));
		solution.add(new HashSet<Integer>(Arrays.asList(1, 3)));
		solution.add(new HashSet<Integer>(Arrays.asList(2, 3)));
		solution.add(new HashSet<Integer>(Arrays.asList(1, 2, 3)));

		assertEquals(result, solution);
	}

	@Test
	public void testArray() {
		Powerset power = new Powerset();

		Integer[] arr = { 1, 2, 3 };
		Set<Set<Integer>> result = power.getPowerset(arr, 0);

		Set<Set<Integer>> solution = new HashSet<Set<Integer>>();
		solution.add(new HashSet<Integer>());
		solution.add(new HashSet<Integer>(Arrays.asList(1)));
		solution.add(new HashSet<Integer>(Arrays.asList(2)));
		solution.add(new HashSet<Integer>(Arrays.asList(1, 2)));
		solution.add(new HashSet<Integer>(Arrays.asList(3)));
		solution.add(new HashSet<Integer>(Arrays.asList(1, 3)));
		solution.add(new HashSet<Integer>(Arrays.asList(2, 3)));
		solution.add(new HashSet<Integer>(Arrays.asList(1, 2, 3)));

		assertEquals(result, solution);
	}

}
