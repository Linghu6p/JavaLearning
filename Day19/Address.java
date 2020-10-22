package Day19;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Address {
    public static void main(String[] args){
        InetAddress ip;
        InetAddress IP;
        try {
            ip = InetAddress.getLocalHost();

            String localName = ip.getHostName();
            String localIp = ip.getHostAddress();

            System.out.println("本机名:"+localName);
            System.out.println("本机IP地址："+localIp);

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
