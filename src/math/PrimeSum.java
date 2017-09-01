package math;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number.
 * <p>
 * <strong>NOTE</strong> A solution will always exist.
 * Read <a href="https://en.wikipedia.org/wiki/Goldbach%27s_conjecture">Goldbach�s conjecture</a>.
 * <p>
 * <strong>Example:</strong>
 * 
 * <pre>
 * Input : 4
 * Output: 2 + 2 = 4
 * </pre>
 * 
 * If there are more than one solutions possible, return the lexicographically smaller solution.
 * 
 * <pre>
 * If [a, b] is one solution with a <= b,
 * and [c,d] is another solution with c <= d, then
 * 
 * [a, b] < [c, d] 
 * 
 * If a < c OR a==c AND b < d.
 * </pre>
 * 
 * @author Tzipora Ziegler
 * @see https://www.interviewbit.com/problems/prime-sum/
 */
public class PrimeSum {
	public ArrayList<Integer> primesum(int a) {
		int num1 = 2;
		int num2 = a - num1;

		while (num1 < num2) {
			if (isPrime(num1) && isPrime(num2)) {
				break;
			}

			num1++;
			num2 = a - num1;
		}

		return new ArrayList<Integer>(Arrays.asList(num1, num2));
	}

	public boolean isPrime(int num) {
		// check if n is a multiple of 2
		if (num % 2 == 0 && num != 2) {
			return false;
		}

		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
