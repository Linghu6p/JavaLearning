package Day22;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;

public class ExampleFrame_01 extends JFrame {

    public ExampleFrame_01() {
        super();
        setTitle("简单的树");
        setBounds(600, 200, 700, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Container C = getContentPane();
        C.setLayout(null);

        //建立树的节点
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("根节点");
        DefaultMutableTreeNode nodeFirst = new DefaultMutableTreeNode("一级节点A");
        root.add(nodeFirst);
        //建立不能插入儿子节点的节点
        DefaultMutableTreeNode nodeSecond = new DefaultMutableTreeNode("二级节点B", false);
        nodeFirst.add(nodeSecond);
        root.add(new DefaultMutableTreeNode("一级子节点B"));

        //利用根节点直接建树
        JTree treeRoot = new JTree(root);
        treeRoot.setBounds(10, 200, 150, 100);

        DefaultTreeModel treeModelDefault = new DefaultTreeModel(root);
        JTree treeDefault = new JTree(treeModelDefault);
        treeDefault.setBounds(210, 200, 150, 100);

        DefaultTreeModel treeModelPointed = new DefaultTreeModel(root, true);
        JTree treePointed = new JTree(treeModelPointed);
        treePointed.setBounds(410, 200, 150, 100);

        C.add(treeRoot);
        C.add(treeDefault);
        C.add(treePointed);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ExampleFrame_01();
    }
}
