/**
 * 3. File Chooser (JFileChooser)
 * Used to select files or directories from the system.
 */
import javax.swing.*;

public class _03_FileChooserExample {
    public static void main(String[] args) {
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
    }
}