/**
 * This class provides a method to reverse a given string.
 */
public class ReverseString {
    /**
     * Reverses the characters of the input string.
     * @param str The input string to be reversed.
     * @return The reversed string.
     */
    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        // Iterate through the characters of the input string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            // Append each character to the StringBuilder in reverse order
            reversed.append(str.charAt(i));
        }
        // Convert the StringBuilder to a string and return
        return reversed.toString();
    }
}
