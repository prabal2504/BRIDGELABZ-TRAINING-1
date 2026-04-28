package jdbcassignment;

import java.sql.*;

public class VehicleServiceCenter {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "prabal25";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();

            // Create Table
            st.executeUpdate("CREATE TABLE IF NOT EXISTS vehicles(regNo VARCHAR(20), owner VARCHAR(50), status VARCHAR(20))");

            // Insert
            st.executeUpdate("INSERT INTO vehicles VALUES('DL01AB1234','Aman','Pending')");

            // Read
            ResultSet rs = st.executeQuery("SELECT * FROM vehicles WHERE status='Pending'");
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }

            // Update
            st.executeUpdate("UPDATE vehicles SET status='Completed' WHERE regNo='DL01AB1234'");

            // Delete
            st.executeUpdate("DELETE FROM vehicles WHERE regNo='DL01AB1234'");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}