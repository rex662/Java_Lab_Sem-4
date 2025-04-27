
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class exp11{
    public static void main(String[] args) {
        // MySQL Database credentials
        String url = "jdbc:mysql://localhost:3306/testdb"; 
        String username = "root"; 
        String password = "Varnit17"; 
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("✅ Connected to the database successfully!");

            // Create a statement
            Statement statement = connection.createStatement();

            // Execute a query to fetch data
            String query = "SELECT * FROM users";
            ResultSet resultSet = statement.executeQuery(query);

            // Process the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                System.out.println(id + " | " + name + " | " + email);
            }

            // Close resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
