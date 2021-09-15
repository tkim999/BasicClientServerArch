package WarmupWeek1_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args){

        //Create scanner class
        Scanner input = new Scanner(System.in);

        //Ask user for input
        System.out.print("Input a number: ");

        //Get input from user and notify if input was invalid
        int inputNumber = 0;
        try{
            inputNumber = input.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Invalid input, input must be an integer");
            System.exit(0);
        }

        // Check if number in cycler is prime and happy
        boolean isPrime = PrimeNumber.isPrime(inputNumber);
        boolean isHappy = HappyNumber.isHappy(inputNumber);

        // If it is both happy and prime
        if(isPrime && isHappy){
            System.out.println(inputNumber + " is Happy-Prime number");
        }
        // If it is only prime
        else if(isPrime){
            System.out.println(inputNumber + " is a Prime number");
        }
        // If it is only happy
        else if(isHappy){
            System.out.println(inputNumber + " is a Happy number");
        }
        // If it is not happy nor prime
        else{
            System.out.println("The prime factors of " + inputNumber + " are: ");

            int[] arrOfPrimeFactors = CalcFactors.getPrimeFactorsOf(inputNumber);
            for(int primeFactor : arrOfPrimeFactors)
                System.out.println(primeFactor);
        }
    }
}
