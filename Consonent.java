public class Consonent {
    public static void main(String[] args) {
        String input = "jay-ant";
        String result = getLetters(input, 0);
        result = result.toLowerCase();
        int count = countConsonants(result, 0);
        System.out.println(count);
    }
    public static String getLetters(String input, int index) {
        if (index == input.length()) {
            return "";
        }
        char currentChar = input.charAt(index);
        if (Character.isLetter(currentChar)) {
            return currentChar + getLetters(input, index + 1);
        }
        else {
            return getLetters(input, index + 1);
        }
    }
    public static int countConsonants(String input, int index) {
        if (index == input.length()) {
            return 0;
        }
        char currentChar = input.charAt(index);
        if (!(currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u')) {
            return 1 + countConsonants(input, index + 1);
        }
        else {
            return countConsonants(input, index + 1);
        }
    }
}
