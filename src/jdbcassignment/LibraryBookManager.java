package jdbcassignment;

import java.sql.*;

public class LibraryBookManager {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "prabal25";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();

            st.executeUpdate("CREATE TABLE IF NOT EXISTS books(id INT, title VARCHAR(100), author VARCHAR(50), status VARCHAR(10))");

            st.executeUpdate("INSERT INTO books VALUES(1,'Java Basics','James','Available')");

            ResultSet rs = st.executeQuery("SELECT * FROM books WHERE status='Available'");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }

            st.executeUpdate("UPDATE books SET status='Issued' WHERE id=1");

            st.executeUpdate("DELETE FROM books WHERE id=1");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}