package jdbcassignment;

import java.sql.*;

public class HospitalPatientRecordSystem {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "prabal25";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();

            // Create Table
            st.executeUpdate("CREATE TABLE IF NOT EXISTS patients(id INT, name VARCHAR(50), disease VARCHAR(50))");

            // Insert
            st.executeUpdate("INSERT INTO patients VALUES(1,'Ramesh','Fever')");

            // Read
            ResultSet rs = st.executeQuery("SELECT * FROM patients WHERE disease='Fever'");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }

            // Update
            st.executeUpdate("UPDATE patients SET disease='Typhoid' WHERE id = 1");

            // Delete
            st.executeUpdate("DELETE FROM patients WHERE id = 1");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}