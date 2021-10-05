package HappyPrimeNumbers;

import java.util.ArrayList;

public class CompositeNumber {
	public static int[] primeFactors(int n) throws IllegalArgumentException
	{
		ArrayList<Integer> factors = new ArrayList<>();
		
		if (n < 0) {
			throw new IllegalArgumentException("must be positive integer");
		}
		
		int p = 2;
		while (n > 1) {
			if ((n % p) == 0) {
				factors.add(p);
				n = n / p;
			}
			else {
				p = PrimeNumber.nextPrime(p);
			}
		}

		int[] afactors = new int[factors.size()];
		for (int i = 0; i < factors.size(); ++i) {
			afactors[i] = factors.get(i);
		}
		return afactors;
	}

}
