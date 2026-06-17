/**
 * 5. GridBag Layout
 * GridBagLayout is the most flexible and complex layout manager in Java.
 */
import javax.swing.*;
import java.awt.*;

public class _05_GridBagExample {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        GridBagLayout g = new GridBagLayout();

        GridBagConstraints c = new GridBagConstraints();

        f.setLayout(g);

        c.gridx = 0;
        c.gridy = 0;

        f.add(new JButton("Button 1"), c);

        c.gridx = 1;
        c.gridy = 0;

        f.add(new JButton("Button 2"), c);

        f.setSize(300,300);

        f.setVisible(true);
    }
}