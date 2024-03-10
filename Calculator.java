/**
 * This class provides methods for basic arithmetic operations such as addition, subtraction, multiplication, and division.
 */
public class Calculator {
    /**
     * Returns the sum of two integers.
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of the two integers.
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Returns the difference between two integers.
     * @param a The first integer.
     * @param b The second integer.
     * @return The difference between the two integers.
     */
    public static int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Returns the product of two integers.
     * @param a The first integer.
     * @param b The second integer.
     * @return The product of the two integers.
     */
    public static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Returns the result of dividing one double by another.
     * @param a The numerator.
     * @param b The denominator.
     * @return The result of the division.
     * @throws IllegalArgumentException if the denominator is zero.
     */
    public static double divide(double a, double b) {
        // Check if the denominator is zero
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        // Perform the division
        return a / b;
    }
}
