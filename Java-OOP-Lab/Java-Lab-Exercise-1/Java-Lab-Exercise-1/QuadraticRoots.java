/*
Aim: Write a Java program to calculate the roots of a quadratic equation
ax^2 + bx + c = 0 and describe the nature of the roots using discriminant D.
File name: QuadraticRoots.java
*/

import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coefficients a, b and c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("This is not a quadratic equation because a is zero.");
        } else {
            double d = b * b - 4 * a * c;
            System.out.println("Discriminant D = " + d);

            if (d > 0) {
                double root1 = (-b + Math.sqrt(d)) / (2 * a);
                double root2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Nature: Two distinct real roots");
                System.out.println("Root 1 = " + root1);
                System.out.println("Root 2 = " + root2);
            } else if (d == 0) {
                double root = -b / (2 * a);
                System.out.println("Nature: Two equal real roots");
                System.out.println("Root = " + root);
            } else {
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-d) / Math.abs(2 * a);
                System.out.println("Nature: Two complex roots");
                System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
                System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
            }
        }

        sc.close();
    }
}

/*
Sample run:
Enter coefficients a, b and c: 1 -5 6
Discriminant D = 1.0
Nature: Two distinct real roots
Root 1 = 3.0
Root 2 = 2.0

Discriminant rules:
D > 0 : Two distinct real roots
D = 0 : Two equal real roots
D < 0 : Two complex roots

If your syllabus specifically uses ax^2 + bx = 0, enter c as 0.
*/
