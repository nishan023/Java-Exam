import javax.swing.*;

/**
 * 4. Check Box Menu Item
 * This file demonstrates the use of CheckBox Menu Items (JCheckBoxMenuItem).
 * It allows multiple selections in menus, maintaining a checked/unchecked state.
 */
public class _04_CheckMenuExample {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        JMenuBar mb = new JMenuBar();

        JMenu view = new JMenu("View");

        JCheckBoxMenuItem status =
                new JCheckBoxMenuItem("Status Bar");

        view.add(status);

        mb.add(view);

        f.setJMenuBar(mb);

        f.setSize(300,300);
        f.setVisible(true);
    }
}