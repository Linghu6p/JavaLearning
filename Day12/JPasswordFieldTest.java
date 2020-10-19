package Day12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPasswordFieldTest extends JFrame {
    public JPasswordFieldTest() {
        setBounds(600, 200, 700, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JPasswordField jp = new JPasswordField();
        jp.setEchoChar('*');
        jp.setFont(new Font("宋体",Font.BOLD,20));
        jp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(jp.getText());
            }
        });
        jp.setColumns(20);

        c.add(jp);



        setVisible(true);
    }

    public static void main(String[] args) {
        new JPasswordFieldTest();
    }
}
