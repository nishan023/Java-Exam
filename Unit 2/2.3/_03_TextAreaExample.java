/**
 * 3. Text Area
 * TextArea is used to accept multiple lines of text.
 */
import javax.swing.*;

public class _03_TextAreaExample {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        JTextArea ta = new JTextArea();

        ta.setBounds(50,50,200,100);

        f.add(ta);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}