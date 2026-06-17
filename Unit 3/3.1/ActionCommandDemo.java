import java.awt.event.*;
import javax.swing.*;

class ActionCommandDemo extends JFrame implements ActionListener
{
    JButton b1,b2;

    ActionCommandDemo()
    {
        b1 = new JButton("Add");
        b2 = new JButton("Delete");

        b1.setActionCommand("ADD");
        b2.setActionCommand("DELETE");

        b1.addActionListener(this);
        b2.addActionListener(this);

        add(b1);
        add(b2);

        setLayout(new java.awt.FlowLayout());
        setSize(300,200);
        setVisible(true);
    }
        @Override
    public void actionPerformed(ActionEvent e)
    {
        String cmd = e.getActionCommand();

        if(cmd.equals("ADD"))
        {
            System.out.println("Add Button Clicked");
        }

        if(cmd.equals("DELETE"))
        {
            System.out.println("Delete Button Clicked");
        }
    }

    public static void main(String[] args)
    {
        new ActionCommandDemo();
    }
}