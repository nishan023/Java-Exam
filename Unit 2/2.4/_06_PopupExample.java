
import javax.swing.*;
import java.awt.event.*;

/**
 * 6. Pop-up Menu
 * This file demonstrates Pop-up Menus using JPopupMenu.
 * The menu appears when the user right-clicks on the component.
 */
public class _06_PopupExample {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        JPopupMenu pm = new JPopupMenu();

        JMenuItem cut = new JMenuItem("Cut");

        pm.add(cut);

        f.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                if (e.getButton() == MouseEvent.BUTTON3) {

                    pm.show(f, e.getX(), e.getY());
                }
            }
        });

        f.setSize(300, 300);
        f.setVisible(true);
    }
}
