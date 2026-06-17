/**
 * 6. Check Box
 * CheckBox is used to select multiple options.
 */
import javax.swing.*;

public class _06_CheckBoxExample {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        JCheckBox c1 = new JCheckBox("Java");

        JCheckBox c2 = new JCheckBox("Python");

        c1.setBounds(100,100,100,30);
        c2.setBounds(100,140,100,30);

        f.add(c1);
        f.add(c2);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}