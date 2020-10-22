package Day19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public class Receive extends JFrame implements Runnable, ActionListener {

    int port;
    InetAddress group = null;
    MulticastSocket socket = null;
    JButton ince = new JButton("开始接收");
    JButton stop = new JButton("停止播放");
    JTextArea inceAr = new JTextArea(10, 10);
    JTextArea inced = new JTextArea(10, 10);

    Thread thread;
    boolean b = false;

    public Receive() {
        super("广播数据报");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        thread = new Thread(this);
        ince.addActionListener(this);
        stop.addActionListener(this);
        inceAr.setForeground(Color.BLUE);//设置文字颜色
        JPanel north = new JPanel();
        north.add(ince);
        north.add(stop);
        add(north, BorderLayout.NORTH);
        JPanel center = new JPanel();
        center.add(inceAr);
        center.add(inced);
        add(center, BorderLayout.CENTER);
        validate();//刷新
        port = 9898;
        try {
            group = InetAddress.getByName("224.225.10.0");
            socket = new MulticastSocket(port);//绑定多点广播套接字
            socket.joinGroup(group);
        } catch (Exception e) {
            e.printStackTrace();
        }
        setBounds(600, 200, 360, 380);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ince)
        {
            ince.setBackground(Color.red);
            stop.setBackground(Color.yellow);
            if(!(thread.isAlive()))
            {
                thread = new Thread(this);
            }
            thread.start();
            b = false;
        }
        if (e.getSource() == stop) {
            ince.setBackground(Color.yellow);
            stop.setBackground(Color.red);
            b = true;
        }
    }

    @Override
    public void run() {
        while (true) {
            byte data[] = new byte[1024];
            DatagramPacket packet = null;
            packet = new DatagramPacket(data, data.length, group, port);
            try{
                socket.receive(packet);//接收数据包
                String message = new String(packet.getData(),0,packet.getLength());//获取内容
                inceAr.setText("正在接收的内容：\n"+message);
                inced.append(message+"\n");
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (b == true)
                break;
        }
    }
    public static void main(String[] args) {
        Receive rec = new Receive();
        rec.setSize(460,200);
    }
}
