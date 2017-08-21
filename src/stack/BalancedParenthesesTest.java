package stack;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BalancedParenthesesTest {

	@Test
	public void testBalanced() {
		assertTrue(BalancedParentheses.isBalanced("({[]})"));
	}

	@Test
	public void testEmpty() {
		assertTrue(BalancedParentheses.isBalanced(""));
	}

	@Test
	public void testUnbalanced() {
		assertFalse(BalancedParentheses.isBalanced("{([]})"));
	}

	@Test
	public void testMissing() {
		assertFalse(BalancedParentheses.isBalanced("{([])"));
	}
	
	@Test
	public void testExtraLetters() {
		assertTrue(BalancedParentheses.isBalanced("as(dfg{d[]s}aad)"));
	}

}
