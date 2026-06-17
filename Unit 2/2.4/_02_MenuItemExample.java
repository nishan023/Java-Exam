import javax.swing.*;

/**
 * 2. Menu Item
 * This file demonstrates adding multiple MenuItems to a Menu.
 * MenuItem represents selectable options like Open, Save, and Exit.
 */
public class _02_MenuItemExample {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");
        file.add(open);
        file.add(save);
        file.add(exit);
        mb.add(file);
        f.setJMenuBar(mb);
        f.setSize(400,300);
        f.setVisible(true);
    }
}