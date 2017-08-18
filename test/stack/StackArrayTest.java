package stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.EmptyStackException;

import org.junit.Test;

import exceptions.FullStackException;

public class StackArrayTest {

	@Test
	public void testEmpty() throws EmptyStackException, FullStackException {
		StackArray<Integer> stack = new StackArray<Integer>();
		assertTrue(stack.isEmpty());

		stack.push(15);
		assertFalse(stack.isEmpty());

		stack.pop();
		assertTrue(stack.isEmpty());
	}

	@Test
	public void testPush() throws EmptyStackException, FullStackException {
		StackArray<Integer> stack = new StackArray<Integer>();

		stack.push(15);
		assertFalse(stack.isEmpty());
		assertEquals(15, stack.peek(), 0);

		stack.push(12);
		assertFalse(stack.isEmpty());
		assertEquals(12, stack.peek(), 0);
		assertEquals("[15, 12, null, null, null, null, null, null, null, null]", stack.toString());
	}

	@Test
	public void testPop() throws EmptyStackException, FullStackException {
		StackArray<Integer> stack = new StackArray<Integer>();

		stack.push(15);
		assertFalse(stack.isEmpty());

		stack.pop();
		assertTrue(stack.isEmpty());
	}

	@Test
	public void testFull() throws EmptyStackException, FullStackException {
		StackArray<Integer> stack = new StackArray<Integer>(1);
		assertFalse(stack.isFull());

		stack.push(15);
		assertTrue(stack.isFull());

		stack.pop();
		assertFalse(stack.isFull());
	}

	@Test
	public void testMultipleString() throws EmptyStackException, FullStackException {
		StackArray<String> stack = new StackArray<String>();

		stack.push("Hello");
		stack.push("World");
		assertEquals("World", stack.peek());
		assertEquals("[Hello, World, null, null, null, null, null, null, null, null]", stack.toString());

		stack.pop();
		assertEquals("Hello", stack.peek());
	}

	@Test
	public void testOverwrite() throws EmptyStackException, FullStackException {
		StackArray<Integer> stack = new StackArray<Integer>();

		stack.push(15);
		assertEquals(15, stack.peek(), 0);

		stack.push(12);
		assertEquals(12, stack.peek(), 0);

		stack.push(17);
		assertEquals(17, stack.peek(), 0);

		assertEquals("[15, 12, 17, null, null, null, null, null, null, null]", stack.toString());

		stack.pop();
		assertEquals(12, stack.peek(), 0);

		stack.push(88);
		assertEquals(88, stack.peek(), 0);
		assertEquals("[15, 12, 88, null, null, null, null, null, null, null]", stack.toString());
	}

	@Test
	public void testSize() throws EmptyStackException, FullStackException {
		StackArray<Integer> stack = new StackArray<Integer>();
		assertEquals(stack.size(), 0, 0);

		stack.push(15);
		assertEquals(stack.size(), 1, 0);

		stack.pop();
		assertEquals(stack.size(), 0, 0);
	}
}
