/**
 * 8. Borders
 * Borders are used to create boundary around components.
 */
import javax.swing.*;

public class _08_BorderExample {

    public static void main(String[] args) {

        JFrame f = new JFrame();    

        JTextField t = new JTextField();

        t.setBounds(100,100,150,30);

        t.setBorder(BorderFactory.createLineBorder(java.awt.Color.RED,2));

        f.add(t);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}