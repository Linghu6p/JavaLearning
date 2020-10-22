package Day19;

/* 服务器端书写*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyTcp {
    private BufferedReader reader; //创建BufferReader 对象
    private ServerSocket server;//创建ServerSocket对象
    private Socket socket;
    void getServer() {
        try {
            server = new ServerSocket(8998);//创建绑定到特定端口的服务器套接字
            System.out.println("服务器套接字创建成功");
            while (true) {
                System.out.println("等待连接");
                socket = server.accept();//等待连接，如果连接，则创建一个套接字
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                getClintMessage();
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private void getClintMessage() {
        try {
            while (true)
            {
                System.out.println("客户机："+reader.readLine());//获取客户端信息
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if(reader!=null){
                reader.close();
            }
            if (socket!=null)
            {
                socket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        MyTcp tcp = new MyTcp();
        tcp.getServer();
    }
}
