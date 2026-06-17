/**
 * 5. Internal Frames (JInternalFrame)
 * A frame inside another frame (used in MDI – Multiple Document Interface applications).
 */
import javax.swing.*;

public class _05_InternalFrameExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JDesktopPane desktop = new JDesktopPane();

        JInternalFrame internal = new JInternalFrame("Child Frame", true, true, true, true);
        internal.setSize(200, 150);
        internal.setVisible(true);

        desktop.add(internal);
        frame.add(desktop);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}