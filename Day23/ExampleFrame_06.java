package Day23;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExampleFrame_06 extends JFrame {
    public ExampleFrame_06() {
        super();
        setBounds(600,200,700,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        final JToolBar toolBar = new JToolBar("工具栏");// 创建工具栏对象
        toolBar.setFloatable(false);// 设置为不允许拖动
        getContentPane().add(toolBar, BorderLayout.NORTH);// 添加到网格布局的上方

        final JButton newButton = new JButton("新建");// 创建按钮对象
        newButton.addActionListener(new ButtonListener());// 添加动作事件监听器

        final JButton saveButton = new JButton("保存");// 创建按钮对象
        saveButton.addActionListener(new ButtonListener());// 添加动作事件监听器


        final JButton exitButton = new JButton("退出");// 创建按钮对象
        exitButton.addActionListener(new ButtonListener());// 添加动作事件监听器


        toolBar.add(newButton);// 添加到工具栏中
        toolBar.addSeparator();// 添加默认大小的分隔符
        toolBar.add(saveButton);// 添加到工具栏中
        toolBar.addSeparator(new Dimension(20, 0));// 添加指定大小的分隔符
        toolBar.add(exitButton);// 添加到工具栏中

        setVisible(true);
    }
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            System.out.println("您单击的是：" + button.getText());
        }
    }

    public static void main(String[] args) {
        new ExampleFrame_06();
    }
}
