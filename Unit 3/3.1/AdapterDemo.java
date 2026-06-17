import java.awt.event.*;
import javax.swing.*;

class AdapterDemo extends JFrame
{
    AdapterDemo()
    {
        addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                System.out.println("Mouse Clicked");
            }
        });

        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new AdapterDemo();
    }
}