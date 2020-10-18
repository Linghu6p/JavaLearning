package Day12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxTest extends JFrame {
    public CheckBoxTest() {
        setBounds(600, 200, 700, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        JPanel P = new JPanel(new FlowLayout());
        JCheckBox jb1 = new JCheckBox("1");
        JCheckBox jb2 = new JCheckBox("2");
        JCheckBox jb3 = new JCheckBox("3");
        JTextArea jt = new JTextArea();
        JScrollPane js = new JScrollPane(jt);
        js.setBounds(10, 50, 120, 200);

        P.add(jb1);
        P.add(jb2);
        P.add(jb3);
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.append("1 被选中惹\n");
            }
        });
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.append("2 被选中惹\n");
            }
        });
        jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.append("3 被选中惹\n");
            }
        });
        P.setBounds(0, 0, 120, 25);
        c.add(P);
        c.add(js);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxTest();
    }
}
