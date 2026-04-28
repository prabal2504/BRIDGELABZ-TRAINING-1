package jdbcassignment;

import java.sql.*;

public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "prabal25";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();

            // Create Table
            st.executeUpdate("CREATE TABLE IF NOT EXISTS movies(id INT, name VARCHAR(50), seats INT)");

            // Insert
            st.executeUpdate("INSERT INTO movies VALUES(1,'Avengers',50)");
            st.executeUpdate("INSERT INTO movies VALUES(2,'Batman',0)");

            // Read
            ResultSet rs = st.executeQuery("SELECT * FROM movies WHERE seats > 0");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
            }

            // Update
            st.executeUpdate("UPDATE movies SET seats = seats - 1 WHERE id = 1");

            // Delete
            st.executeUpdate("DELETE FROM movies WHERE id = 2");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}