import javax.swing.*;
import java.awt.event.*;

class KeyEventDemo extends JFrame implements KeyListener
{
    JTextField t;

    KeyEventDemo()
    {
        t = new JTextField(20);

        add(t);

        t.addKeyListener(this);

        setSize(300,200);
        setLayout(new java.awt.FlowLayout());
        setVisible(true);
    }

    public void keyPressed(KeyEvent e)
    {
        System.out.println("Key Pressed");
    }

    public void keyReleased(KeyEvent e)
    {
    }

    public void keyTyped(KeyEvent e)
    {
    }

    public static void main(String[] args)
    {
        new KeyEventDemo();
    }
}