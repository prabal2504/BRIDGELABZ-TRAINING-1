package jdbcassignment;

import java.sql.*;

public class BookstoreSalesTracking {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "prabal25";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();

            // Create Table
            st.executeUpdate("CREATE TABLE IF NOT EXISTS sales(id INT, bookName VARCHAR(100), quantity INT, price DOUBLE)");

            // Insert
            st.executeUpdate("INSERT INTO sales VALUES(1,'Java Programming',2,500)");
            st.executeUpdate("INSERT INTO sales VALUES(2,'Python Basics',1,450)");

            // Read
            ResultSet rs = st.executeQuery("SELECT * FROM sales WHERE quantity > 1");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getDouble(4));
            }

            // Update
            st.executeUpdate("UPDATE sales SET quantity = 3 WHERE id=2");

            // Delete
            st.executeUpdate("DELETE FROM sales WHERE id=2");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}