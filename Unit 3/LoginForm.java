import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class LoginForm extends JFrame implements ActionListener, KeyListener {

    JTextField userId;
    JPasswordField password;
    JButton okBtn, cancelBtn;

    public LoginForm() {

        setTitle("Login Form");
        setSize(350, 200);
        setLayout(new GridLayout(3, 2, 5, 5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Components
        add(new JLabel("User ID:"));
        userId = new JTextField();
        add(userId);

        add(new JLabel("Password:"));
        password = new JPasswordField();
        add(password);

        okBtn = new JButton("OK");
        cancelBtn = new JButton("CANCEL");

        add(okBtn);
        add(cancelBtn);

        // Event handling
        okBtn.addActionListener(this);
        cancelBtn.addActionListener(this);

        userId.addKeyListener(this);
        password.addKeyListener(this);
        okBtn.addKeyListener(this);
        cancelBtn.addKeyListener(this);

        setVisible(true);
    }

    // LOGIN FUNCTION (database check)
    public void login() {

        String uid = userId.getText();
        String pass = new String(password.getPassword());

        try {
            // Database connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/account", "root", "password"
            );

            String query = "SELECT * FROM account WHERE Uid=? AND Password=?";
            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, uid);
            pst.setString(2, pass);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Login Successful!");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Credentials");
            }

            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Database Error: " + e);
        }
    }

    // CLEAR FUNCTION
    public void clear() {
        userId.setText("");
        password.setText("");
        userId.requestFocus();
    }

    // Button actions
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == okBtn) {
            login();
        }

        if (e.getSource() == cancelBtn) {
            clear();
        }
    }

    // KEY EVENTS
    public void keyPressed(KeyEvent e) {

        char ch = e.getKeyChar();

        if (ch == 'l' || ch == 'L') {
            login();
        }

        if (ch == 'c' || ch == 'C') {
            clear();
        }
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new LoginForm();
    }
}