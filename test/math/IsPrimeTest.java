package math;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IsPrimeTest {

	@Test
	public void test1() {
		assertTrue(IsPrime.isPrime(1));
	}

	@Test
	public void test2() {
		assertTrue(IsPrime.isPrime(2));
	}

	@Test
	public void test3() {
		assertTrue(IsPrime.isPrime(3));
	}

	@Test
	public void testTrue() {
		assertTrue(IsPrime.isPrime(17));
		assertTrue(IsPrime.isPrime(179));
		assertTrue(IsPrime.isPrime(181));
		assertTrue(IsPrime.isPrime(191));
		assertTrue(IsPrime.isPrime(199));
		assertTrue(IsPrime.isPrime(1819999999));
	}

	@Test
	public void testFalse() {
		assertFalse(IsPrime.isPrime(123225));
		assertFalse(IsPrime.isPrime(1232258));
		assertFalse(IsPrime.isPrime(1919999999));
		assertFalse(IsPrime.isPrime(1999999999));
		assertFalse(IsPrime.isPrime(1999999990));
	}

	@Test
	public void testTime() {
		for (int i = 0; i <= 100; i++) {
			assertTrue(IsPrime.isPrime(1));
			assertTrue(IsPrime.isPrime(2));
			assertTrue(IsPrime.isPrime(3));
			assertTrue(IsPrime.isPrime(17));
			assertTrue(IsPrime.isPrime(179));
			assertTrue(IsPrime.isPrime(181));
			assertTrue(IsPrime.isPrime(191));
			assertTrue(IsPrime.isPrime(199));
			assertFalse(IsPrime.isPrime(123225));
			assertFalse(IsPrime.isPrime(1232258));
			assertTrue(IsPrime.isPrime(1819999999));
			assertFalse(IsPrime.isPrime(1919999999));
			assertFalse(IsPrime.isPrime(1999999999));
			assertFalse(IsPrime.isPrime(1999999990));
		}
	}

}
