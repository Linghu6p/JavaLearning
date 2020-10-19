package Day13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FocusEventTest extends JFrame {

    public FocusEventTest() {
        setBounds(600, 200, 700, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JTextField jt1 = new JTextField("aaa", 10);
        JTextField jt2 = new JTextField("www", 10);
        jt1.requestFocus();
        c.add(jt1);
        c.add(jt2);

        /*
        jt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(FocusEventTest.this, "qwe");//也可以设置为null 父窗体那里
            }
        });

         */

        jt1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                JOptionPane.showMessageDialog(FocusEventTest.this, "ewq");
            }

            @Override
            public void focusLost(FocusEvent e) {
                JOptionPane.showMessageDialog(FocusEventTest.this, "qwe");

            }
        });
        setVisible(true);
    }
    // 可以自己重写
    class MyFocusListener implements FocusListener{

        @Override
        public void focusGained(FocusEvent e) {

        }

        @Override
        public void focusLost(FocusEvent e) {

        }
    }

    public static void main(String[] args) {
        new FocusEventTest();
    }
}
