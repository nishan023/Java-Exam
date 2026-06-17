import javax.swing.*;
import java.awt.event.*;

class WindowEventDemo extends JFrame implements WindowListener
{
    WindowEventDemo()
    {
        addWindowListener(this);

        setSize(300,200);
        setVisible(true);
    }

    public void windowClosing(WindowEvent e)
    {
        System.out.println("Window Closing");
        System.exit(0);
    }

    public void windowOpened(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}

    public static void main(String[] args)
    {
        new WindowEventDemo();
    }
}