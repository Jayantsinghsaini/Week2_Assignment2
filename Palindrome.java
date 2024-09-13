/***
 * This Java program is to find and display all unique palindromic substrings within a given string entered by the user.
 * It does so by breaking the input string into various substrings, checking if each one is a palindrome, and then collecting those palindromes.
 * Name - Jayant Singh
 * Date - 12/09/24
 */
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter a string:");
                String input = scanner.nextLine();
                String[] result = new String[1];
                result[0] = "";
                palindrome(input, result, 0, 0);
                System.out.println("Number of Unique Palindromes: " +( countPalindromes(result[0]) -1));
                System.out.println("Unique Palindromes: " + result[0]);
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
                return;
            }
        }
    }
    /***
     * This is a recursive method that generates all possible substrings of the input string and checks if each substring is a palindrome.
     * If it finds a palindrome, it adds it to the result.
     */
    public static void palindrome(String input, String[] result, int start, int end) {
        if (start >= input.length()) {
            return;
        }
        if (end > input.length()) {
            palindrome(input, result, start + 1, start + 1);
            return;
        }
        String substring = input.substring(start, end);
        if (isPalindrome(substring) && !contains(result[0], substring)) {
            result[0] = addToResult(result[0], substring);
        }
        palindrome(input, result, start, end + 1);
    }
    /***
     * This method checks if a given string (input) is a palindrome by comparing the string to its reverse.
     */
    public static boolean isPalindrome(String input) {
        return input.equals(new StringBuilder(input).reverse().toString());
    }
    /***
     * This method checks if the result string already contains the given palindrome substring.
     */
    public static boolean contains(String result, String substring) {
        if (result.isEmpty()) {
            return false;
        }
        String[] parts = result.split(" ");
        for (String part : parts) {
            if (part.equals(substring)) {
                return true;
            }
        }
        return false;
    }
    /***
     * This method adds a new palindrome substring to the result string.
     */
    public static String addToResult(String result, String substring) {
        if (result.isEmpty()) {
            return substring;
        }
        return result + " " + substring;
    }
    /***
     * This method counts how many unique palindromic substrings have been found.
     */
    public static int countPalindromes(String result) {
        if (result.isEmpty()) {
            return 0;
        }
        return result.split(" ").length;
    }
}
