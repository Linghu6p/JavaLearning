package Day15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/* FileReader和FileWriter*/

public class FtextIncludeJFrame extends JFrame {
    JTextArea ja = new JTextArea(20,60);
    public FtextIncludeJFrame() {
        setBounds(600, 200, 700, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(put_JPanel());
        c.add(put_JButton("写入"));
        c.add(out_JButton("读取"));
        setVisible(true);
    }

    private JScrollPane put_JPanel() {

        JScrollPane jl = new JScrollPane(ja);
        //jl.setLocation(0,0);
        return jl;
    }
    private JButton put_JButton(String S) {
        JButton jb = new JButton(S);
        jb.setFocusPainted(false);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File file = new File("word.txt");
                try{
                    FileWriter put = new FileWriter(file);
                    String S = ja.getText();
                    put.write(S);
                    ja.setText("");
                    put.close();
                } catch (Exception ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        return  jb;
    }
    private  JButton out_JButton(String S) {
        JButton jb = new JButton(S);
        jb.setFocusPainted(false);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File file = new File("word.txt");
                try{

                    FileReader in = new FileReader(file);
                    char byt[] = new char[1024];
                    int len = in.read(byt);
                    ja.setText(new String(byt,0,len));
                    in.close();
                } catch (Exception fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
            }
        });
        return  jb;
    }

    public static void main(String[] args) {
        new FtextIncludeJFrame();
    }
}
