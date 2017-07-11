package string;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyStringTest {

	@Test
	public void test120() {
		assertEquals(new MultiplyString().multiply("10", "12"), "120");
	}
	
	@Test
	public void test0() {
		assertEquals(new MultiplyString().multiply("123409897", "0"), "0");
	}
	
	@Test
	public void test00() {
		assertEquals(new MultiplyString().multiply("0", "0"), "0");
	}
	
	@Test
	public void test56() {
		assertEquals(new MultiplyString().multiply("56", "56"), "3136");
	}
	
	@Test
	public void test9999999999() {
		assertEquals(new MultiplyString().multiply("999999", "999999"), "999998000001");
	}

}
