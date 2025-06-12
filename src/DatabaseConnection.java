
import java.sql.Connection;      // Import the Connection interface from the java.sql package
import java.sql.DriverManager;   // Import the DriverManager class to manage JDBC connections
import java.sql.SQLException;    // Import SQLException for handling database errors

/**
 * DatabaseConnection class
 * This class contains a static method to get a connection to the MySQL database.
 * 
 * Author: jonar
 */
public class DatabaseConnection {

    /**
     * Establishes and returns a connection to the MySQL database.
     * 
     * @return Connection object if the connection is successful; otherwise, null.
     */
    public static Connection getConnection() {
        Connection conn = null; // Initialize the connection object

        try {
            // Database URL with host, port, and database name 
            String url = "jdbc:mysql://localhost:3306/lockermanagement";

            // Database credentials 
            String user = "root";      //  MySQL username
            String password = "";      //  MySQL password (empty if none)

            // Attempt to establish a connection to the database
            conn = DriverManager.getConnection(url, user, password);

            // If successful, print confirmation to the console
            System.out.println("Database connected successfully!");
        } catch (SQLException ex) {
            // If there's an error, catch it and print the error message
            System.out.println("Error connecting to database: " + ex.getMessage());
        }

        // Return the connection object (could be null if connection failed)
        return conn;
    }
}
