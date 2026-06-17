/**
 * 4. Scroll Pane
 * ScrollPane adds horizontal and vertical scroll bars to components.
 */
import javax.swing.*;

public class _04_ScrollPaneExample {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        JTextArea ta = new JTextArea(20,20);

        JScrollPane sp = new JScrollPane(ta);

        f.add(sp);

        f.setSize(300,300);
        f.setVisible(true);
    }
}