package Day20;

import java.sql.*;

public class Conn {
    
    Connection con;

    public Connection getConnection() {
        // 仅在第一次连的时候用
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("数据库驱动加载成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            // url = jdbc:mysql//127.0.0.1:3306/name(数据库名)?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java_learning?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC", "root", "200525");
            System.out.println("数据库连接成功");

        } catch (SQLException throwables) {
            //System.out.println("kkk");
            throwables.printStackTrace();
        }
        return con;
    }

    public static void main(String[] args) {
        Conn c = new Conn();
        c.getConnection();
    }

}
