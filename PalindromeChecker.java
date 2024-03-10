/**
 * This class provides a method to check whether a given string is a palindrome.
 */
public class PalindromeChecker {
    /**
     * Checks if the given string is a palindrome.
     * @param str The input string.
     * @return true if the input string is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // Initialize pointers for the start and end of the string
        int left = 0;
        int right = str.length() - 1;
        // Loop until pointers meet
        while (left < right) {
            // Compare characters from both ends
            if (str.charAt(left) != str.charAt(right)) {
                // If characters don't match, it's not a palindrome
                return false;
            }
            // Move pointers towards the center
            left++;
            right--;
        }
        // If loop completes without returning false, string is a palindrome
        return true;
    }
}
