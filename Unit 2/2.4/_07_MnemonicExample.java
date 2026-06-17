import javax.swing.*;

/**
 * 7. Keyboard Mnemonics
 * This file demonstrates Keyboard Mnemonics for menus.
 * A Mnemonic is a keyboard shortcut activated using the Alt key (e.g., Alt+F).
 */
public class _07_MnemonicExample {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        file.setMnemonic('F'); // Alt + F opens File menu
        
        JMenuItem open = new JMenuItem("Open");
        file.add(open);
        
        mb.add(file);
        f.setJMenuBar(mb);
        f.setSize(300,300);
        f.setVisible(true);
    }
}