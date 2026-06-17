/*Write a Java program using Swing components to take two numbers as input using text fields,
 display proper labels using JLabel, and show the sum when the button is clicked.
 */

import javax.swing.*;
import java.awt.event.*;

public class SumSwing extends JFrame implements ActionListener {

    JTextField t1, t2, result;
    JButton btn;

    public SumSwing() {

        // Labels
        JLabel l1 = new JLabel("Enter First Number:");
        JLabel l2 = new JLabel("Enter Second Number:");
        JLabel l3 = new JLabel("Result:");

        // Text Fields
        t1 = new JTextField();
        t2 = new JTextField();
        result = new JTextField();
        result.setEditable(false); // result field should not be edited

        // Button
        btn = new JButton("Calculate Sum");

        // Set bounds (x, y, width, height)
        l1.setBounds(30, 30, 150, 30);
        t1.setBounds(200, 30, 150, 30);

        l2.setBounds(30, 80, 150, 30);
        t2.setBounds(200, 80, 150, 30);

        btn.setBounds(200, 130, 150, 30);

        l3.setBounds(30, 180, 150, 30);
        result.setBounds(200, 180, 150, 30);

        // Add components to frame
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(btn);
        add(l3);
        add(result);

        // Add action listener
        btn.addActionListener(this);

        // Frame settings
        setSize(400, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Event handling
    public void actionPerformed(ActionEvent e) {

        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());

        int sum = num1 + num2;

        result.setText(String.valueOf(sum));
    }

    public static void main(String[] args) {
        new SumSwing();
    }
}
