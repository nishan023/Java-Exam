import java.awt.event.*;
import javax.swing.*;

class EventDemo extends JFrame implements ActionListener
{
    JButton b;

    EventDemo()
    {
        b = new JButton("Click Me");

        b.setBounds(100,100,120,40);

        add(b);

        b.addActionListener(this);

        setSize(400,300);
        setLayout(null);
        setVisible(true);
    }
        @Override
    public void actionPerformed(ActionEvent e)
    {
        JOptionPane.showMessageDialog(this,"Button Clicked");
    }

    public static void main(String[] args)
    {
        new EventDemo();
    }
}