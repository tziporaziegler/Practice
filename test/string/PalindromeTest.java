package string;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test for all methods in PalindromeCheck
 * 
 * @see PalindromeCheck
 * @author Tzipora Ziegler
 */
public class PalindromeTest {

	@Test
	public void whileCheckTest() {
		final PalindromeCheck check = new PalindromeCheck();
		assertTrue(check.whileCheck("tattarrattat"));
		assertTrue(check.whileCheck("aibohphobia"));
		assertTrue(check.whileCheck("abcba"));
		assertFalse(check.whileCheck("something"));
		assertFalse(check.whileCheck("abca"));
		assertFalse(check.whileCheck(""));
		assertFalse(check.whileCheck(null));
	}

	@Test
	public void stringBuilderCheckTest() {
		final PalindromeCheck check = new PalindromeCheck();
		assertTrue(check.stringBuilderCheck("tattarrattat"));
		assertTrue(check.stringBuilderCheck("aibohphobia"));
		assertTrue(check.stringBuilderCheck("abcba"));
		assertFalse(check.stringBuilderCheck("something"));
		assertFalse(check.stringBuilderCheck("abca"));
		assertFalse(check.stringBuilderCheck(""));
		assertFalse(check.stringBuilderCheck(null));
	}

	@Test
	public void forLoopCheckTest() {
		final PalindromeCheck check = new PalindromeCheck();
		assertTrue(check.forLoopCheck("tattarrattat"));
		assertTrue(check.forLoopCheck("aibohphobia"));
		assertTrue(check.forLoopCheck("abcba"));
		assertFalse(check.forLoopCheck("something"));
		assertFalse(check.forLoopCheck("abca"));
		assertFalse(check.stringBuilderCheck(""));
		assertFalse(check.stringBuilderCheck(null));
	}

}
