import java.sql.*;

public class InsertTeacher {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/yourDB", "root", "password");

            Statement st = con.createStatement();

            String sql = "INSERT INTO TEACHER VALUES (8, 'Ramesh')";

            int rows = st.executeUpdate(sql);

            if (rows > 0) {
                System.out.println("Data inserted successfully!");
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}