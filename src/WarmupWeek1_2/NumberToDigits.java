package WarmupWeek1_2;

public class NumberToDigits {

    public static int[] divideNumIntoDigits(int n){

        int num = n;
        int numLength = 0; // Will store number of digits in n

        while (num > 0) {
            numLength++;
            num = num / 10;
        }

        int[] digitsBackwards = new int[numLength];
        int[] digits = new int[numLength];

        for(int i = 0; i < numLength; i++){
            digitsBackwards[i] = n % 10;
            n = n / 10;
        }

        for(int i = numLength - 1; i >= 0; i--){
            digits[numLength - i - 1] = digitsBackwards[i];
        }

        return digits;

    }

}
