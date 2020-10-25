package Day22;


import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

/* 树的遍历*/

public class ExampleJFrame_03 extends JFrame {

    private JTree jTree;
    private DefaultMutableTreeNode root;
    public ExampleJFrame_03() {
        super();
        setBounds(600,200,700,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("树的遍历");

        Container c = getContentPane();
        c.setLayout(null);

        root = new DefaultMutableTreeNode("ROOT");
        DefaultMutableTreeNode nodeA=new DefaultMutableTreeNode("FirstA");
        nodeA.add(new DefaultMutableTreeNode("SecondAA",false));
        nodeA.add(new DefaultMutableTreeNode("SecondAB",false));


        DefaultMutableTreeNode nodeFirstC = new DefaultMutableTreeNode(
                "FirstC");
        nodeFirstC.add(new DefaultMutableTreeNode("SecondCA"));
        DefaultMutableTreeNode nedeSecondCB = new DefaultMutableTreeNode(
                "SecondCB");
        nedeSecondCB.add(new DefaultMutableTreeNode("SecondCBA"));
        nedeSecondCB.add(new DefaultMutableTreeNode("SecondCBB"));
        nodeFirstC.add(nedeSecondCB);
        nodeFirstC.add(new DefaultMutableTreeNode("SecondCC"));


        root.add(nodeA);
        root.add(new DefaultMutableTreeNode("FirstB",false));
        root.add(nodeFirstC);

        DefaultTreeModel treeModel = new DefaultTreeModel(root);
        jTree = new JTree(treeModel);
        jTree.setBounds(10,100,200,300);

        c.add(jTree);
        c.add(put_JP());
        setVisible(true);
    }

    public JPanel put_JP(){
        JPanel jp = new JPanel();
        jp.setLayout(null);
        jp.setBounds(220,100,300,300);
        jp.setBorder(BorderFactory.createLineBorder(Color.PINK,2));
        JButton jButton_1 = new JButton("前序遍历");
        JButton jButton_2 = new JButton("后序遍历");
        JButton jButton_3 = new JButton("广度优先遍历");
        JButton jButton_4 = new JButton("深度优先遍历");
        JButton jButton_5 = new JButton("直属遍历");

        jButton_1.addActionListener(new ButtonActionListener("前序遍历"));
        jButton_2.addActionListener(new ButtonActionListener("后序遍历"));
        jButton_3.addActionListener(new ButtonActionListener("广度优先遍历"));
        jButton_4.addActionListener(new ButtonActionListener("深度优先遍历"));
        jButton_5.addActionListener(new ButtonActionListener("直属遍历"));


        jButton_1.setBounds(10,20,100,30);
        jButton_2.setBounds(10,80,100,30);
        jButton_3.setBounds(10,140,100,30);
        jButton_4.setBounds(10,200,100,30);
        jButton_5.setBounds(10,260,100,30);



        jp.add(jButton_1);
        jp.add(jButton_2);
        jp.add(jButton_3);
        jp.add(jButton_4);
        jp.add(jButton_5);


        return jp;
    }
    private class ButtonActionListener implements ActionListener{

        private String mode;

        public ButtonActionListener(String mode) {
            this.mode = mode;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Enumeration<?> enumeration;
            if(mode.equals("前序遍历"))
                enumeration = root.preorderEnumeration();
            else if (mode.equals("后序遍历"))
                // 按后序遍历所有树节点
                enumeration = root.postorderEnumeration();
            else if (mode.equals("广度优先遍历"))
                // 以广度优先遍历所有树节点
                enumeration = root.breadthFirstEnumeration();
            else if (mode.equals("深度优先遍历"))
                // 以深度优先遍历所有树节点
                enumeration = root.depthFirstEnumeration();
            else
                enumeration = root.children(); // 遍历该节点的子节点

            while (enumeration.hasMoreElements()) {// 遍历节点枚举对象
                DefaultMutableTreeNode node;// 获得节点
                node = (DefaultMutableTreeNode) enumeration.nextElement();
                // 根据节点级别输出占位符
                for (int l = 0; l < node.getLevel(); l++) {
                    System.out.print("----");
                }
                System.out.println(node.getUserObject());// 输出节点标签
            }
            System.out.println();
            System.out.println();
        }
    }
    public static void main(String[] args){
        new ExampleJFrame_03();
    }
}
