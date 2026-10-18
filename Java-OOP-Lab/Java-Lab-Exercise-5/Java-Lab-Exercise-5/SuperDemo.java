// Aim: To write a Java program to demonstrate the use of the super keyword.

class Parent {
    int number = 100;

    void display() {
        System.out.println("This is the parent class method.");
    }
}

class Child extends Parent {
    int number = 200;

    void show() {
        System.out.println("Child number: " + number);
        System.out.println("Parent number: " + super.number);
        super.display();
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.show();
    }
}
