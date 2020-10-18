package Day12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonTest extends JFrame {
    public JButtonTest() {
        setBounds(600, 200, 700, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Container c = getContentPane();
        c.setLayout(new GridLayout(3,2,5,5));
        JButton[] jb = new JButton[6];
        for (int i = 0; i < jb.length; ++i) {
            jb[i] = new JButton();
            c.add(jb[i]);
        }
        jb[0].setText("aaa");
        jb[0].setEnabled(false);//设为不可用

        jb[1].setText("bbb");
        jb[1].setBackground(Color.YELLOW);//设颜色

        jb[2].setText("ccc");
        jb[2].setBorderPainted(false);//无边框

        jb[3].setText("ddd");
        jb[3].setBorder(BorderFactory.createLineBorder(Color.RED));//设置边框颜色

        jb[4].setText("eeee");
        jb[4].setToolTipText("王文尧傻逼");//悬停提示

        jb[5].setText("fff");
        jb[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(JButtonTest.this,"注册成功");//弹出对话框
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new JButtonTest();
    }
}
