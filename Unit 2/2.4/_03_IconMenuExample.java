import javax.swing.*;

/**
 * 3. Icons in Menu Items
 * This file demonstrates how to add Graphical Icons to Menu Items.
 * It uses ImageIcon along with JMenuItem to improve GUI appearance.
 */
public class _03_IconMenuExample {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        JMenuBar mb = new JMenuBar();

        JMenu file = new JMenu("File");

        ImageIcon icon = new ImageIcon("save.png");

        JMenuItem save = new JMenuItem("Save", icon);

        file.add(save);

        mb.add(file);

        f.setJMenuBar(mb);

        f.setSize(300,300);
        f.setVisible(true);
    }
}