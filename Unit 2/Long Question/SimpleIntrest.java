/* Write a Java program using Swing components to take Principal, Time, and Rate as input 
   using text fields, display proper labels using JLabel, and show the Simple Interest 
   when the button is clicked.
 */

import javax.swing.*;
import java.awt.event.*;

public class SimpleIntrest extends JFrame implements ActionListener {

    JTextField tPrincipal, tTime, tRate, result;
    JButton btn;

    public SimpleIntrest() {

        // Labels
        JLabel l1 = new JLabel("Enter Principal:");
        JLabel l2 = new JLabel("Enter Time (Years):");
        JLabel l3 = new JLabel("Enter Rate (%):");
        JLabel l4 = new JLabel("Simple Interest:");

        // Text Fields
        tPrincipal = new JTextField();
        tTime = new JTextField();
        tRate = new JTextField();
        result = new JTextField();
        result.setEditable(false); // result field should not be edited

        // Button
        btn = new JButton("Calculate SI");

        // Set bounds (x, y, width, height)
        l1.setBounds(30, 30, 150, 30);
        tPrincipal.setBounds(200, 30, 150, 30);

        l2.setBounds(30, 80, 150, 30);
        tTime.setBounds(200, 80, 150, 30);

        l3.setBounds(30, 130, 150, 30);
        tRate.setBounds(200, 130, 150, 30);

        btn.setBounds(200, 180, 150, 30);

        l4.setBounds(30, 230, 150, 30);
        result.setBounds(200, 230, 150, 30);

        // Add components to frame
        add(l1);
        add(tPrincipal);
        add(l2);
        add(tTime);
        add(l3);
        add(tRate);
        add(btn);
        add(l4);
        add(result);

        // Add action listener
        btn.addActionListener(this);

        // Frame settings
        setSize(400, 350);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Simple Interest Calculator");
    }

    // Event handling
    public void actionPerformed(ActionEvent e) {
        try {
            double p = Double.parseDouble(tPrincipal.getText());
            double t = Double.parseDouble(tTime.getText());
            double r = Double.parseDouble(tRate.getText());

            double si = (p * t * r) / 100;

            result.setText(String.format("%.2f", si));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new SimpleIntrest();
    }
}
