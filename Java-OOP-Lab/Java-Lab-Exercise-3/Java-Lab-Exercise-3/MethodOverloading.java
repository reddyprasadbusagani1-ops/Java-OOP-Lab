// Exercise 3(b): Demonstrate method overloading

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of two integers: " + calc.add(10, 20));
        System.out.println("Sum of three integers: " + calc.add(10, 20, 30));
        System.out.println("Sum of two decimal numbers: " + calc.add(2.5, 3.5));
    }
}

/*
Sample Output:
Sum of two integers: 30
Sum of three integers: 60
Sum of two decimal numbers: 6.0
*/
