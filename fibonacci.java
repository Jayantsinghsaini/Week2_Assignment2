import java.util.Scanner;

public class fibonacci {
    public static int fibonacci(long number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number ");
        long number = scanner.nextInt();
        long result = fibonacci(number);
        System.out.println( "Result: " + result);
    }
}
