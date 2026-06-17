
import javax.swing.*;
import java.awt.event.*;

class ActionEventDemo extends JFrame implements ActionListener {

    JButton b;

    ActionEventDemo() {
        b = new JButton("Click");

        add(b);
        //Adding action listener to the button(action event)
        b.addActionListener(this);

        setSize(300, 200);
        setLayout(new java.awt.FlowLayout());
        setVisible(true);
    }

    ///Method used to handle action event

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Clicked");
    }

    public static void main(String[] args) {
        new ActionEventDemo();
    }
}
