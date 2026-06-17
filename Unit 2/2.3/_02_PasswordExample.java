/**
 * 2. Password Field
 * Password Field is used to enter hidden password characters.
 */
import javax.swing.*;

public class _02_PasswordExample {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        JPasswordField p = new JPasswordField();

        p.setBounds(100,100,150,30);

        f.add(p);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}