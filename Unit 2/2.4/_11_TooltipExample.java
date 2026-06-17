

import javax.swing.*;

/**
 * 11. Tooltips
 * This file demonstrates Tooltips in Swing.
 * A Tooltip displays a small text message when the mouse hovers over a component.
 */
public class _11_TooltipExample {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        JButton b = new JButton("Save");

        b.setToolTipText("Click to save file");

        f.add(b);

        f.setSize(300,300);

        f.setLayout(null);

        b.setBounds(100,100,100,40);

        f.setVisible(true);
    }
}