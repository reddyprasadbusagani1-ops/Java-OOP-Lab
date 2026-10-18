/*
Aim: Write a Java program that connects to a database using JDBC.

Note:
1. This example uses MySQL.
2. Add the MySQL Connector/J JAR to your classpath.
3. Update the database URL, username, and password for your MySQL setup.
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java_lab";
        String username = "root";
        String password = "your_password";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection connection =
                     DriverManager.getConnection(url, username, password)) {
                System.out.println("Database connected successfully.");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found. Add Connector/J to the classpath.");
        } catch (SQLException e) {
            System.out.println("Database connection failed: " + e.getMessage());
        }
    }
}
