import javax.swing.*;
import java.awt.*;

public class Calculator {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display screen
        JTextField display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 20));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);

        // Panel for buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        // Buttons (no functionality required)
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String text : buttons) {
            panel.add(new JButton(text));
        }

        // Adding components to frame
        frame.setLayout(new BorderLayout(5, 5));
        frame.add(display, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}



import javax.swing.*;
import java.awt.*;

public class CalculatorLayout {
    public static void main(String[] args) {

        JFrame f = new JFrame("Calculator");
        f.setSize(250, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField tf = new JTextField();
        tf.setHorizontalAlignment(JTextField.RIGHT);

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4, 4));

        String b[] = {
            "7","8","9","/",
            "4","5","6","*",
            "1","2","3","-",
            "0","C","=","+"
        };

        for(int i=0; i<b.length; i++){
            p.add(new JButton(b[i]));
        }

        f.add(tf, BorderLayout.NORTH);
        f.add(p, BorderLayout.CENTER);

        f.setVisible(true);
    }
}