// Aim: To demonstrate exception handling using try, catch, and finally.
public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
