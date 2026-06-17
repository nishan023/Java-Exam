import java.sql.*;

public class TeacherJDBC {

    public static void main(String[] args) {

        try {
            // Step 1: Load Driver (optional in newer JDBC)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Connect to database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "password"
            );

            Statement stmt = con.createStatement();

            // a) SELECT * FROM TEACHER
            System.out.println("All Teachers:");
            ResultSet rs1 = stmt.executeQuery("SELECT * FROM TEACHER");

            while (rs1.next()) {
                System.out.println(rs1.getInt("ID") + " " + rs1.getString("Name"));
            }

            // b) INSERT INTO TEACHER VALUES (8, 'Ramesh');
            int insert = stmt.executeUpdate(
                "INSERT INTO TEACHER VALUES (8, 'Ramesh')"
            );
            System.out.println("\nRows inserted: " + insert);

            // c) SELECT NAME FROM TEACHER WHERE ID = 9
            System.out.println("\nTeacher with ID 9:");
            ResultSet rs2 = stmt.executeQuery(
                "SELECT Name FROM TEACHER WHERE ID = 9"
            );

            if (rs2.next()) {
                System.out.println(rs2.getString("Name"));
            } else {
                System.out.println("No record found");
            }

            // Close connection
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}