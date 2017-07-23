package array;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class LongestConsecutiveSequenceTest {

	@Test
	public void test4() {
		final LongestConsecutiveSequence seq = new LongestConsecutiveSequence();

		final List<Integer> a = Arrays.asList(100, 4, 200, 1, 3, 2);
		assertEquals(seq.longestConsecutive(a), 4);
	}

	@Test
	public void testLastDigit() {
		final LongestConsecutiveSequence seq = new LongestConsecutiveSequence();

		final List<Integer> a = Arrays.asList(2, 3, 4, 5, 6);
		assertEquals(seq.longestConsecutive(a), 5);
	}

	@Test
	public void testDuplicates() {
		final LongestConsecutiveSequence seq = new LongestConsecutiveSequence();

		final List<Integer> a = Arrays.asList(1, 4, 1, 1, 5, 3, 2, 2);
		assertEquals(seq.longestConsecutive(a), 5);
	}

	@Test
	public void testEmpty() {
		final LongestConsecutiveSequence seq = new LongestConsecutiveSequence();

		final List<Integer> a = null;
		assertEquals(seq.longestConsecutive(a), 0);
	}

	@Test
	public void test1() {
		final LongestConsecutiveSequence seq = new LongestConsecutiveSequence();

		final List<Integer> a = Arrays.asList(100);
		assertEquals(seq.longestConsecutive(a), 1);
	}

	@Test
	public void testSecondHalf() {
		final LongestConsecutiveSequence seq = new LongestConsecutiveSequence();

		final List<Integer> a = Arrays.asList(100, 5, 6, 101, 4, 99, 97, 98, 7, 4);
		assertEquals(seq.longestConsecutive(a), 5);
	}

	@Test
	public void testTwoAnswers() {
		final LongestConsecutiveSequence seq = new LongestConsecutiveSequence();

		final List<Integer> a = Arrays.asList(100, 5, 6, 101, 4, 99, 97, 98, 7, 4, 3, 3);
		assertEquals(seq.longestConsecutive(a), 5);
	}

	@Test
	public void testNegative() {
		final LongestConsecutiveSequence seq = new LongestConsecutiveSequence();

		final List<Integer> a = Arrays.asList(5, 4, 1, 0, -2, 3, -1, 2);
		assertEquals(seq.longestConsecutive(a), 8);
	}
}
