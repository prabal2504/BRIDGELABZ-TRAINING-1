package jdbcassignment;

import java.sql.*;

public class BankingAccountManager {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "prabal25";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();

            st.executeUpdate("CREATE TABLE IF NOT EXISTS accounts(accNo INT, name VARCHAR(50), balance DOUBLE)");

            st.executeUpdate("INSERT INTO accounts VALUES(101,'Rohit',15000)");

            ResultSet rs = st.executeQuery("SELECT * FROM accounts WHERE balance > 10000");
            while (rs.next()) {
                System.out.println(rs.getString(2));
            }

            st.executeUpdate("UPDATE accounts SET balance = balance + 5000 WHERE accNo = 101");

            st.executeUpdate("DELETE FROM accounts WHERE accNo = 101");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}