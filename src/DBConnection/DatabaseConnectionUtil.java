package src.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionUtil {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/sample_db"; // Update DB URL
    private static final String DB_USER = "root"; // Update username
    private static final String DB_PASSWORD = "password"; // Update password

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
}