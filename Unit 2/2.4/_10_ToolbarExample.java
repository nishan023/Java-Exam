import javax.swing.*;

/**
 * 10. Toolbars
 * This file demonstrates Toolbars using JToolBar.
 * A Toolbar provides a group of buttons/icons for quick access to commands.
 */
public class _10_ToolbarExample {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        JToolBar tb = new JToolBar();

        JButton b1 = new JButton("New");
        JButton b2 = new JButton("Save");

        tb.add(b1);
        tb.add(b2);

        f.add(tb, java.awt.BorderLayout.NORTH);

        f.setSize(300,300);
        f.setVisible(true);
    }
}