/**
 * 4. Color Chooser (JColorChooser)
 * Used to select a color from a color palette.
 */
import javax.swing.*;
import java.awt.*;

public class _04_ColorChooserExample {
    public static void main(String[] args) {
        Color color = JColorChooser.showDialog(null, "Choose Color", Color.BLACK);
    }
}