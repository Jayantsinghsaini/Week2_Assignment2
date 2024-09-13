/***
 * The purpose of this program is to count the number of consonants in a given string entered by the user.
 * Name - Jayant Singh
 * Date - 12/09/24
 */
import java.util.Scanner;
public class Consonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println(Constant.ENTER_STRING);
                String input = scanner.nextLine();
                String result = getLetters(input, 0);
                result = result.toLowerCase();
                int count = countConsonants(result, 0);
                System.out.println(Constant.CONSONANT_NUMBER + count);
            }
            catch (Exception e) {
                System.out.println(Constant.INVALID);
                return;
            }
        }
    }
    /***
     * This method extracts only the letters from the input string and ignores all non-letter characters such as digits, punctuation, and spaces.
     * It processes the input recursively, examining one character at a time.
     */
    public static String getLetters(String input, int index) {
        if (index == input.length()) {
            return "";
        }
        char currentCharacter = input.charAt(index);
        if (Character.isLetter(currentCharacter)) {
            return currentCharacter + getLetters(input, index + 1);
        }
        else {
            return getLetters(input, index + 1);
        }
    }
    /***
     * This method counts the number of consonants in the string.
     * It checks each character recursively to determine if it is a consonant (i.e., not a vowel).
     */
    public static int countConsonants(String input, int index) {
        if (index == input.length()) {
            return 0;
        }
        char currentCharacter = input.charAt(index);
        if (!(currentCharacter == 'a' || currentCharacter == 'e' || currentCharacter == 'i' || currentCharacter == 'o' || currentCharacter == 'u')) {
            return 1 + countConsonants(input, index + 1);
        }
        else {
            return countConsonants(input, index + 1);
        }
    }
}
