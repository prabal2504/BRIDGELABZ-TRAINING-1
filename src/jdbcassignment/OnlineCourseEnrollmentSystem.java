package jdbcassignment;

import java.sql.*;

public class OnlineCourseEnrollmentSystem {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "prabal25";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();

            // Create Table
            st.executeUpdate("CREATE TABLE IF NOT EXISTS enrollments(id INT, student VARCHAR(50), course VARCHAR(50))");

            // Insert
            st.executeUpdate("INSERT INTO enrollments VALUES(1,'Priya','Java')");

            // Read
            ResultSet rs = st.executeQuery("SELECT * FROM enrollments WHERE course='Java'");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }

            // Update
            st.executeUpdate("UPDATE enrollments SET course='Python' WHERE id=1");

            // Delete
            st.executeUpdate("DELETE FROM enrollments WHERE id=1");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}