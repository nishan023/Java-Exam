import javax.swing.*;

/**
 * 5. Radio Button Menu Item
 * This file demonstrates the use of Radio Button Menu Items (JRadioButtonMenuItem).
 * Using a ButtonGroup ensures that only one option can be selected at a time.
 */
public class _05_RadioMenuExample {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        JMenuBar mb = new JMenuBar();

        JMenu theme = new JMenu("Theme");

        JRadioButtonMenuItem light =
                new JRadioButtonMenuItem("Light");

        JRadioButtonMenuItem dark =
                new JRadioButtonMenuItem("Dark");

        ButtonGroup bg = new ButtonGroup();

        bg.add(light);
        bg.add(dark);

        theme.add(light);
        theme.add(dark);

        mb.add(theme);

        f.setJMenuBar(mb);

        f.setSize(300,300);
        f.setVisible(true);
    }
}