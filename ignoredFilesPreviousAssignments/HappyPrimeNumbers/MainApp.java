package HappyPrimeNumbers;

import java.util.InputMismatchException;
import java.util.Scanner;

// -- test with -1, 'X', 2.7, 0, 1, 11, 86, 7

public class MainApp {
	public static void main (String[] args) {
		Scanner kb = new Scanner(System.in);
		try {
			System.out.print("Value to test: ");
			int n = kb.nextInt();
			boolean h = HappyNumber.isHappy(n);
			boolean p = PrimeNumber.isPrime(n);

			if (h) {
				System.out.println(n + " is a happy number");
			}
			if (p) {
				System.out.println(n + " is a prime number");
			}
			if (p && h) {
				System.out.println(n + " is both happy and prime");
			}
			
			if (!p) {
				System.out.print("The prime factors of " + n + " are: ");
				int[] factors = CompositeNumber.primeFactors(n);
				for (int i : factors) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
		}
		catch (InputMismatchException e) {
			System.out.println("Invalid input");
		}
		catch (IllegalArgumentException e) {
			System.out.println("Invalid number");
		}
		
	}

}
