/**
 * 2. Creating Dialogs (JDialog)
 * A dialog is a small window used to take input or show information. It can be modal (blocks other windows) or non-modal.
 */
import javax.swing.*;

public class _02_DialogExample extends JDialog {
    _02_DialogExample() {
        setTitle("Custom Dialog");
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new _02_DialogExample();
    }
}