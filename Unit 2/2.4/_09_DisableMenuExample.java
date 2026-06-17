import javax.swing.*;

/**
 * 9. Enabling and Disabling Menu Items
 * This file demonstrates how to enable or disable menu items
 * based on application state using the setEnabled() method.
 */
public class _09_DisableMenuExample {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        JMenuBar mb = new JMenuBar();

        JMenu file = new JMenu("File");

        JMenuItem save = new JMenuItem("Save");

        save.setEnabled(false);

        file.add(save);

        mb.add(file);

        f.setJMenuBar(mb);

        f.setSize(300,300);
        f.setVisible(true);
    }
}