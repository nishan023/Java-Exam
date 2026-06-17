/**
 * 8. Trees (JTree)
 * Used to show hierarchical data structure (like folder structure).
 */
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class _08_TreeExample {
    public static void main(String[] args) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child = new DefaultMutableTreeNode("Child");

        root.add(child);

        JTree tree = new JTree(root);

        JFrame frame = new JFrame();
        frame.add(tree);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}