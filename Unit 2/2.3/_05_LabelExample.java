/**
 * 5. Labels
 * Label is used to display text or image.
 */
import javax.swing.*;

public class _05_LabelExample {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        JLabel l = new JLabel("Welcome to Java");

        l.setBounds(100,100,150,30);

        f.add(l);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}