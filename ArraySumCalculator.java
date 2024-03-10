/**
 * This class provides a method to calculate the sum of elements in an integer array.
 */
public class ArraySumCalculator {
    /**
     * Calculates the sum of elements in the given integer array.
     * @param arr The input integer array.
     * @return The sum of elements in the array.
     */
    public static int calculateSum(int[] arr) {
        int sum = 0;
        // Iterate through the array and add each element to the sum
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
