/***
 * this Java program converts a binary number into its decimal equivalent.
 * It takes a binary number as input from the user, verifies that the input contains only binary digits (0 and 1),
 * and then recursively calculates its decimal value.
 * Name - Jayant Singh
 * Date - 12/09/24
 */
import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println(Constant.ENTER_BINARY);
                int binaryNumber = scanner.nextInt();
                String binaryString = Integer.toString(binaryNumber);
                if (!binaryString.matches("[01]+")) {
                    System.out.println(Constant.INVALID);
                    return;
                }
                long decimalValue = binaryToDecimal(binaryNumber, 0);
                System.out.println(Constant.RESULT + decimalValue);
            }
            catch (Exception e) {
                System.out.println(Constant.INVALID);
                return;
            }
        }
    }
    /***
     *This method recursively converts a binary number into its decimal equivalent.
     */
    public static int binaryToDecimal(long binaryNumber, long index) {
        if (binaryNumber == 0) {
            return 0;
        }
        int lastDigit = (int) (binaryNumber % 10);
        return lastDigit * (int) Math.pow(2, index) + binaryToDecimal(binaryNumber / 10, index + 1);
    }
}
