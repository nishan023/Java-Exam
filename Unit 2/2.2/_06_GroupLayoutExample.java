/**
 * 6. Group Layout
 * GroupLayout arranges components using sequential and parallel groups.
 */
import javax.swing.*;
import java.awt.*;

public class _06_GroupLayoutExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        JPanel panel = new JPanel();

        GroupLayout layout = new GroupLayout(panel);

        panel.setLayout(layout);

        JButton b1 = new JButton("OK");
        JButton b2 = new JButton("Cancel");

        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addComponent(b1)
                .addComponent(b2)
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(b1)
                .addComponent(b2)
        );

        frame.add(panel);

        frame.setSize(300,200);

        frame.setVisible(true);
    }
}