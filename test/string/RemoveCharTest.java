package string;

import static org.junit.Assert.*;

import org.junit.Test;

import string.RemoveChar;

public class RemoveCharTest {

	@Test
	public void somethingTest() {
		String word = "something";
		
		RemoveChar remover = new RemoveChar();
		assertEquals("someting", remover.replace(word, 'h'));
		assertEquals("somethng", remover.replace(word, 'i'));
	}

	@Test
	public void appleTest() {
		String word = "apple";
		
		RemoveChar remover = new RemoveChar();
		assertEquals("ale", remover.replace(word, 'p'));
	}
}
