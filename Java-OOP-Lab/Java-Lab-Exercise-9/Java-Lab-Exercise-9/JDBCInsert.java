/*
Aim: Write a Java program to connect to a database using JDBC and insert values into it.

Prerequisites:
1. Create a MySQL database named java_lab.
2. Run this SQL once:
   CREATE TABLE students (
       id INT PRIMARY KEY,
       name VARCHAR(100),
       department VARCHAR(100)
   );
3. Add the MySQL Connector/J JAR to your classpath.
4. Update the username and password below.
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCInsert {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java_lab";
        String username = "root";
        String password = "your_password";

        String sql = "INSERT INTO students (id, name, department) VALUES (?, ?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection connection =
                     DriverManager.getConnection(url, username, password);
                 PreparedStatement statement = connection.prepareStatement(sql)) {

                statement.setInt(1, 101);
                statement.setString(2, "Ravi");
                statement.setString(3, "CSE");

                int rowsInserted = statement.executeUpdate();
                System.out.println(rowsInserted + " record(s) inserted.");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found. Add Connector/J to the classpath.");
        } catch (SQLException e) {
            System.out.println("Insert failed: " + e.getMessage());
        }
    }
}
