package jdbcassignment;

import java.sql.*;

public class EmployeeSalaryManager {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "prabal25";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();

            // Create Table
            st.executeUpdate("CREATE TABLE IF NOT EXISTS employee(id INT, name VARCHAR(50), salary DOUBLE)");

            // Insert
            st.executeUpdate("INSERT INTO employee VALUES(1,'Rahul',40000)");

            // Read
            ResultSet rs = st.executeQuery("SELECT * FROM employee WHERE salary > 30000");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3));
            }

            // Update
            st.executeUpdate("UPDATE employee SET salary = salary + (salary * 0.10) WHERE id = 1");

            // Delete
            st.executeUpdate("DELETE FROM employee WHERE salary < 15000");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}