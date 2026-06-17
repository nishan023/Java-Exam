/**
 * 9. Combo Box
 * ComboBox provides a drop-down list of items.
 */
import javax.swing.*;

public class _09_ComboExample {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        String country[] = {"Nepal","India","China"};

        JComboBox cb = new JComboBox(country);

        cb.setBounds(100,100,100,30);

        f.add(cb);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}