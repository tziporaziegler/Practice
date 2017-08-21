package math;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FindFactorsTest {

	@Test
	public void test12() {
		FindFactors find = new FindFactors();

		int num = 12;
		List<Integer> factors = Arrays.asList(1, 2, 3, 4, 6, 12);

		assertEquals(factors, find.findFactors(num));
	}

	@Test
	public void test1000000() {
		FindFactors find = new FindFactors();

		int num = 1000000;
		List<Integer> factors = Arrays.asList(1, 2, 4, 5, 8, 10, 16, 20, 25, 32, 40, 50, 64, 80, 100, 125, 160, 200,
				250, 320, 400, 500, 625, 800, 1000, 1250, 1600, 2000, 2500, 3125, 4000, 5000, 6250, 8000, 10000, 12500,
				15625, 20000, 25000, 31250, 40000, 50000, 62500, 100000, 125000, 200000, 250000, 500000, 1000000);

		assertEquals(factors, find.findFactors(num));
	}
	
	@Test
	public void test1() {
		FindFactors find = new FindFactors();

		int num = 1;
		List<Integer> factors = Arrays.asList(1);

		assertEquals(factors, find.findFactors(num));
	}
	
	@Test
	public void test0() {
		FindFactors find = new FindFactors();

		int num = 0;
		List<Integer> factors = new ArrayList<Integer>();
		
		assertEquals(factors, find.findFactors(num));
	}

	@Test
	public void testTime() {
		FindFactors find = new FindFactors();

		int num = 999999998;
		find.findFactors(num);

		num = 999999999;
		find.findFactors(num);
		
		num = 1000000000;
		find.findFactors(num);

		num = 22222222;
		find.findFactors(num);
	}

	@Test
	public void test999999998Time() {
		FindFactors find = new FindFactors();

		int num = 999999998;
		find.findFactors(num);
	}

	@Test
	public void test999999999Time() {
		FindFactors find = new FindFactors();

		int num = 999999999;
		find.findFactors(num);
	}

	@Test
	public void test1000000000Time() {
		FindFactors find = new FindFactors();

		int num = 1000000000;
		find.findFactors(num);
	}

	@Test
	public void test22222222Time() {
		FindFactors find = new FindFactors();

		int num = 22222222;
		find.findFactors(num);
	}
}
