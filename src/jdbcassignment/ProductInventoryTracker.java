package jdbcassignment;

import java.sql.*;

public class ProductInventoryTracker {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "prabal25";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();

            st.executeUpdate("CREATE TABLE IF NOT EXISTS product(pid INT, pname VARCHAR(50), qty INT)");

            st.executeUpdate("INSERT INTO product VALUES(1,'Mouse',5)");
            st.executeUpdate("INSERT INTO product VALUES(2,'Keyboard',20)");
            st.executeUpdate("INSERT INTO product VALUES(3,'Monitor',8)");

            ResultSet rs = st.executeQuery("SELECT * FROM product WHERE qty < 10");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
            }

            st.executeUpdate("UPDATE product SET qty = qty + 10 WHERE pid = 1");

            st.executeUpdate("DELETE FROM product WHERE pid = 3");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}