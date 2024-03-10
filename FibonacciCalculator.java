/**
 * This class provides a method to calculate the nth Fibonacci number.
 */
public class FibonacciCalculator {
    /**
     * Calculates the nth Fibonacci number.
     * @param n The index of the Fibonacci number to calculate.
     * @return The nth Fibonacci number.
     */
    public static int fibonacci(int n) {
        // Base cases: 0 and 1
        if (n <= 1) {
            return n;
        }
        // Initialize variables to store previous two Fibonacci numbers
        int a = 0, b = 1;
        // Calculate Fibonacci number iteratively
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
