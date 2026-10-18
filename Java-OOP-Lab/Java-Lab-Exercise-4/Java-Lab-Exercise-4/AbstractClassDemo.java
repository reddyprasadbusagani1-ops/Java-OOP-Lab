// Aim: To write a Java program to demonstrate an abstract class.

abstract class Shape {
    abstract void draw();

    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.display();
        circle.draw();
    }
}
