package WarmupWeek1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args){

        //Create scanner class
        Scanner input = new Scanner(System.in);

        //Get input from user and notify if input was invalid
        int numberToGenerate = 0;
        try{
            numberToGenerate = input.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Invalid input, input must be an integer");
        }

        //Number generating section
        int happyPrimesGenerated = 0;
        int[] happyPrimes = new int[numberToGenerate];
        int numberCycler = 0;

        while(happyPrimesGenerated < numberToGenerate){

            // Initialize booleans
            boolean isPrime;
            boolean isHappy;

            // Check if number in cycler is prime and happy
            isPrime = PrimeNumber.isPrime(numberCycler);
            isHappy = HappyNumber.isHappy(numberCycler);

            // If it is both happy and prime
            if(isPrime && isHappy){
                // Store number in array
                happyPrimes[happyPrimesGenerated] = numberCycler;
                // Increase counter of primes generated
                happyPrimesGenerated++;
            }

            // Increase Cycler for next loop
            numberCycler++;
        }

        for(int num : happyPrimes){
            System.out.println(num);
        }
    }
}
