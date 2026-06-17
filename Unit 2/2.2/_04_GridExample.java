/**
 * 4. Grid Layout
 * GridLayout arranges components in a rectangular grid of rows and columns.
 */
import javax.swing.*;
import java.awt.*;

public class _04_GridExample {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        f.setLayout(new GridLayout(2,2));

        f.add(new JButton("1"));
        f.add(new JButton("2"));
        f.add(new JButton("3"));
        f.add(new JButton("4"));

        f.setSize(300,300);

        f.setVisible(true);
    }
}