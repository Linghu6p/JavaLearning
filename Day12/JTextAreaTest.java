package Day12;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;

public class JTextAreaTest extends JFrame {
    public JTextAreaTest() {
        setBounds(600, 200, 700, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("王文尧傻逼");

        Container c = getContentPane();
        c.setLayout(null);
        JTextArea ja = new JTextArea();
        ja.setBounds(0,0,200,500);
        ja.setFont(new Font("楷体",Font.PLAIN,20));

        ja.setLineWrap(true);//自动换行

        c.add(ja);
        setVisible(true);
    }

    public static void main(String[] args){
        new JTextAreaTest();
    }
}
