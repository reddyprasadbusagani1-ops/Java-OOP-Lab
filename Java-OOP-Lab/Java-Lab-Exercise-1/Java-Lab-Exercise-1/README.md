# Java Lab — Exercise 1

**Course:** (23A05303P) Object-Oriented Programming Through Java Lab

## Programs
1. `DefaultValues.java` — displays default values of Java's eight primitive data types.
2. `QuadraticRoots.java` — calculates the discriminant and roots of a quadratic equation.

## Requirements
- Java Development Kit (JDK)
- Windows Command Prompt (CMD), or another terminal

## How to compile and run

Open CMD in this folder.

### Program 1(a)
```cmd
javac DefaultValues.java
java DefaultValues
```

### Program 1(b)
```cmd
javac QuadraticRoots.java
java QuadraticRoots
```

Save each file using **Save as type: All Files** in Notepad. Ensure the file name ends with `.java`, not `.java.txt`.

## Notes
Java supplies default values to instance fields and static fields. Local variables do not automatically receive default values. The `char` default is the null character, which is not visibly printable.

The quadratic program solves the general equation `ax^2 + bx + c = 0`. For the syllabus form `ax^2 + bx = 0`, enter `c = 0`.
