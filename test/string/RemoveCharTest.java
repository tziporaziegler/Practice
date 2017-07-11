package string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveCharTest {

	@Test
	public void somethingTest() {
		final String word = "something";

		final RemoveChar remover = new RemoveChar();
		assertEquals("someting", remover.replace(word, 'h'));
		assertEquals("somethng", remover.replace(word, 'i'));
	}

	@Test
	public void appleTest() {
		final String word = "apple";

		final RemoveChar remover = new RemoveChar();
		assertEquals("ale", remover.replace(word, 'p'));
	}
}
