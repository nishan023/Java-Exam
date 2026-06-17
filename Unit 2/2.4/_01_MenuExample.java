import javax.swing.*;

/**
 * 1. Menu in Swing
 * This file demonstrates the basic structure of Menus in Swing.
 * It uses JMenuBar, JMenu, and JMenuItem to create a menu bar
 * with a "File" menu containing "Open" and "Save" options.
 */
public class _01_MenuExample {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        JMenuBar mb = new JMenuBar();

        JMenu file = new JMenu("File");

        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");

        file.add(open);
        file.add(save);

        mb.add(file);

        f.setJMenuBar(mb);

        f.setSize(400,300);
        f.setVisible(true);
    }
}