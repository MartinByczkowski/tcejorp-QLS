package src.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnectionTest {
    public static void main(String[] args) {
        String query = "SELECT * FROM checkpoint_table WHERE member_name = ?";
        String checkpointName = "checkpointmember";

        try (Connection connection = DatabaseConnectionUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            // Test connection
            System.out.println("Connection successful");

            // Check for the checkpoint member
            statement.setString(1, checkpointName);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                System.out.println("Checkpoint member found: " + resultSet.getString("member_name"));
            } else {
                System.out.println("Checkpoint member not found.");
            }
        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
        }
    }
}
