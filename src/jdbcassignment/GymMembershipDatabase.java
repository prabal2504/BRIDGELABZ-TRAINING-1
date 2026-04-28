package jdbcassignment;

import java.sql.*;

public class GymMembershipDatabase {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "prabal25";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();

            // Create Table
            st.executeUpdate("CREATE TABLE IF NOT EXISTS members(id INT, name VARCHAR(50), type VARCHAR(20), months INT)");

            // Insert
            st.executeUpdate("INSERT INTO members VALUES(1,'Ravi','Premium',6)");

            // Read
            ResultSet rs = st.executeQuery("SELECT * FROM members WHERE type='Premium'");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
            }

            // Update
            st.executeUpdate("UPDATE members SET months = months + 3 WHERE id=1");

            // Delete
            st.executeUpdate("DELETE FROM members WHERE id=1");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}