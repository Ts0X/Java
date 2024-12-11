import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnection {
    static String url = "jdbc:mysql://localhost:3306/your_db"; //replace your_db with your real.
    static String user = "root"; // replace your name 
    static String password = ""; // replace your pass

    public Connection connect() {
        try {
            
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection succed!");
            return conn;
        } catch (SQLException e) {
            System.out.println("Erron in connection: " + e.getMessage());
            return null;
        }
    }
}
