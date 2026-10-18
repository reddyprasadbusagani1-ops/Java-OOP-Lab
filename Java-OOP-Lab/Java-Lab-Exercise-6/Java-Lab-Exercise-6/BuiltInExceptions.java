// Aim: To demonstrate built-in exceptions in Java.
public class BuiltInExceptions {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException handled.");
        }

        try {
            int[] values = {1, 2, 3};
            System.out.println(values[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled.");
        }

        try {
            int number = Integer.parseInt("abc");
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled.");
        }
    }
}
