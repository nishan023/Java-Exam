/**
 * 1. Text Field
 * A Text Field is used to accept a single line of text from the user.
 */
import javax.swing.*;

public class _01_TextFieldExample {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        JTextField t = new JTextField();

        t.setBounds(100,100,150,30);

        f.add(t);

        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}