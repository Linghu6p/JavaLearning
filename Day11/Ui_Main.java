package Day11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Ui_Main extends JFrame {
    public void CreateUiMain(String title) {
        JFrame jf = new JFrame(title);
        Container container = jf.getContentPane();//定义一个容器


        container.setBackground(Color.white);
        jf.setVisible(true);//使窗口可视
        jf.setBounds(600, 200, 700, 500);
        jf.setResizable(false);//设定不可缩放
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //container.add(get_Label("测试"));
        container.setLayout(null);//无这一条 按钮会占满屏幕

        container.add(get_Button_1("注册"));//添加注册按钮
        container.add(get_Button_2(jf, "登录"));


    }

    public JButton get_Button_2(JFrame jf, String S) {
        JButton bl = new JButton(S);
        bl.setBounds(500, 300, 100, 30);
        bl.setFont(new Font("包图小白体", Font.PLAIN, 24));
        bl.setBackground(Color.PINK);
        bl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Dialog2(Ui_Main.this).setVisible(true);
            }
        });
        return bl;
    }

    public JButton get_Button_1(String S) {
        JButton bl = new JButton(S);
        bl.setBounds(100, 300, 100, 30);//设置位置
        bl.setFont(new Font("包图小白体", Font.PLAIN, 24));
        bl.setBackground(Color.PINK);
        bl.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Dialog1(Ui_Main.this).setVisible(true);
            }
        });//添加鼠标单击事件


        return bl;
    }

    // 添加标签
    public JLabel get_Label(String S) {
        DrawIcon icon = new DrawIcon(15, 15);
        JLabel jl = new JLabel(S, icon, SwingConstants.CENTER);//创建一个标签 命名
        //jl.setHorizontalAlignment(SwingConstants.CENTER);//使文字居中
        return jl;
    }

    public static void main(String[] args) {
        new Ui_Main().CreateUiMain("图书馆管理系统");
    }
}
