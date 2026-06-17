
import javax.swing.*;

/**
 * 8. Accelerators
 * This file demonstrates Accelerators for menu items.
 * An Accelerator is a keyboard shortcut that directly performs an action (e.g., Ctrl+S).
 */
public class _08_AcceleratorExample {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");

        JMenuItem save = new JMenuItem("Save");
        save.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));

        file.add(save);
        mb.add(file);
        f.setJMenuBar(mb);
        f.setSize(300, 300);
        f.setVisible(true);
    }
}
