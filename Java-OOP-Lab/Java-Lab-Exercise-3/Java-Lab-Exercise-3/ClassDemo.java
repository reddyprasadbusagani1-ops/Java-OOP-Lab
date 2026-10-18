// Exercise 3(a): Demonstrate class, methods, and calling methods from main()

class Student {
    String name;
    int rollNumber;

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }

    void study() {
        System.out.println(name + " is studying Java.");
    }
}

public class ClassDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Ravi";
        student.rollNumber = 101;

        student.displayDetails();
        student.study();
    }
}

/*
Sample Output:
Student Name: Ravi
Roll Number: 101
Ravi is studying Java.
*/
