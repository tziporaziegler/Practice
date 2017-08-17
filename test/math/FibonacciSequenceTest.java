package math;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciSequenceTest {

	@Test
	public void testPrint0Elements() {
		FibonacciSequence seq = new FibonacciSequence();
		assertEquals("", seq.printSequence(0));
	}

	@Test
	public void testPrint1Element() {
		FibonacciSequence seq = new FibonacciSequence();
		assertEquals("1 ", seq.printSequence(1));
	}

	@Test
	public void testPrint7Elements() {
		FibonacciSequence seq = new FibonacciSequence();
		assertEquals("1 1 2 3 5 8 13 ", seq.printSequence(7));
	}

	@Test
	public void testGet0thElement() {
		FibonacciSequence seq = new FibonacciSequence();
		assertEquals(0, seq.getElement(0));
	}

	@Test
	public void testGet1stElement() {
		FibonacciSequence seq = new FibonacciSequence();
		assertEquals(1, seq.getElement(1));
	}

	@Test
	public void testGet7thElement() {
		FibonacciSequence seq = new FibonacciSequence();
		assertEquals(13, seq.getElement(7));
	}

	@Test
	public void testGet10thElement() {
		FibonacciSequence seq = new FibonacciSequence();
		assertEquals(55, seq.getElement(10));
	}

}
