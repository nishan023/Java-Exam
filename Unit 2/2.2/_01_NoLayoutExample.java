/**
 * 1. No Layout (Null Layout)
 * In No Layout, programmer manually sets the position and size of components.
 */
import javax.swing.*;

public class _01_NoLayoutExample {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        JButton b = new JButton("Submit");

        b.setBounds(100,100,100,40);

        f.add(b);

        f.setSize(300,300);

        f.setLayout(null);

        f.setVisible(true);
    }
}