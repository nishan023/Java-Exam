import javax.swing.*;
import java.awt.event.*;

class MouseEventDemo extends JFrame implements MouseListener
{
    MouseEventDemo()
    {
        addMouseListener(this);

        setSize(300,300);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e)
    {
        System.out.println("Mouse Clicked");
    }

    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}

    public static void main(String[] args)
    {
        new MouseEventDemo();
    }
}