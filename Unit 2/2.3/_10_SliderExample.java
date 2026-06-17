/**
 * 10. Slider
 * Slider allows user to select numeric value by sliding knob.
 */
import javax.swing.*;

public class _10_SliderExample {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        JSlider s = new JSlider(0,100,50);

        s.setBounds(50,100,200,50);

        s.setMajorTickSpacing(20);

        s.setPaintTicks(true);

        s.setPaintLabels(true);

        f.add(s);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}