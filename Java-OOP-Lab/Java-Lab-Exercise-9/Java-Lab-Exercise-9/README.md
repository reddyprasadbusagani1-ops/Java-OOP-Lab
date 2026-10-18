# Java Lab — Exercise 9: JDBC

## Programs
- `JDBCConnection.java` — Connects to a MySQL database using JDBC.
- `JDBCInsert.java` — Inserts a record into the `students` table.
- `JDBCDelete.java` — Deletes a record from the `students` table.

## Requirements
- JDK installed
- MySQL Server running
- MySQL Connector/J JAR downloaded and available on your computer

## Database setup
Run the following SQL in MySQL:

```sql
CREATE DATABASE java_lab;
USE java_lab;

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    department VARCHAR(100)
);
```

Update `username`, `password`, and the URL in each Java file to match your local MySQL configuration. Replace `your_password` with your actual MySQL password.

## Compile and run on Windows Command Prompt

Assume the Connector/J file is named `mysql-connector-j-<version>.jar` and is in the same folder as the Java files. Replace the placeholder with the actual JAR filename.

```cmd
javac -cp ".;mysql-connector-j-<version>.jar" JDBCConnection.java
java -cp ".;mysql-connector-j-<version>.jar" JDBCConnection

javac -cp ".;mysql-connector-j-<version>.jar" JDBCInsert.java
java -cp ".;mysql-connector-j-<version>.jar" JDBCInsert

javac -cp ".;mysql-connector-j-<version>.jar" JDBCDelete.java
java -cp ".;mysql-connector-j-<version>.jar" JDBCDelete
```

Run the insert program before the delete program if you want to test deleting the sample record with ID `101`.

## Important
- These examples use MySQL. They will not connect until MySQL is installed/running, the database/table exists, credentials are correct, and Connector/J is on the classpath.
- `PreparedStatement` is used for insert/delete statements.
