package Day23;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExampleFrame_04 extends JFrame {

    public ExampleFrame_04() {
        super();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setBounds(600,200,700,500);

        Container c = getContentPane();
        c.setLayout(null);

        JMenuBar menuBar = new JMenuBar();//创建菜单栏
        setJMenuBar(menuBar);

        JMenu menu =new  JMenu("菜单名称");//创建菜单
        menuBar.add(menu);

        JMenuItem menuItem = new JMenuItem("菜单项名称");
        menuItem.addActionListener(new listenListener());
        menu.add(menuItem);

        JMenu sonMenu = new JMenu("子菜单名称");// 创建菜单的子菜单对象
        menu.add(sonMenu);// 将子菜单对象添加到上级菜单对象中

        JMenuItem sonMenuItem = new JMenuItem("子菜单项名称");// 创建子菜单的菜单项对象
        sonMenuItem.addActionListener(new listenListener());// 为菜单项添加事件监听器
        sonMenu.add(sonMenuItem);// 将子菜单的菜单项对象添加到子菜单对象中

        JButton jButton = new JButton("test");
        jButton.setBounds(0,0,100,50);
        jButton.setFocusPainted(false);
        c.add(jButton);


        setVisible(true);
    }
    private class listenListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JMenuItem menuItem = (JMenuItem) e.getSource(); //活得触发这次菜单的菜单项
            System.out.println("您单击的是菜单项：" + menuItem.getText());
        }
    }
    public static void main(String[] args) {
        new ExampleFrame_04();
    }
}
