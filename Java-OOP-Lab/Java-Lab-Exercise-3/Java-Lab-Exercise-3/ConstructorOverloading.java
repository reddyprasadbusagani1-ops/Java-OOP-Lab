// Exercise 3(d): Demonstrate constructor overloading

class Rectangle {
    int length;
    int width;

    Rectangle() {
        length = 1;
        width = 1;
    }

    Rectangle(int side) {
        length = side;
        width = side;
    }

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void displayArea() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + (length * width));
        System.out.println();
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);

        System.out.println("Default constructor:");
        r1.displayArea();

        System.out.println("One-argument constructor:");
        r2.displayArea();

        System.out.println("Two-argument constructor:");
        r3.displayArea();
    }
}

/*
Sample Output:
Default constructor:
Length: 1
Width: 1
Area: 1

One-argument constructor:
Length: 5
Width: 5
Area: 25

Two-argument constructor:
Length: 4
Width: 6
Area: 24
*/
