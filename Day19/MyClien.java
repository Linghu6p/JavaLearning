package Day19;

/* p350*/
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClien extends JFrame {
    private PrintWriter printWriter;
    Socket socket;
    private JTextArea ta = new JTextArea();
    private JTextField tf = new JTextField();
    Container c;
    public MyClien(String title) {
        super(title);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        c = this.getContentPane();
        final JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBorder(new BevelBorder(BevelBorder.RAISED)); //表示凹凸
        getContentPane().add(scrollPane,BorderLayout.CENTER);
        scrollPane.setViewportView(ta);
        c.add(tf,"South");
        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printWriter.println(tf.getText());//把信息写入流
                ta.append(tf.getText()+'\n');//把信息显示在文本框中
                ta.setSelectionEnd(ta.getText().length());
                tf.setText("");
            }
        });
    }
    private void connect() {
        ta.append("尝试连接\n");
        try{
            socket = new Socket("127.0.0.1",8998);
            printWriter = new PrintWriter(socket.getOutputStream(),true);
            ta.append("完成连接\n");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        MyClien clien = new MyClien("aaa");
        clien.setBounds(600,200,200,200);
        clien.setVisible(true);
        clien.connect();
    }

}
