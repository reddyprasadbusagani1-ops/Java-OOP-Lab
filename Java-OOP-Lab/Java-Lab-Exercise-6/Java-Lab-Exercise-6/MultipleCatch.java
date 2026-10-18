// Aim: To demonstrate multiple catch clauses.
public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            int index = Integer.parseInt(args.length > 0 ? args[0] : "5");
            System.out.println("Value: " + numbers[index]);
        } catch (NumberFormatException e) {
            System.out.println("Please provide a valid integer index.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of range.");
        } catch (Exception e) {
            System.out.println("An unexpected exception occurred.");
        }
    }
}
