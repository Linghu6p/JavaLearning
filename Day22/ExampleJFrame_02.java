package Day22;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;
import java.awt.*;

/* 处理选择节点事件*/

public class ExampleJFrame_02 extends JFrame {

    private JTree tree;

    public ExampleJFrame_02() {
        super();
        setTitle("处理选中节点事件");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setBounds(600, 200, 700, 500);

        Container c = getContentPane();
        c.setLayout(null);

        DefaultMutableTreeNode root;
        root = new DefaultMutableTreeNode();
        root.setUserObject("本地磁盘 (D:)");
        DefaultMutableTreeNode nodeA;
        nodeA = new DefaultMutableTreeNode("202成分");
        root.add(nodeA);
        nodeA.add(new DefaultMutableTreeNode("正常人"));
        DefaultMutableTreeNode nodeAB;// 创建树的二级子节点
        nodeAB = new DefaultMutableTreeNode("傻逼信息");
        nodeA.add(nodeAB);
        nodeAB.add(new DefaultMutableTreeNode("王文尧是傻逼.GIF", false));
        nodeAB.add(new DefaultMutableTreeNode("王文尧是超级无敌大傻逼.jpg", false));

        root.add(new DefaultMutableTreeNode("阿巴阿巴"));

        DefaultTreeModel treeModel;
        treeModel = new DefaultTreeModel(root, true);

        tree = new JTree(treeModel);
        tree.setBounds(210, 100, 400, 300);

        // 获取选择模型
        TreeSelectionModel treeSelectionModel;
        treeSelectionModel = tree.getSelectionModel();
        // 设置选择模型为连选
        // treeSelectionModel.setSelectionMode(TreeSelectionModel.CONTIGUOUS_TREE_SELECTION);
        // 设置为任意选
        treeSelectionModel.setSelectionMode(TreeSelectionModel.DISCONTIGUOUS_TREE_SELECTION);

        tree.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                if (!tree.isSelectionEmpty()) {
                    TreePath[] selectionPaths = tree.getSelectionPaths();//获取所有被选中的路径 且先选的先进
                    for (var i = 0; i < selectionPaths.length; ++i) {
                        TreePath treePath = selectionPaths[i];
                        Object[] path = treePath.getPath();
                        for (int j = 0; j < path.length; ++j) {
                            DefaultMutableTreeNode node;
                            node = (DefaultMutableTreeNode) path[j];
                            String S = node.getUserObject()
                                    + (j == (path.length - 1) ? "" : "-->");
                            //可以直接path来拼接，此处有一定多余了，但是可以加深印象，遍这么拼接S了
                            System.out.print(S);
                        }
                        System.out.println();
                    }
                    System.out.println();
                }

            }
        });

        c.add(tree);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ExampleJFrame_02();
    }
}
