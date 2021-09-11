package WarmupWeek1;

import java.util.*;

public class HappyNumber {

    private static LinkedList<Integer> storageList = new LinkedList<Integer>();

    public static boolean isHappy(int n) throws IllegalArgumentException{
        // Check if n is negative
        if(n < 0) throw new IllegalArgumentException();

        boolean repeatedNumber = false;
        for(int i = 0; i < storageList.size(); i++){
            if(storageList.get(i) == n){
                repeatedNumber = true;
            }
        }

        if(repeatedNumber){
            storageList = new LinkedList<Integer>();
            return false;
        }
        else
            storageList.add(n);

        int[] nDigits = NumberToDigits.divideNumIntoDigits(n);
        int sumOfDigitsSquared = 0;

        for(int digit : nDigits){
            sumOfDigitsSquared += (digit * digit);
        }

        if(sumOfDigitsSquared == 1) {
            storageList = new LinkedList<Integer>();
            return true;
        }
        else
            return isHappy(sumOfDigitsSquared);


    }
}
