/**
 * 7. Tables (JTable)
 * Used to display data in tabular form (rows and columns).
 */
import javax.swing.*;

public class _07_TableExample {
    public static void main(String[] args) {
        String[][] data = {
            {"1", "Ram"},
            {"2", "Shyam"}
        };

        String[] columns = {"ID", "Name"};

        JTable table = new JTable(data, columns);

        JFrame frame = new JFrame();
        frame.add(new JScrollPane(table));
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}