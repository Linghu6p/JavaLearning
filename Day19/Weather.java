package Day19;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

/* UDP 向外发送*/
public class Weather extends Thread {
    String weather = "节目预报：八点有大型晚会，请收听！";
    int port = 9898;//定义端口
    InetAddress iaddress = null;
    MulticastSocket socket = null; //声明多点广播套接字

    Weather() {
        try {
            iaddress = InetAddress.getByName("224.225.10.0");
            socket = new MulticastSocket();
            socket.setTimeToLive(1);//指定发送范围是本地网络
            socket.joinGroup(iaddress);//加入广播组

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void run() {
        while (true) {
            DatagramPacket packet = null;
            byte data[] = weather.getBytes();//声明字节数组
            packet = new DatagramPacket(data, data.length, iaddress, port);//将数据打包
            System.out.println(new String(data));
            try {
                socket.send(packet);
                sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Weather w = new Weather();
        w.start();
    }
}
