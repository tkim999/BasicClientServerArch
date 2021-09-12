package WarmupWeek1_2;

import java.util.*;

public class CalcFactors {
    public static int[] getPrimeFactorsOf(int nonPrime) throws IllegalArgumentException{
        // Check for invalid input
        if(nonPrime < 0)
            throw new IllegalArgumentException();

        // Declare array to return
        int[] arrOfPrimeFactors;

        // Create ArrayList to store all prime factors
        LinkedList<Integer> storageList = new LinkedList<Integer>();

        // Initialize testFactor int to check for factors of the nonPrime
        int testFactor = 1;

        while(testFactor < nonPrime){

            // Test if testFactor is a factor of nonPrime
            if(nonPrime % testFactor == 0)
                if(PrimeNumber.isPrime(testFactor)) // check if testFactor IS prime
                    storageList.add(testFactor); // if true, add to ArrayList

            // Increase testFactor by 1 for next loop
            testFactor++;
        }

        // Initialize array to return
        arrOfPrimeFactors = new int[storageList.size()];
        // Fill array with contents of ArrayList
        for(int i = 0; i < storageList.size(); i++){
            arrOfPrimeFactors[i] = storageList.get(i);
        }

        return arrOfPrimeFactors;
    }
}
