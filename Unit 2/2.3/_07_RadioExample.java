/**
 * 7. Radio Buttons
 * Radio Buttons allow only one option selection from a group.
 */
import javax.swing.*;

public class _07_RadioExample {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        JRadioButton r1 = new JRadioButton("Male");

        JRadioButton r2 = new JRadioButton("Female");

        r1.setBounds(100,100,100,30);
        r2.setBounds(100,140,100,30);

        ButtonGroup bg = new ButtonGroup();

        bg.add(r1);
        bg.add(r2);

        f.add(r1);
        f.add(r2);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}