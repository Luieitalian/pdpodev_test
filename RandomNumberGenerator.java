import java.util.Random;

/**
 * This class provides a method to generate a random number within a specified range.
 */
public class RandomNumberGenerator {
    /**
     * Generates a random integer within the specified range [min, max].
     * @param min The minimum value (inclusive) of the range.
     * @param max The maximum value (inclusive) of the range.
     * @return A random integer within the specified range.
     */
    public static int generateRandomNumber(int min, int max) {
        Random rand = new Random();
        // Generate a random integer within the specified range
        // Formula: rand.nextInt((max - min) + 1) + min
        return rand.nextInt((max - min) + 1) + min;
    }
}
