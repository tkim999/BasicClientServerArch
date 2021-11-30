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
        LinkedList<Integer> storageList = new LinkedList<>();

        // Initialize testFactor int to check for factors of nonPrime
        int testFactor = 2;

        while(testFactor < nonPrime){

            // Test if testFactor is a factor of nonPrime
            if(nonPrime % testFactor == 0) {

                // check if testFactor IS prime
                if (PrimeNumber.isPrime(testFactor))
                    // if true, add to ArrayList
                    storageList.add(testFactor);
                else{
                    // Recursively call itself to get prime factors of non-prime-factors
                    int[] nestedPrimeFactors = getPrimeFactorsOf(testFactor);
                    // Store all prime factors in array to return
                    for(int factor : nestedPrimeFactors)
                        storageList.add(factor);
                }
            }


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
