import javax.swing.*;
import java.awt.event.*;

class FocusEventDemo extends JFrame implements FocusListener
{
    JTextField t;

    FocusEventDemo()
    {
        t = new JTextField(20);

        add(t);

        t.addFocusListener(this);

        setSize(300,200);
        setLayout(new java.awt.FlowLayout());
        setVisible(true);
    }

    public void focusGained(FocusEvent e)
    {
        System.out.println("Focus Gained");
    }

    public void focusLost(FocusEvent e)
    {
        System.out.println("Focus Lost");
    }

    public static void main(String[] args)
    {
        new FocusEventDemo();
    }
}