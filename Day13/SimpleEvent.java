package Day13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SimpleEvent extends JFrame implements ActionListener {
    private JButton jb = new JButton("王文尧");
    private int k = 0;
    String[] S = new String[]{"大傻逼","烂jer","哈麻批"};
    public SimpleEvent() {
        setBounds(600, 200, 700, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("lalala");

        Container c = getContentPane();
        c.setLayout(null);
        jb.setBounds(200, 100, 150, 40);
        jb.setFont(new Font("包图小白体",Font.BOLD,25));
        jb.setFocusPainted(false);//去掉文字边框
        jb.setBackground(Color.PINK);
        jb.addActionListener(this);

        c.add(jb);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent arg0) {
        Random r = new Random();
        int x = r.nextInt(400)+050;
        int y = r.nextInt(300)+100;
        int NUM = r.nextInt(3);;
        if (k % 2 == 0)
            jb.setText(S[NUM]);

        else
            jb.setText("王文尧");
        k += 1;
        jb.setBounds(x,y,150,40);
        jb.setFont(new Font("包图小白体",Font.BOLD,25));
    }

    public static void main(String[] args) {
        new SimpleEvent();
    }
}








