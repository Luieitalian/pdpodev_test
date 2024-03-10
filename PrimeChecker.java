/**
 * This class provides a method to check whether a given number is prime.
 */
public class PrimeChecker {
    /**
     * Checks if the given number is prime.
     * @param num The number to check.
     * @return true if the number is prime, false otherwise.
     */
    public static boolean isPrime(int num) {
        // Numbers less than or equal to 1 are not prime
        if (num <= 1) {
            return false;
        }
        // Check for factors up to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                // If a factor is found, the number is not prime
                return false;
            }
        }
        // If no factors are found, the number is prime
        return true;
    }
}
