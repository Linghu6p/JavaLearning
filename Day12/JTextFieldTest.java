package Day12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldTest extends JFrame {
    public JTextFieldTest() {

        setBounds(600, 200, 700, 500);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        final JTextField jt = new JTextField("");
        //jt.setColumns(20);//可以显示20个字符
        jt.setBounds(200, 200, 100, 20);
        final JButton jb = new JButton("傻逼");
        jt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //jt.setText("qqqq");//摁下回车之后响应
                System.out.println(jt.getText());
            }
        });
        jb.setBounds(300, 300, 100, 20);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.setText("");//文本框制空
                jt.requestFocus();//焦点回到文本框
            }
        });
        c.add(jt);
        c.add(jb);


        setVisible(true);
    }

    public static void main(String[] args) {
        new JTextFieldTest();
    }
}
