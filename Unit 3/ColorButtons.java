import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorButtons implements ActionListener {

    JButton redBtn, blueBtn, greenBtn;

    public ColorButtons() {

        JFrame frame = new JFrame("Color Buttons");
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());

        redBtn = new JButton("RED");
        blueBtn = new JButton("BLUE");
        greenBtn = new JButton("GREEN");

        redBtn.addActionListener(this);
        blueBtn.addActionListener(this);
        greenBtn.addActionListener(this);

        frame.add(redBtn);
        frame.add(blueBtn);
        frame.add(greenBtn);

        frame.setVisible(true);
    }
        @Override   
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == redBtn) {
            redBtn.setBackground(Color.RED);
        }
        else if (e.getSource() == blueBtn) {
            blueBtn.setBackground(Color.BLUE);
        }
        else if (e.getSource() == greenBtn) {
            greenBtn.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new ColorButtons();
    }
}