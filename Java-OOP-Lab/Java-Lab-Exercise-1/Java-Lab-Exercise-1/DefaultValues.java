/*
Aim: Write a Java program to display the default values of all primitive data types.
File name: DefaultValues.java
*/

public class DefaultValues {
    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;
    float floatValue;
    double doubleValue;
    char charValue;
    boolean booleanValue;

    void displayDefaults() {
        System.out.println("Default value of byte    : " + byteValue);
        System.out.println("Default value of short   : " + shortValue);
        System.out.println("Default value of int      : " + intValue);
        System.out.println("Default value of long     : " + longValue);
        System.out.println("Default value of float    : " + floatValue);
        System.out.println("Default value of double   : " + doubleValue);
        System.out.println("Default value of char     : [" + charValue + "]");
        System.out.println("Default value of boolean  : " + booleanValue);
    }

    public static void main(String[] args) {
        DefaultValues obj = new DefaultValues();
        obj.displayDefaults();
    }
}

/*
Sample output:
Default value of byte    : 0
Default value of short   : 0
Default value of int      : 0
Default value of long     : 0
Default value of float    : 0.0
Default value of double   : 0.0
Default value of char     : []
Default value of boolean  : false

Note: char's default value is the null character, so nothing visible appears between [].
*/
