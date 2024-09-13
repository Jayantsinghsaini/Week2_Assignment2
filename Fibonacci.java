/***
 * The purpose of the Fibonacci program is to compute and
 * display the Fibonacci number for a given position in the Fibonacci sequence.
 * Name - Jayant Singh
 * Date - 12/09/24
 */
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(Constant.ENTER_NUMBER);
                long number = scanner.nextInt();
                if (number > 47 || number < 0) {
                    System.out.println(Constant.RANGE);
                    return;
                }
                long result = fibonacci(number);
                System.out.println(Constant.RESULT + result);
            }
            catch (Exception e) {
                System.out.println(Constant.INVALID);
                return;
            }
        }
    }
    /***
     * This method computes the Fibonacci number for a given position using recursion.
     */
    public static int fibonacci(long number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
