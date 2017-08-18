package stack;

import java.util.EmptyStackException;

import exceptions.FullStackException;

public interface IStackArray<E> {

	public void push(E e) throws FullStackException;

	public void pop() throws EmptyStackException;

	public E peek() throws EmptyStackException;

	public int size();

	public boolean isEmpty();

	public boolean isFull();

}
