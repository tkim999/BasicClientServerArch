package WarmupWeek1;

public class PrimeNumber {
    public static boolean isPrime(int n) throws IllegalArgumentException{
        // Check if n is negative
        if(n < 0) throw new IllegalArgumentException();

        boolean divisibleNotPrime;

        int divisor = 2;
        while(divisor < n){
            if(n % divisor == 0)
                return false;
            else
                divisor++;
        }

        return true;
    }

}
