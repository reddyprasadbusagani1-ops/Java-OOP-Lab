// Aim: To write a Java program to demonstrate multilevel inheritance.

class Grandparent {
    void showGrandparent() {
        System.out.println("This is the grandparent class.");
    }
}

class Parent extends Grandparent {
    void showParent() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    void showChild() {
        System.out.println("This is the child class.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.showGrandparent();
        child.showParent();
        child.showChild();
    }
}
