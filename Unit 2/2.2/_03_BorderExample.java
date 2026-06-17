/**
 * 3. Border Layout
 * BorderLayout divides container into five regions: NORTH, SOUTH, EAST, WEST, CENTER.
 */
import javax.swing.*;
import java.awt.*;

public class _03_BorderExample {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        f.setLayout(new BorderLayout());

        f.add(new JButton("North"), BorderLayout.NORTH);

        f.add(new JButton("South"), BorderLayout.SOUTH);

        f.add(new JButton("East"), BorderLayout.EAST);

        f.add(new JButton("West"), BorderLayout.WEST);

        f.add(new JButton("Center"), BorderLayout.CENTER);

        f.setSize(400,400);

        f.setVisible(true);
    }
}