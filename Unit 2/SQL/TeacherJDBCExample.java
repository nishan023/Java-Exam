import java.sql.*;

public class TeacherJDBCExample {
    public static void main(String[] args) {

        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/yourDB",
                "root",
                "password"
            );

            // =========================================
            // (a) SELECT * FROM TEACHER
            // =========================================
            System.out.println("---- All Teachers ----");

            Statement st1 = con.createStatement();
            ResultSet rs1 = st1.executeQuery("SELECT * FROM TEACHER");

            while (rs1.next()) {
                System.out.println(rs1.getInt("ID") + " " +
                                   rs1.getString("Name"));
            }

            // =========================================
            // (b) INSERT INTO TEACHER VALUES (8,'Ramesh')
            // =========================================
            System.out.println("\n---- Insert Operation ----");

            Statement st2 = con.createStatement();

            String insertSQL = "INSERT INTO TEACHER VALUES (8, 'Ramesh')";

            int rows = st2.executeUpdate(insertSQL);

            if (rows > 0) {
                System.out.println("Data Inserted Successfully!");
            }

            // =========================================
            // (c) SELECT NAME WHERE ID = 9
            // =========================================
            System.out.println("\n---- Teacher Name by ID ----");

            String sql = "SELECT Name FROM TEACHER WHERE ID = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 9);

            ResultSet rs2 = ps.executeQuery();

            while (rs2.next()) {
                System.out.println("Name = " + rs2.getString("Name"));
            }

            // 3. Close Connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}