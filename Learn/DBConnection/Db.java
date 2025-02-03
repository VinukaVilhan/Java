import java.sql.*;

public class Db {
    public static void main(String[] args) {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");  // Use the correct driver
            System.out.println("JDBC Driver loaded successfully!");

            // Establish connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "root", "Vinuka@cr7");

            // Query execution
            String query = "SELECT * FROM User";
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs  = stmt.executeQuery();

            // Fetch and print results
            while (rs.next()) {
                System.out.println(rs.getInt("ID") + " " + rs.getString("Name") + " " + rs.getString("Email"));
            }

            // Close connection
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
