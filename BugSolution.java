import java.util.Scanner;

public class BugSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numerator (x): ");
        int x = scanner.nextInt();
        System.out.print("Enter the denominator (y): ");
        int y = scanner.nextInt();

        try {
            int result = x / y;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero is not allowed.");
        } finally {
            scanner.close();
        }
    }
}