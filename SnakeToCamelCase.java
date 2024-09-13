/***
 * The purpose of this program is to convert a string from snake_case to camelCase.
 * Snake case is a string format where words are separated by underscores (_),
 * while camel case is a format where words are joined together without spaces,
 * and every word after the first starts with an uppercase letter.
 * Name - Jayant Singh
 * Date - 12/09/24
 */
import java.util.Scanner;
public class SnakeToCamelCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println(Constant.ENTER_STRING);
                String input = scanner.nextLine();
                input = input.replace('_', ' ').trim();
                String[] stringArray = input.split("\\s+");
                stringArray[0] = Character.toLowerCase(stringArray[0].charAt(0)) + stringArray[0].substring(1).toLowerCase();
                String result = caseConverter(stringArray, 1, stringArray[0]);
                System.out.println(Constant.RESULT + result);
            }
            catch (Exception e) {
                System.out.println(Constant.INVALID);
                return;
            }
        }
    }
    /***
     *This is a recursive method that converts the remaining words (after the first one) into camelCase format.
     *  It ensures that the first letter of each subsequent word is capitalized and the rest of the word is lowercase.
     */
    public static String caseConverter(String[] stringArray, int index, String result) {
        if (index == stringArray.length) {
            return result;
        }
        String word = Character.toUpperCase(stringArray[index].charAt(0)) + stringArray[index].substring(1).toLowerCase();
        return caseConverter(stringArray, index + 1, result + word);
    }
}
