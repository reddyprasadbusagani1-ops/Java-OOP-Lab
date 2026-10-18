// Exercise 3(c): Demonstrate a constructor

class Book {
    String title;
    String author;

    Book() {
        title = "Java Programming";
        author = "James";
    }

    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Book book = new Book();
        book.display();
    }
}

/*
Sample Output:
Book Title: Java Programming
Author: James
*/
