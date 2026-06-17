/**
 * 2. Flow Layout
 * FlowLayout arranges components from left to right like words in a paragraph.
 */
import javax.swing.*;
import java.awt.*;

public class _02_FlowExample {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        f.setLayout(new FlowLayout());

        f.add(new JButton("One"));
        f.add(new JButton("Two"));
        f.add(new JButton("Three"));

        f.setSize(300,300);
        f.setVisible(true);
    }
}