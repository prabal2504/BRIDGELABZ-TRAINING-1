package jdbcassignment;

import java.sql.*;

public class RestaurantMenuManager {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "prabal25";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();

            // Create Table
            st.executeUpdate("CREATE TABLE IF NOT EXISTS menu(id INT, itemName VARCHAR(50), price DOUBLE)");

            // Insert
            st.executeUpdate("INSERT INTO menu VALUES(1,'Burger',150)");
            st.executeUpdate("INSERT INTO menu VALUES(2,'Pizza',250)");

            // Read
            ResultSet rs = st.executeQuery("SELECT * FROM menu WHERE price < 200");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3));
            }

            // Update
            st.executeUpdate("UPDATE menu SET price=180 WHERE id=2");

            // Delete
            st.executeUpdate("DELETE FROM menu WHERE id=2");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}