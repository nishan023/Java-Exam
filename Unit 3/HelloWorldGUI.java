import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloWorldGUI implements ActionListener {

    JTextField tf;
    JButton btn;

    public HelloWorldGUI() {

        JFrame frame = new JFrame("Hello World");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        tf = new JTextField(20);
        tf.setEditable(false);

        btn = new JButton("Click Me");
        btn.addActionListener(this);

        frame.add(tf);
        frame.add(btn);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        tf.setText("Hello World");
    }

    public static void main(String[] args) {
        new HelloWorldGUI();
    }
}