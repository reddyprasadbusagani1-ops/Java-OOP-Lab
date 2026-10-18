// Aim: To write a Java program to implement an interface and demonstrate
// multiple inheritance of type through interfaces.

interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Demo implements Printable, Showable {
    public void print() {
        System.out.println("Printing from Printable interface.");
    }

    public void show() {
        System.out.println("Showing from Showable interface.");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.print();
        demo.show();
    }
}
