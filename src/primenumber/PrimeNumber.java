package primenumber;

public class PrimeNumber {
    public static void main(String[] args) {

        int number = 11;

        if (isPrime(number, 3))
            System.out.println("Yes");
        else
            System.out.println("No");

    }

    private static boolean isPrime(int number, int divisor) {
        if (number <= 2) {
            return number == 2;
        }
        if (number % 2 == 0) // Check for even or not
            return false;
        if (divisor >= number)
            return true;
        if (number % divisor == 0)
            return false;

        // Check for next divisor
        // Because we checked for even numbers we can skip even divisors
        return isPrime(number, divisor + 2);
    }
}
