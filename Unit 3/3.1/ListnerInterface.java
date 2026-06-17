
import java.awt.event.*;
import javax.swing.*;

//action listener for button click event
class ListnerInterface extends JFrame implements ActionListener {

    JButton b;

    ListnerInterface() {
        b = new JButton("Submit");

        add(b);

        b.addActionListener(this);

        setSize(300, 300);
        setLayout(new java.awt.FlowLayout());
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Pressed");
    }

    public static void main(String[] args) {
        new ListnerInterface();
    }
}
