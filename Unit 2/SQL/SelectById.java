import java.sql.*;

public class SelectById {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/yourDB", "root", "password");

            String sql = "SELECT Name FROM TEACHER WHERE ID = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 9);   // setting ID = 9

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("Name: " + rs.getString("Name"));
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}