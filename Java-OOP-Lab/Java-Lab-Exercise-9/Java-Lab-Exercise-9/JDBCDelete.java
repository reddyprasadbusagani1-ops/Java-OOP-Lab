/*
Aim: Write a Java program to connect to a database using JDBC and delete values from it.

Prerequisites:
1. Create a MySQL database named java_lab.
2. Create the students table used in JDBCInsert.java.
3. Add a record first, for example:
   INSERT INTO students (id, name, department) VALUES (101, 'Ravi', 'CSE');
4. Add the MySQL Connector/J JAR to your classpath.
5. Update the username and password below.
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCDelete {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java_lab";
        String username = "root";
        String password = "your_password";

        String sql = "DELETE FROM students WHERE id = ?";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection connection =
                     DriverManager.getConnection(url, username, password);
                 PreparedStatement statement = connection.prepareStatement(sql)) {

                statement.setInt(1, 101);

                int rowsDeleted = statement.executeUpdate();
                System.out.println(rowsDeleted + " record(s) deleted.");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found. Add Connector/J to the classpath.");
        } catch (SQLException e) {
            System.out.println("Delete failed: " + e.getMessage());
        }
    }
}
