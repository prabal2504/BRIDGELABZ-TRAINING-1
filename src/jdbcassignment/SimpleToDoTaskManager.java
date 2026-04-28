package jdbcassignment;

import java.sql.*;

public class SimpleToDoTaskManager {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "prabal25";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();

            // Create Table
            st.executeUpdate("CREATE TABLE IF NOT EXISTS tasks(id INT, title VARCHAR(100), status VARCHAR(20))");

            // Insert
            st.executeUpdate("INSERT INTO tasks VALUES(1,'Complete JDBC Assignment','Pending')");

            // Read
            ResultSet rs = st.executeQuery("SELECT * FROM tasks WHERE status='Pending'");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }

            // Update
            st.executeUpdate("UPDATE tasks SET status='Completed' WHERE id=1");

            // Delete
            st.executeUpdate("DELETE FROM tasks WHERE status='Completed'");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}