package HappyPrimeNumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {

	// -- package scope so that CompositeNumber can access it
	static int nextPrime(int n) {
		++n;
		while (!isPrime(n)) ++n;
		return n;
	}
	
	public static boolean isPrime(int n) throws IllegalArgumentException
	{
		if (n < 0) {
			throw new IllegalArgumentException("must be positive integer");
		}
		else if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i < n / 2; ++i) {
			if ((n % i) == 0) {
				return false;
			}
		}
		return true;
	}
	
	
}
