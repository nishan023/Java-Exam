import javax.swing.*;
import java.awt.event.*;

class ItemEventDemo extends JFrame implements ItemListener
{
    JCheckBox c;

    ItemEventDemo()
    {
        c = new JCheckBox("Java");

        add(c);

        c.addItemListener(this);

        setSize(300,200);
        setLayout(new java.awt.FlowLayout());
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e)
    {
        System.out.println("Checkbox Selected");
    }

    public static void main(String[] args)
    {
        new ItemEventDemo();
    }
}