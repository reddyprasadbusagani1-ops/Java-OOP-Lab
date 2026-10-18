/*
Aim: Demonstrate delete() and deleteCharAt() methods of StringBuffer.
File name: StringBufferDemo.java
*/

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer text = new StringBuffer("Hello Java");

        System.out.println("Original string: " + text);

        // delete(start, end) removes characters from start to end - 1.
        text.delete(5, 10);
        System.out.println("After delete(5, 10): " + text);

        text = new StringBuffer("Hello Java");

        // deleteCharAt(index) removes one character at the given index.
        text.deleteCharAt(1);
        System.out.println("After deleteCharAt(1): " + text);
    }
}

/*
Sample output:
Original string: Hello Java
After delete(5, 10): Hello
After deleteCharAt(1): Hllo Java
*/
