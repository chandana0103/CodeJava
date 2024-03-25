package ProjectEulerSolutionsJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * The sum of the primes below 2,3,5 is 10.
 * Find the sum of all the primes not greater than given n .
 */
public class SummationOfPrimes___10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		List<Long> primes = new ArrayList<>();
		for (long i = 2; i <= 1000000; i++) {
			if (isPrime(i))
				primes.add(i);
		}
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			long sum = 0;
			for (long num : primes) {
				if (num > n)
					break;
				sum += num;
			}
			System.out.println(sum);
		}

	}

	public static boolean isPrime(long n) {
		if ((n != 2 && n != 3 && n != 5) && (n % 2 == 0 || n % 3 == 0 || n % 5 == 0))
			return false;
		for (long i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;

	}

}
