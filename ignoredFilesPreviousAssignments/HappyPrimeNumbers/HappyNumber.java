package HappyPrimeNumbers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HappyNumber {

	private static final int[] invariants = {0, 1, 4, 16, 20, 37, 42, 58, 89, 145};
	
	private static boolean isInvariant(int n) {
		for (int invariant : invariants) {
			if (n == invariant) {
				return true;
			}
		}
		return false;
	}
	
	private static int sumSquareDigits(int n) {
		int sumsquare = 0;
		while (n > 0) {
			int digit = n % 10;
			n = n / 10;
			sumsquare += (digit * digit);
		}
		return sumsquare;
	}
	
	public static boolean isHappy(int n) throws IllegalArgumentException
	{
		if (n < 0) {
			throw new IllegalArgumentException("must be positive integer");
		}
		
		while (!isInvariant(n)) {
			n = sumSquareDigits(n);
		}
		return n == 1;		
	}


}
