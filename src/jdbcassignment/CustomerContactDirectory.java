package jdbcassignment;

import java.sql.*;

public class CustomerContactDirectory {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "prabal25";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();

            st.executeUpdate("CREATE TABLE IF NOT EXISTS customers(id INT, name VARCHAR(50), phone VARCHAR(15))");

            st.executeUpdate("INSERT INTO customers VALUES(1,'Amit','9876543210')");

            ResultSet rs = st.executeQuery("SELECT * FROM customers WHERE name LIKE '%Amit%'");
            while (rs.next()) {
                System.out.println(rs.getString(2));
            }

            st.executeUpdate("UPDATE customers SET phone='9999999999' WHERE id=1");

            st.executeUpdate("DELETE FROM customers WHERE id=1");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}