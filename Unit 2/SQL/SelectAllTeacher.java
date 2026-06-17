import java.sql.*;

public class SelectAllTeacher {
    public static void main(String[] args) {
        try {
            // Step 1: Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Create connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/yourDB", "root", "password");

            // Step 3: Create statement
            Statement st = con.createStatement();

            // Step 4: Execute query
            ResultSet rs = st.executeQuery("SELECT * FROM TEACHER");

            // Step 5: Process result
            while (rs.next()) {
                System.out.println(rs.getInt("ID") + " " + rs.getString("Name"));
            }

            // Step 6: Close connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}