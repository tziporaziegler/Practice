package string;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import string.MergeAndOrderStringChars;

public class MergeAndOrderStringCharsTest {

	@Test
	public void test() {
		String[] strings = { "hello"};
		assertEquals(MergeAndOrderStringChars.MergeStrings(strings), "ehllo");
	}
	
	@Test
	public void testNonLetters() {
		String[] strings = { "3q2e4t*y&%", "0(jjss&%99k" };
		assertEquals(MergeAndOrderStringChars.MergeStrings(strings), "ejjkqssty");
	}
	
	@Test
	public void testMultiWord() {
		String[] strings = { "hello there", "how are you" };
		assertEquals(MergeAndOrderStringChars.MergeStrings(strings), "aeeeehhhllooorrtuwy");
	}

	@Test
	public void testExtraSpace() {
		String[] strings = { " kjh78tg", "there" };
		assertEquals(MergeAndOrderStringChars.MergeStrings(strings), "eeghhjkrtt");
	}

}
