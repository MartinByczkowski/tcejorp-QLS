package src.app;

import src.DAO.UserDAO;

public class UserManagementApp {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();

        // Create a user
        userDAO.createUser("John Doe", "john.doe@example.com");

        // Retrieve and display all users
        userDAO.readUsers();
    }
}