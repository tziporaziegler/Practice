package stack;

import java.util.Arrays;
import java.util.EmptyStackException;

import exceptions.FullStackException;

/**
 * Task: Create your own class or a set of functions that implements a stack.
 * 
 * @author Tzipora Ziegler
 */
public class StackArray<E> implements IStackArray<E> {

	/* If you don't want to set the max capacity, you can use an ArrayList instead of an array.
	 * Then, you can simply use: data.add(0, value), data.remove(0), data.size() and data.isEmpty() for the 4 methods.
	 * Like java.util.Stacks, ArrayLists do have a Integer.MAX_VALUE capacity limit. LinkedLists don't have that limit.
	 * I chose to use an array, since it best demonstrates what actually happens in a Stack. */

	private static final int DEFAULT_CAPACITY = 10;

	private E[] data;
	private int top;

	public StackArray() {
		this(DEFAULT_CAPACITY);
	}

	@SuppressWarnings("unchecked")
	public StackArray(int capacity) {
		top = -1;
		data = (E[]) new Object[capacity];
	}

	/**
	 * Adds a data element to the top of the stack.
	 * 
	 * @param value The element to add
	 * @throws FullStackException
	 */
	public void push(E value) throws FullStackException {
		if (isFull()) {
			throw new FullStackException("Stack is Full");
		}

		data[++top] = value;
	}

	/**
	 * Removes a data element from the top of the stack.
	 * 
	 * @throws EmptyStackException
	 */
	public void pop() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException();
		}

		top--;
	}

	/**
	 * Returns the top element of the stack.
	 * 
	 * @return The top element of the stack
	 * @throws EmptyStackException
	 */
	public E peek() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException();
		}

		return data[top];
	}

	/**
	 * Returns the total number of elements in the stack.
	 * 
	 * @return The total number of elements in the stack
	 */
	public int size() {
		return top + 1;
	}

	/**
	 * Returns true if the stack is empty.
	 * 
	 * @return If the stack if empty
	 */
	public boolean isEmpty() {
		return top == -1;
	}

	/**
	 * Returns true if the stack has reached its max capacity.
	 * 
	 * @return If the stack if full
	 */
	public boolean isFull() {
		return top + 1 == data.length;
	}

	/**
	 * Prints the stack data in a readable format.
	 * <p>
	 * Example:<br>
	 * <code>[15, 12, 18, 33, null, null, null, null, null, null]</code>
	 */
	@Override
	public String toString() {
		return Arrays.toString(data);
	}
}
